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
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.zhiliaoapp.musically.R;
import dc.a;
import mcf.d0;
import xem.k;

/* JADX INFO: loaded from: classes32.dex */
public class ai_theater_social_generating_card_container implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        int i2;
        Resources resources = context.getResources();
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -1, viewGroup);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            marginLayoutParamsLJ.setMarginEnd((int) resources.getDimension(R.dimen.sb));
        }
        new psf.a();
        psf.a.LIZ("android:layout_marginVertical", new a.b("2131296934", "dimen"), constraintLayout);
        TuxSpinner tuxSpinner = new TuxSpinner(context);
        tuxSpinner.setId(R.id.uq8);
        tuxSpinner.setImportantForAccessibility(2);
        C19ME c19me = new C19ME((int) resources.getDimension(R.dimen.sl), (int) resources.getDimension(R.dimen.sl));
        if (C19ME.class.isInstance(c19me)) {
            c19me.endToStart = R.id.itu;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.topToTop = 0;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.bottomToBottom = 0;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me)) {
            c19me.setMarginEnd((int) resources.getDimension(R.dimen.t8));
        }
        d0 d0Var = new d0();
        d0Var.LIZ("app:tux_icon", new a.b("2130774721", "raw"), tuxSpinner);
        d0Var.LIZ("app:tux_tintColor", new a.b("2131100630", "attr"), tuxSpinner);
        android.view.a.LIZ(tuxSpinner);
        if (tuxSpinner.getParent() == null) {
            constraintLayout.addView(tuxSpinner, c19me);
        }
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setId(R.id.upd);
        tuxIconView.setImportantForAccessibility(2);
        C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        C19ME c19me2 = new C19ME((int) resources.getDimension(R.dimen.sl), (int) resources.getDimension(R.dimen.sl));
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.endToStart = R.id.itu;
        }
        if (C19ME.class.isInstance(c19me2)) {
            i = 0;
            c19me2.topToTop = 0;
        } else {
            i = 0;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.bottomToBottom = i;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me2)) {
            c19me2.setMarginEnd((int) resources.getDimension(R.dimen.t8));
        }
        new k();
        k.LIZ("app:tux_icon", new a.b("2130774010", "raw"), tuxIconView);
        k.LIZ("app:tux_tintColor", new a.b("2131100627", "attr"), tuxIconView);
        android.view.a.LIZ(tuxIconView);
        if (tuxIconView.getParent() == null) {
            constraintLayout.addView(tuxIconView, c19me2);
        }
        ConstraintLayout constraintLayout2 = new ConstraintLayout(context);
        constraintLayout2.setId(R.id.itu);
        C19ME c19me3 = new C19ME((int) TypedValue.applyDimension(1, 180.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 242.0f, resources.getDisplayMetrics()));
        if (C19ME.class.isInstance(c19me3)) {
            i2 = 0;
            c19me3.topToTop = 0;
        } else {
            i2 = 0;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.bottomToBottom = i2;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.endToEnd = i2;
        }
        android.view.a.LIZ(constraintLayout2);
        if (constraintLayout2.getParent() == null) {
            constraintLayout.addView(constraintLayout2, c19me3);
        }
        android.view.a.LIZ(constraintLayout);
        C786410Ut5.W5(constraintLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(constraintLayout);
        }
        return constraintLayout;
    }
}
