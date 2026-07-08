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
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.k;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class story_quick_dm_bottom_bar_dark_mode implements InterfaceC20742716Ev {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        int i2;
        Resources resources = context.getResources();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, R.style.y0);
        Resources resources2 = contextThemeWrapper.getResources();
        FrameLayout frameLayout = new FrameLayout(contextThemeWrapper);
        frameLayout.setId(R.id.smj);
        C786410Ut5.LJLLLLLL(8, frameLayout);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, (int) TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()), viewGroup);
        RelativeLayout relativeLayout = new RelativeLayout(contextThemeWrapper);
        relativeLayout.setId(R.id.smk);
        C786410Ut5.LJLLLLLL(0, relativeLayout);
        relativeLayout.setPadding((int) TypedValue.applyDimension(1, 4.0f, resources2.getDisplayMetrics()), relativeLayout.getPaddingTop(), relativeLayout.getPaddingRight(), relativeLayout.getPaddingBottom());
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()));
        TuxTextView tuxTextView = new TuxTextView(contextThemeWrapper);
        tuxTextView.setId(R.id.sml);
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.getTheme().obtainStyledAttributes(new int[]{R.attr.ee});
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        tuxTextView.setHint(contextThemeWrapper.getResources().getString(2131835714));
        tuxTextView.setHintTextColor(a.LIZIZ(R.attr.ee, contextThemeWrapper));
        tuxTextView.setSingleLine(true);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setImportantForAccessibility(2);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        new o();
        o.LIZ("app:tux_font", new a.c("H4_Regular"), tuxTextView);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.addRule(15, -1);
        }
        o.LIZ("app:tux_minTextSize", new a.d("12", "dp"), tuxTextView);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            i = 1;
            layoutParams2.setMarginStart((int) TypedValue.applyDimension(1, 16.0f, resources2.getDisplayMetrics()));
        } else {
            i = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.setMarginEnd((int) TypedValue.applyDimension(i, 2.0f, resources2.getDisplayMetrics()));
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.addRule(16, R.id.upw);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.addRule(20, -1);
        }
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            relativeLayout.addView(tuxTextView, layoutParams2);
        }
        LinearLayout linearLayout = new LinearLayout(contextThemeWrapper);
        linearLayout.setId(R.id.upw);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -1);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.addRule(21, -1);
        }
        TuxTextView tuxTextView2 = new TuxTextView(contextThemeWrapper);
        tuxTextView2.setId(R.id.upx);
        TypedArray typedArrayObtainStyledAttributes2 = contextThemeWrapper.getTheme().obtainStyledAttributes(new int[]{R.attr.ee});
        tuxTextView2.setTextColor(typedArrayObtainStyledAttributes2.getColor(0, 0));
        typedArrayObtainStyledAttributes2.recycle();
        tuxTextView2.setText(R.string.sxo);
        tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
        C786410Ut5.LJLLLLLL(8, tuxTextView2);
        tuxTextView2.setImportantForAccessibility(2);
        tuxTextView2.setGravity(17);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -1);
        new o();
        o.LIZ("app:tux_font", new a.c("H4_Semibold"), tuxTextView2);
        o.LIZ("app:tux_minTextSize", new a.d("12", "dp"), tuxTextView2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.setMarginEnd((int) TypedValue.applyDimension(1, 16.0f, resources2.getDisplayMetrics()));
        }
        android.view.a.LIZ(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            linearLayout.addView(tuxTextView2, layoutParams4);
        }
        TuxIconView tuxIconView = new TuxIconView(contextThemeWrapper);
        tuxIconView.setId(R.id.so2);
        tuxIconView.setBackgroundResource(R.drawable.c_8);
        C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        tuxIconView.setImportantForAccessibility(2);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        new k();
        k.LIZ("app:tux_iconHeight", new a.d("20", "dp"), tuxIconView);
        k.LIZ("app:tux_iconWidth", new a.d("20", "dp"), tuxIconView);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams5)) {
            i2 = 16;
            layoutParams5.gravity = 16;
        } else {
            i2 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams5)) {
            ((FrameLayout.LayoutParams) layoutParams5).gravity = i2;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams5)) {
            ((DrawerLayout$LayoutParams) layoutParams5).gravity = i2;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.setMarginStart((int) TypedValue.applyDimension(1, 6.0f, resources2.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.setMarginEnd((int) TypedValue.applyDimension(1, 7.0f, resources2.getDisplayMetrics()));
        }
        k.LIZ("app:tux_icon", new a.b("2130774372", "raw"), tuxIconView);
        k.LIZ("app:tux_tintColor", new a.b("2131099682", "attr"), tuxIconView);
        android.view.a.LIZ(tuxIconView);
        if (tuxIconView.getParent() == null) {
            linearLayout.addView(tuxIconView, layoutParams5);
        }
        LinearLayout linearLayout2 = new LinearLayout(contextThemeWrapper);
        linearLayout2.setId(R.id.gzl);
        linearLayout2.setOrientation(0);
        C786410Ut5.LJLLLLLL(0, linearLayout2);
        ViewGroup.MarginLayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -1);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams6)) {
            ((RelativeLayout.LayoutParams) layoutParams6).addRule(21, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.setMarginEnd((int) TypedValue.applyDimension(1, 8.0f, resources2.getDisplayMetrics()));
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams6)) {
            ((RelativeLayout.LayoutParams) layoutParams6).addRule(15, -1);
        }
        android.view.a.LIZ(linearLayout2);
        if (linearLayout2.getParent() == null) {
            linearLayout.addView(linearLayout2, layoutParams6);
        }
        android.view.a.LIZ(linearLayout);
        if (linearLayout.getParent() == null) {
            relativeLayout.addView(linearLayout, layoutParams3);
        }
        android.view.a.LIZ(relativeLayout);
        if (relativeLayout.getParent() == null) {
            frameLayout.addView(relativeLayout, layoutParams);
        }
        android.view.a.LIZ(frameLayout);
        C786410Ut5.W5(frameLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        return frameLayout;
    }
}
