package com.by.andInflater;

import X.C16FP;
import X.C20742916Ex;
import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.widget.RadiusLayout;
import com.zhiliaoapp.musically.R;
import dc.a;
import jf8.c;
import xem.k;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class friends_tab_v3_single_photo implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        float f;
        int i2;
        int i3;
        int i4;
        float f2;
        Resources resources = context.getResources();
        RadiusLayout radiusLayout = new RadiusLayout(context);
        radiusLayout.setId(R.id.qe8);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-2, -2, viewGroup);
        SmartImageView smartImageView = new SmartImageView(context);
        smartImageView.setId(R.id.vmb);
        smartImageView.setPadding((int) TypedValue.applyDimension(1, 0.5f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.5f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.5f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.5f, resources.getDisplayMetrics()));
        ViewGroup.LayoutParams layoutParamsLJ = a.LJ((int) TypedValue.applyDimension(1, 200.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 200.0f, resources.getDisplayMetrics()), radiusLayout);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParamsLJ)) {
            ((LinearLayout.LayoutParams) layoutParamsLJ).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParamsLJ)) {
            ((FrameLayout.LayoutParams) layoutParamsLJ).gravity = 17;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParamsLJ)) {
            ((DrawerLayout$LayoutParams) layoutParamsLJ).gravity = 17;
        }
        c cVar = new c();
        cVar.LIZIZ("app:roundedCornerRadius", new a.b("null", "dimen"), smartImageView);
        cVar.LIZ(smartImageView);
        android.view.a.LIZ(smartImageView);
        if (smartImageView.getParent() == null) {
            radiusLayout.addView(smartImageView, layoutParamsLJ);
        }
        View c16fp = new C16FP(context, null, 6);
        c16fp.setId(R.id.qds);
        ViewGroup.LayoutParams layoutParamsLJ2 = android.view.a.LJ(-1, -1, radiusLayout);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParamsLJ2)) {
            ((LinearLayout.LayoutParams) layoutParamsLJ2).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParamsLJ2)) {
            ((FrameLayout.LayoutParams) layoutParamsLJ2).gravity = 17;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParamsLJ2)) {
            ((DrawerLayout$LayoutParams) layoutParamsLJ2).gravity = 17;
        }
        android.view.a.LIZ(c16fp);
        if (c16fp.getParent() == null) {
            radiusLayout.addView(c16fp, layoutParamsLJ2);
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, R.style.z4);
        Resources resources2 = contextThemeWrapper.getResources();
        RadiusLayout radiusLayout2 = new RadiusLayout(contextThemeWrapper);
        radiusLayout2.setId(R.id.ke_);
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.getTheme().obtainStyledAttributes(new int[]{R.attr.ze});
        radiusLayout2.setBackgroundColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        radiusLayout2.setPadding((int) resources2.getDimension(R.dimen.t2), radiusLayout2.getPaddingTop(), radiusLayout2.getPaddingRight(), radiusLayout2.getPaddingBottom());
        radiusLayout2.setPadding(radiusLayout2.getPaddingLeft(), radiusLayout2.getPaddingTop(), (int) resources2.getDimension(R.dimen.t2), radiusLayout2.getPaddingBottom());
        C786410Ut5.LJLLLLLL(8, radiusLayout2);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ2 = android.view.a.LJ(-2, -2, radiusLayout);
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ2).gravity = 8388661;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ2).gravity = 8388661;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ2).gravity = 8388661;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            marginLayoutParamsLJ2.topMargin = (int) TypedValue.applyDimension(1, 8.0f, resources2.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            marginLayoutParamsLJ2.setMarginEnd((int) TypedValue.applyDimension(1, 8.0f, resources2.getDisplayMetrics()));
        }
        RelativeLayout relativeLayout = new RelativeLayout(contextThemeWrapper);
        ViewGroup.LayoutParams layoutParamsLJ3 = android.view.a.LJ(-2, (int) resources.getDimension(R.dimen.sl), radiusLayout2);
        TuxIconView tuxIconView = new TuxIconView(contextThemeWrapper);
        tuxIconView.setId(R.id.ke9);
        tuxIconView.setImportantForAccessibility(2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.addRule(20, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.addRule(15, -1);
        }
        new k();
        k.LIZ("app:tux_icon", new a.b("2130773995", "raw"), tuxIconView);
        k.LIZ("app:tux_iconHeight", new a.d("12", "dp"), tuxIconView);
        k.LIZ("app:tux_iconWidth", new a.d("12", "dp"), tuxIconView);
        k.LIZ("app:tux_tintColor", new a.b("2131100567", "attr"), tuxIconView);
        android.view.a.LIZ(tuxIconView);
        if (tuxIconView.getParent() == null) {
            relativeLayout.addView(tuxIconView, layoutParams);
        }
        TuxTextView tuxTextView = new TuxTextView(contextThemeWrapper);
        tuxTextView.setId(R.id.kc8);
        tuxTextView.setMaxLines(1);
        TypedArray typedArrayObtainStyledAttributes2 = contextThemeWrapper.getTheme().obtainStyledAttributes(new int[]{R.attr.a1h});
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes2.getColor(0, 0));
        typedArrayObtainStyledAttributes2.recycle();
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.addRule(15, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.setMarginStart((int) resources2.getDimension(R.dimen.sv));
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.addRule(17, R.id.ke9);
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P3_Semibold"), tuxTextView);
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            relativeLayout.addView(tuxTextView, layoutParams2);
        }
        android.view.a.LIZ(relativeLayout);
        if (relativeLayout.getParent() == null) {
            radiusLayout2.addView(relativeLayout, layoutParamsLJ3);
        }
        android.view.a.LIZ(radiusLayout2);
        if (radiusLayout2.getParent() == null) {
            radiusLayout.addView(radiusLayout2, marginLayoutParamsLJ2);
        }
        TuxIconView tuxIconView2 = new TuxIconView(context);
        tuxIconView2.setId(R.id.n3c);
        tuxIconView2.setContentDescription("live photo icon");
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ3 = android.view.a.LJ((int) TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()), radiusLayout);
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            i = 8388661;
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ3).gravity = 8388661;
        } else {
            i = 8388661;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ3).gravity = i;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ3).gravity = i;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            f = 8.0f;
            i2 = 1;
            marginLayoutParamsLJ3.topMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        } else {
            f = 8.0f;
            i2 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            marginLayoutParamsLJ3.setMarginEnd((int) TypedValue.applyDimension(i2, f, resources.getDisplayMetrics()));
        }
        new k();
        k.LIZ("app:tux_icon", new a.b("2130774171", "raw"), tuxIconView2);
        k.LIZ("app:tux_iconHeight", new a.d("18", "dp"), tuxIconView2);
        k.LIZ("app:tux_iconWidth", new a.d("18", "dp"), tuxIconView2);
        k.LIZ("app:tux_tintColor", new a.b("2131100549", "attr"), tuxIconView2);
        android.view.a.LIZ(tuxIconView2);
        if (tuxIconView2.getParent() == null) {
            radiusLayout.addView(tuxIconView2, marginLayoutParamsLJ3);
        }
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.fh3);
        tuxTextView2.setMaxWidth((int) TypedValue.applyDimension(i2, 180.0f, resources.getDisplayMetrics()));
        C786410Ut5.LJLLLLLL(8, tuxTextView2);
        int[] iArr = new int[i2];
        iArr[0] = R.attr.ee;
        TypedArray typedArrayObtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(iArr);
        tuxTextView2.setTextColor(typedArrayObtainStyledAttributes3.getColor(0, 0));
        typedArrayObtainStyledAttributes3.recycle();
        ViewGroup.LayoutParams layoutParamsLJ4 = android.view.a.LJ(-2, -2, radiusLayout);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParamsLJ4)) {
            i3 = 17;
            ((LinearLayout.LayoutParams) layoutParamsLJ4).gravity = 17;
        } else {
            i3 = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParamsLJ4)) {
            ((FrameLayout.LayoutParams) layoutParamsLJ4).gravity = i3;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParamsLJ4)) {
            ((DrawerLayout$LayoutParams) layoutParamsLJ4).gravity = i3;
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P2_Regular"), tuxTextView2);
        android.view.a.LIZ(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            radiusLayout.addView(tuxTextView2, layoutParamsLJ4);
        }
        View viewLIZ = C20742916Ex.LIZ(context, R.layout.cbu, radiusLayout, false, R.layout.cbk);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ4 = android.view.a.LJ(-2, (int) TypedValue.applyDimension(i2, 20.0f, resources.getDisplayMetrics()), radiusLayout);
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ4)) {
            i4 = 8388661;
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ4).gravity = 8388661;
        } else {
            i4 = 8388661;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ4)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ4).gravity = i4;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ4)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ4).gravity = i4;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ4)) {
            f2 = 8.0f;
            marginLayoutParamsLJ4.topMargin = (int) TypedValue.applyDimension(i2, 8.0f, resources.getDisplayMetrics());
        } else {
            f2 = 8.0f;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ4)) {
            marginLayoutParamsLJ4.setMarginEnd((int) TypedValue.applyDimension(i2, f2, resources.getDisplayMetrics()));
        }
        if (viewLIZ.getParent() == null) {
            radiusLayout.addView(viewLIZ, marginLayoutParamsLJ4);
        }
        android.view.a.LIZ(radiusLayout);
        C786410Ut5.W5(radiusLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(radiusLayout);
        }
        return radiusLayout;
    }
}
