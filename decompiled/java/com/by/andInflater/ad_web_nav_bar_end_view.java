package com.by.andInflater;

import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.RelativeLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.k;

/* JADX INFO: loaded from: classes32.dex */
public class ad_web_nav_bar_end_view implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        RelativeLayout relativeLayout = new RelativeLayout(context);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, (int) TypedValue.applyDimension(1, 52.0f, resources.getDisplayMetrics()), viewGroup);
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setId(R.id.j2m);
        C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        tuxIconView.setPadding((int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.addRule(15, -1);
        }
        new k();
        k.LIZ("app:tux_icon", new a.b("2130772913", "raw"), tuxIconView);
        k.LIZ("app:tux_tintColor", new a.b("2131100622", "attr"), tuxIconView);
        android.view.a.LIZ(tuxIconView);
        if (tuxIconView.getParent() == null) {
            relativeLayout.addView(tuxIconView, layoutParams);
        }
        TuxIconView tuxIconView2 = new TuxIconView(context);
        tuxIconView2.setId(R.id.jp8);
        C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
        tuxIconView2.setPadding((int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.addRule(15, -1);
        }
        new k();
        k.LIZ("app:tux_icon", new a.b("2130775040", "raw"), tuxIconView2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.addRule(17, R.id.j2m);
        }
        k.LIZ("app:tux_tintColor", new a.b("2131100622", "attr"), tuxIconView2);
        android.view.a.LIZ(tuxIconView2);
        if (tuxIconView2.getParent() == null) {
            relativeLayout.addView(tuxIconView2, layoutParams2);
        }
        TuxIconView tuxIconView3 = new TuxIconView(context);
        tuxIconView3.setId(R.id.tk1);
        tuxIconView3.setPadding((int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        C786410Ut5.LLLLLLZZ(tuxIconView3, 0);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.addRule(15, -1);
        }
        new k();
        k.LIZ("app:tux_icon", new a.b("2130773653", "raw"), tuxIconView3);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.addRule(17, R.id.jp8);
        }
        k.LIZ("app:tux_tintColor", new a.b("2131100622", "attr"), tuxIconView3);
        android.view.a.LIZ(tuxIconView3);
        if (tuxIconView3.getParent() == null) {
            relativeLayout.addView(tuxIconView3, layoutParams3);
        }
        android.view.a.LIZ(relativeLayout);
        C786410Ut5.W5(relativeLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(relativeLayout);
        }
        return relativeLayout;
    }
}
