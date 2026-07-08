package com.by.andInflater;

import X.C0QB7;
import X.C19ME;
import X.C706670Rnl;
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
import android.view.ViewStub;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.feed.platform.cell.interact.view.InteractConstraintLayout;
import com.ss.android.ugc.feed.platform.cell.interact.view.InteractLinearLayout;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.k;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class common_feed_layout_video_title implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        float f;
        int i2;
        int i3;
        int i4;
        int i5;
        float f2;
        Resources resources = context.getResources();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, R.style.hk);
        Resources resources2 = contextThemeWrapper.getResources();
        InteractConstraintLayout interactConstraintLayout = new InteractConstraintLayout(contextThemeWrapper);
        interactConstraintLayout.setId(R.id.hvf);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-2, -2, viewGroup);
        InteractLinearLayout interactLinearLayout = new InteractLinearLayout(contextThemeWrapper);
        interactLinearLayout.setId(R.id.trr);
        interactLinearLayout.setBaselineAligned(true);
        interactLinearLayout.setOrientation(0);
        ViewGroup.LayoutParams layoutParamsLJ = a.LJ(-2, -2, interactConstraintLayout);
        if (C19ME.class.isInstance(layoutParamsLJ)) {
            ((C19ME) layoutParamsLJ).topToTop = 0;
        }
        if (C19ME.class.isInstance(layoutParamsLJ)) {
            ((C19ME) layoutParamsLJ).startToStart = 0;
        }
        TuxIconView tuxIconView = new TuxIconView(contextThemeWrapper);
        tuxIconView.setId(R.id.als);
        C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        tuxIconView.setImportantForAccessibility(2);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ2 = a.LJ(-2, -2, interactLinearLayout);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            marginLayoutParamsLJ2.setMarginEnd((int) TypedValue.applyDimension(1, 4.0f, resources2.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            marginLayoutParamsLJ2.topMargin = (int) TypedValue.applyDimension(1, 2.0f, resources2.getDisplayMetrics());
        }
        a.LIZ(tuxIconView);
        if (tuxIconView.getParent() == null) {
            interactLinearLayout.addView(tuxIconView, marginLayoutParamsLJ2);
        }
        C706670Rnl c706670Rnl = new C706670Rnl(contextThemeWrapper, null, 6);
        if (MethodIDManager.LJI(202358)) {
            MethodIDManager.LJ();
        }
        c706670Rnl.setId(R.id.title);
        c706670Rnl.setEllipsize(TextUtils.TruncateAt.END);
        c706670Rnl.setGravity(16);
        c706670Rnl.setIncludeFontPadding(false);
        c706670Rnl.setMaxLines(1);
        c706670Rnl.setShadowLayer(c706670Rnl.getShadowRadius(), c706670Rnl.getShadowDx(), c706670Rnl.getShadowDy(), a.LIZIZ(R.attr.zb, contextThemeWrapper));
        c706670Rnl.setShadowLayer(c706670Rnl.getShadowRadius(), c706670Rnl.getShadowDx(), 1.0f, c706670Rnl.getShadowColor());
        c706670Rnl.setShadowLayer(1.0f, c706670Rnl.getShadowDx(), c706670Rnl.getShadowDy(), c706670Rnl.getShadowColor());
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.getTheme().obtainStyledAttributes(new int[]{R.attr.ee});
        c706670Rnl.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        ViewGroup.LayoutParams layoutParamsLJ2 = a.LJ((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2, interactLinearLayout);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParamsLJ2)) {
            ((LinearLayout.LayoutParams) layoutParamsLJ2).weight = 1;
        }
        new o();
        o.LIZ("app:tux_font", new a.c("H4_Semibold"), c706670Rnl);
        android.view.a.LIZ(c706670Rnl);
        if (c706670Rnl.getParent() == null) {
            interactLinearLayout.addView(c706670Rnl, layoutParamsLJ2);
        }
        View frameLayout = new FrameLayout(contextThemeWrapper);
        frameLayout.setId(R.id.wa5);
        C786410Ut5.LJLLLLLL(8, frameLayout);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ3 = android.view.a.LJ(-2, -2, interactLinearLayout);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            marginLayoutParamsLJ3.setMarginStart((int) TypedValue.applyDimension(1, 2.0f, resources2.getDisplayMetrics()));
        }
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            i = 16;
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ3).gravity = 16;
        } else {
            i = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ3).gravity = i;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ3).gravity = i;
        }
        android.view.a.LIZ(frameLayout);
        if (frameLayout.getParent() == null) {
            interactLinearLayout.addView(frameLayout, marginLayoutParamsLJ3);
        }
        ContextThemeWrapper contextThemeWrapper2 = new ContextThemeWrapper(contextThemeWrapper, R.style.xz);
        Resources resources3 = contextThemeWrapper2.getResources();
        TuxTextView tuxTextView = new TuxTextView(contextThemeWrapper2);
        tuxTextView.setId(R.id.alt);
        tuxTextView.setMaxLines(1);
        TypedArray typedArrayObtainStyledAttributes2 = contextThemeWrapper2.getTheme().obtainStyledAttributes(new int[]{R.attr.a1k});
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes2.getColor(0, 0));
        typedArrayObtainStyledAttributes2.recycle();
        tuxTextView.setText(2131828913);
        C786410Ut5.LJLLLLLL(8, tuxTextView);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ4 = android.view.a.LJ(-2, -2, interactLinearLayout);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ4)) {
            f = 4.0f;
            marginLayoutParamsLJ4.setMarginStart((int) TypedValue.applyDimension(1, 4.0f, resources3.getDisplayMetrics()));
        } else {
            f = 4.0f;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ4)) {
            marginLayoutParamsLJ4.setMarginEnd((int) TypedValue.applyDimension(1, f, resources3.getDisplayMetrics()));
        }
        new o();
        o.LIZ("app:tux_font", new a.c("H4_Regular"), tuxTextView);
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            interactLinearLayout.addView(tuxTextView, marginLayoutParamsLJ4);
        }
        ContextThemeWrapper contextThemeWrapper3 = new ContextThemeWrapper(contextThemeWrapper, R.style.xz);
        Resources resources4 = contextThemeWrapper3.getResources();
        TuxTextView tuxTextView2 = new TuxTextView(contextThemeWrapper3);
        tuxTextView2.setId(R.id.alu);
        tuxTextView2.setMaxLines(1);
        TypedArray typedArrayObtainStyledAttributes3 = contextThemeWrapper3.getTheme().obtainStyledAttributes(new int[]{R.attr.ee});
        tuxTextView2.setTextColor(typedArrayObtainStyledAttributes3.getColor(0, 0));
        typedArrayObtainStyledAttributes3.recycle();
        tuxTextView2.setSingleLine(true);
        tuxTextView2.setGravity(16);
        tuxTextView2.setShadowLayer(tuxTextView2.getShadowRadius(), tuxTextView2.getShadowDx(), tuxTextView2.getShadowDy(), android.view.a.LIZIZ(R.attr.zb, contextThemeWrapper3));
        tuxTextView2.setShadowLayer(tuxTextView2.getShadowRadius(), tuxTextView2.getShadowDx(), 1.0f, tuxTextView2.getShadowColor());
        tuxTextView2.setShadowLayer(1.0f, tuxTextView2.getShadowDx(), tuxTextView2.getShadowDy(), tuxTextView2.getShadowColor());
        C786410Ut5.LJLLLLLL(8, tuxTextView2);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ5 = android.view.a.LJ(-2, -2, interactLinearLayout);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ5)) {
            marginLayoutParamsLJ5.setMarginEnd((int) TypedValue.applyDimension(1, 4.0f, resources4.getDisplayMetrics()));
        }
        new o();
        o.LIZ("app:tux_font", new a.c("H4_Semibold"), tuxTextView2);
        android.view.a.LIZ(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            interactLinearLayout.addView(tuxTextView2, marginLayoutParamsLJ5);
        }
        TuxTextView tuxTextView3 = new TuxTextView(contextThemeWrapper);
        tuxTextView3.setId(R.id.x0_);
        TypedArray typedArrayObtainStyledAttributes4 = contextThemeWrapper.getTheme().obtainStyledAttributes(new int[]{R.attr.eh});
        tuxTextView3.setTextColor(typedArrayObtainStyledAttributes4.getColor(0, 0));
        typedArrayObtainStyledAttributes4.recycle();
        tuxTextView3.setText("·");
        tuxTextView3.setMaxLines(1);
        C786410Ut5.LJLLLLLL(8, tuxTextView3);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ6 = android.view.a.LJ(-2, -2, interactLinearLayout);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ6)) {
            marginLayoutParamsLJ6.setMarginStart((int) TypedValue.applyDimension(1, 6.0f, resources2.getDisplayMetrics()));
        }
        new o();
        o.LIZ("app:tux_font", new a.c("H4_Semibold"), tuxTextView3);
        android.view.a.LIZ(tuxTextView3);
        if (tuxTextView3.getParent() == null) {
            interactLinearLayout.addView(tuxTextView3, marginLayoutParamsLJ6);
        }
        ViewStub viewStub = new ViewStub(contextThemeWrapper);
        viewStub.setId(R.id.x0a);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ7 = android.view.a.LJ(-2, -1, interactLinearLayout);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ7)) {
            marginLayoutParamsLJ7.setMarginStart((int) TypedValue.applyDimension(1, 6.0f, resources2.getDisplayMetrics()));
        }
        viewStub.setInflatedId(-1);
        android.view.a.LIZ(viewStub);
        if (viewStub.getParent() == null) {
            interactLinearLayout.addView(viewStub, marginLayoutParamsLJ7);
        }
        LinearLayout linearLayout = new LinearLayout(contextThemeWrapper);
        linearLayout.setId(R.id.voa);
        linearLayout.setPadding((int) TypedValue.applyDimension(1, 6.0f, resources2.getDisplayMetrics()), linearLayout.getPaddingTop(), linearLayout.getPaddingRight(), linearLayout.getPaddingBottom());
        linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), (int) TypedValue.applyDimension(1, 6.0f, resources2.getDisplayMetrics()), linearLayout.getPaddingBottom());
        C786410Ut5.LJLLLLLL(8, linearLayout);
        linearLayout.setGravity(16);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ8 = android.view.a.LJ(-2, -2, interactLinearLayout);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ8)) {
            marginLayoutParamsLJ8.setMarginStart((int) TypedValue.applyDimension(1, 8.0f, resources2.getDisplayMetrics()));
        }
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ8)) {
            i2 = 16;
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ8).gravity = 16;
        } else {
            i2 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ8)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ8).gravity = i2;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ8)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ8).gravity = i2;
        }
        TuxIconView tuxIconView2 = new TuxIconView(contextThemeWrapper);
        tuxIconView2.setImportantForAccessibility(2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        new k();
        k.LIZ("android:layout_marginVertical", new a.d("6", "dp"), tuxIconView2);
        k.LIZ("app:tux_icon", new a.b("2130774420", "raw"), tuxIconView2);
        k.LIZ("app:tux_tintColor", new a.b("2131099768", "attr"), tuxIconView2);
        android.view.a.LIZ(tuxIconView2);
        if (tuxIconView2.getParent() == null) {
            linearLayout.addView(tuxIconView2, layoutParams);
        }
        TuxTextView tuxTextView4 = new TuxTextView(contextThemeWrapper);
        tuxTextView4.setId(R.id.vo_);
        tuxTextView4.setMaxLines(1);
        TypedArray typedArrayObtainStyledAttributes5 = contextThemeWrapper.getTheme().obtainStyledAttributes(new int[]{R.attr.ee});
        tuxTextView4.setTextColor(typedArrayObtainStyledAttributes5.getColor(0, 0));
        typedArrayObtainStyledAttributes5.recycle();
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            i3 = 1;
            layoutParams2.setMarginStart((int) TypedValue.applyDimension(1, 2.0f, resources2.getDisplayMetrics()));
        } else {
            i3 = 1;
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.weight = i3;
        }
        new o();
        o.LIZ("android:breakStrategy", new a.c("simple"), tuxTextView4);
        o.LIZ("app:tux_font", new a.c("P3_Semibold"), tuxTextView4);
        android.view.a.LIZ(tuxTextView4);
        if (tuxTextView4.getParent() == null) {
            linearLayout.addView(tuxTextView4, layoutParams2);
        }
        C0QB7 c0qb7 = new C0QB7(contextThemeWrapper, null, 6);
        c0qb7.setId(R.id.vo9);
        C786410Ut5.LJLLLLLL(8, c0qb7);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.setMarginStart((int) TypedValue.applyDimension(1, 2.0f, resources2.getDisplayMetrics()));
        }
        android.view.a.LIZ(c0qb7);
        if (c0qb7.getParent() == null) {
            linearLayout.addView(c0qb7, layoutParams3);
        }
        android.view.a.LIZ(linearLayout);
        if (linearLayout.getParent() == null) {
            interactLinearLayout.addView(linearLayout, marginLayoutParamsLJ8);
        }
        LinearLayout linearLayout2 = new LinearLayout(contextThemeWrapper);
        linearLayout2.setId(R.id.e5i);
        linearLayout2.setPadding((int) TypedValue.applyDimension(1, 6.0f, resources2.getDisplayMetrics()), linearLayout2.getPaddingTop(), linearLayout2.getPaddingRight(), linearLayout2.getPaddingBottom());
        linearLayout2.setPadding(linearLayout2.getPaddingLeft(), linearLayout2.getPaddingTop(), (int) TypedValue.applyDimension(1, 6.0f, resources2.getDisplayMetrics()), linearLayout2.getPaddingBottom());
        C786410Ut5.LJLLLLLL(8, linearLayout2);
        linearLayout2.setGravity(16);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ9 = android.view.a.LJ(-2, (int) TypedValue.applyDimension(1, 22.0f, resources.getDisplayMetrics()), interactLinearLayout);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ9)) {
            marginLayoutParamsLJ9.setMarginStart((int) TypedValue.applyDimension(1, 6.0f, resources2.getDisplayMetrics()));
        }
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ9)) {
            i4 = 16;
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ9).gravity = 16;
        } else {
            i4 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ9)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ9).gravity = i4;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ9)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ9).gravity = i4;
        }
        TuxIconView tuxIconView3 = new TuxIconView(contextThemeWrapper);
        tuxIconView3.setId(R.id.e5j);
        tuxIconView3.setImportantForAccessibility(2);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        new k();
        k.LIZ("android:layout_marginVertical", new a.d("4", "dp"), tuxIconView3);
        k.LIZ("app:tux_icon", new a.b("2130772968", "raw"), tuxIconView3);
        k.LIZ("app:tux_tintColor", new a.b("2131099768", "attr"), tuxIconView3);
        android.view.a.LIZ(tuxIconView3);
        if (tuxIconView3.getParent() == null) {
            linearLayout2.addView(tuxIconView3, layoutParams4);
        }
        TuxTextView tuxTextView5 = new TuxTextView(contextThemeWrapper);
        tuxTextView5.setId(R.id.e5k);
        tuxTextView5.setMaxLines(1);
        TypedArray typedArrayObtainStyledAttributes6 = contextThemeWrapper.getTheme().obtainStyledAttributes(new int[]{R.attr.ee});
        tuxTextView5.setTextColor(typedArrayObtainStyledAttributes6.getColor(0, 0));
        typedArrayObtainStyledAttributes6.recycle();
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.setMarginStart((int) TypedValue.applyDimension(1, 2.0f, resources2.getDisplayMetrics()));
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P3_Semibold"), tuxTextView5);
        android.view.a.LIZ(tuxTextView5);
        if (tuxTextView5.getParent() == null) {
            linearLayout2.addView(tuxTextView5, layoutParams5);
        }
        TuxIconView tuxIconView4 = new TuxIconView(contextThemeWrapper);
        tuxIconView4.setId(R.id.e5f);
        C786410Ut5.LLLLLLZZ(tuxIconView4, 8);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.setMarginStart((int) TypedValue.applyDimension(1, 2.0f, resources2.getDisplayMetrics()));
        }
        android.view.a.LIZ(tuxIconView4);
        if (tuxIconView4.getParent() == null) {
            linearLayout2.addView(tuxIconView4, layoutParams6);
        }
        android.view.a.LIZ(linearLayout2);
        if (linearLayout2.getParent() == null) {
            interactLinearLayout.addView(linearLayout2, marginLayoutParamsLJ9);
        }
        View c708910RrN = new C708910RrN(contextThemeWrapper, null);
        c708910RrN.setId(R.id.x14);
        ViewGroup.LayoutParams layoutParamsLJ3 = android.view.a.LJ(-2, -2, interactLinearLayout);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParamsLJ3)) {
            i5 = 16;
            ((LinearLayout.LayoutParams) layoutParamsLJ3).gravity = 16;
        } else {
            i5 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParamsLJ3)) {
            ((FrameLayout.LayoutParams) layoutParamsLJ3).gravity = i5;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParamsLJ3)) {
            ((DrawerLayout$LayoutParams) layoutParamsLJ3).gravity = i5;
        }
        android.view.a.LIZ(c708910RrN);
        if (c708910RrN.getParent() == null) {
            interactLinearLayout.addView(c708910RrN, layoutParamsLJ3);
        }
        View frameLayout2 = new FrameLayout(contextThemeWrapper);
        frameLayout2.setId(R.id.u9p);
        ViewGroup.LayoutParams layoutParamsLJ4 = android.view.a.LJ(-2, -2, interactLinearLayout);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParamsLJ4)) {
            ((LinearLayout.LayoutParams) layoutParamsLJ4).gravity = i5;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParamsLJ4)) {
            ((FrameLayout.LayoutParams) layoutParamsLJ4).gravity = i5;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParamsLJ4)) {
            ((DrawerLayout$LayoutParams) layoutParamsLJ4).gravity = i5;
        }
        android.view.a.LIZ(frameLayout2);
        if (frameLayout2.getParent() == null) {
            interactLinearLayout.addView(frameLayout2, layoutParamsLJ4);
        }
        TuxTextView tuxTextView6 = new TuxTextView(contextThemeWrapper);
        tuxTextView6.setId(R.id.tv_post_time);
        tuxTextView6.setGravity(8388611);
        tuxTextView6.setShadowLayer(tuxTextView6.getShadowRadius(), tuxTextView6.getShadowDx(), tuxTextView6.getShadowDy(), android.view.a.LIZIZ(R.attr.zb, contextThemeWrapper));
        tuxTextView6.setShadowLayer(tuxTextView6.getShadowRadius(), tuxTextView6.getShadowDx(), 2.0f, tuxTextView6.getShadowColor());
        tuxTextView6.setShadowLayer(2.0f, tuxTextView6.getShadowDx(), tuxTextView6.getShadowDy(), tuxTextView6.getShadowColor());
        tuxTextView6.setTextAlignment(5);
        TypedArray typedArrayObtainStyledAttributes7 = contextThemeWrapper.getTheme().obtainStyledAttributes(new int[]{R.attr.eh});
        tuxTextView6.setTextColor(typedArrayObtainStyledAttributes7.getColor(0, 0));
        typedArrayObtainStyledAttributes7.recycle();
        tuxTextView6.setMaxLines(1);
        tuxTextView6.setTextDirection(5);
        tuxTextView6.setEllipsize(TextUtils.TruncateAt.END);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ10 = android.view.a.LJ(-2, -2, interactLinearLayout);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ10)) {
            f2 = 4.0f;
            marginLayoutParamsLJ10.setMarginStart((int) TypedValue.applyDimension(1, 4.0f, resources2.getDisplayMetrics()));
        } else {
            f2 = 4.0f;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ10)) {
            marginLayoutParamsLJ10.leftMargin = (int) TypedValue.applyDimension(1, f2, resources2.getDisplayMetrics());
        }
        new o();
        o.LIZ("app:tux_font", new a.c("H4_Semibold"), tuxTextView6);
        android.view.a.LIZ(tuxTextView6);
        if (tuxTextView6.getParent() == null) {
            interactLinearLayout.addView(tuxTextView6, marginLayoutParamsLJ10);
        }
        android.view.a.LIZ(interactLinearLayout);
        if (interactLinearLayout.getParent() == null) {
            interactConstraintLayout.addView(interactLinearLayout, layoutParamsLJ);
        }
        View c708910RrN2 = new C708910RrN(contextThemeWrapper, null);
        c708910RrN2.setId(R.id.e5s);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ11 = android.view.a.LJ(-2, -2, interactConstraintLayout);
        if (C19ME.class.isInstance(marginLayoutParamsLJ11)) {
            ((C19ME) marginLayoutParamsLJ11).topToBottom = R.id.trr;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ11)) {
            ((C19ME) marginLayoutParamsLJ11).startToStart = 0;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ11)) {
            marginLayoutParamsLJ11.topMargin = (int) TypedValue.applyDimension(1, f2, resources2.getDisplayMetrics());
        }
        android.view.a.LIZ(c708910RrN2);
        if (c708910RrN2.getParent() == null) {
            interactConstraintLayout.addView(c708910RrN2, marginLayoutParamsLJ11);
        }
        android.view.a.LIZ(interactConstraintLayout);
        C786410Ut5.W5(interactConstraintLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(interactConstraintLayout);
        }
        return interactConstraintLayout;
    }
}
