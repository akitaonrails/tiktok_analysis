package com.by.andInflater;

import X.C197039127h;
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
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.f;
import xem.k;

/* JADX INFO: loaded from: classes32.dex */
public class creator_monetization_series_bottom_bar_action implements InterfaceC20742716Ev {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.eqx);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-2, -2, viewGroup);
        C197039127h c197039127h = new C197039127h(context);
        c197039127h.setId(R.id.d6g);
        c197039127h.setMaxWidth((int) TypedValue.applyDimension(1, 130.0f, resources.getDisplayMetrics()));
        if (TextView.class.isInstance(c197039127h)) {
            a.LJII((int) TypedValue.applyDimension(1, 75.0f, resources.getDisplayMetrics()), c197039127h);
        } else {
            c197039127h.setMinimumWidth((int) TypedValue.applyDimension(1, 75.0f, resources.getDisplayMetrics()));
        }
        c197039127h.setText(2131847448);
        c197039127h.setFocusable(true);
        c197039127h.setContentDescription("");
        c197039127h.setTextSize(2, 12.0f);
        C786410Ut5.LJLLLLLL(8, c197039127h);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((LinearLayout.LayoutParams) layoutParams).gravity = 8388629;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.gravity = 8388629;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams)) {
            ((DrawerLayout$LayoutParams) layoutParams).gravity = 8388629;
        }
        new f();
        f.LIZ("app:tux_buttonAutoSizing", new a.c("true"), c197039127h);
        f.LIZ("app:tux_buttonVariant", new a.c("const_secondary"), c197039127h);
        f.LIZ("app:tux_font", new a.c("P3_Semibold"), c197039127h);
        f.LIZ("app:tux_minTextSize", new a.d("12", "dp"), c197039127h);
        android.view.a.LIZ(c197039127h);
        if (c197039127h.getParent() == null) {
            frameLayout.addView(c197039127h, layoutParams);
        }
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setId(R.id.h4e);
        tuxIconView.setImportantForAccessibility(2);
        tuxIconView.setFocusable(false);
        tuxIconView.setContentDescription("");
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
            ((LinearLayout.LayoutParams) layoutParams2).gravity = 8388629;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.gravity = 8388629;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams2)) {
            ((DrawerLayout$LayoutParams) layoutParams2).gravity = 8388629;
        }
        new k();
        k.LIZ("app:tux_icon", new a.b("2130772913", "raw"), tuxIconView);
        k.LIZ("app:tux_tintColor", new a.b("2131099768", "attr"), tuxIconView);
        android.view.a.LIZ(tuxIconView);
        if (tuxIconView.getParent() == null) {
            frameLayout.addView(tuxIconView, layoutParams2);
        }
        android.view.a.LIZ(frameLayout);
        C786410Ut5.W5(frameLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        return frameLayout;
    }
}
