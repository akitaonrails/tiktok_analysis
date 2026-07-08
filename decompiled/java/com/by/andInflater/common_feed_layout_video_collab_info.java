package com.by.andInflater;

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
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class common_feed_layout_video_collab_info implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        int i2;
        context.getResources();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, R.style.xz);
        Resources resources = contextThemeWrapper.getResources();
        LinearLayout linearLayout = new LinearLayout(contextThemeWrapper);
        linearLayout.setId(R.id.hsw);
        linearLayout.setOrientation(0);
        linearLayout.setBaselineAligned(true);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -1, viewGroup);
        TuxTextView tuxTextView = new TuxTextView(contextThemeWrapper);
        tuxTextView.setId(R.id.hsx);
        tuxTextView.setMaxLines(1);
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.getTheme().obtainStyledAttributes(new int[]{R.attr.ee});
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        tuxTextView.setSingleLine(true);
        C786410Ut5.LJLLLLLL(8, tuxTextView);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        new o();
        o.LIZ("app:tux_font", new a.c("P3_Regular"), tuxTextView);
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            linearLayout.addView(tuxTextView, layoutParams);
        }
        LinearLayout linearLayout2 = new LinearLayout(contextThemeWrapper);
        linearLayout2.setId(R.id.hsn);
        C786410Ut5.LJLLLLLL(8, linearLayout2);
        ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        TuxTextView tuxTextView2 = new TuxTextView(contextThemeWrapper);
        tuxTextView2.setId(R.id.hsr);
        tuxTextView2.setMaxLines(1);
        TypedArray typedArrayObtainStyledAttributes2 = contextThemeWrapper.getTheme().obtainStyledAttributes(new int[]{R.attr.a1j});
        tuxTextView2.setTextColor(typedArrayObtainStyledAttributes2.getColor(0, 0));
        typedArrayObtainStyledAttributes2.recycle();
        tuxTextView2.setSingleLine(true);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.setMarginEnd((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P3_Regular"), tuxTextView2);
        android.view.a.LIZ(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            linearLayout2.addView(tuxTextView2, layoutParams3);
        }
        TuxIconView tuxIconView = new TuxIconView(contextThemeWrapper);
        tuxIconView.setId(R.id.hso);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin = (int) TypedValue.applyDimension(1, -1.0f, resources.getDisplayMetrics());
        }
        android.view.a.LIZ(tuxIconView);
        if (tuxIconView.getParent() == null) {
            linearLayout2.addView(tuxIconView, layoutParams4);
        }
        TuxTextView tuxTextView3 = new TuxTextView(contextThemeWrapper);
        tuxTextView3.setId(R.id.hsu);
        tuxTextView3.setMaxLines(1);
        TypedArray typedArrayObtainStyledAttributes3 = contextThemeWrapper.getTheme().obtainStyledAttributes(new int[]{R.attr.ee});
        tuxTextView3.setTextColor(typedArrayObtainStyledAttributes3.getColor(0, 0));
        typedArrayObtainStyledAttributes3.recycle();
        tuxTextView3.setSingleLine(true);
        tuxTextView3.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView3.setShadowLayer(tuxTextView3.getShadowRadius(), tuxTextView3.getShadowDx(), tuxTextView3.getShadowDy(), android.view.a.LIZIZ(R.attr.zb, contextThemeWrapper));
        tuxTextView3.setShadowLayer(tuxTextView3.getShadowRadius(), tuxTextView3.getShadowDx(), 1.0f, tuxTextView3.getShadowColor());
        tuxTextView3.setShadowLayer(1.0f, tuxTextView3.getShadowDx(), tuxTextView3.getShadowDy(), tuxTextView3.getShadowColor());
        C786410Ut5.LJLLLLLL(8, tuxTextView3);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        new o();
        o.LIZ("app:tux_font", new a.c("P3_Semibold"), tuxTextView3);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            i = 1;
            layoutParams5.setMarginStart((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        } else {
            i = 1;
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.weight = i;
        }
        android.view.a.LIZ(tuxTextView3);
        if (tuxTextView3.getParent() == null) {
            linearLayout2.addView(tuxTextView3, layoutParams5);
        }
        TuxTextView tuxTextView4 = new TuxTextView(contextThemeWrapper);
        tuxTextView4.setId(R.id.hss);
        tuxTextView4.setMaxLines(1);
        TypedArray typedArrayObtainStyledAttributes4 = contextThemeWrapper.getTheme().obtainStyledAttributes(new int[]{R.attr.a1j});
        tuxTextView4.setTextColor(typedArrayObtainStyledAttributes4.getColor(0, 0));
        typedArrayObtainStyledAttributes4.recycle();
        tuxTextView4.setSingleLine(true);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        new o();
        o.LIZ("app:tux_font", new a.c("P3_Regular"), tuxTextView4);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.setMarginStart((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        android.view.a.LIZ(tuxTextView4);
        if (tuxTextView4.getParent() == null) {
            linearLayout2.addView(tuxTextView4, layoutParams6);
        }
        TuxTextView tuxTextView5 = new TuxTextView(contextThemeWrapper);
        tuxTextView5.setId(R.id.hsq);
        tuxTextView5.setText(2131828911);
        tuxTextView5.setMaxLines(1);
        TypedArray typedArrayObtainStyledAttributes5 = contextThemeWrapper.getTheme().obtainStyledAttributes(new int[]{R.attr.a1j});
        tuxTextView5.setTextColor(typedArrayObtainStyledAttributes5.getColor(0, 0));
        typedArrayObtainStyledAttributes5.recycle();
        tuxTextView5.setSingleLine(true);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams7)) {
            layoutParams7.setMarginStart((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P3_Regular"), tuxTextView5);
        android.view.a.LIZ(tuxTextView5);
        if (tuxTextView5.getParent() == null) {
            linearLayout2.addView(tuxTextView5, layoutParams7);
        }
        TuxIconView tuxIconView2 = new TuxIconView(contextThemeWrapper);
        tuxIconView2.setId(R.id.hsp);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams8)) {
            i2 = 1;
            layoutParams8.setMarginStart((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        } else {
            i2 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams8)) {
            ((ViewGroup.MarginLayoutParams) layoutParams8).topMargin = (int) TypedValue.applyDimension(i2, -1.0f, resources.getDisplayMetrics());
        }
        android.view.a.LIZ(tuxIconView2);
        if (tuxIconView2.getParent() == null) {
            linearLayout2.addView(tuxIconView2, layoutParams8);
        }
        TuxTextView tuxTextView6 = new TuxTextView(contextThemeWrapper);
        tuxTextView6.setId(R.id.hsv);
        tuxTextView6.setMaxLines(i2);
        int[] iArr = new int[i2];
        iArr[0] = R.attr.ee;
        TypedArray typedArrayObtainStyledAttributes6 = contextThemeWrapper.getTheme().obtainStyledAttributes(iArr);
        tuxTextView6.setTextColor(typedArrayObtainStyledAttributes6.getColor(0, 0));
        typedArrayObtainStyledAttributes6.recycle();
        tuxTextView6.setSingleLine(true);
        tuxTextView6.setShadowLayer(tuxTextView6.getShadowRadius(), tuxTextView6.getShadowDx(), tuxTextView6.getShadowDy(), android.view.a.LIZIZ(R.attr.zb, contextThemeWrapper));
        tuxTextView6.setShadowLayer(tuxTextView6.getShadowRadius(), tuxTextView6.getShadowDx(), 1.0f, tuxTextView6.getShadowColor());
        tuxTextView6.setShadowLayer(1.0f, tuxTextView6.getShadowDx(), tuxTextView6.getShadowDy(), tuxTextView6.getShadowColor());
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-2, -2);
        new o();
        o.LIZ("app:tux_font", new a.c("P3_Semibold"), tuxTextView6);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams9)) {
            layoutParams9.setMarginStart((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        android.view.a.LIZ(tuxTextView6);
        if (tuxTextView6.getParent() == null) {
            linearLayout2.addView(tuxTextView6, layoutParams9);
        }
        TuxTextView tuxTextView7 = new TuxTextView(contextThemeWrapper);
        tuxTextView7.setId(R.id.hst);
        tuxTextView7.setMaxLines(1);
        TypedArray typedArrayObtainStyledAttributes7 = contextThemeWrapper.getTheme().obtainStyledAttributes(new int[]{R.attr.a1j});
        tuxTextView7.setTextColor(typedArrayObtainStyledAttributes7.getColor(0, 0));
        typedArrayObtainStyledAttributes7.recycle();
        tuxTextView7.setSingleLine(true);
        LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(-2, -2);
        new o();
        o.LIZ("app:tux_font", new a.c("P3_Regular"), tuxTextView7);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams10)) {
            layoutParams10.setMarginStart((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        android.view.a.LIZ(tuxTextView7);
        if (tuxTextView7.getParent() == null) {
            linearLayout2.addView(tuxTextView7, layoutParams10);
        }
        android.view.a.LIZ(linearLayout2);
        if (linearLayout2.getParent() == null) {
            linearLayout.addView(linearLayout2, layoutParams2);
        }
        android.view.a.LIZ(linearLayout);
        C786410Ut5.W5(linearLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(linearLayout);
        }
        return linearLayout;
    }
}
