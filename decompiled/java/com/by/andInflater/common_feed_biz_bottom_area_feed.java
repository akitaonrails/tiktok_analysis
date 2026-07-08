package com.by.andInflater;

import X.C20742916Ex;
import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.ss.android.ugc.feed.platform.cell.interact.view.InteractBottomLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public class common_feed_biz_bottom_area_feed implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        context.getResources();
        InteractBottomLayout interactBottomLayout = new InteractBottomLayout(14, context, null);
        interactBottomLayout.setId(R.id.c25);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -2, viewGroup);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.s7m);
        C786410Ut5.LJLLLLLL(8, frameLayout);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ2 = a.LJ(-1, -2, interactBottomLayout);
        a.LIZ(frameLayout);
        if (frameLayout.getParent() == null) {
            interactBottomLayout.addView(frameLayout, marginLayoutParamsLJ2);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.fc1);
        C786410Ut5.LJLLLLLL(8, frameLayout2);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ3 = a.LJ(-1, -2, interactBottomLayout);
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ3).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ3).gravity = 80;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ3).gravity = 80;
        }
        a.LIZ(frameLayout2);
        if (frameLayout2.getParent() == null) {
            interactBottomLayout.addView(frameLayout2, marginLayoutParamsLJ3);
        }
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setId(R.id.video_user_card_layout);
        C786410Ut5.LJLLLLLL(8, frameLayout3);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ4 = a.LJ(-1, -2, interactBottomLayout);
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ4)) {
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ4).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ4)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ4).gravity = 80;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ4)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ4).gravity = 80;
        }
        a.LIZ(frameLayout3);
        if (frameLayout3.getParent() == null) {
            interactBottomLayout.addView(frameLayout3, marginLayoutParamsLJ4);
        }
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout4.setId(R.id.reb);
        C786410Ut5.LJLLLLLL(8, frameLayout4);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ5 = a.LJ(-1, -2, interactBottomLayout);
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ5)) {
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ5).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ5)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ5).gravity = 80;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ5)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ5).gravity = 80;
        }
        a.LIZ(frameLayout4);
        if (frameLayout4.getParent() == null) {
            interactBottomLayout.addView(frameLayout4, marginLayoutParamsLJ5);
        }
        View viewLIZ = C20742916Ex.LIZ(context, R.layout.b5f, interactBottomLayout, false, R.layout.b59);
        if (viewLIZ.getParent() == null) {
            interactBottomLayout.addView(viewLIZ);
        }
        a.LIZ(interactBottomLayout);
        C786410Ut5.W5(interactBottomLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(interactBottomLayout);
        }
        return interactBottomLayout;
    }
}
