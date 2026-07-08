package com.by.andInflater;

import X.C0UKT;
import X.C1324720kZq;
import X.C16F5;
import X.C16FV;
import X.C19ME;
import X.C20516015Pq;
import X.C426160GnO;
import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.zhiliaoapp.musically.R;
import dc.a;

/* JADX INFO: loaded from: classes32.dex */
public class ttlive_preview_video_mode_container implements InterfaceC20742716Ev {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        int i2;
        int i3;
        float f;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f2;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        Resources resources = context.getResources();
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setFocusable(true);
        constraintLayout.setFocusableInTouchMode(true);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -1, viewGroup);
        View view = new View(context);
        view.setId(R.id.wq7);
        C786410Ut5.LJLLLLLL(8, view);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.c95});
        view.setBackgroundColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        C19ME c19me = new C19ME(-1, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        if (C19ME.class.isInstance(c19me)) {
            c19me.topToTop = 0;
        }
        a.LIZ(view);
        if (view.getParent() == null) {
            constraintLayout.addView(view, c19me);
        }
        View view2 = new View(context);
        view2.setId(R.id.wq1);
        C786410Ut5.LJLLLLLL(8, view2);
        TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.c95});
        view2.setBackgroundColor(typedArrayObtainStyledAttributes2.getColor(0, 0));
        typedArrayObtainStyledAttributes2.recycle();
        C19ME c19me2 = new C19ME(-1, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.bottomToBottom = 0;
        }
        a.LIZ(view2);
        if (view2.getParent() == null) {
            constraintLayout.addView(view2, c19me2);
        }
        View c20516015Pq = new C20516015Pq(context);
        c20516015Pq.setId(R.id.mu9);
        ViewGroup.LayoutParams c19me3 = new C19ME(-1, -1);
        a.LIZ(c20516015Pq);
        if (c20516015Pq.getParent() == null) {
            constraintLayout.addView(c20516015Pq, c19me3);
        }
        View c20516015Pq2 = new C20516015Pq(context);
        c20516015Pq2.setId(R.id.mxm);
        C786410Ut5.LJLLLLLL(8, c20516015Pq2);
        ViewGroup.LayoutParams c19me4 = new C19ME(-1, -1);
        a.LIZ(c20516015Pq2);
        if (c20516015Pq2.getParent() == null) {
            constraintLayout.addView(c20516015Pq2, c19me4);
        }
        ConstraintLayout constraintLayout2 = new ConstraintLayout(context);
        constraintLayout2.setId(R.id.ax2);
        constraintLayout2.setFocusable(true);
        constraintLayout2.setFocusableInTouchMode(true);
        ViewGroup.LayoutParams c19me5 = new C19ME(-1, -1);
        View c20516015Pq3 = new C20516015Pq(context);
        c20516015Pq3.setId(R.id.e2y);
        C19ME c19me6 = new C19ME((int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me6)) {
            c19me6.setMarginStart((int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()));
        }
        if (C19ME.class.isInstance(c19me6)) {
            c19me6.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me6)) {
            c19me6.topToTop = 0;
        }
        a.LIZ(c20516015Pq3);
        if (c20516015Pq3.getParent() == null) {
            constraintLayout2.addView(c20516015Pq3, c19me6);
        }
        C426160GnO c426160GnO = new C426160GnO(context);
        c426160GnO.setId(R.id.idc);
        c426160GnO.setPadding((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), c426160GnO.getPaddingTop(), c426160GnO.getPaddingRight(), c426160GnO.getPaddingBottom());
        C19ME c19me7 = new C19ME((int) TypedValue.applyDimension(1, 306.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me7)) {
            c19me7.setMarginStart((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me7)) {
            c19me7.setMarginEnd((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me7)) {
            ((ViewGroup.MarginLayoutParams) c19me7).bottomMargin = (int) TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me7)) {
            ((ViewGroup.MarginLayoutParams) c19me7).topMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        }
        new xem.a();
        xem.a.LIZ(new a.c("left"), c426160GnO);
        if (C19ME.class.isInstance(c19me7)) {
            c19me7.bottomToBottom = 0;
        }
        if (C19ME.class.isInstance(c19me7)) {
            c19me7.bottomToTop = R.id.j3b;
        }
        if (C19ME.class.isInstance(c19me7)) {
            c19me7.endToEnd = 0;
        }
        if (C19ME.class.isInstance(c19me7)) {
            c19me7.startToStart = 0;
        }
        C20516015Pq c20516015Pq4 = new C20516015Pq(context);
        c20516015Pq4.setId(R.id.tft);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ2 = android.view.a.LJ(-2, -2, c426160GnO);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            marginLayoutParamsLJ2.topMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        }
        android.view.a.LIZ(c20516015Pq4);
        if (c20516015Pq4.getParent() == null) {
            c426160GnO.addView(c20516015Pq4, marginLayoutParamsLJ2);
        }
        C20516015Pq c20516015Pq5 = new C20516015Pq(context);
        c20516015Pq5.setId(R.id.bv1);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ3 = android.view.a.LJ(-2, -2, c426160GnO);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            marginLayoutParamsLJ3.setMarginStart((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            marginLayoutParamsLJ3.topMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        }
        android.view.a.LIZ(c20516015Pq5);
        if (c20516015Pq5.getParent() == null) {
            c426160GnO.addView(c20516015Pq5, marginLayoutParamsLJ3);
        }
        C20516015Pq c20516015Pq6 = new C20516015Pq(context);
        c20516015Pq6.setId(R.id.w7u);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ4 = android.view.a.LJ(-2, -2, c426160GnO);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ4)) {
            marginLayoutParamsLJ4.topMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        }
        android.view.a.LIZ(c20516015Pq6);
        if (c20516015Pq6.getParent() == null) {
            c426160GnO.addView(c20516015Pq6, marginLayoutParamsLJ4);
        }
        C20516015Pq c20516015Pq7 = new C20516015Pq(context);
        c20516015Pq7.setId(R.id.uvz);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ5 = android.view.a.LJ(-2, -2, c426160GnO);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ5)) {
            marginLayoutParamsLJ5.topMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        }
        android.view.a.LIZ(c20516015Pq7);
        if (c20516015Pq7.getParent() == null) {
            c426160GnO.addView(c20516015Pq7, marginLayoutParamsLJ5);
        }
        C20516015Pq c20516015Pq8 = new C20516015Pq(context);
        c20516015Pq8.setId(R.id.v30);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ6 = android.view.a.LJ(-2, -2, c426160GnO);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ6)) {
            marginLayoutParamsLJ6.topMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        }
        android.view.a.LIZ(c20516015Pq8);
        if (c20516015Pq8.getParent() == null) {
            c426160GnO.addView(c20516015Pq8, marginLayoutParamsLJ6);
        }
        C20516015Pq c20516015Pq9 = new C20516015Pq(context);
        c20516015Pq9.setId(R.id.mxs);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ7 = android.view.a.LJ(-2, -2, c426160GnO);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ7)) {
            marginLayoutParamsLJ7.topMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        android.view.a.LIZ(c20516015Pq9);
        if (c20516015Pq9.getParent() == null) {
            c426160GnO.addView(c20516015Pq9, marginLayoutParamsLJ7);
        }
        C20516015Pq c20516015Pq10 = new C20516015Pq(context);
        c20516015Pq10.setId(R.id.da_);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ8 = android.view.a.LJ(-2, -2, c426160GnO);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ8)) {
            marginLayoutParamsLJ8.topMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        }
        android.view.a.LIZ(c20516015Pq10);
        if (c20516015Pq10.getParent() == null) {
            c426160GnO.addView(c20516015Pq10, marginLayoutParamsLJ8);
        }
        C20516015Pq c20516015Pq11 = new C20516015Pq(context);
        c20516015Pq11.setId(R.id.f757myl);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ9 = android.view.a.LJ(-2, -2, c426160GnO);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ9)) {
            marginLayoutParamsLJ9.topMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        }
        android.view.a.LIZ(c20516015Pq11);
        if (c20516015Pq11.getParent() == null) {
            c426160GnO.addView(c20516015Pq11, marginLayoutParamsLJ9);
        }
        C20516015Pq c20516015Pq12 = new C20516015Pq(context);
        c20516015Pq12.setId(R.id.wil);
        C786410Ut5.LJLLLLLL(8, c20516015Pq12);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ10 = android.view.a.LJ(-2, -2, c426160GnO);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ10)) {
            marginLayoutParamsLJ10.topMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        }
        android.view.a.LIZ(c20516015Pq12);
        if (c20516015Pq12.getParent() == null) {
            c426160GnO.addView(c20516015Pq12, marginLayoutParamsLJ10);
        }
        C20516015Pq c20516015Pq13 = new C20516015Pq(context);
        c20516015Pq13.setId(R.id.ho4);
        C786410Ut5.LJLLLLLL(8, c20516015Pq13);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ11 = android.view.a.LJ(-2, -2, c426160GnO);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ11)) {
            marginLayoutParamsLJ11.topMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        }
        android.view.a.LIZ(c20516015Pq13);
        if (c20516015Pq13.getParent() == null) {
            c426160GnO.addView(c20516015Pq13, marginLayoutParamsLJ11);
        }
        C20516015Pq c20516015Pq14 = new C20516015Pq(context);
        c20516015Pq14.setId(R.id.upsell_widget_container);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ12 = android.view.a.LJ(-2, -2, c426160GnO);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ12)) {
            marginLayoutParamsLJ12.topMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        }
        android.view.a.LIZ(c20516015Pq14);
        if (c20516015Pq14.getParent() == null) {
            c426160GnO.addView(c20516015Pq14, marginLayoutParamsLJ12);
        }
        C20516015Pq c20516015Pq15 = new C20516015Pq(context);
        c20516015Pq15.setId(R.id.gf9);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ13 = android.view.a.LJ(-2, -2, c426160GnO);
        android.view.a.LIZ(c20516015Pq15);
        if (c20516015Pq15.getParent() == null) {
            c426160GnO.addView(c20516015Pq15, marginLayoutParamsLJ13);
        }
        C20516015Pq c20516015Pq16 = new C20516015Pq(context);
        c20516015Pq16.setId(R.id.d6f);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ14 = android.view.a.LJ(-2, -2, c426160GnO);
        android.view.a.LIZ(c20516015Pq16);
        if (c20516015Pq16.getParent() == null) {
            c426160GnO.addView(c20516015Pq16, marginLayoutParamsLJ14);
        }
        C20516015Pq c20516015Pq17 = new C20516015Pq(context);
        c20516015Pq17.setId(R.id.s_u);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ15 = android.view.a.LJ(-2, -2, c426160GnO);
        android.view.a.LIZ(c20516015Pq17);
        if (c20516015Pq17.getParent() == null) {
            c426160GnO.addView(c20516015Pq17, marginLayoutParamsLJ15);
        }
        C20516015Pq c20516015Pq18 = new C20516015Pq(context);
        c20516015Pq18.setId(R.id.fdt);
        C786410Ut5.LJLLLLLL(8, c20516015Pq18);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ16 = android.view.a.LJ(-2, -2, c426160GnO);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ16)) {
            marginLayoutParamsLJ16.topMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        }
        android.view.a.LIZ(c20516015Pq18);
        if (c20516015Pq18.getParent() == null) {
            c426160GnO.addView(c20516015Pq18, marginLayoutParamsLJ16);
        }
        C20516015Pq c20516015Pq19 = new C20516015Pq(context);
        c20516015Pq19.setId(R.id.viewer_wishes_widget_container);
        C786410Ut5.LJLLLLLL(8, c20516015Pq19);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ17 = android.view.a.LJ(-2, -2, c426160GnO);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ17)) {
            marginLayoutParamsLJ17.topMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        }
        android.view.a.LIZ(c20516015Pq19);
        if (c20516015Pq19.getParent() == null) {
            c426160GnO.addView(c20516015Pq19, marginLayoutParamsLJ17);
        }
        android.view.a.LIZ(c426160GnO);
        if (c426160GnO.getParent() == null) {
            constraintLayout2.addView(c426160GnO, c19me7);
        }
        ConstraintLayout constraintLayout3 = new ConstraintLayout(context);
        constraintLayout3.setId(R.id.f5n);
        constraintLayout3.setBackgroundResource(R.drawable.e3y);
        C19ME c19me8 = new C19ME((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me8)) {
            c19me8.setMarginStart((int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me8)) {
            ((ViewGroup.MarginLayoutParams) c19me8).leftMargin = (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me8)) {
            ((ViewGroup.MarginLayoutParams) c19me8).topMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me8)) {
            c19me8.setMarginEnd((int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me8)) {
            ((ViewGroup.MarginLayoutParams) c19me8).rightMargin = (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics());
        }
        if (C19ME.class.isInstance(c19me8)) {
            c19me8.endToEnd = 0;
        }
        if (C19ME.class.isInstance(c19me8)) {
            c19me8.horizontalBias = 0.0f;
        }
        if (C19ME.class.isInstance(c19me8)) {
            c19me8.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me8)) {
            c19me8.topToBottom = R.id.e2y;
        }
        C20516015Pq c20516015Pq20 = new C20516015Pq(context);
        c20516015Pq20.setId(R.id.y3r);
        C19ME c19me9 = new C19ME((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me9)) {
            c19me9.setMarginStart((int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me9)) {
            c19me9.setMarginEnd((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        if (C19ME.class.isInstance(c19me9)) {
            c19me9.goneStartMargin = (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics());
        }
        if (C19ME.class.isInstance(c19me9)) {
            c19me9.startToEnd = R.id.f5x;
        }
        if (C19ME.class.isInstance(c19me9)) {
            i = 0;
            c19me9.endToEnd = 0;
        } else {
            i = 0;
        }
        if (C19ME.class.isInstance(c19me9)) {
            c19me9.topToTop = i;
        }
        android.view.a.LIZ(c20516015Pq20);
        if (c20516015Pq20.getParent() == null) {
            constraintLayout3.addView(c20516015Pq20, c19me9);
        }
        C20516015Pq c20516015Pq21 = new C20516015Pq(context);
        c20516015Pq21.setId(R.id.fpk);
        C19ME c19me10 = new C19ME((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (C19ME.class.isInstance(c19me10)) {
            c19me10.topToBottom = R.id.y3r;
        }
        if (C19ME.class.isInstance(c19me10)) {
            c19me10.startToStart = R.id.y3r;
        }
        if (C19ME.class.isInstance(c19me10)) {
            i2 = 0;
            c19me10.endToEnd = 0;
        } else {
            i2 = 0;
        }
        if (C19ME.class.isInstance(c19me10)) {
            c19me10.bottomToBottom = i2;
        }
        if (C19ME.class.isInstance(c19me10)) {
            c19me10.matchConstraintDefaultHeight = 1;
        }
        if (C19ME.class.isInstance(c19me10)) {
            c19me10.verticalBias = 1.0f;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me10)) {
            ((ViewGroup.MarginLayoutParams) c19me10).bottomMargin = (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics());
        }
        android.view.a.LIZ(c20516015Pq21);
        if (c20516015Pq21.getParent() == null) {
            constraintLayout3.addView(c20516015Pq21, c19me10);
        }
        C20516015Pq c20516015Pq22 = new C20516015Pq(context);
        c20516015Pq22.setId(R.id.io8);
        C786410Ut5.LJLLLLLL(8, c20516015Pq22);
        C19ME c19me11 = new C19ME(-1, -1);
        if (C19ME.class.isInstance(c19me11)) {
            i3 = 0;
            c19me11.startToStart = 0;
        } else {
            i3 = 0;
        }
        if (C19ME.class.isInstance(c19me11)) {
            c19me11.endToEnd = i3;
        }
        if (C19ME.class.isInstance(c19me11)) {
            c19me11.topToTop = i3;
        }
        if (C19ME.class.isInstance(c19me11)) {
            c19me11.bottomToBottom = i3;
        }
        android.view.a.LIZ(c20516015Pq22);
        if (c20516015Pq22.getParent() == null) {
            constraintLayout3.addView(c20516015Pq22, c19me11);
        }
        C20516015Pq c20516015Pq23 = new C20516015Pq(context);
        c20516015Pq23.setId(R.id.f5x);
        C19ME c19me12 = new C19ME(-2, -1);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me12)) {
            f = 6.0f;
            c19me12.setMarginStart((int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()));
        } else {
            f = 6.0f;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me12)) {
            ((ViewGroup.MarginLayoutParams) c19me12).topMargin = (int) TypedValue.applyDimension(1, f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me12)) {
            ((ViewGroup.MarginLayoutParams) c19me12).bottomMargin = (int) TypedValue.applyDimension(1, f, resources.getDisplayMetrics());
        }
        if (C19ME.class.isInstance(c19me12)) {
            i4 = 0;
            c19me12.startToStart = 0;
        } else {
            i4 = 0;
        }
        if (C19ME.class.isInstance(c19me12)) {
            c19me12.topToTop = i4;
        }
        if (C19ME.class.isInstance(c19me12)) {
            c19me12.bottomToBottom = i4;
        }
        android.view.a.LIZ(c20516015Pq23);
        if (c20516015Pq23.getParent() == null) {
            constraintLayout3.addView(c20516015Pq23, c19me12);
        }
        android.view.a.LIZ(constraintLayout3);
        if (constraintLayout3.getParent() == null) {
            constraintLayout2.addView(constraintLayout3, c19me8);
        }
        View c20516015Pq24 = new C20516015Pq(context);
        c20516015Pq24.setId(R.id.brb);
        C786410Ut5.LJLLLLLL(8, c20516015Pq24);
        C19ME c19me13 = new C19ME((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me13)) {
            ((ViewGroup.MarginLayoutParams) c19me13).topMargin = (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics());
        }
        if (C19ME.class.isInstance(c19me13)) {
            i5 = R.id.f5n;
            c19me13.endToEnd = R.id.f5n;
        } else {
            i5 = R.id.f5n;
        }
        if (C19ME.class.isInstance(c19me13)) {
            c19me13.startToStart = i5;
        }
        if (C19ME.class.isInstance(c19me13)) {
            c19me13.topToBottom = R.id.n4d;
        }
        if (C19ME.class.isInstance(c19me13)) {
            c19me13.bottomToTop = R.id.idc;
        }
        android.view.a.LIZ(c20516015Pq24);
        if (c20516015Pq24.getParent() == null) {
            constraintLayout2.addView(c20516015Pq24, c19me13);
        }
        View c20516015Pq25 = new C20516015Pq(context);
        c20516015Pq25.setId(R.id.pfn);
        C786410Ut5.LJLLLLLL(8, c20516015Pq25);
        C19ME c19me14 = new C19ME((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me14)) {
            ((ViewGroup.MarginLayoutParams) c19me14).topMargin = (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics());
        }
        if (C19ME.class.isInstance(c19me14)) {
            i6 = R.id.f5n;
            c19me14.endToEnd = R.id.f5n;
        } else {
            i6 = R.id.f5n;
        }
        if (C19ME.class.isInstance(c19me14)) {
            c19me14.startToStart = i6;
        }
        if (C19ME.class.isInstance(c19me14)) {
            c19me14.topToBottom = R.id.brb;
        }
        android.view.a.LIZ(c20516015Pq25);
        if (c20516015Pq25.getParent() == null) {
            constraintLayout2.addView(c20516015Pq25, c19me14);
        }
        ConstraintLayout constraintLayout4 = new ConstraintLayout(context);
        constraintLayout4.setId(R.id.i08);
        C19ME c19me15 = new C19ME((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me15)) {
            ((ViewGroup.MarginLayoutParams) c19me15).topMargin = (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics());
        }
        if (C19ME.class.isInstance(c19me15)) {
            i7 = R.id.f5n;
            c19me15.endToEnd = R.id.f5n;
        } else {
            i7 = R.id.f5n;
        }
        if (C19ME.class.isInstance(c19me15)) {
            c19me15.startToStart = i7;
        }
        if (C19ME.class.isInstance(c19me15)) {
            c19me15.topToBottom = i7;
        }
        C20516015Pq c20516015Pq26 = new C20516015Pq(context);
        c20516015Pq26.setId(R.id.jgy);
        C786410Ut5.LJLLLLLL(0, c20516015Pq26);
        C19ME c19me16 = new C19ME((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 28.0f, resources.getDisplayMetrics()));
        if (C19ME.class.isInstance(c19me16)) {
            c19me16.endToStart = R.id.wao;
        }
        if (C19ME.class.isInstance(c19me16)) {
            i8 = 0;
            c19me16.startToStart = 0;
        } else {
            i8 = 0;
        }
        if (C19ME.class.isInstance(c19me16)) {
            c19me16.topToTop = i8;
        }
        android.view.a.LIZ(c20516015Pq26);
        if (c20516015Pq26.getParent() == null) {
            constraintLayout4.addView(c20516015Pq26, c19me16);
        }
        C20516015Pq c20516015Pq27 = new C20516015Pq(context);
        c20516015Pq27.setId(R.id.wao);
        C786410Ut5.LJLLLLLL(0, c20516015Pq27);
        C19ME c19me17 = new C19ME((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me17)) {
            c19me17.setMarginStart((int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()));
        }
        if (C19ME.class.isInstance(c19me17)) {
            c19me17.goneStartMargin = (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics());
        }
        if (C19ME.class.isInstance(c19me17)) {
            c19me17.startToEnd = R.id.jgy;
        }
        if (C19ME.class.isInstance(c19me17)) {
            i9 = 0;
            c19me17.endToEnd = 0;
        } else {
            i9 = 0;
        }
        if (C19ME.class.isInstance(c19me17)) {
            c19me17.topToTop = i9;
        }
        android.view.a.LIZ(c20516015Pq27);
        if (c20516015Pq27.getParent() == null) {
            constraintLayout4.addView(c20516015Pq27, c19me17);
        }
        android.view.a.LIZ(constraintLayout4);
        if (constraintLayout4.getParent() == null) {
            constraintLayout2.addView(constraintLayout4, c19me15);
        }
        View c20516015Pq28 = new C20516015Pq(context);
        c20516015Pq28.setId(R.id.omi);
        C786410Ut5.LJLLLLLL(8, c20516015Pq28);
        C19ME c19me18 = new C19ME((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (C19ME.class.isInstance(c19me18)) {
            c19me18.verticalBias = 0.0f;
        }
        if (C19ME.class.isInstance(c19me18)) {
            i10 = 0;
            c19me18.endToEnd = 0;
        } else {
            i10 = 0;
        }
        if (C19ME.class.isInstance(c19me18)) {
            c19me18.startToStart = i10;
        }
        if (C19ME.class.isInstance(c19me18)) {
            c19me18.topToTop = i10;
        }
        android.view.a.LIZ(c20516015Pq28);
        if (c20516015Pq28.getParent() == null) {
            constraintLayout2.addView(c20516015Pq28, c19me18);
        }
        View c20516015Pq29 = new C20516015Pq(context);
        c20516015Pq29.setId(R.id.rwf);
        C786410Ut5.LJLLLLLL(8, c20516015Pq29);
        C19ME c19me19 = new C19ME((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me19)) {
            ((ViewGroup.MarginLayoutParams) c19me19).topMargin = (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics());
        }
        if (C19ME.class.isInstance(c19me19)) {
            i11 = R.id.f5n;
            c19me19.endToEnd = R.id.f5n;
        } else {
            i11 = R.id.f5n;
        }
        if (C19ME.class.isInstance(c19me19)) {
            c19me19.startToStart = i11;
        }
        if (C19ME.class.isInstance(c19me19)) {
            c19me19.topToBottom = R.id.i08;
        }
        android.view.a.LIZ(c20516015Pq29);
        if (c20516015Pq29.getParent() == null) {
            constraintLayout2.addView(c20516015Pq29, c19me19);
        }
        View c20516015Pq30 = new C20516015Pq(context);
        c20516015Pq30.setId(R.id.b0w);
        C786410Ut5.LJLLLLLL(8, c20516015Pq30);
        C19ME c19me20 = new C19ME((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me20)) {
            ((ViewGroup.MarginLayoutParams) c19me20).topMargin = (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics());
        }
        if (C19ME.class.isInstance(c19me20)) {
            i12 = R.id.f5n;
            c19me20.endToEnd = R.id.f5n;
        } else {
            i12 = R.id.f5n;
        }
        if (C19ME.class.isInstance(c19me20)) {
            c19me20.startToStart = i12;
        }
        if (C19ME.class.isInstance(c19me20)) {
            c19me20.topToBottom = R.id.i08;
        }
        android.view.a.LIZ(c20516015Pq30);
        if (c20516015Pq30.getParent() == null) {
            constraintLayout2.addView(c20516015Pq30, c19me20);
        }
        View c20516015Pq31 = new C20516015Pq(context);
        c20516015Pq31.setId(R.id.b0s);
        C786410Ut5.LJLLLLLL(8, c20516015Pq31);
        C19ME c19me21 = new C19ME((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me21)) {
            ((ViewGroup.MarginLayoutParams) c19me21).topMargin = (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics());
        }
        if (C19ME.class.isInstance(c19me21)) {
            i13 = R.id.f5n;
            c19me21.endToEnd = R.id.f5n;
        } else {
            i13 = R.id.f5n;
        }
        if (C19ME.class.isInstance(c19me21)) {
            c19me21.startToStart = i13;
        }
        if (C19ME.class.isInstance(c19me21)) {
            c19me21.topToBottom = R.id.b0w;
        }
        android.view.a.LIZ(c20516015Pq31);
        if (c20516015Pq31.getParent() == null) {
            constraintLayout2.addView(c20516015Pq31, c19me21);
        }
        View c20516015Pq32 = new C20516015Pq(context);
        c20516015Pq32.setId(R.id.n4d);
        C786410Ut5.LJLLLLLL(8, c20516015Pq32);
        C19ME c19me22 = new C19ME((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me22)) {
            ((ViewGroup.MarginLayoutParams) c19me22).topMargin = (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics());
        }
        if (C19ME.class.isInstance(c19me22)) {
            i14 = R.id.f5n;
            c19me22.endToEnd = R.id.f5n;
        } else {
            i14 = R.id.f5n;
        }
        if (C19ME.class.isInstance(c19me22)) {
            c19me22.startToStart = i14;
        }
        if (C19ME.class.isInstance(c19me22)) {
            c19me22.topToBottom = R.id.b0s;
        }
        android.view.a.LIZ(c20516015Pq32);
        if (c20516015Pq32.getParent() == null) {
            constraintLayout2.addView(c20516015Pq32, c19me22);
        }
        View c20516015Pq33 = new C20516015Pq(context);
        c20516015Pq33.setId(R.id.myv);
        C786410Ut5.LJLLLLLL(8, c20516015Pq33);
        C19ME c19me23 = new C19ME((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me23)) {
            ((ViewGroup.MarginLayoutParams) c19me23).topMargin = (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics());
        }
        if (C19ME.class.isInstance(c19me23)) {
            i15 = R.id.f5n;
            c19me23.endToEnd = R.id.f5n;
        } else {
            i15 = R.id.f5n;
        }
        if (C19ME.class.isInstance(c19me23)) {
            c19me23.startToStart = i15;
        }
        if (C19ME.class.isInstance(c19me23)) {
            c19me23.topToBottom = R.id.b0s;
        }
        android.view.a.LIZ(c20516015Pq33);
        if (c20516015Pq33.getParent() == null) {
            constraintLayout2.addView(c20516015Pq33, c19me23);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.j3b);
        C19ME c19me24 = new C19ME((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me24)) {
            f2 = 16.0f;
            ((ViewGroup.MarginLayoutParams) c19me24).topMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        } else {
            f2 = 16.0f;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me24)) {
            ((ViewGroup.MarginLayoutParams) c19me24).bottomMargin = (int) TypedValue.applyDimension(1, f2, resources.getDisplayMetrics());
        }
        if (C19ME.class.isInstance(c19me24)) {
            c19me24.bottomToTop = R.id.vyv;
        }
        if (C19ME.class.isInstance(c19me24)) {
            c19me24.endToEnd = R.id.vyv;
        }
        if (C19ME.class.isInstance(c19me24)) {
            c19me24.leftToLeft = R.id.vyv;
        }
        if (C19ME.class.isInstance(c19me24)) {
            c19me24.rightToRight = R.id.vyv;
        }
        if (C19ME.class.isInstance(c19me24)) {
            c19me24.startToStart = R.id.vyv;
        }
        if (C19ME.class.isInstance(c19me24)) {
            c19me24.matchConstraintDefaultWidth = 1;
        }
        C20516015Pq c20516015Pq34 = new C20516015Pq(context);
        c20516015Pq34.setId(R.id.b7_);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        android.view.a.LIZ(c20516015Pq34);
        if (c20516015Pq34.getParent() == null) {
            frameLayout.addView(c20516015Pq34, layoutParams);
        }
        android.view.a.LIZ(frameLayout);
        if (frameLayout.getParent() == null) {
            constraintLayout2.addView(frameLayout, c19me24);
        }
        ConstraintLayout constraintLayout5 = new ConstraintLayout(context);
        constraintLayout5.setId(R.id.vyv);
        C19ME c19me25 = new C19ME(-2, -2);
        if (C19ME.class.isInstance(c19me25)) {
            c19me25.bottomToTop = R.id.n23;
        }
        if (C19ME.class.isInstance(c19me25)) {
            i16 = 0;
            c19me25.endToEnd = 0;
        } else {
            i16 = 0;
        }
        if (C19ME.class.isInstance(c19me25)) {
            c19me25.startToStart = i16;
        }
        if (C19ME.class.isInstance(c19me25)) {
            c19me25.goneBottomMargin = (int) TypedValue.applyDimension(1, 80.0f, resources.getDisplayMetrics());
        }
        C20516015Pq c20516015Pq35 = new C20516015Pq(context);
        c20516015Pq35.setId(R.id.vyx);
        C19ME c19me26 = new C19ME((int) resources.getDimension(R.dimen.ayo), (int) TypedValue.applyDimension(1, 52.0f, resources.getDisplayMetrics()));
        if (C19ME.class.isInstance(c19me26)) {
            i17 = 0;
            c19me26.bottomToBottom = 0;
        } else {
            i17 = 0;
        }
        if (C19ME.class.isInstance(c19me26)) {
            c19me26.endToEnd = i17;
        }
        if (C19ME.class.isInstance(c19me26)) {
            c19me26.startToStart = i17;
        }
        android.view.a.LIZ(c20516015Pq35);
        if (c20516015Pq35.getParent() == null) {
            constraintLayout5.addView(c20516015Pq35, c19me26);
        }
        android.view.a.LIZ(constraintLayout5);
        if (constraintLayout5.getParent() == null) {
            constraintLayout2.addView(constraintLayout5, c19me25);
        }
        View view3 = new View(context);
        view3.setId(R.id.j2_);
        C19ME c19me27 = new C19ME(-2, (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()));
        if (C19ME.class.isInstance(c19me27)) {
            c19me27.goneBottomMargin = (int) TypedValue.applyDimension(1, 80.0f, resources.getDisplayMetrics());
        }
        if (C19ME.class.isInstance(c19me27)) {
            c19me27.bottomToTop = R.id.n23;
        }
        if (C19ME.class.isInstance(c19me27)) {
            i18 = 0;
            c19me27.endToEnd = 0;
        } else {
            i18 = 0;
        }
        if (C19ME.class.isInstance(c19me27)) {
            c19me27.startToStart = i18;
        }
        android.view.a.LIZ(view3);
        if (view3.getParent() == null) {
            constraintLayout2.addView(view3, c19me27);
        }
        View view4 = new View(context);
        view4.setId(R.id.n23);
        C19ME c19me28 = new C19ME(-1, (int) TypedValue.applyDimension(1, 112.0f, resources.getDisplayMetrics()));
        if (C19ME.class.isInstance(c19me28)) {
            c19me28.bottomToBottom = 0;
        }
        android.view.a.LIZ(view4);
        if (view4.getParent() == null) {
            constraintLayout2.addView(view4, c19me28);
        }
        View c20516015Pq36 = new C20516015Pq(context);
        c20516015Pq36.setId(R.id.j8k);
        C19ME c19me29 = new C19ME((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me29)) {
            ((ViewGroup.MarginLayoutParams) c19me29).topMargin = (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics());
        }
        if (C19ME.class.isInstance(c19me29)) {
            i19 = R.id.f5n;
            c19me29.endToEnd = R.id.f5n;
        } else {
            i19 = R.id.f5n;
        }
        if (C19ME.class.isInstance(c19me29)) {
            c19me29.startToStart = i19;
        }
        if (C19ME.class.isInstance(c19me29)) {
            c19me29.topToBottom = R.id.n4d;
        }
        android.view.a.LIZ(c20516015Pq36);
        if (c20516015Pq36.getParent() == null) {
            constraintLayout2.addView(c20516015Pq36, c19me29);
        }
        View c20516015Pq37 = new C20516015Pq(context);
        c20516015Pq37.setId(R.id.t72);
        c20516015Pq37.setBackgroundColor(resources.getColor(R.color.dr));
        C19ME c19me30 = new C19ME((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me30)) {
            ((ViewGroup.MarginLayoutParams) c19me30).topMargin = (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics());
        }
        if (C19ME.class.isInstance(c19me30)) {
            i20 = R.id.f5n;
            c19me30.endToEnd = R.id.f5n;
        } else {
            i20 = R.id.f5n;
        }
        if (C19ME.class.isInstance(c19me30)) {
            c19me30.startToStart = i20;
        }
        if (C19ME.class.isInstance(c19me30)) {
            c19me30.topToBottom = R.id.j8k;
        }
        android.view.a.LIZ(c20516015Pq37);
        if (c20516015Pq37.getParent() == null) {
            constraintLayout2.addView(c20516015Pq37, c19me30);
        }
        View c20516015Pq38 = new C20516015Pq(context);
        c20516015Pq38.setId(R.id.iuw);
        C19ME c19me31 = new C19ME(-1, -1);
        if (C19ME.class.isInstance(c19me31)) {
            i21 = 0;
            c19me31.topToTop = 0;
        } else {
            i21 = 0;
        }
        if (C19ME.class.isInstance(c19me31)) {
            c19me31.bottomToBottom = i21;
        }
        if (C19ME.class.isInstance(c19me31)) {
            c19me31.startToStart = i21;
        }
        if (C19ME.class.isInstance(c19me31)) {
            c19me31.endToEnd = i21;
        }
        android.view.a.LIZ(c20516015Pq38);
        if (c20516015Pq38.getParent() == null) {
            constraintLayout2.addView(c20516015Pq38, c19me31);
        }
        View frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.w4u);
        C19ME c19me32 = new C19ME(-1, -2);
        if (C19ME.class.isInstance(c19me32)) {
            i22 = 0;
            c19me32.bottomToBottom = 0;
        } else {
            i22 = 0;
        }
        if (C19ME.class.isInstance(c19me32)) {
            c19me32.leftToLeft = i22;
        }
        if (C19ME.class.isInstance(c19me32)) {
            c19me32.rightToRight = i22;
        }
        android.view.a.LIZ(frameLayout2);
        if (frameLayout2.getParent() == null) {
            constraintLayout2.addView(frameLayout2, c19me32);
        }
        View c20516015Pq39 = new C20516015Pq(context);
        c20516015Pq39.setId(R.id.hye);
        ViewGroup.LayoutParams c19me33 = new C19ME(-1, -1);
        android.view.a.LIZ(c20516015Pq39);
        if (c20516015Pq39.getParent() == null) {
            constraintLayout2.addView(c20516015Pq39, c19me33);
        }
        ConstraintLayout constraintLayout6 = new ConstraintLayout(context);
        constraintLayout6.setId(R.id.idk);
        constraintLayout6.setClipChildren(false);
        C786410Ut5.LJLLLLLL(8, constraintLayout6);
        C19ME c19me34 = new C19ME(-2, -2);
        if (C19ME.class.isInstance(c19me34)) {
            c19me34.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me34)) {
            c19me34.endToEnd = 0;
        }
        if (C19ME.class.isInstance(c19me34)) {
            c19me34.topToTop = 0;
        }
        if (C19ME.class.isInstance(c19me34)) {
            c19me34.bottomToBottom = 0;
        }
        if (C19ME.class.isInstance(c19me34)) {
            c19me34.verticalBias = 0.5f;
        }
        if (C19ME.class.isInstance(c19me34)) {
            c19me34.horizontalBias = 0.36f;
        }
        C16FV c16fv = new C16FV(context);
        c16fv.setId(R.id.idl);
        c16fv.setImageResource(R.drawable.ebz);
        C19ME c19me35 = new C19ME((int) TypedValue.applyDimension(1, 62.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 62.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(c19me35)) {
            ((LinearLayout.LayoutParams) c19me35).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(c19me35)) {
            ((FrameLayout.LayoutParams) c19me35).gravity = 17;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(c19me35)) {
            ((DrawerLayout$LayoutParams) c19me35).gravity = 17;
        }
        if (C19ME.class.isInstance(c19me35)) {
            c19me35.horizontalBias = 0.36f;
        }
        if (C19ME.class.isInstance(c19me35)) {
            i23 = 0;
            c19me35.topToTop = 0;
        } else {
            i23 = 0;
        }
        if (C19ME.class.isInstance(c19me35)) {
            c19me35.startToStart = i23;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me35)) {
            ((ViewGroup.MarginLayoutParams) c19me35).topMargin = (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics());
        }
        if (C19ME.class.isInstance(c19me35)) {
            c19me35.endToEnd = 0;
        }
        android.view.a.LIZ(c16fv);
        if (c16fv.getParent() == null) {
            constraintLayout6.addView(c16fv, c19me35);
        }
        C16FV c16fv2 = new C16FV(context);
        c16fv2.setId(R.id.hi_);
        c16fv2.setImageResource(R.drawable.euj);
        C19ME c19me36 = new C19ME((int) TypedValue.applyDimension(1, 30.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 30.0f, resources.getDisplayMetrics()));
        if (C19ME.class.isInstance(c19me36)) {
            c19me36.topToTop = R.id.idl;
        }
        if (C19ME.class.isInstance(c19me36)) {
            c19me36.bottomToBottom = R.id.idl;
        }
        if (C19ME.class.isInstance(c19me36)) {
            c19me36.startToEnd = R.id.idl;
        }
        android.view.a.LIZ(c16fv2);
        if (c16fv2.getParent() == null) {
            constraintLayout6.addView(c16fv2, c19me36);
        }
        C1324720kZq c1324720kZq = new C1324720kZq(context);
        c1324720kZq.setId(R.id.jch);
        c1324720kZq.setScaleType(ImageView.ScaleType.CENTER_CROP);
        C19ME c19me37 = new C19ME((int) TypedValue.applyDimension(1, 200.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 200.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(c19me37)) {
            ((LinearLayout.LayoutParams) c19me37).gravity = 1;
        }
        if (FrameLayout.LayoutParams.class.isInstance(c19me37)) {
            ((FrameLayout.LayoutParams) c19me37).gravity = 1;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(c19me37)) {
            ((DrawerLayout$LayoutParams) c19me37).gravity = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me37)) {
            c19me37.setMarginStart((int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me37)) {
            ((ViewGroup.MarginLayoutParams) c19me37).topMargin = (int) TypedValue.applyDimension(1, 92.0f, resources.getDisplayMetrics());
        }
        if (C19ME.class.isInstance(c19me37)) {
            c19me37.topToTop = R.id.idl;
        }
        if (C19ME.class.isInstance(c19me37)) {
            c19me37.bottomToBottom = R.id.idl;
        }
        if (C19ME.class.isInstance(c19me37)) {
            c19me37.startToStart = R.id.idl;
        }
        android.view.a.LIZ(c1324720kZq);
        if (c1324720kZq.getParent() == null) {
            constraintLayout6.addView(c1324720kZq, c19me37);
        }
        C16F5 c16f5 = new C16F5(context);
        c16f5.setId(R.id.jdm);
        c16f5.setGravity(17);
        c16f5.setText(2131841700);
        TypedArray typedArrayObtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.c9i});
        c16f5.setTextColor(typedArrayObtainStyledAttributes3.getColor(0, 0));
        typedArrayObtainStyledAttributes3.recycle();
        c16f5.setTextSize(2, 20.0f);
        C19ME c19me38 = new C19ME(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(c19me38)) {
            ((LinearLayout.LayoutParams) c19me38).gravity = 1;
        }
        if (FrameLayout.LayoutParams.class.isInstance(c19me38)) {
            ((FrameLayout.LayoutParams) c19me38).gravity = 1;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(c19me38)) {
            ((DrawerLayout$LayoutParams) c19me38).gravity = 1;
        }
        if (C19ME.class.isInstance(c19me38)) {
            i24 = 0;
            c19me38.startToStart = 0;
        } else {
            i24 = 0;
        }
        if (C19ME.class.isInstance(c19me38)) {
            c19me38.endToEnd = i24;
        }
        if (C19ME.class.isInstance(c19me38)) {
            c19me38.topToBottom = R.id.idl;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me38)) {
            ((ViewGroup.MarginLayoutParams) c19me38).topMargin = (int) TypedValue.applyDimension(1, 68.0f, resources.getDisplayMetrics());
        }
        android.view.a.LIZ(c16f5);
        if (c16f5.getParent() == null) {
            constraintLayout6.addView(c16f5, c19me38);
        }
        android.view.a.LIZ(constraintLayout6);
        if (constraintLayout6.getParent() == null) {
            constraintLayout2.addView(constraintLayout6, c19me34);
        }
        View c20516015Pq40 = new C20516015Pq(context);
        c20516015Pq40.setId(R.id.myo);
        ViewGroup.LayoutParams c19me39 = new C19ME(-1, -1);
        android.view.a.LIZ(c20516015Pq40);
        if (c20516015Pq40.getParent() == null) {
            constraintLayout2.addView(c20516015Pq40, c19me39);
        }
        android.view.a.LIZ(constraintLayout2);
        if (constraintLayout2.getParent() == null) {
            constraintLayout.addView(constraintLayout2, c19me5);
        }
        View c20516015Pq41 = new C20516015Pq(context);
        c20516015Pq41.setId(R.id.c17);
        ViewGroup.LayoutParams c19me40 = new C19ME(-1, -1);
        android.view.a.LIZ(c20516015Pq41);
        if (c20516015Pq41.getParent() == null) {
            constraintLayout.addView(c20516015Pq41, c19me40);
        }
        View c20516015Pq42 = new C20516015Pq(context);
        c20516015Pq42.setId(R.id.c7c);
        ViewGroup.LayoutParams c19me41 = new C19ME(-1, -1);
        android.view.a.LIZ(c20516015Pq42);
        if (c20516015Pq42.getParent() == null) {
            constraintLayout.addView(c20516015Pq42, c19me41);
        }
        View c20516015Pq43 = new C20516015Pq(context);
        c20516015Pq43.setId(R.id.d5u);
        ViewGroup.LayoutParams c19me42 = new C19ME(-1, -1);
        android.view.a.LIZ(c20516015Pq43);
        if (c20516015Pq43.getParent() == null) {
            constraintLayout.addView(c20516015Pq43, c19me42);
        }
        View c0ukt = new C0UKT(context);
        c0ukt.setId(R.id.j38);
        C786410Ut5.LJLLLLLL(8, c0ukt);
        ViewGroup.LayoutParams c19me43 = new C19ME(-1, -1);
        android.view.a.LIZ(c0ukt);
        if (c0ukt.getParent() == null) {
            constraintLayout.addView(c0ukt, c19me43);
        }
        android.view.a.LIZ(constraintLayout);
        C786410Ut5.W5(constraintLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(constraintLayout);
        }
        return constraintLayout;
    }
}
