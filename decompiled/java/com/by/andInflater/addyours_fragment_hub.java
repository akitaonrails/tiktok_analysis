package com.by.andInflater;

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
import com.bytedance.tux.navigation.TuxNavBar;
import com.zhiliaoapp.musically.R;
import dc.a;
import kotlin.jvm.internal.Intrinsics;
import xem.l;

/* JADX INFO: loaded from: classes32.dex */
public class addyours_fragment_hub implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -1, viewGroup);
        View view = new View(context);
        view.setId(R.id.w0u);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        a.LIZ(view);
        if (view.getParent() == null) {
            linearLayout.addView(view, layoutParams);
        }
        TuxNavBar tuxNavBar = new TuxNavBar(context);
        tuxNavBar.setId(R.id.p15);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()));
        new l();
        a.b bVar = new a.b("2131099676", "attr");
        if (Intrinsics.LJFF("app:_tux_navBackgroundColor", "app:_tux_navBackgroundColor")) {
            tuxNavBar.setNavBackground(ec.a.LIZIZ(tuxNavBar.getContext(), bVar));
        }
        android.view.a.LIZ(tuxNavBar);
        if (tuxNavBar.getParent() == null) {
            linearLayout.addView(tuxNavBar, layoutParams2);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.ewk);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -1);
        android.view.a.LIZ(frameLayout);
        if (frameLayout.getParent() == null) {
            linearLayout.addView(frameLayout, layoutParams3);
        }
        android.view.a.LIZ(linearLayout);
        C786410Ut5.W5(linearLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(linearLayout);
        }
        return linearLayout;
    }
}
