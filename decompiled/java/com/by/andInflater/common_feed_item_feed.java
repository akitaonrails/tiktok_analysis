package com.by.andInflater;

import X.C0J0X;
import X.C0RH0;
import X.C0SUL;
import X.C12P4;
import X.C19ME;
import X.C20742916Ex;
import X.C417130GXf;
import X.C704220Rjo;
import X.C714400S0o;
import X.C726240SeE;
import X.C786410Ut5;
import X.C789490Uy3;
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
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.ss.android.ugc.aweme.experiment.ViewStubOptExperiment;
import com.ss.android.ugc.aweme.experiment.ViewStubOptExperimentV2;
import com.ss.android.ugc.aweme.feed.VideoViewCellRootView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.i;

/* JADX INFO: loaded from: classes32.dex */
public class common_feed_item_feed implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        Resources resources = context.getResources();
        VideoViewCellRootView videoViewCellRootView = new VideoViewCellRootView(context);
        videoViewCellRootView.setId(R.id.view_rootview);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.e1});
        videoViewCellRootView.setBackgroundColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -1, viewGroup);
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(R.id.qc3);
        viewStub.setLayoutResource(R.layout.b_o);
        ViewGroup.LayoutParams layoutParamsLJ = a.LJ(-1, -1, videoViewCellRootView);
        viewStub.setInflatedId(-1);
        a.LIZ(viewStub);
        if (viewStub.getParent() == null) {
            videoViewCellRootView.addView(viewStub, layoutParamsLJ);
        }
        ViewStub viewStub2 = new ViewStub(context);
        viewStub2.setId(R.id.x0c);
        viewStub2.setLayoutResource(R.layout.bat);
        ViewGroup.LayoutParams layoutParamsLJ2 = a.LJ(-1, -1, videoViewCellRootView);
        viewStub2.setInflatedId(-1);
        a.LIZ(viewStub2);
        if (viewStub2.getParent() == null) {
            videoViewCellRootView.addView(viewStub2, layoutParamsLJ2);
        }
        View c0sul = new C0SUL(context, null);
        c0sul.setId(R.id.long_press_layout);
        c0sul.setContentDescription(context.getResources().getString(2131823202));
        ViewGroup.LayoutParams layoutParamsLJ3 = a.LJ(-1, -1, videoViewCellRootView);
        a.LIZ(c0sul);
        if (c0sul.getParent() == null) {
            videoViewCellRootView.addView(c0sul, layoutParamsLJ3);
        }
        View c0j0x = new C0J0X(context, null);
        c0j0x.setId(R.id.boq);
        C786410Ut5.LJLLLLLL(8, c0j0x);
        ViewGroup.LayoutParams layoutParamsLJ4 = a.LJ(-1, -1, videoViewCellRootView);
        a.LIZ(c0j0x);
        if (c0j0x.getParent() == null) {
            videoViewCellRootView.addView(c0j0x, layoutParamsLJ4);
        }
        View c714400S0o = new C714400S0o(context, null);
        c714400S0o.setId(R.id.player_view_pager);
        C786410Ut5.LJLLLLLL(8, c714400S0o);
        ViewGroup.LayoutParams layoutParamsLJ5 = a.LJ(-1, -1, videoViewCellRootView);
        a.LIZ(c714400S0o);
        if (c714400S0o.getParent() == null) {
            videoViewCellRootView.addView(c714400S0o, layoutParamsLJ5);
        }
        ViewStub viewStub3 = new ViewStub(context);
        viewStub3.setId(R.id.boh);
        viewStub3.setLayoutResource(R.layout.b9b);
        ViewGroup.LayoutParams layoutParamsLJ6 = a.LJ(-1, -1, videoViewCellRootView);
        viewStub3.setInflatedId(-1);
        a.LIZ(viewStub3);
        if (viewStub3.getParent() == null) {
            videoViewCellRootView.addView(viewStub3, layoutParamsLJ6);
        }
        View viewLIZ = C20742916Ex.LIZ(context, R.layout.bb7, videoViewCellRootView, false, R.layout.b7p);
        viewLIZ.setId(R.id.video_container_area);
        if (viewLIZ.getParent() == null) {
            videoViewCellRootView.addView(viewLIZ);
        }
        View view = new View(context);
        view.setId(R.id.gradual_top);
        view.setBackgroundResource(R.drawable.b_l);
        ViewGroup.LayoutParams layoutParamsLJ7 = a.LJ(-1, (int) TypedValue.applyDimension(1, 108.0f, resources.getDisplayMetrics()), videoViewCellRootView);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParamsLJ7)) {
            ((LinearLayout.LayoutParams) layoutParamsLJ7).gravity = 48;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParamsLJ7)) {
            ((FrameLayout.LayoutParams) layoutParamsLJ7).gravity = 48;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParamsLJ7)) {
            ((DrawerLayout$LayoutParams) layoutParamsLJ7).gravity = 48;
        }
        a.LIZ(view);
        if (view.getParent() == null) {
            videoViewCellRootView.addView(view, layoutParamsLJ7);
        }
        C12P4 c12p4 = new C12P4(context);
        c12p4.setId(R.id.j4u);
        C786410Ut5.LJZI(8, c12p4);
        ViewGroup.LayoutParams layoutParamsLJ8 = a.LJ(-1, (int) TypedValue.applyDimension(1, 78.0f, resources.getDisplayMetrics()), videoViewCellRootView);
        new i();
        i.LIZ("app:tux_shadeColor", new a.b("2131099754", "attr"), c12p4);
        i.LIZ("app:tux_beginShadeOpacity", new a.c("0.18"), c12p4);
        i.LIZ("app:tux_endShadeOpacity", new a.c(CardStruct.IStatusCode.DEFAULT), c12p4);
        i.LIZ("app:tux_shader", new a.c("ease_in_out"), c12p4);
        i.LIZ("app:tux_style", new a.c("vertical"), c12p4);
        android.view.a.LIZ(c12p4);
        if (c12p4.getParent() == null) {
            videoViewCellRootView.addView(c12p4, layoutParamsLJ8);
        }
        ViewStub viewStub4 = new ViewStub(context);
        viewStub4.setId(R.id.bor);
        viewStub4.setLayoutResource(R.layout.b9_);
        ViewGroup.LayoutParams layoutParamsLJ9 = android.view.a.LJ(-1, -1, videoViewCellRootView);
        viewStub4.setInflatedId(-1);
        android.view.a.LIZ(viewStub4);
        if (viewStub4.getParent() == null) {
            videoViewCellRootView.addView(viewStub4, layoutParamsLJ9);
        }
        View c0rh0 = new C0RH0(context, null);
        c0rh0.setId(R.id.oqx);
        ViewGroup.LayoutParams layoutParamsLJ10 = android.view.a.LJ(-1, -1, videoViewCellRootView);
        android.view.a.LIZ(c0rh0);
        if (c0rh0.getParent() == null) {
            videoViewCellRootView.addView(c0rh0, layoutParamsLJ10);
        }
        View frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.qk5);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ2 = android.view.a.LJ(-1, -2, videoViewCellRootView);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            marginLayoutParamsLJ2.topMargin = (int) TypedValue.applyDimension(1, 78.0f, resources.getDisplayMetrics());
        }
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ2).gravity = 1;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ2).gravity = 1;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ2).gravity = 1;
        }
        android.view.a.LIZ(frameLayout);
        if (frameLayout.getParent() == null) {
            videoViewCellRootView.addView(frameLayout, marginLayoutParamsLJ2);
        }
        View viewLIZ2 = C20742916Ex.LIZ(context, R.layout.bb_, videoViewCellRootView, false, R.layout.b7p);
        viewLIZ2.setId(R.id.video_sticker_container_area);
        if (viewLIZ2.getParent() == null) {
            videoViewCellRootView.addView(viewLIZ2);
        }
        ViewStub viewStub5 = new ViewStub(context);
        viewStub5.setId(R.id.a9m);
        ViewGroup.LayoutParams layoutParamsLJ11 = android.view.a.LJ(-1, -1, videoViewCellRootView);
        viewStub5.setInflatedId(-1);
        android.view.a.LIZ(viewStub5);
        if (viewStub5.getParent() == null) {
            videoViewCellRootView.addView(viewStub5, layoutParamsLJ11);
        }
        ViewStub viewStub6 = new ViewStub(context);
        viewStub6.setId(R.id.nq7);
        ViewGroup.LayoutParams layoutParamsLJ12 = android.view.a.LJ(-1, -1, videoViewCellRootView);
        viewStub6.setInflatedId(-1);
        android.view.a.LIZ(viewStub6);
        if (viewStub6.getParent() == null) {
            videoViewCellRootView.addView(viewStub6, layoutParamsLJ12);
        }
        View c789490Uy3 = new C789490Uy3(context);
        c789490Uy3.setId(R.id.hs4);
        ViewGroup.LayoutParams layoutParamsLJ13 = android.view.a.LJ(-1, -1, videoViewCellRootView);
        android.view.a.LIZ(c789490Uy3);
        if (c789490Uy3.getParent() == null) {
            videoViewCellRootView.addView(c789490Uy3, layoutParamsLJ13);
        }
        ViewStub viewStub7 = new ViewStub(context);
        viewStub7.setId(R.id.hv5);
        ViewGroup.LayoutParams layoutParamsLJ14 = android.view.a.LJ(-2, -2, videoViewCellRootView);
        viewStub7.setInflatedId(-1);
        android.view.a.LIZ(viewStub7);
        if (viewStub7.getParent() == null) {
            videoViewCellRootView.addView(viewStub7, layoutParamsLJ14);
        }
        View c704220Rjo = new C704220Rjo(context);
        c704220Rjo.setId(R.id.j4r);
        C786410Ut5.LJLLLLLL(8, c704220Rjo);
        ViewGroup.LayoutParams layoutParamsLJ15 = android.view.a.LJ(-1, -1, videoViewCellRootView);
        android.view.a.LIZ(c704220Rjo);
        if (c704220Rjo.getParent() == null) {
            videoViewCellRootView.addView(c704220Rjo, layoutParamsLJ15);
        }
        View frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.dhz);
        ViewGroup.LayoutParams layoutParamsLJ16 = android.view.a.LJ(-1, -1, videoViewCellRootView);
        android.view.a.LIZ(frameLayout2);
        if (frameLayout2.getParent() == null) {
            videoViewCellRootView.addView(frameLayout2, layoutParamsLJ16);
        }
        ViewStub viewStub8 = new ViewStub(context);
        viewStub8.setId(R.id.aad);
        viewStub8.setLayoutResource(R.layout.b94);
        ViewGroup.LayoutParams layoutParamsLJ17 = android.view.a.LJ(-1, -1, videoViewCellRootView);
        viewStub8.setInflatedId(-1);
        android.view.a.LIZ(viewStub8);
        if (viewStub8.getParent() == null) {
            videoViewCellRootView.addView(viewStub8, layoutParamsLJ17);
        }
        View view2 = new View(context);
        view2.setId(R.id.gradual_bottom);
        view2.setBackgroundResource(R.drawable.b_k);
        ViewGroup.LayoutParams layoutParamsLJ18 = android.view.a.LJ(-1, (int) TypedValue.applyDimension(1, 90.0f, resources.getDisplayMetrics()), videoViewCellRootView);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParamsLJ18)) {
            ((LinearLayout.LayoutParams) layoutParamsLJ18).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParamsLJ18)) {
            ((FrameLayout.LayoutParams) layoutParamsLJ18).gravity = 80;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParamsLJ18)) {
            ((DrawerLayout$LayoutParams) layoutParamsLJ18).gravity = 80;
        }
        android.view.a.LIZ(view2);
        if (view2.getParent() == null) {
            videoViewCellRootView.addView(view2, layoutParamsLJ18);
        }
        View viewLIZ3 = C20742916Ex.LIZ(context, R.layout.b7j, videoViewCellRootView, false, R.layout.b7p);
        viewLIZ3.setId(R.id.widget_container);
        if (viewLIZ3.getParent() == null) {
            videoViewCellRootView.addView(viewLIZ3);
        }
        View frameLayout3 = new FrameLayout(context);
        frameLayout3.setId(R.id.qk6);
        ViewGroup.LayoutParams layoutParamsLJ19 = android.view.a.LJ(-1, -1, videoViewCellRootView);
        android.view.a.LIZ(frameLayout3);
        if (frameLayout3.getParent() == null) {
            videoViewCellRootView.addView(frameLayout3, layoutParamsLJ19);
        }
        View frameLayout4 = new FrameLayout(context);
        frameLayout4.setId(R.id.i66);
        C786410Ut5.LJLLLLLL(8, frameLayout4);
        ViewGroup.LayoutParams layoutParamsLJ20 = android.view.a.LJ(-1, -1, videoViewCellRootView);
        android.view.a.LIZ(frameLayout4);
        if (frameLayout4.getParent() == null) {
            videoViewCellRootView.addView(frameLayout4, layoutParamsLJ20);
        }
        View frameLayout5 = new FrameLayout(context);
        frameLayout5.setId(R.id.i9i);
        C786410Ut5.LJLLLLLL(8, frameLayout5);
        ViewGroup.LayoutParams layoutParamsLJ21 = android.view.a.LJ(-1, -1, videoViewCellRootView);
        android.view.a.LIZ(frameLayout5);
        if (frameLayout5.getParent() == null) {
            videoViewCellRootView.addView(frameLayout5, layoutParamsLJ21);
        }
        View frameLayout6 = new FrameLayout(context);
        frameLayout6.setId(R.id.a9e);
        ViewGroup.LayoutParams layoutParamsLJ22 = android.view.a.LJ(-1, -1, videoViewCellRootView);
        android.view.a.LIZ(frameLayout6);
        if (frameLayout6.getParent() == null) {
            videoViewCellRootView.addView(frameLayout6, layoutParamsLJ22);
        }
        C726240SeE c726240SeE = new C726240SeE(context);
        c726240SeE.setId(R.id.vs_micro_app_video_cardview);
        c726240SeE.setInflatedId(R.id.obb);
        c726240SeE.setLayoutResource(R.layout.b8h);
        c726240SeE.setExperimentImplementation(new ViewStubOptExperiment());
        ViewGroup.LayoutParams layoutParamsLJ23 = android.view.a.LJ((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), videoViewCellRootView);
        android.view.a.LIZ(c726240SeE);
        if (c726240SeE.getParent() == null) {
            videoViewCellRootView.addView(c726240SeE, layoutParamsLJ23);
        }
        View frameLayout7 = new FrameLayout(context);
        frameLayout7.setId(R.id.egq);
        C786410Ut5.LJLLLLLL(8, frameLayout7);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ3 = android.view.a.LJ((int) TypedValue.applyDimension(1, 272.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 139.0f, resources.getDisplayMetrics()), videoViewCellRootView);
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ3).gravity = 8388691;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ3).gravity = 8388691;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ3).gravity = 8388691;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            marginLayoutParamsLJ3.bottomMargin = (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics());
        }
        android.view.a.LIZ(frameLayout7);
        if (frameLayout7.getParent() == null) {
            videoViewCellRootView.addView(frameLayout7, marginLayoutParamsLJ3);
        }
        ViewStub viewStub9 = new ViewStub(context);
        viewStub9.setId(R.id.hsc);
        ViewGroup.LayoutParams layoutParamsLJ24 = android.view.a.LJ(-1, -1, videoViewCellRootView);
        viewStub9.setInflatedId(-1);
        android.view.a.LIZ(viewStub9);
        if (viewStub9.getParent() == null) {
            videoViewCellRootView.addView(viewStub9, layoutParamsLJ24);
        }
        ViewStub viewStub10 = new ViewStub(context);
        viewStub10.setId(R.id.dpj);
        ViewGroup.LayoutParams layoutParamsLJ25 = android.view.a.LJ(-1, -1, videoViewCellRootView);
        viewStub10.setInflatedId(-1);
        android.view.a.LIZ(viewStub10);
        if (viewStub10.getParent() == null) {
            videoViewCellRootView.addView(viewStub10, layoutParamsLJ25);
        }
        FrameLayout frameLayout8 = new FrameLayout(context);
        frameLayout8.setId(R.id.a94);
        ViewGroup.LayoutParams layoutParamsLJ26 = android.view.a.LJ(-1, -1, videoViewCellRootView);
        C726240SeE c726240SeE2 = new C726240SeE(context);
        c726240SeE2.setId(R.id.vs_feed_ad_layout);
        c726240SeE2.setInflatedId(R.id.hs8);
        c726240SeE2.setLayoutResource(R.layout.b7q);
        c726240SeE2.setExperimentImplementation(new ViewStubOptExperiment());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        android.view.a.LIZ(c726240SeE2);
        if (c726240SeE2.getParent() == null) {
            frameLayout8.addView(c726240SeE2, layoutParams);
        }
        ViewStub viewStub11 = new ViewStub(context);
        viewStub11.setId(R.id.view_stub_ad_mask);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        viewStub11.setInflatedId(-1);
        android.view.a.LIZ(viewStub11);
        if (viewStub11.getParent() == null) {
            frameLayout8.addView(viewStub11, layoutParams2);
        }
        android.view.a.LIZ(frameLayout8);
        if (frameLayout8.getParent() == null) {
            videoViewCellRootView.addView(frameLayout8, layoutParamsLJ26);
        }
        View frameLayout9 = new FrameLayout(context);
        frameLayout9.setId(R.id.hr4);
        C786410Ut5.LJLLLLLL(8, frameLayout9);
        ViewGroup.LayoutParams layoutParamsLJ27 = android.view.a.LJ(-1, -1, videoViewCellRootView);
        android.view.a.LIZ(frameLayout9);
        if (frameLayout9.getParent() == null) {
            videoViewCellRootView.addView(frameLayout9, layoutParamsLJ27);
        }
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(R.id.hpp);
        ViewGroup.LayoutParams layoutParamsLJ28 = android.view.a.LJ(-1, -2, videoViewCellRootView);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R.id.hpq);
        appCompatImageView.setPadding((int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics()));
        C19ME c19me = new C19ME((int) TypedValue.applyDimension(1, 52.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 52.0f, resources.getDisplayMetrics()));
        if (C19ME.class.isInstance(c19me)) {
            c19me.bottomToBottom = 0;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.endToEnd = 0;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.topToTop = 0;
        }
        android.view.a.LIZ(appCompatImageView);
        if (appCompatImageView.getParent() == null) {
            constraintLayout.addView(appCompatImageView, c19me);
        }
        android.view.a.LIZ(constraintLayout);
        if (constraintLayout.getParent() == null) {
            videoViewCellRootView.addView(constraintLayout, layoutParamsLJ28);
        }
        ViewStub viewStub12 = new ViewStub(context);
        viewStub12.setId(R.id.hv7);
        ViewGroup.LayoutParams layoutParamsLJ29 = android.view.a.LJ(-1, -1, videoViewCellRootView);
        viewStub12.setInflatedId(-1);
        android.view.a.LIZ(viewStub12);
        if (viewStub12.getParent() == null) {
            videoViewCellRootView.addView(viewStub12, layoutParamsLJ29);
        }
        ViewStub viewStub13 = new ViewStub(context);
        viewStub13.setId(R.id.ihz);
        viewStub13.setLayoutResource(R.layout.b9e);
        ViewGroup.LayoutParams layoutParamsLJ30 = android.view.a.LJ(-1, -1, videoViewCellRootView);
        viewStub13.setInflatedId(-1);
        android.view.a.LIZ(viewStub13);
        if (viewStub13.getParent() == null) {
            videoViewCellRootView.addView(viewStub13, layoutParamsLJ30);
        }
        ViewStub viewStub14 = new ViewStub(context);
        viewStub14.setId(R.id.nuc);
        viewStub14.setLayoutResource(R.layout.b_e);
        ViewGroup.LayoutParams layoutParamsLJ31 = android.view.a.LJ(-1, -1, videoViewCellRootView);
        viewStub14.setInflatedId(-1);
        android.view.a.LIZ(viewStub14);
        if (viewStub14.getParent() == null) {
            videoViewCellRootView.addView(viewStub14, layoutParamsLJ31);
        }
        C726240SeE c726240SeE3 = new C726240SeE(context);
        c726240SeE3.setId(R.id.vs_tv_schedule_video_watermark);
        c726240SeE3.setInflatedId(R.id.tv_schedule_video_watermark);
        c726240SeE3.setLayoutResource(R.layout.bbl);
        c726240SeE3.setExperimentImplementation(new ViewStubOptExperimentV2());
        ViewGroup.LayoutParams layoutParamsLJ32 = android.view.a.LJ((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), videoViewCellRootView);
        android.view.a.LIZ(c726240SeE3);
        if (c726240SeE3.getParent() == null) {
            videoViewCellRootView.addView(c726240SeE3, layoutParamsLJ32);
        }
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context);
        appCompatImageView2.setId(R.id.qmw);
        C786410Ut5.T4(appCompatImageView2, 0.0f);
        appCompatImageView2.setImageResource(R.drawable.cfs);
        C786410Ut5.LJZI(8, appCompatImageView2);
        ViewGroup.LayoutParams layoutParamsLJ33 = android.view.a.LJ(-2, -2, videoViewCellRootView);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParamsLJ33)) {
            ((LinearLayout.LayoutParams) layoutParamsLJ33).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParamsLJ33)) {
            ((FrameLayout.LayoutParams) layoutParamsLJ33).gravity = 17;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParamsLJ33)) {
            ((DrawerLayout$LayoutParams) layoutParamsLJ33).gravity = 17;
        }
        android.view.a.LIZ(appCompatImageView2);
        if (appCompatImageView2.getParent() == null) {
            videoViewCellRootView.addView(appCompatImageView2, layoutParamsLJ33);
        }
        View c417130GXf = new C417130GXf(context, null, 6);
        c417130GXf.setId(R.id.dts);
        C786410Ut5.LJLLLLLL(8, c417130GXf);
        ViewGroup.LayoutParams layoutParamsLJ34 = android.view.a.LJ((int) TypedValue.applyDimension(1, 64.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 64.0f, resources.getDisplayMetrics()), videoViewCellRootView);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParamsLJ34)) {
            ((LinearLayout.LayoutParams) layoutParamsLJ34).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParamsLJ34)) {
            ((FrameLayout.LayoutParams) layoutParamsLJ34).gravity = 17;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParamsLJ34)) {
            ((DrawerLayout$LayoutParams) layoutParamsLJ34).gravity = 17;
        }
        android.view.a.LIZ(c417130GXf);
        if (c417130GXf.getParent() == null) {
            videoViewCellRootView.addView(c417130GXf, layoutParamsLJ34);
        }
        ViewStub viewStub15 = new ViewStub(context);
        viewStub15.setId(R.id.z7);
        viewStub15.setLayoutResource(R.layout.b4n);
        ViewGroup.LayoutParams layoutParamsLJ35 = android.view.a.LJ(-1, -1, videoViewCellRootView);
        viewStub15.setInflatedId(-1);
        android.view.a.LIZ(viewStub15);
        if (viewStub15.getParent() == null) {
            videoViewCellRootView.addView(viewStub15, layoutParamsLJ35);
        }
        ViewStub viewStub16 = new ViewStub(context);
        viewStub16.setId(R.id.egl);
        ViewGroup.LayoutParams layoutParamsLJ36 = android.view.a.LJ(-1, -1, videoViewCellRootView);
        viewStub16.setInflatedId(-1);
        android.view.a.LIZ(viewStub16);
        if (viewStub16.getParent() == null) {
            videoViewCellRootView.addView(viewStub16, layoutParamsLJ36);
        }
        ViewStub viewStub17 = new ViewStub(context);
        viewStub17.setId(R.id.efd);
        ViewGroup.LayoutParams layoutParamsLJ37 = android.view.a.LJ(-1, -1, videoViewCellRootView);
        viewStub17.setInflatedId(-1);
        android.view.a.LIZ(viewStub17);
        if (viewStub17.getParent() == null) {
            videoViewCellRootView.addView(viewStub17, layoutParamsLJ37);
        }
        ViewStub viewStub18 = new ViewStub(context);
        viewStub18.setId(R.id.j5m);
        viewStub18.setLayoutResource(R.layout.b9d);
        ViewGroup.LayoutParams layoutParamsLJ38 = android.view.a.LJ(-1, -1, videoViewCellRootView);
        viewStub18.setInflatedId(-1);
        android.view.a.LIZ(viewStub18);
        if (viewStub18.getParent() == null) {
            videoViewCellRootView.addView(viewStub18, layoutParamsLJ38);
        }
        ViewStub viewStub19 = new ViewStub(context);
        viewStub19.setId(R.id.wqv);
        viewStub19.setLayoutResource(R.layout.b9c);
        ViewGroup.LayoutParams layoutParamsLJ39 = android.view.a.LJ(-1, -1, videoViewCellRootView);
        viewStub19.setInflatedId(-1);
        android.view.a.LIZ(viewStub19);
        if (viewStub19.getParent() == null) {
            videoViewCellRootView.addView(viewStub19, layoutParamsLJ39);
        }
        ViewStub viewStub20 = new ViewStub(context);
        viewStub20.setId(R.id.kwq);
        viewStub20.setLayoutResource(R.layout.f878b7k);
        ViewGroup.LayoutParams layoutParamsLJ40 = android.view.a.LJ(-1, -1, videoViewCellRootView);
        viewStub20.setInflatedId(-1);
        android.view.a.LIZ(viewStub20);
        if (viewStub20.getParent() == null) {
            videoViewCellRootView.addView(viewStub20, layoutParamsLJ40);
        }
        ViewStub viewStub21 = new ViewStub(context);
        viewStub21.setId(R.id.t1z);
        viewStub21.setLayoutResource(R.layout.fwv);
        ViewGroup.LayoutParams layoutParamsLJ41 = android.view.a.LJ(-1, -1, videoViewCellRootView);
        viewStub21.setInflatedId(-1);
        android.view.a.LIZ(viewStub21);
        if (viewStub21.getParent() == null) {
            videoViewCellRootView.addView(viewStub21, layoutParamsLJ41);
        }
        ViewStub viewStub22 = new ViewStub(context);
        viewStub22.setId(R.id.kkk);
        viewStub22.setLayoutResource(R.layout.fwj);
        ViewGroup.LayoutParams layoutParamsLJ42 = android.view.a.LJ(-1, -1, videoViewCellRootView);
        viewStub22.setInflatedId(-1);
        android.view.a.LIZ(viewStub22);
        if (viewStub22.getParent() == null) {
            videoViewCellRootView.addView(viewStub22, layoutParamsLJ42);
        }
        ViewStub viewStub23 = new ViewStub(context);
        viewStub23.setId(R.id.uiu);
        viewStub23.setLayoutResource(R.layout.fwv);
        ViewGroup.LayoutParams layoutParamsLJ43 = android.view.a.LJ(-1, -1, videoViewCellRootView);
        viewStub23.setInflatedId(-1);
        android.view.a.LIZ(viewStub23);
        if (viewStub23.getParent() == null) {
            videoViewCellRootView.addView(viewStub23, layoutParamsLJ43);
        }
        ViewStub viewStub24 = new ViewStub(context);
        viewStub24.setId(R.id.dkb);
        viewStub24.setLayoutResource(R.layout.fs4);
        ViewGroup.LayoutParams layoutParamsLJ44 = android.view.a.LJ(-1, -1, videoViewCellRootView);
        viewStub24.setInflatedId(-1);
        android.view.a.LIZ(viewStub24);
        if (viewStub24.getParent() == null) {
            videoViewCellRootView.addView(viewStub24, layoutParamsLJ44);
        }
        ViewStub viewStub25 = new ViewStub(context);
        viewStub25.setId(R.id.t45);
        ViewGroup.LayoutParams layoutParamsLJ45 = android.view.a.LJ(-1, -1, videoViewCellRootView);
        viewStub25.setInflatedId(-1);
        android.view.a.LIZ(viewStub25);
        if (viewStub25.getParent() == null) {
            videoViewCellRootView.addView(viewStub25, layoutParamsLJ45);
        }
        View view3 = new View(context);
        view3.setId(R.id.val);
        C786410Ut5.T4(view3, 0.0f);
        TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.e1});
        view3.setBackgroundColor(typedArrayObtainStyledAttributes2.getColor(0, 0));
        typedArrayObtainStyledAttributes2.recycle();
        ViewGroup.LayoutParams layoutParamsLJ46 = android.view.a.LJ(-1, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), videoViewCellRootView);
        android.view.a.LIZ(view3);
        if (view3.getParent() == null) {
            videoViewCellRootView.addView(view3, layoutParamsLJ46);
        }
        View frameLayout10 = new FrameLayout(context);
        frameLayout10.setId(R.id.video_hot_swap_paywall_view);
        ViewGroup.LayoutParams layoutParamsLJ47 = android.view.a.LJ(-1, -1, videoViewCellRootView);
        android.view.a.LIZ(frameLayout10);
        if (frameLayout10.getParent() == null) {
            videoViewCellRootView.addView(frameLayout10, layoutParamsLJ47);
        }
        View frameLayout11 = new FrameLayout(context);
        frameLayout11.setId(R.id.video_hot_swap_overlay_view);
        ViewGroup.LayoutParams layoutParamsLJ48 = android.view.a.LJ(-1, -1, videoViewCellRootView);
        android.view.a.LIZ(frameLayout11);
        if (frameLayout11.getParent() == null) {
            videoViewCellRootView.addView(frameLayout11, layoutParamsLJ48);
        }
        ViewStub viewStub26 = new ViewStub(context);
        viewStub26.setId(R.id.vs_sub_only_overlay);
        viewStub26.setLayoutResource(R.layout.bah);
        ViewGroup.LayoutParams layoutParamsLJ49 = android.view.a.LJ(-1, -1, videoViewCellRootView);
        viewStub26.setInflatedId(-1);
        android.view.a.LIZ(viewStub26);
        if (viewStub26.getParent() == null) {
            videoViewCellRootView.addView(viewStub26, layoutParamsLJ49);
        }
        View view4 = new View(context);
        view4.setId(R.id.f706g1c);
        C786410Ut5.LJLLLLLL(8, view4);
        view4.setBackgroundResource(R.drawable.bas);
        ViewGroup.LayoutParams layoutParamsLJ50 = android.view.a.LJ(-1, (int) TypedValue.applyDimension(1, 126.0f, resources.getDisplayMetrics()), videoViewCellRootView);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParamsLJ50)) {
            i = 48;
            ((LinearLayout.LayoutParams) layoutParamsLJ50).gravity = 48;
        } else {
            i = 48;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParamsLJ50)) {
            ((FrameLayout.LayoutParams) layoutParamsLJ50).gravity = i;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParamsLJ50)) {
            ((DrawerLayout$LayoutParams) layoutParamsLJ50).gravity = i;
        }
        android.view.a.LIZ(view4);
        if (view4.getParent() == null) {
            videoViewCellRootView.addView(view4, layoutParamsLJ50);
        }
        android.view.a.LIZ(videoViewCellRootView);
        C786410Ut5.W5(videoViewCellRootView, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(videoViewCellRootView);
        }
        return videoViewCellRootView;
    }
}
