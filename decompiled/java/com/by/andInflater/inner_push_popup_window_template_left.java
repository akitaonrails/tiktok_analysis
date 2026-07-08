package com.by.andInflater;

import X.C1610770s1D;
import X.C427870Gq9;
import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.zhiliaoapp.musically.R;
import dc.a;
import jf8.c;

/* JADX INFO: loaded from: classes32.dex */
public class inner_push_popup_window_template_left implements InterfaceC20742716Ev {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        int i2;
        int i3;
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.mll);
        frameLayout.setClipChildren(false);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-2, -2, viewGroup);
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ).gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ).gravity = 16;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ).gravity = 16;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        FrameLayout frameLayout2 = new FrameLayout(context);
        ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setId(R.id.vbr);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams3)) {
            ((LinearLayout.LayoutParams) layoutParams3).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.gravity = 17;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams3)) {
            ((DrawerLayout$LayoutParams) layoutParams3).gravity = 17;
        }
        C427870Gq9 c427870Gq9 = new C427870Gq9(context);
        c427870Gq9.setId(R.id.koq);
        c427870Gq9.setScaleType(ImageView.ScaleType.CENTER_CROP);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()));
        c cVar = new c();
        cVar.LIZIZ("app:placeholderImage", new a.b("2130972023", "drawable"), c427870Gq9);
        cVar.LIZIZ("app:placeholderImageScaleType", new a.c("centerCrop"), c427870Gq9);
        cVar.LIZIZ("app:roundAsCircle", new a.c("true"), c427870Gq9);
        cVar.LIZIZ("app:roundingBorderColor", new a.b("2131100103", "attr"), c427870Gq9);
        cVar.LIZIZ("app:roundingBorderWidth", new a.d("0.5", "dp"), c427870Gq9);
        cVar.LIZ(c427870Gq9);
        android.view.a.LIZ(c427870Gq9);
        if (c427870Gq9.getParent() == null) {
            frameLayout3.addView(c427870Gq9, layoutParams4);
        }
        android.view.a.LIZ(frameLayout3);
        if (frameLayout3.getParent() == null) {
            frameLayout2.addView(frameLayout3, layoutParams3);
        }
        C1610770s1D c1610770s1D = new C1610770s1D(context);
        c1610770s1D.setId(R.id.mvl);
        c1610770s1D.setPadding((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        C786410Ut5.LJLLLLLL(8, c1610770s1D);
        c1610770s1D.setStrokeWidth((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 51.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 51.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams5)) {
            i = 17;
            ((LinearLayout.LayoutParams) layoutParams5).gravity = 17;
        } else {
            i = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.gravity = i;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams5)) {
            ((DrawerLayout$LayoutParams) layoutParams5).gravity = i;
        }
        android.view.a.LIZ(c1610770s1D);
        if (c1610770s1D.getParent() == null) {
            frameLayout2.addView(c1610770s1D, layoutParams5);
        }
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout4.setId(R.id.kou);
        C786410Ut5.LJLLLLLL(8, frameLayout4);
        ViewGroup.LayoutParams layoutParams6 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()));
        C427870Gq9 c427870Gq92 = new C427870Gq9(context);
        c427870Gq92.setId(R.id.kp4);
        c427870Gq92.setScaleType(ImageView.ScaleType.CENTER_CROP);
        FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams7)) {
            ((LinearLayout.LayoutParams) layoutParams7).gravity = 8388661;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams7)) {
            layoutParams7.gravity = 8388661;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams7)) {
            ((DrawerLayout$LayoutParams) layoutParams7).gravity = 8388661;
        }
        c cVar2 = new c();
        cVar2.LIZIZ("app:placeholderImage", new a.b("2130972023", "drawable"), c427870Gq92);
        cVar2.LIZIZ("app:placeholderImageScaleType", new a.c("centerCrop"), c427870Gq92);
        cVar2.LIZIZ("app:roundingBorderColor", new a.b("2131100103", "attr"), c427870Gq92);
        cVar2.LIZIZ("app:roundingBorderWidth", new a.d("0.5", "dp"), c427870Gq92);
        cVar2.LIZ(c427870Gq92);
        android.view.a.LIZ(c427870Gq92);
        if (c427870Gq92.getParent() == null) {
            frameLayout4.addView(c427870Gq92, layoutParams7);
        }
        C427870Gq9 c427870Gq93 = new C427870Gq9(context);
        c427870Gq93.setScaleType(ImageView.ScaleType.CENTER_CROP);
        FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams8)) {
            ((LinearLayout.LayoutParams) layoutParams8).gravity = 8388691;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams8)) {
            layoutParams8.gravity = 8388691;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams8)) {
            ((DrawerLayout$LayoutParams) layoutParams8).gravity = 8388691;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams8)) {
            i2 = 1;
            layoutParams8.setMarginStart((int) TypedValue.applyDimension(1, -2.0f, resources.getDisplayMetrics()));
        } else {
            i2 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams8)) {
            ((ViewGroup.MarginLayoutParams) layoutParams8).bottomMargin = (int) TypedValue.applyDimension(i2, -2.0f, resources.getDisplayMetrics());
        }
        c cVar3 = new c();
        cVar3.LIZIZ("app:placeholderImage", new a.b("2131099676", "attr"), c427870Gq93);
        cVar3.LIZ(c427870Gq93);
        android.view.a.LIZ(c427870Gq93);
        if (c427870Gq93.getParent() == null) {
            frameLayout4.addView(c427870Gq93, layoutParams8);
        }
        C427870Gq9 c427870Gq94 = new C427870Gq9(context);
        c427870Gq94.setId(R.id.kol);
        c427870Gq94.setScaleType(ImageView.ScaleType.CENTER_CROP);
        FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams9)) {
            i3 = 8388691;
            ((LinearLayout.LayoutParams) layoutParams9).gravity = 8388691;
        } else {
            i3 = 8388691;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams9)) {
            layoutParams9.gravity = i3;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams9)) {
            ((DrawerLayout$LayoutParams) layoutParams9).gravity = i3;
        }
        c cVar4 = new c();
        cVar4.LIZIZ("app:placeholderImage", new a.b("2130972023", "drawable"), c427870Gq94);
        cVar4.LIZIZ("app:placeholderImageScaleType", new a.c("centerCrop"), c427870Gq94);
        cVar4.LIZIZ("app:roundingBorderColor", new a.b("2131100103", "attr"), c427870Gq94);
        cVar4.LIZIZ("app:roundingBorderWidth", new a.d("0.5", "dp"), c427870Gq94);
        cVar4.LIZ(c427870Gq94);
        android.view.a.LIZ(c427870Gq94);
        if (c427870Gq94.getParent() == null) {
            frameLayout4.addView(c427870Gq94, layoutParams9);
        }
        android.view.a.LIZ(frameLayout4);
        if (frameLayout4.getParent() == null) {
            frameLayout2.addView(frameLayout4, layoutParams6);
        }
        android.view.a.LIZ(frameLayout2);
        if (frameLayout2.getParent() == null) {
            linearLayout.addView(frameLayout2, layoutParams2);
        }
        View view = new View(context);
        ViewGroup.LayoutParams layoutParams10 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), -1);
        android.view.a.LIZ(view);
        if (view.getParent() == null) {
            linearLayout.addView(view, layoutParams10);
        }
        android.view.a.LIZ(linearLayout);
        if (linearLayout.getParent() == null) {
            frameLayout.addView(linearLayout, layoutParams);
        }
        C427870Gq9 c427870Gq95 = new C427870Gq9(context);
        c427870Gq95.setId(R.id.kow);
        c427870Gq95.setBackgroundResource(R.drawable.cdc);
        c427870Gq95.setPadding((int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()));
        C786410Ut5.LJZI(8, c427870Gq95);
        FrameLayout.LayoutParams layoutParams11 = new FrameLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams11)) {
            ((LinearLayout.LayoutParams) layoutParams11).gravity = 8388693;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams11)) {
            layoutParams11.gravity = 8388693;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams11)) {
            ((DrawerLayout$LayoutParams) layoutParams11).gravity = 8388693;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams11)) {
            layoutParams11.setMarginEnd((int) TypedValue.applyDimension(1, -3.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams11)) {
            ((ViewGroup.MarginLayoutParams) layoutParams11).bottomMargin = (int) TypedValue.applyDimension(1, -3.0f, resources.getDisplayMetrics());
        }
        c cVar5 = new c();
        cVar5.LIZIZ("app:roundAsCircle", new a.c("true"), c427870Gq95);
        cVar5.LIZ(c427870Gq95);
        android.view.a.LIZ(c427870Gq95);
        if (c427870Gq95.getParent() == null) {
            frameLayout.addView(c427870Gq95, layoutParams11);
        }
        android.view.a.LIZ(frameLayout);
        C786410Ut5.W5(frameLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        return frameLayout;
    }
}
