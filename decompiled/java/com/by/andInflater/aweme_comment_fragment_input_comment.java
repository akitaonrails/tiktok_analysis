package com.by.andInflater;

import X.C0SXO;
import X.C1341720l1G;
import X.C1348840lCk;
import X.C20742916Ex;
import X.C726240SeE;
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
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.comment.keyboard.ui.ClipLinearLayout;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.k;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class aweme_comment_fragment_input_comment implements InterfaceC20742716Ev {
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
        int i9;
        int i10;
        int i11;
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.m_o);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -1, viewGroup);
        View view = new View(context);
        view.setId(R.id.bnu);
        C786410Ut5.T4(view, 0.0f);
        view.setBackgroundColor(resources.getColor(R.color.ip));
        C786410Ut5.LJLLLLLL(8, view);
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        a.LIZ(view);
        if (view.getParent() == null) {
            frameLayout.addView(view, layoutParams);
        }
        View view2 = new View(context);
        view2.setId(R.id.pvy);
        C786410Ut5.T4(view2, 0.0f);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1_});
        view2.setBackgroundColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        C786410Ut5.LJLLLLLL(8, view2);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        a.LIZ(view2);
        if (view2.getParent() == null) {
            frameLayout.addView(view2, layoutParams2);
        }
        C1348840lCk c1348840lCk = new C1348840lCk(context, null);
        c1348840lCk.setId(R.id.pw0);
        c1348840lCk.setFitsSystemWindows(true);
        c1348840lCk.setOrientation(1);
        ViewGroup.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.iyz);
        C786410Ut5.LJLLLLLL(8, frameLayout2);
        ViewGroup.LayoutParams layoutParamsLJ = a.LJ(-1, -1, c1348840lCk);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, R.style.xm);
        Resources resources2 = contextThemeWrapper.getResources();
        FrameLayout frameLayout3 = new FrameLayout(contextThemeWrapper);
        frameLayout3.setId(R.id.iyx);
        frameLayout3.setBackgroundResource(R.drawable.af5);
        C786410Ut5.LJLLLLLL(8, frameLayout3);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 540.0f, resources.getDisplayMetrics()), -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams4)) {
            ((LinearLayout.LayoutParams) layoutParams4).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.gravity = 17;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams4)) {
            ((DrawerLayout$LayoutParams) layoutParams4).gravity = 17;
        }
        TuxIconView tuxIconView = new TuxIconView(contextThemeWrapper);
        tuxIconView.setId(R.id.iyy);
        tuxIconView.setPadding((int) TypedValue.applyDimension(1, 16.0f, resources2.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources2.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources2.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources2.getDisplayMetrics()));
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 56.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 56.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams5)) {
            ((LinearLayout.LayoutParams) layoutParams5).gravity = 8388613;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.gravity = 8388613;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams5)) {
            ((DrawerLayout$LayoutParams) layoutParams5).gravity = 8388613;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.setMarginEnd((int) TypedValue.applyDimension(1, 4.0f, resources2.getDisplayMetrics()));
        }
        new k();
        k.LIZ("app:tux_icon", new a.b("2130775055", "raw"), tuxIconView);
        k.LIZ("app:tux_tintColor", new a.b("2131100622", "attr"), tuxIconView);
        android.view.a.LIZ(tuxIconView);
        if (tuxIconView.getParent() == null) {
            frameLayout3.addView(tuxIconView, layoutParams5);
        }
        android.view.a.LIZ(frameLayout3);
        if (frameLayout3.getParent() == null) {
            frameLayout2.addView(frameLayout3, layoutParams4);
        }
        android.view.a.LIZ(frameLayout2);
        if (frameLayout2.getParent() == null) {
            c1348840lCk.addView(frameLayout2, layoutParamsLJ);
        }
        View view3 = new View(context);
        view3.setId(R.id.pvz);
        ViewGroup.LayoutParams layoutParamsLJ2 = android.view.a.LJ(-1, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), c1348840lCk);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParamsLJ2)) {
            ((LinearLayout.LayoutParams) layoutParamsLJ2).weight = 1;
        }
        android.view.a.LIZ(view3);
        if (view3.getParent() == null) {
            c1348840lCk.addView(view3, layoutParamsLJ2);
        }
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout4.setId(R.id.pvw);
        ViewGroup.LayoutParams layoutParamsLJ3 = android.view.a.LJ(-1, -2, c1348840lCk);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParamsLJ3)) {
            ((LinearLayout.LayoutParams) layoutParamsLJ3).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParamsLJ3)) {
            ((FrameLayout.LayoutParams) layoutParamsLJ3).gravity = 80;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParamsLJ3)) {
            ((DrawerLayout$LayoutParams) layoutParamsLJ3).gravity = 80;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.mbj);
        linearLayout.setOrientation(1);
        ViewGroup.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, -2);
        FrameLayout frameLayout5 = new FrameLayout(context);
        frameLayout5.setId(R.id.mba);
        TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.oh});
        frameLayout5.setBackgroundColor(typedArrayObtainStyledAttributes2.getColor(0, 0));
        typedArrayObtainStyledAttributes2.recycle();
        frameLayout5.setPadding((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), frameLayout5.getPaddingTop(), frameLayout5.getPaddingRight(), frameLayout5.getPaddingBottom());
        frameLayout5.setPadding(frameLayout5.getPaddingLeft(), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), frameLayout5.getPaddingRight(), frameLayout5.getPaddingBottom());
        frameLayout5.setPadding(frameLayout5.getPaddingLeft(), frameLayout5.getPaddingTop(), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), frameLayout5.getPaddingBottom());
        frameLayout5.setPadding(frameLayout5.getPaddingLeft(), frameLayout5.getPaddingTop(), frameLayout5.getPaddingRight(), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        C786410Ut5.LJLLLLLL(8, frameLayout5);
        ViewGroup.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, -2);
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.xmr);
        tuxTextView.setGravity(17);
        TypedArray typedArrayObtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.ee});
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes3.getColor(0, 0));
        typedArrayObtainStyledAttributes3.recycle();
        FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams8)) {
            i = 17;
            ((LinearLayout.LayoutParams) layoutParams8).gravity = 17;
        } else {
            i = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams8)) {
            layoutParams8.gravity = i;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams8)) {
            ((DrawerLayout$LayoutParams) layoutParams8).gravity = i;
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P1_Regular"), tuxTextView);
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            frameLayout5.addView(tuxTextView, layoutParams8);
        }
        android.view.a.LIZ(frameLayout5);
        if (frameLayout5.getParent() == null) {
            linearLayout.addView(frameLayout5, layoutParams7);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setId(R.id.eqx);
        linearLayout2.setOrientation(1);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-1, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams9)) {
            i2 = 80;
            layoutParams9.gravity = 80;
        } else {
            i2 = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams9)) {
            ((FrameLayout.LayoutParams) layoutParams9).gravity = i2;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams9)) {
            ((DrawerLayout$LayoutParams) layoutParams9).gravity = i2;
        }
        FrameLayout frameLayout6 = new FrameLayout(context);
        frameLayout6.setId(R.id.y_b);
        LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams10)) {
            layoutParams10.weight = 1;
        }
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setId(R.id.nk7);
        linearLayout3.setPadding(linearLayout3.getPaddingLeft(), linearLayout3.getPaddingTop(), linearLayout3.getPaddingRight(), (int) TypedValue.applyDimension(1, 85.0f, resources.getDisplayMetrics()));
        C786410Ut5.T4(linearLayout3, 0.0f);
        linearLayout3.setGravity(1);
        linearLayout3.setOrientation(1);
        C786410Ut5.LJLLLLLL(8, linearLayout3);
        FrameLayout.LayoutParams layoutParams11 = new FrameLayout.LayoutParams(-1, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams11)) {
            i3 = 80;
            ((LinearLayout.LayoutParams) layoutParams11).gravity = 80;
        } else {
            i3 = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams11)) {
            layoutParams11.gravity = i3;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams11)) {
            ((DrawerLayout$LayoutParams) layoutParams11).gravity = i3;
        }
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.tvw_forward_emoji_tip);
        TypedArray typedArrayObtainStyledAttributes4 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.ee});
        tuxTextView2.setTextColor(typedArrayObtainStyledAttributes4.getColor(0, 0));
        typedArrayObtainStyledAttributes4.recycle();
        LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams12)) {
            i4 = 1;
            layoutParams12.gravity = 1;
        } else {
            i4 = 1;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams12)) {
            ((FrameLayout.LayoutParams) layoutParams12).gravity = i4;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams12)) {
            ((DrawerLayout$LayoutParams) layoutParams12).gravity = i4;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams12)) {
            ((ViewGroup.MarginLayoutParams) layoutParams12).bottomMargin = (int) TypedValue.applyDimension(i4, 16.0f, resources.getDisplayMetrics());
        }
        new o();
        o.LIZ("app:tux_font", new a.c("H4_Regular"), tuxTextView2);
        android.view.a.LIZ(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            linearLayout3.addView(tuxTextView2, layoutParams12);
        }
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setId(R.id.idg);
        linearLayout4.setOrientation(1);
        ViewGroup.LayoutParams layoutParams13 = new LinearLayout.LayoutParams(-2, -2);
        android.view.a.LIZ(linearLayout4);
        if (linearLayout4.getParent() == null) {
            linearLayout3.addView(linearLayout4, layoutParams13);
        }
        android.view.a.LIZ(linearLayout3);
        if (linearLayout3.getParent() == null) {
            frameLayout6.addView(linearLayout3, layoutParams11);
        }
        TuxTextView tuxTextView3 = new TuxTextView(context);
        tuxTextView3.setId(R.id.yz9);
        tuxTextView3.setGravity(17);
        tuxTextView3.setText(2131858045);
        TypedArray typedArrayObtainStyledAttributes5 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.ef});
        tuxTextView3.setTextColor(typedArrayObtainStyledAttributes5.getColor(0, 0));
        typedArrayObtainStyledAttributes5.recycle();
        C786410Ut5.LJLLLLLL(8, tuxTextView3);
        FrameLayout.LayoutParams layoutParams14 = new FrameLayout.LayoutParams(-1, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams14)) {
            i5 = 1;
            ((LinearLayout.LayoutParams) layoutParams14).gravity = 1;
        } else {
            i5 = 1;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams14)) {
            layoutParams14.gravity = i5;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams14)) {
            ((DrawerLayout$LayoutParams) layoutParams14).gravity = i5;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams14)) {
            layoutParams14.setMarginStart((int) TypedValue.applyDimension(i5, 32.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams14)) {
            layoutParams14.setMarginEnd((int) TypedValue.applyDimension(i5, 32.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams14)) {
            ((ViewGroup.MarginLayoutParams) layoutParams14).bottomMargin = (int) TypedValue.applyDimension(i5, 12.0f, resources.getDisplayMetrics());
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P1_Regular"), tuxTextView3);
        android.view.a.LIZ(tuxTextView3);
        if (tuxTextView3.getParent() == null) {
            frameLayout6.addView(tuxTextView3, layoutParams14);
        }
        View c1341720l1G = new C1341720l1G(context, null);
        c1341720l1G.setId(R.id.um8);
        c1341720l1G.setBackgroundResource(R.drawable.ae9);
        FrameLayout.LayoutParams layoutParams15 = new FrameLayout.LayoutParams(-1, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams15)) {
            i6 = 80;
            ((LinearLayout.LayoutParams) layoutParams15).gravity = 80;
        } else {
            i6 = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams15)) {
            layoutParams15.gravity = i6;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams15)) {
            ((DrawerLayout$LayoutParams) layoutParams15).gravity = i6;
        }
        android.view.a.LIZ(c1341720l1G);
        if (c1341720l1G.getParent() == null) {
            frameLayout6.addView(c1341720l1G, layoutParams15);
        }
        View frameLayout7 = new FrameLayout(context);
        frameLayout7.setId(R.id.ec9);
        FrameLayout.LayoutParams layoutParams16 = new FrameLayout.LayoutParams(-1, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams16)) {
            i7 = 80;
            ((LinearLayout.LayoutParams) layoutParams16).gravity = 80;
        } else {
            i7 = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams16)) {
            layoutParams16.gravity = i7;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams16)) {
            ((DrawerLayout$LayoutParams) layoutParams16).gravity = i7;
        }
        android.view.a.LIZ(frameLayout7);
        if (frameLayout7.getParent() == null) {
            frameLayout6.addView(frameLayout7, layoutParams16);
        }
        LinearLayout linearLayout5 = new LinearLayout(context);
        linearLayout5.setId(R.id.nk8);
        linearLayout5.setBackgroundResource(R.drawable.ae9);
        linearLayout5.setClickable(true);
        linearLayout5.setGravity(16);
        linearLayout5.setOrientation(0);
        linearLayout5.setPadding((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), linearLayout5.getPaddingTop(), linearLayout5.getPaddingRight(), linearLayout5.getPaddingBottom());
        linearLayout5.setPadding(linearLayout5.getPaddingLeft(), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), linearLayout5.getPaddingRight(), linearLayout5.getPaddingBottom());
        linearLayout5.setPadding(linearLayout5.getPaddingLeft(), linearLayout5.getPaddingTop(), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), linearLayout5.getPaddingBottom());
        linearLayout5.setPadding(linearLayout5.getPaddingLeft(), linearLayout5.getPaddingTop(), linearLayout5.getPaddingRight(), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        C786410Ut5.LJLLLLLL(8, linearLayout5);
        FrameLayout.LayoutParams layoutParams17 = new FrameLayout.LayoutParams(-1, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams17)) {
            i8 = 80;
            ((LinearLayout.LayoutParams) layoutParams17).gravity = 80;
        } else {
            i8 = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams17)) {
            layoutParams17.gravity = i8;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams17)) {
            ((DrawerLayout$LayoutParams) layoutParams17).gravity = i8;
        }
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setImageResource(R.drawable.afb);
        LinearLayout.LayoutParams layoutParams18 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams18)) {
            ((ViewGroup.MarginLayoutParams) layoutParams18).rightMargin = (int) TypedValue.applyDimension(1, 3.5f, resources.getDisplayMetrics());
        }
        android.view.a.LIZ(appCompatImageView);
        if (appCompatImageView.getParent() == null) {
            linearLayout5.addView(appCompatImageView, layoutParams18);
        }
        TuxTextView tuxTextView4 = new TuxTextView(context);
        tuxTextView4.setId(R.id.tvw_forward_tip);
        tuxTextView4.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        tuxTextView4.setSingleLine(true);
        TypedArray typedArrayObtainStyledAttributes6 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1k});
        tuxTextView4.setTextColor(typedArrayObtainStyledAttributes6.getColor(0, 0));
        typedArrayObtainStyledAttributes6.recycle();
        LinearLayout.LayoutParams layoutParams19 = new LinearLayout.LayoutParams(-2, -2);
        new o();
        o.LIZ("app:tux_font", new a.c("P2_Regular"), tuxTextView4);
        android.view.a.LIZ(tuxTextView4);
        if (tuxTextView4.getParent() == null) {
            linearLayout5.addView(tuxTextView4, layoutParams19);
        }
        android.view.a.LIZ(linearLayout5);
        if (linearLayout5.getParent() == null) {
            frameLayout6.addView(linearLayout5, layoutParams17);
        }
        C726240SeE c726240SeE = new C726240SeE(context);
        c726240SeE.setId(R.id.vs_collapse_title_container);
        c726240SeE.setInflatedId(R.id.y1v);
        c726240SeE.setLayoutResource(R.layout.a2h);
        c726240SeE.setExperimentImplementation(new C0SXO());
        FrameLayout.LayoutParams layoutParams20 = new FrameLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams20)) {
            i9 = 80;
            ((LinearLayout.LayoutParams) layoutParams20).gravity = 80;
        } else {
            i9 = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams20)) {
            layoutParams20.gravity = i9;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams20)) {
            ((DrawerLayout$LayoutParams) layoutParams20).gravity = i9;
        }
        android.view.a.LIZ(c726240SeE);
        if (c726240SeE.getParent() == null) {
            frameLayout6.addView(c726240SeE, layoutParams20);
        }
        android.view.a.LIZ(frameLayout6);
        if (frameLayout6.getParent() == null) {
            linearLayout2.addView(frameLayout6, layoutParams10);
        }
        LinearLayout linearLayout6 = new LinearLayout(context);
        linearLayout6.setId(R.id.kqf);
        linearLayout6.setBackgroundResource(R.drawable.aed);
        linearLayout6.setOrientation(1);
        ViewGroup.LayoutParams layoutParams21 = new LinearLayout.LayoutParams(-1, -2);
        View view4 = new View(context);
        view4.setId(R.id.wxh);
        TypedArray typedArrayObtainStyledAttributes7 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.nf});
        view4.setBackgroundColor(typedArrayObtainStyledAttributes7.getColor(0, 0));
        typedArrayObtainStyledAttributes7.recycle();
        ViewGroup.LayoutParams layoutParams22 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()));
        android.view.a.LIZ(view4);
        if (view4.getParent() == null) {
            linearLayout6.addView(view4, layoutParams22);
        }
        View frameLayout8 = new FrameLayout(context);
        frameLayout8.setPadding(frameLayout8.getPaddingLeft(), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), frameLayout8.getPaddingRight(), frameLayout8.getPaddingBottom());
        C786410Ut5.LJLLLLLL(8, frameLayout8);
        frameLayout8.setId(R.id.odz);
        ViewGroup.LayoutParams layoutParams23 = new LinearLayout.LayoutParams(-1, -2);
        android.view.a.LIZ(frameLayout8);
        if (frameLayout8.getParent() == null) {
            linearLayout6.addView(frameLayout8, layoutParams23);
        }
        View viewLIZ = C20742916Ex.LIZ(context, R.layout.a1m, linearLayout6, false, 0);
        viewLIZ.setId(R.id.ea2);
        ViewGroup.LayoutParams layoutParams24 = new LinearLayout.LayoutParams(-1, -2);
        if (viewLIZ.getParent() == null) {
            linearLayout6.addView(viewLIZ, layoutParams24);
        }
        View viewLIZ2 = C20742916Ex.LIZ(context, R.layout.a4p, linearLayout6, false, 0);
        viewLIZ2.setId(R.id.vca);
        C786410Ut5.LJLLLLLL(8, viewLIZ2);
        LinearLayout.LayoutParams layoutParams25 = new LinearLayout.LayoutParams(-1, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams25)) {
            layoutParams25.gravity = 8388627;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams25)) {
            ((FrameLayout.LayoutParams) layoutParams25).gravity = 8388627;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams25)) {
            ((DrawerLayout$LayoutParams) layoutParams25).gravity = 8388627;
        }
        if (viewLIZ2.getParent() == null) {
            linearLayout6.addView(viewLIZ2, layoutParams25);
        }
        View frameLayout9 = new FrameLayout(context);
        C786410Ut5.LJLLLLLL(8, frameLayout9);
        frameLayout9.setId(R.id.oe0);
        ViewGroup.LayoutParams layoutParams26 = new LinearLayout.LayoutParams(-1, -2);
        android.view.a.LIZ(frameLayout9);
        if (frameLayout9.getParent() == null) {
            linearLayout6.addView(frameLayout9, layoutParams26);
        }
        FrameLayout frameLayout10 = new FrameLayout(context);
        frameLayout10.setId(R.id.mb7);
        C786410Ut5.LJLLLLLL(8, frameLayout10);
        LinearLayout.LayoutParams layoutParams27 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 60.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 60.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams27)) {
            layoutParams27.setMarginStart((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams27)) {
            ((ViewGroup.MarginLayoutParams) layoutParams27).leftMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        }
        RemoteImageView remoteImageView = new RemoteImageView(context);
        remoteImageView.setId(R.id.ivj);
        ViewGroup.LayoutParams layoutParams28 = new FrameLayout.LayoutParams(-1, -1);
        bc.a aVar = new bc.a();
        aVar.LIZLLL("app:actualImageScaleType", new a.c("centerCrop"), remoteImageView);
        aVar.LIZLLL("app:fadeDuration", new a.c("300"), remoteImageView);
        aVar.LIZLLL("app:roundWithOverlayColor", new a.b("2131099768", "attr"), remoteImageView);
        aVar.LIZLLL("app:roundedCornerRadius", new a.d("2", "dp"), remoteImageView);
        aVar.LIZLLL("app:roundingBorderColor", new a.b("2131100102", "attr"), remoteImageView);
        aVar.LIZLLL("app:roundingBorderWidth", new a.d("0.5", "dp"), remoteImageView);
        aVar.LIZJ(remoteImageView);
        android.view.a.LIZ(remoteImageView);
        if (remoteImageView.getParent() == null) {
            frameLayout10.addView(remoteImageView, layoutParams28);
        }
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context);
        appCompatImageView2.setId(R.id.ivk);
        appCompatImageView2.setPadding((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), appCompatImageView2.getPaddingTop(), appCompatImageView2.getPaddingRight(), appCompatImageView2.getPaddingBottom());
        appCompatImageView2.setPadding((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), appCompatImageView2.getPaddingTop(), appCompatImageView2.getPaddingRight(), appCompatImageView2.getPaddingBottom());
        appCompatImageView2.setPadding(appCompatImageView2.getPaddingLeft(), appCompatImageView2.getPaddingTop(), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), appCompatImageView2.getPaddingBottom());
        appCompatImageView2.setPadding(appCompatImageView2.getPaddingLeft(), appCompatImageView2.getPaddingTop(), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), appCompatImageView2.getPaddingBottom());
        appCompatImageView2.setPadding(appCompatImageView2.getPaddingLeft(), appCompatImageView2.getPaddingTop(), appCompatImageView2.getPaddingRight(), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        appCompatImageView2.setImageResource(R.drawable.afd);
        C786410Ut5.LJZI(8, appCompatImageView2);
        FrameLayout.LayoutParams layoutParams29 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams29)) {
            i10 = 8388613;
            ((LinearLayout.LayoutParams) layoutParams29).gravity = 8388613;
        } else {
            i10 = 8388613;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams29)) {
            layoutParams29.gravity = i10;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams29)) {
            ((DrawerLayout$LayoutParams) layoutParams29).gravity = i10;
        }
        android.view.a.LIZ(appCompatImageView2);
        if (appCompatImageView2.getParent() == null) {
            frameLayout10.addView(appCompatImageView2, layoutParams29);
        }
        android.view.a.LIZ(frameLayout10);
        if (frameLayout10.getParent() == null) {
            linearLayout6.addView(frameLayout10, layoutParams27);
        }
        LinearLayout linearLayout7 = new LinearLayout(context);
        linearLayout7.setId(R.id.h05);
        linearLayout7.setOrientation(1);
        C786410Ut5.LJLLLLLL(8, linearLayout7);
        ViewGroup.LayoutParams layoutParams30 = new LinearLayout.LayoutParams(-1, (int) resources.getDimension(R.dimen.x2));
        android.view.a.LIZ(linearLayout7);
        if (linearLayout7.getParent() == null) {
            linearLayout6.addView(linearLayout7, layoutParams30);
        }
        LinearLayout linearLayout8 = new LinearLayout(context);
        linearLayout8.setId(R.id.iyw);
        linearLayout8.setOrientation(1);
        C786410Ut5.LJLLLLLL(8, linearLayout8);
        ViewGroup.LayoutParams layoutParams31 = new LinearLayout.LayoutParams(-1, -2);
        android.view.a.LIZ(linearLayout8);
        if (linearLayout8.getParent() == null) {
            linearLayout6.addView(linearLayout8, layoutParams31);
        }
        View frameLayout11 = new FrameLayout(context);
        frameLayout11.setPadding(frameLayout11.getPaddingLeft(), frameLayout11.getPaddingTop(), frameLayout11.getPaddingRight(), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        C786410Ut5.LJLLLLLL(8, frameLayout11);
        frameLayout11.setId(R.id.oe1);
        ViewGroup.LayoutParams layoutParams32 = new LinearLayout.LayoutParams(-1, -2);
        android.view.a.LIZ(frameLayout11);
        if (frameLayout11.getParent() == null) {
            linearLayout6.addView(frameLayout11, layoutParams32);
        }
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        horizontalScrollView.setId(R.id.wrs);
        C786410Ut5.LJLLLLLL(8, horizontalScrollView);
        ViewGroup.LayoutParams layoutParams33 = new LinearLayout.LayoutParams(-1, -2);
        ClipLinearLayout clipLinearLayout = new ClipLinearLayout(context, null);
        clipLinearLayout.setOrientation(0);
        ViewGroup.LayoutParams layoutParamsLJ4 = android.view.a.LJ(-2, -2, horizontalScrollView);
        View viewLIZ3 = C20742916Ex.LIZ(context, R.layout.a36, clipLinearLayout, false, 0);
        viewLIZ3.setId(R.id.nak);
        C786410Ut5.LJLLLLLL(8, viewLIZ3);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ2 = android.view.a.LJ(-2, -2, clipLinearLayout);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            i11 = 1;
            marginLayoutParamsLJ2.setMarginStart((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        } else {
            i11 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            marginLayoutParamsLJ2.topMargin = (int) TypedValue.applyDimension(i11, 8.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            marginLayoutParamsLJ2.setMarginEnd((int) TypedValue.applyDimension(i11, 24.0f, resources.getDisplayMetrics()));
        }
        if (viewLIZ3.getParent() == null) {
            clipLinearLayout.addView(viewLIZ3, marginLayoutParamsLJ2);
        }
        ClipLinearLayout clipLinearLayout2 = new ClipLinearLayout(context, null);
        clipLinearLayout2.setId(R.id.q1j);
        clipLinearLayout2.setOrientation(1);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ3 = android.view.a.LJ(-1, (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), clipLinearLayout);
        android.view.a.LIZ(clipLinearLayout2);
        if (clipLinearLayout2.getParent() == null) {
            clipLinearLayout.addView(clipLinearLayout2, marginLayoutParamsLJ3);
        }
        android.view.a.LIZ(clipLinearLayout);
        if (clipLinearLayout.getParent() == null) {
            horizontalScrollView.addView(clipLinearLayout, layoutParamsLJ4);
        }
        android.view.a.LIZ(horizontalScrollView);
        if (horizontalScrollView.getParent() == null) {
            linearLayout6.addView(horizontalScrollView, layoutParams33);
        }
        android.view.a.LIZ(linearLayout6);
        if (linearLayout6.getParent() == null) {
            linearLayout2.addView(linearLayout6, layoutParams21);
        }
        android.view.a.LIZ(linearLayout2);
        if (linearLayout2.getParent() == null) {
            linearLayout.addView(linearLayout2, layoutParams9);
        }
        android.view.a.LIZ(linearLayout);
        if (linearLayout.getParent() == null) {
            frameLayout4.addView(linearLayout, layoutParams6);
        }
        android.view.a.LIZ(frameLayout4);
        if (frameLayout4.getParent() == null) {
            c1348840lCk.addView(frameLayout4, layoutParamsLJ3);
        }
        android.view.a.LIZ(c1348840lCk);
        if (c1348840lCk.getParent() == null) {
            frameLayout.addView(c1348840lCk, layoutParams3);
        }
        AppCompatImageView appCompatImageView3 = new AppCompatImageView(context);
        appCompatImageView3.setId(R.id.ivl);
        C786410Ut5.LJZI(8, appCompatImageView3);
        ViewGroup.LayoutParams layoutParams34 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 60.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 60.0f, resources.getDisplayMetrics()));
        android.view.a.LIZ(appCompatImageView3);
        if (appCompatImageView3.getParent() == null) {
            frameLayout.addView(appCompatImageView3, layoutParams34);
        }
        android.view.a.LIZ(frameLayout);
        C786410Ut5.W5(frameLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        return frameLayout;
    }
}
