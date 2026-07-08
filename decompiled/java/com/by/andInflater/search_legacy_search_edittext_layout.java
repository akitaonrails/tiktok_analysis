package com.by.andInflater;

import X.C0I7D;
import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.j;
import xem.k;

/* JADX INFO: loaded from: classes32.dex */
public class search_legacy_search_edittext_layout implements InterfaceC20742716Ev {
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
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.i6q);
        frameLayout.setBackgroundResource(R.drawable.d4p);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, (int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()), viewGroup);
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setId(R.id.ltz);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((LinearLayout.LayoutParams) layoutParams).gravity = 8388627;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.gravity = 8388627;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams)) {
            ((DrawerLayout$LayoutParams) layoutParams).gravity = 8388627;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            layoutParams.setMarginStart((int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics());
        }
        new k();
        k.LIZ("app:tux_icon", new a.b("2130774228", "raw"), tuxIconView);
        k.LIZ("app:tux_tintColor", new a.b("2131100622", "attr"), tuxIconView);
        android.view.a.LIZ(tuxIconView);
        if (tuxIconView.getParent() == null) {
            frameLayout.addView(tuxIconView, layoutParams);
        }
        C0I7D c0i7d = new C0I7D(context, null, 6, 0);
        c0i7d.setId(R.id.hdi);
        c0i7d.setEllipsize(TextUtils.TruncateAt.END);
        c0i7d.setFocusable(true);
        c0i7d.setFocusableInTouchMode(true);
        c0i7d.setGravity(8388627);
        c0i7d.setImeOptions(3);
        c0i7d.setPadding((int) TypedValue.applyDimension(1, 32.5f, resources.getDisplayMetrics()), c0i7d.getPaddingTop(), c0i7d.getPaddingRight(), c0i7d.getPaddingBottom());
        c0i7d.setPadding(c0i7d.getPaddingLeft(), c0i7d.getPaddingTop(), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), c0i7d.getPaddingBottom());
        c0i7d.setSingleLine(true);
        c0i7d.setTextAlignment(5);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1h});
        c0i7d.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        c0i7d.setHintTextColor(android.view.a.LIZIZ(R.attr.a1k, context));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
            i = 8388627;
            ((LinearLayout.LayoutParams) layoutParams2).gravity = 8388627;
        } else {
            i = 8388627;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.gravity = i;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams2)) {
            ((DrawerLayout$LayoutParams) layoutParams2).gravity = i;
        }
        new j();
        j.LIZ("android:cursorVisible", new a.c("false"), c0i7d);
        j.LIZ("app:tux_font", new a.c("H4_Regular"), c0i7d);
        android.view.a.LIZ(c0i7d);
        if (c0i7d.getParent() == null) {
            frameLayout.addView(c0i7d, layoutParams2);
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.jp2);
        linearLayout.setGravity(16);
        linearLayout.setPadding(linearLayout.getPaddingLeft(), (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), linearLayout.getPaddingRight(), linearLayout.getPaddingBottom());
        C786410Ut5.LJLLLLLL(8, linearLayout);
        C786410Ut5.T4(linearLayout, 0.5f);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams3)) {
            ((LinearLayout.LayoutParams) layoutParams3).gravity = 8388629;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.gravity = 8388629;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams3)) {
            ((DrawerLayout$LayoutParams) layoutParams3).gravity = 8388629;
        }
        android.view.a.LIZ(linearLayout);
        if (linearLayout.getParent() == null) {
            frameLayout.addView(linearLayout, layoutParams3);
        }
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(R.id.u7b);
        viewStub.setLayoutResource(R.layout.etm);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams4)) {
            ((LinearLayout.LayoutParams) layoutParams4).gravity = 8388629;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.gravity = 8388629;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams4)) {
            ((DrawerLayout$LayoutParams) layoutParams4).gravity = 8388629;
        }
        viewStub.setInflatedId(-1);
        android.view.a.LIZ(viewStub);
        if (viewStub.getParent() == null) {
            frameLayout.addView(viewStub, layoutParams4);
        }
        TuxIconView tuxIconView2 = new TuxIconView(context);
        tuxIconView2.setId(R.id.cwr);
        tuxIconView2.setClickable(true);
        tuxIconView2.setContentDescription(context.getResources().getString(2131858376));
        tuxIconView2.setFocusable(true);
        C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams5)) {
            i2 = 8388629;
            ((LinearLayout.LayoutParams) layoutParams5).gravity = 8388629;
        } else {
            i2 = 8388629;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.gravity = i2;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams5)) {
            ((DrawerLayout$LayoutParams) layoutParams5).gravity = i2;
        }
        new k();
        k.LIZ("app:tux_iconHeight", new a.d("24", "dp"), tuxIconView2);
        k.LIZ("app:tux_iconWidth", new a.d("24", "dp"), tuxIconView2);
        k.LIZ("app:tux_icon", new a.b("2130774295", "raw"), tuxIconView2);
        k.LIZ("app:tux_tintColor", new a.b("2131100622", "attr"), tuxIconView2);
        android.view.a.LIZ(tuxIconView2);
        if (tuxIconView2.getParent() == null) {
            frameLayout.addView(tuxIconView2, layoutParams5);
        }
        TuxIconView tuxIconView3 = new TuxIconView(context);
        tuxIconView3.setId(R.id.cwq);
        tuxIconView3.setClickable(true);
        tuxIconView3.setFocusable(true);
        C786410Ut5.LLLLLLZZ(tuxIconView3, 8);
        tuxIconView3.setContentDescription(context.getResources().getString(2131858276));
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 30.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 30.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams6)) {
            i3 = 8388629;
            ((LinearLayout.LayoutParams) layoutParams6).gravity = 8388629;
        } else {
            i3 = 8388629;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.gravity = i3;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams6)) {
            ((DrawerLayout$LayoutParams) layoutParams6).gravity = i3;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.setMarginEnd((int) resources.getDimension(R.dimen.t8));
        }
        new k();
        k.LIZ("app:tux_iconHeight", new a.b("2131296911", "dimen"), tuxIconView3);
        k.LIZ("app:tux_iconWidth", new a.b("2131296911", "dimen"), tuxIconView3);
        k.LIZ("app:tux_icon", new a.b("2130772806", "raw"), tuxIconView3);
        k.LIZ("app:tux_tintColor", new a.b("2131100355", "attr"), tuxIconView3);
        android.view.a.LIZ(tuxIconView3);
        if (tuxIconView3.getParent() == null) {
            frameLayout.addView(tuxIconView3, layoutParams6);
        }
        TuxIconView tuxIconView4 = new TuxIconView(context);
        tuxIconView4.setId(R.id.ctn);
        C786410Ut5.LLLLLLZZ(tuxIconView4, 8);
        FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams7)) {
            i4 = 8388629;
            ((LinearLayout.LayoutParams) layoutParams7).gravity = 8388629;
        } else {
            i4 = 8388629;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams7)) {
            layoutParams7.gravity = i4;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams7)) {
            ((DrawerLayout$LayoutParams) layoutParams7).gravity = i4;
        }
        android.view.a.LIZ(tuxIconView4);
        if (tuxIconView4.getParent() == null) {
            frameLayout.addView(tuxIconView4, layoutParams7);
        }
        TuxIconView tuxIconView5 = new TuxIconView(context);
        tuxIconView5.setId(R.id.cor);
        tuxIconView5.setContentDescription(context.getResources().getString(2131823352));
        C786410Ut5.LLLLLLZZ(tuxIconView5, 8);
        FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams8)) {
            i5 = 8388629;
            ((LinearLayout.LayoutParams) layoutParams8).gravity = 8388629;
        } else {
            i5 = 8388629;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams8)) {
            layoutParams8.gravity = i5;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams8)) {
            ((DrawerLayout$LayoutParams) layoutParams8).gravity = i5;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams8)) {
            layoutParams8.setMarginEnd((int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()));
        }
        new k();
        k.LIZ("app:tux_icon", new a.b("2130775057", "raw"), tuxIconView5);
        k.LIZ("app:tux_tintColor", new a.b("2131100630", "attr"), tuxIconView5);
        android.view.a.LIZ(tuxIconView5);
        if (tuxIconView5.getParent() == null) {
            frameLayout.addView(tuxIconView5, layoutParams8);
        }
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R.id.dc1);
        C786410Ut5.LJZI(8, appCompatImageView);
        FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams9)) {
            i6 = 8388629;
            ((LinearLayout.LayoutParams) layoutParams9).gravity = 8388629;
        } else {
            i6 = 8388629;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams9)) {
            layoutParams9.gravity = i6;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams9)) {
            ((DrawerLayout$LayoutParams) layoutParams9).gravity = i6;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams9)) {
            layoutParams9.setMarginEnd((int) TypedValue.applyDimension(1, 30.0f, resources.getDisplayMetrics()));
        }
        android.view.a.LIZ(appCompatImageView);
        if (appCompatImageView.getParent() == null) {
            frameLayout.addView(appCompatImageView, layoutParams9);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setId(R.id.ng9);
        linearLayout2.setGravity(16);
        linearLayout2.setOrientation(0);
        C786410Ut5.LJLLLLLL(8, linearLayout2);
        FrameLayout.LayoutParams layoutParams10 = new FrameLayout.LayoutParams(-2, -1);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams10)) {
            i7 = 8388627;
            ((LinearLayout.LayoutParams) layoutParams10).gravity = 8388627;
        } else {
            i7 = 8388627;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams10)) {
            layoutParams10.gravity = i7;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams10)) {
            ((DrawerLayout$LayoutParams) layoutParams10).gravity = i7;
        }
        android.view.a.LIZ(linearLayout2);
        if (linearLayout2.getParent() == null) {
            frameLayout.addView(linearLayout2, layoutParams10);
        }
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setId(R.id.ng_);
        linearLayout3.setGravity(16);
        linearLayout3.setOrientation(0);
        C786410Ut5.LJLLLLLL(8, linearLayout3);
        FrameLayout.LayoutParams layoutParams11 = new FrameLayout.LayoutParams(-2, -1);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams11)) {
            ((LinearLayout.LayoutParams) layoutParams11).gravity = i6;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams11)) {
            layoutParams11.gravity = i6;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams11)) {
            ((DrawerLayout$LayoutParams) layoutParams11).gravity = i6;
        }
        android.view.a.LIZ(linearLayout3);
        if (linearLayout3.getParent() == null) {
            frameLayout.addView(linearLayout3, layoutParams11);
        }
        android.view.a.LIZ(frameLayout);
        C786410Ut5.W5(frameLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        return frameLayout;
    }
}
