package com.by.andInflater;

import X.C16EG;
import X.C418630GbF;
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
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.ss.android.ugc.aweme.feed.widget.LineProgressBar;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes32.dex */
public class common_feed_view_video_progress_bar implements InterfaceC20742716Ev {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()), viewGroup);
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ).gravity = 80;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ).gravity = 80;
        }
        C16EG c16eg = new C16EG(context, null);
        c16eg.setId(R.id.baz);
        C786410Ut5.T4(c16eg, 0.0f);
        c16eg.setForegroundColor(a.LIZIZ(R.attr.a09, context));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((LinearLayout.LayoutParams) layoutParams).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.gravity = 80;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams)) {
            ((DrawerLayout$LayoutParams) layoutParams).gravity = 80;
        }
        a.LIZ(c16eg);
        if (c16eg.getParent() == null) {
            frameLayout.addView(c16eg, layoutParams);
        }
        View lineProgressBar = new LineProgressBar(context);
        lineProgressBar.setId(R.id.mpn);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        a.LIZ(lineProgressBar);
        if (lineProgressBar.getParent() == null) {
            frameLayout.addView(lineProgressBar, layoutParams2);
        }
        C418630GbF c418630GbF = new C418630GbF(context, null);
        c418630GbF.setId(R.id.video_player_progress);
        c418630GbF.setReachedBarColor(a.LIZIZ(R.attr.ef, context));
        c418630GbF.setReachedProgressBarHeight(TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()));
        ViewGroup.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        a.LIZ(c418630GbF);
        if (c418630GbF.getParent() == null) {
            frameLayout.addView(c418630GbF, layoutParams3);
        }
        a.LIZ(frameLayout);
        C786410Ut5.W5(frameLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        return frameLayout;
    }
}
