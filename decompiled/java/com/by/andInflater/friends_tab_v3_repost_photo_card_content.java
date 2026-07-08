package com.by.andInflater;

import X.C21696019va;
import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.repost.card.FriendsV3RepostCardPhotoContentLayout;
import com.zhiliaoapp.musically.R;
import dc.a;
import s7d.e0;

/* JADX INFO: loaded from: classes32.dex */
public class friends_tab_v3_repost_photo_card_content implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        FriendsV3RepostCardPhotoContentLayout friendsV3RepostCardPhotoContentLayout = new FriendsV3RepostCardPhotoContentLayout(context, null);
        friendsV3RepostCardPhotoContentLayout.setId(R.id.tad);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-2, -1, viewGroup);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        ViewGroup.LayoutParams layoutParamsLJ = a.LJ(-2, -2, friendsV3RepostCardPhotoContentLayout);
        C21696019va c21696019va = new C21696019va(context);
        c21696019va.setId(R.id.i0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        new e0();
        e0.LIZ(new a.c("repost"), c21696019va);
        android.view.a.LIZ(c21696019va);
        if (c21696019va.getParent() == null) {
            linearLayout.addView(c21696019va, layoutParams);
        }
        C21696019va c21696019va2 = new C21696019va(context);
        c21696019va2.setId(R.id.uh9);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.setMarginStart((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        }
        new e0();
        e0.LIZ(new a.c("repost"), c21696019va2);
        android.view.a.LIZ(c21696019va2);
        if (c21696019va2.getParent() == null) {
            linearLayout.addView(c21696019va2, layoutParams2);
        }
        android.view.a.LIZ(linearLayout);
        if (linearLayout.getParent() == null) {
            friendsV3RepostCardPhotoContentLayout.addView(linearLayout, layoutParamsLJ);
        }
        android.view.a.LIZ(friendsV3RepostCardPhotoContentLayout);
        C786410Ut5.W5(friendsV3RepostCardPhotoContentLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(friendsV3RepostCardPhotoContentLayout);
        }
        return friendsV3RepostCardPhotoContentLayout;
    }
}
