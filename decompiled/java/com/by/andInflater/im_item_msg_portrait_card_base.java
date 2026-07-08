package com.by.andInflater;

import X.C19ME;
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
import android.widget.LinearLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.views.RoundingCornerLayoutCL;
import com.zhiliaoapp.musically.R;
import dc.a;
import jf8.c;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class im_item_msg_portrait_card_base implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        float f;
        Resources resources = context.getResources();
        RoundingCornerLayoutCL roundingCornerLayoutCL = new RoundingCornerLayoutCL(context);
        roundingCornerLayoutCL.setId(R.id.evm);
        roundingCornerLayoutCL.setPadding(roundingCornerLayoutCL.getPaddingLeft(), roundingCornerLayoutCL.getPaddingTop(), roundingCornerLayoutCL.getPaddingRight(), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -2, viewGroup);
        SmartImageView smartImageView = new SmartImageView(context);
        smartImageView.setId(R.id.kh5);
        ViewGroup.LayoutParams layoutParamsLJ = a.LJ((int) TypedValue.applyDimension(1, 260.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 260.0f, resources.getDisplayMetrics()), roundingCornerLayoutCL);
        if (C19ME.class.isInstance(layoutParamsLJ)) {
            ((C19ME) layoutParamsLJ).startToStart = 0;
        }
        if (C19ME.class.isInstance(layoutParamsLJ)) {
            ((C19ME) layoutParamsLJ).topToTop = 0;
        }
        c cVar = new c();
        cVar.LIZIZ("app:placeholderImage", new a.b("2131230735", "color"), smartImageView);
        cVar.LIZIZ("app:placeholderImageScaleType", new a.c("centerCrop"), smartImageView);
        cVar.LIZIZ("app:roundedCornerRadius", new a.d("8", "dp"), smartImageView);
        cVar.LIZ(smartImageView);
        android.view.a.LIZ(smartImageView);
        if (smartImageView.getParent() == null) {
            roundingCornerLayoutCL.addView(smartImageView, layoutParamsLJ);
        }
        View view = new View(context);
        view.setId(R.id.f751mcf);
        view.setBackgroundResource(R.drawable.c_g);
        ViewGroup.LayoutParams layoutParamsLJ2 = android.view.a.LJ(-1, (int) TypedValue.applyDimension(1, 50.0f, resources.getDisplayMetrics()), roundingCornerLayoutCL);
        if (C19ME.class.isInstance(layoutParamsLJ2)) {
            ((C19ME) layoutParamsLJ2).startToStart = 0;
        }
        if (C19ME.class.isInstance(layoutParamsLJ2)) {
            ((C19ME) layoutParamsLJ2).bottomToBottom = R.id.kh5;
        }
        android.view.a.LIZ(view);
        if (view.getParent() == null) {
            roundingCornerLayoutCL.addView(view, layoutParamsLJ2);
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.mh_);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ2 = android.view.a.LJ(-2, -2, roundingCornerLayoutCL);
        if (C19ME.class.isInstance(marginLayoutParamsLJ2)) {
            ((C19ME) marginLayoutParamsLJ2).startToStart = 0;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ2)) {
            ((C19ME) marginLayoutParamsLJ2).bottomToBottom = R.id.kh5;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            f = 12.0f;
            marginLayoutParamsLJ2.setMarginStart((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        } else {
            f = 12.0f;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            marginLayoutParamsLJ2.bottomMargin = (int) TypedValue.applyDimension(1, f, resources.getDisplayMetrics());
        }
        SmartImageView smartImageView2 = new SmartImageView(context);
        smartImageView2.setId(R.id.kg0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()));
        c cVar2 = new c();
        cVar2.LIZIZ("app:roundAsCircle", new a.c("true"), smartImageView2);
        cVar2.LIZIZ("app:placeholderImage", new a.b("2130972248", "drawable"), smartImageView2);
        cVar2.LIZ(smartImageView2);
        android.view.a.LIZ(smartImageView2);
        if (smartImageView2.getParent() == null) {
            linearLayout.addView(smartImageView2, layoutParams);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.zym);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.ee});
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.setMarginStart((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P2_Semibold"), tuxTextView);
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            linearLayout.addView(tuxTextView, layoutParams2);
        }
        android.view.a.LIZ(linearLayout);
        if (linearLayout.getParent() == null) {
            roundingCornerLayoutCL.addView(linearLayout, marginLayoutParamsLJ2);
        }
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.tv_title);
        tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView2.setMaxLines(2);
        TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1h});
        tuxTextView2.setTextColor(typedArrayObtainStyledAttributes2.getColor(0, 0));
        typedArrayObtainStyledAttributes2.recycle();
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ3 = android.view.a.LJ((int) TypedValue.applyDimension(1, 236.0f, resources.getDisplayMetrics()), -2, roundingCornerLayoutCL);
        new o();
        o.LIZ("android:layout_marginHorizontal", new a.d("12", "dp"), tuxTextView2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            marginLayoutParamsLJ3.topMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ3)) {
            ((C19ME) marginLayoutParamsLJ3).startToStart = 0;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ3)) {
            ((C19ME) marginLayoutParamsLJ3).topToBottom = R.id.kh5;
        }
        o.LIZ("app:tux_font", new a.c("H4_Regular"), tuxTextView2);
        android.view.a.LIZ(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            roundingCornerLayoutCL.addView(tuxTextView2, marginLayoutParamsLJ3);
        }
        TuxTextView tuxTextView3 = new TuxTextView(context);
        tuxTextView3.setId(R.id.zhs);
        tuxTextView3.setMaxLines(1);
        tuxTextView3.setEllipsize(TextUtils.TruncateAt.END);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ4 = android.view.a.LJ((int) TypedValue.applyDimension(1, 236.0f, resources.getDisplayMetrics()), -2, roundingCornerLayoutCL);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ4)) {
            marginLayoutParamsLJ4.topMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ4)) {
            ((C19ME) marginLayoutParamsLJ4).topToBottom = R.id.tv_title;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ4)) {
            ((C19ME) marginLayoutParamsLJ4).startToStart = 0;
        }
        new o();
        o.LIZ("android:layout_marginHorizontal", new a.d("12", "dp"), tuxTextView3);
        o.LIZ("app:tux_font", new a.c("H2_Semibold"), tuxTextView3);
        android.view.a.LIZ(tuxTextView3);
        if (tuxTextView3.getParent() == null) {
            roundingCornerLayoutCL.addView(tuxTextView3, marginLayoutParamsLJ4);
        }
        TuxTextView tuxTextView4 = new TuxTextView(context);
        tuxTextView4.setId(R.id.zpi);
        C786410Ut5.T4(tuxTextView4, 0.5f);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ5 = android.view.a.LJ((int) TypedValue.applyDimension(1, 236.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()), roundingCornerLayoutCL);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ5)) {
            marginLayoutParamsLJ5.topMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ5)) {
            ((C19ME) marginLayoutParamsLJ5).topToBottom = R.id.zhs;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ5)) {
            ((C19ME) marginLayoutParamsLJ5).startToStart = 0;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ5)) {
            marginLayoutParamsLJ5.setMarginStart((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P2_Regular"), tuxTextView4);
        android.view.a.LIZ(tuxTextView4);
        if (tuxTextView4.getParent() == null) {
            roundingCornerLayoutCL.addView(tuxTextView4, marginLayoutParamsLJ5);
        }
        android.view.a.LIZ(roundingCornerLayoutCL);
        C786410Ut5.W5(roundingCornerLayoutCL, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(roundingCornerLayoutCL);
        }
        return roundingCornerLayoutCL;
    }
}
