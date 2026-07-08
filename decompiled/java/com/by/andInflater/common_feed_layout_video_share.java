package com.by.andInflater;

import X.C19ME;
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
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.feed.platform.cell.interact.view.InteractConstraintLayout;
import com.ss.android.ugc.feed.platform.cell.interact.view.InteractFrameLayout;
import com.ss.android.ugc.feed.platform.cell.interact.view.InteractLinearLayout;
import com.ss.android.ugc.feed.platform.cell.interact.view.InteractRelativeLayout;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.k;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class common_feed_layout_video_share implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        Resources resources = context.getResources();
        InteractFrameLayout interactFrameLayout = new InteractFrameLayout(context);
        interactFrameLayout.setId(R.id.v2z);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-2, -2, viewGroup);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, R.style.hk);
        Resources resources2 = contextThemeWrapper.getResources();
        InteractLinearLayout interactLinearLayout = new InteractLinearLayout(contextThemeWrapper);
        interactLinearLayout.setId(R.id.fuc);
        interactLinearLayout.setGravity(17);
        interactLinearLayout.setOrientation(1);
        interactLinearLayout.setClipChildren(false);
        interactLinearLayout.setImportantForAccessibility(1);
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
        InteractConstraintLayout interactConstraintLayout = new InteractConstraintLayout(contextThemeWrapper);
        interactConstraintLayout.setId(R.id.uz4);
        interactConstraintLayout.setImportantForAccessibility(4);
        ViewGroup.LayoutParams layoutParamsLJ2 = a.LJ((int) TypedValue.applyDimension(1, 50.0f, resources.getDisplayMetrics()), -2, interactLinearLayout);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParamsLJ2)) {
            ((LinearLayout.LayoutParams) layoutParamsLJ2).gravity = 8388613;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParamsLJ2)) {
            ((FrameLayout.LayoutParams) layoutParamsLJ2).gravity = 8388613;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParamsLJ2)) {
            ((DrawerLayout$LayoutParams) layoutParamsLJ2).gravity = 8388613;
        }
        RemoteImageView remoteImageView = new RemoteImageView(contextThemeWrapper);
        remoteImageView.setId(R.id.uzq);
        remoteImageView.setImageResource(R.drawable.cfp);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ2 = a.LJ((int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), interactConstraintLayout);
        if (C19ME.class.isInstance(marginLayoutParamsLJ2)) {
            ((C19ME) marginLayoutParamsLJ2).endToEnd = 0;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ2)) {
            ((C19ME) marginLayoutParamsLJ2).startToStart = 0;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ2)) {
            ((C19ME) marginLayoutParamsLJ2).topToTop = 0;
        }
        a.LIZ(remoteImageView);
        if (remoteImageView.getParent() == null) {
            interactConstraintLayout.addView(remoteImageView, marginLayoutParamsLJ2);
        }
        TuxIconView tuxIconView = new TuxIconView(contextThemeWrapper);
        tuxIconView.setId(R.id.qvq);
        C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        C786410Ut5.ed(tuxIconView, TypedValue.applyDimension(1, 3.0f, resources2.getDisplayMetrics()));
        C786410Ut5.Jc(tuxIconView, TypedValue.applyDimension(1, 2.0f, resources2.getDisplayMetrics()));
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ3 = a.LJ((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), interactConstraintLayout);
        if (C19ME.class.isInstance(marginLayoutParamsLJ3)) {
            i = R.id.uzq;
            ((C19ME) marginLayoutParamsLJ3).bottomToBottom = R.id.uzq;
        } else {
            i = R.id.uzq;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ3)) {
            ((C19ME) marginLayoutParamsLJ3).endToEnd = i;
        }
        a.LIZ(tuxIconView);
        if (tuxIconView.getParent() == null) {
            interactConstraintLayout.addView(tuxIconView, marginLayoutParamsLJ3);
        }
        TuxIconView tuxIconView2 = new TuxIconView(contextThemeWrapper);
        tuxIconView2.setId(R.id.g1p);
        tuxIconView2.setPadding((int) TypedValue.applyDimension(1, 0.5f, resources2.getDisplayMetrics()), tuxIconView2.getPaddingTop(), tuxIconView2.getPaddingRight(), tuxIconView2.getPaddingBottom());
        tuxIconView2.setPadding(tuxIconView2.getPaddingLeft(), (int) TypedValue.applyDimension(1, 2.0f, resources2.getDisplayMetrics()), tuxIconView2.getPaddingRight(), tuxIconView2.getPaddingBottom());
        C786410Ut5.ed(tuxIconView2, TypedValue.applyDimension(1, 5.0f, resources2.getDisplayMetrics()));
        C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ4 = a.LJ((int) TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()), interactConstraintLayout);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ4)) {
            marginLayoutParamsLJ4.setMarginEnd((int) TypedValue.applyDimension(1, 2.0f, resources2.getDisplayMetrics()));
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ4)) {
            ((C19ME) marginLayoutParamsLJ4).bottomToBottom = R.id.uzq;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ4)) {
            ((C19ME) marginLayoutParamsLJ4).endToEnd = 0;
        }
        new k();
        k.LIZ("app:tux_icon", new a.b("2130774372", "raw"), tuxIconView2);
        k.LIZ("app:tux_iconHeight", new a.d("12", "dp"), tuxIconView2);
        k.LIZ("app:tux_iconWidth", new a.d("12", "dp"), tuxIconView2);
        k.LIZ("app:tux_tintColor", new a.b("2131100571", "attr"), tuxIconView2);
        android.view.a.LIZ(tuxIconView2);
        if (tuxIconView2.getParent() == null) {
            interactConstraintLayout.addView(tuxIconView2, marginLayoutParamsLJ4);
        }
        android.view.a.LIZ(interactConstraintLayout);
        if (interactConstraintLayout.getParent() == null) {
            interactLinearLayout.addView(interactConstraintLayout, layoutParamsLJ2);
        }
        InteractRelativeLayout interactRelativeLayout = new InteractRelativeLayout(contextThemeWrapper);
        interactRelativeLayout.setId(R.id.uz8);
        interactRelativeLayout.setLayoutDirection(0);
        ViewGroup.LayoutParams layoutParamsLJ3 = android.view.a.LJ(-2, -2, interactLinearLayout);
        C706680Rnm c706680Rnm = new C706680Rnm(contextThemeWrapper);
        c706680Rnm.setShadowLayer(2.0f, c706680Rnm.getShadowDx(), c706680Rnm.getShadowDy(), c706680Rnm.getShadowColor());
        c706680Rnm.setShadowLayer(c706680Rnm.getShadowRadius(), c706680Rnm.getShadowDx(), 2.0f, c706680Rnm.getShadowColor());
        c706680Rnm.setShadowLayer(c706680Rnm.getShadowRadius(), c706680Rnm.getShadowDx(), c706680Rnm.getShadowDy(), resources2.getColor(R.color.mp));
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.getTheme().obtainStyledAttributes(new int[]{R.attr.ef});
        c706680Rnm.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        c706680Rnm.setId(R.id.uz7);
        c706680Rnm.setLayoutDirection(3);
        c706680Rnm.setGravity(17);
        c706680Rnm.setMaxWidth((int) TypedValue.applyDimension(1, 70.0f, resources2.getDisplayMetrics()));
        c706680Rnm.setMaxLines(1);
        c706680Rnm.setEllipsize(TextUtils.TruncateAt.END);
        c706680Rnm.setImportantForAccessibility(2);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ5 = android.view.a.LJ(-2, -2, interactRelativeLayout);
        if (RelativeLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ5)) {
            ((RelativeLayout.LayoutParams) marginLayoutParamsLJ5).addRule(14, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ5)) {
            marginLayoutParamsLJ5.topMargin = (int) TypedValue.applyDimension(1, -1.4f, resources2.getDisplayMetrics());
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P2_Semibold"), c706680Rnm);
        android.view.a.LIZ(c706680Rnm);
        if (c706680Rnm.getParent() == null) {
            interactRelativeLayout.addView(c706680Rnm, marginLayoutParamsLJ5);
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
