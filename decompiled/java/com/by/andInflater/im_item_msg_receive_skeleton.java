package com.by.andInflater;

import X.C03C4;
import X.C1100300ejs;
import X.C19ME;
import X.C19MW;
import X.C20742916Ex;
import X.C21652419oY;
import X.C371500EhQ;
import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.Space;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.views.InterceptingConstraintLayout;
import com.zhiliaoapp.musically.R;
import dc.a;

/* JADX INFO: loaded from: classes32.dex */
public class im_item_msg_receive_skeleton implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        Resources resources = context.getResources();
        InterceptingConstraintLayout interceptingConstraintLayout = new InterceptingConstraintLayout(context);
        interceptingConstraintLayout.setPadding(interceptingConstraintLayout.getPaddingLeft(), interceptingConstraintLayout.getPaddingTop(), interceptingConstraintLayout.getPaddingRight(), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        interceptingConstraintLayout.setPadding(interceptingConstraintLayout.getPaddingLeft(), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), interceptingConstraintLayout.getPaddingRight(), interceptingConstraintLayout.getPaddingBottom());
        interceptingConstraintLayout.setId(R.id.vf6);
        interceptingConstraintLayout.setClipChildren(false);
        interceptingConstraintLayout.setClipToPadding(false);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -2, viewGroup);
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(R.id.djt);
        viewStub.setInflatedId(R.id.djs);
        viewStub.setLayoutResource(R.layout.cpg);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ2 = a.LJ(-2, -2, interceptingConstraintLayout);
        if (C19ME.class.isInstance(marginLayoutParamsLJ2)) {
            ((C19ME) marginLayoutParamsLJ2).startToStart = 0;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ2)) {
            ((C19ME) marginLayoutParamsLJ2).topToTop = 0;
        }
        a.LIZ(viewStub);
        if (viewStub.getParent() == null) {
            interceptingConstraintLayout.addView(viewStub, marginLayoutParamsLJ2);
        }
        C03C4 c03c4 = new C03C4(context, null, 6);
        c03c4.setId(R.id.bka);
        c03c4.setClipChildren(false);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ3 = a.LJ(-2, -2, interceptingConstraintLayout);
        if (C19ME.class.isInstance(marginLayoutParamsLJ3)) {
            ((C19ME) marginLayoutParamsLJ3).bottomToBottom = R.id.eu1;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ3)) {
            ((C19ME) marginLayoutParamsLJ3).startToStart = 0;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            marginLayoutParamsLJ3.setMarginEnd((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        a.LIZ(c03c4);
        if (c03c4.getParent() == null) {
            interceptingConstraintLayout.addView(c03c4, marginLayoutParamsLJ3);
        }
        C371500EhQ c371500EhQ = new C371500EhQ(context, null, 6);
        c371500EhQ.setId(R.id.bih);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ4 = a.LJ(-2, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), interceptingConstraintLayout);
        if (C19ME.class.isInstance(marginLayoutParamsLJ4)) {
            ((C19ME) marginLayoutParamsLJ4).startToEnd = R.id.bka;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ4)) {
            ((C19ME) marginLayoutParamsLJ4).topToTop = R.id.bka;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ4)) {
            ((C19ME) marginLayoutParamsLJ4).bottomToBottom = R.id.bka;
        }
        a.LIZ(c371500EhQ);
        if (c371500EhQ.getParent() == null) {
            interceptingConstraintLayout.addView(c371500EhQ, marginLayoutParamsLJ4);
        }
        C19MW c19mw = new C19MW(context);
        c19mw.setId(R.id.big);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ5 = a.LJ(-2, -2, interceptingConstraintLayout);
        new ule.a();
        ule.a.LIZ(new a.c("end"), c19mw);
        c19mw.setReferencedIds(new int[]{R.id.bih});
        android.view.a.LIZ(c19mw);
        if (c19mw.getParent() == null) {
            interceptingConstraintLayout.addView(c19mw, marginLayoutParamsLJ5);
        }
        View viewLIZ = C20742916Ex.LIZ(context, R.layout.cq5, interceptingConstraintLayout, false, R.layout.clq);
        viewLIZ.setId(R.id.wse);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ6 = android.view.a.LJ((int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), interceptingConstraintLayout);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ6)) {
            marginLayoutParamsLJ6.setMarginStart((int) resources.getDimension(R.dimen.a2j));
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ6)) {
            ((C19ME) marginLayoutParamsLJ6).bottomToBottom = R.id.eu1;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ6)) {
            ((C19ME) marginLayoutParamsLJ6).startToStart = R.id.eu1;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ6)) {
            ((C19ME) marginLayoutParamsLJ6).topToTop = R.id.eu1;
        }
        if (viewLIZ.getParent() == null) {
            interceptingConstraintLayout.addView(viewLIZ, marginLayoutParamsLJ6);
        }
        ViewStub viewStub2 = new ViewStub(context);
        viewStub2.setId(R.id.user_name_stub);
        viewStub2.setInflatedId(R.id.user_name);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ7 = android.view.a.LJ(-2, -2, interceptingConstraintLayout);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ7)) {
            marginLayoutParamsLJ7.bottomMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ7)) {
            ((C19ME) marginLayoutParamsLJ7).bottomToTop = R.id.soy;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ7)) {
            ((C19ME) marginLayoutParamsLJ7).startToEnd = R.id.big;
        }
        android.view.a.LIZ(viewStub2);
        if (viewStub2.getParent() == null) {
            interceptingConstraintLayout.addView(viewStub2, marginLayoutParamsLJ7);
        }
        ViewStub viewStub3 = new ViewStub(context);
        viewStub3.setId(R.id.soy);
        viewStub3.setInflatedId(R.id.soy);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ8 = android.view.a.LJ(-2, -2, interceptingConstraintLayout);
        if (C19ME.class.isInstance(marginLayoutParamsLJ8)) {
            ((C19ME) marginLayoutParamsLJ8).constrainedWidth = true;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ8)) {
            ((C19ME) marginLayoutParamsLJ8).bottomToTop = R.id.eu1;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ8)) {
            ((C19ME) marginLayoutParamsLJ8).startToEnd = R.id.big;
        }
        android.view.a.LIZ(viewStub3);
        if (viewStub3.getParent() == null) {
            interceptingConstraintLayout.addView(viewStub3, marginLayoutParamsLJ8);
        }
        C21652419oY c21652419oY = new C21652419oY(context);
        c21652419oY.setId(R.id.eu1);
        c21652419oY.setClipChildren(false);
        c21652419oY.setClipToPadding(false);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ9 = android.view.a.LJ(-2, -2, interceptingConstraintLayout);
        if (C19ME.class.isInstance(marginLayoutParamsLJ9)) {
            ((C19ME) marginLayoutParamsLJ9).constrainedWidth = true;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ9)) {
            ((C19ME) marginLayoutParamsLJ9).bottomToTop = R.id.euq;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ9)) {
            ((C19ME) marginLayoutParamsLJ9).startToEnd = R.id.big;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ9)) {
            ((C19ME) marginLayoutParamsLJ9).goneTopMargin = (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics());
        }
        android.view.a.LIZ(c21652419oY);
        if (c21652419oY.getParent() == null) {
            interceptingConstraintLayout.addView(c21652419oY, marginLayoutParamsLJ9);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.o_5);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ10 = android.view.a.LJ(-2, -2, interceptingConstraintLayout);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ10)) {
            marginLayoutParamsLJ10.setMarginStart((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ10)) {
            ((C19ME) marginLayoutParamsLJ10).bottomToTop = R.id.omc;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ10)) {
            ((C19ME) marginLayoutParamsLJ10).startToEnd = R.id.big;
        }
        android.view.a.LIZ(frameLayout);
        if (frameLayout.getParent() == null) {
            interceptingConstraintLayout.addView(frameLayout, marginLayoutParamsLJ10);
        }
        ViewStub viewStub4 = new ViewStub(context);
        viewStub4.setId(R.id.o9f);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ11 = android.view.a.LJ(-2, -2, interceptingConstraintLayout);
        if (C19ME.class.isInstance(marginLayoutParamsLJ11)) {
            ((C19ME) marginLayoutParamsLJ11).startToStart = R.id.eu1;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ11)) {
            ((C19ME) marginLayoutParamsLJ11).topToBottom = R.id.o9p;
        }
        viewStub4.setInflatedId(-1);
        android.view.a.LIZ(viewStub4);
        if (viewStub4.getParent() == null) {
            interceptingConstraintLayout.addView(viewStub4, marginLayoutParamsLJ11);
        }
        C19MW c19mw2 = new C19MW(context);
        c19mw2.setId(R.id.euq);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ12 = android.view.a.LJ(-2, -2, interceptingConstraintLayout);
        new ule.a();
        ule.a.LIZ(new a.c("top"), c19mw2);
        c19mw2.setReferencedIds(new int[]{R.id.o9p, R.id.omb, R.id.o_5});
        android.view.a.LIZ(c19mw2);
        if (c19mw2.getParent() == null) {
            interceptingConstraintLayout.addView(c19mw2, marginLayoutParamsLJ12);
        }
        ViewStub viewStub5 = new ViewStub(context);
        viewStub5.setId(R.id.nco);
        viewStub5.setInflatedId(R.id.ncm);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ13 = android.view.a.LJ(-2, (int) resources.getDimension(R.dimen.a22), interceptingConstraintLayout);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ13)) {
            marginLayoutParamsLJ13.setMarginStart((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ13)) {
            ((C19ME) marginLayoutParamsLJ13).bottomToBottom = R.id.o9p;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ13)) {
            ((C19ME) marginLayoutParamsLJ13).startToStart = R.id.eu1;
        }
        android.view.a.LIZ(viewStub5);
        if (viewStub5.getParent() == null) {
            interceptingConstraintLayout.addView(viewStub5, marginLayoutParamsLJ13);
        }
        Space space = new Space(context);
        space.setId(R.id.o9p);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ14 = android.view.a.LJ(-2, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), interceptingConstraintLayout);
        if (C19ME.class.isInstance(marginLayoutParamsLJ14)) {
            ((C19ME) marginLayoutParamsLJ14).startToStart = R.id.eu1;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ14)) {
            ((C19ME) marginLayoutParamsLJ14).bottomToTop = R.id.o_5;
        }
        android.view.a.LIZ(space);
        if (space.getParent() == null) {
            interceptingConstraintLayout.addView(space, marginLayoutParamsLJ14);
        }
        SmartImageView smartImageView = new SmartImageView(context);
        smartImageView.setId(R.id.apb);
        smartImageView.setTranslationZ(TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()));
        C786410Ut5.LJZI(8, smartImageView);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ15 = android.view.a.LJ((int) TypedValue.applyDimension(1, 72.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 72.0f, resources.getDisplayMetrics()), interceptingConstraintLayout);
        if (C19ME.class.isInstance(marginLayoutParamsLJ15)) {
            ((C19ME) marginLayoutParamsLJ15).bottomToBottom = R.id.nzx;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ15)) {
            ((C19ME) marginLayoutParamsLJ15).startToStart = R.id.nzx;
        }
        android.view.a.LIZ(smartImageView);
        if (smartImageView.getParent() == null) {
            interceptingConstraintLayout.addView(smartImageView, marginLayoutParamsLJ15);
        }
        C19MW c19mw3 = new C19MW(context);
        c19mw3.setId(R.id.auc);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ16 = android.view.a.LJ(-2, -2, interceptingConstraintLayout);
        new ule.a();
        ule.a.LIZ(new a.c("bottom"), c19mw3);
        c19mw3.setReferencedIds(new int[]{R.id.soy, R.id.eu1});
        android.view.a.LIZ(c19mw3);
        if (c19mw3.getParent() == null) {
            interceptingConstraintLayout.addView(c19mw3, marginLayoutParamsLJ16);
        }
        C19MW c19mw4 = new C19MW(context);
        c19mw4.setId(R.id.ev_);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ17 = android.view.a.LJ(-2, -2, interceptingConstraintLayout);
        new ule.a();
        ule.a.LIZ(new a.c("end"), c19mw4);
        c19mw4.setReferencedIds(new int[]{R.id.eu1});
        android.view.a.LIZ(c19mw4);
        if (c19mw4.getParent() == null) {
            interceptingConstraintLayout.addView(c19mw4, marginLayoutParamsLJ17);
        }
        C1100300ejs c1100300ejs = new C1100300ejs(context, null);
        c1100300ejs.setId(R.id.nzx);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ18 = android.view.a.LJ((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), interceptingConstraintLayout);
        if (C19ME.class.isInstance(marginLayoutParamsLJ18)) {
            ((C19ME) marginLayoutParamsLJ18).topToBottom = R.id.auc;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ18)) {
            ((C19ME) marginLayoutParamsLJ18).endToEnd = R.id.eu1;
        }
        android.view.a.LIZ(c1100300ejs);
        if (c1100300ejs.getParent() == null) {
            interceptingConstraintLayout.addView(c1100300ejs, marginLayoutParamsLJ18);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.k6p);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ19 = android.view.a.LJ(-2, -2, interceptingConstraintLayout);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ19)) {
            marginLayoutParamsLJ19.setMarginStart((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ19)) {
            ((C19ME) marginLayoutParamsLJ19).bottomToBottom = R.id.eu1;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ19)) {
            ((C19ME) marginLayoutParamsLJ19).startToEnd = R.id.ev_;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ19)) {
            ((C19ME) marginLayoutParamsLJ19).topToTop = R.id.eu1;
        }
        android.view.a.LIZ(frameLayout2);
        if (frameLayout2.getParent() == null) {
            interceptingConstraintLayout.addView(frameLayout2, marginLayoutParamsLJ19);
        }
        C19MW c19mw5 = new C19MW(context);
        c19mw5.setId(R.id.omc);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ20 = android.view.a.LJ(-2, -2, interceptingConstraintLayout);
        new ule.a();
        ule.a.LIZ(new a.c("top"), c19mw5);
        c19mw5.setReferencedIds(new int[]{R.id.omb, R.id.pd8, R.id.nr_});
        android.view.a.LIZ(c19mw5);
        if (c19mw5.getParent() == null) {
            interceptingConstraintLayout.addView(c19mw5, marginLayoutParamsLJ20);
        }
        ViewStub viewStub6 = new ViewStub(context);
        viewStub6.setId(R.id.omb);
        viewStub6.setInflatedId(R.id.pd8);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ21 = android.view.a.LJ(-1, -2, interceptingConstraintLayout);
        if (C19ME.class.isInstance(marginLayoutParamsLJ21)) {
            ((C19ME) marginLayoutParamsLJ21).bottomToTop = R.id.nr_;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ21)) {
            i = 0;
            ((C19ME) marginLayoutParamsLJ21).endToEnd = 0;
        } else {
            i = 0;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ21)) {
            ((C19ME) marginLayoutParamsLJ21).startToStart = i;
        }
        android.view.a.LIZ(viewStub6);
        if (viewStub6.getParent() == null) {
            interceptingConstraintLayout.addView(viewStub6, marginLayoutParamsLJ21);
        }
        C1100300ejs c1100300ejs2 = new C1100300ejs(context, null);
        c1100300ejs2.setId(R.id.nr_);
        C786410Ut5.LJLLLLLL(8, c1100300ejs2);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ22 = android.view.a.LJ((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), interceptingConstraintLayout);
        if (C19ME.class.isInstance(marginLayoutParamsLJ22)) {
            ((C19ME) marginLayoutParamsLJ22).bottomToBottom = i;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ22)) {
            ((C19ME) marginLayoutParamsLJ22).endToEnd = i;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ22)) {
            ((C19ME) marginLayoutParamsLJ22).startToStart = i;
        }
        android.view.a.LIZ(c1100300ejs2);
        if (c1100300ejs2.getParent() == null) {
            interceptingConstraintLayout.addView(c1100300ejs2, marginLayoutParamsLJ22);
        }
        ViewStub viewStub7 = new ViewStub(context);
        viewStub7.setId(R.id.k9p);
        viewStub7.setInflatedId(R.id.k9o);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ23 = android.view.a.LJ(-2, -2, interceptingConstraintLayout);
        if (C19ME.class.isInstance(marginLayoutParamsLJ23)) {
            ((C19ME) marginLayoutParamsLJ23).topToTop = i;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ23)) {
            ((C19ME) marginLayoutParamsLJ23).endToEnd = i;
        }
        android.view.a.LIZ(viewStub7);
        if (viewStub7.getParent() == null) {
            interceptingConstraintLayout.addView(viewStub7, marginLayoutParamsLJ23);
        }
        View view = new View(context);
        view.setId(R.id.k_e);
        view.setElevation(TypedValue.applyDimension(1, -2.0f, resources.getDisplayMetrics()));
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ24 = android.view.a.LJ((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), interceptingConstraintLayout);
        if (C19ME.class.isInstance(marginLayoutParamsLJ24)) {
            ((C19ME) marginLayoutParamsLJ24).topToTop = R.id.eu1;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ24)) {
            ((C19ME) marginLayoutParamsLJ24).bottomToBottom = R.id.eu1;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ24)) {
            ((C19ME) marginLayoutParamsLJ24).endToEnd = R.id.eu1;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ24)) {
            ((C19ME) marginLayoutParamsLJ24).startToEnd = R.id.bka;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ24)) {
            marginLayoutParamsLJ24.setMarginStart((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        android.view.a.LIZ(view);
        if (view.getParent() == null) {
            interceptingConstraintLayout.addView(view, marginLayoutParamsLJ24);
        }
        android.view.a.LIZ(interceptingConstraintLayout);
        C786410Ut5.W5(interceptingConstraintLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(interceptingConstraintLayout);
        }
        return interceptingConstraintLayout;
    }
}
