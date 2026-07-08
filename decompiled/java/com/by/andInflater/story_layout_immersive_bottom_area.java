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
public class story_layout_immersive_bottom_area implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -2, viewGroup);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.kv_);
        linearLayout.setOrientation(1);
        C19ME c19me = new C19ME(-1, -2);
        if (C19ME.class.isInstance(c19me)) {
            c19me.bottomToTop = R.id.cfk;
        }
        a.LIZ(linearLayout);
        if (linearLayout.getParent() == null) {
            constraintLayout.addView(linearLayout, c19me);
        }
        View view = new View(context);
        view.setId(R.id.cfk);
        C19ME c19me2 = new C19ME(-1, (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.bottomToTop = R.id.ib8;
        }
        a.LIZ(view);
        if (view.getParent() == null) {
            constraintLayout.addView(view, c19me2);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.ib8);
        C19ME c19me3 = new C19ME(-1, -2);
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.bottomToTop = R.id.i39;
        }
        a.LIZ(frameLayout);
        if (frameLayout.getParent() == null) {
            constraintLayout.addView(frameLayout, c19me3);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.i39);
        C19ME c19me4 = new C19ME(-1, -2);
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.bottomToTop = R.id.i5a;
        }
        a.LIZ(frameLayout2);
        if (frameLayout2.getParent() == null) {
            constraintLayout.addView(frameLayout2, c19me4);
        }
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setId(R.id.i5a);
        C19ME c19me5 = new C19ME(-1, -2);
        if (C19ME.class.isInstance(c19me5)) {
            c19me5.bottomToBottom = 0;
        }
        a.LIZ(frameLayout3);
        if (frameLayout3.getParent() == null) {
            constraintLayout.addView(frameLayout3, c19me5);
        }
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout4.setId(R.id.i79);
        C19ME c19me6 = new C19ME(-1, -2);
        if (C19ME.class.isInstance(c19me6)) {
            c19me6.bottomToBottom = 0;
        }
        a.LIZ(frameLayout4);
        if (frameLayout4.getParent() == null) {
            constraintLayout.addView(frameLayout4, c19me6);
        }
        a.LIZ(constraintLayout);
        C786410Ut5.W5(constraintLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(constraintLayout);
        }
        return constraintLayout;
    }
}
