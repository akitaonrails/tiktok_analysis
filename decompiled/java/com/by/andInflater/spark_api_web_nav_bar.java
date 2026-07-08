package com.by.andInflater;

import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import com.bytedance.tux.navigation.TuxNavBar;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public class spark_api_web_nav_bar implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        context.getResources();
        TuxNavBar tuxNavBar = new TuxNavBar(context);
        tuxNavBar.setId(R.id.p15);
        tuxNavBar.setBackgroundResource(0);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -2, viewGroup);
        a.LIZ(tuxNavBar);
        C786410Ut5.W5(tuxNavBar, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(tuxNavBar);
        }
        return tuxNavBar;
    }
}
