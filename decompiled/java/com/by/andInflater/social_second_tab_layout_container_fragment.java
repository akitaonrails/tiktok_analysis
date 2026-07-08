package com.by.andInflater;

import X.C1585010rLf;
import X.C19ME;
import X.C20742916Ex;
import X.C21594419fC;
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
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.k;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class social_second_tab_layout_container_fragment implements InterfaceC20742716Ev {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        int i2;
        int i3;
        Resources resources = context.getResources();
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setClipChildren(false);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.e1});
        constraintLayout.setBackgroundColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -1, viewGroup);
        View view = new View(context);
        view.setId(R.id.v_status_bar);
        C19ME c19me = new C19ME(-1, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        if (C19ME.class.isInstance(c19me)) {
            c19me.topToTop = 0;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.endToEnd = 0;
        }
        a.LIZ(view);
        if (view.getParent() == null) {
            constraintLayout.addView(view, c19me);
        }
        View c21594419fC = new C21594419fC(context);
        c21594419fC.setId(R.id.view_pager);
        C19ME c19me2 = new C19ME(-1, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.bottomToBottom = 0;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.endToEnd = 0;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.topToTop = 0;
        }
        a.LIZ(c21594419fC);
        if (c21594419fC.getParent() == null) {
            constraintLayout.addView(c21594419fC, c19me2);
        }
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(R.id.uhj);
        viewStub.setLayoutResource(R.layout.b_n);
        C19ME c19me3 = new C19ME(-1, -2);
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.topToTop = 0;
        }
        viewStub.setInflatedId(-1);
        a.LIZ(viewStub);
        if (viewStub.getParent() == null) {
            constraintLayout.addView(viewStub, c19me3);
        }
        ConstraintLayout constraintLayout2 = new ConstraintLayout(context);
        constraintLayout2.setId(R.id.ijc);
        constraintLayout2.setClipChildren(false);
        C19ME c19me4 = new C19ME(-1, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me4)) {
            c19me4.setMarginStart((int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me4)) {
            c19me4.setMarginEnd((int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        }
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.endToEnd = 0;
        }
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.topToBottom = R.id.v_status_bar;
        }
        View viewLIZ = C20742916Ex.LIZ(context, R.layout.f9z, constraintLayout2, false, 0);
        if (viewLIZ.getParent() == null) {
            constraintLayout2.addView(viewLIZ);
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.nh9);
        linearLayout.setGravity(8388611);
        linearLayout.setOrientation(0);
        C786410Ut5.LJLLLLLL(8, linearLayout);
        C19ME c19me5 = new C19ME((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me5)) {
            c19me5.setMarginStart((int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me5)) {
            c19me5.setMarginEnd((int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()));
        }
        if (LinearLayout.LayoutParams.class.isInstance(c19me5)) {
            ((LinearLayout.LayoutParams) c19me5).weight = 1;
        }
        if (C19ME.class.isInstance(c19me5)) {
            c19me5.bottomToBottom = 0;
        }
        if (C19ME.class.isInstance(c19me5)) {
            c19me5.endToEnd = 0;
        }
        if (C19ME.class.isInstance(c19me5)) {
            c19me5.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me5)) {
            c19me5.topToTop = 0;
        }
        TuxIconView tuxIconView = new TuxIconView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 16;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams)) {
            ((DrawerLayout$LayoutParams) layoutParams).gravity = 16;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            layoutParams.setMarginStart((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        new k();
        k.LIZ("app:tux_icon", new a.b("2130774228", "raw"), tuxIconView);
        k.LIZ("app:tux_tintColor", new a.b("2131099768", "attr"), tuxIconView);
        android.view.a.LIZ(tuxIconView);
        if (tuxIconView.getParent() == null) {
            linearLayout.addView(tuxIconView, layoutParams);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.tv_search_find);
        tuxTextView.setText(2131834969);
        TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.ef});
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes2.getColor(0, 0));
        typedArrayObtainStyledAttributes2.recycle();
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
            i = 16;
            layoutParams2.gravity = 16;
        } else {
            i = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams2)) {
            ((FrameLayout.LayoutParams) layoutParams2).gravity = i;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams2)) {
            ((DrawerLayout$LayoutParams) layoutParams2).gravity = i;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.setMarginStart((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        new o();
        o.LIZ("app:tux_font", new a.c("H4_Regular"), tuxTextView);
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            linearLayout.addView(tuxTextView, layoutParams2);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        ViewGroup.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        TuxIconView tuxIconView2 = new TuxIconView(context);
        tuxIconView2.setId(R.id.cun);
        C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams4)) {
            ((LinearLayout.LayoutParams) layoutParams4).gravity = 8388613;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.gravity = 8388613;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams4)) {
            ((DrawerLayout$LayoutParams) layoutParams4).gravity = 8388613;
        }
        android.view.a.LIZ(tuxIconView2);
        if (tuxIconView2.getParent() == null) {
            frameLayout.addView(tuxIconView2, layoutParams4);
        }
        android.view.a.LIZ(frameLayout);
        if (frameLayout.getParent() == null) {
            linearLayout.addView(frameLayout, layoutParams3);
        }
        android.view.a.LIZ(linearLayout);
        if (linearLayout.getParent() == null) {
            constraintLayout2.addView(linearLayout, c19me5);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setId(R.id.dx3);
        linearLayout2.setClipChildren(false);
        C19ME c19me6 = new C19ME(-2, -2);
        if (C19ME.class.isInstance(c19me6)) {
            c19me6.bottomToBottom = 0;
        }
        if (C19ME.class.isInstance(c19me6)) {
            c19me6.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me6)) {
            c19me6.topToTop = 0;
        }
        C1585010rLf c1585010rLf = new C1585010rLf(context, null);
        c1585010rLf.setId(R.id.lma);
        c1585010rLf.setClipChildren(false);
        ViewGroup.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        if (C19ME.class.isInstance(layoutParams5)) {
            ((C19ME) layoutParams5).bottomToBottom = 0;
        }
        if (C19ME.class.isInstance(layoutParams5)) {
            ((C19ME) layoutParams5).startToStart = 0;
        }
        if (C19ME.class.isInstance(layoutParams5)) {
            ((C19ME) layoutParams5).topToTop = 0;
        }
        android.view.a.LIZ(c1585010rLf);
        if (c1585010rLf.getParent() == null) {
            linearLayout2.addView(c1585010rLf, layoutParams5);
        }
        C1585010rLf c1585010rLf2 = new C1585010rLf(context, null);
        c1585010rLf2.setId(R.id.lmd);
        c1585010rLf2.setClipChildren(false);
        C786410Ut5.LJLLLLLL(8, c1585010rLf2);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.setMarginStart((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        android.view.a.LIZ(c1585010rLf2);
        if (c1585010rLf2.getParent() == null) {
            linearLayout2.addView(c1585010rLf2, layoutParams6);
        }
        android.view.a.LIZ(linearLayout2);
        if (linearLayout2.getParent() == null) {
            constraintLayout2.addView(linearLayout2, c19me6);
        }
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setId(R.id.dyh);
        C19ME c19me7 = new C19ME(-2, -2);
        if (C19ME.class.isInstance(c19me7)) {
            i2 = 0;
            c19me7.bottomToBottom = 0;
        } else {
            i2 = 0;
        }
        if (C19ME.class.isInstance(c19me7)) {
            c19me7.endToEnd = i2;
        }
        if (C19ME.class.isInstance(c19me7)) {
            c19me7.topToTop = i2;
        }
        View c1585010rLf3 = new C1585010rLf(context, null);
        c1585010rLf3.setId(R.id.ltp);
        C786410Ut5.LJLLLLLL(8, c1585010rLf3);
        ViewGroup.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-2, -2);
        if (C19ME.class.isInstance(layoutParams7)) {
            i3 = 0;
            ((C19ME) layoutParams7).bottomToBottom = 0;
        } else {
            i3 = 0;
        }
        if (C19ME.class.isInstance(layoutParams7)) {
            ((C19ME) layoutParams7).endToEnd = i3;
        }
        if (C19ME.class.isInstance(layoutParams7)) {
            ((C19ME) layoutParams7).topToTop = i3;
        }
        android.view.a.LIZ(c1585010rLf3);
        if (c1585010rLf3.getParent() == null) {
            linearLayout3.addView(c1585010rLf3, layoutParams7);
        }
        View c1585010rLf4 = new C1585010rLf(context, null);
        c1585010rLf4.setId(R.id.ltm);
        C786410Ut5.LJLLLLLL(i3, c1585010rLf4);
        ViewGroup.MarginLayoutParams layoutParams8 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams8)) {
            layoutParams8.setMarginStart((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        if (C19ME.class.isInstance(layoutParams8)) {
            ((C19ME) layoutParams8).bottomToBottom = i3;
        }
        if (C19ME.class.isInstance(layoutParams8)) {
            ((C19ME) layoutParams8).endToEnd = i3;
        }
        if (C19ME.class.isInstance(layoutParams8)) {
            ((C19ME) layoutParams8).topToTop = i3;
        }
        android.view.a.LIZ(c1585010rLf4);
        if (c1585010rLf4.getParent() == null) {
            linearLayout3.addView(c1585010rLf4, layoutParams8);
        }
        android.view.a.LIZ(linearLayout3);
        if (linearLayout3.getParent() == null) {
            constraintLayout2.addView(linearLayout3, c19me7);
        }
        android.view.a.LIZ(constraintLayout2);
        if (constraintLayout2.getParent() == null) {
            constraintLayout.addView(constraintLayout2, c19me4);
        }
        View frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.pwo);
        C19ME c19me8 = new C19ME(-1, -1);
        if (C19ME.class.isInstance(c19me8)) {
            c19me8.topToTop = i3;
        }
        if (C19ME.class.isInstance(c19me8)) {
            c19me8.bottomToBottom = i3;
        }
        if (C19ME.class.isInstance(c19me8)) {
            c19me8.startToStart = i3;
        }
        if (C19ME.class.isInstance(c19me8)) {
            c19me8.endToEnd = i3;
        }
        android.view.a.LIZ(frameLayout2);
        if (frameLayout2.getParent() == null) {
            constraintLayout.addView(frameLayout2, c19me8);
        }
        android.view.a.LIZ(constraintLayout);
        C786410Ut5.W5(constraintLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(constraintLayout);
        }
        return constraintLayout;
    }
}
