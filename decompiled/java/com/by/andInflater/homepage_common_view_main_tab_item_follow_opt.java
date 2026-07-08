package com.by.andInflater;

import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class homepage_common_view_main_tab_item_follow_opt implements InterfaceC20742716Ev {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-2, -2, viewGroup);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setPadding((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), tuxTextView.getPaddingTop(), tuxTextView.getPaddingRight(), tuxTextView.getPaddingBottom());
        tuxTextView.setPadding(tuxTextView.getPaddingLeft(), tuxTextView.getPaddingTop(), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), tuxTextView.getPaddingBottom());
        tuxTextView.setLines(1);
        tuxTextView.setPadding((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), tuxTextView.getPaddingTop(), tuxTextView.getPaddingRight(), tuxTextView.getPaddingBottom());
        tuxTextView.setPadding(tuxTextView.getPaddingLeft(), tuxTextView.getPaddingTop(), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), tuxTextView.getPaddingBottom());
        tuxTextView.setGravity(17);
        C786410Ut5.T4(tuxTextView, 0.6f);
        tuxTextView.setTextColor(resources.getColorStateList(R.color.ao));
        tuxTextView.setId(android.R.id.text1);
        tuxTextView.setText(R.string.vch);
        C786410Ut5.LJLLLLLL(0, tuxTextView);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 58.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            ((RelativeLayout.LayoutParams) layoutParams2).addRule(15, -1);
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams2)) {
            ((FrameLayout.LayoutParams) layoutParams2).gravity = 17;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams2)) {
            ((DrawerLayout$LayoutParams) layoutParams2).gravity = 17;
        }
        new o();
        o.LIZ("app:tux_font", new a.c("H3_Semibold"), tuxTextView);
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            linearLayout.addView(tuxTextView, layoutParams2);
        }
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(R.id.igu);
        viewStub.setInflatedId(R.id.igt);
        viewStub.setLayoutResource(R.layout.cdk);
        ViewGroup.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        android.view.a.LIZ(viewStub);
        if (viewStub.getParent() == null) {
            linearLayout.addView(viewStub, layoutParams3);
        }
        ViewStub viewStub2 = new ViewStub(context);
        viewStub2.setId(R.id.tv_tab_dot_stub);
        viewStub2.setInflatedId(R.id.tv_tab_dot);
        viewStub2.setLayoutResource(R.layout.cdn);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.setMarginStart((int) TypedValue.applyDimension(1, -8.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin = (int) TypedValue.applyDimension(1, 17.0f, resources.getDisplayMetrics());
        }
        android.view.a.LIZ(viewStub2);
        if (viewStub2.getParent() == null) {
            linearLayout.addView(viewStub2, layoutParams4);
        }
        ViewStub viewStub3 = new ViewStub(context);
        viewStub3.setId(R.id.tv_tab_dot_living_stub);
        viewStub3.setInflatedId(R.id.n9l);
        viewStub3.setLayoutResource(R.layout.cdm);
        viewStub3.setPadding((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), viewStub3.getPaddingTop(), viewStub3.getPaddingRight(), viewStub3.getPaddingBottom());
        viewStub3.setPadding(viewStub3.getPaddingLeft(), viewStub3.getPaddingTop(), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), viewStub3.getPaddingBottom());
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.setMarginStart((int) TypedValue.applyDimension(1, -18.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            ((ViewGroup.MarginLayoutParams) layoutParams5).topMargin = (int) TypedValue.applyDimension(1, 13.0f, resources.getDisplayMetrics());
        }
        android.view.a.LIZ(viewStub3);
        if (viewStub3.getParent() == null) {
            linearLayout.addView(viewStub3, layoutParams5);
        }
        android.view.a.LIZ(linearLayout);
        if (linearLayout.getParent() == null) {
            frameLayout.addView(linearLayout, layoutParams);
        }
        ViewStub viewStub4 = new ViewStub(context);
        viewStub4.setId(R.id.tv_tab_dot_count_stub);
        viewStub4.setInflatedId(R.id.tv_tab_dot_count);
        viewStub4.setLayoutResource(R.layout.cdl);
        if (TextView.class.isInstance(viewStub4)) {
            android.view.a.LJII((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), viewStub4);
        } else {
            viewStub4.setMinimumWidth((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        viewStub4.setPadding((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()), viewStub4.getPaddingTop(), (int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()), viewStub4.getPaddingBottom());
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams6)) {
            ((LinearLayout.LayoutParams) layoutParams6).gravity = 8388613;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.gravity = 8388613;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams6)) {
            ((DrawerLayout$LayoutParams) layoutParams6).gravity = 8388613;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.setMarginStart((int) TypedValue.applyDimension(1, -8.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams6)) {
            ((ViewGroup.MarginLayoutParams) layoutParams6).topMargin = (int) TypedValue.applyDimension(1, 13.0f, resources.getDisplayMetrics());
        }
        android.view.a.LIZ(viewStub4);
        if (viewStub4.getParent() == null) {
            frameLayout.addView(viewStub4, layoutParams6);
        }
        android.view.a.LIZ(frameLayout);
        C786410Ut5.W5(frameLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        return frameLayout;
    }
}
