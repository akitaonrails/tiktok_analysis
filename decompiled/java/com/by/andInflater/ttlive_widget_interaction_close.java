package com.by.andInflater;

import X.InterfaceC20742716Ev;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import dc.a;
import psf.e;

/* JADX INFO: loaded from: classes32.dex */
public class ttlive_widget_interaction_close implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        LiveIconView liveIconView = new LiveIconView(context, null);
        liveIconView.setContentDescription(context.getResources().getString(2131840885));
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ((int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), viewGroup);
        new e();
        e.LIZ("app:icon", new a.b("2131106964", "attr"), liveIconView);
        e.LIZ("app:iconTint", new a.b("2131232001", "color"), liveIconView);
        android.view.a.LIZ(liveIconView);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(liveIconView);
        liveIconView.setLayoutParams(marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(liveIconView);
        }
        return liveIconView;
    }
}
