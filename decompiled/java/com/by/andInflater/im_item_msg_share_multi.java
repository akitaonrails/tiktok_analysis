package com.by.andInflater;

import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.views.RoundingCornerLayoutLL;
import com.zhiliaoapp.musically.R;
import dc.a;
import jf8.c;
import xem.k;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class im_item_msg_share_multi implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        float f;
        Resources resources = context.getResources();
        RoundingCornerLayoutLL roundingCornerLayoutLL = new RoundingCornerLayoutLL(context);
        roundingCornerLayoutLL.setId(R.id.evm);
        roundingCornerLayoutLL.setOrientation(1);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ((int) resources.getDimension(R.dimen.a0p), -2, viewGroup);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setPadding((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        ViewGroup.LayoutParams layoutParamsLJ = a.LJ(-1, -2, roundingCornerLayoutLL);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.jzp);
        linearLayout.setOrientation(0);
        ViewGroup.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) resources.getDimension(R.dimen.a0q), (int) resources.getDimension(R.dimen.a0q));
        RemoteImageView remoteImageView = new RemoteImageView(context);
        remoteImageView.setId(R.id.k1_);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams((int) resources.getDimension(R.dimen.a0q), (int) resources.getDimension(R.dimen.a0q));
        bc.a aVar = new bc.a();
        aVar.LIZLLL("fresco:roundAsCircle", new a.c("true"), remoteImageView);
        aVar.LIZJ(remoteImageView);
        android.view.a.LIZ(remoteImageView);
        if (remoteImageView.getParent() == null) {
            linearLayout.addView(remoteImageView, layoutParams2);
        }
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setId(R.id.k4y);
        C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams((int) resources.getDimension(R.dimen.a0q), (int) resources.getDimension(R.dimen.a0q));
        new k();
        k.LIZ("app:tux_iconHeight", new a.d("24", "dp"), tuxIconView);
        k.LIZ("app:tux_iconWidth", new a.d("24", "dp"), tuxIconView);
        android.view.a.LIZ(tuxIconView);
        if (tuxIconView.getParent() == null) {
            linearLayout.addView(tuxIconView, layoutParams3);
        }
        android.view.a.LIZ(linearLayout);
        if (linearLayout.getParent() == null) {
            relativeLayout.addView(linearLayout, layoutParams);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.ifn);
        tuxTextView.setCompoundDrawablePadding((int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()));
        tuxTextView.setGravity(16);
        tuxTextView.setText(R.string.jp2);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a04});
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        tuxTextView.setTextSize(1, 15.0f);
        C786410Ut5.LJLLLLLL(8, tuxTextView);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams4)) {
            i = -1;
            layoutParams4.addRule(21, -1);
        } else {
            i = -1;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.addRule(15, i);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.setMarginStart((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        new o();
        o.LIZ("app:tux_font", new a.c("H4_Semibold"), tuxTextView);
        tuxTextView.setCompoundDrawablesWithIntrinsicBounds(context.getResources().getDrawable(R.drawable.cbc), (Drawable) null, (Drawable) null, (Drawable) null);
        tuxTextView.setLineSpacing(TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), 1.0f);
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            relativeLayout.addView(tuxTextView, layoutParams4);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.addRule(15, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.setMarginStart((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.addRule(16, R.id.ifn);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.addRule(17, R.id.jzp);
        }
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.y3j);
        tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView2.setGravity(8388627);
        tuxTextView2.setMaxLines(1);
        tuxTextView2.setTextAlignment(5);
        TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1h});
        tuxTextView2.setTextColor(typedArrayObtainStyledAttributes2.getColor(0, 0));
        typedArrayObtainStyledAttributes2.recycle();
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
        new o();
        o.LIZ("app:tux_font", new a.c("H4_Semibold"), tuxTextView2);
        tuxTextView2.setLineSpacing(TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), 1.0f);
        android.view.a.LIZ(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            linearLayout2.addView(tuxTextView2, layoutParams6);
        }
        TuxTextView tuxTextView3 = new TuxTextView(context);
        tuxTextView3.setId(R.id.foa);
        tuxTextView3.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView3.setGravity(8388627);
        tuxTextView3.setMaxLines(1);
        tuxTextView3.setTextAlignment(5);
        TypedArray typedArrayObtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1k});
        tuxTextView3.setTextColor(typedArrayObtainStyledAttributes3.getColor(0, 0));
        typedArrayObtainStyledAttributes3.recycle();
        tuxTextView3.setTextSize(1, 13.0f);
        C786410Ut5.LJLLLLLL(8, tuxTextView3);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, -2);
        new o();
        o.LIZ("app:tux_font", new a.c("P2_Regular"), tuxTextView3);
        tuxTextView3.setLineSpacing(TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), 1.0f);
        android.view.a.LIZ(tuxTextView3);
        if (tuxTextView3.getParent() == null) {
            linearLayout2.addView(tuxTextView3, layoutParams7);
        }
        android.view.a.LIZ(linearLayout2);
        if (linearLayout2.getParent() == null) {
            relativeLayout.addView(linearLayout2, layoutParams5);
        }
        android.view.a.LIZ(relativeLayout);
        if (relativeLayout.getParent() == null) {
            roundingCornerLayoutLL.addView(relativeLayout, layoutParamsLJ);
        }
        RoundingCornerLayoutLL roundingCornerLayoutLL2 = new RoundingCornerLayoutLL(context);
        roundingCornerLayoutLL2.setId(R.id.kgc);
        roundingCornerLayoutLL2.setOrientation(0);
        ViewGroup.LayoutParams layoutParamsLJ2 = android.view.a.LJ(-1, (int) TypedValue.applyDimension(1, 118.0f, resources.getDisplayMetrics()), roundingCornerLayoutLL);
        SmartImageView smartImageView = new SmartImageView(context);
        smartImageView.setId(R.id.kfv);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ2 = android.view.a.LJ((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -1, roundingCornerLayoutLL2);
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ2).weight = 1;
        }
        c cVar = new c();
        cVar.LIZIZ("fresco:actualImageScaleType", new a.c("centerCrop"), smartImageView);
        cVar.LIZIZ("fresco:placeholderImage", new a.b("2130972295", "drawable"), smartImageView);
        cVar.LIZIZ("fresco:roundBottomLeft", new a.c("true"), smartImageView);
        cVar.LIZIZ("fresco:roundBottomRight", new a.c("false"), smartImageView);
        cVar.LIZIZ("fresco:roundTopLeft", new a.c("false"), smartImageView);
        cVar.LIZIZ("fresco:roundTopRight", new a.c("false"), smartImageView);
        cVar.LIZIZ("fresco:roundedCornerRadius", new a.d("8", "dp"), smartImageView);
        cVar.LIZ(smartImageView);
        android.view.a.LIZ(smartImageView);
        if (smartImageView.getParent() == null) {
            roundingCornerLayoutLL2.addView(smartImageView, marginLayoutParamsLJ2);
        }
        SmartImageView smartImageView2 = new SmartImageView(context);
        smartImageView2.setId(R.id.kfw);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ3 = android.view.a.LJ((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -1, roundingCornerLayoutLL2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            f = 1.0f;
            marginLayoutParamsLJ3.setMarginStart((int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()));
        } else {
            f = 1.0f;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            marginLayoutParamsLJ3.leftMargin = (int) TypedValue.applyDimension(1, f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            marginLayoutParamsLJ3.setMarginEnd((int) TypedValue.applyDimension(1, f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            marginLayoutParamsLJ3.rightMargin = (int) TypedValue.applyDimension(1, f, resources.getDisplayMetrics());
        }
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ3).weight = 1;
        }
        c cVar2 = new c();
        cVar2.LIZIZ("fresco:actualImageScaleType", new a.c("centerCrop"), smartImageView2);
        cVar2.LIZIZ("fresco:placeholderImage", new a.b("2130972294", "drawable"), smartImageView2);
        cVar2.LIZ(smartImageView2);
        android.view.a.LIZ(smartImageView2);
        if (smartImageView2.getParent() == null) {
            roundingCornerLayoutLL2.addView(smartImageView2, marginLayoutParamsLJ3);
        }
        SmartImageView smartImageView3 = new SmartImageView(context);
        smartImageView3.setId(R.id.kfx);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ4 = android.view.a.LJ((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -1, roundingCornerLayoutLL2);
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ4)) {
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ4).weight = 1;
        }
        c cVar3 = new c();
        cVar3.LIZIZ("fresco:actualImageScaleType", new a.c("centerCrop"), smartImageView3);
        cVar3.LIZIZ("fresco:placeholderImage", new a.b("2130972296", "drawable"), smartImageView3);
        cVar3.LIZIZ("fresco:roundBottomLeft", new a.c("false"), smartImageView3);
        cVar3.LIZIZ("fresco:roundBottomRight", new a.c("true"), smartImageView3);
        cVar3.LIZIZ("fresco:roundTopLeft", new a.c("false"), smartImageView3);
        cVar3.LIZIZ("fresco:roundTopRight", new a.c("false"), smartImageView3);
        cVar3.LIZIZ("fresco:roundedCornerRadius", new a.d("8", "dp"), smartImageView3);
        cVar3.LIZ(smartImageView3);
        android.view.a.LIZ(smartImageView3);
        if (smartImageView3.getParent() == null) {
            roundingCornerLayoutLL2.addView(smartImageView3, marginLayoutParamsLJ4);
        }
        android.view.a.LIZ(roundingCornerLayoutLL2);
        if (roundingCornerLayoutLL2.getParent() == null) {
            roundingCornerLayoutLL.addView(roundingCornerLayoutLL2, layoutParamsLJ2);
        }
        android.view.a.LIZ(roundingCornerLayoutLL);
        C786410Ut5.W5(roundingCornerLayoutLL, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(roundingCornerLayoutLL);
        }
        return roundingCornerLayoutLL;
    }
}
