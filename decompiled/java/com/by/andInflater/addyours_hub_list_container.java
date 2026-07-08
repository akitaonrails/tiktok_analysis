package com.by.andInflater;

import X.C1749280vcc;
import X.C19ME;
import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.n;

/* JADX INFO: loaded from: classes32.dex */
public class addyours_hub_list_container implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -1, viewGroup);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = new ViewOnAttachStateChangeListenerC20604515jv(context, null);
        viewOnAttachStateChangeListenerC20604515jv.setId(R.id.rn0);
        C19ME c19me = new C19ME(-1, -1);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me)) {
            ((ViewGroup.MarginLayoutParams) c19me).topMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        a.LIZ(viewOnAttachStateChangeListenerC20604515jv);
        if (viewOnAttachStateChangeListenerC20604515jv.getParent() == null) {
            constraintLayout.addView(viewOnAttachStateChangeListenerC20604515jv, c19me);
        }
        C1749280vcc c1749280vcc = new C1749280vcc(context);
        c1749280vcc.setId(R.id.w28);
        C786410Ut5.LLLZLZ(c1749280vcc, 8);
        C19ME c19me2 = new C19ME((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -1);
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.bottomToBottom = 0;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.endToEnd = 0;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.topToTop = 0;
        }
        new n();
        n.LIZ(new a.c("fixed_height"), c1749280vcc);
        android.view.a.LIZ(c1749280vcc);
        if (c1749280vcc.getParent() == null) {
            constraintLayout.addView(c1749280vcc, c19me2);
        }
        android.view.a.LIZ(constraintLayout);
        C786410Ut5.W5(constraintLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(constraintLayout);
        }
        return constraintLayout;
    }
}
