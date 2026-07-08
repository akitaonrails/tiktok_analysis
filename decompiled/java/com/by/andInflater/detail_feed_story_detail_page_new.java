package com.by.andInflater;

import X.C0T8T;
import X.C16FB;
import X.C19ME;
import X.C20742916Ex;
import X.C420470GeD;
import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBarMaskView;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.b;
import xem.k;

/* JADX INFO: loaded from: classes32.dex */
public class detail_feed_story_detail_page_new implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        int i2;
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -1, viewGroup);
        C16FB c16fb = new C16FB(context);
        c16fb.setId(R.id.vw9);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.oh});
        c16fb.setBackgroundColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        new b();
        b.LIZ("app:tux_forceHandleEventMode", new a.c("true"), c16fb);
        VideoSeekBarMaskView videoSeekBarMaskView = new VideoSeekBarMaskView(context, null);
        videoSeekBarMaskView.setId(R.id.ujj);
        ViewGroup.LayoutParams layoutParamsLJ = android.view.a.LJ(-1, -1, c16fb);
        C0T8T c0t8t = new C0T8T(context);
        c0t8t.setId(R.id.trr);
        TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.e1});
        c0t8t.setBackgroundColor(typedArrayObtainStyledAttributes2.getColor(0, 0));
        typedArrayObtainStyledAttributes2.recycle();
        ViewGroup.LayoutParams layoutParamsLJ2 = android.view.a.LJ(-1, -1, videoSeekBarMaskView);
        View viewLIZ = C20742916Ex.LIZ(context, R.layout.b6q, c0t8t, false, 0);
        if (viewLIZ.getParent() == null) {
            c0t8t.addView(viewLIZ);
        }
        View view = new View(context);
        view.setId(R.id.frx);
        view.setBackgroundResource(R.drawable.cf4);
        ViewGroup.LayoutParams layoutParamsLJ3 = android.view.a.LJ(-1, (int) TypedValue.applyDimension(1, 90.0f, resources.getDisplayMetrics()), c0t8t);
        android.view.a.LIZ(view);
        if (view.getParent() == null) {
            c0t8t.addView(view, layoutParamsLJ3);
        }
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(R.id.wc_);
        ViewGroup.LayoutParams layoutParamsLJ4 = android.view.a.LJ(-1, -1, c0t8t);
        viewStub.setInflatedId(-1);
        android.view.a.LIZ(viewStub);
        if (viewStub.getParent() == null) {
            c0t8t.addView(viewStub, layoutParamsLJ4);
        }
        ViewStub viewStub2 = new ViewStub(context);
        viewStub2.setId(R.id.nx7);
        viewStub2.setLayoutResource(R.layout.bla);
        ViewGroup.LayoutParams layoutParamsLJ5 = android.view.a.LJ(-1, -1, c0t8t);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParamsLJ5)) {
            ((LinearLayout.LayoutParams) layoutParamsLJ5).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParamsLJ5)) {
            ((FrameLayout.LayoutParams) layoutParamsLJ5).gravity = 17;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParamsLJ5)) {
            ((DrawerLayout$LayoutParams) layoutParamsLJ5).gravity = 17;
        }
        viewStub2.setInflatedId(-1);
        android.view.a.LIZ(viewStub2);
        if (viewStub2.getParent() == null) {
            c0t8t.addView(viewStub2, layoutParamsLJ5);
        }
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(R.id.ija);
        ViewGroup.LayoutParams layoutParamsLJ6 = android.view.a.LJ(-1, -2, c0t8t);
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setId(R.id.bn2);
        tuxIconView.setPadding((int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics()));
        tuxIconView.setContentDescription(context.getResources().getString(2131823350));
        C19ME c19me = new C19ME((int) TypedValue.applyDimension(1, 52.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 52.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me)) {
            c19me.setMarginStart((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        new k();
        k.LIZ("app:tux_icon", new a.b("2130772433", "raw"), tuxIconView);
        k.LIZ("app:tux_tintColor", new a.b("2131099768", "attr"), tuxIconView);
        if (C19ME.class.isInstance(c19me)) {
            i = 0;
            c19me.bottomToBottom = 0;
        } else {
            i = 0;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.startToStart = i;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.topToTop = i;
        }
        android.view.a.LIZ(tuxIconView);
        if (tuxIconView.getParent() == null) {
            constraintLayout.addView(tuxIconView, c19me);
        }
        android.view.a.LIZ(constraintLayout);
        if (constraintLayout.getParent() == null) {
            c0t8t.addView(constraintLayout, layoutParamsLJ6);
        }
        ViewStub viewStub3 = new ViewStub(context);
        viewStub3.setId(R.id.nww);
        viewStub3.setLayoutResource(R.layout.b_n);
        ViewGroup.LayoutParams layoutParamsLJ7 = android.view.a.LJ(-1, -2, c0t8t);
        viewStub3.setInflatedId(-1);
        android.view.a.LIZ(viewStub3);
        if (viewStub3.getParent() == null) {
            c0t8t.addView(viewStub3, layoutParamsLJ7);
        }
        ViewStub viewStub4 = new ViewStub(context);
        viewStub4.setId(R.id.ij8);
        viewStub4.setLayoutResource(R.layout.bl_);
        ViewGroup.LayoutParams layoutParamsLJ8 = android.view.a.LJ(-2, -2, c0t8t);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParamsLJ8)) {
            i2 = 17;
            ((LinearLayout.LayoutParams) layoutParamsLJ8).gravity = 17;
        } else {
            i2 = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParamsLJ8)) {
            ((FrameLayout.LayoutParams) layoutParamsLJ8).gravity = i2;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParamsLJ8)) {
            ((DrawerLayout$LayoutParams) layoutParamsLJ8).gravity = i2;
        }
        viewStub4.setInflatedId(-1);
        android.view.a.LIZ(viewStub4);
        if (viewStub4.getParent() == null) {
            c0t8t.addView(viewStub4, layoutParamsLJ8);
        }
        View frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.khx);
        C786410Ut5.LJLLLLLL(8, frameLayout2);
        ViewGroup.LayoutParams layoutParamsLJ9 = android.view.a.LJ(-1, (int) TypedValue.applyDimension(1, 50.0f, resources.getDisplayMetrics()), c0t8t);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParamsLJ9)) {
            ((LinearLayout.LayoutParams) layoutParamsLJ9).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParamsLJ9)) {
            ((FrameLayout.LayoutParams) layoutParamsLJ9).gravity = 80;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParamsLJ9)) {
            ((DrawerLayout$LayoutParams) layoutParamsLJ9).gravity = 80;
        }
        android.view.a.LIZ(frameLayout2);
        if (frameLayout2.getParent() == null) {
            c0t8t.addView(frameLayout2, layoutParamsLJ9);
        }
        View frameLayout3 = new FrameLayout(context);
        frameLayout3.setId(R.id.fdu);
        ViewGroup.LayoutParams layoutParamsLJ10 = android.view.a.LJ(-1, (int) TypedValue.applyDimension(1, 50.0f, resources.getDisplayMetrics()), c0t8t);
        android.view.a.LIZ(frameLayout3);
        if (frameLayout3.getParent() == null) {
            c0t8t.addView(frameLayout3, layoutParamsLJ10);
        }
        ViewStub viewStub5 = new ViewStub(context);
        viewStub5.setId(R.id.b48);
        viewStub5.setLayoutResource(R.layout.b54);
        ViewGroup.LayoutParams layoutParamsLJ11 = android.view.a.LJ(-1, -1, c0t8t);
        viewStub5.setInflatedId(-1);
        android.view.a.LIZ(viewStub5);
        if (viewStub5.getParent() == null) {
            c0t8t.addView(viewStub5, layoutParamsLJ11);
        }
        android.view.a.LIZ(c0t8t);
        if (c0t8t.getParent() == null) {
            videoSeekBarMaskView.addView(c0t8t, layoutParamsLJ2);
        }
        ViewStub viewStub6 = new ViewStub(context);
        viewStub6.setId(R.id.vs_edge_speedup_guide);
        viewStub6.setLayoutResource(R.layout.b67);
        C786410Ut5.LLIIIJ(viewStub6, 8);
        ViewGroup.LayoutParams layoutParamsLJ12 = android.view.a.LJ(-1, -1, videoSeekBarMaskView);
        viewStub6.setInflatedId(-1);
        android.view.a.LIZ(viewStub6);
        if (viewStub6.getParent() == null) {
            videoSeekBarMaskView.addView(viewStub6, layoutParamsLJ12);
        }
        android.view.a.LIZ(videoSeekBarMaskView);
        if (videoSeekBarMaskView.getParent() == null) {
            c16fb.addView(videoSeekBarMaskView, layoutParamsLJ);
        }
        android.view.a.LIZ(c16fb);
        if (c16fb.getParent() == null) {
            frameLayout.addView(c16fb, layoutParams);
        }
        View c420470GeD = new C420470GeD(context);
        c420470GeD.setId(R.id.nnp);
        C786410Ut5.LJLLLLLL(8, c420470GeD);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        android.view.a.LIZ(c420470GeD);
        if (c420470GeD.getParent() == null) {
            frameLayout.addView(c420470GeD, layoutParams2);
        }
        android.view.a.LIZ(frameLayout);
        C786410Ut5.W5(frameLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        return frameLayout;
    }
}
