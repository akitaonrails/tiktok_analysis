package com.by.andInflater;

import X.C1086520eNe;
import X.C1749280vcc;
import X.C197039127h;
import X.C19ME;
import X.C19MW;
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
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.f;
import xem.k;
import xem.n;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class explore_recommend_topic_fragment implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Resources resources = context.getResources();
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setPadding(constraintLayout.getPaddingLeft(), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), constraintLayout.getPaddingRight(), constraintLayout.getPaddingBottom());
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -1, viewGroup);
        ConstraintLayout constraintLayout2 = new ConstraintLayout(context);
        constraintLayout2.setId(R.id.kvo);
        constraintLayout2.setPadding((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), constraintLayout2.getPaddingTop(), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), constraintLayout2.getPaddingBottom());
        constraintLayout2.setPadding(constraintLayout2.getPaddingLeft(), constraintLayout2.getPaddingTop(), constraintLayout2.getPaddingRight(), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        C19ME c19me = new C19ME((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (C19ME.class.isInstance(c19me)) {
            c19me.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.endToEnd = 0;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.topToTop = 0;
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.yf7);
        tuxTextView.setGravity(8388611);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setMaxLines(3);
        tuxTextView.setText("Los Angeles Fire");
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1h});
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        C19ME c19me2 = new C19ME((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me2)) {
            ((ViewGroup.MarginLayoutParams) c19me2).topMargin = (int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics());
        }
        new o();
        o.LIZ("app:tux_font", new a.c("H1_Bold"), tuxTextView);
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.verticalBias = 0.0f;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.topToTop = R.id.e1y;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.endToStart = R.id.e1y;
        }
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            constraintLayout2.addView(tuxTextView, c19me2);
        }
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.yf8);
        tuxTextView2.setGravity(8388611);
        tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView2.setMaxLines(1);
        C786410Ut5.T4(tuxTextView2, 0.0f);
        tuxTextView2.setText("Los Angeles Fire");
        TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1h});
        tuxTextView2.setTextColor(typedArrayObtainStyledAttributes2.getColor(0, 0));
        typedArrayObtainStyledAttributes2.recycle();
        C19ME c19me3 = new C19ME((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        new o();
        o.LIZ("app:tux_font", new a.c("H1_Bold"), tuxTextView2);
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.verticalBias = 0.0f;
        }
        if (C19ME.class.isInstance(c19me3)) {
            i = R.id.yf7;
            c19me3.startToStart = R.id.yf7;
        } else {
            i = R.id.yf7;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.topToTop = i;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.endToEnd = i;
        }
        android.view.a.LIZ(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            constraintLayout2.addView(tuxTextView2, c19me3);
        }
        C19MW c19mw = new C19MW(context);
        c19mw.setId(R.id.cbn);
        ViewGroup.LayoutParams c19me4 = new C19ME(-2, -2);
        new ule.a();
        ule.a.LIZ(new a.c("bottom"), c19mw);
        c19mw.setReferencedIds(new int[]{R.id.yf7, R.id.e1y});
        android.view.a.LIZ(c19mw);
        if (c19mw.getParent() == null) {
            constraintLayout2.addView(c19mw, c19me4);
        }
        TuxTextView tuxTextView3 = new TuxTextView(context);
        tuxTextView3.setId(R.id.yet);
        tuxTextView3.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView3.setMaxLines(1);
        TypedArray typedArrayObtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1k});
        tuxTextView3.setTextColor(typedArrayObtainStyledAttributes3.getColor(0, 0));
        typedArrayObtainStyledAttributes3.recycle();
        C19ME c19me5 = new C19ME(-2, -2);
        new o();
        o.LIZ("app:tux_font", new a.c("P1_Regular"), tuxTextView3);
        if (C19ME.class.isInstance(c19me5)) {
            c19me5.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me5)) {
            c19me5.topToBottom = R.id.cbn;
        }
        if (C19ME.class.isInstance(c19me5)) {
            c19me5.bottomToBottom = 0;
        }
        android.view.a.LIZ(tuxTextView3);
        if (tuxTextView3.getParent() == null) {
            constraintLayout2.addView(tuxTextView3, c19me5);
        }
        ConstraintLayout constraintLayout3 = new ConstraintLayout(context);
        constraintLayout3.setId(R.id.hhf);
        constraintLayout3.setPadding((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), constraintLayout3.getPaddingTop(), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), constraintLayout3.getPaddingBottom());
        constraintLayout3.setPadding(constraintLayout3.getPaddingLeft(), (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()), constraintLayout3.getPaddingRight(), (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        C19ME c19me6 = new C19ME(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me6)) {
            c19me6.setMarginStart((int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me6)) {
            c19me6.setMarginEnd((int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        }
        if (C19ME.class.isInstance(c19me6)) {
            c19me6.horizontalBias = 1.0f;
        }
        if (C19ME.class.isInstance(c19me6)) {
            c19me6.endToStart = R.id.e1y;
        }
        if (C19ME.class.isInstance(c19me6)) {
            c19me6.topToTop = R.id.q2u;
        }
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setId(R.id.qgh);
        tuxIconView.setImportantForAccessibility(2);
        C19ME c19me7 = new C19ME((int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        new k();
        k.LIZ("app:tux_icon", new a.b("2130774473", "raw"), tuxIconView);
        k.LIZ("app:tux_tintColor", new a.b("2131100622", "attr"), tuxIconView);
        if (C19ME.class.isInstance(c19me7)) {
            c19me7.startToStart = R.id.q2u;
        }
        if (C19ME.class.isInstance(c19me7)) {
            c19me7.endToStart = R.id.qgy;
        }
        if (C19ME.class.isInstance(c19me7)) {
            c19me7.topToTop = R.id.q2u;
        }
        if (C19ME.class.isInstance(c19me7)) {
            c19me7.bottomToBottom = 0;
        }
        android.view.a.LIZ(tuxIconView);
        if (tuxIconView.getParent() == null) {
            constraintLayout3.addView(tuxIconView, c19me7);
        }
        TuxIconView tuxIconView2 = new TuxIconView(context);
        tuxIconView2.setId(R.id.unpin_icon);
        tuxIconView2.setImportantForAccessibility(2);
        C786410Ut5.x5(tuxIconView2, 0.0f);
        C19ME c19me8 = new C19ME((int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        new k();
        k.LIZ("app:tux_icon", new a.b("2130774475", "raw"), tuxIconView2);
        k.LIZ("app:tux_tintColor", new a.b("2131100622", "attr"), tuxIconView2);
        if (C19ME.class.isInstance(c19me8)) {
            i2 = R.id.qgh;
            c19me8.startToStart = R.id.qgh;
        } else {
            i2 = R.id.qgh;
        }
        if (C19ME.class.isInstance(c19me8)) {
            c19me8.endToEnd = i2;
        }
        if (C19ME.class.isInstance(c19me8)) {
            c19me8.topToTop = i2;
        }
        if (C19ME.class.isInstance(c19me8)) {
            c19me8.bottomToBottom = i2;
        }
        android.view.a.LIZ(tuxIconView2);
        if (tuxIconView2.getParent() == null) {
            constraintLayout3.addView(tuxIconView2, c19me8);
        }
        TuxTextView tuxTextView4 = new TuxTextView(context);
        tuxTextView4.setId(R.id.qgy);
        tuxTextView4.setPadding((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), tuxTextView4.getPaddingTop(), tuxTextView4.getPaddingRight(), tuxTextView4.getPaddingBottom());
        TypedArray typedArrayObtainStyledAttributes4 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1h});
        tuxTextView4.setTextColor(typedArrayObtainStyledAttributes4.getColor(0, 0));
        typedArrayObtainStyledAttributes4.recycle();
        tuxTextView4.setText(2131829900);
        tuxTextView4.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView4.setMaxLines(1);
        C19ME c19me9 = new C19ME(-2, -2);
        new o();
        o.LIZ("app:tux_font", new a.c("H4_Semibold"), tuxTextView4);
        if (C19ME.class.isInstance(c19me9)) {
            c19me9.startToEnd = R.id.qgh;
        }
        if (C19ME.class.isInstance(c19me9)) {
            i3 = 0;
            c19me9.topToTop = 0;
        } else {
            i3 = 0;
        }
        if (C19ME.class.isInstance(c19me9)) {
            c19me9.bottomToBottom = i3;
        }
        android.view.a.LIZ(tuxTextView4);
        if (tuxTextView4.getParent() == null) {
            constraintLayout3.addView(tuxTextView4, c19me9);
        }
        android.view.a.LIZ(constraintLayout3);
        if (constraintLayout3.getParent() == null) {
            constraintLayout2.addView(constraintLayout3, c19me6);
        }
        C197039127h c197039127h = new C197039127h(context);
        c197039127h.setId(R.id.e1y);
        C19ME c19me10 = new C19ME((int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        new f();
        f.LIZ("app:tux_buttonVariant", new a.c("secondary"), c197039127h);
        if (C19ME.class.isInstance(c19me10)) {
            c19me10.horizontalBias = 1.0f;
        }
        f.LIZ("app:tux_iconStart", new a.b("2130775055", "raw"), c197039127h);
        if (C19ME.class.isInstance(c19me10)) {
            i4 = 0;
            c19me10.endToEnd = 0;
        } else {
            i4 = 0;
        }
        if (C19ME.class.isInstance(c19me10)) {
            c19me10.topToTop = i4;
        }
        f.LIZ("app:tux_buttonCapsule", new a.c("true"), c197039127h);
        android.view.a.LIZ(c197039127h);
        if (c197039127h.getParent() == null) {
            constraintLayout2.addView(c197039127h, c19me10);
        }
        android.view.a.LIZ(constraintLayout2);
        if (constraintLayout2.getParent() == null) {
            constraintLayout.addView(constraintLayout2, c19me);
        }
        View c1086520eNe = new C1086520eNe(context);
        c1086520eNe.setId(R.id.hh7);
        C19ME c19me11 = new C19ME((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me11)) {
            ((ViewGroup.MarginLayoutParams) c19me11).topMargin = (int) TypedValue.applyDimension(1, 52.0f, resources.getDisplayMetrics());
        }
        if (C19ME.class.isInstance(c19me11)) {
            i5 = 0;
            c19me11.startToStart = 0;
        } else {
            i5 = 0;
        }
        if (C19ME.class.isInstance(c19me11)) {
            c19me11.endToEnd = i5;
        }
        if (C19ME.class.isInstance(c19me11)) {
            c19me11.topToTop = i5;
        }
        if (C19ME.class.isInstance(c19me11)) {
            c19me11.bottomToBottom = i5;
        }
        android.view.a.LIZ(c1086520eNe);
        if (c1086520eNe.getParent() == null) {
            constraintLayout.addView(c1086520eNe, c19me11);
        }
        C1749280vcc c1749280vcc = new C1749280vcc(context);
        c1749280vcc.setId(R.id.w28);
        C19ME c19me12 = new C19ME((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me12)) {
            ((ViewGroup.MarginLayoutParams) c19me12).topMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        new n();
        n.LIZ(new a.c("hug_content"), c1749280vcc);
        if (C19ME.class.isInstance(c19me12)) {
            i6 = 0;
            c19me12.startToStart = 0;
        } else {
            i6 = 0;
        }
        if (C19ME.class.isInstance(c19me12)) {
            c19me12.endToEnd = i6;
        }
        if (C19ME.class.isInstance(c19me12)) {
            c19me12.topToBottom = R.id.kvo;
        }
        if (C19ME.class.isInstance(c19me12)) {
            c19me12.bottomToBottom = 0;
        }
        android.view.a.LIZ(c1749280vcc);
        if (c1749280vcc.getParent() == null) {
            constraintLayout.addView(c1749280vcc, c19me12);
        }
        View view = new View(context);
        view.setId(R.id.uqb);
        C786410Ut5.LJLLLLLL(8, view);
        TypedArray typedArrayObtainStyledAttributes5 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a03});
        view.setBackgroundColor(typedArrayObtainStyledAttributes5.getColor(0, 0));
        typedArrayObtainStyledAttributes5.recycle();
        C19ME c19me13 = new C19ME((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.5f, resources.getDisplayMetrics()));
        if (C19ME.class.isInstance(c19me13)) {
            c19me13.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me13)) {
            c19me13.endToEnd = 0;
        }
        if (C19ME.class.isInstance(c19me13)) {
            c19me13.bottomToBottom = R.id.kvo;
        }
        android.view.a.LIZ(view);
        if (view.getParent() == null) {
            constraintLayout.addView(view, c19me13);
        }
        android.view.a.LIZ(constraintLayout);
        C786410Ut5.W5(constraintLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(constraintLayout);
        }
        return constraintLayout;
    }
}
