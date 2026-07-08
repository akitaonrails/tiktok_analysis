package com.by.andInflater;

import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import com.bytedance.android.live.publicscreen.api.binder.PublicScreenMetricsLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes32.dex */
public class layout_public_screen_item_base_opt implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        context.getResources();
        PublicScreenMetricsLayout publicScreenMetricsLayout = new PublicScreenMetricsLayout(context, null, 6);
        publicScreenMetricsLayout.setId(R.id.eqx);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -2, viewGroup);
        a.LIZ(publicScreenMetricsLayout);
        C786410Ut5.W5(publicScreenMetricsLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(publicScreenMetricsLayout);
        }
        return publicScreenMetricsLayout;
    }
}
