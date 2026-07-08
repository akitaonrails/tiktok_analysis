package com.by.andInflater;

import X.C19ME;
import X.C424700Gl2;
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
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class common_feed_micro_app_card_view implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(R.id.oba);
        constraintLayout.setBackgroundResource(R.drawable.bbj);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ((int) TypedValue.applyDimension(1, 256.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 108.0f, resources.getDisplayMetrics()), viewGroup);
        C424700Gl2 c424700Gl2 = new C424700Gl2(context);
        c424700Gl2.setId(R.id.od0);
        C19ME c19me = new C19ME((int) TypedValue.applyDimension(1, 92.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 92.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me)) {
            c19me.setMarginStart((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me)) {
            ((ViewGroup.MarginLayoutParams) c19me).leftMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.bottomToBottom = 0;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.topToTop = 0;
        }
        jf8.a aVar = new jf8.a();
        aVar.LIZ.LIZLLL("app:placeholderImage", new a.b("2131230827", "color"), c424700Gl2);
        aVar.LIZ.LIZLLL("app:roundedCornerRadius", new a.d("2", "dp"), c424700Gl2);
        aVar.LIZ.LIZJ(c424700Gl2);
        android.view.a.LIZ(c424700Gl2);
        if (c424700Gl2.getParent() == null) {
            constraintLayout.addView(c424700Gl2, c19me);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.od1);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setMaxLines(2);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.ee});
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        C19ME c19me2 = new C19ME((int) TypedValue.applyDimension(1, 120.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me2)) {
            ((ViewGroup.MarginLayoutParams) c19me2).leftMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me2)) {
            c19me2.setMarginStart((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me2)) {
            ((ViewGroup.MarginLayoutParams) c19me2).topMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.startToEnd = R.id.od0;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.topToTop = 0;
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P1_Regular"), tuxTextView);
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            constraintLayout.addView(tuxTextView, c19me2);
        }
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R.id.ocy);
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER);
        appCompatImageView.setImageResource(R.drawable.bba);
        C19ME c19me3 = new C19ME((int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.startToEnd = R.id.od1;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.topToTop = 0;
        }
        android.view.a.LIZ(appCompatImageView);
        if (appCompatImageView.getParent() == null) {
            constraintLayout.addView(appCompatImageView, c19me3);
        }
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.ocx);
        tuxTextView2.setTextColor(resources.getColorStateList(R.color.di));
        C19ME c19me4 = new C19ME(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me4)) {
            c19me4.setMarginStart((int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me4)) {
            ((ViewGroup.MarginLayoutParams) c19me4).leftMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me4)) {
            ((ViewGroup.MarginLayoutParams) c19me4).bottomMargin = (int) TypedValue.applyDimension(1, 13.0f, resources.getDisplayMetrics());
        }
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.bottomToBottom = 0;
        }
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.startToEnd = R.id.od0;
        }
        new o();
        o.LIZ("app:tux_font", new a.c("SmallText1_Regular"), tuxTextView2);
        android.view.a.LIZ(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            constraintLayout.addView(tuxTextView2, c19me4);
        }
        TuxTextView tuxTextView3 = new TuxTextView(context);
        tuxTextView3.setId(R.id.ocz);
        tuxTextView3.setText(2131835114);
        TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.ee});
        tuxTextView3.setTextColor(typedArrayObtainStyledAttributes2.getColor(0, 0));
        typedArrayObtainStyledAttributes2.recycle();
        C19ME c19me5 = new C19ME(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me5)) {
            ((ViewGroup.MarginLayoutParams) c19me5).bottomMargin = (int) TypedValue.applyDimension(1, 13.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me5)) {
            c19me5.setMarginEnd((int) TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me5)) {
            ((ViewGroup.MarginLayoutParams) c19me5).rightMargin = (int) TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics());
        }
        if (C19ME.class.isInstance(c19me5)) {
            c19me5.bottomToBottom = 0;
        }
        if (C19ME.class.isInstance(c19me5)) {
            c19me5.endToEnd = 0;
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P3_Regular"), tuxTextView3);
        android.view.a.LIZ(tuxTextView3);
        if (tuxTextView3.getParent() == null) {
            constraintLayout.addView(tuxTextView3, c19me5);
        }
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context);
        appCompatImageView2.setImageResource(R.drawable.bb_);
        C19ME c19me6 = new C19ME(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me6)) {
            ((ViewGroup.MarginLayoutParams) c19me6).bottomMargin = (int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me6)) {
            c19me6.setMarginEnd((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me6)) {
            ((ViewGroup.MarginLayoutParams) c19me6).leftMargin = (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me6)) {
            ((ViewGroup.MarginLayoutParams) c19me6).rightMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me6)) {
            c19me6.setMarginStart((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        }
        if (C19ME.class.isInstance(c19me6)) {
            c19me6.bottomToBottom = 0;
        }
        if (C19ME.class.isInstance(c19me6)) {
            c19me6.endToEnd = 0;
        }
        if (C19ME.class.isInstance(c19me6)) {
            c19me6.leftToRight = R.id.ocz;
        }
        android.view.a.LIZ(appCompatImageView2);
        if (appCompatImageView2.getParent() == null) {
            constraintLayout.addView(appCompatImageView2, c19me6);
        }
        android.view.a.LIZ(constraintLayout);
        C786410Ut5.W5(constraintLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(constraintLayout);
        }
        return constraintLayout;
    }
}
