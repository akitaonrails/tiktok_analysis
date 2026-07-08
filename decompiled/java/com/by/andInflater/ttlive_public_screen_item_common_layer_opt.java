package com.by.andInflater;

import X.C0WZX;
import X.C16F9;
import X.C2204961BRm;
import X.C421320Gfa;
import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.bytedance.android.live.publicscreen.api.metrics.PSMetricsLinearLayout;
import com.zhiliaoapp.musically.R;
import dc.a;
import java.lang.reflect.Field;
import psf.c;
import psf.f;

/* JADX INFO: loaded from: classes32.dex */
public class ttlive_public_screen_item_common_layer_opt implements InterfaceC20742716Ev {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) throws Throwable {
        float f;
        Resources resources = context.getResources();
        PSMetricsLinearLayout pSMetricsLinearLayout = new PSMetricsLinearLayout(context, null, 6);
        pSMetricsLinearLayout.setId(R.id.m6p);
        pSMetricsLinearLayout.setOrientation(1);
        pSMetricsLinearLayout.setPadding(pSMetricsLinearLayout.getPaddingLeft(), (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()), pSMetricsLinearLayout.getPaddingRight(), (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()));
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -2, viewGroup);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.ems);
        linearLayout.setOrientation(0);
        linearLayout.setPadding((int) resources.getDimension(R.dimen.avm), linearLayout.getPaddingTop(), linearLayout.getPaddingRight(), linearLayout.getPaddingBottom());
        linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), (int) resources.getDimension(R.dimen.avm), linearLayout.getPaddingBottom());
        ViewGroup.LayoutParams layoutParamsLJ = a.LJ(-1, -2, pSMetricsLinearLayout);
        C421320Gfa c421320Gfa = new C421320Gfa(context);
        c421320Gfa.setId(R.id.k55);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) resources.getDimension(R.dimen.aqs), (int) resources.getDimension(R.dimen.aqs));
        c cVar = new c();
        cVar.LIZ.LIZLLL("app:failureImage", new a.b("2130975365", "drawable"), c421320Gfa);
        cVar.LIZ.LIZLLL("app:failureImageScaleType", new a.c("centerCrop"), c421320Gfa);
        cVar.LIZ.LIZLLL("app:placeholderImage", new a.b("2131108693", "attr"), c421320Gfa);
        cVar.LIZ.LIZLLL("app:roundAsCircle", new a.c("true"), c421320Gfa);
        cVar.LIZ.LIZJ(c421320Gfa);
        c421320Gfa.setPlaceholderImage(cVar.LIZ.LIZ);
        c421320Gfa.setPlaceholderImageScaleType(cVar.LIZ.LIZJ);
        android.view.a.LIZ(c421320Gfa);
        if (c421320Gfa.getParent() == null) {
            linearLayout.addView(c421320Gfa, layoutParams);
        }
        C16F9 c16f9 = new C16F9(context, null);
        c16f9.setLinkTextColor(android.view.a.LIZJ(android.R.attr.textColorLink, context));
        c16f9.setHintTextColor(android.view.a.LIZIZ(android.R.attr.textColorHint, context));
        if (Build.VERSION.SDK_INT <= 28) {
            Integer numValueOf = Integer.valueOf(android.view.a.LIZLLL(R.attr.ewx, context));
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            declaredField.set(c16f9, numValueOf);
        } else {
            C2204961BRm.a0(android.view.a.LJFF(TextView.class, Drawable.class), c16f9, new Object[]{context.getResources().getDrawable(android.view.a.LIZLLL(R.attr.ewx, context))}, new C0WZX("dzBzEgAjEcvSUX4vQx6FchA04S/u9RCI17P9riAlQQIm06ZEO6UmvM5oTeUILSrAPumOk01o/F6u2qgcvQ==", null));
        }
        c16f9.setTextSize(0, resources.getDimension(R.dimen.b1e));
        c16f9.setHighlightColor(android.view.a.LIZIZ(android.R.attr.textColorHighlight, context));
        c16f9.setTextColor(android.view.a.LIZJ(android.R.attr.textColorPrimary, context));
        c16f9.setId(R.id.text);
        c16f9.setGravity(8388627);
        c16f9.setEllipsize(TextUtils.TruncateAt.END);
        if (TextView.class.isInstance(c16f9)) {
            android.view.a.LJI((int) TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()), c16f9);
        } else {
            c16f9.setMinimumHeight((int) TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()));
        }
        c16f9.setTextAlignment(5);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.fxd});
        c16f9.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        c16f9.setTextDirection(2);
        c16f9.setTextIsSelectable(false);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        new f();
        f.LIZ("app:fontType", new a.c("medium"), c16f9);
        f.LIZ("app:lineHeight", new a.b("2131298593", "dimen"), c16f9);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams2)) {
            ((FrameLayout.LayoutParams) layoutParams2).gravity = 16;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams2)) {
            ((DrawerLayout$LayoutParams) layoutParams2).gravity = 16;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            f = 6.0f;
            layoutParams2.setMarginStart((int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()));
        } else {
            f = 6.0f;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = (int) TypedValue.applyDimension(1, f, resources.getDisplayMetrics());
        }
        android.view.a.LIZ(c16f9);
        if (c16f9.getParent() == null) {
            linearLayout.addView(c16f9, layoutParams2);
        }
        android.view.a.LIZ(linearLayout);
        if (linearLayout.getParent() == null) {
            pSMetricsLinearLayout.addView(linearLayout, layoutParamsLJ);
        }
        View frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.wmz);
        C786410Ut5.LJLLLLLL(8, frameLayout);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ2 = android.view.a.LJ(-1, -2, pSMetricsLinearLayout);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            marginLayoutParamsLJ2.topMargin = (int) TypedValue.applyDimension(1, f, resources.getDisplayMetrics());
        }
        android.view.a.LIZ(frameLayout);
        if (frameLayout.getParent() == null) {
            pSMetricsLinearLayout.addView(frameLayout, marginLayoutParamsLJ2);
        }
        android.view.a.LIZ(pSMetricsLinearLayout);
        C786410Ut5.W5(pSMetricsLinearLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(pSMetricsLinearLayout);
        }
        return pSMetricsLinearLayout;
    }
}
