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
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public class story_layout_immersive_top_area implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        Resources resources = context.getResources();
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -2, viewGroup);
        View frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.i93);
        C19ME c19me = new C19ME(-1, -2);
        if (C19ME.class.isInstance(c19me)) {
            c19me.topToTop = 0;
        }
        a.LIZ(frameLayout);
        if (frameLayout.getParent() == null) {
            constraintLayout.addView(frameLayout, c19me);
        }
        ConstraintLayout constraintLayout2 = new ConstraintLayout(context);
        constraintLayout2.setId(R.id.dvc);
        C19ME c19me2 = new C19ME(-1, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me2)) {
            ((ViewGroup.MarginLayoutParams) c19me2).topMargin = (int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics());
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.topToBottom = R.id.i93;
        }
        View frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.mjp);
        C19ME c19me3 = new C19ME((int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me3)) {
            c19me3.setMarginStart((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me3)) {
            ((ViewGroup.MarginLayoutParams) c19me3).topMargin = (int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me3)) {
            ((ViewGroup.MarginLayoutParams) c19me3).bottomMargin = (int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics());
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.topToTop = 0;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.startToStart = 0;
        }
        a.LIZ(frameLayout2);
        if (frameLayout2.getParent() == null) {
            constraintLayout2.addView(frameLayout2, c19me3);
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.dma);
        linearLayout.setOrientation(1);
        C19ME c19me4 = new C19ME((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.startToEnd = R.id.mjp;
        }
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.endToStart = R.id.tl4;
        }
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.topToTop = 0;
        }
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.bottomToBottom = 0;
        }
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setId(R.id.ib9);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            layoutParams.setMarginStart((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        a.LIZ(frameLayout3);
        if (frameLayout3.getParent() == null) {
            linearLayout.addView(frameLayout3, layoutParams);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setId(R.id.tt4);
        linearLayout2.setOrientation(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        a.LIZ(linearLayout2);
        if (linearLayout2.getParent() == null) {
            linearLayout.addView(linearLayout2, layoutParams2);
        }
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout4.setId(R.id.tt5);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.setMarginStart((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        a.LIZ(frameLayout4);
        if (frameLayout4.getParent() == null) {
            linearLayout.addView(frameLayout4, layoutParams3);
        }
        a.LIZ(linearLayout);
        if (linearLayout.getParent() == null) {
            constraintLayout2.addView(linearLayout, c19me4);
        }
        View frameLayout5 = new FrameLayout(context);
        frameLayout5.setId(R.id.tl4);
        C19ME c19me5 = new C19ME(-2, -2);
        if (C19ME.class.isInstance(c19me5)) {
            i = R.id.mjp;
            c19me5.topToTop = R.id.mjp;
        } else {
            i = R.id.mjp;
        }
        if (C19ME.class.isInstance(c19me5)) {
            c19me5.bottomToBottom = i;
        }
        if (C19ME.class.isInstance(c19me5)) {
            c19me5.endToStart = R.id.tl5;
        }
        a.LIZ(frameLayout5);
        if (frameLayout5.getParent() == null) {
            constraintLayout2.addView(frameLayout5, c19me5);
        }
        View frameLayout6 = new FrameLayout(context);
        frameLayout6.setId(R.id.tl5);
        C19ME c19me6 = new C19ME(-2, -2);
        if (C19ME.class.isInstance(c19me6)) {
            i2 = R.id.mjp;
            c19me6.topToTop = R.id.mjp;
        } else {
            i2 = R.id.mjp;
        }
        if (C19ME.class.isInstance(c19me6)) {
            c19me6.bottomToBottom = i2;
        }
        if (C19ME.class.isInstance(c19me6)) {
            c19me6.endToStart = R.id.tkq;
        }
        a.LIZ(frameLayout6);
        if (frameLayout6.getParent() == null) {
            constraintLayout2.addView(frameLayout6, c19me6);
        }
        View frameLayout7 = new FrameLayout(context);
        frameLayout7.setId(R.id.tkq);
        C19ME c19me7 = new C19ME(-2, -2);
        if (C19ME.class.isInstance(c19me7)) {
            i3 = R.id.mjp;
            c19me7.topToTop = R.id.mjp;
        } else {
            i3 = R.id.mjp;
        }
        if (C19ME.class.isInstance(c19me7)) {
            c19me7.bottomToBottom = i3;
        }
        if (C19ME.class.isInstance(c19me7)) {
            c19me7.endToStart = R.id.i98;
        }
        a.LIZ(frameLayout7);
        if (frameLayout7.getParent() == null) {
            constraintLayout2.addView(frameLayout7, c19me7);
        }
        View frameLayout8 = new FrameLayout(context);
        frameLayout8.setId(R.id.i98);
        C19ME c19me8 = new C19ME(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me8)) {
            c19me8.setMarginEnd((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        if (C19ME.class.isInstance(c19me8)) {
            i4 = R.id.mjp;
            c19me8.topToTop = R.id.mjp;
        } else {
            i4 = R.id.mjp;
        }
        if (C19ME.class.isInstance(c19me8)) {
            c19me8.bottomToBottom = i4;
        }
        if (C19ME.class.isInstance(c19me8)) {
            c19me8.endToEnd = 0;
        }
        a.LIZ(frameLayout8);
        if (frameLayout8.getParent() == null) {
            constraintLayout2.addView(frameLayout8, c19me8);
        }
        a.LIZ(constraintLayout2);
        if (constraintLayout2.getParent() == null) {
            constraintLayout.addView(constraintLayout2, c19me2);
        }
        a.LIZ(constraintLayout);
        C786410Ut5.W5(constraintLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(constraintLayout);
        }
        return constraintLayout;
    }
}
