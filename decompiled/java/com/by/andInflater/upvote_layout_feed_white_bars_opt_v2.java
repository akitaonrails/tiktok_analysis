package com.by.andInflater;

import X.C1359990lUj;
import X.C1602160rnK;
import X.C420840Geo;
import X.C428890Grn;
import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public class upvote_layout_feed_white_bars_opt_v2 implements InterfaceC20742716Ev {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -2, viewGroup);
        View c420840Geo = new C420840Geo(new ContextThemeWrapper(context, R.style.xm));
        c420840Geo.setId(R.id.wb_guide);
        C786410Ut5.LJLLLLLL(8, c420840Geo);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((LinearLayout.LayoutParams) layoutParams).gravity = 8388627;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.gravity = 8388627;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams)) {
            ((DrawerLayout$LayoutParams) layoutParams).gravity = 8388627;
        }
        a.LIZ(c420840Geo);
        if (c420840Geo.getParent() == null) {
            frameLayout.addView(c420840Geo, layoutParams);
        }
        View c428890Grn = new C428890Grn(new ContextThemeWrapper(context, R.style.xm));
        c428890Grn.setId(R.id.wb_info_opt);
        int visibility = c428890Grn.getVisibility();
        c428890Grn.setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, c428890Grn);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 28.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
            ((LinearLayout.LayoutParams) layoutParams2).gravity = 8388627;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.gravity = 8388627;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams2)) {
            ((DrawerLayout$LayoutParams) layoutParams2).gravity = 8388627;
        }
        a.LIZ(c428890Grn);
        if (c428890Grn.getParent() == null) {
            frameLayout.addView(c428890Grn, layoutParams2);
        }
        View c1359990lUj = new C1359990lUj(new ContextThemeWrapper(context, R.style.xm), null, 6);
        c1359990lUj.setId(R.id.tat);
        C786410Ut5.LJLLLLLL(8, c1359990lUj);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams3)) {
            ((LinearLayout.LayoutParams) layoutParams3).gravity = 8388627;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.gravity = 8388627;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams3)) {
            ((DrawerLayout$LayoutParams) layoutParams3).gravity = 8388627;
        }
        a.LIZ(c1359990lUj);
        if (c1359990lUj.getParent() == null) {
            frameLayout.addView(c1359990lUj, layoutParams3);
        }
        a.LIZ(frameLayout);
        C786410Ut5.W5(frameLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        return frameLayout;
    }
}
