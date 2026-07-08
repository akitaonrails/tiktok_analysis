package com.by.andInflater;

import X.C16G0;
import X.C16G1;
import X.C16GX;
import X.C16GZ;
import X.C1845970y8Z;
import X.C1846010y8d;
import X.C20553115bd;
import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.k;

/* JADX INFO: loaded from: classes32.dex */
public class explore_fragment implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        int i2;
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.hh5);
        linearLayout.setOrientation(1);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -1, viewGroup);
        View view = new View(context);
        view.setId(R.id.ydi);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        a.LIZ(view);
        if (view.getParent() == null) {
            linearLayout.addView(view, layoutParams);
        }
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(R.id.vs_explore_nav_bar);
        C786410Ut5.LLIIIJ(viewStub, 8);
        viewStub.setLayoutResource(R.layout.c5u);
        ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        viewStub.setInflatedId(-1);
        a.LIZ(viewStub);
        if (viewStub.getParent() == null) {
            linearLayout.addView(viewStub, layoutParams2);
        }
        ViewStub viewStub2 = new ViewStub(context);
        viewStub2.setId(R.id.vs_search_layout);
        viewStub2.setLayoutResource(R.layout.c5p);
        C786410Ut5.LLIIIJ(viewStub2, 8);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.setMarginStart((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.setMarginEnd((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin = (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics());
        }
        viewStub2.setInflatedId(-1);
        a.LIZ(viewStub2);
        if (viewStub2.getParent() == null) {
            linearLayout.addView(viewStub2, layoutParams3);
        }
        C16G0 c16g0 = new C16G0(context, null);
        c16g0.setId(R.id.nwh);
        c16g0.setClipChildren(false);
        c16g0.setClipToPadding(false);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.weight = 1;
        }
        C16GX c16gx = new C16GX(context, null);
        c16gx.setId(R.id.hgn);
        C786410Ut5.LLZZZZ(c16gx, 8);
        c16gx.setBackgroundColor(resources.getColor(R.color.dr));
        c16gx.setClipChildren(false);
        c16gx.setClipToPadding(false);
        ViewGroup.LayoutParams c16g1 = new C16G1(-1, -2);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.hgo);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        ViewGroup.LayoutParams c16gz = new C16GZ(-2);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.hhk);
        C786410Ut5.LJLLLLLL(8, frameLayout2);
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        ViewGroup.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, -2);
        a.LIZ(frameLayout2);
        if (frameLayout2.getParent() == null) {
            frameLayout.addView(frameLayout2, layoutParams5);
        }
        C1845970y8Z c1845970y8Z = new C1845970y8Z(context, null, 6);
        c1845970y8Z.setId(R.id.hhh);
        ViewGroup.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, -2);
        View c1846010y8d = new C1846010y8d(context, null, 6);
        c1846010y8d.setId(R.id.hhi);
        ViewGroup.LayoutParams layoutParamsLJ = a.LJ(-1, -2, c1845970y8Z);
        a.LIZ(c1846010y8d);
        if (c1846010y8d.getParent() == null) {
            c1845970y8Z.addView(c1846010y8d, layoutParamsLJ);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setId(R.id.hgp);
        linearLayout2.setClickable(true);
        linearLayout2.setFocusable(true);
        linearLayout2.setGravity(16);
        linearLayout2.setOrientation(0);
        linearLayout2.setPadding((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), linearLayout2.getPaddingTop(), linearLayout2.getPaddingRight(), linearLayout2.getPaddingBottom());
        linearLayout2.setPadding(linearLayout2.getPaddingLeft(), linearLayout2.getPaddingTop(), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), linearLayout2.getPaddingBottom());
        C786410Ut5.LJLLLLLL(8, linearLayout2);
        ViewGroup.LayoutParams layoutParamsLJ2 = a.LJ(-2, (int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()), c1845970y8Z);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParamsLJ2)) {
            ((LinearLayout.LayoutParams) layoutParamsLJ2).gravity = 8388629;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParamsLJ2)) {
            ((FrameLayout.LayoutParams) layoutParamsLJ2).gravity = 8388629;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParamsLJ2)) {
            ((DrawerLayout$LayoutParams) layoutParamsLJ2).gravity = 8388629;
        }
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setId(R.id.hgq);
        tuxIconView.setImportantForAccessibility(2);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        new k();
        k.LIZ("app:tux_icon", new a.b("2130772442", "raw"), tuxIconView);
        k.LIZ("app:tux_tintColor", new a.b("2131099768", "attr"), tuxIconView);
        k.LIZ("app:tux_iconHeight", new a.d("16", "dp"), tuxIconView);
        k.LIZ("app:tux_iconWidth", new a.d("16", "dp"), tuxIconView);
        android.view.a.LIZ(tuxIconView);
        if (tuxIconView.getParent() == null) {
            linearLayout2.addView(tuxIconView, layoutParams7);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.hgr);
        tuxTextView.setMaxLines(1);
        tuxTextView.setText(2131850685);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.ee});
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams8)) {
            layoutParams8.setMarginStart((int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()));
        }
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            linearLayout2.addView(tuxTextView, layoutParams8);
        }
        android.view.a.LIZ(linearLayout2);
        if (linearLayout2.getParent() == null) {
            c1845970y8Z.addView(linearLayout2, layoutParamsLJ2);
        }
        TuxIconView tuxIconView2 = new TuxIconView(context);
        tuxIconView2.setId(R.id.hh_);
        tuxIconView2.setImportantForAccessibility(2);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ2 = android.view.a.LJ((int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), c1845970y8Z);
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            i = 8388629;
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ2).gravity = 8388629;
        } else {
            i = 8388629;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ2).gravity = i;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ2).gravity = i;
        }
        new k();
        k.LIZ("app:tux_icon", new a.b("2130773650", "raw"), tuxIconView2);
        k.LIZ("app:tux_tintColor", new a.b("2131100622", "attr"), tuxIconView2);
        k.LIZ("app:tux_iconHeight", new a.d("20", "dp"), tuxIconView2);
        k.LIZ("app:tux_iconWidth", new a.d("20", "dp"), tuxIconView2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            marginLayoutParamsLJ2.setMarginStart((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        android.view.a.LIZ(tuxIconView2);
        if (tuxIconView2.getParent() == null) {
            c1845970y8Z.addView(tuxIconView2, marginLayoutParamsLJ2);
        }
        android.view.a.LIZ(c1845970y8Z);
        if (c1845970y8Z.getParent() == null) {
            frameLayout.addView(c1845970y8Z, layoutParams6);
        }
        android.view.a.LIZ(frameLayout);
        if (frameLayout.getParent() == null) {
            c16gx.addView(frameLayout, c16gz);
        }
        android.view.a.LIZ(c16gx);
        if (c16gx.getParent() == null) {
            c16g0.addView(c16gx, c16g1);
        }
        C20553115bd c20553115bd = new C20553115bd(context, null);
        c20553115bd.setId(R.id.hhs);
        c20553115bd.setClipChildren(false);
        c20553115bd.setClipToPadding(false);
        C16G1 c16g12 = new C16G1(-1, -1);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c16g12)) {
            ((ViewGroup.MarginLayoutParams) c16g12).topMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        android.view.a.LIZ(c20553115bd);
        if (c20553115bd.getParent() == null) {
            c16g0.addView(c20553115bd, c16g12);
        }
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setId(R.id.hhp);
        linearLayout3.setBackgroundResource(R.drawable.brj);
        linearLayout3.setClickable(true);
        linearLayout3.setContentDescription(context.getResources().getString(2131823350));
        linearLayout3.setElevation(TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        linearLayout3.setFocusable(true);
        linearLayout3.setGravity(16);
        linearLayout3.setOrientation(0);
        linearLayout3.setPadding((int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()), linearLayout3.getPaddingTop(), linearLayout3.getPaddingRight(), linearLayout3.getPaddingBottom());
        linearLayout3.setPadding(linearLayout3.getPaddingLeft(), (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()), linearLayout3.getPaddingRight(), linearLayout3.getPaddingBottom());
        linearLayout3.setPadding(linearLayout3.getPaddingLeft(), linearLayout3.getPaddingTop(), (int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics()), linearLayout3.getPaddingBottom());
        linearLayout3.setPadding(linearLayout3.getPaddingLeft(), linearLayout3.getPaddingTop(), linearLayout3.getPaddingRight(), (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()));
        C786410Ut5.LJLLLLLL(8, linearLayout3);
        ViewGroup.MarginLayoutParams c16g13 = new C16G1(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(c16g13)) {
            ((LinearLayout.LayoutParams) c16g13).gravity = 8388691;
        }
        if (FrameLayout.LayoutParams.class.isInstance(c16g13)) {
            ((FrameLayout.LayoutParams) c16g13).gravity = 8388691;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(c16g13)) {
            ((DrawerLayout$LayoutParams) c16g13).gravity = 8388691;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c16g13)) {
            i2 = 1;
            c16g13.setMarginStart((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        } else {
            i2 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c16g13)) {
            c16g13.bottomMargin = (int) TypedValue.applyDimension(i2, 48.0f, resources.getDisplayMetrics());
        }
        TuxIconView tuxIconView3 = new TuxIconView(context);
        tuxIconView3.setId(R.id.hhq);
        tuxIconView3.setImportantForAccessibility(2);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 28.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 28.0f, resources.getDisplayMetrics()));
        new k();
        k.LIZ("app:tux_icon", new a.b("2130772430", "raw"), tuxIconView3);
        k.LIZ("app:tux_iconHeight", new a.d("28", "dp"), tuxIconView3);
        k.LIZ("app:tux_iconWidth", new a.d("28", "dp"), tuxIconView3);
        k.LIZ("app:tux_tintColor", new a.b("2131100622", "attr"), tuxIconView3);
        android.view.a.LIZ(tuxIconView3);
        if (tuxIconView3.getParent() == null) {
            linearLayout3.addView(tuxIconView3, layoutParams9);
        }
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.hhr);
        tuxTextView2.setMaxLines(1);
        tuxTextView2.setText(R.string.e8n);
        TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1h});
        tuxTextView2.setTextColor(typedArrayObtainStyledAttributes2.getColor(0, 0));
        typedArrayObtainStyledAttributes2.recycle();
        tuxTextView2.setTextSize(2, 15.0f);
        tuxTextView2.setTypeface(Typeface.defaultFromStyle(1));
        LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams10)) {
            layoutParams10.setMarginStart((int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()));
        }
        android.view.a.LIZ(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            linearLayout3.addView(tuxTextView2, layoutParams10);
        }
        android.view.a.LIZ(linearLayout3);
        if (linearLayout3.getParent() == null) {
            c16g0.addView(linearLayout3, c16g13);
        }
        android.view.a.LIZ(c16g0);
        if (c16g0.getParent() == null) {
            linearLayout.addView(c16g0, layoutParams4);
        }
        View view2 = new View(context);
        view2.setId(R.id.ch3);
        TypedArray typedArrayObtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.c3});
        view2.setBackgroundColor(typedArrayObtainStyledAttributes3.getColor(0, 0));
        typedArrayObtainStyledAttributes3.recycle();
        ViewGroup.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(-1, -2);
        android.view.a.LIZ(view2);
        if (view2.getParent() == null) {
            linearLayout.addView(view2, layoutParams11);
        }
        android.view.a.LIZ(linearLayout);
        C786410Ut5.W5(linearLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(linearLayout);
        }
        return linearLayout;
    }
}
