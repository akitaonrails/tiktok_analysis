package com.by.andInflater;

import X.C1735630vGb;
import X.C19ME;
import X.C19MW;
import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
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
public class commerce_comment_single_anchor implements InterfaceC20742716Ev {
    /* JADX WARN: Multi-variable type inference failed */
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
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -2, viewGroup);
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setId(R.id.v6c);
        tuxIconView.setPadding((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        C19ME c19me = new C19ME((int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me)) {
            c19me.setMarginStart((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me)) {
            ((ViewGroup.MarginLayoutParams) c19me).topMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me)) {
            ((ViewGroup.MarginLayoutParams) c19me).bottomMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        new k();
        k.LIZ("app:tux_icon", new a.b("2130772361", "raw"), tuxIconView);
        if (C19ME.class.isInstance(c19me)) {
            c19me.bottomToBottom = 0;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.topToTop = 0;
        }
        android.view.a.LIZ(tuxIconView);
        if (tuxIconView.getParent() == null) {
            constraintLayout.addView(tuxIconView, c19me);
        }
        SmartImageView smartImageView = new SmartImageView(context);
        smartImageView.setId(R.id.rxg);
        C786410Ut5.LJZI(8, smartImageView);
        if (Build.VERSION.SDK_INT >= 26) {
            smartImageView.setForeground(context.getResources().getDrawable(R.drawable.b48));
        }
        smartImageView.setImportantForAccessibility(2);
        C19ME c19me2 = new C19ME((int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me2)) {
            c19me2.setMarginStart((int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me2)) {
            ((ViewGroup.MarginLayoutParams) c19me2).topMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me2)) {
            ((ViewGroup.MarginLayoutParams) c19me2).bottomMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.bottomToBottom = 0;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.topToTop = 0;
        }
        c cVar = new c();
        cVar.LIZIZ("app:roundedCornerRadius", new a.b("null", "dimen"), smartImageView);
        cVar.LIZ(smartImageView);
        android.view.a.LIZ(smartImageView);
        if (smartImageView.getParent() == null) {
            constraintLayout.addView(smartImageView, c19me2);
        }
        C19MW c19mw = new C19MW(context);
        c19mw.setId(R.id.btn);
        ViewGroup.LayoutParams c19me3 = new C19ME(-2, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        new ule.a();
        ule.a.LIZ(new a.c("end"), c19mw);
        c19mw.setReferencedIds(new int[]{R.id.v6c, R.id.rxg});
        android.view.a.LIZ(c19mw);
        if (c19mw.getParent() == null) {
            constraintLayout.addView(c19mw, c19me3);
        }
        ConstraintLayout constraintLayout2 = new ConstraintLayout(context);
        C19ME c19me4 = new C19ME((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me4)) {
            c19me4.setMarginStart((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me4)) {
            c19me4.setMarginEnd((int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        }
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.startToEnd = R.id.btn;
        }
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.endToEnd = 0;
        }
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.topToTop = 0;
        }
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.bottomToBottom = 0;
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.rz_);
        tuxTextView.setClickable(false);
        tuxTextView.setMaxWidth((int) TypedValue.applyDimension(1, 150.0f, resources.getDisplayMetrics()));
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setGravity(8388627);
        tuxTextView.setSingleLine(true);
        tuxTextView.setTextAlignment(5);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1h});
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        tuxTextView.setTextDirection(5);
        C786410Ut5.LJLLLLLL(8, tuxTextView);
        C19ME c19me5 = new C19ME(-2, -1);
        if (LinearLayout.LayoutParams.class.isInstance(c19me5)) {
            ((LinearLayout.LayoutParams) c19me5).gravity = 8388627;
        }
        if (FrameLayout.LayoutParams.class.isInstance(c19me5)) {
            ((FrameLayout.LayoutParams) c19me5).gravity = 8388627;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(c19me5)) {
            ((DrawerLayout$LayoutParams) c19me5).gravity = 8388627;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me5)) {
            c19me5.setMarginEnd((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        if (C19ME.class.isInstance(c19me5)) {
            c19me5.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me5)) {
            c19me5.topToTop = 0;
        }
        if (C19ME.class.isInstance(c19me5)) {
            c19me5.bottomToTop = R.id.rzd;
        }
        if (C19ME.class.isInstance(c19me5)) {
            c19me5.horizontalBias = 0.0f;
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P2_Semibold"), tuxTextView);
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            constraintLayout2.addView(tuxTextView, c19me5);
        }
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.s00);
        TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1h});
        tuxTextView2.setTextColor(typedArrayObtainStyledAttributes2.getColor(0, 0));
        typedArrayObtainStyledAttributes2.recycle();
        C786410Ut5.LJLLLLLL(8, tuxTextView2);
        tuxTextView2.setText("·");
        C19ME c19me6 = new C19ME((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me6)) {
            c19me6.setMarginEnd((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        if (LinearLayout.LayoutParams.class.isInstance(c19me6)) {
            ((LinearLayout.LayoutParams) c19me6).gravity = 8388627;
        }
        if (FrameLayout.LayoutParams.class.isInstance(c19me6)) {
            ((FrameLayout.LayoutParams) c19me6).gravity = 8388627;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(c19me6)) {
            ((DrawerLayout$LayoutParams) c19me6).gravity = 8388627;
        }
        if (C19ME.class.isInstance(c19me6)) {
            c19me6.startToEnd = R.id.rz_;
        }
        if (C19ME.class.isInstance(c19me6)) {
            c19me6.topToTop = 0;
        }
        if (C19ME.class.isInstance(c19me6)) {
            c19me6.bottomToTop = R.id.rzd;
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P2_Semibold"), tuxTextView2);
        android.view.a.LIZ(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            constraintLayout2.addView(tuxTextView2, c19me6);
        }
        TuxTextView tuxTextView3 = new TuxTextView(context);
        tuxTextView3.setId(R.id.rzz);
        tuxTextView3.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView3.setGravity(8388611);
        tuxTextView3.setLines(1);
        TypedArray typedArrayObtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1h});
        tuxTextView3.setTextColor(typedArrayObtainStyledAttributes3.getColor(0, 0));
        typedArrayObtainStyledAttributes3.recycle();
        C19ME c19me7 = new C19ME(-2, -2);
        if (C19ME.class.isInstance(c19me7)) {
            c19me7.constrainedWidth = true;
        }
        if (C19ME.class.isInstance(c19me7)) {
            c19me7.startToEnd = R.id.s00;
        }
        if (C19ME.class.isInstance(c19me7)) {
            i = 0;
            c19me7.topToTop = 0;
        } else {
            i = 0;
        }
        if (C19ME.class.isInstance(c19me7)) {
            c19me7.endToEnd = i;
        }
        if (C19ME.class.isInstance(c19me7)) {
            c19me7.horizontalBias = 0.0f;
        }
        if (C19ME.class.isInstance(c19me7)) {
            c19me7.bottomToTop = R.id.rzd;
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P2_Semibold"), tuxTextView3);
        android.view.a.LIZ(tuxTextView3);
        if (tuxTextView3.getParent() == null) {
            constraintLayout2.addView(tuxTextView3, c19me7);
        }
        ConstraintLayout constraintLayout3 = new ConstraintLayout(context);
        constraintLayout3.setId(R.id.rzd);
        C786410Ut5.LJLLLLLL(8, constraintLayout3);
        C19ME c19me8 = new C19ME(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me8)) {
            c19me8.setMarginEnd((int) TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()));
        }
        if (C19ME.class.isInstance(c19me8)) {
            c19me8.horizontalBias = 0.0f;
        }
        if (C19ME.class.isInstance(c19me8)) {
            i2 = 0;
            c19me8.endToEnd = 0;
        } else {
            i2 = 0;
        }
        if (C19ME.class.isInstance(c19me8)) {
            c19me8.startToStart = i2;
        }
        if (C19ME.class.isInstance(c19me8)) {
            c19me8.bottomToBottom = i2;
        }
        if (C19ME.class.isInstance(c19me8)) {
            c19me8.topToBottom = R.id.rzz;
        }
        TuxTextView tuxTextView4 = new TuxTextView(context);
        tuxTextView4.setId(R.id.rzs);
        tuxTextView4.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView4.setGravity(8388611);
        tuxTextView4.setLines(1);
        TypedArray typedArrayObtainStyledAttributes4 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1k});
        tuxTextView4.setTextColor(typedArrayObtainStyledAttributes4.getColor(0, 0));
        typedArrayObtainStyledAttributes4.recycle();
        C786410Ut5.LJLLLLLL(8, tuxTextView4);
        C19ME c19me9 = new C19ME(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me9)) {
            c19me9.setMarginEnd((int) TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()));
        }
        if (C19ME.class.isInstance(c19me9)) {
            i3 = 0;
            c19me9.startToStart = 0;
        } else {
            i3 = 0;
        }
        if (C19ME.class.isInstance(c19me9)) {
            c19me9.bottomToBottom = i3;
        }
        if (C19ME.class.isInstance(c19me9)) {
            c19me9.topToTop = i3;
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P3_Regular"), tuxTextView4);
        android.view.a.LIZ(tuxTextView4);
        if (tuxTextView4.getParent() == null) {
            constraintLayout3.addView(tuxTextView4, c19me9);
        }
        View c1735630vGb = new C1735630vGb(context);
        c1735630vGb.setId(R.id.b1m);
        C786410Ut5.LJLLLLLL(8, c1735630vGb);
        C19ME c19me10 = new C19ME(-2, -2);
        if (C19ME.class.isInstance(c19me10)) {
            c19me10.horizontalBias = 0.0f;
        }
        if (C19ME.class.isInstance(c19me10)) {
            c19me10.endToStart = R.id.b1l;
        }
        if (C19ME.class.isInstance(c19me10)) {
            i4 = 0;
            c19me10.startToStart = 0;
        } else {
            i4 = 0;
        }
        if (C19ME.class.isInstance(c19me10)) {
            c19me10.topToTop = i4;
        }
        if (C19ME.class.isInstance(c19me10)) {
            c19me10.bottomToBottom = i4;
        }
        android.view.a.LIZ(c1735630vGb);
        if (c1735630vGb.getParent() == null) {
            constraintLayout3.addView(c1735630vGb, c19me10);
        }
        View view = new View(context);
        view.setId(R.id.b1l);
        TypedArray typedArrayObtainStyledAttributes5 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.ei});
        view.setBackgroundColor(typedArrayObtainStyledAttributes5.getColor(0, 0));
        typedArrayObtainStyledAttributes5.recycle();
        C786410Ut5.LJLLLLLL(8, view);
        C19ME c19me11 = new C19ME((int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(c19me11)) {
            ((LinearLayout.LayoutParams) c19me11).gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(c19me11)) {
            ((FrameLayout.LayoutParams) c19me11).gravity = 16;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(c19me11)) {
            ((DrawerLayout$LayoutParams) c19me11).gravity = 16;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me11)) {
            c19me11.setMarginStart((int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()));
        }
        if (C19ME.class.isInstance(c19me11)) {
            c19me11.startToEnd = R.id.b1m;
        }
        if (C19ME.class.isInstance(c19me11)) {
            i5 = 0;
            c19me11.topToTop = 0;
        } else {
            i5 = 0;
        }
        if (C19ME.class.isInstance(c19me11)) {
            c19me11.bottomToBottom = i5;
        }
        if (C19ME.class.isInstance(c19me11)) {
            c19me11.endToStart = R.id.b1n;
        }
        android.view.a.LIZ(view);
        if (view.getParent() == null) {
            constraintLayout3.addView(view, c19me11);
        }
        View c1735630vGb2 = new C1735630vGb(context);
        c1735630vGb2.setId(R.id.b1n);
        C786410Ut5.LJLLLLLL(8, c1735630vGb2);
        C19ME c19me12 = new C19ME(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me12)) {
            c19me12.setMarginStart((int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()));
        }
        if (C19ME.class.isInstance(c19me12)) {
            c19me12.constrainedWidth = true;
        }
        if (C19ME.class.isInstance(c19me12)) {
            c19me12.endToEnd = 0;
        }
        if (C19ME.class.isInstance(c19me12)) {
            c19me12.startToEnd = R.id.b1l;
        }
        if (C19ME.class.isInstance(c19me12)) {
            i6 = 0;
            c19me12.topToTop = 0;
        } else {
            i6 = 0;
        }
        if (C19ME.class.isInstance(c19me12)) {
            c19me12.bottomToBottom = i6;
        }
        android.view.a.LIZ(c1735630vGb2);
        if (c1735630vGb2.getParent() == null) {
            constraintLayout3.addView(c1735630vGb2, c19me12);
        }
        android.view.a.LIZ(constraintLayout3);
        if (constraintLayout3.getParent() == null) {
            constraintLayout2.addView(constraintLayout3, c19me8);
        }
        android.view.a.LIZ(constraintLayout2);
        if (constraintLayout2.getParent() == null) {
            constraintLayout.addView(constraintLayout2, c19me4);
        }
        android.view.a.LIZ(constraintLayout);
        C786410Ut5.W5(constraintLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(constraintLayout);
        }
        return constraintLayout;
    }
}
