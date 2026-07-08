package com.by.andInflater;

import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.k;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class common_feed_immersive_clear_mode_bottom_interact_area implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setPadding((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), relativeLayout.getPaddingTop(), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), relativeLayout.getPaddingBottom());
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -1, viewGroup);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.ki0);
        linearLayout.setGravity(16);
        linearLayout.setBackgroundResource(R.drawable.bbe);
        linearLayout.setOrientation(0);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = (int) TypedValue.applyDimension(1, 9.0f, resources.getDisplayMetrics());
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.addRule(21, -1);
        }
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setId(R.id.qmm);
        tuxIconView.setImportantForAccessibility(2);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 60.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        new k();
        k.LIZ("app:tux_iconHeight", new a.d("20", "dp"), tuxIconView);
        k.LIZ("app:tux_iconWidth", new a.d("20", "dp"), tuxIconView);
        k.LIZ("app:tux_icon", new a.b("2130774383", "raw"), tuxIconView);
        k.LIZ("app:tux_tintColor", new a.b("2131100552", "attr"), tuxIconView);
        android.view.a.LIZ(tuxIconView);
        if (tuxIconView.getParent() == null) {
            linearLayout.addView(tuxIconView, layoutParams2);
        }
        View view = new View(context);
        view.setBackgroundResource(R.drawable.bbf);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        android.view.a.LIZ(view);
        if (view.getParent() == null) {
            linearLayout.addView(view, layoutParams3);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setImportantForAccessibility(2);
        tuxTextView.setId(R.id.vtx);
        tuxTextView.setLetterSpacing(-0.04f);
        tuxTextView.setGravity(17);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.zl});
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 60.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        new o();
        o.LIZ("app:tux_font", new a.c("H3_Semibold"), tuxTextView);
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            linearLayout.addView(tuxTextView, layoutParams4);
        }
        android.view.a.LIZ(linearLayout);
        if (linearLayout.getParent() == null) {
            relativeLayout.addView(linearLayout, layoutParams);
        }
        RelativeLayout relativeLayout2 = new RelativeLayout(context);
        relativeLayout2.setId(R.id.e0k);
        relativeLayout2.setBackgroundResource(R.drawable.bbe);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.addRule(20, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            ((ViewGroup.MarginLayoutParams) layoutParams5).topMargin = (int) TypedValue.applyDimension(1, 9.0f, resources.getDisplayMetrics());
        }
        TuxIconView tuxIconView2 = new TuxIconView(context);
        tuxIconView2.setImportantForAccessibility(2);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.addRule(13, -1);
        }
        new k();
        k.LIZ("app:tux_icon", new a.b("2130775061", "raw"), tuxIconView2);
        k.LIZ("app:tux_tintColor", new a.b("2131100552", "attr"), tuxIconView2);
        android.view.a.LIZ(tuxIconView2);
        if (tuxIconView2.getParent() == null) {
            relativeLayout2.addView(tuxIconView2, layoutParams6);
        }
        android.view.a.LIZ(relativeLayout2);
        if (relativeLayout2.getParent() == null) {
            relativeLayout.addView(relativeLayout2, layoutParams5);
        }
        android.view.a.LIZ(relativeLayout);
        C786410Ut5.W5(relativeLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(relativeLayout);
        }
        return relativeLayout;
    }
}
