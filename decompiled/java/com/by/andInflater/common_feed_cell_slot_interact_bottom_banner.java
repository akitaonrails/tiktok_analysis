package com.by.andInflater;

import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import com.ss.android.ugc.aweme.base.ui.bottom.banner.FeedBottomBannerView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes12.dex */
public class common_feed_cell_slot_interact_bottom_banner implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        context.getResources();
        FeedBottomBannerView feedBottomBannerView = new FeedBottomBannerView(context, null, 6);
        feedBottomBannerView.setId(R.id.tr7);
        feedBottomBannerView.setClickable(true);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -2, viewGroup);
        a.LIZ(feedBottomBannerView);
        C786410Ut5.W5(feedBottomBannerView, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(feedBottomBannerView);
        }
        return feedBottomBannerView;
    }
}
