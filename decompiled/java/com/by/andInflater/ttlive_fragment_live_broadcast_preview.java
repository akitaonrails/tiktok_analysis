package com.by.andInflater;

import X.C19ME;
import X.C20516015Pq;
import X.C21339718fD;
import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public class ttlive_fragment_live_broadcast_preview implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setFocusable(true);
        constraintLayout.setFocusableInTouchMode(true);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -1, viewGroup);
        View view = new View(context);
        view.setId(R.id.y9g);
        view.setBackgroundResource(R.drawable.ebo);
        C19ME c19me = new C19ME(-1, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        if (C19ME.class.isInstance(c19me)) {
            c19me.matchConstraintPercentHeight = 0.25f;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.topToTop = 0;
        }
        a.LIZ(view);
        if (view.getParent() == null) {
            constraintLayout.addView(view, c19me);
        }
        View view2 = new View(context);
        view2.setId(R.id.cbd);
        view2.setBackgroundResource(R.drawable.ebl);
        C19ME c19me2 = new C19ME(-1, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.bottomToBottom = 0;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.matchConstraintPercentHeight = 0.25f;
        }
        a.LIZ(view2);
        if (view2.getParent() == null) {
            constraintLayout.addView(view2, c19me2);
        }
        View view3 = new View(context);
        view3.setId(R.id.j2_);
        C19ME c19me3 = new C19ME(-2, (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me3)) {
            ((ViewGroup.MarginLayoutParams) c19me3).bottomMargin = (int) TypedValue.applyDimension(1, 112.0f, resources.getDisplayMetrics());
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.bottomToBottom = 0;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.endToEnd = 0;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.startToStart = 0;
        }
        a.LIZ(view3);
        if (view3.getParent() == null) {
            constraintLayout.addView(view3, c19me3);
        }
        C21339718fD c21339718fD = new C21339718fD(context);
        c21339718fD.setId(R.id.n4_);
        C19ME c19me4 = new C19ME(-1, -1);
        a.LIZ(c21339718fD);
        if (c21339718fD.getParent() == null) {
            constraintLayout.addView(c21339718fD, c19me4);
        }
        C20516015Pq c20516015Pq = new C20516015Pq(context);
        c20516015Pq.setId(R.id.n24);
        C19ME c19me5 = new C19ME(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me5)) {
            ((ViewGroup.MarginLayoutParams) c19me5).topMargin = (int) TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics());
        }
        if (C19ME.class.isInstance(c19me5)) {
            c19me5.endToEnd = 0;
        }
        if (C19ME.class.isInstance(c19me5)) {
            c19me5.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me5)) {
            c19me5.topToBottom = R.id.j2_;
        }
        a.LIZ(c20516015Pq);
        if (c20516015Pq.getParent() == null) {
            constraintLayout.addView(c20516015Pq, c19me5);
        }
        a.LIZ(constraintLayout);
        C786410Ut5.W5(constraintLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(constraintLayout);
        }
        return constraintLayout;
    }
}
