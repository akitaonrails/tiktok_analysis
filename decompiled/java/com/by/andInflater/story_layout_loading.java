package com.by.andInflater;

import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import com.ss.android.ugc.aweme.feed.widget.LineProgressBar;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes32.dex */
public class story_layout_loading implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        LineProgressBar lineProgressBar = new LineProgressBar(context);
        lineProgressBar.setId(R.id.nsd);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()), viewGroup);
        a.LIZ(lineProgressBar);
        C786410Ut5.W5(lineProgressBar, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(lineProgressBar);
        }
        return lineProgressBar;
    }
}
