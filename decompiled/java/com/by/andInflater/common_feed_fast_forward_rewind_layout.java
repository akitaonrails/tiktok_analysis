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
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public class common_feed_fast_forward_rewind_layout implements InterfaceC20742716Ev {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(R.id.hpa);
        C786410Ut5.LJLLLLLL(0, constraintLayout);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-2, -2, viewGroup);
        if (RelativeLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            ((RelativeLayout.LayoutParams) marginLayoutParamsLJ).addRule(13, -1);
        }
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ).gravity = 17;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ).gravity = 17;
        }
        View constraintLayout2 = new ConstraintLayout(context);
        constraintLayout2.setId(R.id.tji);
        C19ME c19me = new C19ME(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(c19me)) {
            ((LinearLayout.LayoutParams) c19me).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(c19me)) {
            ((FrameLayout.LayoutParams) c19me).gravity = 17;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(c19me)) {
            ((DrawerLayout$LayoutParams) c19me).gravity = 17;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me)) {
            c19me.setMarginEnd((int) TypedValue.applyDimension(1, 90.0f, resources.getDisplayMetrics()));
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.bottomToBottom = 0;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.endToStart = R.id.hp8;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.topToTop = 0;
        }
        a.LIZ(constraintLayout2);
        if (constraintLayout2.getParent() == null) {
            constraintLayout.addView(constraintLayout2, c19me);
        }
        View constraintLayout3 = new ConstraintLayout(context);
        constraintLayout3.setId(R.id.hp8);
        C19ME c19me2 = new C19ME(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(c19me2)) {
            ((LinearLayout.LayoutParams) c19me2).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(c19me2)) {
            ((FrameLayout.LayoutParams) c19me2).gravity = 17;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(c19me2)) {
            ((DrawerLayout$LayoutParams) c19me2).gravity = 17;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me2)) {
            c19me2.setMarginStart((int) TypedValue.applyDimension(1, 90.0f, resources.getDisplayMetrics()));
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.bottomToBottom = 0;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.startToEnd = R.id.tji;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.topToTop = 0;
        }
        a.LIZ(constraintLayout3);
        if (constraintLayout3.getParent() == null) {
            constraintLayout.addView(constraintLayout3, c19me2);
        }
        a.LIZ(constraintLayout);
        C786410Ut5.W5(constraintLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(constraintLayout);
        }
        return constraintLayout;
    }
}
