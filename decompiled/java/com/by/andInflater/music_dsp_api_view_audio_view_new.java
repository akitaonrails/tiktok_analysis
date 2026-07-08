package com.by.andInflater;

import X.C19ME;
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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import dc.a;
import jf8.c;
import xem.k;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class music_dsp_api_view_audio_view_new implements InterfaceC20742716Ev {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -1, viewGroup);
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(R.id.ouk);
        constraintLayout.setClipChildren(false);
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.our);
        C19ME c19me = new C19ME(-1, -2);
        if (LinearLayout.LayoutParams.class.isInstance(c19me)) {
            ((LinearLayout.LayoutParams) c19me).gravity = 1;
        }
        if (FrameLayout.LayoutParams.class.isInstance(c19me)) {
            ((FrameLayout.LayoutParams) c19me).gravity = 1;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(c19me)) {
            ((DrawerLayout$LayoutParams) c19me).gravity = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me)) {
            ((ViewGroup.MarginLayoutParams) c19me).topMargin = (int) TypedValue.applyDimension(1, 112.0f, resources.getDisplayMetrics());
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.endToEnd = 0;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.topToTop = 0;
        }
        SmartImageView smartImageView = new SmartImageView(context);
        smartImageView.setId(R.id.ouu);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        c cVar = new c();
        cVar.LIZIZ("app:viewAspectRatio", new a.c("1.0"), smartImageView);
        cVar.LIZ(smartImageView);
        android.view.a.LIZ(smartImageView);
        if (smartImageView.getParent() == null) {
            frameLayout2.addView(smartImageView, layoutParams2);
        }
        View view = new View(context);
        view.setId(R.id.f5d);
        C786410Ut5.LJLLLLLL(8, view);
        ViewGroup.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        android.view.a.LIZ(view);
        if (view.getParent() == null) {
            frameLayout2.addView(view, layoutParams3);
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.nje);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        C786410Ut5.LJLLLLLL(8, linearLayout);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams4)) {
            ((LinearLayout.LayoutParams) layoutParams4).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.gravity = 80;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams4)) {
            ((DrawerLayout$LayoutParams) layoutParams4).gravity = 80;
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.tv_upsell);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.zi});
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.weight = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.setMarginStart((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.setMarginEnd((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P1_Semibold"), tuxTextView);
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            linearLayout.addView(tuxTextView, layoutParams5);
        }
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setId(R.id.lpk);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.setMarginEnd((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        new k();
        k.LIZ("app:tux_iconWidth", new a.d("12", "dp"), tuxIconView);
        k.LIZ("app:tux_iconHeight", new a.d("12", "dp"), tuxIconView);
        k.LIZ("app:tux_icon", new a.b("2130772912", "raw"), tuxIconView);
        k.LIZ("app:tux_tintColor", new a.b("2131100549", "attr"), tuxIconView);
        android.view.a.LIZ(tuxIconView);
        if (tuxIconView.getParent() == null) {
            linearLayout.addView(tuxIconView, layoutParams6);
        }
        android.view.a.LIZ(linearLayout);
        if (linearLayout.getParent() == null) {
            frameLayout2.addView(linearLayout, layoutParams4);
        }
        TuxIconView tuxIconView2 = new TuxIconView(context);
        tuxIconView2.setId(R.id.oux);
        C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
        tuxIconView2.setImportantForAccessibility(2);
        tuxIconView2.setFocusable(false);
        FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 64.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 64.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams7)) {
            ((LinearLayout.LayoutParams) layoutParams7).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams7)) {
            layoutParams7.gravity = 17;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams7)) {
            ((DrawerLayout$LayoutParams) layoutParams7).gravity = 17;
        }
        new k();
        k.LIZ("app:tux_icon", new a.b("2130774488", "raw"), tuxIconView2);
        k.LIZ("app:tux_iconHeight", new a.d("64", "dp"), tuxIconView2);
        k.LIZ("app:tux_iconWidth", new a.d("64", "dp"), tuxIconView2);
        k.LIZ("app:tux_tintColor", new a.b("2131100552", "attr"), tuxIconView2);
        android.view.a.LIZ(tuxIconView2);
        if (tuxIconView2.getParent() == null) {
            frameLayout2.addView(tuxIconView2, layoutParams7);
        }
        android.view.a.LIZ(frameLayout2);
        if (frameLayout2.getParent() == null) {
            constraintLayout.addView(frameLayout2, c19me);
        }
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setId(R.id.ous);
        frameLayout3.setClipChildren(false);
        C786410Ut5.LJLLLLLL(8, frameLayout3);
        C19ME c19me2 = new C19ME((int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me2)) {
            ((ViewGroup.MarginLayoutParams) c19me2).bottomMargin = (int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics());
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.bottomToTop = R.id.ouy;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.endToEnd = R.id.ouy;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.startToStart = R.id.ouy;
        }
        TuxIconView tuxIconView3 = new TuxIconView(context);
        tuxIconView3.setId(R.id.ouz);
        tuxIconView3.setImportantForAccessibility(2);
        tuxIconView3.setFocusable(false);
        FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(-1, -1);
        new k();
        k.LIZ("app:tux_icon", new a.b("2130773235", "raw"), tuxIconView3);
        k.LIZ("app:tux_iconHeight", new a.d("32", "dp"), tuxIconView3);
        k.LIZ("app:tux_iconWidth", new a.d("32", "dp"), tuxIconView3);
        k.LIZ("app:tux_tintColor", new a.b("2131099768", "attr"), tuxIconView3);
        android.view.a.LIZ(tuxIconView3);
        if (tuxIconView3.getParent() == null) {
            frameLayout3.addView(tuxIconView3, layoutParams8);
        }
        TuxIconView tuxIconView4 = new TuxIconView(context);
        tuxIconView4.setId(R.id.ouv);
        tuxIconView4.setImportantForAccessibility(2);
        tuxIconView4.setFocusable(false);
        FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(-1, -1);
        new k();
        k.LIZ("app:tux_icon", new a.b("2130773235", "raw"), tuxIconView4);
        k.LIZ("app:tux_iconHeight", new a.d("32", "dp"), tuxIconView4);
        k.LIZ("app:tux_iconWidth", new a.d("32", "dp"), tuxIconView4);
        k.LIZ("app:tux_tintColor", new a.b("2131100632", "attr"), tuxIconView4);
        android.view.a.LIZ(tuxIconView4);
        if (tuxIconView4.getParent() == null) {
            frameLayout3.addView(tuxIconView4, layoutParams9);
        }
        android.view.a.LIZ(frameLayout3);
        if (frameLayout3.getParent() == null) {
            constraintLayout.addView(frameLayout3, c19me2);
        }
        TuxIconView tuxIconView5 = new TuxIconView(context);
        tuxIconView5.setId(R.id.ouy);
        tuxIconView5.setImportantForAccessibility(2);
        C786410Ut5.LLLLLLZZ(tuxIconView5, 8);
        tuxIconView5.setFocusable(false);
        C19ME c19me3 = new C19ME(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me3)) {
            i = 1;
            c19me3.setMarginEnd((int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        } else {
            i = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me3)) {
            ((ViewGroup.MarginLayoutParams) c19me3).bottomMargin = (int) TypedValue.applyDimension(i, 32.0f, resources.getDisplayMetrics());
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.endToEnd = 0;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.bottomToTop = R.id.ouw;
        }
        new k();
        k.LIZ("app:tux_icon", new a.b("2130773394", "raw"), tuxIconView5);
        k.LIZ("app:tux_iconHeight", new a.d("32", "dp"), tuxIconView5);
        k.LIZ("app:tux_iconWidth", new a.d("32", "dp"), tuxIconView5);
        k.LIZ("app:tux_tintColor", new a.b("2131099768", "attr"), tuxIconView5);
        android.view.a.LIZ(tuxIconView5);
        if (tuxIconView5.getParent() == null) {
            constraintLayout.addView(tuxIconView5, c19me3);
        }
        TuxIconView tuxIconView6 = new TuxIconView(context);
        tuxIconView6.setId(R.id.ouw);
        C786410Ut5.LLLLLLZZ(tuxIconView6, 8);
        tuxIconView6.setImportantForAccessibility(2);
        tuxIconView6.setFocusable(false);
        C19ME c19me4 = new C19ME(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me4)) {
            i2 = 1;
            c19me4.setMarginEnd((int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        } else {
            i2 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me4)) {
            ((ViewGroup.MarginLayoutParams) c19me4).bottomMargin = (int) TypedValue.applyDimension(i2, 50.0f, resources.getDisplayMetrics());
        }
        if (C19ME.class.isInstance(c19me4)) {
            i3 = 0;
            c19me4.endToEnd = 0;
        } else {
            i3 = 0;
        }
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.bottomToBottom = i3;
        }
        new k();
        k.LIZ("app:tux_icon", new a.b("2130773650", "raw"), tuxIconView6);
        k.LIZ("app:tux_iconHeight", new a.d("32", "dp"), tuxIconView6);
        k.LIZ("app:tux_iconWidth", new a.d("32", "dp"), tuxIconView6);
        k.LIZ("app:tux_tintColor", new a.b("2131099768", "attr"), tuxIconView6);
        android.view.a.LIZ(tuxIconView6);
        if (tuxIconView6.getParent() == null) {
            constraintLayout.addView(tuxIconView6, c19me4);
        }
        View frameLayout4 = new FrameLayout(context);
        frameLayout4.setId(R.id.ov0);
        C19ME c19me5 = new C19ME((int) TypedValue.applyDimension(i2, 0.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me5)) {
            c19me5.setMarginStart((int) TypedValue.applyDimension(i2, 24.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me5)) {
            c19me5.setMarginEnd((int) TypedValue.applyDimension(i2, 8.0f, resources.getDisplayMetrics()));
        }
        if (C19ME.class.isInstance(c19me5)) {
            c19me5.endToStart = R.id.ouw;
        }
        if (C19ME.class.isInstance(c19me5)) {
            c19me5.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me5)) {
            c19me5.topToBottom = R.id.our;
        }
        if (C19ME.class.isInstance(c19me5)) {
            c19me5.bottomToTop = R.id.out;
        }
        android.view.a.LIZ(frameLayout4);
        if (frameLayout4.getParent() == null) {
            constraintLayout.addView(frameLayout4, c19me5);
        }
        View frameLayout5 = new FrameLayout(context);
        frameLayout5.setId(R.id.out);
        C19ME c19me6 = new C19ME((int) TypedValue.applyDimension(i2, 0.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me6)) {
            ((ViewGroup.MarginLayoutParams) c19me6).bottomMargin = (int) TypedValue.applyDimension(i2, 4.0f, resources.getDisplayMetrics());
        }
        if (C19ME.class.isInstance(c19me6)) {
            c19me6.startToStart = R.id.ov1;
        }
        if (C19ME.class.isInstance(c19me6)) {
            c19me6.endToStart = R.id.ouw;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me6)) {
            c19me6.setMarginEnd((int) TypedValue.applyDimension(i2, 16.0f, resources.getDisplayMetrics()));
        }
        if (C19ME.class.isInstance(c19me6)) {
            c19me6.bottomToTop = R.id.ov1;
        }
        android.view.a.LIZ(frameLayout5);
        if (frameLayout5.getParent() == null) {
            constraintLayout.addView(frameLayout5, c19me6);
        }
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.ov1);
        tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView2.setGravity(16);
        tuxTextView2.setMaxLines(i2);
        int[] iArr = new int[i2];
        iArr[0] = R.attr.zk;
        TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(iArr);
        tuxTextView2.setTextColor(typedArrayObtainStyledAttributes2.getColor(0, 0));
        typedArrayObtainStyledAttributes2.recycle();
        C19ME c19me7 = new C19ME((int) TypedValue.applyDimension(i2, 0.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me7)) {
            c19me7.setMarginStart((int) TypedValue.applyDimension(i2, 24.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me7)) {
            c19me7.setMarginEnd((int) TypedValue.applyDimension(i2, 16.0f, resources.getDisplayMetrics()));
        }
        if (C19ME.class.isInstance(c19me7)) {
            c19me7.bottomToBottom = R.id.ouw;
        }
        if (C19ME.class.isInstance(c19me7)) {
            c19me7.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me7)) {
            c19me7.endToStart = R.id.ouw;
        }
        if (C19ME.class.isInstance(c19me7)) {
            c19me7.horizontalBias = 0.0f;
        }
        if (C19ME.class.isInstance(c19me7)) {
            c19me7.horizontalChainStyle = 2;
        }
        if (C19ME.class.isInstance(c19me7)) {
            c19me7.matchConstraintDefaultWidth = i2;
        }
        if (C19ME.class.isInstance(c19me7)) {
            c19me7.goneStartMargin = (int) TypedValue.applyDimension(i2, 24.0f, resources.getDisplayMetrics());
        }
        new o();
        o.LIZ("app:tux_font", new a.c("H3_Regular"), tuxTextView2);
        android.view.a.LIZ(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            constraintLayout.addView(tuxTextView2, c19me7);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setId(R.id.oul);
        linearLayout2.setOrientation(0);
        C19ME c19me8 = new C19ME(-1, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me8)) {
            ((ViewGroup.MarginLayoutParams) c19me8).bottomMargin = (int) TypedValue.applyDimension(i2, 25.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me8)) {
            c19me8.setMarginStart((int) TypedValue.applyDimension(i2, 6.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me8)) {
            c19me8.setMarginEnd((int) TypedValue.applyDimension(i2, 6.0f, resources.getDisplayMetrics()));
        }
        if (C19ME.class.isInstance(c19me8)) {
            i4 = 0;
            c19me8.bottomToBottom = 0;
        } else {
            i4 = 0;
        }
        if (C19ME.class.isInstance(c19me8)) {
            c19me8.endToEnd = i4;
        }
        if (C19ME.class.isInstance(c19me8)) {
            c19me8.startToStart = i4;
        }
        FrameLayout frameLayout6 = new FrameLayout(context);
        frameLayout6.setId(R.id.oum);
        LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(-1, -1);
        android.view.a.LIZ(frameLayout6);
        if (frameLayout6.getParent() == null) {
            linearLayout2.addView(frameLayout6, layoutParams10);
        }
        android.view.a.LIZ(linearLayout2);
        if (linearLayout2.getParent() == null) {
            constraintLayout.addView(linearLayout2, c19me8);
        }
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setId(R.id.ouo);
        linearLayout3.setGravity(17);
        linearLayout3.setOrientation(0);
        C786410Ut5.LJLLLLLL(8, linearLayout3);
        C19ME c19me9 = new C19ME(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(c19me9)) {
            ((LinearLayout.LayoutParams) c19me9).gravity = i2;
        }
        if (FrameLayout.LayoutParams.class.isInstance(c19me9)) {
            ((FrameLayout.LayoutParams) c19me9).gravity = i2;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(c19me9)) {
            ((DrawerLayout$LayoutParams) c19me9).gravity = i2;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me9)) {
            ((ViewGroup.MarginLayoutParams) c19me9).bottomMargin = (int) TypedValue.applyDimension(i2, 50.0f, resources.getDisplayMetrics());
        }
        if (C19ME.class.isInstance(c19me9)) {
            c19me9.bottomToBottom = 0;
        }
        if (C19ME.class.isInstance(c19me9)) {
            c19me9.endToEnd = R.id.oul;
        }
        if (C19ME.class.isInstance(c19me9)) {
            c19me9.startToStart = R.id.oul;
        }
        TuxTextView tuxTextView3 = new TuxTextView(context);
        tuxTextView3.setId(R.id.oun);
        int[] iArr2 = new int[i2];
        iArr2[0] = R.attr.zi;
        TypedArray typedArrayObtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(iArr2);
        tuxTextView3.setTextColor(typedArrayObtainStyledAttributes3.getColor(0, 0));
        typedArrayObtainStyledAttributes3.recycle();
        LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(-2, -2);
        new o();
        o.LIZ("app:tux_font", new a.c("LargeTitle_Semibold"), tuxTextView3);
        android.view.a.LIZ(tuxTextView3);
        if (tuxTextView3.getParent() == null) {
            linearLayout3.addView(tuxTextView3, layoutParams11);
        }
        TuxTextView tuxTextView4 = new TuxTextView(context);
        tuxTextView4.setId(R.id.oup);
        int[] iArr3 = new int[i2];
        iArr3[0] = R.attr.ef;
        TypedArray typedArrayObtainStyledAttributes4 = context.getTheme().obtainStyledAttributes(iArr3);
        tuxTextView4.setTextColor(typedArrayObtainStyledAttributes4.getColor(0, 0));
        typedArrayObtainStyledAttributes4.recycle();
        LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams12)) {
            layoutParams12.setMarginStart((int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams12)) {
            layoutParams12.setMarginEnd((int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        }
        new o();
        o.LIZ("app:tux_font", new a.c("H3_Bold"), tuxTextView4);
        android.view.a.LIZ(tuxTextView4);
        if (tuxTextView4.getParent() == null) {
            linearLayout3.addView(tuxTextView4, layoutParams12);
        }
        TuxTextView tuxTextView5 = new TuxTextView(context);
        tuxTextView5.setId(R.id.ouq);
        TypedArray typedArrayObtainStyledAttributes5 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.zl});
        tuxTextView5.setTextColor(typedArrayObtainStyledAttributes5.getColor(0, 0));
        typedArrayObtainStyledAttributes5.recycle();
        LinearLayout.LayoutParams layoutParams13 = new LinearLayout.LayoutParams(-2, -2);
        new o();
        o.LIZ("app:tux_font", new a.c("LargeTitle_Semibold"), tuxTextView5);
        android.view.a.LIZ(tuxTextView5);
        if (tuxTextView5.getParent() == null) {
            linearLayout3.addView(tuxTextView5, layoutParams13);
        }
        android.view.a.LIZ(linearLayout3);
        if (linearLayout3.getParent() == null) {
            constraintLayout.addView(linearLayout3, c19me9);
        }
        android.view.a.LIZ(constraintLayout);
        if (constraintLayout.getParent() == null) {
            frameLayout.addView(constraintLayout, layoutParams);
        }
        android.view.a.LIZ(frameLayout);
        C786410Ut5.W5(frameLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        return frameLayout;
    }
}
