package com.by.andInflater;

import X.C0GU3;
import X.C21279718Pj;
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
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.tag.TuxTag;
import com.zhiliaoapp.musically.R;
import dc.a;
import jem.b;
import xem.k;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class common_feed_layout_video_desc implements InterfaceC20742716Ev {
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
        Resources resources = context.getResources();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, R.style.hk);
        Resources resources2 = contextThemeWrapper.getResources();
        LinearLayout linearLayout = new LinearLayout(contextThemeWrapper);
        linearLayout.setId(R.id.em1);
        linearLayout.setOrientation(1);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -2, viewGroup);
        FrameLayout frameLayout = new FrameLayout(contextThemeWrapper);
        frameLayout.setId(R.id.fmv);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        LinearLayout linearLayout2 = new LinearLayout(contextThemeWrapper);
        linearLayout2.setId(R.id.fpc);
        linearLayout2.setOrientation(1);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
            ((LinearLayout.LayoutParams) layoutParams2).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.gravity = 80;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams2)) {
            ((DrawerLayout$LayoutParams) layoutParams2).gravity = 80;
        }
        C0GU3 c0gu3 = new C0GU3(contextThemeWrapper, null);
        c0gu3.setId(R.id.fo_);
        c0gu3.setOrientation(1);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        C21415018rM c21415018rM = new C21415018rM(contextThemeWrapper);
        c21415018rM.setId(R.id.title);
        C786410Ut5.LJLLLLLL(8, c21415018rM);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ2 = a.LJ(-1, -2, c0gu3);
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ2).gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ2).gravity = 16;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ2).gravity = 16;
        }
        a.LIZ(c21415018rM);
        if (c21415018rM.getParent() == null) {
            c0gu3.addView(c21415018rM, marginLayoutParamsLJ2);
        }
        C21415018rM c21415018rM2 = new C21415018rM(contextThemeWrapper);
        c21415018rM2.setId(R.id.desc);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ3 = a.LJ(-1, -2, c0gu3);
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            i = 16;
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ3).gravity = 16;
        } else {
            i = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ3).gravity = i;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ3).gravity = i;
        }
        a.LIZ(c21415018rM2);
        if (c21415018rM2.getParent() == null) {
            c0gu3.addView(c21415018rM2, marginLayoutParamsLJ3);
        }
        a.LIZ(c0gu3);
        if (c0gu3.getParent() == null) {
            linearLayout2.addView(c0gu3, layoutParams3);
        }
        View view = new View(contextThemeWrapper);
        view.setId(R.id.y5j);
        C786410Ut5.LJLLLLLL(8, view);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        a.LIZ(view);
        if (view.getParent() == null) {
            linearLayout2.addView(view, layoutParams4);
        }
        a.LIZ(linearLayout2);
        if (linearLayout2.getParent() == null) {
            frameLayout.addView(linearLayout2, layoutParams2);
        }
        LinearLayout linearLayout3 = new LinearLayout(contextThemeWrapper);
        linearLayout3.setId(R.id.cc2);
        linearLayout3.setGravity(8388691);
        linearLayout3.setOrientation(0);
        linearLayout3.setLayoutDirection(3);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams5)) {
            ((LinearLayout.LayoutParams) layoutParams5).gravity = 8388693;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.gravity = 8388693;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams5)) {
            ((DrawerLayout$LayoutParams) layoutParams5).gravity = 8388693;
        }
        TuxTextView tuxTextView = new TuxTextView(contextThemeWrapper);
        tuxTextView.setId(R.id.tv_toggle);
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.getTheme().obtainStyledAttributes(new int[]{R.attr.ef});
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        C786410Ut5.LJLLLLLL(8, tuxTextView);
        ViewGroup.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        new o();
        o.LIZ("app:tux_font", new a.c("H3_Semibold"), tuxTextView);
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            linearLayout3.addView(tuxTextView, layoutParams6);
        }
        LinearLayout linearLayout4 = new LinearLayout(contextThemeWrapper);
        linearLayout4.setId(R.id.yim);
        C786410Ut5.LJLLLLLL(8, linearLayout4);
        linearLayout4.setOrientation(0);
        linearLayout4.setLayoutDirection(3);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams7)) {
            layoutParams7.setMarginStart((int) TypedValue.applyDimension(1, 8.0f, resources2.getDisplayMetrics()));
        }
        View view2 = new View(new ContextThemeWrapper(contextThemeWrapper, R.style.y0));
        view2.setId(R.id.g00);
        view2.setBackgroundResource(R.drawable.asj);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams8)) {
            i2 = 16;
            layoutParams8.gravity = 16;
        } else {
            i2 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams8)) {
            ((FrameLayout.LayoutParams) layoutParams8).gravity = i2;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams8)) {
            ((DrawerLayout$LayoutParams) layoutParams8).gravity = i2;
        }
        android.view.a.LIZ(view2);
        if (view2.getParent() == null) {
            linearLayout4.addView(view2, layoutParams8);
        }
        TuxTextView tuxTextView2 = new TuxTextView(contextThemeWrapper);
        tuxTextView2.setId(R.id.yil);
        TypedArray typedArrayObtainStyledAttributes2 = contextThemeWrapper.getTheme().obtainStyledAttributes(new int[]{R.attr.zl});
        tuxTextView2.setTextColor(typedArrayObtainStyledAttributes2.getColor(0, 0));
        typedArrayObtainStyledAttributes2.recycle();
        tuxTextView2.setMaxLines(1);
        tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams9)) {
            layoutParams9.setMarginStart((int) TypedValue.applyDimension(1, 8.0f, resources2.getDisplayMetrics()));
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P2_Semibold"), tuxTextView2);
        android.view.a.LIZ(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            linearLayout4.addView(tuxTextView2, layoutParams9);
        }
        android.view.a.LIZ(linearLayout4);
        if (linearLayout4.getParent() == null) {
            linearLayout3.addView(linearLayout4, layoutParams7);
        }
        LinearLayout linearLayout5 = new LinearLayout(contextThemeWrapper);
        linearLayout5.setId(R.id.ac4);
        C786410Ut5.LJLLLLLL(8, linearLayout5);
        linearLayout5.setOrientation(0);
        linearLayout5.setLayoutDirection(3);
        LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams10)) {
            layoutParams10.setMarginStart((int) TypedValue.applyDimension(1, 8.0f, resources2.getDisplayMetrics()));
        }
        View view3 = new View(new ContextThemeWrapper(contextThemeWrapper, R.style.y0));
        view3.setId(R.id.ac5);
        view3.setBackgroundResource(R.drawable.asj);
        LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams11)) {
            i3 = 16;
            layoutParams11.gravity = 16;
        } else {
            i3 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams11)) {
            ((FrameLayout.LayoutParams) layoutParams11).gravity = i3;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams11)) {
            ((DrawerLayout$LayoutParams) layoutParams11).gravity = i3;
        }
        android.view.a.LIZ(view3);
        if (view3.getParent() == null) {
            linearLayout5.addView(view3, layoutParams11);
        }
        ContextThemeWrapper contextThemeWrapper2 = new ContextThemeWrapper(contextThemeWrapper, R.style.y0);
        Resources resources3 = contextThemeWrapper2.getResources();
        TuxTextView tuxTextView3 = new TuxTextView(contextThemeWrapper2);
        tuxTextView3.setId(R.id.ac6);
        TypedArray typedArrayObtainStyledAttributes3 = contextThemeWrapper2.getTheme().obtainStyledAttributes(new int[]{R.attr.zl});
        tuxTextView3.setTextColor(typedArrayObtainStyledAttributes3.getColor(0, 0));
        typedArrayObtainStyledAttributes3.recycle();
        tuxTextView3.setMaxLines(1);
        tuxTextView3.setEllipsize(TextUtils.TruncateAt.END);
        LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams12)) {
            layoutParams12.setMarginStart((int) TypedValue.applyDimension(1, 8.0f, resources3.getDisplayMetrics()));
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P1_Semibold"), tuxTextView3);
        android.view.a.LIZ(tuxTextView3);
        if (tuxTextView3.getParent() == null) {
            linearLayout5.addView(tuxTextView3, layoutParams12);
        }
        TuxIconView tuxIconView = new TuxIconView(new ContextThemeWrapper(contextThemeWrapper, R.style.y0));
        tuxIconView.setId(R.id.ac6);
        tuxIconView.setContentDescription(null);
        LinearLayout.LayoutParams layoutParams13 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams13)) {
            i4 = 16;
            layoutParams13.gravity = 16;
        } else {
            i4 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams13)) {
            ((FrameLayout.LayoutParams) layoutParams13).gravity = i4;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams13)) {
            ((DrawerLayout$LayoutParams) layoutParams13).gravity = i4;
        }
        new k();
        k.LIZ("app:tux_tintColor", new a.b("2131100624", "attr"), tuxIconView);
        k.LIZ("app:tux_icon", new a.b("2130772912", "raw"), tuxIconView);
        android.view.a.LIZ(tuxIconView);
        if (tuxIconView.getParent() == null) {
            linearLayout5.addView(tuxIconView, layoutParams13);
        }
        android.view.a.LIZ(linearLayout5);
        if (linearLayout5.getParent() == null) {
            linearLayout3.addView(linearLayout5, layoutParams10);
        }
        android.view.a.LIZ(linearLayout3);
        if (linearLayout3.getParent() == null) {
            frameLayout.addView(linearLayout3, layoutParams5);
        }
        LinearLayout linearLayout6 = new LinearLayout(contextThemeWrapper);
        linearLayout6.setId(R.id.dci);
        linearLayout6.setOrientation(0);
        ViewGroup.LayoutParams layoutParams14 = new FrameLayout.LayoutParams(-1, -2);
        LinearLayout linearLayout7 = new LinearLayout(contextThemeWrapper);
        linearLayout7.setId(R.id.dck);
        linearLayout7.setLayoutDirection(3);
        C786410Ut5.LJLLLLLL(8, linearLayout7);
        linearLayout7.setOrientation(0);
        LinearLayout.LayoutParams layoutParams15 = new LinearLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams15)) {
            i5 = 8388691;
            layoutParams15.gravity = 8388691;
        } else {
            i5 = 8388691;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams15)) {
            ((FrameLayout.LayoutParams) layoutParams15).gravity = i5;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams15)) {
            ((DrawerLayout$LayoutParams) layoutParams15).gravity = i5;
        }
        TuxTextView tuxTextView4 = new TuxTextView(contextThemeWrapper);
        tuxTextView4.setId(R.id.dcl);
        TypedArray typedArrayObtainStyledAttributes4 = contextThemeWrapper.getTheme().obtainStyledAttributes(new int[]{R.attr.eh});
        tuxTextView4.setTextColor(typedArrayObtainStyledAttributes4.getColor(0, 0));
        typedArrayObtainStyledAttributes4.recycle();
        tuxTextView4.setMaxLines(1);
        tuxTextView4.setEllipsize(TextUtils.TruncateAt.END);
        ViewGroup.LayoutParams layoutParams16 = new LinearLayout.LayoutParams(-2, -2);
        new o();
        o.LIZ("app:tux_font", new a.c("P1_Regular"), tuxTextView4);
        android.view.a.LIZ(tuxTextView4);
        if (tuxTextView4.getParent() == null) {
            linearLayout7.addView(tuxTextView4, layoutParams16);
        }
        TuxIconView tuxIconView2 = new TuxIconView(contextThemeWrapper);
        tuxIconView2.setId(R.id.dcj);
        LinearLayout.LayoutParams layoutParams17 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams17)) {
            layoutParams17.setMarginStart((int) TypedValue.applyDimension(1, 2.0f, resources2.getDisplayMetrics()));
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams17)) {
            i6 = 16;
            layoutParams17.gravity = 16;
        } else {
            i6 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams17)) {
            ((FrameLayout.LayoutParams) layoutParams17).gravity = i6;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams17)) {
            ((DrawerLayout$LayoutParams) layoutParams17).gravity = i6;
        }
        new k();
        k.LIZ("app:tux_tintColor", new a.b("2131099771", "attr"), tuxIconView2);
        k.LIZ("app:tux_icon", new a.b("2130772886", "raw"), tuxIconView2);
        android.view.a.LIZ(tuxIconView2);
        if (tuxIconView2.getParent() == null) {
            linearLayout7.addView(tuxIconView2, layoutParams17);
        }
        android.view.a.LIZ(linearLayout7);
        if (linearLayout7.getParent() == null) {
            linearLayout6.addView(linearLayout7, layoutParams15);
        }
        View view4 = new View(contextThemeWrapper);
        LinearLayout.LayoutParams layoutParams18 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams18)) {
            layoutParams18.weight = 1;
        }
        android.view.a.LIZ(view4);
        if (view4.getParent() == null) {
            linearLayout6.addView(view4, layoutParams18);
        }
        TuxTextView tuxTextView5 = new TuxTextView(contextThemeWrapper);
        tuxTextView5.setId(R.id.p60);
        TypedArray typedArrayObtainStyledAttributes5 = contextThemeWrapper.getTheme().obtainStyledAttributes(new int[]{R.attr.ef});
        tuxTextView5.setTextColor(typedArrayObtainStyledAttributes5.getColor(0, 0));
        typedArrayObtainStyledAttributes5.recycle();
        C786410Ut5.LJLLLLLL(8, tuxTextView5);
        LinearLayout.LayoutParams layoutParams19 = new LinearLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams19)) {
            i7 = 8388693;
            layoutParams19.gravity = 8388693;
        } else {
            i7 = 8388693;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams19)) {
            ((FrameLayout.LayoutParams) layoutParams19).gravity = i7;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams19)) {
            ((DrawerLayout$LayoutParams) layoutParams19).gravity = i7;
        }
        new o();
        o.LIZ("app:tux_font", new a.c("H3_Semibold"), tuxTextView5);
        android.view.a.LIZ(tuxTextView5);
        if (tuxTextView5.getParent() == null) {
            linearLayout6.addView(tuxTextView5, layoutParams19);
        }
        android.view.a.LIZ(linearLayout6);
        if (linearLayout6.getParent() == null) {
            frameLayout.addView(linearLayout6, layoutParams14);
        }
        android.view.a.LIZ(frameLayout);
        if (frameLayout.getParent() == null) {
            linearLayout.addView(frameLayout, layoutParams);
        }
        LinearLayout linearLayout8 = new LinearLayout(contextThemeWrapper);
        linearLayout8.setOrientation(0);
        ViewGroup.LayoutParams layoutParams20 = new LinearLayout.LayoutParams(-1, -2);
        TuxTextView tuxTextView6 = new TuxTextView(contextThemeWrapper);
        tuxTextView6.setId(R.id.q0v);
        TypedArray typedArrayObtainStyledAttributes6 = contextThemeWrapper.getTheme().obtainStyledAttributes(new int[]{R.attr.ef});
        tuxTextView6.setTextColor(typedArrayObtainStyledAttributes6.getColor(0, 0));
        typedArrayObtainStyledAttributes6.recycle();
        tuxTextView6.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView6.setMaxLines(1);
        C786410Ut5.LJLLLLLL(8, tuxTextView6);
        LinearLayout.LayoutParams layoutParams21 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams21)) {
            ((ViewGroup.MarginLayoutParams) layoutParams21).topMargin = (int) TypedValue.applyDimension(1, 4.0f, resources2.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams21)) {
            ((ViewGroup.MarginLayoutParams) layoutParams21).bottomMargin = (int) TypedValue.applyDimension(1, 4.0f, resources2.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams21)) {
            layoutParams21.setMarginEnd((int) TypedValue.applyDimension(1, 4.0f, resources2.getDisplayMetrics()));
        }
        android.view.a.LIZ(tuxTextView6);
        if (tuxTextView6.getParent() == null) {
            linearLayout8.addView(tuxTextView6, layoutParams21);
        }
        View c21279718Pj = new C21279718Pj(contextThemeWrapper);
        c21279718Pj.setId(R.id.q0w);
        C786410Ut5.LJLLLLLL(8, c21279718Pj);
        LinearLayout.LayoutParams layoutParams22 = new LinearLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams22)) {
            layoutParams22.gravity = 8388627;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams22)) {
            ((FrameLayout.LayoutParams) layoutParams22).gravity = 8388627;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams22)) {
            ((DrawerLayout$LayoutParams) layoutParams22).gravity = 8388627;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams22)) {
            i8 = 1;
            ((ViewGroup.MarginLayoutParams) layoutParams22).topMargin = (int) TypedValue.applyDimension(1, 4.0f, resources2.getDisplayMetrics());
        } else {
            i8 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams22)) {
            ((ViewGroup.MarginLayoutParams) layoutParams22).bottomMargin = (int) TypedValue.applyDimension(i8, 4.0f, resources2.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams22)) {
            layoutParams22.setMarginEnd((int) TypedValue.applyDimension(i8, 4.0f, resources2.getDisplayMetrics()));
        }
        android.view.a.LIZ(c21279718Pj);
        if (c21279718Pj.getParent() == null) {
            linearLayout8.addView(c21279718Pj, layoutParams22);
        }
        View c21279718Pj2 = new C21279718Pj(contextThemeWrapper);
        c21279718Pj2.setId(R.id.jla);
        C786410Ut5.LJLLLLLL(8, c21279718Pj2);
        LinearLayout.LayoutParams layoutParams23 = new LinearLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams23)) {
            layoutParams23.gravity = 8388627;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams23)) {
            ((FrameLayout.LayoutParams) layoutParams23).gravity = 8388627;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams23)) {
            ((DrawerLayout$LayoutParams) layoutParams23).gravity = 8388627;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams23)) {
            ((ViewGroup.MarginLayoutParams) layoutParams23).topMargin = (int) TypedValue.applyDimension(i8, 4.0f, resources2.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams23)) {
            ((ViewGroup.MarginLayoutParams) layoutParams23).bottomMargin = (int) TypedValue.applyDimension(i8, 4.0f, resources2.getDisplayMetrics());
        }
        android.view.a.LIZ(c21279718Pj2);
        if (c21279718Pj2.getParent() == null) {
            linearLayout8.addView(c21279718Pj2, layoutParams23);
        }
        android.view.a.LIZ(linearLayout8);
        if (linearLayout8.getParent() == null) {
            linearLayout.addView(linearLayout8, layoutParams20);
        }
        TuxTextView tuxTextView7 = new TuxTextView(contextThemeWrapper);
        tuxTextView7.setId(R.id.s_v);
        tuxTextView7.setPadding((int) TypedValue.applyDimension(i8, 4.0f, resources2.getDisplayMetrics()), tuxTextView7.getPaddingTop(), tuxTextView7.getPaddingRight(), tuxTextView7.getPaddingBottom());
        tuxTextView7.setPadding((int) TypedValue.applyDimension(i8, 4.0f, resources2.getDisplayMetrics()), tuxTextView7.getPaddingTop(), tuxTextView7.getPaddingRight(), tuxTextView7.getPaddingBottom());
        tuxTextView7.setPadding(tuxTextView7.getPaddingLeft(), tuxTextView7.getPaddingTop(), (int) TypedValue.applyDimension(i8, 4.0f, resources2.getDisplayMetrics()), tuxTextView7.getPaddingBottom());
        tuxTextView7.setPadding(tuxTextView7.getPaddingLeft(), tuxTextView7.getPaddingTop(), (int) TypedValue.applyDimension(i8, 4.0f, resources2.getDisplayMetrics()), tuxTextView7.getPaddingBottom());
        tuxTextView7.setPadding(tuxTextView7.getPaddingLeft(), (int) TypedValue.applyDimension(i8, 2.0f, resources2.getDisplayMetrics()), tuxTextView7.getPaddingRight(), tuxTextView7.getPaddingBottom());
        tuxTextView7.setPadding(tuxTextView7.getPaddingLeft(), tuxTextView7.getPaddingTop(), tuxTextView7.getPaddingRight(), (int) TypedValue.applyDimension(1, 2.0f, resources2.getDisplayMetrics()));
        C786410Ut5.LJLLLLLL(8, tuxTextView7);
        tuxTextView7.setMaxLines(1);
        tuxTextView7.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView7.setClickable(false);
        LinearLayout.LayoutParams layoutParams24 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams24)) {
            ((ViewGroup.MarginLayoutParams) layoutParams24).topMargin = (int) TypedValue.applyDimension(1, 4.0f, resources2.getDisplayMetrics());
        }
        new o();
        o.LIZ("app:tux_font", new a.c("SmallText2_Semibold"), tuxTextView7);
        android.view.a.LIZ(tuxTextView7);
        if (tuxTextView7.getParent() == null) {
            linearLayout.addView(tuxTextView7, layoutParams24);
        }
        TuxTag tuxTag = new TuxTag(contextThemeWrapper);
        tuxTag.setId(R.id.yhh);
        tuxTag.setPadding((int) TypedValue.applyDimension(1, 4.0f, resources2.getDisplayMetrics()), tuxTag.getPaddingTop(), tuxTag.getPaddingRight(), tuxTag.getPaddingBottom());
        tuxTag.setPadding((int) TypedValue.applyDimension(1, 4.0f, resources2.getDisplayMetrics()), tuxTag.getPaddingTop(), tuxTag.getPaddingRight(), tuxTag.getPaddingBottom());
        tuxTag.setPadding(tuxTag.getPaddingLeft(), tuxTag.getPaddingTop(), (int) TypedValue.applyDimension(1, 4.0f, resources2.getDisplayMetrics()), tuxTag.getPaddingBottom());
        tuxTag.setPadding(tuxTag.getPaddingLeft(), tuxTag.getPaddingTop(), (int) TypedValue.applyDimension(1, 4.0f, resources2.getDisplayMetrics()), tuxTag.getPaddingBottom());
        tuxTag.setPadding(tuxTag.getPaddingLeft(), (int) TypedValue.applyDimension(1, 1.0f, resources2.getDisplayMetrics()), tuxTag.getPaddingRight(), tuxTag.getPaddingBottom());
        tuxTag.setPadding(tuxTag.getPaddingLeft(), tuxTag.getPaddingTop(), tuxTag.getPaddingRight(), (int) TypedValue.applyDimension(1, 1.0f, resources2.getDisplayMetrics()));
        C786410Ut5.LJLLLLLL(8, tuxTag);
        LinearLayout.LayoutParams layoutParams25 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams25)) {
            ((ViewGroup.MarginLayoutParams) layoutParams25).topMargin = (int) TypedValue.applyDimension(1, 4.0f, resources2.getDisplayMetrics());
        }
        new b();
        b.LIZ("app:tux_tagIsHollow", new a.c("true"), tuxTag);
        b.LIZ("app:tux_tagSize", new a.c("tiny"), tuxTag);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams25)) {
            ((ViewGroup.MarginLayoutParams) layoutParams25).bottomMargin = (int) TypedValue.applyDimension(1, 4.0f, resources2.getDisplayMetrics());
        }
        b.LIZ("app:tux_tagTextColor", new a.b("2131099754", "attr"), tuxTag);
        b.LIZ("app:tux_tagIconColor", new a.b("2131099754", "attr"), tuxTag);
        android.view.a.LIZ(tuxTag);
        if (tuxTag.getParent() == null) {
            linearLayout.addView(tuxTag, layoutParams25);
        }
        TuxTextView tuxTextView8 = new TuxTextView(contextThemeWrapper);
        tuxTextView8.setId(R.id.asr);
        tuxTextView8.setBackgroundResource(R.drawable.b_d);
        TypedArray typedArrayObtainStyledAttributes7 = contextThemeWrapper.getTheme().obtainStyledAttributes(new int[]{R.attr.ee});
        tuxTextView8.setTextColor(typedArrayObtainStyledAttributes7.getColor(0, 0));
        typedArrayObtainStyledAttributes7.recycle();
        tuxTextView8.setPadding((int) TypedValue.applyDimension(1, 5.0f, resources2.getDisplayMetrics()), tuxTextView8.getPaddingTop(), tuxTextView8.getPaddingRight(), tuxTextView8.getPaddingBottom());
        tuxTextView8.setPadding((int) TypedValue.applyDimension(1, 5.0f, resources2.getDisplayMetrics()), tuxTextView8.getPaddingTop(), tuxTextView8.getPaddingRight(), tuxTextView8.getPaddingBottom());
        tuxTextView8.setPadding(tuxTextView8.getPaddingLeft(), tuxTextView8.getPaddingTop(), (int) TypedValue.applyDimension(1, 5.0f, resources2.getDisplayMetrics()), tuxTextView8.getPaddingBottom());
        tuxTextView8.setPadding(tuxTextView8.getPaddingLeft(), tuxTextView8.getPaddingTop(), (int) TypedValue.applyDimension(1, 5.0f, resources2.getDisplayMetrics()), tuxTextView8.getPaddingBottom());
        tuxTextView8.setPadding(tuxTextView8.getPaddingLeft(), (int) TypedValue.applyDimension(1, 1.0f, resources2.getDisplayMetrics()), tuxTextView8.getPaddingRight(), tuxTextView8.getPaddingBottom());
        tuxTextView8.setPadding(tuxTextView8.getPaddingLeft(), tuxTextView8.getPaddingTop(), tuxTextView8.getPaddingRight(), (int) TypedValue.applyDimension(1, 1.0f, resources2.getDisplayMetrics()));
        C786410Ut5.LJLLLLLL(8, tuxTextView8);
        tuxTextView8.setMaxLines(1);
        tuxTextView8.setEllipsize(TextUtils.TruncateAt.END);
        LinearLayout.LayoutParams layoutParams26 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams26)) {
            ((ViewGroup.MarginLayoutParams) layoutParams26).topMargin = (int) TypedValue.applyDimension(1, 8.0f, resources2.getDisplayMetrics());
        }
        new o();
        o.LIZ("app:tux_font", new a.c("SmallText2_Semibold"), tuxTextView8);
        android.view.a.LIZ(tuxTextView8);
        if (tuxTextView8.getParent() == null) {
            linearLayout.addView(tuxTextView8, layoutParams26);
        }
        android.view.a.LIZ(linearLayout);
        C786410Ut5.W5(linearLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(linearLayout);
        }
        return linearLayout;
    }
}
