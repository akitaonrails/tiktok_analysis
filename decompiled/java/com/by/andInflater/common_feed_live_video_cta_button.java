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
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.f;

/* JADX INFO: loaded from: classes32.dex */
public class common_feed_live_video_cta_button implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.n2o);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -2, viewGroup);
        C197039127h c197039127h = new C197039127h(context);
        c197039127h.setId(R.id.mw1);
        c197039127h.setGravity(17);
        C786410Ut5.LJLLLLLL(8, c197039127h);
        c197039127h.setText(2131854931);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()));
        new f();
        f.LIZ("android:enabled", new a.c("true"), c197039127h);
        f.LIZ("app:tux_buttonSize", new a.c("tiny"), c197039127h);
        f.LIZ("app:tux_buttonAutoSizing", new a.c("true"), c197039127h);
        android.view.a.LIZ(c197039127h);
        if (c197039127h.getParent() == null) {
            frameLayout.addView(c197039127h, layoutParams);
        }
        android.view.a.LIZ(frameLayout);
        C786410Ut5.W5(frameLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        return frameLayout;
    }
}
