package linkedlist;
//here we cretaed pacakage as linked list which that organizes a set of related classes and interfaces
public class Linking {
	//public : members which can access as public
	//class : is a context of java that are used to create objects and to define object data types and methods.
	//declares a class called Linking.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//public : it can be called from anywhere.
		//static : doesn't belong to a specific object.
		//void : returns to no value.
		//main : is special because it will start the program.
		int[] data = {220,340,120,90,470,510};//creating an array of size and we are initializing them

		Object[][] linkedList = new Object[1][2];//we created an object for class 

		createLinkedList(data,linkedList);//creating a linked list and printing the linked list
	printLinkedList(linkedList);
	 
	}
	 
	public static void createLinkedList(int []data,Object[][] linkedList)//creating linkedlist
	{

		Object node[][] = null;//taking the object node has null
	
		Object newnode[][] = null;//here taking new node also has null
	node=new Object[1][2];//creating a node with new object and initializing an array
	linkedList[0][1]=node;//now we are assigning the nodes in linked list with size of an array
	
	for(int i=0;i<data.length;i++)//by using for loop we are implementing linked list
	{
	node[0][0]=new Integer(data[i]);//creating an object by this if the one head which points to the 
	newnode=new Object[1][2];//first node of the list
	node[0][1]=newnode;
	node=newnode;//node equal to newnode
	 
	}
	node =null;//node equals to null
	newnode = null;//newnode equals to null
	    }
	 
	 
	public static void printLinkedList(Object[][] linkedList)
	{
	 
	Object node[][] = null;
	node=linkedList;//we first insert the node  then insert the last node in linked list
	node =(Object [][]) node[0][1];
	
	while(node[0][1]!= null)//we are using while loop that is node not equal to the null
	{
	System.out.print("  "+node[0][0]+" --->" );
	//system : is a class in java language pacakge.
	//out : static member of the system class.
	//then it prints this
	node=(Object [][]) node[0][1];//same here it is as well by placing a new node
	 
	}
	System.out.print("null" );
	//system : is a class in java language pacakge.
	//out : static member of the system class.
	//println : to print what is output.
	//in last it prints null that the node is empty or null
	 
	}


	}


