package com.by.andInflater;

import X.C197039127h;
import X.C19ME;
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
import android.view.ViewStub;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.ss.android.ugc.aweme.views.RoundingCornerLayoutCL;
import com.zhiliaoapp.musically.R;
import dc.a;
import jf8.c;
import xem.f;
import xem.k;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class im_aweme_video_card_content implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        float f;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f2;
        int i7;
        int i8;
        float f3;
        int i9;
        int i10;
        int i11;
        Resources resources = context.getResources();
        RoundingCornerLayoutCL roundingCornerLayoutCL = new RoundingCornerLayoutCL(context);
        roundingCornerLayoutCL.setId(R.id.evm);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ((int) TypedValue.applyDimension(1, 162.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 216.0f, resources.getDisplayMetrics()), viewGroup);
        SmartImageView smartImageView = new SmartImageView(context);
        smartImageView.setId(R.id.f58);
        ViewGroup.LayoutParams layoutParamsLJ = a.LJ(-1, -1, roundingCornerLayoutCL);
        c cVar = new c();
        cVar.LIZIZ("app:actualImageScaleType", new a.c("centerCrop"), smartImageView);
        if (C19ME.class.isInstance(layoutParamsLJ)) {
            ((C19ME) layoutParamsLJ).bottomToTop = 0;
        }
        if (C19ME.class.isInstance(layoutParamsLJ)) {
            ((C19ME) layoutParamsLJ).topToTop = 0;
        }
        cVar.LIZIZ("app:placeholderImageScaleType", new a.c("centerCrop"), smartImageView);
        cVar.LIZ(smartImageView);
        android.view.a.LIZ(smartImageView);
        if (smartImageView.getParent() == null) {
            roundingCornerLayoutCL.addView(smartImageView, layoutParamsLJ);
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.tyi);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setPadding((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        ViewGroup.LayoutParams layoutParamsLJ2 = android.view.a.LJ(-2, -1, roundingCornerLayoutCL);
        if (C19ME.class.isInstance(layoutParamsLJ2)) {
            ((C19ME) layoutParamsLJ2).bottomToBottom = 0;
        }
        if (C19ME.class.isInstance(layoutParamsLJ2)) {
            ((C19ME) layoutParamsLJ2).endToEnd = 0;
        }
        if (C19ME.class.isInstance(layoutParamsLJ2)) {
            ((C19ME) layoutParamsLJ2).startToStart = 0;
        }
        if (C19ME.class.isInstance(layoutParamsLJ2)) {
            ((C19ME) layoutParamsLJ2).topToTop = 0;
        }
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setId(R.id.evb);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        new k();
        k.LIZ("app:tux_icon", new a.b("2130774088", "raw"), tuxIconView);
        k.LIZ("app:tux_tintColor", new a.b("2131100630", "attr"), tuxIconView);
        android.view.a.LIZ(tuxIconView);
        if (tuxIconView.getParent() == null) {
            linearLayout.addView(tuxIconView, layoutParams);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.evc);
        tuxTextView.setGravity(17);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1j});
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P2_Regular"), tuxTextView);
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            linearLayout.addView(tuxTextView, layoutParams2);
        }
        android.view.a.LIZ(linearLayout);
        if (linearLayout.getParent() == null) {
            roundingCornerLayoutCL.addView(linearLayout, layoutParamsLJ2);
        }
        TuxIconView tuxIconView2 = new TuxIconView(context);
        tuxIconView2.setId(R.id.qcw);
        C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
        tuxIconView2.setImportantForAccessibility(2);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ2 = android.view.a.LJ((int) TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()), roundingCornerLayoutCL);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            f = 12.0f;
            marginLayoutParamsLJ2.setMarginEnd((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        } else {
            f = 12.0f;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            marginLayoutParamsLJ2.topMargin = (int) TypedValue.applyDimension(1, f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            marginLayoutParamsLJ2.setMarginStart((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ2)) {
            i = 0;
            ((C19ME) marginLayoutParamsLJ2).endToEnd = 0;
        } else {
            i = 0;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ2)) {
            ((C19ME) marginLayoutParamsLJ2).topToTop = i;
        }
        new k();
        k.LIZ("app:tux_icon", new a.b("2130773995", "raw"), tuxIconView2);
        k.LIZ("app:tux_iconShadow", new a.c("true"), tuxIconView2);
        k.LIZ("app:tux_tintColor", new a.b("2131099768", "attr"), tuxIconView2);
        android.view.a.LIZ(tuxIconView2);
        if (tuxIconView2.getParent() == null) {
            roundingCornerLayoutCL.addView(tuxIconView2, marginLayoutParamsLJ2);
        }
        View tuxSpinner = new TuxSpinner(context);
        tuxSpinner.setId(R.id.nnd);
        ViewGroup.LayoutParams layoutParamsLJ3 = android.view.a.LJ((int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()), roundingCornerLayoutCL);
        if (C19ME.class.isInstance(layoutParamsLJ3)) {
            i2 = 0;
            ((C19ME) layoutParamsLJ3).bottomToBottom = 0;
        } else {
            i2 = 0;
        }
        if (C19ME.class.isInstance(layoutParamsLJ3)) {
            ((C19ME) layoutParamsLJ3).endToEnd = i2;
        }
        if (C19ME.class.isInstance(layoutParamsLJ3)) {
            ((C19ME) layoutParamsLJ3).startToStart = i2;
        }
        if (C19ME.class.isInstance(layoutParamsLJ3)) {
            ((C19ME) layoutParamsLJ3).topToTop = i2;
        }
        android.view.a.LIZ(tuxSpinner);
        if (tuxSpinner.getParent() == null) {
            roundingCornerLayoutCL.addView(tuxSpinner, layoutParamsLJ3);
        }
        TuxIconView tuxIconView3 = new TuxIconView(context);
        tuxIconView3.setId(R.id.xvv);
        tuxIconView3.setImportantForAccessibility(2);
        ViewGroup.LayoutParams layoutParamsLJ4 = android.view.a.LJ((int) TypedValue.applyDimension(1, 100.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 100.0f, resources.getDisplayMetrics()), roundingCornerLayoutCL);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParamsLJ4)) {
            i3 = 17;
            ((LinearLayout.LayoutParams) layoutParamsLJ4).gravity = 17;
        } else {
            i3 = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParamsLJ4)) {
            ((FrameLayout.LayoutParams) layoutParamsLJ4).gravity = i3;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParamsLJ4)) {
            ((DrawerLayout$LayoutParams) layoutParamsLJ4).gravity = i3;
        }
        new k();
        k.LIZ("app:tux_icon", new a.b("2130772229", "raw"), tuxIconView3);
        k.LIZ("app:tux_tintColor", new a.b("2131099671", "attr"), tuxIconView3);
        if (C19ME.class.isInstance(layoutParamsLJ4)) {
            i4 = 0;
            ((C19ME) layoutParamsLJ4).bottomToBottom = 0;
        } else {
            i4 = 0;
        }
        if (C19ME.class.isInstance(layoutParamsLJ4)) {
            ((C19ME) layoutParamsLJ4).endToEnd = i4;
        }
        if (C19ME.class.isInstance(layoutParamsLJ4)) {
            ((C19ME) layoutParamsLJ4).startToStart = i4;
        }
        if (C19ME.class.isInstance(layoutParamsLJ4)) {
            ((C19ME) layoutParamsLJ4).topToTop = i4;
        }
        android.view.a.LIZ(tuxIconView3);
        if (tuxIconView3.getParent() == null) {
            roundingCornerLayoutCL.addView(tuxIconView3, layoutParamsLJ4);
        }
        TuxIconView tuxIconView4 = new TuxIconView(context);
        tuxIconView4.setId(R.id.lr3);
        tuxIconView4.setImportantForAccessibility(2);
        ViewGroup.LayoutParams layoutParamsLJ5 = android.view.a.LJ((int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()), roundingCornerLayoutCL);
        new k();
        k.LIZ("app:tux_icon", new a.b("2130774488", "raw"), tuxIconView4);
        k.LIZ("app:tux_iconShadow", new a.c("true"), tuxIconView4);
        k.LIZ("app:tux_tintColor", new a.b("2131099768", "attr"), tuxIconView4);
        if (C19ME.class.isInstance(layoutParamsLJ5)) {
            ((C19ME) layoutParamsLJ5).bottomToBottom = R.id.cbe;
        }
        if (C19ME.class.isInstance(layoutParamsLJ5)) {
            i5 = 0;
            ((C19ME) layoutParamsLJ5).endToEnd = 0;
        } else {
            i5 = 0;
        }
        if (C19ME.class.isInstance(layoutParamsLJ5)) {
            ((C19ME) layoutParamsLJ5).startToStart = i5;
        }
        if (C19ME.class.isInstance(layoutParamsLJ5)) {
            ((C19ME) layoutParamsLJ5).topToTop = i5;
        }
        android.view.a.LIZ(tuxIconView4);
        if (tuxIconView4.getParent() == null) {
            roundingCornerLayoutCL.addView(tuxIconView4, layoutParamsLJ5);
        }
        View appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R.id.cbe);
        appCompatImageView.setBackgroundResource(R.drawable.c9p);
        ViewGroup.LayoutParams layoutParamsLJ6 = android.view.a.LJ((int) TypedValue.applyDimension(1, 180.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), roundingCornerLayoutCL);
        if (C19ME.class.isInstance(layoutParamsLJ6)) {
            ((C19ME) layoutParamsLJ6).bottomToTop = R.id.azo;
        }
        if (C19ME.class.isInstance(layoutParamsLJ6)) {
            i6 = 0;
            ((C19ME) layoutParamsLJ6).endToEnd = 0;
        } else {
            i6 = 0;
        }
        if (C19ME.class.isInstance(layoutParamsLJ6)) {
            ((C19ME) layoutParamsLJ6).startToStart = i6;
        }
        android.view.a.LIZ(appCompatImageView);
        if (appCompatImageView.getParent() == null) {
            roundingCornerLayoutCL.addView(appCompatImageView, layoutParamsLJ6);
        }
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(R.id.ydv);
        viewStub.setLayoutResource(R.layout.ceu);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ3 = android.view.a.LJ(-2, -2, roundingCornerLayoutCL);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            f2 = 12.0f;
            i7 = 1;
            marginLayoutParamsLJ3.setMarginStart((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        } else {
            f2 = 12.0f;
            i7 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            marginLayoutParamsLJ3.topMargin = (int) TypedValue.applyDimension(i7, f2, resources.getDisplayMetrics());
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ3)) {
            i8 = 0;
            ((C19ME) marginLayoutParamsLJ3).topToTop = 0;
        } else {
            i8 = 0;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ3)) {
            ((C19ME) marginLayoutParamsLJ3).startToStart = i8;
        }
        viewStub.setInflatedId(-1);
        android.view.a.LIZ(viewStub);
        if (viewStub.getParent() == null) {
            roundingCornerLayoutCL.addView(viewStub, marginLayoutParamsLJ3);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setId(R.id.cce);
        linearLayout2.setOrientation(i7);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ4 = android.view.a.LJ(-1, -2, roundingCornerLayoutCL);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ4)) {
            f3 = 12.0f;
            marginLayoutParamsLJ4.setMarginStart((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        } else {
            f3 = 12.0f;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ4)) {
            marginLayoutParamsLJ4.bottomMargin = (int) TypedValue.applyDimension(1, f3, resources.getDisplayMetrics());
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ4)) {
            ((C19ME) marginLayoutParamsLJ4).bottomToTop = R.id.azo;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ4)) {
            i9 = 0;
            ((C19ME) marginLayoutParamsLJ4).endToEnd = 0;
        } else {
            i9 = 0;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ4)) {
            ((C19ME) marginLayoutParamsLJ4).startToStart = i9;
        }
        ViewStub viewStub2 = new ViewStub(context);
        viewStub2.setId(R.id.warning_notice_tag_stub);
        viewStub2.setLayoutResource(R.layout.cew);
        ViewGroup.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        viewStub2.setInflatedId(-1);
        android.view.a.LIZ(viewStub2);
        if (viewStub2.getParent() == null) {
            linearLayout2.addView(viewStub2, layoutParams3);
        }
        ViewStub viewStub3 = new ViewStub(context);
        viewStub3.setId(R.id.warning_notice_tv_stub);
        viewStub3.setLayoutResource(R.layout.cex);
        ViewGroup.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        viewStub3.setInflatedId(-1);
        android.view.a.LIZ(viewStub3);
        if (viewStub3.getParent() == null) {
            linearLayout2.addView(viewStub3, layoutParams4);
        }
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setId(R.id.bc4);
        linearLayout3.setGravity(16);
        linearLayout3.setOrientation(0);
        ViewGroup.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        C427660Gpo c427660Gpo = new C427660Gpo(context);
        c427660Gpo.setId(R.id.eum);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        android.view.a.LIZ(c427660Gpo);
        if (c427660Gpo.getParent() == null) {
            linearLayout3.addView(c427660Gpo, layoutParams6);
        }
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.ew2);
        tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView2.setGravity(8388627);
        tuxTextView2.setMaxLines(1);
        tuxTextView2.setTextAlignment(5);
        TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.ee});
        tuxTextView2.setTextColor(typedArrayObtainStyledAttributes2.getColor(0, 0));
        typedArrayObtainStyledAttributes2.recycle();
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 116.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams7)) {
            layoutParams7.setMarginStart((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P2_Semibold"), tuxTextView2);
        android.view.a.LIZ(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            linearLayout3.addView(tuxTextView2, layoutParams7);
        }
        android.view.a.LIZ(linearLayout3);
        if (linearLayout3.getParent() == null) {
            linearLayout2.addView(linearLayout3, layoutParams5);
        }
        android.view.a.LIZ(linearLayout2);
        if (linearLayout2.getParent() == null) {
            roundingCornerLayoutCL.addView(linearLayout2, marginLayoutParamsLJ4);
        }
        C197039127h c197039127h = new C197039127h(context);
        c197039127h.setId(R.id.fa1);
        C786410Ut5.LJLLLLLL(8, c197039127h);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ5 = android.view.a.LJ((int) TypedValue.applyDimension(1, 138.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()), roundingCornerLayoutCL);
        new f();
        f.LIZ("app:tux_buttonSize", new a.c("small"), c197039127h);
        f.LIZ("app:tux_buttonVariant", new a.c("secondary"), c197039127h);
        f.LIZ("app:tux_buttonCapsule", new a.c("true"), c197039127h);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ5)) {
            marginLayoutParamsLJ5.bottomMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ5)) {
            ((C19ME) marginLayoutParamsLJ5).bottomToTop = R.id.azo;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ5)) {
            i10 = 0;
            ((C19ME) marginLayoutParamsLJ5).endToEnd = 0;
        } else {
            i10 = 0;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ5)) {
            ((C19ME) marginLayoutParamsLJ5).startToStart = i10;
        }
        android.view.a.LIZ(c197039127h);
        if (c197039127h.getParent() == null) {
            roundingCornerLayoutCL.addView(c197039127h, marginLayoutParamsLJ5);
        }
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setId(R.id.azo);
        linearLayout4.setGravity(16);
        linearLayout4.setOrientation(i10);
        linearLayout4.setPadding((int) resources.getDimension(R.dimen.sb), linearLayout4.getPaddingTop(), linearLayout4.getPaddingRight(), linearLayout4.getPaddingBottom());
        linearLayout4.setPadding(linearLayout4.getPaddingLeft(), (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()), linearLayout4.getPaddingRight(), linearLayout4.getPaddingBottom());
        linearLayout4.setPadding(linearLayout4.getPaddingLeft(), linearLayout4.getPaddingTop(), (int) resources.getDimension(R.dimen.sb), linearLayout4.getPaddingBottom());
        TypedArray typedArrayObtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.c3});
        linearLayout4.setBackgroundColor(typedArrayObtainStyledAttributes3.getColor(0, 0));
        typedArrayObtainStyledAttributes3.recycle();
        linearLayout4.setPadding(linearLayout4.getPaddingLeft(), linearLayout4.getPaddingTop(), linearLayout4.getPaddingRight(), (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        ViewGroup.LayoutParams layoutParamsLJ7 = android.view.a.LJ(-1, (int) TypedValue.applyDimension(1, 42.0f, resources.getDisplayMetrics()), roundingCornerLayoutCL);
        if (C19ME.class.isInstance(layoutParamsLJ7)) {
            i11 = 0;
            ((C19ME) layoutParamsLJ7).bottomToBottom = 0;
        } else {
            i11 = 0;
        }
        if (C19ME.class.isInstance(layoutParamsLJ7)) {
            ((C19ME) layoutParamsLJ7).endToEnd = i11;
        }
        if (C19ME.class.isInstance(layoutParamsLJ7)) {
            ((C19ME) layoutParamsLJ7).startToStart = i11;
        }
        SmartImageView smartImageView2 = new SmartImageView(context);
        smartImageView2.setId(R.id.azx);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams((int) resources.getDimension(R.dimen.sh), (int) resources.getDimension(R.dimen.sh));
        android.view.a.LIZ(smartImageView2);
        if (smartImageView2.getParent() == null) {
            linearLayout4.addView(smartImageView2, layoutParams8);
        }
        TuxTextView tuxTextView3 = new TuxTextView(context);
        tuxTextView3.setId(R.id.b0x);
        tuxTextView3.setGravity(8388627);
        tuxTextView3.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView3.setMaxLines(1);
        tuxTextView3.setTextAlignment(5);
        TypedArray typedArrayObtainStyledAttributes4 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1h});
        tuxTextView3.setTextColor(typedArrayObtainStyledAttributes4.getColor(0, 0));
        typedArrayObtainStyledAttributes4.recycle();
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams9)) {
            layoutParams9.setMarginStart((int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()));
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams9)) {
            layoutParams9.weight = 1;
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P1_Semibold"), tuxTextView3);
        android.view.a.LIZ(tuxTextView3);
        if (tuxTextView3.getParent() == null) {
            linearLayout4.addView(tuxTextView3, layoutParams9);
        }
        android.view.a.LIZ(linearLayout4);
        if (linearLayout4.getParent() == null) {
            roundingCornerLayoutCL.addView(linearLayout4, layoutParamsLJ7);
        }
        android.view.a.LIZ(roundingCornerLayoutCL);
        C786410Ut5.W5(roundingCornerLayoutCL, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(roundingCornerLayoutCL);
        }
        return roundingCornerLayoutCL;
    }
}
