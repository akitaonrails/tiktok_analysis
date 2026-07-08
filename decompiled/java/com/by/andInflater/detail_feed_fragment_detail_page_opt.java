package com.by.andInflater;

import X.C0T8T;
import X.C1607740rwK;
import X.C19ME;
import X.C19MW;
import X.C20742916Ex;
import X.C418730GbP;
import X.C786410Ut5;
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
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBarMaskView;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.k;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class detail_feed_fragment_detail_page_opt implements InterfaceC20742716Ev {
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
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        Resources resources = context.getResources();
        VideoSeekBarMaskView videoSeekBarMaskView = new VideoSeekBarMaskView(context);
        videoSeekBarMaskView.setId(R.id.ujj);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -1, viewGroup);
        C0T8T c0t8t = new C0T8T(context);
        c0t8t.setId(R.id.trr);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.e1});
        c0t8t.setBackgroundColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        ViewGroup.LayoutParams layoutParamsLJ = a.LJ(-1, -1, videoSeekBarMaskView);
        View viewLIZ = C20742916Ex.LIZ(context, R.layout.b6r, c0t8t, false, 0);
        if (viewLIZ.getParent() == null) {
            c0t8t.addView(viewLIZ);
        }
        View view = new View(context);
        view.setId(R.id.frx);
        view.setBackgroundResource(R.drawable.cf4);
        ViewGroup.LayoutParams layoutParamsLJ2 = a.LJ(-1, (int) TypedValue.applyDimension(1, 90.0f, resources.getDisplayMetrics()), c0t8t);
        a.LIZ(view);
        if (view.getParent() == null) {
            c0t8t.addView(view, layoutParamsLJ2);
        }
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(R.id.wc_);
        ViewGroup.LayoutParams layoutParamsLJ3 = a.LJ(-1, -1, c0t8t);
        viewStub.setInflatedId(-1);
        a.LIZ(viewStub);
        if (viewStub.getParent() == null) {
            c0t8t.addView(viewStub, layoutParamsLJ3);
        }
        ViewStub viewStub2 = new ViewStub(context);
        viewStub2.setId(R.id.nww);
        viewStub2.setLayoutResource(R.layout.b_n);
        ViewGroup.LayoutParams layoutParamsLJ4 = a.LJ(-1, -2, c0t8t);
        viewStub2.setInflatedId(-1);
        a.LIZ(viewStub2);
        if (viewStub2.getParent() == null) {
            c0t8t.addView(viewStub2, layoutParamsLJ4);
        }
        ViewStub viewStub3 = new ViewStub(context);
        viewStub3.setId(R.id.nx7);
        viewStub3.setLayoutResource(R.layout.bla);
        ViewGroup.LayoutParams layoutParamsLJ5 = a.LJ(-1, -1, c0t8t);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParamsLJ5)) {
            ((LinearLayout.LayoutParams) layoutParamsLJ5).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParamsLJ5)) {
            ((FrameLayout.LayoutParams) layoutParamsLJ5).gravity = 17;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParamsLJ5)) {
            ((DrawerLayout$LayoutParams) layoutParamsLJ5).gravity = 17;
        }
        viewStub3.setInflatedId(-1);
        a.LIZ(viewStub3);
        if (viewStub3.getParent() == null) {
            c0t8t.addView(viewStub3, layoutParamsLJ5);
        }
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(R.id.ija);
        ViewGroup.LayoutParams layoutParamsLJ6 = a.LJ(-1, -2, c0t8t);
        C418730GbP c418730GbP = new C418730GbP(context);
        c418730GbP.setId(R.id.bn2);
        c418730GbP.setPadding((int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics()));
        c418730GbP.setImageResource(R.drawable.cff);
        c418730GbP.setContentDescription(context.getResources().getString(2131823350));
        C19ME c19me = new C19ME((int) TypedValue.applyDimension(1, 52.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 52.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me)) {
            c19me.setMarginStart((int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()));
        }
        if (C19ME.class.isInstance(c19me)) {
            i = 0;
            c19me.bottomToBottom = 0;
        } else {
            i = 0;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.startToStart = i;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.topToTop = i;
        }
        a.LIZ(c418730GbP);
        if (c418730GbP.getParent() == null) {
            constraintLayout.addView(c418730GbP, c19me);
        }
        ViewStub viewStub4 = new ViewStub(context);
        viewStub4.setId(R.id.x4f);
        viewStub4.setInflatedId(R.id.x4a);
        viewStub4.setLayoutResource(R.layout.blp);
        C19ME c19me2 = new C19ME((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 52.0f, resources.getDisplayMetrics()));
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.bottomToBottom = 0;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.startToEnd = R.id.bn2;
        }
        if (C19ME.class.isInstance(c19me2)) {
            i2 = 0;
            c19me2.topToTop = 0;
        } else {
            i2 = 0;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.endToEnd = i2;
        }
        a.LIZ(viewStub4);
        if (viewStub4.getParent() == null) {
            constraintLayout.addView(viewStub4, c19me2);
        }
        ViewStub viewStub5 = new ViewStub(context);
        viewStub5.setId(R.id.vs_episode_title);
        viewStub5.setLayoutResource(R.layout.blu);
        C19ME c19me3 = new C19ME(-2, -2);
        if (C19ME.class.isInstance(c19me3)) {
            i3 = R.id.bn2;
            c19me3.bottomToBottom = R.id.bn2;
        } else {
            i3 = R.id.bn2;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.startToEnd = i3;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.topToTop = i3;
        }
        viewStub5.setInflatedId(-1);
        a.LIZ(viewStub5);
        if (viewStub5.getParent() == null) {
            constraintLayout.addView(viewStub5, c19me3);
        }
        ViewStub viewStub6 = new ViewStub(context);
        viewStub6.setId(R.id.o52);
        viewStub6.setInflatedId(R.id.o51);
        viewStub6.setLayoutResource(R.layout.bld);
        C19ME c19me4 = new C19ME(-2, -2);
        if (C19ME.class.isInstance(c19me4)) {
            i4 = 0;
            c19me4.bottomToBottom = 0;
        } else {
            i4 = 0;
        }
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.startToStart = i4;
        }
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.topToTop = i4;
        }
        a.LIZ(viewStub6);
        if (viewStub6.getParent() == null) {
            constraintLayout.addView(viewStub6, c19me4);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.y08);
        tuxTextView.setGravity(17);
        C786410Ut5.LJLLLLLL(8, tuxTextView);
        tuxTextView.setText(2131828242);
        TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.ee});
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes2.getColor(0, 0));
        typedArrayObtainStyledAttributes2.recycle();
        C19ME c19me5 = new C19ME((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        if (C19ME.class.isInstance(c19me5)) {
            i5 = 0;
            c19me5.topToTop = 0;
        } else {
            i5 = 0;
        }
        if (C19ME.class.isInstance(c19me5)) {
            c19me5.bottomToBottom = i5;
        }
        if (C19ME.class.isInstance(c19me5)) {
            c19me5.startToStart = i5;
        }
        if (C19ME.class.isInstance(c19me5)) {
            c19me5.endToEnd = i5;
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P1_Semibold"), tuxTextView);
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            constraintLayout.addView(tuxTextView, c19me5);
        }
        ViewStub viewStub7 = new ViewStub(context);
        viewStub7.setId(R.id.ifc);
        viewStub7.setLayoutResource(R.layout.bl2);
        C19ME c19me6 = new C19ME(-1, -2);
        if (C19ME.class.isInstance(c19me6)) {
            i6 = 0;
            c19me6.topToTop = 0;
        } else {
            i6 = 0;
        }
        if (C19ME.class.isInstance(c19me6)) {
            c19me6.bottomToBottom = i6;
        }
        if (C19ME.class.isInstance(c19me6)) {
            c19me6.startToStart = i6;
        }
        if (C19ME.class.isInstance(c19me6)) {
            c19me6.endToEnd = i6;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me6)) {
            c19me6.setMarginStart((int) TypedValue.applyDimension(1, 54.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me6)) {
            c19me6.setMarginEnd((int) TypedValue.applyDimension(1, 54.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me6)) {
            ((ViewGroup.MarginLayoutParams) c19me6).topMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        viewStub7.setInflatedId(-1);
        android.view.a.LIZ(viewStub7);
        if (viewStub7.getParent() == null) {
            constraintLayout.addView(viewStub7, c19me6);
        }
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setId(R.id.ltz);
        tuxIconView.setScaleType(ImageView.ScaleType.CENTER);
        C786410Ut5.LLLLLLZZ(tuxIconView, 4);
        tuxIconView.setContentDescription(context.getResources().getString(R.string.spp));
        C19ME c19me7 = new C19ME((int) TypedValue.applyDimension(1, 50.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 50.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me7)) {
            c19me7.setMarginEnd((int) TypedValue.applyDimension(1, 3.5f, resources.getDisplayMetrics()));
        }
        if (C19ME.class.isInstance(c19me7)) {
            i7 = 0;
            c19me7.bottomToBottom = 0;
        } else {
            i7 = 0;
        }
        if (C19ME.class.isInstance(c19me7)) {
            c19me7.endToEnd = i7;
        }
        if (C19ME.class.isInstance(c19me7)) {
            c19me7.topToTop = i7;
        }
        new k();
        k.LIZ("app:tux_icon", new a.b("2130774231", "raw"), tuxIconView);
        k.LIZ("app:tux_iconHeight", new a.d("24", "dp"), tuxIconView);
        k.LIZ("app:tux_iconWidth", new a.d("24", "dp"), tuxIconView);
        k.LIZ("app:tux_tintColor", new a.b("2131099768", "attr"), tuxIconView);
        android.view.a.LIZ(tuxIconView);
        if (tuxIconView.getParent() == null) {
            constraintLayout.addView(tuxIconView, c19me7);
        }
        ViewStub viewStub8 = new ViewStub(context);
        viewStub8.setId(R.id.vsb_series_discover_entry);
        viewStub8.setInflatedId(R.id.lu_);
        viewStub8.setLayoutResource(R.layout.blb);
        C19ME c19me8 = new C19ME(-2, (int) TypedValue.applyDimension(1, 50.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me8)) {
            c19me8.setMarginEnd((int) TypedValue.applyDimension(1, 3.5f, resources.getDisplayMetrics()));
        }
        if (C19ME.class.isInstance(c19me8)) {
            i8 = 0;
            c19me8.bottomToBottom = 0;
        } else {
            i8 = 0;
        }
        if (C19ME.class.isInstance(c19me8)) {
            c19me8.endToEnd = i8;
        }
        if (C19ME.class.isInstance(c19me8)) {
            c19me8.topToTop = i8;
        }
        android.view.a.LIZ(viewStub8);
        if (viewStub8.getParent() == null) {
            constraintLayout.addView(viewStub8, c19me8);
        }
        TuxIconView tuxIconView2 = new TuxIconView(context);
        tuxIconView2.setId(R.id.lx0);
        tuxIconView2.setScaleType(ImageView.ScaleType.CENTER);
        C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
        tuxIconView2.setContentDescription("tako");
        tuxIconView2.setPadding(tuxIconView2.getPaddingLeft(), (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), tuxIconView2.getPaddingRight(), tuxIconView2.getPaddingBottom());
        tuxIconView2.setPadding(tuxIconView2.getPaddingLeft(), tuxIconView2.getPaddingTop(), tuxIconView2.getPaddingRight(), (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        C19ME c19me9 = new C19ME((int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me9)) {
            c19me9.setMarginEnd((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        if (C19ME.class.isInstance(c19me9)) {
            i9 = 0;
            c19me9.bottomToBottom = 0;
        } else {
            i9 = 0;
        }
        if (C19ME.class.isInstance(c19me9)) {
            c19me9.endToEnd = i9;
        }
        if (C19ME.class.isInstance(c19me9)) {
            c19me9.topToTop = i9;
        }
        android.view.a.LIZ(tuxIconView2);
        if (tuxIconView2.getParent() == null) {
            constraintLayout.addView(tuxIconView2, c19me9);
        }
        ViewStub viewStub9 = new ViewStub(context);
        viewStub9.setId(R.id.vsb_search_bar);
        C19ME c19me10 = new C19ME((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me10)) {
            c19me10.setMarginEnd((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        if (C19ME.class.isInstance(c19me10)) {
            i10 = 0;
            c19me10.bottomToBottom = 0;
        } else {
            i10 = 0;
        }
        if (C19ME.class.isInstance(c19me10)) {
            c19me10.endToEnd = i10;
        }
        if (C19ME.class.isInstance(c19me10)) {
            c19me10.startToEnd = R.id.bn2;
        }
        if (C19ME.class.isInstance(c19me10)) {
            c19me10.topToTop = 0;
        }
        viewStub9.setInflatedId(-1);
        android.view.a.LIZ(viewStub9);
        if (viewStub9.getParent() == null) {
            constraintLayout.addView(viewStub9, c19me10);
        }
        ViewStub viewStub10 = new ViewStub(context);
        viewStub10.setId(R.id.vsb_expose_comment);
        C19ME c19me11 = new C19ME((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me11)) {
            c19me11.setMarginStart((int) TypedValue.applyDimension(1, 56.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me11)) {
            c19me11.setMarginEnd((int) TypedValue.applyDimension(1, 55.0f, resources.getDisplayMetrics()));
        }
        if (C19ME.class.isInstance(c19me11)) {
            i11 = 0;
            c19me11.bottomToBottom = 0;
        } else {
            i11 = 0;
        }
        if (C19ME.class.isInstance(c19me11)) {
            c19me11.endToEnd = i11;
        }
        if (C19ME.class.isInstance(c19me11)) {
            c19me11.startToStart = i11;
        }
        if (C19ME.class.isInstance(c19me11)) {
            c19me11.topToTop = i11;
        }
        viewStub10.setInflatedId(-1);
        android.view.a.LIZ(viewStub10);
        if (viewStub10.getParent() == null) {
            constraintLayout.addView(viewStub10, c19me11);
        }
        ViewStub viewStub11 = new ViewStub(context);
        viewStub11.setId(R.id.ijb);
        C19ME c19me12 = new C19ME(-2, -2);
        if (C19ME.class.isInstance(c19me12)) {
            i12 = 0;
            c19me12.bottomToBottom = 0;
        } else {
            i12 = 0;
        }
        if (C19ME.class.isInstance(c19me12)) {
            c19me12.endToEnd = i12;
        }
        if (C19ME.class.isInstance(c19me12)) {
            c19me12.topToTop = i12;
        }
        viewStub11.setInflatedId(-1);
        android.view.a.LIZ(viewStub11);
        if (viewStub11.getParent() == null) {
            constraintLayout.addView(viewStub11, c19me12);
        }
        ViewStub viewStub12 = new ViewStub(context);
        viewStub12.setId(R.id.ij_);
        viewStub12.setLayoutResource(R.layout.bl9);
        C19ME c19me13 = new C19ME(-2, -2);
        if (C19ME.class.isInstance(c19me13)) {
            i13 = 0;
            c19me13.bottomToBottom = 0;
        } else {
            i13 = 0;
        }
        if (C19ME.class.isInstance(c19me13)) {
            c19me13.endToEnd = i13;
        }
        if (C19ME.class.isInstance(c19me13)) {
            c19me13.startToStart = i13;
        }
        if (C19ME.class.isInstance(c19me13)) {
            c19me13.topToTop = i13;
        }
        viewStub12.setInflatedId(-1);
        android.view.a.LIZ(viewStub12);
        if (viewStub12.getParent() == null) {
            constraintLayout.addView(viewStub12, c19me13);
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.ij5);
        linearLayout.setOrientation(1);
        linearLayout.setPadding((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), linearLayout.getPaddingTop(), linearLayout.getPaddingRight(), linearLayout.getPaddingBottom());
        linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), linearLayout.getPaddingBottom());
        C19ME c19me14 = new C19ME((int) TypedValue.applyDimension(1, 198.0f, resources.getDisplayMetrics()), -2);
        if (LinearLayout.LayoutParams.class.isInstance(c19me14)) {
            i14 = 17;
            ((LinearLayout.LayoutParams) c19me14).gravity = 17;
        } else {
            i14 = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(c19me14)) {
            ((FrameLayout.LayoutParams) c19me14).gravity = i14;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(c19me14)) {
            ((DrawerLayout$LayoutParams) c19me14).gravity = i14;
        }
        if (C19ME.class.isInstance(c19me14)) {
            i15 = 0;
            c19me14.bottomToBottom = 0;
        } else {
            i15 = 0;
        }
        if (C19ME.class.isInstance(c19me14)) {
            c19me14.endToEnd = i15;
        }
        if (C19ME.class.isInstance(c19me14)) {
            c19me14.startToStart = i15;
        }
        if (C19ME.class.isInstance(c19me14)) {
            c19me14.topToTop = i15;
        }
        ViewStub viewStub13 = new ViewStub(context);
        viewStub13.setId(R.id.g1d);
        viewStub13.setLayoutResource(R.layout.bkx);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams)) {
            i16 = 1;
            layoutParams.gravity = 1;
        } else {
            i16 = 1;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = i16;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams)) {
            ((DrawerLayout$LayoutParams) layoutParams).gravity = i16;
        }
        if (C19ME.class.isInstance(layoutParams)) {
            i17 = 0;
            ((C19ME) layoutParams).bottomToBottom = 0;
        } else {
            i17 = 0;
        }
        if (C19ME.class.isInstance(layoutParams)) {
            ((C19ME) layoutParams).endToEnd = i17;
        }
        if (C19ME.class.isInstance(layoutParams)) {
            ((C19ME) layoutParams).startToStart = i17;
        }
        if (C19ME.class.isInstance(layoutParams)) {
            ((C19ME) layoutParams).topToTop = i17;
        }
        viewStub13.setInflatedId(-1);
        android.view.a.LIZ(viewStub13);
        if (viewStub13.getParent() == null) {
            linearLayout.addView(viewStub13, layoutParams);
        }
        ViewStub viewStub14 = new ViewStub(context);
        viewStub14.setId(R.id.g1e);
        viewStub14.setLayoutResource(R.layout.bky);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
            i18 = 1;
            layoutParams2.gravity = 1;
        } else {
            i18 = 1;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams2)) {
            ((FrameLayout.LayoutParams) layoutParams2).gravity = i18;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams2)) {
            ((DrawerLayout$LayoutParams) layoutParams2).gravity = i18;
        }
        if (C19ME.class.isInstance(layoutParams2)) {
            i19 = 0;
            ((C19ME) layoutParams2).bottomToBottom = 0;
        } else {
            i19 = 0;
        }
        if (C19ME.class.isInstance(layoutParams2)) {
            ((C19ME) layoutParams2).endToEnd = i19;
        }
        if (C19ME.class.isInstance(layoutParams2)) {
            ((C19ME) layoutParams2).startToStart = i19;
        }
        if (C19ME.class.isInstance(layoutParams2)) {
            ((C19ME) layoutParams2).topToTop = i19;
        }
        viewStub14.setInflatedId(-1);
        android.view.a.LIZ(viewStub14);
        if (viewStub14.getParent() == null) {
            linearLayout.addView(viewStub14, layoutParams2);
        }
        android.view.a.LIZ(linearLayout);
        if (linearLayout.getParent() == null) {
            constraintLayout.addView(linearLayout, c19me14);
        }
        TuxIconView tuxIconView3 = new TuxIconView(context);
        tuxIconView3.setId(R.id.e2g);
        C786410Ut5.LLLLLLZZ(tuxIconView3, 4);
        C19ME c19me15 = new C19ME((int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me15)) {
            c19me15.setMarginEnd((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        if (C19ME.class.isInstance(c19me15)) {
            i20 = 0;
            c19me15.bottomToBottom = 0;
        } else {
            i20 = 0;
        }
        if (C19ME.class.isInstance(c19me15)) {
            c19me15.endToEnd = i20;
        }
        if (C19ME.class.isInstance(c19me15)) {
            c19me15.topToTop = i20;
        }
        new k();
        k.LIZ("app:tux_icon", new a.b("2130775055", "raw"), tuxIconView3);
        k.LIZ("app:tux_tintColor", new a.b("2131099768", "attr"), tuxIconView3);
        android.view.a.LIZ(tuxIconView3);
        if (tuxIconView3.getParent() == null) {
            constraintLayout.addView(tuxIconView3, c19me15);
        }
        C19MW c19mw = new C19MW(context);
        c19mw.setId(R.id.h4g);
        ViewGroup.LayoutParams c19me16 = new C19ME(-2, -2);
        new ule.a();
        ule.a.LIZ(new a.c("start"), c19mw);
        c19mw.setReferencedIds(new int[]{R.id.t8q});
        android.view.a.LIZ(c19mw);
        if (c19mw.getParent() == null) {
            constraintLayout.addView(c19mw, c19me16);
        }
        ViewStub viewStub15 = new ViewStub(context);
        viewStub15.setId(R.id.t8q);
        viewStub15.setInflatedId(R.id.t8p);
        viewStub15.setLayoutResource(R.layout.blj);
        C19ME c19me17 = new C19ME(-2, -2);
        if (C19ME.class.isInstance(c19me17)) {
            c19me17.bottomToBottom = 0;
        }
        if (C19ME.class.isInstance(c19me17)) {
            c19me17.endToEnd = 0;
        }
        if (C19ME.class.isInstance(c19me17)) {
            c19me17.topToTop = 0;
        }
        android.view.a.LIZ(viewStub15);
        if (viewStub15.getParent() == null) {
            constraintLayout.addView(viewStub15, c19me17);
        }
        ViewStub viewStub16 = new ViewStub(context);
        viewStub16.setId(R.id.acl);
        viewStub16.setInflatedId(R.id.ack);
        viewStub16.setLayoutResource(R.layout.bkh);
        C19ME c19me18 = new C19ME(-2, -2);
        if (C19ME.class.isInstance(c19me18)) {
            c19me18.bottomToBottom = 0;
        }
        if (C19ME.class.isInstance(c19me18)) {
            c19me18.endToStart = R.id.uzr;
        }
        if (C19ME.class.isInstance(c19me18)) {
            c19me18.topToTop = 0;
        }
        android.view.a.LIZ(viewStub16);
        if (viewStub16.getParent() == null) {
            constraintLayout.addView(viewStub16, c19me18);
        }
        ViewStub viewStub17 = new ViewStub(context);
        viewStub17.setId(R.id.uzr);
        viewStub17.setInflatedId(R.id.uzq);
        viewStub17.setLayoutResource(R.layout.blk);
        C19ME c19me19 = new C19ME(-2, -2);
        if (C19ME.class.isInstance(c19me19)) {
            c19me19.bottomToBottom = 0;
        }
        if (C19ME.class.isInstance(c19me19)) {
            c19me19.endToStart = R.id.h4g;
        }
        if (C19ME.class.isInstance(c19me19)) {
            c19me19.topToTop = 0;
        }
        android.view.a.LIZ(viewStub17);
        if (viewStub17.getParent() == null) {
            constraintLayout.addView(viewStub17, c19me19);
        }
        ViewStub viewStub18 = new ViewStub(context);
        viewStub18.setId(R.id.fdo);
        viewStub18.setInflatedId(R.id.fdn);
        C19ME c19me20 = new C19ME((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (C19ME.class.isInstance(c19me20)) {
            c19me20.horizontalWeight = 1.0f;
        }
        if (C19ME.class.isInstance(c19me20)) {
            c19me20.bottomToBottom = 0;
        }
        if (C19ME.class.isInstance(c19me20)) {
            c19me20.endToEnd = 0;
        }
        if (C19ME.class.isInstance(c19me20)) {
            c19me20.startToEnd = R.id.bn2;
        }
        if (C19ME.class.isInstance(c19me20)) {
            c19me20.horizontalBias = 0.0f;
        }
        if (C19ME.class.isInstance(c19me20)) {
            c19me20.topToTop = 0;
        }
        android.view.a.LIZ(viewStub18);
        if (viewStub18.getParent() == null) {
            constraintLayout.addView(viewStub18, c19me20);
        }
        android.view.a.LIZ(constraintLayout);
        if (constraintLayout.getParent() == null) {
            c0t8t.addView(constraintLayout, layoutParamsLJ6);
        }
        ViewStub viewStub19 = new ViewStub(context);
        viewStub19.setId(R.id.ij8);
        viewStub19.setLayoutResource(R.layout.bl_);
        ViewGroup.LayoutParams layoutParamsLJ7 = android.view.a.LJ(-2, -2, c0t8t);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParamsLJ7)) {
            i21 = 17;
            ((LinearLayout.LayoutParams) layoutParamsLJ7).gravity = 17;
        } else {
            i21 = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParamsLJ7)) {
            ((FrameLayout.LayoutParams) layoutParamsLJ7).gravity = i21;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParamsLJ7)) {
            ((DrawerLayout$LayoutParams) layoutParamsLJ7).gravity = i21;
        }
        viewStub19.setInflatedId(-1);
        android.view.a.LIZ(viewStub19);
        if (viewStub19.getParent() == null) {
            c0t8t.addView(viewStub19, layoutParamsLJ7);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.cb7);
        ViewGroup.LayoutParams layoutParamsLJ8 = android.view.a.LJ(-1, -2, c0t8t);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParamsLJ8)) {
            ((LinearLayout.LayoutParams) layoutParamsLJ8).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParamsLJ8)) {
            ((FrameLayout.LayoutParams) layoutParamsLJ8).gravity = 80;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParamsLJ8)) {
            ((DrawerLayout$LayoutParams) layoutParamsLJ8).gravity = 80;
        }
        View frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.ka1);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams3)) {
            ((LinearLayout.LayoutParams) layoutParams3).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.gravity = 80;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams3)) {
            ((DrawerLayout$LayoutParams) layoutParams3).gravity = 80;
        }
        android.view.a.LIZ(frameLayout2);
        if (frameLayout2.getParent() == null) {
            frameLayout.addView(frameLayout2, layoutParams3);
        }
        android.view.a.LIZ(frameLayout);
        if (frameLayout.getParent() == null) {
            c0t8t.addView(frameLayout, layoutParamsLJ8);
        }
        View frameLayout3 = new FrameLayout(context);
        frameLayout3.setId(R.id.khx);
        C786410Ut5.LJLLLLLL(8, frameLayout3);
        ViewGroup.LayoutParams layoutParamsLJ9 = android.view.a.LJ(-1, (int) TypedValue.applyDimension(1, 50.0f, resources.getDisplayMetrics()), c0t8t);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParamsLJ9)) {
            ((LinearLayout.LayoutParams) layoutParamsLJ9).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParamsLJ9)) {
            ((FrameLayout.LayoutParams) layoutParamsLJ9).gravity = 80;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParamsLJ9)) {
            ((DrawerLayout$LayoutParams) layoutParamsLJ9).gravity = 80;
        }
        android.view.a.LIZ(frameLayout3);
        if (frameLayout3.getParent() == null) {
            c0t8t.addView(frameLayout3, layoutParamsLJ9);
        }
        View frameLayout4 = new FrameLayout(context);
        frameLayout4.setId(R.id.ujn);
        ViewGroup.LayoutParams layoutParamsLJ10 = android.view.a.LJ(-1, -2, c0t8t);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParamsLJ10)) {
            ((LinearLayout.LayoutParams) layoutParamsLJ10).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParamsLJ10)) {
            ((FrameLayout.LayoutParams) layoutParamsLJ10).gravity = 80;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParamsLJ10)) {
            ((DrawerLayout$LayoutParams) layoutParamsLJ10).gravity = 80;
        }
        android.view.a.LIZ(frameLayout4);
        if (frameLayout4.getParent() == null) {
            c0t8t.addView(frameLayout4, layoutParamsLJ10);
        }
        ViewStub viewStub20 = new ViewStub(context);
        viewStub20.setId(R.id.b48);
        viewStub20.setLayoutResource(R.layout.b54);
        ViewGroup.LayoutParams layoutParamsLJ11 = android.view.a.LJ(-1, -1, c0t8t);
        viewStub20.setInflatedId(-1);
        android.view.a.LIZ(viewStub20);
        if (viewStub20.getParent() == null) {
            c0t8t.addView(viewStub20, layoutParamsLJ11);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setId(R.id.nk_);
        linearLayout2.setOrientation(0);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ2 = android.view.a.LJ(-2, -2, c0t8t);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            i22 = 1;
            marginLayoutParamsLJ2.topMargin = (int) TypedValue.applyDimension(1, 98.0f, resources.getDisplayMetrics());
        } else {
            i22 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            marginLayoutParamsLJ2.setMarginEnd((int) TypedValue.applyDimension(i22, 12.0f, resources.getDisplayMetrics()));
        }
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ2).gravity = 8388613;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ2).gravity = 8388613;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ2).gravity = 8388613;
        }
        View viewLIZ2 = C20742916Ex.LIZ(context, R.layout.b57, linearLayout2, false, 0);
        viewLIZ2.setId(R.id.bei);
        if (viewLIZ2.getParent() == null) {
            linearLayout2.addView(viewLIZ2);
        }
        android.view.a.LIZ(linearLayout2);
        if (linearLayout2.getParent() == null) {
            c0t8t.addView(linearLayout2, marginLayoutParamsLJ2);
        }
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.tt9);
        tuxTextView2.setText(2131847092);
        C786410Ut5.LJLLLLLL(8, tuxTextView2);
        tuxTextView2.setGravity(17);
        int[] iArr = new int[i22];
        iArr[0] = R.attr.e1;
        TypedArray typedArrayObtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(iArr);
        tuxTextView2.setBackgroundColor(typedArrayObtainStyledAttributes3.getColor(0, 0));
        typedArrayObtainStyledAttributes3.recycle();
        TypedArray typedArrayObtainStyledAttributes4 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.zk});
        tuxTextView2.setTextColor(typedArrayObtainStyledAttributes4.getColor(0, 0));
        typedArrayObtainStyledAttributes4.recycle();
        ViewGroup.LayoutParams layoutParamsLJ12 = android.view.a.LJ(-1, (int) TypedValue.applyDimension(1, 50.0f, resources.getDisplayMetrics()), c0t8t);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParamsLJ12)) {
            ((LinearLayout.LayoutParams) layoutParamsLJ12).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParamsLJ12)) {
            ((FrameLayout.LayoutParams) layoutParamsLJ12).gravity = 80;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParamsLJ12)) {
            ((DrawerLayout$LayoutParams) layoutParamsLJ12).gravity = 80;
        }
        new o();
        o.LIZ("app:tux_font", new a.c("H4_Regular"), tuxTextView2);
        android.view.a.LIZ(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            c0t8t.addView(tuxTextView2, layoutParamsLJ12);
        }
        View viewLIZ3 = C20742916Ex.LIZ(context, R.layout.b98, c0t8t, false, 0);
        viewLIZ3.setId(R.id.uf3);
        if (viewLIZ3.getParent() == null) {
            c0t8t.addView(viewLIZ3);
        }
        View viewLIZ4 = C20742916Ex.LIZ(context, R.layout.b_j, c0t8t, false, 0);
        viewLIZ4.setId(R.id.frb);
        if (viewLIZ4.getParent() == null) {
            c0t8t.addView(viewLIZ4);
        }
        View c1607740rwK = new C1607740rwK(context);
        c1607740rwK.setId(R.id.k7j);
        C786410Ut5.LJLLLLLL(8, c1607740rwK);
        ViewGroup.LayoutParams layoutParamsLJ13 = android.view.a.LJ(-1, -1, c0t8t);
        android.view.a.LIZ(c1607740rwK);
        if (c1607740rwK.getParent() == null) {
            c0t8t.addView(c1607740rwK, layoutParamsLJ13);
        }
        android.view.a.LIZ(c0t8t);
        if (c0t8t.getParent() == null) {
            videoSeekBarMaskView.addView(c0t8t, layoutParamsLJ);
        }
        ViewStub viewStub21 = new ViewStub(context);
        viewStub21.setId(R.id.vs_edge_speedup_guide);
        viewStub21.setLayoutResource(R.layout.b67);
        C786410Ut5.LLIIIJ(viewStub21, 8);
        ViewGroup.LayoutParams layoutParamsLJ14 = android.view.a.LJ(-1, -1, videoSeekBarMaskView);
        viewStub21.setInflatedId(-1);
        android.view.a.LIZ(viewStub21);
        if (viewStub21.getParent() == null) {
            videoSeekBarMaskView.addView(viewStub21, layoutParamsLJ14);
        }
        android.view.a.LIZ(videoSeekBarMaskView);
        C786410Ut5.W5(videoSeekBarMaskView, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(videoSeekBarMaskView);
        }
        return videoSeekBarMaskView;
    }
}
