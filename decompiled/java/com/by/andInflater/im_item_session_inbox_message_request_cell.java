package com.by.andInflater;

import X.C19ME;
import X.C20742116Ep;
import X.C20742216Eq;
import X.C419060Gbw;
import X.C426770GoN;
import X.C427660Gpo;
import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.notice.api.view.MultiSelectConstraintLayout;
import com.zhiliaoapp.musically.R;
import dc.a;
import jf8.c;
import xem.d;
import xem.k;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class im_item_session_inbox_message_request_cell implements InterfaceC20742716Ev {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        Resources resources = context.getResources();
        MultiSelectConstraintLayout multiSelectConstraintLayout = new MultiSelectConstraintLayout(context, null);
        multiSelectConstraintLayout.setId(R.id.uuf);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -2, viewGroup);
        C427660Gpo c427660Gpo = new C427660Gpo(context);
        c427660Gpo.setId(R.id.bir);
        ViewGroup.LayoutParams layoutParamsLJ = a.LJ((int) TypedValue.applyDimension(1, 56.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 56.0f, resources.getDisplayMetrics()), multiSelectConstraintLayout);
        if (C19ME.class.isInstance(layoutParamsLJ)) {
            ((C19ME) layoutParamsLJ).topToTop = 0;
        }
        c cVar = new c();
        cVar.LIZIZ("app:roundingBorderWidth", new a.d("0.5", "dp"), c427660Gpo);
        cVar.LIZIZ("app:roundingBorderColor", new a.b("2131100103", "attr"), c427660Gpo);
        if (C19ME.class.isInstance(layoutParamsLJ)) {
            ((C19ME) layoutParamsLJ).startToStart = 0;
        }
        if (C19ME.class.isInstance(layoutParamsLJ)) {
            ((C19ME) layoutParamsLJ).bottomToBottom = 0;
        }
        cVar.LIZ(c427660Gpo);
        android.view.a.LIZ(c427660Gpo);
        if (c427660Gpo.getParent() == null) {
            multiSelectConstraintLayout.addView(c427660Gpo, layoutParamsLJ);
        }
        C419060Gbw c419060Gbw = new C419060Gbw(context, null);
        c419060Gbw.setId(R.id.y1z);
        c419060Gbw.setGravity(16);
        c419060Gbw.setOrientation(0);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ2 = android.view.a.LJ((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2, multiSelectConstraintLayout);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            marginLayoutParamsLJ2.setMarginStart((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ2)) {
            ((C19ME) marginLayoutParamsLJ2).startToEnd = R.id.bir;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ2)) {
            ((C19ME) marginLayoutParamsLJ2).bottomToBottom = R.id.jrc;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ2)) {
            ((C19ME) marginLayoutParamsLJ2).endToStart = R.id.g0q;
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.user_name);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setGravity(16);
        tuxTextView.setMaxLines(1);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1h});
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ3 = android.view.a.LJ(-2, (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()), c419060Gbw);
        new o();
        o.LIZ("app:tux_font", new a.c("P1_Semibold"), tuxTextView);
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            c419060Gbw.addView(tuxTextView, marginLayoutParamsLJ3);
        }
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setId(R.id.qgi);
        tuxIconView.setContentDescription("pin icon for the chat which is pinned");
        C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ4 = android.view.a.LJ((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), c419060Gbw);
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ4)) {
            i = 16;
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ4).gravity = 16;
        } else {
            i = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ4)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ4).gravity = i;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ4)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ4).gravity = i;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ4)) {
            marginLayoutParamsLJ4.setMarginStart((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        new k();
        k.LIZ("app:tux_icon", new a.b("2130774475", "raw"), tuxIconView);
        k.LIZ("app:tux_tintColor", new a.b("2131100625", "attr"), tuxIconView);
        android.view.a.LIZ(tuxIconView);
        if (tuxIconView.getParent() == null) {
            c419060Gbw.addView(tuxIconView, marginLayoutParamsLJ4);
        }
        android.view.a.LIZ(c419060Gbw);
        if (c419060Gbw.getParent() == null) {
            multiSelectConstraintLayout.addView(c419060Gbw, marginLayoutParamsLJ2);
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.evm);
        linearLayout.setOrientation(0);
        ViewGroup.LayoutParams layoutParamsLJ2 = android.view.a.LJ((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2, multiSelectConstraintLayout);
        if (C19ME.class.isInstance(layoutParamsLJ2)) {
            ((C19ME) layoutParamsLJ2).topToTop = R.id.jrc;
        }
        if (C19ME.class.isInstance(layoutParamsLJ2)) {
            ((C19ME) layoutParamsLJ2).startToStart = R.id.y1z;
        }
        if (C19ME.class.isInstance(layoutParamsLJ2)) {
            ((C19ME) layoutParamsLJ2).endToStart = R.id.g0q;
        }
        C419060Gbw c419060Gbw2 = new C419060Gbw(context, null);
        c419060Gbw2.setOrientation(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams)) {
            i2 = 16;
            layoutParams.gravity = 16;
        } else {
            i2 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = i2;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams)) {
            ((DrawerLayout$LayoutParams) layoutParams).gravity = i2;
        }
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.m69);
        tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView2.setMaxLines(1);
        tuxTextView2.setSingleLine(true);
        TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1k});
        tuxTextView2.setTextColor(typedArrayObtainStyledAttributes2.getColor(0, 0));
        typedArrayObtainStyledAttributes2.recycle();
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ5 = android.view.a.LJ(-2, (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()), c419060Gbw2);
        new o();
        o.LIZ("android:bufferType", new a.c("spannable"), tuxTextView2);
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ5)) {
            i3 = 16;
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ5).gravity = 16;
        } else {
            i3 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ5)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ5).gravity = i3;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ5)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ5).gravity = i3;
        }
        o.LIZ("app:tux_font", new a.c("P2_Regular"), tuxTextView2);
        android.view.a.LIZ(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            c419060Gbw2.addView(tuxTextView2, marginLayoutParamsLJ5);
        }
        android.view.a.LIZ(c419060Gbw2);
        if (c419060Gbw2.getParent() == null) {
            linearLayout.addView(c419060Gbw2, layoutParams);
        }
        android.view.a.LIZ(linearLayout);
        if (linearLayout.getParent() == null) {
            multiSelectConstraintLayout.addView(linearLayout, layoutParamsLJ2);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setId(R.id.g0q);
        linearLayout2.setGravity(17);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ6 = android.view.a.LJ((int) TypedValue.applyDimension(1, 42.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 42.0f, resources.getDisplayMetrics()), multiSelectConstraintLayout);
        if (C19ME.class.isInstance(marginLayoutParamsLJ6)) {
            i4 = 0;
            ((C19ME) marginLayoutParamsLJ6).topToTop = 0;
        } else {
            i4 = 0;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ6)) {
            ((C19ME) marginLayoutParamsLJ6).bottomToBottom = i4;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ6)) {
            ((C19ME) marginLayoutParamsLJ6).endToEnd = i4;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ6)) {
            marginLayoutParamsLJ6.setMarginStart((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        TuxIconView tuxIconView2 = new TuxIconView(context);
        tuxIconView2.setId(R.id.drc);
        tuxIconView2.setImportantForAccessibility(2);
        tuxIconView2.setFocusable(false);
        C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        new k();
        k.LIZ("app:tux_icon", new a.b("2130772913", "raw"), tuxIconView2);
        k.LIZ("app:tux_iconHeight", new a.d("16", "dp"), tuxIconView2);
        k.LIZ("app:tux_iconWidth", new a.d("16", "dp"), tuxIconView2);
        k.LIZ("app:tux_tintColor", new a.b("2131100622", "attr"), tuxIconView2);
        android.view.a.LIZ(tuxIconView2);
        if (tuxIconView2.getParent() == null) {
            linearLayout2.addView(tuxIconView2, layoutParams2);
        }
        C426770GoN c426770GoN = new C426770GoN(context, null, 6);
        c426770GoN.setId(R.id.tv_request_unread_count);
        C786410Ut5.LJLLLLLL(8, c426770GoN);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        new d();
        C20742116Ep.LIZ("app:tux_badgeMaxCount", new a.c("max99plus"), c426770GoN);
        C20742116Ep.LIZ("app:tux_badgeVariant", new a.c("number"), c426770GoN);
        android.view.a.LIZ(c426770GoN);
        if (c426770GoN.getParent() == null) {
            linearLayout2.addView(c426770GoN, layoutParams3);
        }
        android.view.a.LIZ(linearLayout2);
        if (linearLayout2.getParent() == null) {
            multiSelectConstraintLayout.addView(linearLayout2, marginLayoutParamsLJ6);
        }
        View c20742216Eq = new C20742216Eq(context);
        c20742216Eq.setId(R.id.jrc);
        ViewGroup.LayoutParams layoutParamsLJ3 = android.view.a.LJ(-2, -2, multiSelectConstraintLayout);
        if (C19ME.class.isInstance(layoutParamsLJ3)) {
            ((C19ME) layoutParamsLJ3).orientation = 0;
        }
        if (C19ME.class.isInstance(layoutParamsLJ3)) {
            ((C19ME) layoutParamsLJ3).guidePercent = 0.5f;
        }
        android.view.a.LIZ(c20742216Eq);
        if (c20742216Eq.getParent() == null) {
            multiSelectConstraintLayout.addView(c20742216Eq, layoutParamsLJ3);
        }
        android.view.a.LIZ(multiSelectConstraintLayout);
        C786410Ut5.W5(multiSelectConstraintLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(multiSelectConstraintLayout);
        }
        return multiSelectConstraintLayout;
    }
}
