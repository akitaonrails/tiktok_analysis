package com.by.andInflater;

import X.C19ME;
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
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.k;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class common_feed_common_bottom_banner implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        float f;
        int i2;
        int i3;
        int i4;
        Resources resources = context.getResources();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, R.style.hk);
        Resources resources2 = contextThemeWrapper.getResources();
        ConstraintLayout constraintLayout = new ConstraintLayout(contextThemeWrapper);
        constraintLayout.setId(R.id.ht1);
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.getTheme().obtainStyledAttributes(new int[]{R.attr.bt});
        constraintLayout.setBackgroundColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -2, viewGroup);
        TuxIconView tuxIconView = new TuxIconView(contextThemeWrapper);
        tuxIconView.setId(R.id.ekg);
        C19ME c19me = new C19ME((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me)) {
            c19me.setMarginStart((int) TypedValue.applyDimension(1, 12.0f, resources2.getDisplayMetrics()));
        }
        new k();
        k.LIZ("app:tux_icon", new a.b("2130774228", "raw"), tuxIconView);
        k.LIZ("app:tux_tintColor", new a.b("2131099769", "attr"), tuxIconView);
        if (C19ME.class.isInstance(c19me)) {
            c19me.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.topToTop = 0;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.bottomToBottom = 0;
        }
        android.view.a.LIZ(tuxIconView);
        if (tuxIconView.getParent() == null) {
            constraintLayout.addView(tuxIconView, c19me);
        }
        LinearLayout linearLayout = new LinearLayout(contextThemeWrapper);
        linearLayout.setOrientation(0);
        C19ME c19me2 = new C19ME((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.horizontalBias = 0.0f;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.startToEnd = R.id.ekg;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.endToStart = R.id.saw;
        }
        if (C19ME.class.isInstance(c19me2)) {
            i = 0;
            c19me2.topToTop = 0;
        } else {
            i = 0;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.bottomToBottom = i;
        }
        TuxTextView tuxTextView = new TuxTextView(contextThemeWrapper);
        tuxTextView.setId(R.id.ubf);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setMaxLines(1);
        TypedArray typedArrayObtainStyledAttributes2 = contextThemeWrapper.getTheme().obtainStyledAttributes(new int[]{R.attr.ee});
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes2.getColor(0, 0));
        typedArrayObtainStyledAttributes2.recycle();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.weight = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            layoutParams.setMarginEnd((int) TypedValue.applyDimension(1, 8.0f, resources2.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            layoutParams.setMarginStart((int) TypedValue.applyDimension(1, 4.0f, resources2.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = (int) TypedValue.applyDimension(1, 10.0f, resources2.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = (int) TypedValue.applyDimension(1, 10.0f, resources2.getDisplayMetrics());
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P2_Semibold"), tuxTextView);
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            linearLayout.addView(tuxTextView, layoutParams);
        }
        TuxTextView tuxTextView2 = new TuxTextView(contextThemeWrapper);
        tuxTextView2.setId(R.id.e3k);
        tuxTextView2.setText(2131847101);
        TypedArray typedArrayObtainStyledAttributes3 = contextThemeWrapper.getTheme().obtainStyledAttributes(new int[]{R.attr.ee});
        tuxTextView2.setTextColor(typedArrayObtainStyledAttributes3.getColor(0, 0));
        typedArrayObtainStyledAttributes3.recycle();
        tuxTextView2.setMaxLines(1);
        C786410Ut5.LJLLLLLL(8, tuxTextView2);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.setMarginEnd((int) TypedValue.applyDimension(1, 3.0f, resources2.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            f = 10.0f;
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = (int) TypedValue.applyDimension(1, 10.0f, resources2.getDisplayMetrics());
        } else {
            f = 10.0f;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = (int) TypedValue.applyDimension(1, f, resources2.getDisplayMetrics());
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P2_Semibold"), tuxTextView2);
        android.view.a.LIZ(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            linearLayout.addView(tuxTextView2, layoutParams2);
        }
        android.view.a.LIZ(linearLayout);
        if (linearLayout.getParent() == null) {
            constraintLayout.addView(linearLayout, c19me2);
        }
        TuxTextView tuxTextView3 = new TuxTextView(contextThemeWrapper);
        tuxTextView3.setId(R.id.saw);
        tuxTextView3.setMaxLines(1);
        TypedArray typedArrayObtainStyledAttributes4 = contextThemeWrapper.getTheme().obtainStyledAttributes(new int[]{R.attr.ee});
        tuxTextView3.setTextColor(typedArrayObtainStyledAttributes4.getColor(0, 0));
        typedArrayObtainStyledAttributes4.recycle();
        C786410Ut5.LJLLLLLL(8, tuxTextView3);
        C19ME c19me3 = new C19ME(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me3)) {
            i2 = 1;
            c19me3.setMarginEnd((int) TypedValue.applyDimension(1, 4.0f, resources2.getDisplayMetrics()));
        } else {
            i2 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me3)) {
            ((ViewGroup.MarginLayoutParams) c19me3).topMargin = (int) TypedValue.applyDimension(i2, f, resources2.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me3)) {
            ((ViewGroup.MarginLayoutParams) c19me3).bottomMargin = (int) TypedValue.applyDimension(i2, f, resources2.getDisplayMetrics());
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.endToStart = R.id.f812u71;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.horizontalBias = 0.0f;
        }
        if (C19ME.class.isInstance(c19me3)) {
            i3 = 0;
            c19me3.topToTop = 0;
        } else {
            i3 = 0;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.bottomToBottom = i3;
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P2_Semibold"), tuxTextView3);
        android.view.a.LIZ(tuxTextView3);
        if (tuxTextView3.getParent() == null) {
            constraintLayout.addView(tuxTextView3, c19me3);
        }
        TuxIconView tuxIconView2 = new TuxIconView(contextThemeWrapper);
        tuxIconView2.setId(R.id.f812u71);
        C19ME c19me4 = new C19ME((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me4)) {
            c19me4.setMarginEnd((int) TypedValue.applyDimension(1, 12.0f, resources2.getDisplayMetrics()));
        }
        new k();
        k.LIZ("app:tux_iconWidth", new a.d("16", "dp"), tuxIconView2);
        k.LIZ("app:tux_iconHeight", new a.d("16", "dp"), tuxIconView2);
        k.LIZ("app:tux_icon", new a.b("2130772916", "raw"), tuxIconView2);
        k.LIZ("app:tux_tintColor", new a.b("2131099769", "attr"), tuxIconView2);
        if (C19ME.class.isInstance(c19me4)) {
            i4 = 0;
            c19me4.endToEnd = 0;
        } else {
            i4 = 0;
        }
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.topToTop = i4;
        }
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.bottomToBottom = i4;
        }
        android.view.a.LIZ(tuxIconView2);
        if (tuxIconView2.getParent() == null) {
            constraintLayout.addView(tuxIconView2, c19me4);
        }
        android.view.a.LIZ(constraintLayout);
        C786410Ut5.W5(constraintLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(constraintLayout);
        }
        return constraintLayout;
    }
}
