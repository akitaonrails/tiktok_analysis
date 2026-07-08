package com.by.andInflater;

import X.C20742916Ex;
import X.C21415018rM;
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
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.widget.FixedRatioFrameLayout;
import com.ss.android.ugc.aweme.challenge.ui.q0;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.k;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class upvote_layout_reposted_list_item implements InterfaceC20742716Ev {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        Resources resources = context.getResources();
        FixedRatioFrameLayout fixedRatioFrameLayout = new FixedRatioFrameLayout(context, null);
        fixedRatioFrameLayout.setId(R.id.eqx);
        fixedRatioFrameLayout.setClipChildren(false);
        fixedRatioFrameLayout.setClipToPadding(false);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -2, viewGroup);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            marginLayoutParamsLJ.setMargins((int) TypedValue.applyDimension(1, 0.5f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.5f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.5f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.5f, resources.getDisplayMetrics()));
        }
        new q0();
        q0.LIZ("app:frMode", new a.c("fixed_width"), fixedRatioFrameLayout);
        q0.LIZ("app:whRatio", new a.c("0.75"), fixedRatioFrameLayout);
        View smartImageView = new SmartImageView(context);
        smartImageView.setId(R.id.ld7);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.br});
        smartImageView.setBackgroundColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        ViewGroup.LayoutParams layoutParamsLJ = android.view.a.LJ(-1, -1, fixedRatioFrameLayout);
        android.view.a.LIZ(smartImageView);
        if (smartImageView.getParent() == null) {
            fixedRatioFrameLayout.addView(smartImageView, layoutParamsLJ);
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.nb4);
        linearLayout.setBackgroundResource(R.drawable.d0q);
        linearLayout.setGravity(80);
        linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), linearLayout.getPaddingRight(), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        ViewGroup.LayoutParams layoutParamsLJ2 = android.view.a.LJ(-1, (int) TypedValue.applyDimension(1, 50.0f, resources.getDisplayMetrics()), fixedRatioFrameLayout);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParamsLJ2)) {
            ((LinearLayout.LayoutParams) layoutParamsLJ2).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParamsLJ2)) {
            ((FrameLayout.LayoutParams) layoutParamsLJ2).gravity = 80;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParamsLJ2)) {
            ((DrawerLayout$LayoutParams) layoutParamsLJ2).gravity = 80;
        }
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setId(R.id.jv7);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        new k();
        k.LIZ("app:tux_iconWidth", new a.d("16", "dp"), tuxIconView);
        k.LIZ("app:tux_iconHeight", new a.d("16", "dp"), tuxIconView);
        k.LIZ("app:tux_icon", new a.b("2130773824", "raw"), tuxIconView);
        k.LIZ("app:tux_tintColor", new a.b("2131099768", "attr"), tuxIconView);
        android.view.a.LIZ(tuxIconView);
        if (tuxIconView.getParent() == null) {
            linearLayout.addView(tuxIconView, layoutParams);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.zfl);
        TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.ee});
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes2.getColor(0, 0));
        typedArrayObtainStyledAttributes2.recycle();
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.weight = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.setMarginStart((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P2_Semibold"), tuxTextView);
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            linearLayout.addView(tuxTextView, layoutParams2);
        }
        TuxIconView tuxIconView2 = new TuxIconView(context);
        tuxIconView2.setId(R.id.video_locked);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.setMarginStart((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.setMarginEnd((int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()));
        }
        new k();
        k.LIZ("app:tux_tintColor", new a.b("2131099768", "attr"), tuxIconView2);
        k.LIZ("app:tux_icon", new a.b("2130774215", "raw"), tuxIconView2);
        android.view.a.LIZ(tuxIconView2);
        if (tuxIconView2.getParent() == null) {
            linearLayout.addView(tuxIconView2, layoutParams3);
        }
        android.view.a.LIZ(linearLayout);
        if (linearLayout.getParent() == null) {
            fixedRatioFrameLayout.addView(linearLayout, layoutParamsLJ2);
        }
        View viewLIZ = C20742916Ex.LIZ(context, R.layout.ead, fixedRatioFrameLayout, false, R.layout.i6n);
        if (viewLIZ.getParent() == null) {
            fixedRatioFrameLayout.addView(viewLIZ);
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, R.style.xz);
        Resources resources2 = contextThemeWrapper.getResources();
        TuxIconView tuxIconView3 = new TuxIconView(contextThemeWrapper);
        tuxIconView3.setId(R.id.lcd);
        tuxIconView3.setImportantForAccessibility(2);
        C786410Ut5.LLLLLLZZ(tuxIconView3, 8);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ2 = android.view.a.LJ((int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()), fixedRatioFrameLayout);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            marginLayoutParamsLJ2.setMarginStart((int) TypedValue.applyDimension(1, 6.5f, resources2.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            marginLayoutParamsLJ2.topMargin = (int) TypedValue.applyDimension(1, 6.5f, resources2.getDisplayMetrics());
        }
        new k();
        k.LIZ("app:tux_icon", new a.b("2130772968", "raw"), tuxIconView3);
        k.LIZ("app:tux_tintColor", new a.b("2131099768", "attr"), tuxIconView3);
        android.view.a.LIZ(tuxIconView3);
        if (tuxIconView3.getParent() == null) {
            fixedRatioFrameLayout.addView(tuxIconView3, marginLayoutParamsLJ2);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setId(R.id.njb);
        linearLayout2.setOrientation(1);
        linearLayout2.setClipChildren(false);
        linearLayout2.setClipToPadding(false);
        C786410Ut5.LJLLLLLL(8, linearLayout2);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ3 = android.view.a.LJ(-2, -2, fixedRatioFrameLayout);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            marginLayoutParamsLJ3.setMarginStart((int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            marginLayoutParamsLJ3.topMargin = (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics());
        }
        View c21415018rM = new C21415018rM(context);
        c21415018rM.setId(R.id.ta6);
        c21415018rM.setImportantForAccessibility(2);
        c21415018rM.setPadding((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), c21415018rM.getPaddingTop(), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), c21415018rM.getPaddingBottom());
        c21415018rM.setPadding(c21415018rM.getPaddingLeft(), (int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()), c21415018rM.getPaddingRight(), (int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()));
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.gravity = 8388659;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams4)) {
            ((FrameLayout.LayoutParams) layoutParams4).gravity = 8388659;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams4)) {
            ((DrawerLayout$LayoutParams) layoutParams4).gravity = 8388659;
        }
        android.view.a.LIZ(c21415018rM);
        if (c21415018rM.getParent() == null) {
            linearLayout2.addView(c21415018rM, layoutParams4);
        }
        View view = new View(context);
        view.setId(R.id.ta7);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 7.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.setMarginStart((int) TypedValue.applyDimension(0, 0.5f, resources.getDisplayMetrics()));
        }
        android.view.a.LIZ(view);
        if (view.getParent() == null) {
            linearLayout2.addView(view, layoutParams5);
        }
        android.view.a.LIZ(linearLayout2);
        if (linearLayout2.getParent() == null) {
            fixedRatioFrameLayout.addView(linearLayout2, marginLayoutParamsLJ3);
        }
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setId(R.id.nb7);
        linearLayout3.setBackgroundResource(R.drawable.d0q);
        linearLayout3.setGravity(80);
        linearLayout3.setPadding(linearLayout3.getPaddingLeft(), linearLayout3.getPaddingTop(), linearLayout3.getPaddingRight(), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        C786410Ut5.LJLLLLLL(8, linearLayout3);
        ViewGroup.LayoutParams layoutParamsLJ3 = android.view.a.LJ(-1, (int) TypedValue.applyDimension(1, 50.0f, resources.getDisplayMetrics()), fixedRatioFrameLayout);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParamsLJ3)) {
            i = 80;
            ((LinearLayout.LayoutParams) layoutParamsLJ3).gravity = 80;
        } else {
            i = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParamsLJ3)) {
            ((FrameLayout.LayoutParams) layoutParamsLJ3).gravity = i;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParamsLJ3)) {
            ((DrawerLayout$LayoutParams) layoutParamsLJ3).gravity = i;
        }
        TuxIconView tuxIconView4 = new TuxIconView(context);
        tuxIconView4.setId(R.id.jx6);
        tuxIconView4.setImportantForAccessibility(2);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        new k();
        k.LIZ("app:tux_icon", new a.b("2130774599", "raw"), tuxIconView4);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.setMarginStart((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.setMarginEnd((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        }
        k.LIZ("app:tux_iconHeight", new a.d("14", "dp"), tuxIconView4);
        k.LIZ("app:tux_iconWidth", new a.d("14", "dp"), tuxIconView4);
        k.LIZ("app:tux_tintColor", new a.b("2131099768", "attr"), tuxIconView4);
        android.view.a.LIZ(tuxIconView4);
        if (tuxIconView4.getParent() == null) {
            linearLayout3.addView(tuxIconView4, layoutParams6);
        }
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.tv_timestamp);
        tuxTextView2.setImportantForAccessibility(2);
        TypedArray typedArrayObtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.ee});
        tuxTextView2.setTextColor(typedArrayObtainStyledAttributes3.getColor(0, 0));
        typedArrayObtainStyledAttributes3.recycle();
        tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView2.setMaxLines(1);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams7)) {
            layoutParams7.setMarginStart((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams7)) {
            layoutParams7.weight = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams7)) {
            layoutParams7.setMarginEnd((int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()));
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P2_Semibold"), tuxTextView2);
        o.LIZ("app:tux_minTextSize", new a.d("11", "sp"), tuxTextView2);
        android.view.a.LIZ(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            linearLayout3.addView(tuxTextView2, layoutParams7);
        }
        android.view.a.LIZ(linearLayout3);
        if (linearLayout3.getParent() == null) {
            fixedRatioFrameLayout.addView(linearLayout3, layoutParamsLJ3);
        }
        View frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.y4v);
        C786410Ut5.LJLLLLLL(8, frameLayout);
        ViewGroup.LayoutParams layoutParamsLJ4 = android.view.a.LJ(-1, -1, fixedRatioFrameLayout);
        android.view.a.LIZ(frameLayout);
        if (frameLayout.getParent() == null) {
            fixedRatioFrameLayout.addView(frameLayout, layoutParamsLJ4);
        }
        android.view.a.LIZ(fixedRatioFrameLayout);
        C786410Ut5.W5(fixedRatioFrameLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(fixedRatioFrameLayout);
        }
        return fixedRatioFrameLayout;
    }
}
