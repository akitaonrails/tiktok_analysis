package com.by.andInflater;

import X.C1603210rp1;
import X.C16F4;
import X.C1749280vcc;
import X.C20742916Ex;
import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.feed.widget.FeedSwipeRefreshLayout;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.n;

/* JADX INFO: loaded from: classes32.dex */
public class common_feed_fragment_feed_base_opt implements InterfaceC20742716Ev {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        FeedSwipeRefreshLayout feedSwipeRefreshLayout = new FeedSwipeRefreshLayout(context, null);
        feedSwipeRefreshLayout.setId(R.id.t25);
        feedSwipeRefreshLayout.setKeepScreenOn(true);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -1, viewGroup);
        C1603210rp1 c1603210rp1 = new C1603210rp1(context, null);
        c1603210rp1.setId(R.id.nns);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.e1});
        c1603210rp1.setBackgroundColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        ViewGroup.LayoutParams layoutParamsLJ = a.LJ(-1, -1, feedSwipeRefreshLayout);
        View frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.hku);
        ViewGroup.LayoutParams layoutParamsLJ2 = a.LJ(-1, -1, c1603210rp1);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParamsLJ2)) {
            ((LinearLayout.LayoutParams) layoutParamsLJ2).gravity = 1;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParamsLJ2)) {
            ((FrameLayout.LayoutParams) layoutParamsLJ2).gravity = 1;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParamsLJ2)) {
            ((DrawerLayout$LayoutParams) layoutParamsLJ2).gravity = 1;
        }
        a.LIZ(frameLayout);
        if (frameLayout.getParent() == null) {
            c1603210rp1.addView(frameLayout, layoutParamsLJ2);
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.viewpager_container);
        linearLayout.setOrientation(1);
        ViewGroup.LayoutParams layoutParamsLJ3 = a.LJ(-1, -1, c1603210rp1);
        View view = new View(context);
        view.setId(R.id.ydi);
        TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.e1});
        view.setBackgroundColor(typedArrayObtainStyledAttributes2.getColor(0, 0));
        typedArrayObtainStyledAttributes2.recycle();
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        a.LIZ(view);
        if (view.getParent() == null) {
            linearLayout.addView(view, layoutParams);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.view_pager_layout_wrapper);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.weight = 1;
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.gravity = 48;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams2)) {
            ((FrameLayout.LayoutParams) layoutParams2).gravity = 48;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams2)) {
            ((DrawerLayout$LayoutParams) layoutParams2).gravity = 48;
        }
        View frameLayout3 = new FrameLayout(context);
        frameLayout3.setId(R.id.vcr);
        frameLayout3.setTag("single_surface_view_container_object_tag");
        C786410Ut5.LJLLLLLL(8, frameLayout3);
        ViewGroup.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        a.LIZ(frameLayout3);
        if (frameLayout3.getParent() == null) {
            frameLayout2.addView(frameLayout3, layoutParams3);
        }
        View verticalViewPager = new VerticalViewPager(context);
        verticalViewPager.setId(R.id.viewpager);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -1);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams4)) {
            ((LinearLayout.LayoutParams) layoutParams4).gravity = 48;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.gravity = 48;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams4)) {
            ((DrawerLayout$LayoutParams) layoutParams4).gravity = 48;
        }
        a.LIZ(verticalViewPager);
        if (verticalViewPager.getParent() == null) {
            frameLayout2.addView(verticalViewPager, layoutParams4);
        }
        a.LIZ(frameLayout2);
        if (frameLayout2.getParent() == null) {
            linearLayout.addView(frameLayout2, layoutParams2);
        }
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(R.id.p8_);
        viewStub.setInflatedId(R.id.p89);
        viewStub.setLayoutResource(R.layout.b6w);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 54.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            ((ViewGroup.MarginLayoutParams) layoutParams5).topMargin = (int) TypedValue.applyDimension(1, -54.0f, resources.getDisplayMetrics());
        }
        a.LIZ(viewStub);
        if (viewStub.getParent() == null) {
            linearLayout.addView(viewStub, layoutParams5);
        }
        View view2 = new View(context);
        view2.setId(R.id.ch3);
        TypedArray typedArrayObtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.e1});
        view2.setBackgroundColor(typedArrayObtainStyledAttributes3.getColor(0, 0));
        typedArrayObtainStyledAttributes3.recycle();
        ViewGroup.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        a.LIZ(view2);
        if (view2.getParent() == null) {
            linearLayout.addView(view2, layoutParams6);
        }
        a.LIZ(linearLayout);
        if (linearLayout.getParent() == null) {
            c1603210rp1.addView(linearLayout, layoutParamsLJ3);
        }
        ViewStub viewStub2 = new ViewStub(context);
        viewStub2.setId(R.id.vs_tako_entrance_fixed);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ2 = a.LJ(-2, -2, c1603210rp1);
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ2).gravity = 8388693;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ2).gravity = 8388693;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ2).gravity = 8388693;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            marginLayoutParamsLJ2.bottomMargin = (int) TypedValue.applyDimension(1, 47.0f, resources.getDisplayMetrics());
        }
        viewStub2.setInflatedId(-1);
        a.LIZ(viewStub2);
        if (viewStub2.getParent() == null) {
            c1603210rp1.addView(viewStub2, marginLayoutParamsLJ2);
        }
        ViewStub viewStub3 = new ViewStub(context);
        viewStub3.setId(R.id.g4e);
        viewStub3.setInflatedId(R.id.g4d);
        viewStub3.setLayoutResource(R.layout.b6u);
        ViewGroup.LayoutParams layoutParamsLJ4 = a.LJ(-1, -2, c1603210rp1);
        a.LIZ(viewStub3);
        if (viewStub3.getParent() == null) {
            c1603210rp1.addView(viewStub3, layoutParamsLJ4);
        }
        ViewStub viewStub4 = new ViewStub(context);
        viewStub4.setId(R.id.g4t);
        viewStub4.setInflatedId(R.id.g4s);
        viewStub4.setLayoutResource(R.layout.b6v);
        ViewGroup.LayoutParams layoutParamsLJ5 = a.LJ(-1, -2, c1603210rp1);
        a.LIZ(viewStub4);
        if (viewStub4.getParent() == null) {
            c1603210rp1.addView(viewStub4, layoutParamsLJ5);
        }
        ViewStub viewStub5 = new ViewStub(context);
        viewStub5.setId(R.id.a0d);
        viewStub5.setInflatedId(R.id.a0c);
        viewStub5.setLayoutResource(R.layout.b4l);
        viewStub5.setElevation(resources.getDimension(R.dimen.sz));
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ3 = a.LJ(-2, -2, c1603210rp1);
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ3).gravity = 1;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ3).gravity = 1;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ3).gravity = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            marginLayoutParamsLJ3.topMargin = (int) resources.getDimension(R.dimen.bz);
        }
        a.LIZ(viewStub5);
        if (viewStub5.getParent() == null) {
            c1603210rp1.addView(viewStub5, marginLayoutParamsLJ3);
        }
        C20742916Ex.LIZ(context, R.layout.b6s, c1603210rp1, true, 0);
        View c16f4 = new C16F4(context);
        c16f4.setId(R.id.fu8);
        ViewGroup.LayoutParams layoutParamsLJ6 = a.LJ(-1, -1, c1603210rp1);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParamsLJ6)) {
            ((RelativeLayout.LayoutParams) layoutParamsLJ6).addRule(13, -1);
        }
        a.LIZ(c16f4);
        if (c16f4.getParent() == null) {
            c1603210rp1.addView(c16f4, layoutParamsLJ6);
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, R.style.xz);
        Resources resources2 = contextThemeWrapper.getResources();
        C1749280vcc c1749280vcc = new C1749280vcc(contextThemeWrapper);
        c1749280vcc.setId(R.id.z18);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ4 = a.LJ(-1, -1, c1603210rp1);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ4)) {
            marginLayoutParamsLJ4.topMargin = (int) TypedValue.applyDimension(1, 112.0f, resources2.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ4)) {
            marginLayoutParamsLJ4.bottomMargin = (int) TypedValue.applyDimension(1, 115.0f, resources2.getDisplayMetrics());
        }
        new n();
        n.LIZ(new a.c("fixed_height"), c1749280vcc);
        android.view.a.LIZ(c1749280vcc);
        if (c1749280vcc.getParent() == null) {
            c1603210rp1.addView(c1749280vcc, marginLayoutParamsLJ4);
        }
        View frameLayout4 = new FrameLayout(context);
        frameLayout4.setId(R.id.x08);
        C786410Ut5.LJLLLLLL(8, frameLayout4);
        ViewGroup.LayoutParams layoutParamsLJ7 = android.view.a.LJ(-1, -1, c1603210rp1);
        android.view.a.LIZ(frameLayout4);
        if (frameLayout4.getParent() == null) {
            c1603210rp1.addView(frameLayout4, layoutParamsLJ7);
        }
        android.view.a.LIZ(c1603210rp1);
        if (c1603210rp1.getParent() == null) {
            feedSwipeRefreshLayout.addView(c1603210rp1, layoutParamsLJ);
        }
        android.view.a.LIZ(feedSwipeRefreshLayout);
        C786410Ut5.W5(feedSwipeRefreshLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(feedSwipeRefreshLayout);
        }
        return feedSwipeRefreshLayout;
    }
}
