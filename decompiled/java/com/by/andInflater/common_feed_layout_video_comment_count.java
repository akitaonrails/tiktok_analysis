package com.by.andInflater;

import X.C706680Rnm;
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
import androidx.appcompat.widget.AppCompatImageView;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.feed.platform.cell.interact.view.InteractFrameLayout;
import com.ss.android.ugc.feed.platform.cell.interact.view.InteractLinearLayout;
import com.ss.android.ugc.feed.platform.cell.interact.view.InteractRelativeLayout;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class common_feed_layout_video_comment_count implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        int i2;
        Resources resources = context.getResources();
        InteractFrameLayout interactFrameLayout = new InteractFrameLayout(context);
        interactFrameLayout.setId(R.id.ef2);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-2, -2, viewGroup);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, R.style.hk);
        Resources resources2 = contextThemeWrapper.getResources();
        InteractLinearLayout interactLinearLayout = new InteractLinearLayout(contextThemeWrapper);
        interactLinearLayout.setId(R.id.ef3);
        interactLinearLayout.setFocusable(true);
        interactLinearLayout.setFocusableInTouchMode(true);
        interactLinearLayout.setImportantForAccessibility(1);
        interactLinearLayout.setClipChildren(false);
        interactLinearLayout.setOrientation(1);
        ViewGroup.LayoutParams layoutParamsLJ = a.LJ(-2, -2, interactFrameLayout);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParamsLJ)) {
            ((LinearLayout.LayoutParams) layoutParamsLJ).gravity = 8388613;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParamsLJ)) {
            ((FrameLayout.LayoutParams) layoutParamsLJ).gravity = 8388613;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParamsLJ)) {
            ((DrawerLayout$LayoutParams) layoutParamsLJ).gravity = 8388613;
        }
        InteractFrameLayout interactFrameLayout2 = new InteractFrameLayout(contextThemeWrapper);
        interactFrameLayout2.setBackgroundResource(R.drawable.b_j);
        interactFrameLayout2.setPadding((int) TypedValue.applyDimension(1, 0.0f, resources2.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources2.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources2.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources2.getDisplayMetrics()));
        interactFrameLayout2.setId(R.id.ea2);
        interactFrameLayout2.setFocusable(false);
        interactFrameLayout2.setFocusableInTouchMode(false);
        interactFrameLayout2.setImportantForAccessibility(4);
        ViewGroup.LayoutParams layoutParamsLJ2 = a.LJ((int) TypedValue.applyDimension(1, 50.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 50.0f, resources.getDisplayMetrics()), interactLinearLayout);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParamsLJ2)) {
            i = 8388613;
            ((LinearLayout.LayoutParams) layoutParamsLJ2).gravity = 8388613;
        } else {
            i = 8388613;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParamsLJ2)) {
            ((FrameLayout.LayoutParams) layoutParamsLJ2).gravity = i;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParamsLJ2)) {
            ((DrawerLayout$LayoutParams) layoutParamsLJ2).gravity = i;
        }
        InteractFrameLayout interactFrameLayout3 = new InteractFrameLayout(contextThemeWrapper);
        interactFrameLayout3.setId(R.id.ebd);
        ViewGroup.LayoutParams layoutParamsLJ3 = a.LJ(-1, -1, interactFrameLayout2);
        AppCompatImageView appCompatImageView = new AppCompatImageView(contextThemeWrapper);
        appCompatImageView.setId(R.id.eb6);
        appCompatImageView.setFocusable(false);
        appCompatImageView.setFocusableInTouchMode(false);
        appCompatImageView.setImageResource(R.drawable.cfl);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ2 = a.LJ((int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), interactFrameLayout3);
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ2).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ2).gravity = 17;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ2).gravity = 17;
        }
        a.LIZ(appCompatImageView);
        if (appCompatImageView.getParent() == null) {
            interactFrameLayout3.addView(appCompatImageView, marginLayoutParamsLJ2);
        }
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(contextThemeWrapper);
        appCompatImageView2.setId(R.id.eb2);
        appCompatImageView2.setImageResource(R.drawable.c02);
        C786410Ut5.LJZI(8, appCompatImageView2);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ3 = a.LJ((int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()), interactFrameLayout3);
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            i2 = 8388613;
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ3).gravity = 8388613;
        } else {
            i2 = 8388613;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ3).gravity = i2;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ3).gravity = i2;
        }
        a.LIZ(appCompatImageView2);
        if (appCompatImageView2.getParent() == null) {
            interactFrameLayout3.addView(appCompatImageView2, marginLayoutParamsLJ3);
        }
        a.LIZ(interactFrameLayout3);
        if (interactFrameLayout3.getParent() == null) {
            interactFrameLayout2.addView(interactFrameLayout3, layoutParamsLJ3);
        }
        TuxTextView tuxTextView = new TuxTextView(contextThemeWrapper);
        tuxTextView.setId(R.id.eam);
        tuxTextView.setGravity(17);
        C786410Ut5.LJLLLLLL(8, tuxTextView);
        ViewGroup.LayoutParams layoutParamsLJ4 = a.LJ(-2, -2, interactFrameLayout2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParamsLJ4)) {
            ((LinearLayout.LayoutParams) layoutParamsLJ4).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParamsLJ4)) {
            ((FrameLayout.LayoutParams) layoutParamsLJ4).gravity = 17;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParamsLJ4)) {
            ((DrawerLayout$LayoutParams) layoutParamsLJ4).gravity = 17;
        }
        a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            interactFrameLayout2.addView(tuxTextView, layoutParamsLJ4);
        }
        a.LIZ(interactFrameLayout2);
        if (interactFrameLayout2.getParent() == null) {
            interactLinearLayout.addView(interactFrameLayout2, layoutParamsLJ2);
        }
        InteractRelativeLayout interactRelativeLayout = new InteractRelativeLayout(contextThemeWrapper);
        interactRelativeLayout.setId(R.id.ea7);
        interactRelativeLayout.setLayoutDirection(0);
        ViewGroup.LayoutParams layoutParamsLJ5 = a.LJ(-2, -2, interactLinearLayout);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParamsLJ5)) {
            ((LinearLayout.LayoutParams) layoutParamsLJ5).gravity = 1;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParamsLJ5)) {
            ((FrameLayout.LayoutParams) layoutParamsLJ5).gravity = 1;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParamsLJ5)) {
            ((DrawerLayout$LayoutParams) layoutParamsLJ5).gravity = 1;
        }
        C706680Rnm c706680Rnm = new C706680Rnm(contextThemeWrapper);
        c706680Rnm.setShadowLayer(2.0f, c706680Rnm.getShadowDx(), c706680Rnm.getShadowDy(), c706680Rnm.getShadowColor());
        c706680Rnm.setShadowLayer(c706680Rnm.getShadowRadius(), c706680Rnm.getShadowDx(), 2.0f, c706680Rnm.getShadowColor());
        c706680Rnm.setShadowLayer(c706680Rnm.getShadowRadius(), c706680Rnm.getShadowDx(), c706680Rnm.getShadowDy(), resources2.getColor(R.color.mp));
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.getTheme().obtainStyledAttributes(new int[]{R.attr.ef});
        c706680Rnm.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        c706680Rnm.setId(R.id.ea6);
        c706680Rnm.setFocusable(false);
        c706680Rnm.setLayoutDirection(3);
        c706680Rnm.setFocusableInTouchMode(false);
        c706680Rnm.setImportantForAccessibility(2);
        c706680Rnm.setMaxWidth((int) TypedValue.applyDimension(1, 70.0f, resources2.getDisplayMetrics()));
        c706680Rnm.setMaxLines(1);
        c706680Rnm.setPadding(c706680Rnm.getPaddingLeft(), c706680Rnm.getPaddingTop(), c706680Rnm.getPaddingRight(), (int) TypedValue.applyDimension(1, 16.0f, resources2.getDisplayMetrics()));
        C786410Ut5.LJLLLLLL(0, c706680Rnm);
        c706680Rnm.setEllipsize(TextUtils.TruncateAt.END);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ4 = a.LJ(-2, -2, interactRelativeLayout);
        if (RelativeLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ4)) {
            ((RelativeLayout.LayoutParams) marginLayoutParamsLJ4).addRule(14, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ4)) {
            marginLayoutParamsLJ4.topMargin = (int) TypedValue.applyDimension(1, -6.4f, resources2.getDisplayMetrics());
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P2_Semibold"), c706680Rnm);
        o.LIZ("app:tux_minTextSize", new a.d("10", "dp"), c706680Rnm);
        android.view.a.LIZ(c706680Rnm);
        if (c706680Rnm.getParent() == null) {
            interactRelativeLayout.addView(c706680Rnm, marginLayoutParamsLJ4);
        }
        C706680Rnm c706680Rnm2 = new C706680Rnm(contextThemeWrapper);
        c706680Rnm2.setShadowLayer(2.0f, c706680Rnm2.getShadowDx(), c706680Rnm2.getShadowDy(), c706680Rnm2.getShadowColor());
        c706680Rnm2.setShadowLayer(c706680Rnm2.getShadowRadius(), c706680Rnm2.getShadowDx(), 2.0f, c706680Rnm2.getShadowColor());
        c706680Rnm2.setShadowLayer(c706680Rnm2.getShadowRadius(), c706680Rnm2.getShadowDx(), c706680Rnm2.getShadowDy(), resources2.getColor(R.color.mp));
        TypedArray typedArrayObtainStyledAttributes2 = contextThemeWrapper.getTheme().obtainStyledAttributes(new int[]{R.attr.ef});
        c706680Rnm2.setTextColor(typedArrayObtainStyledAttributes2.getColor(0, 0));
        typedArrayObtainStyledAttributes2.recycle();
        c706680Rnm2.setId(R.id.ea9);
        c706680Rnm2.setFocusable(false);
        c706680Rnm2.setLayoutDirection(3);
        c706680Rnm2.setFocusableInTouchMode(false);
        c706680Rnm2.setImportantForAccessibility(2);
        c706680Rnm2.setMaxWidth((int) TypedValue.applyDimension(1, 70.0f, resources2.getDisplayMetrics()));
        c706680Rnm2.setMaxLines(1);
        c706680Rnm2.setPadding(c706680Rnm2.getPaddingLeft(), c706680Rnm2.getPaddingTop(), c706680Rnm2.getPaddingRight(), (int) TypedValue.applyDimension(1, 16.0f, resources2.getDisplayMetrics()));
        C786410Ut5.LJLLLLLL(8, c706680Rnm2);
        c706680Rnm2.setEllipsize(TextUtils.TruncateAt.END);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ5 = android.view.a.LJ(-2, -2, interactRelativeLayout);
        if (RelativeLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ5)) {
            ((RelativeLayout.LayoutParams) marginLayoutParamsLJ5).addRule(14, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ5)) {
            marginLayoutParamsLJ5.topMargin = (int) TypedValue.applyDimension(1, -6.4f, resources2.getDisplayMetrics());
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P2_Semibold"), c706680Rnm2);
        android.view.a.LIZ(c706680Rnm2);
        if (c706680Rnm2.getParent() == null) {
            interactRelativeLayout.addView(c706680Rnm2, marginLayoutParamsLJ5);
        }
        android.view.a.LIZ(interactRelativeLayout);
        if (interactRelativeLayout.getParent() == null) {
            interactLinearLayout.addView(interactRelativeLayout, layoutParamsLJ5);
        }
        android.view.a.LIZ(interactLinearLayout);
        if (interactLinearLayout.getParent() == null) {
            interactFrameLayout.addView(interactLinearLayout, layoutParamsLJ);
        }
        android.view.a.LIZ(interactFrameLayout);
        C786410Ut5.W5(interactFrameLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(interactFrameLayout);
        }
        return interactFrameLayout;
    }
}
