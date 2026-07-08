package com.by.andInflater;

import X.C0Q6L;
import X.C1602160rnK;
import X.C197039127h;
import X.C20742916Ex;
import X.C786410Ut5;
import X.C902070Za9;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
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
import xem.k;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class im_quick_live_reaction_media_thumbnail implements InterfaceC20742716Ev {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(final Context context, ViewGroup viewGroup, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.evm);
        linearLayout.setOrientation(0);
        linearLayout.setClipToPadding(false);
        linearLayout.setClipChildren(false);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-2, -2, viewGroup);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.xv2);
        frameLayout.setClipToPadding(false);
        frameLayout.setClipChildren(false);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 116.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 116.0f, resources.getDisplayMetrics()));
        final AttributeSet attributeSet = null;
        FrameLayout frameLayout2 = new FrameLayout(context, attributeSet) { // from class: X.0Eew
            public final Path LL = new Path();
            public float LLILLJJLI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(198)) / 2.0f;

            public final float getCornerRadius() {
                return this.LLILLJJLI;
            }

            @Override // android.view.ViewGroup, android.view.View
            public final void dispatchDraw(Canvas canvas) {
                this.LL.reset();
                RectF rectF = new RectF(0.0f, 0.0f, getWidth(), getHeight());
                Path path = this.LL;
                float f = this.LLILLJJLI;
                path.addRoundRect(rectF, f, f, Path.Direction.CW);
                canvas.clipPath(this.LL);
                super.dispatchDraw(canvas);
            }

            public final void setCornerRadius(float f) {
                this.LLILLJJLI = f;
            }
        };
        frameLayout2.setId(R.id.tsp);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 116.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 116.0f, resources.getDisplayMetrics()));
        C0Q6L c0q6l = new C0Q6L(context, null, 6);
        c0q6l.setId(R.id.xrx);
        int visibility = c0q6l.getVisibility();
        c0q6l.setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, c0q6l);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.e1});
        c0q6l.setBackgroundColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ2 = a.LJ(-1, -1, frameLayout2);
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ2).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ2).gravity = 17;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ2).gravity = 17;
        }
        a.LIZ(c0q6l);
        if (c0q6l.getParent() == null) {
            frameLayout2.addView(c0q6l, marginLayoutParamsLJ2);
        }
        a.LIZ(frameLayout2);
        if (frameLayout2.getParent() == null) {
            frameLayout.addView(frameLayout2, layoutParams2);
        }
        C902070Za9 c902070Za9 = new C902070Za9(context);
        c902070Za9.setId(R.id.xuu);
        ViewGroup.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 116.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 116.0f, resources.getDisplayMetrics()));
        View smartImageView = new SmartImageView(context);
        smartImageView.setId(R.id.eun);
        smartImageView.setImportantForAccessibility(2);
        smartImageView.setFocusable(false);
        ViewGroup.LayoutParams layoutParamsLJ = a.LJ(-1, -1, c902070Za9);
        a.LIZ(smartImageView);
        if (smartImageView.getParent() == null) {
            c902070Za9.addView(smartImageView, layoutParamsLJ);
        }
        SmartImageView smartImageView2 = new SmartImageView(context);
        smartImageView2.setId(R.id.j5n);
        TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a03});
        smartImageView2.setBackgroundColor(typedArrayObtainStyledAttributes2.getColor(0, 0));
        typedArrayObtainStyledAttributes2.recycle();
        C786410Ut5.LJZI(8, smartImageView2);
        smartImageView2.setImportantForAccessibility(2);
        smartImageView2.setFocusable(false);
        ViewGroup.LayoutParams layoutParamsLJ2 = a.LJ(-1, -1, c902070Za9);
        a.LIZ(smartImageView2);
        if (smartImageView2.getParent() == null) {
            c902070Za9.addView(smartImageView2, layoutParamsLJ2);
        }
        TuxSpinner tuxSpinner = new TuxSpinner(context);
        tuxSpinner.setId(R.id.nnd);
        tuxSpinner.setImportantForAccessibility(2);
        ViewGroup.LayoutParams layoutParamsLJ3 = a.LJ((int) TypedValue.applyDimension(1, 28.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 28.0f, resources.getDisplayMetrics()), c902070Za9);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParamsLJ3)) {
            ((LinearLayout.LayoutParams) layoutParamsLJ3).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParamsLJ3)) {
            ((FrameLayout.LayoutParams) layoutParamsLJ3).gravity = 17;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParamsLJ3)) {
            ((DrawerLayout$LayoutParams) layoutParamsLJ3).gravity = 17;
        }
        d0 d0Var = new d0();
        d0Var.LIZ("app:tux_icon", new a.b("2130774720", "raw"), tuxSpinner);
        d0Var.LIZ("app:tux_tintColor", new a.b("2131100101", "attr"), tuxSpinner);
        android.view.a.LIZ(tuxSpinner);
        if (tuxSpinner.getParent() == null) {
            c902070Za9.addView(tuxSpinner, layoutParamsLJ3);
        }
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setId(R.id.ev3);
        ViewGroup.LayoutParams layoutParamsLJ4 = android.view.a.LJ(-1, -1, c902070Za9);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParamsLJ4)) {
            i = 17;
            ((LinearLayout.LayoutParams) layoutParamsLJ4).gravity = 17;
        } else {
            i = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParamsLJ4)) {
            ((FrameLayout.LayoutParams) layoutParamsLJ4).gravity = i;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParamsLJ4)) {
            ((DrawerLayout$LayoutParams) layoutParamsLJ4).gravity = i;
        }
        View tuxIconView = new TuxIconView(context);
        tuxIconView.setId(R.id.xvv);
        tuxIconView.setImportantForAccessibility(2);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
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
        android.view.a.LIZ(tuxIconView);
        if (tuxIconView.getParent() == null) {
            frameLayout3.addView(tuxIconView, layoutParams4);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setId(R.id.hb1);
        C786410Ut5.LJLLLLLL(8, linearLayout2);
        linearLayout2.setGravity(17);
        linearLayout2.setOrientation(1);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams5)) {
            ((LinearLayout.LayoutParams) layoutParams5).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.gravity = 17;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams5)) {
            ((DrawerLayout$LayoutParams) layoutParams5).gravity = 17;
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
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.hc5);
        tuxTextView.setGravity(17);
        TypedArray typedArrayObtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1p});
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes3.getColor(0, 0));
        typedArrayObtainStyledAttributes3.recycle();
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        new o();
        o.LIZ("app:tux_font", new a.c("P1_Regular"), tuxTextView);
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            linearLayout2.addView(tuxTextView, layoutParams7);
        }
        android.view.a.LIZ(linearLayout2);
        if (linearLayout2.getParent() == null) {
            frameLayout3.addView(linearLayout2, layoutParams5);
        }
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        linearLayout3.setPadding((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), linearLayout3.getPaddingTop(), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), linearLayout3.getPaddingBottom());
        linearLayout3.setPadding(linearLayout3.getPaddingLeft(), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), linearLayout3.getPaddingRight(), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams8)) {
            i3 = 17;
            ((LinearLayout.LayoutParams) layoutParams8).gravity = 17;
        } else {
            i3 = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams8)) {
            layoutParams8.gravity = i3;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams8)) {
            ((DrawerLayout$LayoutParams) layoutParams8).gravity = i3;
        }
        TuxIconView tuxIconView2 = new TuxIconView(context);
        tuxIconView2.setId(R.id.lr3);
        C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
        tuxIconView2.setImportantForAccessibility(2);
        tuxIconView2.setFocusable(false);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams9)) {
            i4 = 17;
            layoutParams9.gravity = 17;
        } else {
            i4 = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams9)) {
            ((FrameLayout.LayoutParams) layoutParams9).gravity = i4;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams9)) {
            ((DrawerLayout$LayoutParams) layoutParams9).gravity = i4;
        }
        new k();
        k.LIZ("app:tux_icon", new a.b("2130774488", "raw"), tuxIconView2);
        k.LIZ("app:tux_iconShadow", new a.c("true"), tuxIconView2);
        k.LIZ("app:tux_tintColor", new a.b("2131099769", "attr"), tuxIconView2);
        android.view.a.LIZ(tuxIconView2);
        if (tuxIconView2.getParent() == null) {
            linearLayout3.addView(tuxIconView2, layoutParams9);
        }
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.tv_safety_copy);
        tuxTextView2.setGravity(17);
        TypedArray typedArrayObtainStyledAttributes4 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.ee});
        tuxTextView2.setTextColor(typedArrayObtainStyledAttributes4.getColor(0, 0));
        typedArrayObtainStyledAttributes4.recycle();
        C786410Ut5.LJLLLLLL(8, tuxTextView2);
        LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams10)) {
            ((ViewGroup.MarginLayoutParams) layoutParams10).topMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P2_Regular"), tuxTextView2);
        android.view.a.LIZ(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            linearLayout3.addView(tuxTextView2, layoutParams10);
        }
        android.view.a.LIZ(linearLayout3);
        if (linearLayout3.getParent() == null) {
            frameLayout3.addView(linearLayout3, layoutParams8);
        }
        TuxIconView tuxIconView3 = new TuxIconView(context);
        tuxIconView3.setId(R.id.pgj);
        C786410Ut5.LLLLLLZZ(tuxIconView3, 8);
        tuxIconView3.setImportantForAccessibility(2);
        tuxIconView3.setFocusable(false);
        FrameLayout.LayoutParams layoutParams11 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()));
        new k();
        k.LIZ("app:tux_icon", new a.b("2130773830", "raw"), tuxIconView3);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams11)) {
            i5 = 17;
            ((LinearLayout.LayoutParams) layoutParams11).gravity = 17;
        } else {
            i5 = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams11)) {
            layoutParams11.gravity = i5;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams11)) {
            ((DrawerLayout$LayoutParams) layoutParams11).gravity = i5;
        }
        k.LIZ("app:tux_tintColor", new a.b("2131099676", "attr"), tuxIconView3);
        android.view.a.LIZ(tuxIconView3);
        if (tuxIconView3.getParent() == null) {
            frameLayout3.addView(tuxIconView3, layoutParams11);
        }
        android.view.a.LIZ(frameLayout3);
        if (frameLayout3.getParent() == null) {
            c902070Za9.addView(frameLayout3, layoutParamsLJ4);
        }
        C197039127h c197039127h = new C197039127h(context);
        c197039127h.setId(R.id.fa1);
        if (TextView.class.isInstance(c197039127h)) {
            i6 = 1;
            android.view.a.LJII((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), c197039127h);
        } else {
            i6 = 1;
            c197039127h.setMinimumWidth((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        }
        C786410Ut5.LJLLLLLL(8, c197039127h);
        ViewGroup.LayoutParams layoutParamsLJ5 = android.view.a.LJ((int) TypedValue.applyDimension(i6, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(i6, 0.0f, resources.getDisplayMetrics()), c902070Za9);
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
            frameLayout.addView(c902070Za9, layoutParams3);
        }
        android.view.a.LIZ(frameLayout);
        if (frameLayout.getParent() == null) {
            linearLayout.addView(frameLayout, layoutParams);
        }
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setId(R.id.pgg);
        linearLayout4.setPadding(linearLayout4.getPaddingLeft(), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), linearLayout4.getPaddingRight(), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        linearLayout4.setPadding((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), linearLayout4.getPaddingTop(), linearLayout4.getPaddingRight(), linearLayout4.getPaddingBottom());
        linearLayout4.setPadding(linearLayout4.getPaddingLeft(), linearLayout4.getPaddingTop(), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), linearLayout4.getPaddingBottom());
        C786410Ut5.LJLLLLLL(8, linearLayout4);
        linearLayout4.setGravity(16);
        LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams12)) {
            layoutParams12.gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams12)) {
            ((FrameLayout.LayoutParams) layoutParams12).gravity = 16;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams12)) {
            ((DrawerLayout$LayoutParams) layoutParams12).gravity = 16;
        }
        TuxIconView tuxIconView4 = new TuxIconView(context);
        tuxIconView4.setId(R.id.pgi);
        tuxIconView4.setImportantForAccessibility(2);
        LinearLayout.LayoutParams layoutParams13 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        new k();
        k.LIZ("app:tux_icon", new a.b("2130773830", "raw"), tuxIconView4);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams13)) {
            layoutParams13.setMarginEnd((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        k.LIZ("app:tux_tintColor", new a.b("2131100625", "attr"), tuxIconView4);
        android.view.a.LIZ(tuxIconView4);
        if (tuxIconView4.getParent() == null) {
            linearLayout4.addView(tuxIconView4, layoutParams13);
        }
        TuxTextView tuxTextView3 = new TuxTextView(context);
        tuxTextView3.setId(R.id.pgh);
        tuxTextView3.setMaxWidth((int) TypedValue.applyDimension(1, 150.0f, resources.getDisplayMetrics()));
        TypedArray typedArrayObtainStyledAttributes5 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1j});
        tuxTextView3.setTextColor(typedArrayObtainStyledAttributes5.getColor(0, 0));
        typedArrayObtainStyledAttributes5.recycle();
        LinearLayout.LayoutParams layoutParams14 = new LinearLayout.LayoutParams(-2, -2);
        new o();
        o.LIZ("app:tux_font", new a.c("H4_Regular"), tuxTextView3);
        android.view.a.LIZ(tuxTextView3);
        if (tuxTextView3.getParent() == null) {
            linearLayout4.addView(tuxTextView3, layoutParams14);
        }
        android.view.a.LIZ(linearLayout4);
        if (linearLayout4.getParent() == null) {
            linearLayout.addView(linearLayout4, layoutParams12);
        }
        View viewLIZ = C20742916Ex.LIZ(context, R.layout.cma, linearLayout, false, R.layout.cr9);
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
