package com.by.andInflater;

import X.C1D92;
import X.C21387418mu;
import X.C427870Gq9;
import X.C708910RrN;
import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.feed.platform.cell.interact.view.InteractFrameLayout;
import com.ss.android.ugc.feed.platform.cell.interact.view.InteractRelativeLayout;
import com.zhiliaoapp.musically.R;
import dc.a;
import jf8.c;
import xem.k;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class common_feed_layout_video_cover_music implements InterfaceC20742716Ev {
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
        InteractRelativeLayout interactRelativeLayout = new InteractRelativeLayout(context);
        interactRelativeLayout.setId(R.id.ow9);
        interactRelativeLayout.setClipChildren(false);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-2, (int) TypedValue.applyDimension(1, 95.0f, resources.getDisplayMetrics()), viewGroup);
        View view = new View(context);
        view.setId(R.id.ow_);
        ViewGroup.LayoutParams layoutParamsLJ = a.LJ((int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 107.0f, resources.getDisplayMetrics()), interactRelativeLayout);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParamsLJ)) {
            ((RelativeLayout.LayoutParams) layoutParamsLJ).addRule(21, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParamsLJ)) {
            ((RelativeLayout.LayoutParams) layoutParamsLJ).addRule(11, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParamsLJ)) {
            ((RelativeLayout.LayoutParams) layoutParamsLJ).addRule(12, -1);
        }
        a.LIZ(view);
        if (view.getParent() == null) {
            interactRelativeLayout.addView(view, layoutParamsLJ);
        }
        View c21387418mu = new C21387418mu(context);
        c21387418mu.setId(R.id.pce);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ2 = a.LJ((int) TypedValue.applyDimension(1, 95.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 95.0f, resources.getDisplayMetrics()), interactRelativeLayout);
        if (RelativeLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            ((RelativeLayout.LayoutParams) marginLayoutParamsLJ2).addRule(21, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            ((RelativeLayout.LayoutParams) marginLayoutParamsLJ2).addRule(11, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            marginLayoutParamsLJ2.setMarginEnd((int) TypedValue.applyDimension(1, 21.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            marginLayoutParamsLJ2.rightMargin = (int) TypedValue.applyDimension(1, 21.0f, resources.getDisplayMetrics());
        }
        a.LIZ(c21387418mu);
        if (c21387418mu.getParent() == null) {
            interactRelativeLayout.addView(c21387418mu, marginLayoutParamsLJ2);
        }
        InteractFrameLayout interactFrameLayout = new InteractFrameLayout(context);
        interactFrameLayout.setId(R.id.ow0);
        interactFrameLayout.setClipChildren(false);
        interactFrameLayout.setClipToPadding(false);
        interactFrameLayout.setFocusable(false);
        interactFrameLayout.setFocusableInTouchMode(false);
        ViewGroup.LayoutParams layoutParamsLJ2 = a.LJ(-2, -2, interactRelativeLayout);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParamsLJ2)) {
            ((RelativeLayout.LayoutParams) layoutParamsLJ2).addRule(12, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParamsLJ2)) {
            ((RelativeLayout.LayoutParams) layoutParamsLJ2).addRule(16, R.id.ow_);
        }
        InteractFrameLayout interactFrameLayout2 = new InteractFrameLayout(context);
        interactFrameLayout2.setId(R.id.oxn);
        interactFrameLayout2.setClipChildren(false);
        interactFrameLayout2.setFocusable(false);
        C786410Ut5.LJLLLLLL(8, interactFrameLayout2);
        interactFrameLayout2.setFocusableInTouchMode(false);
        ViewGroup.LayoutParams layoutParamsLJ3 = a.LJ(-2, -2, interactFrameLayout);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParamsLJ3)) {
            ((RelativeLayout.LayoutParams) layoutParamsLJ3).addRule(12, -1);
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParamsLJ3)) {
            ((LinearLayout.LayoutParams) layoutParamsLJ3).gravity = 8388629;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParamsLJ3)) {
            ((FrameLayout.LayoutParams) layoutParamsLJ3).gravity = 8388629;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParamsLJ3)) {
            ((DrawerLayout$LayoutParams) layoutParamsLJ3).gravity = 8388629;
        }
        InteractFrameLayout interactFrameLayout3 = new InteractFrameLayout(context);
        interactFrameLayout3.setId(R.id.oxm);
        interactFrameLayout3.setFocusable(false);
        interactFrameLayout3.setFocusableInTouchMode(false);
        interactFrameLayout3.setPadding((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        C786410Ut5.T4(interactFrameLayout3, 0.9f);
        interactFrameLayout3.setBackgroundResource(R.drawable.cp3);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ3 = a.LJ((int) TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()), interactFrameLayout2);
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ3).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ3).gravity = 17;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ3).gravity = 17;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            marginLayoutParamsLJ3.setMargins((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        }
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setId(R.id.oxo);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ4 = a.LJ((int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()), interactFrameLayout3);
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ4)) {
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ4).gravity = 8388627;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ4)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ4).gravity = 8388627;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ4)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ4).gravity = 8388627;
        }
        new k();
        k.LIZ("app:tux_tintColor", new a.b("2131099773", "attr"), tuxIconView);
        k.LIZ("app:tux_icon", new a.b("2130774714", "raw"), tuxIconView);
        android.view.a.LIZ(tuxIconView);
        if (tuxIconView.getParent() == null) {
            interactFrameLayout3.addView(tuxIconView, marginLayoutParamsLJ4);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.oxp);
        C786410Ut5.T4(tuxTextView, 0.0f);
        tuxTextView.setGravity(16);
        tuxTextView.setText(2131838805);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.ej});
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        tuxTextView.setSingleLine(true);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ5 = android.view.a.LJ(-2, -1, interactFrameLayout3);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ5)) {
            marginLayoutParamsLJ5.setMarginStart((int) TypedValue.applyDimension(1, 22.0f, resources.getDisplayMetrics()));
        }
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ5)) {
            i = 16;
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ5).gravity = 16;
        } else {
            i = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ5)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ5).gravity = i;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ5)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ5).gravity = i;
        }
        new o();
        o.LIZ("app:tux_minTextSize", new a.d("10", "dp"), tuxTextView);
        o.LIZ("app:tux_font", new a.c("P2_Semibold"), tuxTextView);
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            interactFrameLayout3.addView(tuxTextView, marginLayoutParamsLJ5);
        }
        android.view.a.LIZ(interactFrameLayout3);
        if (interactFrameLayout3.getParent() == null) {
            interactFrameLayout2.addView(interactFrameLayout3, marginLayoutParamsLJ3);
        }
        TuxIconView tuxIconView2 = new TuxIconView(context);
        tuxIconView2.setId(R.id.ey7);
        tuxIconView2.setPadding((int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics()));
        C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
        tuxIconView2.setBackgroundResource(R.drawable.bbr);
        ViewGroup.LayoutParams layoutParamsLJ4 = android.view.a.LJ((int) TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()), interactFrameLayout2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParamsLJ4)) {
            i2 = 17;
            ((LinearLayout.LayoutParams) layoutParamsLJ4).gravity = 17;
        } else {
            i2 = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParamsLJ4)) {
            ((FrameLayout.LayoutParams) layoutParamsLJ4).gravity = i2;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParamsLJ4)) {
            ((DrawerLayout$LayoutParams) layoutParamsLJ4).gravity = i2;
        }
        new k();
        k.LIZ("app:tux_icon", new a.b("2130774330", "raw"), tuxIconView2);
        k.LIZ("app:tux_tintColor", new a.b("2131099771", "attr"), tuxIconView2);
        android.view.a.LIZ(tuxIconView2);
        if (tuxIconView2.getParent() == null) {
            interactFrameLayout2.addView(tuxIconView2, layoutParamsLJ4);
        }
        android.view.a.LIZ(interactFrameLayout2);
        if (interactFrameLayout2.getParent() == null) {
            interactFrameLayout.addView(interactFrameLayout2, layoutParamsLJ3);
        }
        InteractFrameLayout interactFrameLayout4 = new InteractFrameLayout(context);
        interactFrameLayout4.setId(R.id.owa);
        interactFrameLayout4.setClipChildren(false);
        interactFrameLayout4.setClipToPadding(false);
        ViewGroup.LayoutParams layoutParamsLJ5 = android.view.a.LJ(-2, -2, interactFrameLayout);
        C708910RrN c708910RrN = new C708910RrN(context, null);
        c708910RrN.setId(R.id.ou2);
        c708910RrN.setClipChildren(false);
        c708910RrN.setClipToPadding(false);
        c708910RrN.setFocusable(false);
        c708910RrN.setFocusableInTouchMode(false);
        c708910RrN.setImportantForAccessibility(2);
        ViewGroup.LayoutParams layoutParamsLJ6 = android.view.a.LJ(-2, -2, interactFrameLayout4);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParamsLJ6)) {
            ((LinearLayout.LayoutParams) layoutParamsLJ6).gravity = 8388613;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParamsLJ6)) {
            ((FrameLayout.LayoutParams) layoutParamsLJ6).gravity = 8388613;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParamsLJ6)) {
            ((DrawerLayout$LayoutParams) layoutParamsLJ6).gravity = 8388613;
        }
        InteractFrameLayout interactFrameLayout5 = new InteractFrameLayout(context);
        interactFrameLayout5.setId(R.id.ou0);
        interactFrameLayout5.setClipChildren(false);
        interactFrameLayout5.setClipToPadding(false);
        interactFrameLayout5.setFocusable(false);
        interactFrameLayout5.setFocusableInTouchMode(false);
        ViewGroup.LayoutParams layoutParamsLJ7 = android.view.a.LJ(-2, -2, c708910RrN);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParamsLJ7)) {
            ((RelativeLayout.LayoutParams) layoutParamsLJ7).addRule(12, -1);
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParamsLJ7)) {
            i3 = 17;
            ((LinearLayout.LayoutParams) layoutParamsLJ7).gravity = 17;
        } else {
            i3 = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParamsLJ7)) {
            ((FrameLayout.LayoutParams) layoutParamsLJ7).gravity = i3;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParamsLJ7)) {
            ((DrawerLayout$LayoutParams) layoutParamsLJ7).gravity = i3;
        }
        InteractFrameLayout interactFrameLayout6 = new InteractFrameLayout(context);
        interactFrameLayout6.setId(R.id.ou3);
        interactFrameLayout6.setClipChildren(false);
        interactFrameLayout6.setFocusable(false);
        interactFrameLayout6.setFocusableInTouchMode(false);
        ViewGroup.LayoutParams layoutParamsLJ8 = android.view.a.LJ(-2, -2, interactFrameLayout5);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParamsLJ8)) {
            ((RelativeLayout.LayoutParams) layoutParamsLJ8).addRule(12, -1);
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParamsLJ8)) {
            i4 = 8388627;
            ((LinearLayout.LayoutParams) layoutParamsLJ8).gravity = 8388627;
        } else {
            i4 = 8388627;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParamsLJ8)) {
            ((FrameLayout.LayoutParams) layoutParamsLJ8).gravity = i4;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParamsLJ8)) {
            ((DrawerLayout$LayoutParams) layoutParamsLJ8).gravity = i4;
        }
        C427870Gq9 c427870Gq9 = new C427870Gq9(context);
        c427870Gq9.setId(R.id.otv);
        c427870Gq9.setFocusable(false);
        c427870Gq9.setFocusableInTouchMode(false);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ6 = android.view.a.LJ((int) TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()), interactFrameLayout6);
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ6)) {
            i5 = 17;
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ6).gravity = 17;
        } else {
            i5 = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ6)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ6).gravity = i5;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ6)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ6).gravity = i5;
        }
        c cVar = new c();
        cVar.LIZIZ("app:placeholderImage", new a.b("2130972424", "drawable"), c427870Gq9);
        cVar.LIZ(c427870Gq9);
        android.view.a.LIZ(c427870Gq9);
        if (c427870Gq9.getParent() == null) {
            interactFrameLayout6.addView(c427870Gq9, marginLayoutParamsLJ6);
        }
        C1D92 c1d92 = new C1D92(context, null, 6);
        c1d92.setId(R.id.ou5);
        c1d92.setFocusable(false);
        c1d92.setFocusableInTouchMode(false);
        C786410Ut5.LJLLLLLL(8, c1d92);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ7 = android.view.a.LJ((int) TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()), interactFrameLayout6);
        android.view.a.LIZ(c1d92);
        if (c1d92.getParent() == null) {
            interactFrameLayout6.addView(c1d92, marginLayoutParamsLJ7);
        }
        C427870Gq9 c427870Gq92 = new C427870Gq9(context);
        c427870Gq92.setId(R.id.ptd);
        c427870Gq92.setFocusable(false);
        c427870Gq92.setFocusableInTouchMode(false);
        C786410Ut5.LJZI(8, c427870Gq92);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ8 = android.view.a.LJ((int) TypedValue.applyDimension(1, 27.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 27.0f, resources.getDisplayMetrics()), interactFrameLayout6);
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
        android.view.a.LIZ(c427870Gq92);
        if (c427870Gq92.getParent() == null) {
            interactFrameLayout6.addView(c427870Gq92, marginLayoutParamsLJ8);
        }
        View view2 = new View(new ContextThemeWrapper(context, R.style.y3));
        view2.setId(R.id.ou4);
        C786410Ut5.T4(view2, 0.05f);
        view2.setBackgroundResource(R.drawable.b_b);
        C786410Ut5.LJLLLLLL(8, view2);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ9 = android.view.a.LJ((int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), interactFrameLayout6);
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
        android.view.a.LIZ(view2);
        if (view2.getParent() == null) {
            interactFrameLayout6.addView(view2, marginLayoutParamsLJ9);
        }
        android.view.a.LIZ(interactFrameLayout6);
        if (interactFrameLayout6.getParent() == null) {
            interactFrameLayout5.addView(interactFrameLayout6, layoutParamsLJ8);
        }
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.xp7);
        C786410Ut5.T4(tuxTextView2, 0.0f);
        tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView2.setGravity(16);
        tuxTextView2.setMaxLines(1);
        tuxTextView2.setText(2131830730);
        TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.ee});
        tuxTextView2.setTextColor(typedArrayObtainStyledAttributes2.getColor(0, 0));
        typedArrayObtainStyledAttributes2.recycle();
        C786410Ut5.LJLLLLLL(8, tuxTextView2);
        ViewGroup.LayoutParams layoutParamsLJ9 = android.view.a.LJ(-2, -1, interactFrameLayout5);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParamsLJ9)) {
            i8 = 16;
            ((LinearLayout.LayoutParams) layoutParamsLJ9).gravity = 16;
        } else {
            i8 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParamsLJ9)) {
            ((FrameLayout.LayoutParams) layoutParamsLJ9).gravity = i8;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParamsLJ9)) {
            ((DrawerLayout$LayoutParams) layoutParamsLJ9).gravity = i8;
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P2_Semibold"), tuxTextView2);
        o.LIZ("app:tux_minTextSize", new a.d("10", "dp"), tuxTextView2);
        android.view.a.LIZ(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            interactFrameLayout5.addView(tuxTextView2, layoutParamsLJ9);
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, R.style.y3);
        Resources resources2 = contextThemeWrapper.getResources();
        TuxIconView tuxIconView3 = new TuxIconView(contextThemeWrapper);
        tuxIconView3.setId(R.id.du1);
        tuxIconView3.setImportantForAccessibility(2);
        C786410Ut5.Ab(tuxIconView3, 10.0f);
        C786410Ut5.LLLLLLZZ(tuxIconView3, 8);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ10 = android.view.a.LJ((int) TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()), interactFrameLayout5);
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ10)) {
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ10).gravity = 85;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ10)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ10).gravity = 85;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ10)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ10).gravity = 85;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ10)) {
            marginLayoutParamsLJ10.rightMargin = (int) TypedValue.applyDimension(1, -2.0f, resources2.getDisplayMetrics());
        }
        new k();
        k.LIZ("app:tux_icon", new a.b("2130772843", "raw"), tuxIconView3);
        k.LIZ("app:tux_tintColor", new a.b("2131100549", "attr"), tuxIconView3);
        android.view.a.LIZ(tuxIconView3);
        if (tuxIconView3.getParent() == null) {
            interactFrameLayout5.addView(tuxIconView3, marginLayoutParamsLJ10);
        }
        android.view.a.LIZ(interactFrameLayout5);
        if (interactFrameLayout5.getParent() == null) {
            c708910RrN.addView(interactFrameLayout5, layoutParamsLJ7);
        }
        android.view.a.LIZ(c708910RrN);
        if (c708910RrN.getParent() == null) {
            interactFrameLayout4.addView(c708910RrN, layoutParamsLJ6);
        }
        android.view.a.LIZ(interactFrameLayout4);
        if (interactFrameLayout4.getParent() == null) {
            interactFrameLayout.addView(interactFrameLayout4, layoutParamsLJ5);
        }
        android.view.a.LIZ(interactFrameLayout);
        if (interactFrameLayout.getParent() == null) {
            interactRelativeLayout.addView(interactFrameLayout, layoutParamsLJ2);
        }
        android.view.a.LIZ(interactRelativeLayout);
        C786410Ut5.W5(interactRelativeLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(interactRelativeLayout);
        }
        return interactRelativeLayout;
    }
}
