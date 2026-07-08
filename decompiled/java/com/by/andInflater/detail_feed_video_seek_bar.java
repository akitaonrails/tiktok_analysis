package com.by.andInflater;

import X.C1213920hh8;
import X.C12P2;
import X.C12P4;
import X.C389030FNd;
import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.i;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class detail_feed_video_seek_bar implements InterfaceC20742716Ev {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -2, viewGroup);
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ).gravity = 80;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ).gravity = 80;
        }
        C12P4 c12p4 = new C12P4(context);
        c12p4.setId(R.id.video_seek_duration_mask);
        C786410Ut5.LJZI(8, c12p4);
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 99.0f, resources.getDisplayMetrics()));
        new i();
        i.LIZ("app:tux_shadeColor", new a.b("2131099754", "attr"), c12p4);
        i.LIZ("app:tux_beginShadeOpacity", new a.c(CardStruct.IStatusCode.DEFAULT), c12p4);
        i.LIZ("app:tux_endShadeOpacity", new a.c("0.18"), c12p4);
        i.LIZ("app:tux_shader", new a.c("ease_in_out"), c12p4);
        i.LIZ("app:tux_style", new a.c("vertical"), c12p4);
        android.view.a.LIZ(c12p4);
        if (c12p4.getParent() == null) {
            frameLayout.addView(c12p4, layoutParams);
        }
        C389030FNd c389030FNd = new C389030FNd(context);
        c389030FNd.setId(R.id.video_seek_thum);
        C786410Ut5.LJZI(8, c389030FNd);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 88.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 140.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
            ((LinearLayout.LayoutParams) layoutParams2).gravity = 1;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.gravity = 1;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams2)) {
            ((DrawerLayout$LayoutParams) layoutParams2).gravity = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = (int) TypedValue.applyDimension(1, 90.0f, resources.getDisplayMetrics());
        }
        android.view.a.LIZ(c389030FNd);
        if (c389030FNd.getParent() == null) {
            frameLayout.addView(c389030FNd, layoutParams2);
        }
        View c1213920hh8 = new C1213920hh8(context, null, 6);
        c1213920hh8.setId(R.id.ug2);
        C786410Ut5.LJLLLLLL(8, c1213920hh8);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin = (int) TypedValue.applyDimension(1, 148.0f, resources.getDisplayMetrics());
        }
        android.view.a.LIZ(c1213920hh8);
        if (c1213920hh8.getParent() == null) {
            frameLayout.addView(c1213920hh8, layoutParams3);
        }
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setId(R.id.video_seek_duration);
        C786410Ut5.LJLLLLLL(8, relativeLayout);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 240.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin = (int) TypedValue.applyDimension(1, 49.0f, resources.getDisplayMetrics());
        }
        View view = new View(context);
        view.setId(R.id.cem);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 0.1f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.addRule(12, -1);
        }
        android.view.a.LIZ(view);
        if (view.getParent() == null) {
            relativeLayout.addView(view, layoutParams5);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.fbg);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.ee});
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.addRule(16, R.id.fbf);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.addRule(2, R.id.cem);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams6)) {
            ((ViewGroup.MarginLayoutParams) layoutParams6).bottomMargin = (int) TypedValue.applyDimension(1, 60.0f, resources.getDisplayMetrics());
        }
        new o();
        o.LIZ("app:tux_font", new a.c("H1_Semibold"), tuxTextView);
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            relativeLayout.addView(tuxTextView, layoutParams6);
        }
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.fbf);
        tuxTextView2.setGravity(17);
        TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.ee});
        tuxTextView2.setTextColor(typedArrayObtainStyledAttributes2.getColor(0, 0));
        typedArrayObtainStyledAttributes2.recycle();
        tuxTextView2.setText("/");
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams7)) {
            layoutParams7.addRule(14, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams7)) {
            i = R.id.fbg;
            layoutParams7.addRule(6, R.id.fbg);
        } else {
            i = R.id.fbg;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams7)) {
            layoutParams7.addRule(8, i);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams7)) {
            layoutParams7.setMarginStart((int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams7)) {
            layoutParams7.setMarginEnd((int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        }
        new o();
        o.LIZ("app:tux_font", new a.c("H3_Semibold"), tuxTextView2);
        android.view.a.LIZ(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            relativeLayout.addView(tuxTextView2, layoutParams7);
        }
        TuxTextView tuxTextView3 = new TuxTextView(context);
        tuxTextView3.setId(R.id.yg3);
        TypedArray typedArrayObtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.eg});
        tuxTextView3.setTextColor(typedArrayObtainStyledAttributes3.getColor(0, 0));
        typedArrayObtainStyledAttributes3.recycle();
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams8)) {
            layoutParams8.addRule(17, R.id.fbf);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams8)) {
            layoutParams8.addRule(6, R.id.fbg);
        }
        new o();
        o.LIZ("app:tux_font", new a.c("H1_Semibold"), tuxTextView3);
        android.view.a.LIZ(tuxTextView3);
        if (tuxTextView3.getParent() == null) {
            relativeLayout.addView(tuxTextView3, layoutParams8);
        }
        android.view.a.LIZ(relativeLayout);
        if (relativeLayout.getParent() == null) {
            frameLayout.addView(relativeLayout, layoutParams4);
        }
        C12P2 c12p2 = new C12P2(context, null);
        c12p2.setId(R.id.video_seek_bar);
        C786410Ut5.a0(c12p2, 8);
        ViewGroup.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()));
        android.view.a.LIZ(c12p2);
        if (c12p2.getParent() == null) {
            frameLayout.addView(c12p2, layoutParams9);
        }
        android.view.a.LIZ(frameLayout);
        C786410Ut5.W5(frameLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        return frameLayout;
    }
}
