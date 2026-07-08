package com.by.andInflater;

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
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.views.RoundingCornerLayoutLL;
import com.zhiliaoapp.musically.R;
import dc.a;
import jf8.c;
import xem.k;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class im_item_msg_share_simple implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        int i2;
        int i3;
        Resources resources = context.getResources();
        RoundingCornerLayoutLL roundingCornerLayoutLL = new RoundingCornerLayoutLL(context);
        roundingCornerLayoutLL.setId(R.id.evm);
        roundingCornerLayoutLL.setOrientation(1);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ((int) resources.getDimension(R.dimen.a0p), -2, viewGroup);
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        ViewGroup.LayoutParams layoutParamsLJ = a.LJ(-1, -2, roundingCornerLayoutLL);
        SmartImageView smartImageView = new SmartImageView(context);
        smartImageView.setId(R.id.k1_);
        C19ME c19me = new C19ME((int) resources.getDimension(R.dimen.a0r), (int) resources.getDimension(R.dimen.a0r));
        if (C19ME.class.isInstance(c19me)) {
            c19me.bottomToBottom = 0;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.topToTop = 0;
        }
        c cVar = new c();
        cVar.LIZIZ("fresco:placeholderImage", new a.b("2130972297", "drawable"), smartImageView);
        cVar.LIZ(smartImageView);
        android.view.a.LIZ(smartImageView);
        if (smartImageView.getParent() == null) {
            constraintLayout.addView(smartImageView, c19me);
        }
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setId(R.id.k4y);
        C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        C19ME c19me2 = new C19ME((int) resources.getDimension(R.dimen.a0r), (int) resources.getDimension(R.dimen.a0r));
        new k();
        k.LIZ("app:tux_iconHeight", new a.d("24", "dp"), tuxIconView);
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.bottomToBottom = 0;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.topToTop = 0;
        }
        k.LIZ("app:tux_iconWidth", new a.d("24", "dp"), tuxIconView);
        android.view.a.LIZ(tuxIconView);
        if (tuxIconView.getParent() == null) {
            constraintLayout.addView(tuxIconView, c19me2);
        }
        TuxIconView tuxIconView2 = new TuxIconView(context);
        tuxIconView2.setId(R.id.k50);
        C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
        C19ME c19me3 = new C19ME((int) resources.getDimension(R.dimen.a0r), (int) resources.getDimension(R.dimen.a0r));
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.bottomToBottom = 0;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.endToEnd = R.id.dga;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.topToTop = 0;
        }
        new k();
        k.LIZ("app:tux_icon", new a.b("2130774080", "raw"), tuxIconView2);
        k.LIZ("app:tux_iconHeight", new a.d("45.6", "dp"), tuxIconView2);
        k.LIZ("app:tux_iconWidth", new a.d("45.6", "dp"), tuxIconView2);
        k.LIZ("app:tux_tintColor", new a.b("2131099768", "attr"), tuxIconView2);
        android.view.a.LIZ(tuxIconView2);
        if (tuxIconView2.getParent() == null) {
            constraintLayout.addView(tuxIconView2, c19me3);
        }
        View view = new View(context);
        view.setId(R.id.dga);
        C19ME c19me4 = new C19ME((int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        if (C19ME.class.isInstance(c19me4)) {
            i = 0;
            c19me4.topToTop = 0;
        } else {
            i = 0;
        }
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.bottomToBottom = i;
        }
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.endToStart = R.id.kbs;
        }
        android.view.a.LIZ(view);
        if (view.getParent() == null) {
            constraintLayout.addView(view, c19me4);
        }
        C19MW c19mw = new C19MW(context);
        c19mw.setId(R.id.kbs);
        C19ME c19me5 = new C19ME(-2, -2);
        new ule.a();
        ule.a.LIZ(new a.c("end"), c19mw);
        c19mw.setReferencedIds(new int[]{R.id.k1_, R.id.k4y, R.id.k50});
        android.view.a.LIZ(c19mw);
        if (c19mw.getParent() == null) {
            constraintLayout.addView(c19mw, c19me5);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.y3j);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setGravity(8388627);
        tuxTextView.setMaxLines(2);
        tuxTextView.setTextAlignment(5);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1h});
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        C19ME c19me6 = new C19ME((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me6)) {
            c19me6.setMarginStart((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me6)) {
            c19me6.setMarginEnd((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        if (C19ME.class.isInstance(c19me6)) {
            c19me6.bottomToTop = R.id.foa;
        }
        if (C19ME.class.isInstance(c19me6)) {
            c19me6.endToEnd = 0;
        }
        if (C19ME.class.isInstance(c19me6)) {
            c19me6.startToEnd = R.id.kbs;
        }
        if (C19ME.class.isInstance(c19me6)) {
            c19me6.topToTop = 0;
        }
        if (C19ME.class.isInstance(c19me6)) {
            c19me6.verticalChainStyle = 2;
        }
        new o();
        o.LIZ("app:tux_font", new a.c("H4_Semibold"), tuxTextView);
        tuxTextView.setLineSpacing(0.0f, 1.0f);
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            constraintLayout.addView(tuxTextView, c19me6);
        }
        TuxIconView tuxIconView3 = new TuxIconView(context);
        tuxIconView3.setId(R.id.k4z);
        C786410Ut5.LLLLLLZZ(tuxIconView3, 8);
        C19ME c19me7 = new C19ME((int) TypedValue.applyDimension(1, 12.83f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 12.83f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me7)) {
            ((ViewGroup.MarginLayoutParams) c19me7).topMargin = (int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me7)) {
            c19me7.setMarginEnd((int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()));
        }
        if (C19ME.class.isInstance(c19me7)) {
            c19me7.endToStart = R.id.foa;
        }
        if (C19ME.class.isInstance(c19me7)) {
            i2 = R.id.y3j;
            c19me7.startToStart = R.id.y3j;
        } else {
            i2 = R.id.y3j;
        }
        if (C19ME.class.isInstance(c19me7)) {
            c19me7.topToBottom = i2;
        }
        new k();
        k.LIZ("app:tux_icon", new a.b("2130773677", "raw"), tuxIconView3);
        k.LIZ("app:tux_tintColor", new a.b("2131100625", "attr"), tuxIconView3);
        android.view.a.LIZ(tuxIconView3);
        if (tuxIconView3.getParent() == null) {
            constraintLayout.addView(tuxIconView3, c19me7);
        }
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.foa);
        tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView2.setGravity(8388627);
        tuxTextView2.setMaxLines(2);
        tuxTextView2.setTextAlignment(5);
        TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1k});
        tuxTextView2.setTextColor(typedArrayObtainStyledAttributes2.getColor(0, 0));
        typedArrayObtainStyledAttributes2.recycle();
        C786410Ut5.LJLLLLLL(8, tuxTextView2);
        C19ME c19me8 = new C19ME((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me8)) {
            ((ViewGroup.MarginLayoutParams) c19me8).topMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me8)) {
            c19me8.setMarginEnd((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        if (C19ME.class.isInstance(c19me8)) {
            i3 = 0;
            c19me8.bottomToBottom = 0;
        } else {
            i3 = 0;
        }
        if (C19ME.class.isInstance(c19me8)) {
            c19me8.endToEnd = i3;
        }
        if (C19ME.class.isInstance(c19me8)) {
            c19me8.startToEnd = R.id.k4z;
        }
        if (C19ME.class.isInstance(c19me8)) {
            c19me8.topToBottom = R.id.y3j;
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P2_Regular"), tuxTextView2);
        android.view.a.LIZ(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            constraintLayout.addView(tuxTextView2, c19me8);
        }
        android.view.a.LIZ(constraintLayout);
        if (constraintLayout.getParent() == null) {
            roundingCornerLayoutLL.addView(constraintLayout, layoutParamsLJ);
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.cce);
        linearLayout.setOrientation(1);
        C786410Ut5.LJLLLLLL(8, linearLayout);
        ViewGroup.LayoutParams layoutParamsLJ2 = android.view.a.LJ(-1, -2, roundingCornerLayoutLL);
        View view2 = new View(context);
        view2.setId(R.id.dg4);
        TypedArray typedArrayObtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a03});
        view2.setBackgroundColor(typedArrayObtainStyledAttributes3.getColor(0, 0));
        typedArrayObtainStyledAttributes3.recycle();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()));
        android.view.a.LIZ(view2);
        if (view2.getParent() == null) {
            linearLayout.addView(view2, layoutParams);
        }
        TuxTextView tuxTextView3 = new TuxTextView(context);
        tuxTextView3.setId(R.id.x2g);
        TypedArray typedArrayObtainStyledAttributes4 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1k});
        tuxTextView3.setTextColor(typedArrayObtainStyledAttributes4.getColor(0, 0));
        typedArrayObtainStyledAttributes4.recycle();
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.setMarginStart((int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = (int) TypedValue.applyDimension(1, 2.5f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = (int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics());
        }
        new o();
        o.LIZ("app:tux_font", new a.c("SmallText2_Regular"), tuxTextView3);
        android.view.a.LIZ(tuxTextView3);
        if (tuxTextView3.getParent() == null) {
            linearLayout.addView(tuxTextView3, layoutParams2);
        }
        android.view.a.LIZ(linearLayout);
        if (linearLayout.getParent() == null) {
            roundingCornerLayoutLL.addView(linearLayout, layoutParamsLJ2);
        }
        android.view.a.LIZ(roundingCornerLayoutLL);
        C786410Ut5.W5(roundingCornerLayoutLL, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(roundingCornerLayoutLL);
        }
        return roundingCornerLayoutLL;
    }
}
