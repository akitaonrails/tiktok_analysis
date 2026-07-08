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
public class im_layout_inputview_skeleton implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        int i2;
        int i3;
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.gq1);
        linearLayout.setOrientation(1);
        linearLayout.setClipToPadding(false);
        linearLayout.setClipChildren(false);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -2, viewGroup);
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(R.id.xs_res_0x7f0a0051);
        constraintLayout.setClipToPadding(false);
        constraintLayout.setClipChildren(false);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setId(R.id.mjp);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(17);
        linearLayout2.setClipToPadding(false);
        linearLayout2.setClipChildren(false);
        C19ME c19me = new C19ME(-2, -2);
        if (C19ME.class.isInstance(c19me)) {
            c19me.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.bottomToBottom = 0;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.endToStart = R.id.kqv;
        }
        a.LIZ(linearLayout2);
        if (linearLayout2.getParent() == null) {
            constraintLayout.addView(linearLayout2, c19me);
        }
        ConstraintLayout constraintLayout2 = new ConstraintLayout(context);
        constraintLayout2.setId(R.id.kqv);
        constraintLayout2.setClipToPadding(false);
        constraintLayout2.setClipChildren(false);
        C19ME c19me2 = new C19ME((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.startToEnd = R.id.mjp;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.endToStart = R.id.tks;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.topToBottom = R.id.y_b;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.bottomToBottom = 0;
        }
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setId(R.id.kqy);
        linearLayout3.setGravity(17);
        linearLayout3.setOrientation(0);
        linearLayout3.setClipToPadding(false);
        linearLayout3.setClipChildren(false);
        C19ME c19me3 = new C19ME(-2, -2);
        if (C19ME.class.isInstance(c19me3)) {
            i = R.id.kqv;
            c19me3.startToStart = R.id.kqv;
        } else {
            i = R.id.kqv;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.bottomToBottom = i;
        }
        a.LIZ(linearLayout3);
        if (linearLayout3.getParent() == null) {
            constraintLayout2.addView(linearLayout3, c19me3);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.t7h);
        C786410Ut5.LJLLLLLL(0, frameLayout);
        C19ME c19me4 = new C19ME(-1, -2);
        if (C19ME.class.isInstance(c19me4)) {
            i2 = R.id.kqv;
            c19me4.endToEnd = R.id.kqv;
        } else {
            i2 = R.id.kqv;
        }
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.startToStart = i2;
        }
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.topToTop = i2;
        }
        a.LIZ(frameLayout);
        if (frameLayout.getParent() == null) {
            constraintLayout2.addView(frameLayout, c19me4);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.kqw);
        C19ME c19me5 = new C19ME((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (C19ME.class.isInstance(c19me5)) {
            c19me5.bottomToBottom = 0;
        }
        if (C19ME.class.isInstance(c19me5)) {
            c19me5.endToStart = R.id.kqz;
        }
        if (C19ME.class.isInstance(c19me5)) {
            c19me5.startToEnd = R.id.kqy;
        }
        if (C19ME.class.isInstance(c19me5)) {
            c19me5.topToBottom = R.id.t7h;
        }
        a.LIZ(frameLayout2);
        if (frameLayout2.getParent() == null) {
            constraintLayout2.addView(frameLayout2, c19me5);
        }
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setId(R.id.kqz);
        linearLayout4.setGravity(17);
        linearLayout4.setOrientation(0);
        linearLayout4.setClipToPadding(false);
        linearLayout4.setClipChildren(false);
        C19ME c19me6 = new C19ME(-2, -2);
        if (C19ME.class.isInstance(c19me6)) {
            i3 = R.id.kqv;
            c19me6.endToEnd = R.id.kqv;
        } else {
            i3 = R.id.kqv;
        }
        if (C19ME.class.isInstance(c19me6)) {
            c19me6.bottomToBottom = i3;
        }
        a.LIZ(linearLayout4);
        if (linearLayout4.getParent() == null) {
            constraintLayout2.addView(linearLayout4, c19me6);
        }
        a.LIZ(constraintLayout2);
        if (constraintLayout2.getParent() == null) {
            constraintLayout.addView(constraintLayout2, c19me2);
        }
        LinearLayout linearLayout5 = new LinearLayout(context);
        linearLayout5.setId(R.id.tks);
        linearLayout5.setOrientation(0);
        linearLayout5.setGravity(17);
        linearLayout5.setClipChildren(false);
        C19ME c19me7 = new C19ME(-2, -2);
        if (C19ME.class.isInstance(c19me7)) {
            c19me7.endToEnd = 0;
        }
        if (C19ME.class.isInstance(c19me7)) {
            c19me7.bottomToBottom = 0;
        }
        if (C19ME.class.isInstance(c19me7)) {
            c19me7.startToEnd = R.id.kqv;
        }
        a.LIZ(linearLayout5);
        if (linearLayout5.getParent() == null) {
            constraintLayout.addView(linearLayout5, c19me7);
        }
        LinearLayout linearLayout6 = new LinearLayout(context);
        linearLayout6.setId(R.id.y_b);
        linearLayout6.setOrientation(1);
        linearLayout6.setClipChildren(false);
        C19ME c19me8 = new C19ME((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (C19ME.class.isInstance(c19me8)) {
            c19me8.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me8)) {
            c19me8.endToEnd = 0;
        }
        if (C19ME.class.isInstance(c19me8)) {
            c19me8.topToTop = 0;
        }
        a.LIZ(linearLayout6);
        if (linearLayout6.getParent() == null) {
            constraintLayout.addView(linearLayout6, c19me8);
        }
        a.LIZ(constraintLayout);
        if (constraintLayout.getParent() == null) {
            linearLayout.addView(constraintLayout, layoutParams);
        }
        View frameLayout3 = new FrameLayout(context);
        frameLayout3.setId(R.id.q1i);
        C786410Ut5.LJLLLLLL(0, frameLayout3);
        ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        a.LIZ(frameLayout3);
        if (frameLayout3.getParent() == null) {
            linearLayout.addView(frameLayout3, layoutParams2);
        }
        a.LIZ(linearLayout);
        C786410Ut5.W5(linearLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(linearLayout);
        }
        return linearLayout;
    }
}
