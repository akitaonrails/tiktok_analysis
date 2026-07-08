package com.by.andInflater;

import X.C1749280vcc;
import X.C481090Itn;
import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import com.bytedance.tux.skeleton.TuxSkeletonLayout;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.n;

/* JADX INFO: loaded from: classes32.dex */
public class relation_user_card_list implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.t4x);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -1, viewGroup);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = new ViewOnAttachStateChangeListenerC20604515jv(context, null);
        viewOnAttachStateChangeListenerC20604515jv.setId(R.id.rn0);
        viewOnAttachStateChangeListenerC20604515jv.setClipToPadding(false);
        C786410Ut5.LJLLLLLL(8, viewOnAttachStateChangeListenerC20604515jv);
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        a.LIZ(viewOnAttachStateChangeListenerC20604515jv);
        if (viewOnAttachStateChangeListenerC20604515jv.getParent() == null) {
            frameLayout.addView(viewOnAttachStateChangeListenerC20604515jv, layoutParams);
        }
        C481090Itn c481090Itn = new C481090Itn(context);
        c481090Itn.setId(R.id.t25);
        C786410Ut5.LJLLLLLL(8, c481090Itn);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = new ViewOnAttachStateChangeListenerC20604515jv(context, null);
        viewOnAttachStateChangeListenerC20604515jv2.setId(R.id.rn1);
        viewOnAttachStateChangeListenerC20604515jv2.setClipToPadding(false);
        C786410Ut5.LJLLLLLL(8, viewOnAttachStateChangeListenerC20604515jv2);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ2 = a.LJ(-1, -1, c481090Itn);
        a.LIZ(viewOnAttachStateChangeListenerC20604515jv2);
        if (viewOnAttachStateChangeListenerC20604515jv2.getParent() == null) {
            c481090Itn.addView(viewOnAttachStateChangeListenerC20604515jv2, marginLayoutParamsLJ2);
        }
        a.LIZ(c481090Itn);
        if (c481090Itn.getParent() == null) {
            frameLayout.addView(c481090Itn, layoutParams2);
        }
        TuxSkeletonLayout tuxSkeletonLayout = new TuxSkeletonLayout(context);
        tuxSkeletonLayout.setId(R.id.vev);
        C786410Ut5.LJLLLLLL(8, tuxSkeletonLayout);
        ViewGroup.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        new jem.a();
        jem.a.LIZ("app:tux_skeletonRepeat", new a.c(CardStruct.IStatusCode.DEFAULT), tuxSkeletonLayout);
        android.view.a.LIZ(tuxSkeletonLayout);
        if (tuxSkeletonLayout.getParent() == null) {
            frameLayout.addView(tuxSkeletonLayout, layoutParams3);
        }
        C1749280vcc c1749280vcc = new C1749280vcc(context);
        c1749280vcc.setId(R.id.w28);
        C786410Ut5.LLLZLZ(c1749280vcc, 8);
        ViewGroup.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -1);
        new n();
        n.LIZ(new a.c("fixed_height"), c1749280vcc);
        android.view.a.LIZ(c1749280vcc);
        if (c1749280vcc.getParent() == null) {
            frameLayout.addView(c1749280vcc, layoutParams4);
        }
        android.view.a.LIZ(frameLayout);
        C786410Ut5.W5(frameLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        return frameLayout;
    }
}
