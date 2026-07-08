package com.by.andInflater;

import X.C20742916Ex;
import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask.AwesomeSplashNewMask;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class awesome_splash_new_mask implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        Resources resources = context.getResources();
        AwesomeSplashNewMask awesomeSplashNewMask = new AwesomeSplashNewMask(context, null, 6);
        awesomeSplashNewMask.setId(R.id.bmc);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -1, viewGroup);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R.id.lyd);
        appCompatImageView.setBackgroundResource(R.drawable.d0z);
        C786410Ut5.Ab(appCompatImageView, 180.0f);
        C786410Ut5.LJZI(8, appCompatImageView);
        ViewGroup.LayoutParams layoutParamsLJ = a.LJ(-1, (int) TypedValue.applyDimension(1, 80.0f, resources.getDisplayMetrics()), awesomeSplashNewMask);
        a.LIZ(appCompatImageView);
        if (appCompatImageView.getParent() == null) {
            awesomeSplashNewMask.addView(appCompatImageView, layoutParamsLJ);
        }
        View space = new Space(context);
        space.setId(R.id.bmd);
        ViewGroup.LayoutParams layoutParamsLJ2 = a.LJ(-1, (int) TypedValue.applyDimension(0, 0.0f, resources.getDisplayMetrics()), awesomeSplashNewMask);
        a.LIZ(space);
        if (space.getParent() == null) {
            awesomeSplashNewMask.addView(space, layoutParamsLJ2);
        }
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context);
        appCompatImageView2.setId(R.id.bmb);
        appCompatImageView2.setLayoutDirection(0);
        appCompatImageView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        appCompatImageView2.setImageResource(R.drawable.d9n);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ2 = a.LJ(-2, -2, awesomeSplashNewMask);
        if (RelativeLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            ((RelativeLayout.LayoutParams) marginLayoutParamsLJ2).addRule(3, R.id.bmd);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            ((RelativeLayout.LayoutParams) marginLayoutParamsLJ2).addRule(9, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            marginLayoutParamsLJ2.leftMargin = (int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            marginLayoutParamsLJ2.topMargin = (int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics());
        }
        a.LIZ(appCompatImageView2);
        if (appCompatImageView2.getParent() == null) {
            awesomeSplashNewMask.addView(appCompatImageView2, marginLayoutParamsLJ2);
        }
        View viewLIZ = C20742916Ex.LIZ(context, R.layout.ia5, awesomeSplashNewMask, false, R.layout.abt);
        viewLIZ.setId(R.id.vfx);
        ViewGroup.LayoutParams layoutParamsLJ3 = a.LJ(-2, -2, awesomeSplashNewMask);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParamsLJ3)) {
            ((RelativeLayout.LayoutParams) layoutParamsLJ3).addRule(3, R.id.bmd);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParamsLJ3)) {
            ((RelativeLayout.LayoutParams) layoutParamsLJ3).addRule(11, -1);
        }
        if (viewLIZ.getParent() == null) {
            awesomeSplashNewMask.addView(viewLIZ, layoutParamsLJ3);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.tv_sponsored);
        tuxTextView.setGravity(17);
        tuxTextView.setShadowLayer(tuxTextView.getShadowRadius(), tuxTextView.getShadowDx(), tuxTextView.getShadowDy(), a.LIZIZ(R.attr.oz, context));
        tuxTextView.setShadowLayer(tuxTextView.getShadowRadius(), tuxTextView.getShadowDx(), 1.0f, tuxTextView.getShadowColor());
        C786410Ut5.LJLLLLLL(8, tuxTextView);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ3 = a.LJ(-2, -2, awesomeSplashNewMask);
        if (RelativeLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            ((RelativeLayout.LayoutParams) marginLayoutParamsLJ3).addRule(3, R.id.bmd);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            ((RelativeLayout.LayoutParams) marginLayoutParamsLJ3).addRule(21, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            i = 1;
            marginLayoutParamsLJ3.topMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        } else {
            i = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            marginLayoutParamsLJ3.setMarginEnd((int) TypedValue.applyDimension(i, 13.0f, resources.getDisplayMetrics()));
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P3_Regular"), tuxTextView);
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            awesomeSplashNewMask.addView(tuxTextView, marginLayoutParamsLJ3);
        }
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setId(R.id.tow);
        relativeLayout.setBackgroundResource(R.drawable.d0z);
        C786410Ut5.LJLLLLLL(8, relativeLayout);
        ViewGroup.LayoutParams layoutParamsLJ4 = android.view.a.LJ(-1, (int) TypedValue.applyDimension(i, 114.0f, resources.getDisplayMetrics()), awesomeSplashNewMask);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParamsLJ4)) {
            ((RelativeLayout.LayoutParams) layoutParamsLJ4).addRule(12, -1);
        }
        AppCompatImageView appCompatImageView3 = new AppCompatImageView(context);
        appCompatImageView3.setId(R.id.ls6);
        appCompatImageView3.setPadding((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        appCompatImageView3.setScaleType(ImageView.ScaleType.FIT_XY);
        appCompatImageView3.setImageResource(R.drawable.fi9);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 30.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.addRule(14, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.addRule(2, R.id.tv_prompt);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = (int) TypedValue.applyDimension(1, -12.0f, resources.getDisplayMetrics());
        }
        android.view.a.LIZ(appCompatImageView3);
        if (appCompatImageView3.getParent() == null) {
            relativeLayout.addView(appCompatImageView3, layoutParams);
        }
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.tv_prompt);
        tuxTextView2.setGravity(48);
        tuxTextView2.setPadding((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        tuxTextView2.setShadowLayer(tuxTextView2.getShadowRadius(), tuxTextView2.getShadowDx(), tuxTextView2.getShadowDy(), android.view.a.LIZIZ(R.attr.oz, context));
        tuxTextView2.setShadowLayer(tuxTextView2.getShadowRadius(), tuxTextView2.getShadowDx(), 1.0f, tuxTextView2.getShadowColor());
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.ee});
        tuxTextView2.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.addRule(12, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.addRule(14, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = (int) TypedValue.applyDimension(1, 46.0f, resources.getDisplayMetrics());
        }
        new o();
        o.LIZ("app:tux_font", new a.c("H4_Regular"), tuxTextView2);
        android.view.a.LIZ(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            relativeLayout.addView(tuxTextView2, layoutParams2);
        }
        android.view.a.LIZ(relativeLayout);
        if (relativeLayout.getParent() == null) {
            awesomeSplashNewMask.addView(relativeLayout, layoutParamsLJ4);
        }
        android.view.a.LIZ(awesomeSplashNewMask);
        C786410Ut5.W5(awesomeSplashNewMask, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(awesomeSplashNewMask);
        }
        return awesomeSplashNewMask;
    }
}
