package com.by.andInflater;

import X.C0GWD;
import X.C1295960jpS;
import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class homepage_common_guide_container implements InterfaceC20742716Ev {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(1);
        C786410Ut5.LJLLLLLL(8, linearLayout);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, (int) TypedValue.applyDimension(1, 296.0f, resources.getDisplayMetrics()), viewGroup);
        View view = new View(context);
        view.setId(R.id.w12);
        view.setBackgroundColor(resources.getColor(R.color.ne));
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        a.LIZ(view);
        if (view.getParent() == null) {
            linearLayout.addView(view, layoutParams);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.j4i);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 256.0f, resources.getDisplayMetrics()));
        View c0gwd = new C0GWD(context, null, 6);
        c0gwd.setId(R.id.thx);
        c0gwd.setImportantForAccessibility(2);
        C786410Ut5.LJLLLLLL(8, c0gwd);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 50.0f, resources.getDisplayMetrics()), -1);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams3)) {
            ((LinearLayout.LayoutParams) layoutParams3).gravity = 8388659;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.gravity = 8388659;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams3)) {
            ((DrawerLayout$LayoutParams) layoutParams3).gravity = 8388659;
        }
        a.LIZ(c0gwd);
        if (c0gwd.getParent() == null) {
            frameLayout.addView(c0gwd, layoutParams3);
        }
        C1295960jpS c1295960jpS = new C1295960jpS(context);
        c1295960jpS.setId(R.id.thw);
        c1295960jpS.setImportantForAccessibility(2);
        c1295960jpS.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        C786410Ut5.LJZI(8, c1295960jpS);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 210.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 210.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams4)) {
            ((LinearLayout.LayoutParams) layoutParams4).gravity = 8388659;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.gravity = 8388659;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams4)) {
            ((DrawerLayout$LayoutParams) layoutParams4).gravity = 8388659;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.setMarginStart((int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()));
        }
        a.LIZ(c1295960jpS);
        if (c1295960jpS.getParent() == null) {
            frameLayout.addView(c1295960jpS, layoutParams4);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.thv);
        tuxTextView.setGravity(17);
        tuxTextView.setMaxLines(2);
        tuxTextView.setText(2131822378);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.ee});
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        C786410Ut5.LJLLLLLL(8, tuxTextView);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 192.0f, resources.getDisplayMetrics()), -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams5)) {
            ((LinearLayout.LayoutParams) layoutParams5).gravity = 8388659;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.gravity = 8388659;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams5)) {
            ((DrawerLayout$LayoutParams) layoutParams5).gravity = 8388659;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.setMarginStart((int) TypedValue.applyDimension(1, 45.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            ((ViewGroup.MarginLayoutParams) layoutParams5).topMargin = (int) TypedValue.applyDimension(1, 218.0f, resources.getDisplayMetrics());
        }
        new o();
        o.LIZ("app:tux_font", new a.c("H1_Bold"), tuxTextView);
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            frameLayout.addView(tuxTextView, layoutParams5);
        }
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.jdv);
        tuxTextView2.setTextAlignment(4);
        TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.ee});
        tuxTextView2.setTextColor(typedArrayObtainStyledAttributes2.getColor(0, 0));
        typedArrayObtainStyledAttributes2.recycle();
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams6)) {
            ((LinearLayout.LayoutParams) layoutParams6).gravity = 49;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.gravity = 49;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams6)) {
            ((DrawerLayout$LayoutParams) layoutParams6).gravity = 49;
        }
        new o();
        o.LIZ("android:layout_marginHorizontal", new a.d("32", "dp"), tuxTextView2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams6)) {
            ((ViewGroup.MarginLayoutParams) layoutParams6).topMargin = (int) TypedValue.applyDimension(1, 72.0f, resources.getDisplayMetrics());
        }
        o.LIZ("app:tux_font", new a.c("H4_Semibold"), tuxTextView2);
        android.view.a.LIZ(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            frameLayout.addView(tuxTextView2, layoutParams6);
        }
        android.view.a.LIZ(frameLayout);
        if (frameLayout.getParent() == null) {
            linearLayout.addView(frameLayout, layoutParams2);
        }
        android.view.a.LIZ(linearLayout);
        C786410Ut5.W5(linearLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(linearLayout);
        }
        return linearLayout;
    }
}
