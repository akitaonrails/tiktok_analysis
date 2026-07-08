package com.by.andInflater;

import X.C197039127h;
import X.C19ME;
import X.C20742916Ex;
import X.C426320Gne;
import X.C786410Ut5;
import X.C902070Za9;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.zhiliaoapp.musically.R;
import dc.a;
import mcf.d0;
import xem.f;
import xem.h;
import xem.k;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class im_item_media_thumbnail implements InterfaceC20742716Ev {
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
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.evm);
        linearLayout.setOrientation(0);
        linearLayout.setClipToPadding(false);
        linearLayout.setClipChildren(false);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-2, -2, viewGroup);
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.tv_story_react_hint);
        C786410Ut5.LJLLLLLL(8, tuxTextView);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1k});
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P3_Regular"), tuxTextView);
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            linearLayout.addView(tuxTextView, layoutParams);
        }
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setClipToPadding(false);
        constraintLayout.setClipChildren(false);
        ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
        C902070Za9 c902070Za9 = new C902070Za9(context);
        c902070Za9.setId(R.id.xuu);
        ViewGroup.LayoutParams c19me = new C19ME((int) TypedValue.applyDimension(1, 180.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 320.0f, resources.getDisplayMetrics()));
        View smartImageView = new SmartImageView(context);
        smartImageView.setId(R.id.eun);
        smartImageView.setImportantForAccessibility(2);
        smartImageView.setFocusable(false);
        ViewGroup.LayoutParams layoutParamsLJ = android.view.a.LJ(-1, -1, c902070Za9);
        android.view.a.LIZ(smartImageView);
        if (smartImageView.getParent() == null) {
            c902070Za9.addView(smartImageView, layoutParamsLJ);
        }
        SmartImageView smartImageView2 = new SmartImageView(context);
        smartImageView2.setId(R.id.j5n);
        TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1a});
        smartImageView2.setBackgroundColor(typedArrayObtainStyledAttributes2.getColor(0, 0));
        typedArrayObtainStyledAttributes2.recycle();
        C786410Ut5.LJZI(8, smartImageView2);
        smartImageView2.setImportantForAccessibility(2);
        smartImageView2.setFocusable(false);
        ViewGroup.LayoutParams layoutParamsLJ2 = android.view.a.LJ(-1, -1, c902070Za9);
        android.view.a.LIZ(smartImageView2);
        if (smartImageView2.getParent() == null) {
            c902070Za9.addView(smartImageView2, layoutParamsLJ2);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.ev3);
        ViewGroup.LayoutParams layoutParamsLJ3 = android.view.a.LJ(-1, -1, c902070Za9);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParamsLJ3)) {
            ((LinearLayout.LayoutParams) layoutParamsLJ3).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParamsLJ3)) {
            ((FrameLayout.LayoutParams) layoutParamsLJ3).gravity = 17;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParamsLJ3)) {
            ((DrawerLayout$LayoutParams) layoutParamsLJ3).gravity = 17;
        }
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setId(R.id.xvv);
        tuxIconView.setImportantForAccessibility(2);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 100.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 100.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams3)) {
            i = 17;
            ((LinearLayout.LayoutParams) layoutParams3).gravity = 17;
        } else {
            i = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.gravity = i;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams3)) {
            ((DrawerLayout$LayoutParams) layoutParams3).gravity = i;
        }
        new k();
        k.LIZ("app:tux_icon", new a.b("2130772229", "raw"), tuxIconView);
        k.LIZ("app:tux_tintColor", new a.b("2131099671", "attr"), tuxIconView);
        android.view.a.LIZ(tuxIconView);
        if (tuxIconView.getParent() == null) {
            frameLayout.addView(tuxIconView, layoutParams3);
        }
        TuxSpinner tuxSpinner = new TuxSpinner(context);
        tuxSpinner.setId(R.id.nnd);
        tuxSpinner.setImportantForAccessibility(2);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams4)) {
            i2 = 17;
            ((LinearLayout.LayoutParams) layoutParams4).gravity = 17;
        } else {
            i2 = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.gravity = i2;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams4)) {
            ((DrawerLayout$LayoutParams) layoutParams4).gravity = i2;
        }
        d0 d0Var = new d0();
        d0Var.LIZ("app:tux_icon", new a.b("2130774720", "raw"), tuxSpinner);
        d0Var.LIZ("app:tux_tintColor", new a.b("2131100101", "attr"), tuxSpinner);
        android.view.a.LIZ(tuxSpinner);
        if (tuxSpinner.getParent() == null) {
            frameLayout.addView(tuxSpinner, layoutParams4);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setId(R.id.hb1);
        C786410Ut5.LJLLLLLL(8, linearLayout2);
        linearLayout2.setGravity(17);
        linearLayout2.setOrientation(1);
        linearLayout2.setPadding((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), linearLayout2.getPaddingTop(), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), linearLayout2.getPaddingBottom());
        linearLayout2.setPadding(linearLayout2.getPaddingLeft(), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), linearLayout2.getPaddingRight(), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams5)) {
            i3 = 17;
            ((LinearLayout.LayoutParams) layoutParams5).gravity = 17;
        } else {
            i3 = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.gravity = i3;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams5)) {
            ((DrawerLayout$LayoutParams) layoutParams5).gravity = i3;
        }
        RemoteImageView remoteImageView = new RemoteImageView(context);
        remoteImageView.setId(R.id.hbb);
        remoteImageView.setImportantForAccessibility(2);
        remoteImageView.setFocusable(false);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        bc.a aVar = new bc.a();
        aVar.LIZLLL("app:actualImageScaleType", new a.c("fitCenter"), remoteImageView);
        aVar.LIZJ(remoteImageView);
        android.view.a.LIZ(remoteImageView);
        if (remoteImageView.getParent() == null) {
            linearLayout2.addView(remoteImageView, layoutParams6);
        }
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.hc5);
        tuxTextView2.setGravity(17);
        TypedArray typedArrayObtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1p});
        tuxTextView2.setTextColor(typedArrayObtainStyledAttributes3.getColor(0, 0));
        typedArrayObtainStyledAttributes3.recycle();
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams7)) {
            ((ViewGroup.MarginLayoutParams) layoutParams7).topMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P1_Regular"), tuxTextView2);
        android.view.a.LIZ(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            linearLayout2.addView(tuxTextView2, layoutParams7);
        }
        android.view.a.LIZ(linearLayout2);
        if (linearLayout2.getParent() == null) {
            frameLayout.addView(linearLayout2, layoutParams5);
        }
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        linearLayout3.setPadding((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), linearLayout3.getPaddingTop(), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), linearLayout3.getPaddingBottom());
        linearLayout3.setPadding(linearLayout3.getPaddingLeft(), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), linearLayout3.getPaddingRight(), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(-1, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams8)) {
            i4 = 17;
            ((LinearLayout.LayoutParams) layoutParams8).gravity = 17;
        } else {
            i4 = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams8)) {
            layoutParams8.gravity = i4;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams8)) {
            ((DrawerLayout$LayoutParams) layoutParams8).gravity = i4;
        }
        TuxIconView tuxIconView2 = new TuxIconView(context);
        tuxIconView2.setId(R.id.lr3);
        C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
        tuxIconView2.setImportantForAccessibility(2);
        tuxIconView2.setFocusable(false);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams9)) {
            i5 = 17;
            layoutParams9.gravity = 17;
        } else {
            i5 = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams9)) {
            ((FrameLayout.LayoutParams) layoutParams9).gravity = i5;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams9)) {
            ((DrawerLayout$LayoutParams) layoutParams9).gravity = i5;
        }
        new k();
        k.LIZ("app:tux_icon", new a.b("2130774488", "raw"), tuxIconView2);
        k.LIZ("app:tux_iconShadow", new a.c("true"), tuxIconView2);
        k.LIZ("app:tux_tintColor", new a.b("2131099769", "attr"), tuxIconView2);
        android.view.a.LIZ(tuxIconView2);
        if (tuxIconView2.getParent() == null) {
            linearLayout3.addView(tuxIconView2, layoutParams9);
        }
        TuxTextView tuxTextView3 = new TuxTextView(context);
        tuxTextView3.setId(R.id.tv_safety_copy);
        tuxTextView3.setGravity(17);
        TypedArray typedArrayObtainStyledAttributes4 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.ee});
        tuxTextView3.setTextColor(typedArrayObtainStyledAttributes4.getColor(0, 0));
        typedArrayObtainStyledAttributes4.recycle();
        C786410Ut5.LJLLLLLL(8, tuxTextView3);
        LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams10)) {
            ((ViewGroup.MarginLayoutParams) layoutParams10).topMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P2_Regular"), tuxTextView3);
        android.view.a.LIZ(tuxTextView3);
        if (tuxTextView3.getParent() == null) {
            linearLayout3.addView(tuxTextView3, layoutParams10);
        }
        android.view.a.LIZ(linearLayout3);
        if (linearLayout3.getParent() == null) {
            frameLayout.addView(linearLayout3, layoutParams8);
        }
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(R.id.qdu);
        viewStub.setInflatedId(R.id.qdt);
        viewStub.setLayoutResource(R.layout.cml);
        ViewGroup.LayoutParams layoutParams11 = new FrameLayout.LayoutParams(-1, -1);
        android.view.a.LIZ(viewStub);
        if (viewStub.getParent() == null) {
            frameLayout.addView(viewStub, layoutParams11);
        }
        TuxIconView tuxIconView3 = new TuxIconView(context);
        tuxIconView3.setId(R.id.pgj);
        C786410Ut5.LLLLLLZZ(tuxIconView3, 8);
        tuxIconView3.setImportantForAccessibility(2);
        tuxIconView3.setFocusable(false);
        FrameLayout.LayoutParams layoutParams12 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()));
        new k();
        k.LIZ("app:tux_icon", new a.b("2130773830", "raw"), tuxIconView3);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams12)) {
            i6 = 17;
            ((LinearLayout.LayoutParams) layoutParams12).gravity = 17;
        } else {
            i6 = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams12)) {
            layoutParams12.gravity = i6;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams12)) {
            ((DrawerLayout$LayoutParams) layoutParams12).gravity = i6;
        }
        k.LIZ("app:tux_tintColor", new a.b("2131099676", "attr"), tuxIconView3);
        android.view.a.LIZ(tuxIconView3);
        if (tuxIconView3.getParent() == null) {
            frameLayout.addView(tuxIconView3, layoutParams12);
        }
        C426320Gne c426320Gne = new C426320Gne(context, null, 6);
        c426320Gne.setId(R.id.s91);
        C786410Ut5.LJLLLLLL(8, c426320Gne);
        FrameLayout.LayoutParams layoutParams13 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams13)) {
            i7 = 17;
            ((LinearLayout.LayoutParams) layoutParams13).gravity = 17;
        } else {
            i7 = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams13)) {
            layoutParams13.gravity = i7;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams13)) {
            ((DrawerLayout$LayoutParams) layoutParams13).gravity = i7;
        }
        new h();
        h.LIZ("app:tux_circularProgress_aboveColor", new a.b("2131099768", "attr"), c426320Gne);
        h.LIZ("app:tux_circularProgress_underColor", new a.b("2131099772", "attr"), c426320Gne);
        android.view.a.LIZ(c426320Gne);
        if (c426320Gne.getParent() == null) {
            frameLayout.addView(c426320Gne, layoutParams13);
        }
        TuxTextView tuxTextView4 = new TuxTextView(context);
        tuxTextView4.setId(R.id.s9j);
        C786410Ut5.LJLLLLLL(8, tuxTextView4);
        tuxTextView4.setImportantForAccessibility(2);
        tuxTextView4.setMaxLines(1);
        TypedArray typedArrayObtainStyledAttributes5 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.ee});
        tuxTextView4.setTextColor(typedArrayObtainStyledAttributes5.getColor(0, 0));
        typedArrayObtainStyledAttributes5.recycle();
        FrameLayout.LayoutParams layoutParams14 = new FrameLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams14)) {
            i8 = 17;
            ((LinearLayout.LayoutParams) layoutParams14).gravity = 17;
        } else {
            i8 = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams14)) {
            layoutParams14.gravity = i8;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams14)) {
            ((DrawerLayout$LayoutParams) layoutParams14).gravity = i8;
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P3_Semibold"), tuxTextView4);
        android.view.a.LIZ(tuxTextView4);
        if (tuxTextView4.getParent() == null) {
            frameLayout.addView(tuxTextView4, layoutParams14);
        }
        android.view.a.LIZ(frameLayout);
        if (frameLayout.getParent() == null) {
            c902070Za9.addView(frameLayout, layoutParamsLJ3);
        }
        View view = new View(context);
        view.setId(R.id.video_card_bottom_gradient);
        view.setBackgroundResource(R.drawable.ccf);
        C786410Ut5.LJLLLLLL(8, view);
        ViewGroup.LayoutParams layoutParamsLJ4 = android.view.a.LJ(-1, (int) resources.getDimension(R.dimen.s8), c902070Za9);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParamsLJ4)) {
            ((LinearLayout.LayoutParams) layoutParamsLJ4).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParamsLJ4)) {
            ((FrameLayout.LayoutParams) layoutParamsLJ4).gravity = 80;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParamsLJ4)) {
            ((DrawerLayout$LayoutParams) layoutParamsLJ4).gravity = 80;
        }
        android.view.a.LIZ(view);
        if (view.getParent() == null) {
            c902070Za9.addView(view, layoutParamsLJ4);
        }
        C197039127h c197039127h = new C197039127h(context);
        c197039127h.setId(R.id.fa1);
        if (TextView.class.isInstance(c197039127h)) {
            android.view.a.LJII((int) TypedValue.applyDimension(1, 158.0f, resources.getDisplayMetrics()), c197039127h);
        } else {
            c197039127h.setMinimumWidth((int) TypedValue.applyDimension(1, 158.0f, resources.getDisplayMetrics()));
        }
        C786410Ut5.LJLLLLLL(8, c197039127h);
        ViewGroup.LayoutParams layoutParamsLJ5 = android.view.a.LJ(-1, (int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()), c902070Za9);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParamsLJ5)) {
            ((LinearLayout.LayoutParams) layoutParamsLJ5).gravity = 81;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParamsLJ5)) {
            ((FrameLayout.LayoutParams) layoutParamsLJ5).gravity = 81;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParamsLJ5)) {
            ((DrawerLayout$LayoutParams) layoutParamsLJ5).gravity = 81;
        }
        new f();
        f.LIZ("app:tux_buttonSize", new a.c("small"), c197039127h);
        f.LIZ("app:tux_buttonVariant", new a.c("secondary"), c197039127h);
        f.LIZ("app:tux_buttonCapsule", new a.c("true"), c197039127h);
        android.view.a.LIZ(c197039127h);
        if (c197039127h.getParent() == null) {
            c902070Za9.addView(c197039127h, layoutParamsLJ5);
        }
        android.view.a.LIZ(c902070Za9);
        if (c902070Za9.getParent() == null) {
            constraintLayout.addView(c902070Za9, c19me);
        }
        ViewStub viewStub2 = new ViewStub(context);
        viewStub2.setId(R.id.qdw);
        viewStub2.setInflatedId(R.id.qdx);
        viewStub2.setLayoutResource(R.layout.cmn);
        C19ME c19me2 = new C19ME((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        c19me2.dimensionRatio = "1:1";
        if (C19ME.class.isInstance(c19me2)) {
            i9 = R.id.xuu;
            c19me2.startToStart = R.id.xuu;
        } else {
            i9 = R.id.xuu;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.endToEnd = i9;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.topToTop = i9;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.bottomToBottom = i9;
        }
        android.view.a.LIZ(viewStub2);
        if (viewStub2.getParent() == null) {
            constraintLayout.addView(viewStub2, c19me2);
        }
        android.view.a.LIZ(constraintLayout);
        if (constraintLayout.getParent() == null) {
            linearLayout.addView(constraintLayout, layoutParams2);
        }
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setId(R.id.pgg);
        linearLayout4.setPadding(linearLayout4.getPaddingLeft(), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), linearLayout4.getPaddingRight(), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        linearLayout4.setPadding((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), linearLayout4.getPaddingTop(), linearLayout4.getPaddingRight(), linearLayout4.getPaddingBottom());
        linearLayout4.setPadding(linearLayout4.getPaddingLeft(), linearLayout4.getPaddingTop(), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), linearLayout4.getPaddingBottom());
        C786410Ut5.LJLLLLLL(8, linearLayout4);
        linearLayout4.setGravity(16);
        LinearLayout.LayoutParams layoutParams15 = new LinearLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams15)) {
            layoutParams15.gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams15)) {
            ((FrameLayout.LayoutParams) layoutParams15).gravity = 16;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams15)) {
            ((DrawerLayout$LayoutParams) layoutParams15).gravity = 16;
        }
        TuxIconView tuxIconView4 = new TuxIconView(context);
        tuxIconView4.setId(R.id.pgi);
        LinearLayout.LayoutParams layoutParams16 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        new k();
        k.LIZ("app:tux_icon", new a.b("2130773830", "raw"), tuxIconView4);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams16)) {
            layoutParams16.setMarginEnd((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        k.LIZ("app:tux_tintColor", new a.b("2131100625", "attr"), tuxIconView4);
        android.view.a.LIZ(tuxIconView4);
        if (tuxIconView4.getParent() == null) {
            linearLayout4.addView(tuxIconView4, layoutParams16);
        }
        TuxTextView tuxTextView5 = new TuxTextView(context);
        tuxTextView5.setId(R.id.pgh);
        tuxTextView5.setMaxWidth((int) TypedValue.applyDimension(1, 150.0f, resources.getDisplayMetrics()));
        TypedArray typedArrayObtainStyledAttributes6 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1j});
        tuxTextView5.setTextColor(typedArrayObtainStyledAttributes6.getColor(0, 0));
        typedArrayObtainStyledAttributes6.recycle();
        LinearLayout.LayoutParams layoutParams17 = new LinearLayout.LayoutParams(-2, -2);
        new o();
        o.LIZ("app:tux_font", new a.c("H4_Regular"), tuxTextView5);
        android.view.a.LIZ(tuxTextView5);
        if (tuxTextView5.getParent() == null) {
            linearLayout4.addView(tuxTextView5, layoutParams17);
        }
        android.view.a.LIZ(linearLayout4);
        if (linearLayout4.getParent() == null) {
            linearLayout.addView(linearLayout4, layoutParams15);
        }
        View viewLIZ = C20742916Ex.LIZ(context, R.layout.cma, linearLayout, false, R.layout.cl1);
        if (viewLIZ.getParent() == null) {
            linearLayout.addView(viewLIZ);
        }
        android.view.a.LIZ(linearLayout);
        C786410Ut5.W5(linearLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(linearLayout);
        }
        return linearLayout;
    }
}
