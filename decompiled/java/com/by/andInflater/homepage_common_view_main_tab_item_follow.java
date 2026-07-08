package com.by.andInflater;

import X.C424620Gku;
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
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class homepage_common_view_main_tab_item_follow implements InterfaceC20742716Ev {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-2, -2, viewGroup);
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
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 58.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(15, -1);
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams)) {
            ((DrawerLayout$LayoutParams) layoutParams).gravity = 17;
        }
        new o();
        o.LIZ("app:tux_font", new a.c("H3_Semibold"), tuxTextView);
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            linearLayout.addView(tuxTextView, layoutParams);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.igt);
        if (TextView.class.isInstance(frameLayout)) {
            android.view.a.LJII((int) TypedValue.applyDimension(1, 53.0f, resources.getDisplayMetrics()), frameLayout);
        } else {
            frameLayout.setMinimumWidth((int) TypedValue.applyDimension(1, 53.0f, resources.getDisplayMetrics()));
        }
        frameLayout.setPadding((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), frameLayout.getPaddingTop(), frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        frameLayout.setPadding(frameLayout.getPaddingLeft(), frameLayout.getPaddingTop(), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), frameLayout.getPaddingBottom());
        C786410Ut5.LJLLLLLL(8, frameLayout);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams2)) {
            ((FrameLayout.LayoutParams) layoutParams2).gravity = 17;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams2)) {
            ((DrawerLayout$LayoutParams) layoutParams2).gravity = 17;
        }
        C424620Gku c424620Gku = new C424620Gku(context);
        c424620Gku.setId(R.id.ldc);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.setMarginStart((int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            ((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin = (int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics());
        }
        android.view.a.LIZ(c424620Gku);
        if (c424620Gku.getParent() == null) {
            frameLayout.addView(c424620Gku, layoutParams3);
        }
        C424620Gku c424620Gku2 = new C424620Gku(context);
        c424620Gku2.setId(R.id.ldb);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.setMarginStart((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            ((ViewGroup.MarginLayoutParams) layoutParams4).leftMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        }
        android.view.a.LIZ(c424620Gku2);
        if (c424620Gku2.getParent() == null) {
            frameLayout.addView(c424620Gku2, layoutParams4);
        }
        C424620Gku c424620Gku3 = new C424620Gku(context);
        c424620Gku3.setId(R.id.lda);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        android.view.a.LIZ(c424620Gku3);
        if (c424620Gku3.getParent() == null) {
            frameLayout.addView(c424620Gku3, layoutParams5);
        }
        android.view.a.LIZ(frameLayout);
        if (frameLayout.getParent() == null) {
            linearLayout.addView(frameLayout, layoutParams2);
        }
        View view = new View(context);
        view.setId(R.id.tv_tab_dot);
        view.setBackgroundResource(R.drawable.bug);
        C786410Ut5.LJLLLLLL(0, view);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.setMarginStart((int) TypedValue.applyDimension(1, -8.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams6)) {
            ((ViewGroup.MarginLayoutParams) layoutParams6).topMargin = (int) TypedValue.applyDimension(1, 17.0f, resources.getDisplayMetrics());
        }
        android.view.a.LIZ(view);
        if (view.getParent() == null) {
            linearLayout.addView(view, layoutParams6);
        }
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.tv_tab_dot_count);
        tuxTextView2.setBackgroundResource(R.drawable.buh);
        tuxTextView2.setGravity(17);
        if (TextView.class.isInstance(tuxTextView2)) {
            android.view.a.LJII((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), tuxTextView2);
        } else {
            tuxTextView2.setMinimumWidth((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        tuxTextView2.setPadding((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()), tuxTextView2.getPaddingTop(), tuxTextView2.getPaddingRight(), tuxTextView2.getPaddingBottom());
        tuxTextView2.setPadding(tuxTextView2.getPaddingLeft(), tuxTextView2.getPaddingTop(), (int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()), tuxTextView2.getPaddingBottom());
        tuxTextView2.setText("99+");
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.ee});
        tuxTextView2.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        C786410Ut5.LJLLLLLL(8, tuxTextView2);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams7)) {
            ((ViewGroup.MarginLayoutParams) layoutParams7).leftMargin = (int) TypedValue.applyDimension(1, -8.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams7)) {
            layoutParams7.setMarginStart((int) TypedValue.applyDimension(1, -8.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams7)) {
            ((ViewGroup.MarginLayoutParams) layoutParams7).topMargin = (int) TypedValue.applyDimension(1, 13.0f, resources.getDisplayMetrics());
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P3_Regular"), tuxTextView2);
        android.view.a.LIZ(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            linearLayout.addView(tuxTextView2, layoutParams7);
        }
        TuxTextView tuxTextView3 = new TuxTextView(context);
        tuxTextView3.setId(R.id.n9l);
        tuxTextView3.setBackgroundResource(R.drawable.bui);
        tuxTextView3.setGravity(17);
        tuxTextView3.setMaxWidth((int) TypedValue.applyDimension(1, 64.0f, resources.getDisplayMetrics()));
        if (TextView.class.isInstance(tuxTextView3)) {
            android.view.a.LJII((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), tuxTextView3);
        } else {
            tuxTextView3.setMinimumWidth((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        tuxTextView3.setPadding((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), tuxTextView3.getPaddingTop(), tuxTextView3.getPaddingRight(), tuxTextView3.getPaddingBottom());
        tuxTextView3.setPadding(tuxTextView3.getPaddingLeft(), tuxTextView3.getPaddingTop(), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), tuxTextView3.getPaddingBottom());
        tuxTextView3.setText("LIVE");
        TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.ee});
        tuxTextView3.setTextColor(typedArrayObtainStyledAttributes2.getColor(0, 0));
        typedArrayObtainStyledAttributes2.recycle();
        C786410Ut5.LJLLLLLL(8, tuxTextView3);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams8)) {
            ((ViewGroup.MarginLayoutParams) layoutParams8).leftMargin = (int) TypedValue.applyDimension(1, -18.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams8)) {
            layoutParams8.setMarginStart((int) TypedValue.applyDimension(1, -18.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams8)) {
            ((ViewGroup.MarginLayoutParams) layoutParams8).topMargin = (int) TypedValue.applyDimension(1, 13.0f, resources.getDisplayMetrics());
        }
        new o();
        o.LIZ("app:tux_font", new a.c("SmallText2_Semibold"), tuxTextView3);
        android.view.a.LIZ(tuxTextView3);
        if (tuxTextView3.getParent() == null) {
            linearLayout.addView(tuxTextView3, layoutParams8);
        }
        android.view.a.LIZ(linearLayout);
        C786410Ut5.W5(linearLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(linearLayout);
        }
        return linearLayout;
    }
}
