package com.by.andInflater;

import X.C0JAD;
import X.C0JAE;
import X.C1591930rWp;
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
import android.widget.RelativeLayout;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBarMaskView;
import com.ss.android.ugc.aweme.ui.FragmentTabHost;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.i;
import xem.o;

/* JADX INFO: loaded from: classes8.dex */
public class homepage_common_fragment_main_page_opt implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        FragmentTabHost fragmentTabHost = new FragmentTabHost(context);
        fragmentTabHost.setId(R.id.nx0);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -1, viewGroup);
        VideoSeekBarMaskView videoSeekBarMaskView = new VideoSeekBarMaskView(context, null);
        videoSeekBarMaskView.setId(R.id.nwj);
        videoSeekBarMaskView.setBackgroundDrawable(null);
        ViewGroup.LayoutParams layoutParamsLJ = a.LJ(-1, -1, fragmentTabHost);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.wxd);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ2 = a.LJ(-1, -1, videoSeekBarMaskView);
        a.LIZ(frameLayout);
        if (frameLayout.getParent() == null) {
            videoSeekBarMaskView.addView(frameLayout, marginLayoutParamsLJ2);
        }
        View view = new View(context);
        view.setId(R.id.ch9);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.zj});
        view.setBackgroundColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ3 = a.LJ(-1, (int) TypedValue.applyDimension(1, 0.5f, resources.getDisplayMetrics()), videoSeekBarMaskView);
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ3).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ3).gravity = 80;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ3).gravity = 80;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            marginLayoutParamsLJ3.bottomMargin = (int) TypedValue.applyDimension(1, 47.0f, resources.getDisplayMetrics());
        }
        a.LIZ(view);
        if (view.getParent() == null) {
            videoSeekBarMaskView.addView(view, marginLayoutParamsLJ3);
        }
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(R.id.f2g);
        viewStub.setLayoutResource(R.layout.cd6);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ4 = a.LJ(-2, -2, videoSeekBarMaskView);
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ4)) {
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ4).gravity = 8388693;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ4)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ4).gravity = 8388693;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ4)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ4).gravity = 8388693;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ4)) {
            marginLayoutParamsLJ4.bottomMargin = (int) TypedValue.applyDimension(1, 45.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ4)) {
            marginLayoutParamsLJ4.setMarginEnd((int) TypedValue.applyDimension(1, 13.0f, resources.getDisplayMetrics()));
        }
        viewStub.setInflatedId(-1);
        a.LIZ(viewStub);
        if (viewStub.getParent() == null) {
            videoSeekBarMaskView.addView(viewStub, marginLayoutParamsLJ4);
        }
        C1591930rWp c1591930rWp = new C1591930rWp(context);
        c1591930rWp.setId(R.id.nwe);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ5 = a.LJ(-1, (int) resources.getDimension(R.dimen.a3q), videoSeekBarMaskView);
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ5)) {
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ5).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ5)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ5).gravity = 80;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ5)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ5).gravity = 80;
        }
        a.LIZ(c1591930rWp);
        if (c1591930rWp.getParent() == null) {
            videoSeekBarMaskView.addView(c1591930rWp, marginLayoutParamsLJ5);
        }
        C0JAD c0jad = new C0JAD(context);
        c0jad.setId(R.id.khx);
        c0jad.setInflater(new C0JAE() { // from class: X.0JA4
            @Override // X.C0JAE
            public final View LIZ(Context context2, ViewGroup viewGroup2, ViewGroup.LayoutParams layoutParams) {
                context2.getResources();
                FrameLayout frameLayout2 = new FrameLayout(context2);
                frameLayout2.setId(R.id.khx);
                C786410Ut5.LJLLLLLL(8, frameLayout2);
                a.LIZ(frameLayout2);
                return frameLayout2;
            }
        });
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ6 = a.LJ(-1, (int) resources.getDimension(R.dimen.t0), videoSeekBarMaskView);
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ6)) {
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ6).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ6)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ6).gravity = 80;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ6)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ6).gravity = 80;
        }
        if (c0jad.getParent() == null) {
            videoSeekBarMaskView.addView(c0jad, marginLayoutParamsLJ6);
        }
        C0JAD c0jad2 = new C0JAD(context);
        c0jad2.setId(R.id.video_seek_duration_mask);
        c0jad2.setInflater(new C0JAE() { // from class: X.16Eo
            @Override // X.C0JAE
            public final View LIZ(Context context2, ViewGroup viewGroup2, ViewGroup.LayoutParams layoutParams) {
                context2.getResources();
                C12P4 c12p4 = new C12P4(context2);
                c12p4.setId(R.id.video_seek_duration_mask);
                C786410Ut5.LJZI(8, c12p4);
                new i();
                i.LIZ("app:tux_shadeColor", new a.b("2131099754", "attr"), c12p4);
                i.LIZ("app:tux_beginShadeOpacity", new a.c(CardStruct.IStatusCode.DEFAULT), c12p4);
                i.LIZ("app:tux_endShadeOpacity", new a.c("0.18"), c12p4);
                i.LIZ("app:tux_shader", new a.c("ease_in_out"), c12p4);
                i.LIZ("app:tux_style", new a.c("vertical"), c12p4);
                android.view.a.LIZ(c12p4);
                return c12p4;
            }
        });
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ7 = android.view.a.LJ(-1, (int) TypedValue.applyDimension(1, 99.0f, resources.getDisplayMetrics()), videoSeekBarMaskView);
        if (c0jad2.getParent() == null) {
            videoSeekBarMaskView.addView(c0jad2, marginLayoutParamsLJ7);
        }
        C0JAD c0jad3 = new C0JAD(context);
        c0jad3.setId(R.id.video_seek_duration);
        c0jad3.setInflater(new C0JAE() { // from class: X.16Eg
            @Override // X.C0JAE
            public final View LIZ(Context context2, ViewGroup viewGroup2, ViewGroup.LayoutParams layoutParams) {
                Resources resources2 = context2.getResources();
                RelativeLayout relativeLayout = new RelativeLayout(context2);
                relativeLayout.setId(R.id.video_seek_duration);
                C786410Ut5.LJLLLLLL(8, relativeLayout);
                View view2 = new View(context2);
                view2.setId(R.id.cem);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 0.1f, resources2.getDisplayMetrics()));
                if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
                    layoutParams2.addRule(12, -1);
                }
                android.view.a.LIZ(view2);
                if (view2.getParent() == null) {
                    relativeLayout.addView(view2, layoutParams2);
                }
                TuxTextView tuxTextView = new TuxTextView(context2);
                tuxTextView.setId(R.id.fbg);
                TypedArray typedArrayObtainStyledAttributes2 = context2.getTheme().obtainStyledAttributes(new int[]{R.attr.ee});
                tuxTextView.setTextColor(typedArrayObtainStyledAttributes2.getColor(0, 0));
                typedArrayObtainStyledAttributes2.recycle();
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
                if (RelativeLayout.LayoutParams.class.isInstance(layoutParams3)) {
                    layoutParams3.addRule(2, R.id.cem);
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
                    ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin = (int) TypedValue.applyDimension(1, 62.0f, resources2.getDisplayMetrics());
                }
                if (RelativeLayout.LayoutParams.class.isInstance(layoutParams3)) {
                    layoutParams3.addRule(16, R.id.fbf);
                }
                new o();
                o.LIZ("app:tux_font", new a.c("H1_Semibold"), tuxTextView);
                android.view.a.LIZ(tuxTextView);
                if (tuxTextView.getParent() == null) {
                    relativeLayout.addView(tuxTextView, layoutParams3);
                }
                TuxTextView tuxTextView2 = new TuxTextView(context2);
                tuxTextView2.setId(R.id.fbf);
                tuxTextView2.setGravity(17);
                TypedArray typedArrayObtainStyledAttributes3 = context2.getTheme().obtainStyledAttributes(new int[]{R.attr.ee});
                tuxTextView2.setTextColor(typedArrayObtainStyledAttributes3.getColor(0, 0));
                typedArrayObtainStyledAttributes3.recycle();
                tuxTextView2.setText("/");
                RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 6.0f, resources2.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 20.0f, resources2.getDisplayMetrics()));
                if (RelativeLayout.LayoutParams.class.isInstance(layoutParams4)) {
                    layoutParams4.addRule(14, -1);
                }
                if (RelativeLayout.LayoutParams.class.isInstance(layoutParams4)) {
                    layoutParams4.addRule(6, R.id.fbg);
                }
                if (RelativeLayout.LayoutParams.class.isInstance(layoutParams4)) {
                    layoutParams4.addRule(8, R.id.fbg);
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
                    layoutParams4.setMarginStart((int) TypedValue.applyDimension(1, 20.0f, resources2.getDisplayMetrics()));
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
                    layoutParams4.setMarginEnd((int) TypedValue.applyDimension(1, 20.0f, resources2.getDisplayMetrics()));
                }
                new o();
                o.LIZ("app:tux_font", new a.c("H3_Semibold"), tuxTextView2);
                android.view.a.LIZ(tuxTextView2);
                if (tuxTextView2.getParent() == null) {
                    relativeLayout.addView(tuxTextView2, layoutParams4);
                }
                TuxTextView tuxTextView3 = new TuxTextView(context2);
                tuxTextView3.setId(R.id.yg3);
                TypedArray typedArrayObtainStyledAttributes4 = context2.getTheme().obtainStyledAttributes(new int[]{R.attr.eg});
                tuxTextView3.setTextColor(typedArrayObtainStyledAttributes4.getColor(0, 0));
                typedArrayObtainStyledAttributes4.recycle();
                RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
                if (RelativeLayout.LayoutParams.class.isInstance(layoutParams5)) {
                    layoutParams5.addRule(17, R.id.fbf);
                }
                if (RelativeLayout.LayoutParams.class.isInstance(layoutParams5)) {
                    layoutParams5.addRule(6, R.id.fbg);
                }
                new o();
                o.LIZ("app:tux_font", new a.c("H1_Semibold"), tuxTextView3);
                android.view.a.LIZ(tuxTextView3);
                if (tuxTextView3.getParent() == null) {
                    relativeLayout.addView(tuxTextView3, layoutParams5);
                }
                android.view.a.LIZ(relativeLayout);
                return relativeLayout;
            }
        });
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ8 = android.view.a.LJ(-1, (int) TypedValue.applyDimension(1, 240.0f, resources.getDisplayMetrics()), videoSeekBarMaskView);
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ8)) {
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ8).gravity = 8388691;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ8)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ8).gravity = 8388691;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ8)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ8).gravity = 8388691;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ8)) {
            marginLayoutParamsLJ8.bottomMargin = (int) TypedValue.applyDimension(1, 116.0f, resources.getDisplayMetrics());
        }
        c0jad3.LIZ(R.id.cem);
        c0jad3.LIZ(R.id.fbg);
        c0jad3.LIZ(R.id.fbf);
        c0jad3.LIZ(R.id.yg3);
        if (c0jad3.getParent() == null) {
            videoSeekBarMaskView.addView(c0jad3, marginLayoutParamsLJ8);
        }
        C0JAD c0jad4 = new C0JAD(context);
        c0jad4.setId(R.id.video_seek_bar);
        c0jad4.setInflater(new C0JAE() { // from class: X.0JAC
            @Override // X.C0JAE
            public final View LIZ(Context context2, ViewGroup viewGroup2, ViewGroup.LayoutParams layoutParams) {
                context2.getResources();
                C12P2 c12p2 = new C12P2(context2, null);
                c12p2.setId(R.id.video_seek_bar);
                C786410Ut5.a0(c12p2, 8);
                android.view.a.LIZ(c12p2);
                return c12p2;
            }
        });
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ9 = android.view.a.LJ(-1, (int) TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()), videoSeekBarMaskView);
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ9)) {
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ9).gravity = 8388691;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ9)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ9).gravity = 8388691;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ9)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ9).gravity = 8388691;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ9)) {
            marginLayoutParamsLJ9.bottomMargin = (int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics());
        }
        if (c0jad4.getParent() == null) {
            videoSeekBarMaskView.addView(c0jad4, marginLayoutParamsLJ9);
        }
        ViewStub viewStub2 = new ViewStub(context);
        viewStub2.setId(R.id.cxf);
        viewStub2.setLayoutResource(R.layout.cdg);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ10 = android.view.a.LJ(-2, -2, videoSeekBarMaskView);
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ10)) {
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ10).gravity = 81;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ10)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ10).gravity = 81;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ10)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ10).gravity = 81;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ10)) {
            marginLayoutParamsLJ10.bottomMargin = (int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics());
        }
        viewStub2.setInflatedId(-1);
        android.view.a.LIZ(viewStub2);
        if (viewStub2.getParent() == null) {
            videoSeekBarMaskView.addView(viewStub2, marginLayoutParamsLJ10);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.pay);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ11 = android.view.a.LJ(-1, -2, videoSeekBarMaskView);
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ11)) {
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ11).gravity = 49;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ11)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ11).gravity = 49;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ11)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ11).gravity = 49;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ11)) {
            marginLayoutParamsLJ11.topMargin = (int) TypedValue.applyDimension(1, 112.0f, resources.getDisplayMetrics());
        }
        android.view.a.LIZ(frameLayout2);
        if (frameLayout2.getParent() == null) {
            videoSeekBarMaskView.addView(frameLayout2, marginLayoutParamsLJ11);
        }
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setId(R.id.awl);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ12 = android.view.a.LJ(-1, -2, videoSeekBarMaskView);
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ12)) {
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ12).gravity = 49;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ12)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ12).gravity = 49;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ12)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ12).gravity = 49;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ12)) {
            marginLayoutParamsLJ12.topMargin = (int) TypedValue.applyDimension(1, 112.0f, resources.getDisplayMetrics());
        }
        android.view.a.LIZ(frameLayout3);
        if (frameLayout3.getParent() == null) {
            videoSeekBarMaskView.addView(frameLayout3, marginLayoutParamsLJ12);
        }
        ViewStub viewStub3 = new ViewStub(context);
        viewStub3.setId(R.id.vs_edge_speedup_guide);
        viewStub3.setLayoutResource(R.layout.b67);
        C786410Ut5.LLIIIJ(viewStub3, 8);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ13 = android.view.a.LJ(-1, -1, videoSeekBarMaskView);
        viewStub3.setInflatedId(-1);
        android.view.a.LIZ(viewStub3);
        if (viewStub3.getParent() == null) {
            videoSeekBarMaskView.addView(viewStub3, marginLayoutParamsLJ13);
        }
        android.view.a.LIZ(videoSeekBarMaskView);
        if (videoSeekBarMaskView.getParent() == null) {
            fragmentTabHost.addView(videoSeekBarMaskView, layoutParamsLJ);
        }
        C0JAD c0jad5 = new C0JAD(context);
        c0jad5.setId(R.id.vw_shadow_for_setting);
        c0jad5.setInflater(new C0JAE() { // from class: X.0JA9
            @Override // X.C0JAE
            public final View LIZ(Context context2, ViewGroup viewGroup2, ViewGroup.LayoutParams layoutParams) {
                context2.getResources();
                View view2 = new View(context2);
                view2.setId(R.id.vw_shadow_for_setting);
                C786410Ut5.T4(view2, 0.0f);
                view2.setBackgroundColor(ColorProtector.parseColor("#111111"));
                C786410Ut5.LJLLLLLL(8, view2);
                android.view.a.LIZ(view2);
                return view2;
            }
        });
        ViewGroup.LayoutParams layoutParamsLJ2 = android.view.a.LJ(-1, -1, fragmentTabHost);
        if (c0jad5.getParent() == null) {
            fragmentTabHost.addView(c0jad5, layoutParamsLJ2);
        }
        C0JAD c0jad6 = new C0JAD(context);
        c0jad6.setId(R.id.video_seek_thum);
        c0jad6.setInflater(new C0JAE() { // from class: X.0JAA
            @Override // X.C0JAE
            public final View LIZ(Context context2, ViewGroup viewGroup2, ViewGroup.LayoutParams layoutParams) {
                context2.getResources();
                C389030FNd c389030FNd = new C389030FNd(context2);
                c389030FNd.setId(R.id.video_seek_thum);
                C786410Ut5.LJZI(8, c389030FNd);
                android.view.a.LIZ(c389030FNd);
                return c389030FNd;
            }
        });
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ14 = android.view.a.LJ((int) TypedValue.applyDimension(1, 88.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 140.0f, resources.getDisplayMetrics()), fragmentTabHost);
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ14)) {
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ14).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ14)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ14).gravity = 17;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ14)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ14).gravity = 17;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ14)) {
            marginLayoutParamsLJ14.bottomMargin = (int) TypedValue.applyDimension(1, 90.0f, resources.getDisplayMetrics());
        }
        if (c0jad6.getParent() == null) {
            fragmentTabHost.addView(c0jad6, marginLayoutParamsLJ14);
        }
        android.view.a.LIZ(fragmentTabHost);
        C786410Ut5.W5(fragmentTabHost, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(fragmentTabHost);
        }
        return fragmentTabHost;
    }
}
