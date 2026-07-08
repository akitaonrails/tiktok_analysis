package com.by.andInflater;

import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.k;

/* JADX INFO: loaded from: classes32.dex */
public class friends_tab_v3_like_icon_layout implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -1, viewGroup);
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setId(R.id.k1k);
        tuxIconView.setImportantForAccessibility(2);
        tuxIconView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        new k();
        k.LIZ("app:tux_icon", new a.b("2130774118", "raw"), tuxIconView);
        k.LIZ("app:tux_iconHeight", new a.d("22", "dp"), tuxIconView);
        k.LIZ("app:tux_iconWidth", new a.d("22", "dp"), tuxIconView);
        k.LIZ("app:tux_tintColor", new a.b("2131100567", "attr"), tuxIconView);
        android.view.a.LIZ(tuxIconView);
        if (tuxIconView.getParent() == null) {
            frameLayout.addView(tuxIconView, layoutParams);
        }
        TuxIconView tuxIconView2 = new TuxIconView(context);
        tuxIconView2.setId(R.id.k1j);
        tuxIconView2.setImportantForAccessibility(2);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        new k();
        k.LIZ("app:tux_icon", new a.b("2130774121", "raw"), tuxIconView2);
        k.LIZ("app:tux_iconHeight", new a.d("22", "dp"), tuxIconView2);
        k.LIZ("app:tux_iconWidth", new a.d("22", "dp"), tuxIconView2);
        k.LIZ("app:tux_tintColor", new a.b("2131100571", "attr"), tuxIconView2);
        android.view.a.LIZ(tuxIconView2);
        if (tuxIconView2.getParent() == null) {
            frameLayout.addView(tuxIconView2, layoutParams2);
        }
        android.view.a.LIZ(frameLayout);
        C786410Ut5.W5(frameLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        return frameLayout;
    }
}
