package com.by.andInflater;

import X.C1235900iGa;
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
import android.widget.Space;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.k;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class aweme_comment_item_comment_reply_button implements InterfaceC20742716Ev {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        int i2;
        float f;
        int i3;
        int i4;
        float f2;
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.tqy);
        frameLayout.setPadding(frameLayout.getPaddingLeft(), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        frameLayout.setPadding(frameLayout.getPaddingLeft(), frameLayout.getPaddingTop(), frameLayout.getPaddingRight(), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        frameLayout.setClipChildren(false);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -2, viewGroup);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.me9);
        linearLayout.setClipChildren(false);
        linearLayout.setGravity(16);
        linearLayout.setOrientation(0);
        C786410Ut5.LJLLLLLL(0, linearLayout);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            layoutParams.setMarginEnd((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        View view = new View(context);
        view.setId(R.id.ml4);
        view.setImportantForAccessibility(2);
        ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 54.0f, resources.getDisplayMetrics()), -1);
        a.LIZ(view);
        if (view.getParent() == null) {
            linearLayout.addView(view, layoutParams2);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setId(R.id.fzh);
        linearLayout2.setGravity(16);
        linearLayout2.setOrientation(0);
        linearLayout2.setImportantForAccessibility(2);
        ViewGroup.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -1);
        View view2 = new View(context);
        view2.setId(R.id.view_more_comment_divider);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a02});
        view2.setBackgroundColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.5f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.setMarginEnd((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        a.LIZ(view2);
        if (view2.getParent() == null) {
            linearLayout2.addView(view2, layoutParams4);
        }
        a.LIZ(linearLayout2);
        if (linearLayout2.getParent() == null) {
            linearLayout.addView(linearLayout2, layoutParams3);
        }
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setId(R.id.hg3);
        linearLayout3.setGravity(16);
        linearLayout3.setOrientation(0);
        ViewGroup.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.tv_reply_comment_title);
        TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1k});
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes2.getColor(0, 0));
        typedArrayObtainStyledAttributes2.recycle();
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        new o();
        o.LIZ("app:tux_font", new a.c("P2_Semibold"), tuxTextView);
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            linearLayout3.addView(tuxTextView, layoutParams6);
        }
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setId(R.id.kh9);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        new k();
        k.LIZ("app:tux_iconHeight", new a.d("12", "dp"), tuxIconView);
        k.LIZ("app:tux_iconWidth", new a.d("12", "dp"), tuxIconView);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams7)) {
            i = 1;
            layoutParams7.setMarginStart((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        } else {
            i = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams7)) {
            ((ViewGroup.MarginLayoutParams) layoutParams7).leftMargin = (int) TypedValue.applyDimension(i, 2.0f, resources.getDisplayMetrics());
        }
        k.LIZ("app:tux_icon", new a.b("2130772886", "raw"), tuxIconView);
        k.LIZ("app:tux_tintColor", new a.b("2131100625", "attr"), tuxIconView);
        android.view.a.LIZ(tuxIconView);
        if (tuxIconView.getParent() == null) {
            linearLayout3.addView(tuxIconView, layoutParams7);
        }
        android.view.a.LIZ(linearLayout3);
        if (linearLayout3.getParent() == null) {
            linearLayout.addView(linearLayout3, layoutParams5);
        }
        View space = new Space(context);
        space.setId(R.id.vro);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams8)) {
            layoutParams8.weight = 1;
        }
        android.view.a.LIZ(space);
        if (space.getParent() == null) {
            linearLayout.addView(space, layoutParams8);
        }
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setId(R.id.e62);
        linearLayout4.setClipChildren(false);
        linearLayout4.setGravity(17);
        C786410Ut5.LJLLLLLL(8, linearLayout4);
        ViewGroup.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-2, -2);
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.e64);
        tuxTextView2.setCompoundDrawablePadding((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        tuxTextView2.setText(2131829128);
        TypedArray typedArrayObtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1k});
        tuxTextView2.setTextColor(typedArrayObtainStyledAttributes3.getColor(0, 0));
        typedArrayObtainStyledAttributes3.recycle();
        ViewGroup.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(-2, -2);
        new o();
        o.LIZ("app:tux_font", new a.c("P2_Semibold"), tuxTextView2);
        android.view.a.LIZ(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            linearLayout4.addView(tuxTextView2, layoutParams10);
        }
        TuxIconView tuxIconView2 = new TuxIconView(context);
        tuxIconView2.setId(R.id.e5z);
        LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        new k();
        k.LIZ("app:tux_iconHeight", new a.d("12", "dp"), tuxIconView2);
        k.LIZ("app:tux_iconWidth", new a.d("12", "dp"), tuxIconView2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams11)) {
            i2 = 16;
            layoutParams11.gravity = 16;
        } else {
            i2 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams11)) {
            ((FrameLayout.LayoutParams) layoutParams11).gravity = i2;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams11)) {
            ((DrawerLayout$LayoutParams) layoutParams11).gravity = i2;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams11)) {
            f = 2.0f;
            i3 = 1;
            layoutParams11.setMarginStart((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        } else {
            f = 2.0f;
            i3 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams11)) {
            ((ViewGroup.MarginLayoutParams) layoutParams11).leftMargin = (int) TypedValue.applyDimension(i3, f, resources.getDisplayMetrics());
        }
        k.LIZ("app:tux_tintColor", new a.b("2131100625", "attr"), tuxIconView2);
        k.LIZ("app:tux_icon", new a.b("2130772924", "raw"), tuxIconView2);
        android.view.a.LIZ(tuxIconView2);
        if (tuxIconView2.getParent() == null) {
            linearLayout4.addView(tuxIconView2, layoutParams11);
        }
        android.view.a.LIZ(linearLayout4);
        if (linearLayout4.getParent() == null) {
            linearLayout.addView(linearLayout4, layoutParams9);
        }
        android.view.a.LIZ(linearLayout);
        if (linearLayout.getParent() == null) {
            frameLayout.addView(linearLayout, layoutParams);
        }
        C1235900iGa c1235900iGa = new C1235900iGa(context, null);
        c1235900iGa.setId(R.id.me_);
        c1235900iGa.setImportantForAccessibility(i3);
        c1235900iGa.setContentDescription(context.getResources().getString(2131824454));
        C786410Ut5.LLLLIIL(c1235900iGa, 8);
        FrameLayout.LayoutParams layoutParams12 = new FrameLayout.LayoutParams(-1, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams12)) {
            i4 = 17;
            ((LinearLayout.LayoutParams) layoutParams12).gravity = 17;
        } else {
            i4 = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams12)) {
            layoutParams12.gravity = i4;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams12)) {
            ((DrawerLayout$LayoutParams) layoutParams12).gravity = i4;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams12)) {
            f2 = 0.0f;
            layoutParams12.setMarginStart((int) TypedValue.applyDimension(i3, 0.0f, resources.getDisplayMetrics()));
        } else {
            f2 = 0.0f;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams12)) {
            ((ViewGroup.MarginLayoutParams) layoutParams12).leftMargin = (int) TypedValue.applyDimension(i3, f2, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams12)) {
            layoutParams12.setMarginEnd((int) TypedValue.applyDimension(i3, f2, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams12)) {
            ((ViewGroup.MarginLayoutParams) layoutParams12).rightMargin = (int) TypedValue.applyDimension(i3, f2, resources.getDisplayMetrics());
        }
        android.view.a.LIZ(c1235900iGa);
        if (c1235900iGa.getParent() == null) {
            frameLayout.addView(c1235900iGa, layoutParams12);
        }
        android.view.a.LIZ(frameLayout);
        C786410Ut5.W5(frameLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        return frameLayout;
    }
}
