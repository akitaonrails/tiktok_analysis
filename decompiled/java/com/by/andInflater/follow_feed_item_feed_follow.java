package com.by.andInflater;

import X.C0RH0;
import X.C0SUL;
import X.C20742916Ex;
import X.C704220Rjo;
import X.C714400S0o;
import X.C726240SeE;
import X.C786410Ut5;
import X.C789490Uy3;
import X.InterfaceC20742716Ev;
import X.InterfaceC725980Sdo;
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
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.ss.android.ugc.aweme.experiment.FollowFeedCombineOptimizeExpObject;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.feed.VideoViewCellRootView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes12.dex */
public class follow_feed_item_feed_follow implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        VideoViewCellRootView videoViewCellRootView = new VideoViewCellRootView(context);
        videoViewCellRootView.setId(R.id.view_rootview);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.e1});
        videoViewCellRootView.setBackgroundColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -1, viewGroup);
        View c0sul = new C0SUL(context, null);
        c0sul.setId(R.id.long_press_layout);
        ViewGroup.LayoutParams layoutParamsLJ = a.LJ(-1, -1, videoViewCellRootView);
        a.LIZ(c0sul);
        if (c0sul.getParent() == null) {
            videoViewCellRootView.addView(c0sul, layoutParamsLJ);
        }
        View c714400S0o = new C714400S0o(context, null);
        c714400S0o.setId(R.id.player_view_pager);
        C786410Ut5.LJLLLLLL(8, c714400S0o);
        ViewGroup.LayoutParams layoutParamsLJ2 = a.LJ(-1, -1, videoViewCellRootView);
        a.LIZ(c714400S0o);
        if (c714400S0o.getParent() == null) {
            videoViewCellRootView.addView(c714400S0o, layoutParamsLJ2);
        }
        View viewLIZ = C20742916Ex.LIZ(context, R.layout.bb7, videoViewCellRootView, false, R.layout.c7v);
        viewLIZ.setId(R.id.video_container_area);
        if (viewLIZ.getParent() == null) {
            videoViewCellRootView.addView(viewLIZ);
        }
        View view = new View(context);
        view.setId(R.id.gradual_top);
        view.setBackgroundResource(R.drawable.b_l);
        ViewGroup.LayoutParams layoutParamsLJ3 = a.LJ(-1, (int) TypedValue.applyDimension(1, 108.0f, resources.getDisplayMetrics()), videoViewCellRootView);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParamsLJ3)) {
            ((LinearLayout.LayoutParams) layoutParamsLJ3).gravity = 48;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParamsLJ3)) {
            ((FrameLayout.LayoutParams) layoutParamsLJ3).gravity = 48;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParamsLJ3)) {
            ((DrawerLayout$LayoutParams) layoutParamsLJ3).gravity = 48;
        }
        a.LIZ(view);
        if (view.getParent() == null) {
            videoViewCellRootView.addView(view, layoutParamsLJ3);
        }
        View c0rh0 = new C0RH0(context, null);
        c0rh0.setId(R.id.oqx);
        ViewGroup.LayoutParams layoutParamsLJ4 = a.LJ(-1, -1, videoViewCellRootView);
        a.LIZ(c0rh0);
        if (c0rh0.getParent() == null) {
            videoViewCellRootView.addView(c0rh0, layoutParamsLJ4);
        }
        View frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.qk5);
        ViewGroup.LayoutParams layoutParamsLJ5 = a.LJ(-1, -2, videoViewCellRootView);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParamsLJ5)) {
            ((LinearLayout.LayoutParams) layoutParamsLJ5).gravity = 1;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParamsLJ5)) {
            ((FrameLayout.LayoutParams) layoutParamsLJ5).gravity = 1;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParamsLJ5)) {
            ((DrawerLayout$LayoutParams) layoutParamsLJ5).gravity = 1;
        }
        a.LIZ(frameLayout);
        if (frameLayout.getParent() == null) {
            videoViewCellRootView.addView(frameLayout, layoutParamsLJ5);
        }
        View viewLIZ2 = C20742916Ex.LIZ(context, R.layout.bb_, videoViewCellRootView, false, R.layout.c7v);
        viewLIZ2.setId(R.id.video_sticker_container_area);
        if (viewLIZ2.getParent() == null) {
            videoViewCellRootView.addView(viewLIZ2);
        }
        C726240SeE c726240SeE = new C726240SeE(context);
        c726240SeE.setExperimentImplementation(new InterfaceC725980Sdo() { // from class: X.07Jt
            @Override // X.InterfaceC725980Sdo
            public final boolean hit() {
                return FollowFeedCombineOptimizeExpObject.INSTANCE.isHit();
            }
        });
        c726240SeE.setId(R.id.vs_hud_view);
        c726240SeE.setInflatedId(R.id.jtf);
        c726240SeE.setLayoutResource(R.layout.ib3);
        ViewGroup.LayoutParams layoutParamsLJ6 = a.LJ((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), videoViewCellRootView);
        a.LIZ(c726240SeE);
        if (c726240SeE.getParent() == null) {
            videoViewCellRootView.addView(c726240SeE, layoutParamsLJ6);
        }
        C726240SeE c726240SeE2 = new C726240SeE(context);
        c726240SeE2.setExperimentImplementation(new InterfaceC725980Sdo() { // from class: X.07Jt
            @Override // X.InterfaceC725980Sdo
            public final boolean hit() {
                return FollowFeedCombineOptimizeExpObject.INSTANCE.isHit();
            }
        });
        c726240SeE2.setId(R.id.vs_xigua_task_evening_iv);
        c726240SeE2.setInflatedId(R.id.xigua_task_evening_iv);
        c726240SeE2.setLayoutResource(R.layout.ib4);
        ViewGroup.LayoutParams layoutParamsLJ7 = a.LJ((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), videoViewCellRootView);
        a.LIZ(c726240SeE2);
        if (c726240SeE2.getParent() == null) {
            videoViewCellRootView.addView(c726240SeE2, layoutParamsLJ7);
        }
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(R.id.a9m);
        ViewGroup.LayoutParams layoutParamsLJ8 = a.LJ(-1, -1, videoViewCellRootView);
        viewStub.setInflatedId(-1);
        a.LIZ(viewStub);
        if (viewStub.getParent() == null) {
            videoViewCellRootView.addView(viewStub, layoutParamsLJ8);
        }
        ViewStub viewStub2 = new ViewStub(context);
        viewStub2.setId(R.id.nq7);
        ViewGroup.LayoutParams layoutParamsLJ9 = a.LJ(-1, -1, videoViewCellRootView);
        viewStub2.setInflatedId(-1);
        a.LIZ(viewStub2);
        if (viewStub2.getParent() == null) {
            videoViewCellRootView.addView(viewStub2, layoutParamsLJ9);
        }
        View c789490Uy3 = new C789490Uy3(context);
        c789490Uy3.setId(R.id.hs4);
        ViewGroup.LayoutParams layoutParamsLJ10 = a.LJ(-1, -1, videoViewCellRootView);
        a.LIZ(c789490Uy3);
        if (c789490Uy3.getParent() == null) {
            videoViewCellRootView.addView(c789490Uy3, layoutParamsLJ10);
        }
        ViewStub viewStub3 = new ViewStub(context);
        viewStub3.setId(R.id.hv5);
        ViewGroup.LayoutParams layoutParamsLJ11 = a.LJ(-2, -2, videoViewCellRootView);
        viewStub3.setInflatedId(-1);
        a.LIZ(viewStub3);
        if (viewStub3.getParent() == null) {
            videoViewCellRootView.addView(viewStub3, layoutParamsLJ11);
        }
        View c704220Rjo = new C704220Rjo(context);
        c704220Rjo.setId(R.id.j4r);
        C786410Ut5.LJLLLLLL(8, c704220Rjo);
        ViewGroup.LayoutParams layoutParamsLJ12 = a.LJ(-1, -1, videoViewCellRootView);
        a.LIZ(c704220Rjo);
        if (c704220Rjo.getParent() == null) {
            videoViewCellRootView.addView(c704220Rjo, layoutParamsLJ12);
        }
        View frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.dhz);
        ViewGroup.LayoutParams layoutParamsLJ13 = a.LJ(-1, -1, videoViewCellRootView);
        a.LIZ(frameLayout2);
        if (frameLayout2.getParent() == null) {
            videoViewCellRootView.addView(frameLayout2, layoutParamsLJ13);
        }
        ViewStub viewStub4 = new ViewStub(context);
        viewStub4.setId(R.id.aad);
        viewStub4.setLayoutResource(R.layout.b94);
        ViewGroup.LayoutParams layoutParamsLJ14 = a.LJ(-1, -1, videoViewCellRootView);
        viewStub4.setInflatedId(-1);
        a.LIZ(viewStub4);
        if (viewStub4.getParent() == null) {
            videoViewCellRootView.addView(viewStub4, layoutParamsLJ14);
        }
        View view2 = new View(context);
        view2.setId(R.id.gradual_bottom);
        view2.setBackgroundResource(R.drawable.b_k);
        ViewGroup.LayoutParams layoutParamsLJ15 = a.LJ(-1, (int) TypedValue.applyDimension(1, 90.0f, resources.getDisplayMetrics()), videoViewCellRootView);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParamsLJ15)) {
            ((LinearLayout.LayoutParams) layoutParamsLJ15).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParamsLJ15)) {
            ((FrameLayout.LayoutParams) layoutParamsLJ15).gravity = 80;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParamsLJ15)) {
            ((DrawerLayout$LayoutParams) layoutParamsLJ15).gravity = 80;
        }
        a.LIZ(view2);
        if (view2.getParent() == null) {
            videoViewCellRootView.addView(view2, layoutParamsLJ15);
        }
        View frameLayout3 = new FrameLayout(context);
        frameLayout3.setId(R.id.jce);
        C786410Ut5.LJLLLLLL(8, frameLayout3);
        ViewGroup.LayoutParams layoutParamsLJ16 = a.LJ(-1, -1, videoViewCellRootView);
        a.LIZ(frameLayout3);
        if (frameLayout3.getParent() == null) {
            videoViewCellRootView.addView(frameLayout3, layoutParamsLJ16);
        }
        View viewLIZ3 = C20742916Ex.LIZ(context, R.layout.b7j, videoViewCellRootView, false, R.layout.c7v);
        viewLIZ3.setId(R.id.widget_container);
        if (viewLIZ3.getParent() == null) {
            videoViewCellRootView.addView(viewLIZ3);
        }
        View frameLayout4 = new FrameLayout(context);
        frameLayout4.setId(R.id.qk6);
        ViewGroup.LayoutParams layoutParamsLJ17 = a.LJ(-1, -1, videoViewCellRootView);
        a.LIZ(frameLayout4);
        if (frameLayout4.getParent() == null) {
            videoViewCellRootView.addView(frameLayout4, layoutParamsLJ17);
        }
        C726240SeE c726240SeE3 = new C726240SeE(context);
        c726240SeE3.setId(R.id.vs_micro_app_video_cardview);
        c726240SeE3.setInflatedId(R.id.obb);
        c726240SeE3.setLayoutResource(R.layout.b8h);
        c726240SeE3.setExperimentImplementation(new FollowFeedViewStubExperiment());
        ViewGroup.LayoutParams layoutParamsLJ18 = a.LJ((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), videoViewCellRootView);
        a.LIZ(c726240SeE3);
        if (c726240SeE3.getParent() == null) {
            videoViewCellRootView.addView(c726240SeE3, layoutParamsLJ18);
        }
        View frameLayout5 = new FrameLayout(context);
        frameLayout5.setId(R.id.egq);
        C786410Ut5.LJLLLLLL(8, frameLayout5);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ2 = a.LJ((int) TypedValue.applyDimension(1, 272.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 139.0f, resources.getDisplayMetrics()), videoViewCellRootView);
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ2).gravity = 8388691;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ2).gravity = 8388691;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ2).gravity = 8388691;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            marginLayoutParamsLJ2.bottomMargin = (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics());
        }
        a.LIZ(frameLayout5);
        if (frameLayout5.getParent() == null) {
            videoViewCellRootView.addView(frameLayout5, marginLayoutParamsLJ2);
        }
        ViewStub viewStub5 = new ViewStub(context);
        viewStub5.setId(R.id.hsc);
        ViewGroup.LayoutParams layoutParamsLJ19 = a.LJ(-1, -1, videoViewCellRootView);
        viewStub5.setInflatedId(-1);
        a.LIZ(viewStub5);
        if (viewStub5.getParent() == null) {
            videoViewCellRootView.addView(viewStub5, layoutParamsLJ19);
        }
        FrameLayout frameLayout6 = new FrameLayout(context);
        frameLayout6.setId(R.id.a94);
        ViewGroup.LayoutParams layoutParamsLJ20 = a.LJ(-1, -1, videoViewCellRootView);
        C726240SeE c726240SeE4 = new C726240SeE(context);
        c726240SeE4.setExperimentImplementation(new InterfaceC725980Sdo() { // from class: X.07Jt
            @Override // X.InterfaceC725980Sdo
            public final boolean hit() {
                return FollowFeedCombineOptimizeExpObject.INSTANCE.isHit();
            }
        });
        c726240SeE4.setId(R.id.vs_feed_ad_layout);
        c726240SeE4.setInflatedId(R.id.hs8);
        c726240SeE4.setLayoutResource(R.layout.b7q);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        a.LIZ(c726240SeE4);
        if (c726240SeE4.getParent() == null) {
            frameLayout6.addView(c726240SeE4, layoutParams);
        }
        ViewStub viewStub6 = new ViewStub(context);
        viewStub6.setId(R.id.view_stub_ad_mask);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        viewStub6.setInflatedId(-1);
        a.LIZ(viewStub6);
        if (viewStub6.getParent() == null) {
            frameLayout6.addView(viewStub6, layoutParams2);
        }
        a.LIZ(frameLayout6);
        if (frameLayout6.getParent() == null) {
            videoViewCellRootView.addView(frameLayout6, layoutParamsLJ20);
        }
        View frameLayout7 = new FrameLayout(context);
        frameLayout7.setId(R.id.hr4);
        C786410Ut5.LJLLLLLL(8, frameLayout7);
        ViewGroup.LayoutParams layoutParamsLJ21 = a.LJ(-1, -1, videoViewCellRootView);
        a.LIZ(frameLayout7);
        if (frameLayout7.getParent() == null) {
            videoViewCellRootView.addView(frameLayout7, layoutParamsLJ21);
        }
        ViewStub viewStub7 = new ViewStub(context);
        viewStub7.setId(R.id.hv7);
        ViewGroup.LayoutParams layoutParamsLJ22 = a.LJ(-1, -1, videoViewCellRootView);
        viewStub7.setInflatedId(-1);
        a.LIZ(viewStub7);
        if (viewStub7.getParent() == null) {
            videoViewCellRootView.addView(viewStub7, layoutParamsLJ22);
        }
        ViewStub viewStub8 = new ViewStub(context);
        viewStub8.setId(R.id.ihz);
        viewStub8.setLayoutResource(R.layout.b9e);
        ViewGroup.LayoutParams layoutParamsLJ23 = a.LJ(-1, -1, videoViewCellRootView);
        viewStub8.setInflatedId(-1);
        a.LIZ(viewStub8);
        if (viewStub8.getParent() == null) {
            videoViewCellRootView.addView(viewStub8, layoutParamsLJ23);
        }
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R.id.qmw);
        C786410Ut5.T4(appCompatImageView, 0.0f);
        appCompatImageView.setImageResource(R.drawable.cfs);
        C786410Ut5.LJZI(8, appCompatImageView);
        ViewGroup.LayoutParams layoutParamsLJ24 = a.LJ(-2, -2, videoViewCellRootView);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParamsLJ24)) {
            ((LinearLayout.LayoutParams) layoutParamsLJ24).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParamsLJ24)) {
            ((FrameLayout.LayoutParams) layoutParamsLJ24).gravity = 17;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParamsLJ24)) {
            ((DrawerLayout$LayoutParams) layoutParamsLJ24).gravity = 17;
        }
        a.LIZ(appCompatImageView);
        if (appCompatImageView.getParent() == null) {
            videoViewCellRootView.addView(appCompatImageView, layoutParamsLJ24);
        }
        ViewStub viewStub9 = new ViewStub(context);
        viewStub9.setId(R.id.z7);
        viewStub9.setLayoutResource(R.layout.b4n);
        ViewGroup.LayoutParams layoutParamsLJ25 = a.LJ(-1, -1, videoViewCellRootView);
        viewStub9.setInflatedId(-1);
        a.LIZ(viewStub9);
        if (viewStub9.getParent() == null) {
            videoViewCellRootView.addView(viewStub9, layoutParamsLJ25);
        }
        ViewStub viewStub10 = new ViewStub(context);
        viewStub10.setId(R.id.j5m);
        viewStub10.setLayoutResource(R.layout.b9d);
        ViewGroup.LayoutParams layoutParamsLJ26 = a.LJ(-1, -1, videoViewCellRootView);
        viewStub10.setInflatedId(-1);
        a.LIZ(viewStub10);
        if (viewStub10.getParent() == null) {
            videoViewCellRootView.addView(viewStub10, layoutParamsLJ26);
        }
        View view3 = new View(context);
        view3.setId(R.id.val);
        C786410Ut5.T4(view3, 0.0f);
        TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.e1});
        view3.setBackgroundColor(typedArrayObtainStyledAttributes2.getColor(0, 0));
        typedArrayObtainStyledAttributes2.recycle();
        ViewGroup.LayoutParams layoutParamsLJ27 = a.LJ(-1, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), videoViewCellRootView);
        a.LIZ(view3);
        if (view3.getParent() == null) {
            videoViewCellRootView.addView(view3, layoutParamsLJ27);
        }
        a.LIZ(videoViewCellRootView);
        C786410Ut5.W5(videoViewCellRootView, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(videoViewCellRootView);
        }
        return videoViewCellRootView;
    }
}
