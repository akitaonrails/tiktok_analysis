package com.by.andInflater;

import X.C706680Rnm;
import X.C731940SnQ;
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
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.feed.platform.cell.interact.view.InteractFrameLayout;
import com.ss.android.ugc.feed.platform.cell.interact.view.InteractLinearLayout;
import com.ss.android.ugc.feed.platform.cell.interact.view.InteractRelativeLayout;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class common_feed_layout_video_digg implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, R.style.hk);
        Resources resources2 = contextThemeWrapper.getResources();
        InteractLinearLayout interactLinearLayout = new InteractLinearLayout(contextThemeWrapper);
        interactLinearLayout.setId(R.id.fuc);
        interactLinearLayout.setClipChildren(false);
        interactLinearLayout.setFocusable(true);
        interactLinearLayout.setFocusableInTouchMode(true);
        interactLinearLayout.setOrientation(1);
        interactLinearLayout.setImportantForAccessibility(1);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-2, -2, viewGroup);
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ).gravity = 8388613;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ).gravity = 8388613;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ).gravity = 8388613;
        }
        InteractFrameLayout interactFrameLayout = new InteractFrameLayout(contextThemeWrapper);
        interactFrameLayout.setBackgroundResource(R.drawable.b_j);
        interactFrameLayout.setPadding((int) TypedValue.applyDimension(1, 0.0f, resources2.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources2.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources2.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources2.getDisplayMetrics()));
        interactFrameLayout.setId(R.id.ftz);
        interactFrameLayout.setClipChildren(false);
        interactFrameLayout.setFocusable(false);
        interactFrameLayout.setFocusableInTouchMode(false);
        interactFrameLayout.setImportantForAccessibility(4);
        ViewGroup.LayoutParams layoutParamsLJ = a.LJ((int) TypedValue.applyDimension(1, 50.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 50.0f, resources.getDisplayMetrics()), interactLinearLayout);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParamsLJ)) {
            ((LinearLayout.LayoutParams) layoutParamsLJ).gravity = 8388613;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParamsLJ)) {
            ((FrameLayout.LayoutParams) layoutParamsLJ).gravity = 8388613;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParamsLJ)) {
            ((DrawerLayout$LayoutParams) layoutParamsLJ).gravity = 8388613;
        }
        C731940SnQ c731940SnQ = new C731940SnQ(contextThemeWrapper);
        c731940SnQ.setId(R.id.ftt);
        c731940SnQ.setContentDescription(contextThemeWrapper.getResources().getString(2131822937));
        c731940SnQ.setFocusable(false);
        c731940SnQ.setFocusableInTouchMode(false);
        c731940SnQ.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ2 = a.LJ((int) TypedValue.applyDimension(1, 50.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 50.0f, resources.getDisplayMetrics()), interactFrameLayout);
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ2).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ2).gravity = 17;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ2).gravity = 17;
        }
        a.LIZ(c731940SnQ);
        if (c731940SnQ.getParent() == null) {
            interactFrameLayout.addView(c731940SnQ, marginLayoutParamsLJ2);
        }
        a.LIZ(interactFrameLayout);
        if (interactFrameLayout.getParent() == null) {
            interactLinearLayout.addView(interactFrameLayout, layoutParamsLJ);
        }
        InteractRelativeLayout interactRelativeLayout = new InteractRelativeLayout(contextThemeWrapper);
        interactRelativeLayout.setId(R.id.fu1);
        interactRelativeLayout.setLayoutDirection(0);
        ViewGroup.LayoutParams layoutParamsLJ2 = a.LJ(-2, -2, interactLinearLayout);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParamsLJ2)) {
            ((LinearLayout.LayoutParams) layoutParamsLJ2).gravity = 1;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParamsLJ2)) {
            ((FrameLayout.LayoutParams) layoutParamsLJ2).gravity = 1;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParamsLJ2)) {
            ((DrawerLayout$LayoutParams) layoutParamsLJ2).gravity = 1;
        }
        C706680Rnm c706680Rnm = new C706680Rnm(contextThemeWrapper);
        c706680Rnm.setShadowLayer(2.0f, c706680Rnm.getShadowDx(), c706680Rnm.getShadowDy(), c706680Rnm.getShadowColor());
        c706680Rnm.setShadowLayer(c706680Rnm.getShadowRadius(), c706680Rnm.getShadowDx(), 2.0f, c706680Rnm.getShadowColor());
        c706680Rnm.setShadowLayer(c706680Rnm.getShadowRadius(), c706680Rnm.getShadowDx(), c706680Rnm.getShadowDy(), resources2.getColor(R.color.mp));
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.getTheme().obtainStyledAttributes(new int[]{R.attr.ef});
        c706680Rnm.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        c706680Rnm.setId(R.id.fu0);
        c706680Rnm.setLayoutDirection(3);
        c706680Rnm.setPadding(c706680Rnm.getPaddingLeft(), c706680Rnm.getPaddingTop(), c706680Rnm.getPaddingRight(), (int) TypedValue.applyDimension(1, 16.0f, resources2.getDisplayMetrics()));
        c706680Rnm.setFocusable(false);
        c706680Rnm.setMaxLines(1);
        c706680Rnm.setFocusableInTouchMode(false);
        c706680Rnm.setImportantForAccessibility(2);
        c706680Rnm.setEllipsize(TextUtils.TruncateAt.END);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ3 = a.LJ(-2, -2, interactRelativeLayout);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            marginLayoutParamsLJ3.topMargin = (int) TypedValue.applyDimension(1, -6.4f, resources2.getDisplayMetrics());
        }
        if (RelativeLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            ((RelativeLayout.LayoutParams) marginLayoutParamsLJ3).addRule(14, -1);
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P2_Semibold"), c706680Rnm);
        android.view.a.LIZ(c706680Rnm);
        if (c706680Rnm.getParent() == null) {
            interactRelativeLayout.addView(c706680Rnm, marginLayoutParamsLJ3);
        }
        android.view.a.LIZ(interactRelativeLayout);
        if (interactRelativeLayout.getParent() == null) {
            interactLinearLayout.addView(interactRelativeLayout, layoutParamsLJ2);
        }
        TuxTextView tuxTextView = new TuxTextView(contextThemeWrapper);
        tuxTextView.setShadowLayer(2.0f, tuxTextView.getShadowDx(), tuxTextView.getShadowDy(), tuxTextView.getShadowColor());
        tuxTextView.setShadowLayer(tuxTextView.getShadowRadius(), tuxTextView.getShadowDx(), 2.0f, tuxTextView.getShadowColor());
        tuxTextView.setShadowLayer(tuxTextView.getShadowRadius(), tuxTextView.getShadowDx(), tuxTextView.getShadowDy(), resources2.getColor(R.color.mp));
        TypedArray typedArrayObtainStyledAttributes2 = contextThemeWrapper.getTheme().obtainStyledAttributes(new int[]{R.attr.ef});
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes2.getColor(0, 0));
        typedArrayObtainStyledAttributes2.recycle();
        tuxTextView.setId(R.id.fu9);
        tuxTextView.setFocusable(false);
        tuxTextView.setFocusableInTouchMode(false);
        tuxTextView.setImportantForAccessibility(2);
        tuxTextView.setPadding(tuxTextView.getPaddingLeft(), tuxTextView.getPaddingTop(), tuxTextView.getPaddingRight(), (int) TypedValue.applyDimension(1, 16.0f, resources2.getDisplayMetrics()));
        C786410Ut5.LJLLLLLL(8, tuxTextView);
        tuxTextView.setText("Like");
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ4 = android.view.a.LJ(-2, -2, interactLinearLayout);
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ4)) {
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ4).gravity = 1;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ4)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ4).gravity = 1;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ4)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ4).gravity = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ4)) {
            marginLayoutParamsLJ4.topMargin = (int) TypedValue.applyDimension(1, -6.4f, resources2.getDisplayMetrics());
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P2_Semibold"), tuxTextView);
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            interactLinearLayout.addView(tuxTextView, marginLayoutParamsLJ4);
        }
        android.view.a.LIZ(interactLinearLayout);
        C786410Ut5.W5(interactLinearLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(interactLinearLayout);
        }
        return interactLinearLayout;
    }
}
