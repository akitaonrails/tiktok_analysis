package com.by.andInflater;

import X.C16F5;
import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.zhiliaoapp.musically.R;
import dc.a;
import psf.f;

/* JADX INFO: loaded from: classes32.dex */
public class ttlive_widget_internet_speed_monitor implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setGravity(8388629);
        linearLayout.setOrientation(0);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, (int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()), viewGroup);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R.id.w1a);
        appCompatImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        appCompatImageView.setImageResource(R.drawable.es5);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        a.LIZ(appCompatImageView);
        if (appCompatImageView.getParent() == null) {
            linearLayout.addView(appCompatImageView, layoutParams);
        }
        C16F5 c16f5 = new C16F5(context, null);
        c16f5.setLinkTextColor(a.LIZJ(android.R.attr.textColorLink, context));
        c16f5.setHintTextColor(a.LIZIZ(android.R.attr.textColorHint, context));
        c16f5.setTextSize(0, resources.getDimension(R.dimen.b1g));
        c16f5.setHighlightColor(a.LIZIZ(android.R.attr.textColorHighlight, context));
        c16f5.setTextColor(a.LIZJ(android.R.attr.textColorPrimary, context));
        c16f5.setId(R.id.w25);
        c16f5.setIncludeFontPadding(false);
        c16f5.setShadowLayer(c16f5.getShadowRadius(), c16f5.getShadowDx(), c16f5.getShadowDy(), resources.getColor(R.color.a6w));
        c16f5.setShadowLayer(1.0f, c16f5.getShadowDx(), c16f5.getShadowDy(), c16f5.getShadowColor());
        c16f5.setText(2131843639);
        c16f5.setTextColor(resources.getColorStateList(R.color.a3o));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        new f();
        f.LIZ("app:fontType", new a.c("medium"), c16f5);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.setMarginStart((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.setMarginEnd((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        android.view.a.LIZ(c16f5);
        if (c16f5.getParent() == null) {
            linearLayout.addView(c16f5, layoutParams2);
        }
        android.view.a.LIZ(linearLayout);
        C786410Ut5.W5(linearLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(linearLayout);
        }
        return linearLayout;
    }
}
