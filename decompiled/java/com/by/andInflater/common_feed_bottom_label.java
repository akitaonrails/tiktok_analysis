package com.by.andInflater;

import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import com.ss.android.ugc.feed.platform.cell.interact.info.bottomlabel.FeedBottomLabelLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes12.dex */
public class common_feed_bottom_label implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        context.getResources();
        FeedBottomLabelLayout feedBottomLabelLayout = new FeedBottomLabelLayout(context, null, 6);
        feedBottomLabelLayout.setId(R.id.m4i);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -2, viewGroup);
        a.LIZ(feedBottomLabelLayout);
        C786410Ut5.W5(feedBottomLabelLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(feedBottomLabelLayout);
        }
        return feedBottomLabelLayout;
    }
}
