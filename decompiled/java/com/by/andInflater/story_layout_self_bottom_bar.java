package com.by.andInflater;

import X.C19ME;
import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public class story_layout_self_bottom_bar implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -1, viewGroup);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.ibh);
        C19ME c19me = new C19ME((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me)) {
            c19me.setMarginStart((int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me)) {
            c19me.setMarginEnd((int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()));
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.constrainedWidth = true;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.horizontalBias = 0.0f;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.topToTop = 0;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.bottomToBottom = 0;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.endToStart = R.id.ia6;
        }
        a.LIZ(frameLayout);
        if (frameLayout.getParent() == null) {
            constraintLayout.addView(frameLayout, c19me);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.ia6);
        C19ME c19me2 = new C19ME(-2, -2);
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.bottomToBottom = 0;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.endToStart = R.id.ia7;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.startToEnd = R.id.ibh;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.topToTop = 0;
        }
        a.LIZ(frameLayout2);
        if (frameLayout2.getParent() == null) {
            constraintLayout.addView(frameLayout2, c19me2);
        }
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setId(R.id.ia7);
        C19ME c19me3 = new C19ME(-2, -2);
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.bottomToBottom = 0;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.endToStart = R.id.i7z;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.startToEnd = R.id.ia6;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.topToTop = 0;
        }
        a.LIZ(frameLayout3);
        if (frameLayout3.getParent() == null) {
            constraintLayout.addView(frameLayout3, c19me3);
        }
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout4.setId(R.id.i7z);
        C19ME c19me4 = new C19ME(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me4)) {
            c19me4.setMarginEnd((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.topToTop = 0;
        }
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.bottomToBottom = 0;
        }
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.startToEnd = R.id.ia7;
        }
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.endToEnd = 0;
        }
        a.LIZ(frameLayout4);
        if (frameLayout4.getParent() == null) {
            constraintLayout.addView(frameLayout4, c19me4);
        }
        a.LIZ(constraintLayout);
        C786410Ut5.W5(constraintLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(constraintLayout);
        }
        return constraintLayout;
    }
}
