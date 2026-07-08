package com.by.andInflater;

import X.C19ME;
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
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class im_item_msg_share_card_live_restricted implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        if (viewGroup == null || !z) {
            throw new IllegalStateException("merge tag container should not be null attach should not be false");
        }
        View appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R.id.akp);
        appCompatImageView.setBackgroundResource(R.drawable.cbl);
        ViewGroup.LayoutParams layoutParamsLJ = a.LJ(-1, -1, viewGroup);
        a.LIZ(appCompatImageView);
        if (appCompatImageView.getParent() == null) {
            viewGroup.addView(appCompatImageView, layoutParamsLJ);
        }
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context);
        appCompatImageView2.setId(R.id.akx);
        appCompatImageView2.setImageResource(R.drawable.cb_);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-2, -2, viewGroup);
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ).gravity = 17;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ).gravity = 17;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            marginLayoutParamsLJ.topMargin = (int) TypedValue.applyDimension(1, 61.0f, resources.getDisplayMetrics());
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ)) {
            ((C19ME) marginLayoutParamsLJ).startToStart = 0;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ)) {
            ((C19ME) marginLayoutParamsLJ).endToEnd = 0;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ)) {
            ((C19ME) marginLayoutParamsLJ).topToTop = 0;
        }
        a.LIZ(appCompatImageView2);
        if (appCompatImageView2.getParent() == null) {
            viewGroup.addView(appCompatImageView2, marginLayoutParamsLJ);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.akw);
        tuxTextView.setGravity(17);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1j});
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ2 = a.LJ(-2, -2, viewGroup);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            marginLayoutParamsLJ2.topMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ2)) {
            ((C19ME) marginLayoutParamsLJ2).startToStart = 0;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ2)) {
            ((C19ME) marginLayoutParamsLJ2).endToEnd = 0;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ2)) {
            ((C19ME) marginLayoutParamsLJ2).topToBottom = R.id.akx;
        }
        new o();
        o.LIZ("app:tux_font", new a.c("H4_Regular"), tuxTextView);
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            viewGroup.addView(tuxTextView, marginLayoutParamsLJ2);
        }
        return viewGroup;
    }
}
