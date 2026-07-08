package com.by.andInflater;

import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import com.ss.android.ugc.aweme.inbox.widget.FitsSystemWindowsLinearLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public class awemenotice_fragment_navigation_container implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        context.getResources();
        FitsSystemWindowsLinearLayout fitsSystemWindowsLinearLayout = new FitsSystemWindowsLinearLayout(context, null);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.bx});
        fitsSystemWindowsLinearLayout.setBackgroundColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        fitsSystemWindowsLinearLayout.setOrientation(1);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -1, viewGroup);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.kj1);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ2 = a.LJ(-1, -1, fitsSystemWindowsLinearLayout);
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ2).weight = 1;
        }
        a.LIZ(frameLayout);
        if (frameLayout.getParent() == null) {
            fitsSystemWindowsLinearLayout.addView(frameLayout, marginLayoutParamsLJ2);
        }
        Space space = new Space(context);
        space.setId(R.id.ch3);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ3 = a.LJ(-1, -2, fitsSystemWindowsLinearLayout);
        a.LIZ(space);
        if (space.getParent() == null) {
            fitsSystemWindowsLinearLayout.addView(space, marginLayoutParamsLJ3);
        }
        a.LIZ(fitsSystemWindowsLinearLayout);
        C786410Ut5.W5(fitsSystemWindowsLinearLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(fitsSystemWindowsLinearLayout);
        }
        return fitsSystemWindowsLinearLayout;
    }
}
