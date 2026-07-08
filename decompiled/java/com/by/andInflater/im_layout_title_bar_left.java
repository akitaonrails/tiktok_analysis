package com.by.andInflater;

import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import dc.a;
import kotlin.jvm.internal.Intrinsics;
import ule.b;
import xem.k;

/* JADX INFO: loaded from: classes32.dex */
public class im_layout_title_bar_left implements InterfaceC20742716Ev {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), frameLayout.getPaddingTop(), frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        frameLayout.setPadding(frameLayout.getPaddingLeft(), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        frameLayout.setPadding(frameLayout.getPaddingLeft(), frameLayout.getPaddingTop(), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), frameLayout.getPaddingBottom());
        frameLayout.setPadding(frameLayout.getPaddingLeft(), frameLayout.getPaddingTop(), frameLayout.getPaddingRight(), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        frameLayout.setImportantForAccessibility(1);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-2, -2, viewGroup);
        if (RelativeLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            ((RelativeLayout.LayoutParams) marginLayoutParamsLJ).addRule(20, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            ((RelativeLayout.LayoutParams) marginLayoutParamsLJ).addRule(15, -1);
        }
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ).gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ).gravity = 16;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ).gravity = 16;
        }
        new b();
        a.c cVar = new a.c("true");
        if (Intrinsics.LJFF("android:screenReaderFocusable", "android:screenReaderFocusable") && Build.VERSION.SDK_INT >= 28) {
            frameLayout.setScreenReaderFocusable(ec.a.LIZ(cVar));
        }
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setId(R.id.p20);
        tuxIconView.setImportantForAccessibility(2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((LinearLayout.LayoutParams) layoutParams).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.gravity = 17;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams)) {
            ((DrawerLayout$LayoutParams) layoutParams).gravity = 17;
        }
        new k();
        k.LIZ("app:tux_iconWidth", new a.d("24", "dp"), tuxIconView);
        k.LIZ("app:tux_iconHeight", new a.d("24", "dp"), tuxIconView);
        k.LIZ("app:tux_tintColor", new a.b("2131100622", "attr"), tuxIconView);
        android.view.a.LIZ(tuxIconView);
        if (tuxIconView.getParent() == null) {
            frameLayout.addView(tuxIconView, layoutParams);
        }
        android.view.a.LIZ(frameLayout);
        C786410Ut5.W5(frameLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        return frameLayout;
    }
}
