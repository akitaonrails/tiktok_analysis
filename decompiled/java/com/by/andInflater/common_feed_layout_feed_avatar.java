package com.by.andInflater;

import X.C1303280k1G;
import X.C1609500rzA;
import X.C1610670s13;
import X.C1610770s1D;
import X.C430210Gtv;
import X.C430230Gtx;
import X.C709140Rrk;
import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.feed.platform.cell.interact.view.InteractRelativeLayout;
import com.zhiliaoapp.musically.R;
import dc.a;
import jf8.c;
import xem.k;

/* JADX INFO: loaded from: classes32.dex */
public class common_feed_layout_feed_avatar implements InterfaceC20742716Ev {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-2, -2, viewGroup);
        InteractRelativeLayout interactRelativeLayout = new InteractRelativeLayout(context);
        interactRelativeLayout.setId(R.id.hsd);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 64.0f, resources.getDisplayMetrics()), -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((LinearLayout.LayoutParams) layoutParams).gravity = 8388613;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.gravity = 8388613;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams)) {
            ((DrawerLayout$LayoutParams) layoutParams).gravity = 8388613;
        }
        C709140Rrk c709140Rrk = new C709140Rrk(context);
        c709140Rrk.setId(R.id.bi2);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ2 = a.LJ((int) TypedValue.applyDimension(1, 64.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 64.0f, resources.getDisplayMetrics()), interactRelativeLayout);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            marginLayoutParamsLJ2.topMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        C1609500rzA c1609500rzA = new C1609500rzA(context);
        c1609500rzA.setId(R.id.i8g);
        ViewGroup.LayoutParams layoutParamsLJ = a.LJ((int) TypedValue.applyDimension(1, 54.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 54.0f, resources.getDisplayMetrics()), c709140Rrk);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParamsLJ)) {
            ((RelativeLayout.LayoutParams) layoutParamsLJ).addRule(13, -1);
        }
        C430210Gtv c430210Gtv = new C430210Gtv(context);
        c430210Gtv.setId(R.id.vng);
        C786410Ut5.LJZI(8, c430210Gtv);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ3 = a.LJ((int) TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()), c1609500rzA);
        if (RelativeLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            ((RelativeLayout.LayoutParams) marginLayoutParamsLJ3).addRule(13, -1);
        }
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ3).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ3).gravity = 17;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ3).gravity = 17;
        }
        a.LIZ(c430210Gtv);
        if (c430210Gtv.getParent() == null) {
            c1609500rzA.addView(c430210Gtv, marginLayoutParamsLJ3);
        }
        C430210Gtv c430210Gtv2 = new C430210Gtv(context);
        c430210Gtv2.setId(R.id.user_avatar);
        C786410Ut5.LJZI(0, c430210Gtv2);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ4 = a.LJ((int) TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()), c1609500rzA);
        if (RelativeLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ4)) {
            ((RelativeLayout.LayoutParams) marginLayoutParamsLJ4).addRule(13, -1);
        }
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ4)) {
            i = 17;
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ4).gravity = 17;
        } else {
            i = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ4)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ4).gravity = i;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ4)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ4).gravity = i;
        }
        a.LIZ(c430210Gtv2);
        if (c430210Gtv2.getParent() == null) {
            c1609500rzA.addView(c430210Gtv2, marginLayoutParamsLJ4);
        }
        C430230Gtx c430230Gtx = new C430230Gtx(context);
        c430230Gtx.setId(R.id.vnd);
        C786410Ut5.LJZI(8, c430230Gtx);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ5 = a.LJ((int) TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()), c1609500rzA);
        if (RelativeLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ5)) {
            ((RelativeLayout.LayoutParams) marginLayoutParamsLJ5).addRule(13, -1);
        }
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ5)) {
            i2 = 17;
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ5).gravity = 17;
        } else {
            i2 = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ5)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ5).gravity = i2;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ5)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ5).gravity = i2;
        }
        a.LIZ(c430230Gtx);
        if (c430230Gtx.getParent() == null) {
            c1609500rzA.addView(c430230Gtx, marginLayoutParamsLJ5);
        }
        a.LIZ(c1609500rzA);
        if (c1609500rzA.getParent() == null) {
            c709140Rrk.addView(c1609500rzA, layoutParamsLJ);
        }
        View view = new View(context);
        view.setId(R.id.user_avatar_layout_indicator);
        ViewGroup.LayoutParams layoutParamsLJ2 = a.LJ((int) TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()), c709140Rrk);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParamsLJ2)) {
            ((RelativeLayout.LayoutParams) layoutParamsLJ2).addRule(13, -1);
        }
        a.LIZ(view);
        if (view.getParent() == null) {
            c709140Rrk.addView(view, layoutParamsLJ2);
        }
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R.id.f741lgo);
        appCompatImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        appCompatImageView.setImageResource(R.drawable.bb6);
        C786410Ut5.LJZI(8, appCompatImageView);
        ViewGroup.LayoutParams layoutParamsLJ3 = a.LJ((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), c709140Rrk);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParamsLJ3)) {
            ((RelativeLayout.LayoutParams) layoutParamsLJ3).addRule(18, R.id.user_avatar_layout_indicator);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParamsLJ3)) {
            ((RelativeLayout.LayoutParams) layoutParamsLJ3).addRule(6, R.id.user_avatar_layout_indicator);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParamsLJ3)) {
            ((RelativeLayout.LayoutParams) layoutParamsLJ3).addRule(19, R.id.user_avatar_layout_indicator);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParamsLJ3)) {
            ((RelativeLayout.LayoutParams) layoutParamsLJ3).addRule(8, R.id.user_avatar_layout_indicator);
        }
        a.LIZ(appCompatImageView);
        if (appCompatImageView.getParent() == null) {
            c709140Rrk.addView(appCompatImageView, layoutParamsLJ3);
        }
        C1610770s1D c1610770s1D = new C1610770s1D(context);
        c1610770s1D.setId(R.id.user_avatar_border);
        c1610770s1D.setPadding((int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()));
        C786410Ut5.LJLLLLLL(8, c1610770s1D);
        c1610770s1D.setStrokeWidth((int) TypedValue.applyDimension(1, 1.5f, resources.getDisplayMetrics()));
        ViewGroup.LayoutParams layoutParamsLJ4 = a.LJ((int) TypedValue.applyDimension(1, 54.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 54.0f, resources.getDisplayMetrics()), c709140Rrk);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParamsLJ4)) {
            ((RelativeLayout.LayoutParams) layoutParamsLJ4).addRule(13, -1);
        }
        a.LIZ(c1610770s1D);
        if (c1610770s1D.getParent() == null) {
            c709140Rrk.addView(c1610770s1D, layoutParamsLJ4);
        }
        SmartImageView smartImageView = new SmartImageView(context);
        smartImageView.setId(R.id.s7u);
        smartImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        ViewGroup.LayoutParams layoutParamsLJ5 = a.LJ((int) TypedValue.applyDimension(1, 64.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()), c709140Rrk);
        c cVar = new c();
        cVar.LIZIZ("app:actualImageScaleType", new a.c("fitCenter"), smartImageView);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParamsLJ5)) {
            i3 = -1;
            ((RelativeLayout.LayoutParams) layoutParamsLJ5).addRule(10, -1);
        } else {
            i3 = -1;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParamsLJ5)) {
            ((RelativeLayout.LayoutParams) layoutParamsLJ5).addRule(14, i3);
        }
        cVar.LIZ(smartImageView);
        android.view.a.LIZ(smartImageView);
        if (smartImageView.getParent() == null) {
            c709140Rrk.addView(smartImageView, layoutParamsLJ5);
        }
        View c1610670s13 = new C1610670s13(context, null);
        c1610670s13.setId(R.id.user_avatar_live);
        C786410Ut5.LJLLLLLL(4, c1610670s13);
        ViewGroup.LayoutParams layoutParamsLJ6 = android.view.a.LJ((int) TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()), c709140Rrk);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParamsLJ6)) {
            ((RelativeLayout.LayoutParams) layoutParamsLJ6).addRule(13, -1);
        }
        android.view.a.LIZ(c1610670s13);
        if (c1610670s13.getParent() == null) {
            c709140Rrk.addView(c1610670s13, layoutParamsLJ6);
        }
        android.view.a.LIZ(c709140Rrk);
        if (c709140Rrk.getParent() == null) {
            interactRelativeLayout.addView(c709140Rrk, marginLayoutParamsLJ2);
        }
        RemoteImageView remoteImageView = new RemoteImageView(context);
        remoteImageView.setId(R.id.bi7);
        remoteImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        C786410Ut5.LJZI(8, remoteImageView);
        remoteImageView.setImageResource(2130971968);
        ViewGroup.LayoutParams layoutParamsLJ7 = android.view.a.LJ((int) TypedValue.applyDimension(1, 50.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 45.0f, resources.getDisplayMetrics()), interactRelativeLayout);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParamsLJ7)) {
            ((RelativeLayout.LayoutParams) layoutParamsLJ7).addRule(14, -1);
        }
        android.view.a.LIZ(remoteImageView);
        if (remoteImageView.getParent() == null) {
            interactRelativeLayout.addView(remoteImageView, layoutParamsLJ7);
        }
        C709140Rrk c709140Rrk2 = new C709140Rrk(context);
        c709140Rrk2.setId(R.id.iej);
        c709140Rrk2.setPadding(c709140Rrk2.getPaddingLeft(), c709140Rrk2.getPaddingTop(), c709140Rrk2.getPaddingRight(), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ6 = android.view.a.LJ((int) TypedValue.applyDimension(1, 60.0f, resources.getDisplayMetrics()), -2, interactRelativeLayout);
        if (RelativeLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ6)) {
            ((RelativeLayout.LayoutParams) marginLayoutParamsLJ6).addRule(14, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ6)) {
            i4 = 1;
            marginLayoutParamsLJ6.topMargin = (int) TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics());
        } else {
            i4 = 1;
        }
        C1303280k1G c1303280k1G = new C1303280k1G(context);
        c1303280k1G.setId(R.id.idt);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ7 = android.view.a.LJ((int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(i4, 24.0f, resources.getDisplayMetrics()), c709140Rrk2);
        if (RelativeLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ7)) {
            ((RelativeLayout.LayoutParams) marginLayoutParamsLJ7).addRule(14, -1);
        }
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ7)) {
            i5 = 17;
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ7).gravity = 17;
        } else {
            i5 = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ7)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ7).gravity = i5;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ7)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ7).gravity = i5;
        }
        android.view.a.LIZ(c1303280k1G);
        if (c1303280k1G.getParent() == null) {
            c709140Rrk2.addView(c1303280k1G, marginLayoutParamsLJ7);
        }
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setId(R.id.iet);
        C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ8 = android.view.a.LJ((int) TypedValue.applyDimension(1, 28.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), c709140Rrk2);
        if (RelativeLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ8)) {
            ((RelativeLayout.LayoutParams) marginLayoutParamsLJ8).addRule(14, -1);
        }
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ8)) {
            i6 = 17;
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ8).gravity = 17;
        } else {
            i6 = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ8)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ8).gravity = i6;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ8)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ8).gravity = i6;
        }
        android.view.a.LIZ(tuxIconView);
        if (tuxIconView.getParent() == null) {
            c709140Rrk2.addView(tuxIconView, marginLayoutParamsLJ8);
        }
        TuxIconView tuxIconView2 = new TuxIconView(context);
        tuxIconView2.setId(R.id.g04);
        tuxIconView2.setPadding((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), tuxIconView2.getPaddingTop(), tuxIconView2.getPaddingRight(), tuxIconView2.getPaddingBottom());
        tuxIconView2.setPadding(tuxIconView2.getPaddingLeft(), tuxIconView2.getPaddingTop(), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), tuxIconView2.getPaddingBottom());
        tuxIconView2.setPadding(tuxIconView2.getPaddingLeft(), (int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()), tuxIconView2.getPaddingRight(), tuxIconView2.getPaddingBottom());
        tuxIconView2.setPadding(tuxIconView2.getPaddingLeft(), tuxIconView2.getPaddingTop(), tuxIconView2.getPaddingRight(), (int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()));
        C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ9 = android.view.a.LJ((int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), c709140Rrk2);
        if (RelativeLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ9)) {
            ((RelativeLayout.LayoutParams) marginLayoutParamsLJ9).addRule(14, -1);
        }
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ9)) {
            i7 = 17;
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ9).gravity = 17;
        } else {
            i7 = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ9)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ9).gravity = i7;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ9)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ9).gravity = i7;
        }
        new k();
        k.LIZ("app:tux_tintColor", new a.b("2131100571", "attr"), tuxIconView2);
        k.LIZ("app:tux_iconHeight", new a.d("16", "dp"), tuxIconView2);
        k.LIZ("app:tux_iconWidth", new a.d("16", "dp"), tuxIconView2);
        k.LIZ("app:tux_icon", new a.b("2130774372", "raw"), tuxIconView2);
        android.view.a.LIZ(tuxIconView2);
        if (tuxIconView2.getParent() == null) {
            c709140Rrk2.addView(tuxIconView2, marginLayoutParamsLJ9);
        }
        TuxIconView tuxIconView3 = new TuxIconView(context);
        tuxIconView3.setId(R.id.fys);
        C786410Ut5.LLLLLLZZ(tuxIconView3, 8);
        tuxIconView3.setContentDescription("link icon");
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ10 = android.view.a.LJ((int) TypedValue.applyDimension(1, 22.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 22.0f, resources.getDisplayMetrics()), c709140Rrk2);
        if (RelativeLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ10)) {
            ((RelativeLayout.LayoutParams) marginLayoutParamsLJ10).addRule(14, -1);
        }
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ10)) {
            i8 = 17;
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ10).gravity = 17;
        } else {
            i8 = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ10)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ10).gravity = i8;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ10)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ10).gravity = i8;
        }
        new k();
        k.LIZ("app:tux_tintColor", new a.b("2131100632", "attr"), tuxIconView3);
        k.LIZ("app:tux_iconHeight", new a.d("12", "dp"), tuxIconView3);
        k.LIZ("app:tux_iconWidth", new a.d("12", "dp"), tuxIconView3);
        k.LIZ("app:tux_icon", new a.b("2130774139", "raw"), tuxIconView3);
        android.view.a.LIZ(tuxIconView3);
        if (tuxIconView3.getParent() == null) {
            c709140Rrk2.addView(tuxIconView3, marginLayoutParamsLJ10);
        }
        android.view.a.LIZ(c709140Rrk2);
        if (c709140Rrk2.getParent() == null) {
            interactRelativeLayout.addView(c709140Rrk2, marginLayoutParamsLJ6);
        }
        android.view.a.LIZ(interactRelativeLayout);
        if (interactRelativeLayout.getParent() == null) {
            frameLayout.addView(interactRelativeLayout, layoutParams);
        }
        android.view.a.LIZ(frameLayout);
        C786410Ut5.W5(frameLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        return frameLayout;
    }
}
