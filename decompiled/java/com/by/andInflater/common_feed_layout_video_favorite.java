package com.by.andInflater;

import X.C706680Rnm;
import X.C731860SnI;
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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.ss.android.ugc.feed.platform.cell.interact.view.InteractFrameLayout;
import com.ss.android.ugc.feed.platform.cell.interact.view.InteractLinearLayout;
import com.ss.android.ugc.feed.platform.cell.interact.view.InteractRelativeLayout;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class common_feed_layout_video_favorite implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        Resources resources = context.getResources();
        InteractFrameLayout interactFrameLayout = new InteractFrameLayout(context);
        interactFrameLayout.setId(R.id.hqy);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-2, -2, viewGroup);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, R.style.hk);
        Resources resources2 = contextThemeWrapper.getResources();
        InteractLinearLayout interactLinearLayout = new InteractLinearLayout(contextThemeWrapper);
        interactLinearLayout.setId(R.id.hqz);
        interactLinearLayout.setClipChildren(false);
        interactLinearLayout.setFocusable(false);
        interactLinearLayout.setFocusableInTouchMode(false);
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
        interactFrameLayout2.setId(R.id.hpv);
        interactFrameLayout2.setFocusable(false);
        interactFrameLayout2.setFocusableInTouchMode(false);
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
        C731860SnI c731860SnI = new C731860SnI(contextThemeWrapper);
        c731860SnI.setId(R.id.hpp);
        c731860SnI.setFocusable(false);
        c731860SnI.setFocusableInTouchMode(false);
        c731860SnI.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ2 = a.LJ((int) TypedValue.applyDimension(1, 50.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 50.0f, resources.getDisplayMetrics()), interactFrameLayout2);
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ2).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ2).gravity = 17;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ2).gravity = 17;
        }
        a.LIZ(c731860SnI);
        if (c731860SnI.getParent() == null) {
            interactFrameLayout2.addView(c731860SnI, marginLayoutParamsLJ2);
        }
        a.LIZ(interactFrameLayout2);
        if (interactFrameLayout2.getParent() == null) {
            interactLinearLayout.addView(interactFrameLayout2, layoutParamsLJ2);
        }
        InteractRelativeLayout interactRelativeLayout = new InteractRelativeLayout(contextThemeWrapper);
        interactRelativeLayout.setId(R.id.hpy);
        interactRelativeLayout.setLayoutDirection(0);
        ViewGroup.LayoutParams layoutParamsLJ3 = a.LJ(-2, -2, interactLinearLayout);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParamsLJ3)) {
            ((LinearLayout.LayoutParams) layoutParamsLJ3).gravity = 1;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParamsLJ3)) {
            ((FrameLayout.LayoutParams) layoutParamsLJ3).gravity = 1;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParamsLJ3)) {
            ((DrawerLayout$LayoutParams) layoutParamsLJ3).gravity = 1;
        }
        C706680Rnm c706680Rnm = new C706680Rnm(contextThemeWrapper);
        c706680Rnm.setShadowLayer(2.0f, c706680Rnm.getShadowDx(), c706680Rnm.getShadowDy(), c706680Rnm.getShadowColor());
        c706680Rnm.setShadowLayer(c706680Rnm.getShadowRadius(), c706680Rnm.getShadowDx(), 2.0f, c706680Rnm.getShadowColor());
        c706680Rnm.setShadowLayer(c706680Rnm.getShadowRadius(), c706680Rnm.getShadowDx(), c706680Rnm.getShadowDy(), resources2.getColor(R.color.mp));
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.getTheme().obtainStyledAttributes(new int[]{R.attr.ef});
        c706680Rnm.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        c706680Rnm.setId(R.id.hpx);
        c706680Rnm.setLayoutDirection(3);
        c706680Rnm.setFocusable(false);
        c706680Rnm.setMaxLines(1);
        c706680Rnm.setFocusableInTouchMode(false);
        c706680Rnm.setImportantForAccessibility(2);
        c706680Rnm.setPadding(c706680Rnm.getPaddingLeft(), c706680Rnm.getPaddingTop(), c706680Rnm.getPaddingRight(), (int) TypedValue.applyDimension(1, 16.0f, resources2.getDisplayMetrics()));
        c706680Rnm.setEllipsize(TextUtils.TruncateAt.END);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ3 = a.LJ(-2, -2, interactRelativeLayout);
        if (RelativeLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            ((RelativeLayout.LayoutParams) marginLayoutParamsLJ3).addRule(14, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            marginLayoutParamsLJ3.topMargin = (int) TypedValue.applyDimension(1, -3.4f, resources2.getDisplayMetrics());
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P2_Semibold"), c706680Rnm);
        android.view.a.LIZ(c706680Rnm);
        if (c706680Rnm.getParent() == null) {
            interactRelativeLayout.addView(c706680Rnm, marginLayoutParamsLJ3);
        }
        android.view.a.LIZ(interactRelativeLayout);
        if (interactRelativeLayout.getParent() == null) {
            interactLinearLayout.addView(interactRelativeLayout, layoutParamsLJ3);
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
