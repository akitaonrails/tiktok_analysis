package com.by.andInflater;

import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.view.FriendsV3TagBarLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public class friends_tab_v3_tag_bar implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        FriendsV3TagBarLayout friendsV3TagBarLayout = new FriendsV3TagBarLayout(context, null, 6);
        friendsV3TagBarLayout.setId(R.id.imx);
        friendsV3TagBarLayout.setBaselineAligned(false);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-2, -2, viewGroup);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.i2u);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ2 = a.LJ(-2, -2, friendsV3TagBarLayout);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            marginLayoutParamsLJ2.topMargin = (int) resources.getDimension(R.dimen.sb);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            marginLayoutParamsLJ2.setMarginEnd((int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()));
        }
        a.LIZ(frameLayout);
        if (frameLayout.getParent() == null) {
            friendsV3TagBarLayout.addView(frameLayout, marginLayoutParamsLJ2);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.i48);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ3 = a.LJ(-2, -2, friendsV3TagBarLayout);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            marginLayoutParamsLJ3.topMargin = (int) resources.getDimension(R.dimen.sb);
        }
        a.LIZ(frameLayout2);
        if (frameLayout2.getParent() == null) {
            friendsV3TagBarLayout.addView(frameLayout2, marginLayoutParamsLJ3);
        }
        a.LIZ(friendsV3TagBarLayout);
        C786410Ut5.W5(friendsV3TagBarLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(friendsV3TagBarLayout);
        }
        return friendsV3TagBarLayout;
    }
}
