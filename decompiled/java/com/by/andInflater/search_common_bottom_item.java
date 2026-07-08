package com.by.andInflater;

import X.C19ME;
import X.C427870Gq9;
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
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import dc.a;
import jf8.c;
import xem.k;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class search_common_bottom_item implements InterfaceC20742716Ev {
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [boolean, int] */
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        ?? r1;
        int i;
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.fmz);
        linearLayout.setOrientation(1);
        linearLayout.setPadding((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), linearLayout.getPaddingTop(), linearLayout.getPaddingRight(), linearLayout.getPaddingBottom());
        linearLayout.setImportantForAccessibility(4);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -2, viewGroup);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            marginLayoutParamsLJ.topMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        View frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.i2b);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        a.LIZ(frameLayout);
        if (frameLayout.getParent() == null) {
            linearLayout.addView(frameLayout, layoutParams);
        }
        View frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.u5c);
        ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        a.LIZ(frameLayout2);
        if (frameLayout2.getParent() == null) {
            linearLayout.addView(frameLayout2, layoutParams2);
        }
        View frameLayout3 = new FrameLayout(context);
        frameLayout3.setId(R.id.ynk);
        C786410Ut5.LJLLLLLL(8, frameLayout3);
        ViewGroup.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        a.LIZ(frameLayout3);
        if (frameLayout3.getParent() == null) {
            linearLayout.addView(frameLayout3, layoutParams3);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.desc);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setMaxLines(3);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1h});
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        tuxTextView.setTextDirection(5);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.setMarginEnd((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        new o();
        o.LIZ("app:tux_font", new a.c("H4_Semibold"), tuxTextView);
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            linearLayout.addView(tuxTextView, layoutParams4);
        }
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(R.id.bc5);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            ((ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        C427870Gq9 c427870Gq9 = new C427870Gq9(context);
        c427870Gq9.setId(R.id.bbz);
        C19ME c19me = new C19ME((int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        c cVar = new c();
        cVar.LIZIZ("app:failureImage", new a.b("2131230723", "color"), c427870Gq9);
        if (C19ME.class.isInstance(c19me)) {
            c19me.bottomToBottom = 0;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.topToTop = 0;
        }
        cVar.LIZIZ("app:placeholderImage", new a.b("2131230723", "color"), c427870Gq9);
        cVar.LIZ(c427870Gq9);
        android.view.a.LIZ(c427870Gq9);
        if (c427870Gq9.getParent() == null) {
            constraintLayout.addView(c427870Gq9, c19me);
        }
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.bc6);
        tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView2.setGravity(8388611);
        tuxTextView2.setMaxLines(1);
        TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1k});
        tuxTextView2.setTextColor(typedArrayObtainStyledAttributes2.getColor(0, 0));
        typedArrayObtainStyledAttributes2.recycle();
        C19ME c19me2 = new C19ME(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me2)) {
            r1 = 1;
            c19me2.setMarginStart((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        } else {
            r1 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me2)) {
            c19me2.setMarginEnd((int) TypedValue.applyDimension(r1, 2.0f, resources.getDisplayMetrics()));
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.constrainedWidth = r1;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.bottomToBottom = 0;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.endToStart = R.id.bcd;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.horizontalBias = 0.0f;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.horizontalChainStyle = 2;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.startToEnd = R.id.bbz;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.topToTop = 0;
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P2_Semibold"), tuxTextView2);
        android.view.a.LIZ(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            constraintLayout.addView(tuxTextView2, c19me2);
        }
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R.id.bcd);
        appCompatImageView.setImageResource(R.drawable.bwj);
        C19ME c19me3 = new C19ME((int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me3)) {
            c19me3.setMarginStart((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.bottomToBottom = 0;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.endToStart = R.id.mo4;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.startToEnd = R.id.bc6;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.topToTop = 0;
        }
        android.view.a.LIZ(appCompatImageView);
        if (appCompatImageView.getParent() == null) {
            constraintLayout.addView(appCompatImageView, c19me3);
        }
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setId(R.id.a_6);
        C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        tuxIconView.setImportantForAccessibility(2);
        C19ME c19me4 = new C19ME((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        new k();
        k.LIZ("app:tux_icon", new a.b("2130774138", "raw"), tuxIconView);
        k.LIZ("app:tux_tintColor", new a.b("2131100625", "attr"), tuxIconView);
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.bottomToBottom = 0;
        }
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.endToStart = R.id.mo4;
        }
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.startToEnd = R.id.bc6;
        }
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.topToTop = 0;
        }
        android.view.a.LIZ(tuxIconView);
        if (tuxIconView.getParent() == null) {
            constraintLayout.addView(tuxIconView, c19me4);
        }
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout4.setId(R.id.mo4);
        C19ME c19me5 = new C19ME(-2, -2);
        if (C19ME.class.isInstance(c19me5)) {
            i = 0;
            c19me5.bottomToBottom = 0;
        } else {
            i = 0;
        }
        if (C19ME.class.isInstance(c19me5)) {
            c19me5.endToEnd = i;
        }
        if (C19ME.class.isInstance(c19me5)) {
            c19me5.topToTop = i;
        }
        TuxTextView tuxTextView3 = new TuxTextView(context);
        tuxTextView3.setId(R.id.mnh);
        tuxTextView3.setPadding((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), tuxTextView3.getPaddingTop(), tuxTextView3.getPaddingRight(), tuxTextView3.getPaddingBottom());
        tuxTextView3.setPadding(tuxTextView3.getPaddingLeft(), (int) TypedValue.applyDimension(1, 2.5f, resources.getDisplayMetrics()), tuxTextView3.getPaddingRight(), tuxTextView3.getPaddingBottom());
        tuxTextView3.setPadding(tuxTextView3.getPaddingLeft(), tuxTextView3.getPaddingTop(), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), tuxTextView3.getPaddingBottom());
        tuxTextView3.setPadding(tuxTextView3.getPaddingLeft(), tuxTextView3.getPaddingTop(), tuxTextView3.getPaddingRight(), (int) TypedValue.applyDimension(1, 2.5f, resources.getDisplayMetrics()));
        TypedArray typedArrayObtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1k});
        tuxTextView3.setTextColor(typedArrayObtainStyledAttributes3.getColor(0, 0));
        typedArrayObtainStyledAttributes3.recycle();
        tuxTextView3.setTextDirection(5);
        C786410Ut5.LJLLLLLL(8, tuxTextView3);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, -2);
        new o();
        o.LIZ("app:tux_font", new a.c("P2_Semibold"), tuxTextView3);
        android.view.a.LIZ(tuxTextView3);
        if (tuxTextView3.getParent() == null) {
            frameLayout4.addView(tuxTextView3, layoutParams6);
        }
        TuxTextView tuxTextView4 = new TuxTextView(context);
        tuxTextView4.setId(R.id.tv_watching_count);
        tuxTextView4.setCompoundDrawablePadding((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        tuxTextView4.setPadding((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), tuxTextView4.getPaddingTop(), tuxTextView4.getPaddingRight(), tuxTextView4.getPaddingBottom());
        tuxTextView4.setPadding(tuxTextView4.getPaddingLeft(), (int) TypedValue.applyDimension(1, 2.5f, resources.getDisplayMetrics()), tuxTextView4.getPaddingRight(), tuxTextView4.getPaddingBottom());
        tuxTextView4.setPadding(tuxTextView4.getPaddingLeft(), tuxTextView4.getPaddingTop(), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), tuxTextView4.getPaddingBottom());
        tuxTextView4.setPadding(tuxTextView4.getPaddingLeft(), tuxTextView4.getPaddingTop(), tuxTextView4.getPaddingRight(), (int) TypedValue.applyDimension(1, 3.5f, resources.getDisplayMetrics()));
        TypedArray typedArrayObtainStyledAttributes4 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1k});
        tuxTextView4.setTextColor(typedArrayObtainStyledAttributes4.getColor(0, 0));
        typedArrayObtainStyledAttributes4.recycle();
        tuxTextView4.setTextDirection(5);
        C786410Ut5.LJLLLLLL(8, tuxTextView4);
        FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-1, -1);
        new o();
        o.LIZ("app:tux_font", new a.c("P3_Semibold"), tuxTextView4);
        android.view.a.LIZ(tuxTextView4);
        if (tuxTextView4.getParent() == null) {
            frameLayout4.addView(tuxTextView4, layoutParams7);
        }
        android.view.a.LIZ(frameLayout4);
        if (frameLayout4.getParent() == null) {
            constraintLayout.addView(frameLayout4, c19me5);
        }
        android.view.a.LIZ(constraintLayout);
        if (constraintLayout.getParent() == null) {
            linearLayout.addView(constraintLayout, layoutParams5);
        }
        android.view.a.LIZ(linearLayout);
        C786410Ut5.W5(linearLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(linearLayout);
        }
        return linearLayout;
    }
}
