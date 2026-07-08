package com.by.andInflater;

import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.Space;

/* JADX INFO: loaded from: classes8.dex */
public class common_feed_sentinel_space implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        context.getResources();
        Space space = new Space(context);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -2, viewGroup);
        a.LIZ(space);
        C786410Ut5.W5(space, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(space);
        }
        return space;
    }
}
