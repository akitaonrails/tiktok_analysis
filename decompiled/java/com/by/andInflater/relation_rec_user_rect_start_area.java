package com.by.andInflater;

import X.C1609500rzA;
import X.C427590Gph;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.zhiliaoapp.musically.R;
import dc.a;
import jf8.c;

/* JADX INFO: loaded from: classes32.dex */
public class relation_rec_user_rect_start_area implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        if (viewGroup == null || !z) {
            throw new IllegalStateException("merge tag container should not be null attach should not be false");
        }
        C1609500rzA c1609500rzA = new C1609500rzA(context);
        c1609500rzA.setId(R.id.i8g);
        ViewGroup.LayoutParams layoutParamsLJ = a.LJ((int) TypedValue.applyDimension(1, 58.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 58.0f, resources.getDisplayMetrics()), viewGroup);
        C427590Gph c427590Gph = new C427590Gph(context);
        c427590Gph.setId(R.id.bkz);
        c427590Gph.setContentDescription(context.getResources().getString(2131823242));
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ((int) TypedValue.applyDimension(1, 56.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 56.0f, resources.getDisplayMetrics()), c1609500rzA);
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ).gravity = 17;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ).gravity = 17;
        }
        c cVar = new c();
        cVar.LIZIZ("app:roundingBorderColor", new a.b("2131099670", "attr"), c427590Gph);
        cVar.LIZIZ("app:roundingBorderWidth", new a.d("1", "dp"), c427590Gph);
        cVar.LIZ(c427590Gph);
        android.view.a.LIZ(c427590Gph);
        if (c427590Gph.getParent() == null) {
            c1609500rzA.addView(c427590Gph, marginLayoutParamsLJ);
        }
        android.view.a.LIZ(c1609500rzA);
        if (c1609500rzA.getParent() == null) {
            viewGroup.addView(c1609500rzA, layoutParamsLJ);
        }
        return viewGroup;
    }
}
