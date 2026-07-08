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
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public class inner_push_view implements InterfaceC20742716Ev {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        Resources resources = context.getResources();
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(R.id.koo);
        if (TextView.class.isInstance(constraintLayout)) {
            a.LJI((int) TypedValue.applyDimension(1, 56.0f, resources.getDisplayMetrics()), constraintLayout);
        } else {
            constraintLayout.setMinimumHeight((int) TypedValue.applyDimension(1, 56.0f, resources.getDisplayMetrics()));
        }
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -2, viewGroup);
        View frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.kp2);
        C786410Ut5.LJLLLLLL(8, frameLayout);
        C19ME c19me = new C19ME(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me)) {
            ((ViewGroup.MarginLayoutParams) c19me).topMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me)) {
            ((ViewGroup.MarginLayoutParams) c19me).bottomMargin = (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics());
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.bottomToTop = R.id.kot;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.endToEnd = 0;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.topToTop = 0;
        }
        a.LIZ(frameLayout);
        if (frameLayout.getParent() == null) {
            constraintLayout.addView(frameLayout, c19me);
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.kot);
        linearLayout.setOrientation(0);
        C19ME c19me2 = new C19ME(-1, -2);
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.bottomToTop = R.id.kok;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.endToEnd = 0;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.topToBottom = R.id.kp2;
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.kor);
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        frameLayout2.setPadding(frameLayout2.getPaddingLeft(), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), frameLayout2.getPaddingRight(), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        frameLayout2.setPadding((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), frameLayout2.getPaddingTop(), frameLayout2.getPaddingRight(), frameLayout2.getPaddingBottom());
        frameLayout2.setPadding(frameLayout2.getPaddingLeft(), frameLayout2.getPaddingTop(), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), frameLayout2.getPaddingBottom());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.gravity = 8388627;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 8388627;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams)) {
            ((DrawerLayout$LayoutParams) layoutParams).gravity = 8388627;
        }
        a.LIZ(frameLayout2);
        if (frameLayout2.getParent() == null) {
            linearLayout.addView(frameLayout2, layoutParams);
        }
        View frameLayout3 = new FrameLayout(context);
        frameLayout3.setId(R.id.kos);
        frameLayout3.setPadding(frameLayout3.getPaddingLeft(), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), frameLayout3.getPaddingRight(), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -1);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams2)) {
            ((FrameLayout.LayoutParams) layoutParams2).gravity = 16;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams2)) {
            ((DrawerLayout$LayoutParams) layoutParams2).gravity = 16;
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.weight = 1;
        }
        a.LIZ(frameLayout3);
        if (frameLayout3.getParent() == null) {
            linearLayout.addView(frameLayout3, layoutParams2);
        }
        View frameLayout4 = new FrameLayout(context);
        frameLayout4.setId(R.id.kox);
        frameLayout4.setPadding((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -1);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.gravity = 8388629;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams3)) {
            ((FrameLayout.LayoutParams) layoutParams3).gravity = 8388629;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams3)) {
            ((DrawerLayout$LayoutParams) layoutParams3).gravity = 8388629;
        }
        a.LIZ(frameLayout4);
        if (frameLayout4.getParent() == null) {
            linearLayout.addView(frameLayout4, layoutParams3);
        }
        a.LIZ(linearLayout);
        if (linearLayout.getParent() == null) {
            constraintLayout.addView(linearLayout, c19me2);
        }
        View frameLayout5 = new FrameLayout(context);
        frameLayout5.setId(R.id.kok);
        C786410Ut5.LJLLLLLL(8, frameLayout5);
        C19ME c19me3 = new C19ME(-1, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me3)) {
            ((ViewGroup.MarginLayoutParams) c19me3).topMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
        }
        if (C19ME.class.isInstance(c19me3)) {
            i = 0;
            c19me3.bottomToBottom = 0;
        } else {
            i = 0;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.endToEnd = i;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.startToStart = i;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.topToBottom = R.id.kot;
        }
        a.LIZ(frameLayout5);
        if (frameLayout5.getParent() == null) {
            constraintLayout.addView(frameLayout5, c19me3);
        }
        a.LIZ(constraintLayout);
        C786410Ut5.W5(constraintLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(constraintLayout);
        }
        return constraintLayout;
    }
}
