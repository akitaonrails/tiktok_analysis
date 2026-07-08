package com.by.andInflater;

import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import com.bytedance.tux.icon.TuxIconView;
import dc.a;
import xem.k;

/* JADX INFO: loaded from: classes32.dex */
public class story_layout_share implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        TuxIconView tuxIconView = new TuxIconView(context);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ((int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()), viewGroup);
        new k();
        k.LIZ("app:tux_icon", new a.b("2130772475", "raw"), tuxIconView);
        k.LIZ("app:tux_iconHeight", new a.d("28", "dp"), tuxIconView);
        k.LIZ("app:tux_iconWidth", new a.d("28", "dp"), tuxIconView);
        k.LIZ("app:tux_tintColor", new a.b("2131099768", "attr"), tuxIconView);
        android.view.a.LIZ(tuxIconView);
        C786410Ut5.W5(tuxIconView, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(tuxIconView);
        }
        return tuxIconView;
    }
}
