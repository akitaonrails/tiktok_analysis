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
public class im_layout_title_bar_skeleton implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -2, viewGroup);
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ).gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ).gravity = 16;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ).gravity = 16;
        }
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setClipChildren(false);
        constraintLayout.setClipToPadding(false);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 56.0f, resources.getDisplayMetrics()));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.mjp);
        C19ME c19me = new C19ME(-2, -1);
        if (C19ME.class.isInstance(c19me)) {
            c19me.startToStart = 0;
        }
        a.LIZ(frameLayout);
        if (frameLayout.getParent() == null) {
            constraintLayout.addView(frameLayout, c19me);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.tks);
        if (TextView.class.isInstance(frameLayout2)) {
            a.LJII((int) TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()), frameLayout2);
        } else {
            frameLayout2.setMinimumWidth((int) TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()));
        }
        C19ME c19me2 = new C19ME(-2, -1);
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.endToEnd = 0;
        }
        a.LIZ(frameLayout2);
        if (frameLayout2.getParent() == null) {
            constraintLayout.addView(frameLayout2, c19me2);
        }
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setId(R.id.dma);
        frameLayout3.setClipToPadding(false);
        frameLayout3.setClipChildren(false);
        C19ME c19me3 = new C19ME((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.bottomToBottom = 0;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.endToStart = R.id.tks;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.startToEnd = R.id.mjp;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.topToTop = 0;
        }
        a.LIZ(frameLayout3);
        if (frameLayout3.getParent() == null) {
            constraintLayout.addView(frameLayout3, c19me3);
        }
        a.LIZ(constraintLayout);
        if (constraintLayout.getParent() == null) {
            linearLayout.addView(constraintLayout, layoutParams);
        }
        a.LIZ(linearLayout);
        C786410Ut5.W5(linearLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(linearLayout);
        }
        return linearLayout;
    }
}
