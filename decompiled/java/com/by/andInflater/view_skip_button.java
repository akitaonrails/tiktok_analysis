package com.by.andInflater;

import X.C19ME;
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
import android.widget.LinearLayout;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask.TopViewSkipButton;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class view_skip_button implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        TopViewSkipButton topViewSkipButton = new TopViewSkipButton(context);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -1, viewGroup);
        View view = new View(context);
        view.setId(R.id.v_unClick);
        view.setClickable(true);
        view.setFocusable(true);
        C786410Ut5.LJLLLLLL(8, view);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ2 = a.LJ((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 38.0f, resources.getDisplayMetrics()), topViewSkipButton);
        if (C19ME.class.isInstance(marginLayoutParamsLJ2)) {
            ((C19ME) marginLayoutParamsLJ2).leftToLeft = R.id.tv_skip_ui;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ2)) {
            ((C19ME) marginLayoutParamsLJ2).rightToRight = 0;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ2)) {
            ((C19ME) marginLayoutParamsLJ2).topToTop = 0;
        }
        a.LIZ(view);
        if (view.getParent() == null) {
            topViewSkipButton.addView(view, marginLayoutParamsLJ2);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.tv_skip_ui);
        tuxTextView.setBackgroundResource(R.drawable.d9d);
        tuxTextView.setGravity(17);
        tuxTextView.setPadding((int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()), tuxTextView.getPaddingTop(), tuxTextView.getPaddingRight(), tuxTextView.getPaddingBottom());
        tuxTextView.setPadding(tuxTextView.getPaddingLeft(), tuxTextView.getPaddingTop(), (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()), tuxTextView.getPaddingBottom());
        tuxTextView.setText(2131848712);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.ee});
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ3 = a.LJ(-2, (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), topViewSkipButton);
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ3).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ3).gravity = 17;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ3).gravity = 17;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            marginLayoutParamsLJ3.topMargin = (int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            marginLayoutParamsLJ3.rightMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ3)) {
            ((C19ME) marginLayoutParamsLJ3).rightToRight = 0;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ3)) {
            ((C19ME) marginLayoutParamsLJ3).topToTop = 0;
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P3_Regular"), tuxTextView);
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            topViewSkipButton.addView(tuxTextView, marginLayoutParamsLJ3);
        }
        View view2 = new View(context);
        view2.setId(R.id.bme);
        view2.setClickable(true);
        view2.setFocusable(true);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ4 = android.view.a.LJ((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), topViewSkipButton);
        if (C19ME.class.isInstance(marginLayoutParamsLJ4)) {
            ((C19ME) marginLayoutParamsLJ4).startToStart = R.id.tv_skip_ui;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ4)) {
            ((C19ME) marginLayoutParamsLJ4).endToEnd = R.id.tv_skip_ui;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ4)) {
            ((C19ME) marginLayoutParamsLJ4).bottomToBottom = R.id.tv_skip_ui;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ4)) {
            ((C19ME) marginLayoutParamsLJ4).topToTop = R.id.tv_skip_ui;
        }
        android.view.a.LIZ(view2);
        if (view2.getParent() == null) {
            topViewSkipButton.addView(view2, marginLayoutParamsLJ4);
        }
        android.view.a.LIZ(topViewSkipButton);
        C786410Ut5.W5(topViewSkipButton, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(topViewSkipButton);
        }
        return topViewSkipButton;
    }
}
