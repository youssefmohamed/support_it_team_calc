package com.example.supportcalc;

import android.content.Context;

/**
 * 
 * Name : Youssef Mohamed Elkholy
 * Task : add and subtraction operations
 *
 */
public class AddSubOperations {
	
	// app context
	private Context context;
	
	// constructor
	public AddSubOperations(Context context){
		this.context = context;
	}
	
	// add method
	public int add(int x, int y) {
		return x+y;
	}
	
	// subtract method
	public int sub(int x, int y){
		return x-y;
	}
	
	
}
