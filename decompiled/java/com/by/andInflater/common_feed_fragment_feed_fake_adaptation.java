package com.by.andInflater;

import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public class common_feed_fragment_feed_fake_adaptation implements InterfaceC20742716Ev {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        if (viewGroup == null || !z) {
            throw new IllegalStateException("merge tag container should not be null attach should not be false");
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.y_z);
        linearLayout.setOrientation(1);
        ViewGroup.LayoutParams layoutParamsLJ = a.LJ(-1, (int) TypedValue.applyDimension(0, 0.0f, resources.getDisplayMetrics()), viewGroup);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParamsLJ)) {
            ((LinearLayout.LayoutParams) layoutParamsLJ).gravity = 48;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParamsLJ)) {
            ((FrameLayout.LayoutParams) layoutParamsLJ).gravity = 48;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParamsLJ)) {
            ((DrawerLayout$LayoutParams) layoutParamsLJ).gravity = 48;
        }
        View view = new View(context);
        view.setId(R.id.y_y);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.e1});
        view.setBackgroundColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(0, 0.0f, resources.getDisplayMetrics()));
        a.LIZ(view);
        if (view.getParent() == null) {
            linearLayout.addView(view, layoutParams);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setImageResource(R.drawable.cfh);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams3)) {
            ((LinearLayout.LayoutParams) layoutParams3).gravity = 51;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.gravity = 51;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams3)) {
            ((DrawerLayout$LayoutParams) layoutParams3).gravity = 51;
        }
        a.LIZ(appCompatImageView);
        if (appCompatImageView.getParent() == null) {
            frameLayout.addView(appCompatImageView, layoutParams3);
        }
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context);
        appCompatImageView2.setImageResource(R.drawable.cfi);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams4)) {
            ((LinearLayout.LayoutParams) layoutParams4).gravity = 53;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.gravity = 53;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams4)) {
            ((DrawerLayout$LayoutParams) layoutParams4).gravity = 53;
        }
        a.LIZ(appCompatImageView2);
        if (appCompatImageView2.getParent() == null) {
            frameLayout.addView(appCompatImageView2, layoutParams4);
        }
        a.LIZ(frameLayout);
        if (frameLayout.getParent() == null) {
            linearLayout.addView(frameLayout, layoutParams2);
        }
        a.LIZ(linearLayout);
        if (linearLayout.getParent() == null) {
            viewGroup.addView(linearLayout, layoutParamsLJ);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setId(R.id.cd3);
        linearLayout2.setOrientation(1);
        ViewGroup.LayoutParams layoutParamsLJ2 = a.LJ(-1, (int) TypedValue.applyDimension(0, 0.0f, resources.getDisplayMetrics()), viewGroup);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParamsLJ2)) {
            ((LinearLayout.LayoutParams) layoutParamsLJ2).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParamsLJ2)) {
            ((FrameLayout.LayoutParams) layoutParamsLJ2).gravity = 80;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParamsLJ2)) {
            ((DrawerLayout$LayoutParams) layoutParamsLJ2).gravity = 80;
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        ViewGroup.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        AppCompatImageView appCompatImageView3 = new AppCompatImageView(context);
        appCompatImageView3.setImageResource(R.drawable.cfj);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams6)) {
            ((LinearLayout.LayoutParams) layoutParams6).gravity = 83;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.gravity = 83;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams6)) {
            ((DrawerLayout$LayoutParams) layoutParams6).gravity = 83;
        }
        a.LIZ(appCompatImageView3);
        if (appCompatImageView3.getParent() == null) {
            frameLayout2.addView(appCompatImageView3, layoutParams6);
        }
        AppCompatImageView appCompatImageView4 = new AppCompatImageView(context);
        appCompatImageView4.setImageResource(R.drawable.cfk);
        FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams7)) {
            ((LinearLayout.LayoutParams) layoutParams7).gravity = 85;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams7)) {
            layoutParams7.gravity = 85;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams7)) {
            ((DrawerLayout$LayoutParams) layoutParams7).gravity = 85;
        }
        a.LIZ(appCompatImageView4);
        if (appCompatImageView4.getParent() == null) {
            frameLayout2.addView(appCompatImageView4, layoutParams7);
        }
        a.LIZ(frameLayout2);
        if (frameLayout2.getParent() == null) {
            linearLayout2.addView(frameLayout2, layoutParams5);
        }
        View view2 = new View(context);
        view2.setId(R.id.cd2);
        TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.e1});
        view2.setBackgroundColor(typedArrayObtainStyledAttributes2.getColor(0, 0));
        typedArrayObtainStyledAttributes2.recycle();
        ViewGroup.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(0, 0.0f, resources.getDisplayMetrics()));
        a.LIZ(view2);
        if (view2.getParent() == null) {
            linearLayout2.addView(view2, layoutParams8);
        }
        a.LIZ(linearLayout2);
        if (linearLayout2.getParent() == null) {
            viewGroup.addView(linearLayout2, layoutParamsLJ2);
        }
        return viewGroup;
    }
}
