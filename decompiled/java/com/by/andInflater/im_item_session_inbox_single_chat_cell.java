package com.by.andInflater;

import X.C0HZQ;
import X.C19ME;
import X.C20742216Eq;
import X.C418430Gav;
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
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.notice.api.view.MultiSelectConstraintLayout;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.k;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class im_item_session_inbox_single_chat_cell implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        int i2;
        Resources resources = context.getResources();
        MultiSelectConstraintLayout multiSelectConstraintLayout = new MultiSelectConstraintLayout(context, null);
        multiSelectConstraintLayout.setId(R.id.uuf);
        multiSelectConstraintLayout.setClipChildren(false);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -2, viewGroup);
        View c0hzq = new C0HZQ(context);
        c0hzq.setId(R.id.onw);
        C786410Ut5.LJLLLLLL(8, c0hzq);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ2 = a.LJ(-2, -2, multiSelectConstraintLayout);
        if (C19ME.class.isInstance(marginLayoutParamsLJ2)) {
            ((C19ME) marginLayoutParamsLJ2).topToTop = 0;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ2)) {
            ((C19ME) marginLayoutParamsLJ2).bottomToBottom = 0;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ2)) {
            ((C19ME) marginLayoutParamsLJ2).startToStart = 0;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            marginLayoutParamsLJ2.setMarginStart((int) resources.getDimension(R.dimen.sf));
        }
        a.LIZ(c0hzq);
        if (c0hzq.getParent() == null) {
            multiSelectConstraintLayout.addView(c0hzq, marginLayoutParamsLJ2);
        }
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setId(R.id.g0s);
        C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        tuxIconView.setContentDescription("starred icon for starred chat cell");
        ViewGroup.LayoutParams layoutParamsLJ = a.LJ((int) resources.getDimension(R.dimen.s9), (int) resources.getDimension(R.dimen.a0k), multiSelectConstraintLayout);
        if (C19ME.class.isInstance(layoutParamsLJ)) {
            ((C19ME) layoutParamsLJ).bottomToBottom = 0;
        }
        if (C19ME.class.isInstance(layoutParamsLJ)) {
            ((C19ME) layoutParamsLJ).topToTop = 0;
        }
        if (C19ME.class.isInstance(layoutParamsLJ)) {
            ((C19ME) layoutParamsLJ).endToStart = R.id.uud;
        }
        new k();
        k.LIZ("app:tux_icon", new a.b("2130774733", "raw"), tuxIconView);
        k.LIZ("app:tux_tintColor", new a.b("2131100321", "attr"), tuxIconView);
        android.view.a.LIZ(tuxIconView);
        if (tuxIconView.getParent() == null) {
            multiSelectConstraintLayout.addView(tuxIconView, layoutParamsLJ);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.uud);
        if (TextView.class.isInstance(frameLayout)) {
            android.view.a.LJII((int) TypedValue.applyDimension(1, 64.0f, resources.getDisplayMetrics()), frameLayout);
        } else {
            frameLayout.setMinimumWidth((int) TypedValue.applyDimension(1, 64.0f, resources.getDisplayMetrics()));
        }
        if (TextView.class.isInstance(frameLayout)) {
            android.view.a.LJI((int) TypedValue.applyDimension(1, 64.0f, resources.getDisplayMetrics()), frameLayout);
        } else {
            frameLayout.setMinimumHeight((int) TypedValue.applyDimension(1, 64.0f, resources.getDisplayMetrics()));
        }
        frameLayout.setClipChildren(false);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ3 = android.view.a.LJ(-2, -2, multiSelectConstraintLayout);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            marginLayoutParamsLJ3.setMarginStart((int) resources.getDimension(R.dimen.sb));
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ3)) {
            ((C19ME) marginLayoutParamsLJ3).topToTop = 0;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ3)) {
            ((C19ME) marginLayoutParamsLJ3).bottomToBottom = 0;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ3)) {
            ((C19ME) marginLayoutParamsLJ3).startToStart = 0;
        }
        android.view.a.LIZ(frameLayout);
        if (frameLayout.getParent() == null) {
            multiSelectConstraintLayout.addView(frameLayout, marginLayoutParamsLJ3);
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.vbv);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(16);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ4 = android.view.a.LJ((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2, multiSelectConstraintLayout);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ4)) {
            marginLayoutParamsLJ4.setMarginStart((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ4)) {
            ((C19ME) marginLayoutParamsLJ4).startToEnd = R.id.uud;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ4)) {
            ((C19ME) marginLayoutParamsLJ4).endToStart = R.id.g0q;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ4)) {
            ((C19ME) marginLayoutParamsLJ4).bottomToBottom = 0;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ4)) {
            ((C19ME) marginLayoutParamsLJ4).topToTop = 0;
        }
        C418430Gav c418430Gav = new C418430Gav(context);
        c418430Gav.setId(R.id.y1z);
        c418430Gav.setGravity(16);
        c418430Gav.setOrientation(0);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        TuxIconView tuxIconView2 = new TuxIconView(context);
        tuxIconView2.setId(R.id.xfv);
        tuxIconView2.setContentDescription("tcm icon for tcm account chat");
        C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ5 = android.view.a.LJ((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()), c418430Gav);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ5)) {
            marginLayoutParamsLJ5.setMarginEnd((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()));
        }
        new k();
        k.LIZ("android:ellipsize", new a.c("end"), tuxIconView2);
        k.LIZ("app:tux_icon", new a.b("2130773848", "raw"), tuxIconView2);
        k.LIZ("app:tux_tintColor", new a.b("2131100121", "attr"), tuxIconView2);
        android.view.a.LIZ(tuxIconView2);
        if (tuxIconView2.getParent() == null) {
            c418430Gav.addView(tuxIconView2, marginLayoutParamsLJ5);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.user_name);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setMaxLines(1);
        if (TextView.class.isInstance(tuxTextView)) {
            android.view.a.LJI((int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()), tuxTextView);
        } else {
            tuxTextView.setMinimumHeight((int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1h});
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        ViewGroup.LayoutParams layoutParamsLJ2 = android.view.a.LJ(-2, -2, c418430Gav);
        new o();
        o.LIZ("android:labelFor", new a.b("null", "+id"), tuxTextView);
        o.LIZ("app:tux_font", new a.c("P1_Semibold"), tuxTextView);
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            c418430Gav.addView(tuxTextView, layoutParamsLJ2);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setId(R.id.uug);
        linearLayout2.setGravity(16);
        if (TextView.class.isInstance(linearLayout2)) {
            android.view.a.LJI((int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()), linearLayout2);
        } else {
            linearLayout2.setMinimumHeight((int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        }
        ViewGroup.LayoutParams layoutParamsLJ3 = android.view.a.LJ(-2, -2, c418430Gav);
        View frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.wa6);
        ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        android.view.a.LIZ(frameLayout2);
        if (frameLayout2.getParent() == null) {
            linearLayout2.addView(frameLayout2, layoutParams2);
        }
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setId(R.id.m82);
        linearLayout3.setGravity(16);
        linearLayout3.setOrientation(0);
        ViewGroup.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        TuxIconView tuxIconView3 = new TuxIconView(context);
        tuxIconView3.setId(R.id.c3y);
        tuxIconView3.setContentDescription("block icon for the chat whose related user has been blocked");
        C786410Ut5.LLLLLLZZ(tuxIconView3, 8);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.setMarginStart((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        new k();
        k.LIZ("app:tux_icon", new a.b("2130772720", "raw"), tuxIconView3);
        k.LIZ("app:tux_tintColor", new a.b("2131100625", "attr"), tuxIconView3);
        android.view.a.LIZ(tuxIconView3);
        if (tuxIconView3.getParent() == null) {
            linearLayout3.addView(tuxIconView3, layoutParams4);
        }
        TuxIconView tuxIconView4 = new TuxIconView(context);
        tuxIconView4.setId(R.id.qgi);
        tuxIconView4.setContentDescription("pin icon for the chat which is pinned");
        C786410Ut5.LLLLLLZZ(tuxIconView4, 8);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.setMarginStart((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        new k();
        k.LIZ("app:tux_icon", new a.b("2130774475", "raw"), tuxIconView4);
        k.LIZ("app:tux_tintColor", new a.b("2131100625", "attr"), tuxIconView4);
        android.view.a.LIZ(tuxIconView4);
        if (tuxIconView4.getParent() == null) {
            linearLayout3.addView(tuxIconView4, layoutParams5);
        }
        android.view.a.LIZ(linearLayout3);
        if (linearLayout3.getParent() == null) {
            linearLayout2.addView(linearLayout3, layoutParams3);
        }
        android.view.a.LIZ(linearLayout2);
        if (linearLayout2.getParent() == null) {
            c418430Gav.addView(linearLayout2, layoutParamsLJ3);
        }
        android.view.a.LIZ(c418430Gav);
        if (c418430Gav.getParent() == null) {
            linearLayout.addView(c418430Gav, layoutParams);
        }
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setId(R.id.evm);
        linearLayout4.setGravity(16);
        linearLayout4.setOrientation(0);
        ViewGroup.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
        TuxIconView tuxIconView5 = new TuxIconView(context);
        tuxIconView5.setId(R.id.lun);
        C786410Ut5.LLLLLLZZ(tuxIconView5, 8);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams7)) {
            layoutParams7.setMarginEnd((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        android.view.a.LIZ(tuxIconView5);
        if (tuxIconView5.getParent() == null) {
            linearLayout4.addView(tuxIconView5, layoutParams7);
        }
        C418430Gav c418430Gav2 = new C418430Gav(context);
        c418430Gav2.setId(R.id.gy3);
        c418430Gav2.setGravity(16);
        c418430Gav2.setOrientation(0);
        ViewGroup.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, -2);
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.m69);
        tuxTextView2.setGravity(16);
        if (TextView.class.isInstance(tuxTextView2)) {
            android.view.a.LJI((int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()), tuxTextView2);
        } else {
            tuxTextView2.setMinimumHeight((int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        }
        tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView2.setMaxLines(1);
        tuxTextView2.setSingleLine(true);
        TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1k});
        tuxTextView2.setTextColor(typedArrayObtainStyledAttributes2.getColor(0, 0));
        typedArrayObtainStyledAttributes2.recycle();
        ViewGroup.LayoutParams layoutParamsLJ4 = android.view.a.LJ(-2, -2, c418430Gav2);
        new o();
        o.LIZ("android:bufferType", new a.c("spannable"), tuxTextView2);
        o.LIZ("app:tux_font", new a.c("P2_Regular"), tuxTextView2);
        android.view.a.LIZ(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            c418430Gav2.addView(tuxTextView2, layoutParamsLJ4);
        }
        LinearLayout linearLayout5 = new LinearLayout(context);
        linearLayout5.setId(R.id.rpy);
        linearLayout5.setGravity(16);
        ViewGroup.LayoutParams layoutParamsLJ5 = android.view.a.LJ(-2, -2, c418430Gav2);
        TuxTextView tuxTextView3 = new TuxTextView(context);
        tuxTextView3.setId(R.id.m6e);
        tuxTextView3.setGravity(16);
        if (TextView.class.isInstance(tuxTextView3)) {
            i = 1;
            android.view.a.LJI((int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()), tuxTextView3);
        } else {
            i = 1;
            tuxTextView3.setMinimumHeight((int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        }
        int[] iArr = new int[i];
        iArr[0] = R.attr.a1k;
        TypedArray typedArrayObtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(iArr);
        tuxTextView3.setTextColor(typedArrayObtainStyledAttributes3.getColor(0, 0));
        typedArrayObtainStyledAttributes3.recycle();
        C786410Ut5.LJLLLLLL(8, tuxTextView3);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-2, -2);
        new o();
        o.LIZ("app:tux_font", new a.c("P2_Regular"), tuxTextView3);
        android.view.a.LIZ(tuxTextView3);
        if (tuxTextView3.getParent() == null) {
            linearLayout5.addView(tuxTextView3, layoutParams9);
        }
        TuxIconView tuxIconView6 = new TuxIconView(context);
        tuxIconView6.setId(R.id.oy5);
        tuxIconView6.setContentDescription("mute icon alongside the content");
        C786410Ut5.LLLLLLZZ(tuxIconView6, 8);
        LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams10)) {
            layoutParams10.setMarginStart((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        new k();
        k.LIZ("app:tux_icon", new a.b("2130772551", "raw"), tuxIconView6);
        k.LIZ("app:tux_tintColor", new a.b("2131100625", "attr"), tuxIconView6);
        android.view.a.LIZ(tuxIconView6);
        if (tuxIconView6.getParent() == null) {
            linearLayout5.addView(tuxIconView6, layoutParams10);
        }
        android.view.a.LIZ(linearLayout5);
        if (linearLayout5.getParent() == null) {
            c418430Gav2.addView(linearLayout5, layoutParamsLJ5);
        }
        android.view.a.LIZ(c418430Gav2);
        if (c418430Gav2.getParent() == null) {
            linearLayout4.addView(c418430Gav2, layoutParams8);
        }
        android.view.a.LIZ(linearLayout4);
        if (linearLayout4.getParent() == null) {
            linearLayout.addView(linearLayout4, layoutParams6);
        }
        LinearLayout linearLayout6 = new LinearLayout(context);
        linearLayout6.setId(R.id.g0o);
        linearLayout6.setOrientation(0);
        C786410Ut5.LJLLLLLL(8, linearLayout6);
        ViewGroup.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(-1, -2);
        android.view.a.LIZ(linearLayout6);
        if (linearLayout6.getParent() == null) {
            linearLayout.addView(linearLayout6, layoutParams11);
        }
        android.view.a.LIZ(linearLayout);
        if (linearLayout.getParent() == null) {
            multiSelectConstraintLayout.addView(linearLayout, marginLayoutParamsLJ4);
        }
        LinearLayout linearLayout7 = new LinearLayout(context);
        linearLayout7.setId(R.id.g0q);
        if (TextView.class.isInstance(linearLayout7)) {
            android.view.a.LJII((int) TypedValue.applyDimension(1, 60.0f, resources.getDisplayMetrics()), linearLayout7);
        } else {
            linearLayout7.setMinimumWidth((int) TypedValue.applyDimension(1, 60.0f, resources.getDisplayMetrics()));
        }
        linearLayout7.setGravity(17);
        linearLayout7.setOrientation(0);
        linearLayout7.setPadding((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), linearLayout7.getPaddingTop(), linearLayout7.getPaddingRight(), linearLayout7.getPaddingBottom());
        linearLayout7.setPadding(linearLayout7.getPaddingLeft(), linearLayout7.getPaddingTop(), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), linearLayout7.getPaddingBottom());
        linearLayout7.setClickable(true);
        ViewGroup.LayoutParams layoutParamsLJ6 = android.view.a.LJ(-2, (int) TypedValue.applyDimension(1, 72.0f, resources.getDisplayMetrics()), multiSelectConstraintLayout);
        if (C19ME.class.isInstance(layoutParamsLJ6)) {
            i2 = R.id.uuf;
            ((C19ME) layoutParamsLJ6).topToTop = R.id.uuf;
        } else {
            i2 = R.id.uuf;
        }
        if (C19ME.class.isInstance(layoutParamsLJ6)) {
            ((C19ME) layoutParamsLJ6).bottomToBottom = i2;
        }
        if (C19ME.class.isInstance(layoutParamsLJ6)) {
            ((C19ME) layoutParamsLJ6).endToEnd = i2;
        }
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setId(R.id.g0t);
        LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(-2, -2);
        android.view.a.LIZ(frameLayout3);
        if (frameLayout3.getParent() == null) {
            linearLayout7.addView(frameLayout3, layoutParams12);
        }
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout4.setId(R.id.g0p);
        LinearLayout.LayoutParams layoutParams13 = new LinearLayout.LayoutParams(-2, -2);
        android.view.a.LIZ(frameLayout4);
        if (frameLayout4.getParent() == null) {
            linearLayout7.addView(frameLayout4, layoutParams13);
        }
        android.view.a.LIZ(linearLayout7);
        if (linearLayout7.getParent() == null) {
            multiSelectConstraintLayout.addView(linearLayout7, layoutParamsLJ6);
        }
        View c20742216Eq = new C20742216Eq(context);
        c20742216Eq.setId(R.id.vertical_guide_line);
        ViewGroup.LayoutParams layoutParamsLJ7 = android.view.a.LJ(-2, -2, multiSelectConstraintLayout);
        if (C19ME.class.isInstance(layoutParamsLJ7)) {
            ((C19ME) layoutParamsLJ7).orientation = 1;
        }
        if (C19ME.class.isInstance(layoutParamsLJ7)) {
            ((C19ME) layoutParamsLJ7).guideEnd = (int) TypedValue.applyDimension(1, 60.0f, resources.getDisplayMetrics());
        }
        android.view.a.LIZ(c20742216Eq);
        if (c20742216Eq.getParent() == null) {
            multiSelectConstraintLayout.addView(c20742216Eq, layoutParamsLJ7);
        }
        View c20742216Eq2 = new C20742216Eq(context);
        c20742216Eq2.setId(R.id.jrc);
        ViewGroup.LayoutParams layoutParamsLJ8 = android.view.a.LJ(-2, -2, multiSelectConstraintLayout);
        if (C19ME.class.isInstance(layoutParamsLJ8)) {
            ((C19ME) layoutParamsLJ8).orientation = 0;
        }
        if (C19ME.class.isInstance(layoutParamsLJ8)) {
            ((C19ME) layoutParamsLJ8).guidePercent = 0.5f;
        }
        android.view.a.LIZ(c20742216Eq2);
        if (c20742216Eq2.getParent() == null) {
            multiSelectConstraintLayout.addView(c20742216Eq2, layoutParamsLJ8);
        }
        View c20742216Eq3 = new C20742216Eq(context);
        c20742216Eq3.setId(R.id.vertical_margin_guide_line);
        ViewGroup.LayoutParams layoutParamsLJ9 = android.view.a.LJ(-2, -2, multiSelectConstraintLayout);
        if (C19ME.class.isInstance(layoutParamsLJ9)) {
            ((C19ME) layoutParamsLJ9).orientation = 1;
        }
        if (C19ME.class.isInstance(layoutParamsLJ9)) {
            ((C19ME) layoutParamsLJ9).guideEnd = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        android.view.a.LIZ(c20742216Eq3);
        if (c20742216Eq3.getParent() == null) {
            multiSelectConstraintLayout.addView(c20742216Eq3, layoutParamsLJ9);
        }
        android.view.a.LIZ(multiSelectConstraintLayout);
        C786410Ut5.W5(multiSelectConstraintLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(multiSelectConstraintLayout);
        }
        return multiSelectConstraintLayout;
    }
}
