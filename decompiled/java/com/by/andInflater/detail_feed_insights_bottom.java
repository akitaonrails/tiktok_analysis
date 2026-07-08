package com.by.andInflater;

import X.C197039127h;
import X.C19M4;
import X.C421130GfH;
import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.f;
import xem.k;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class detail_feed_insights_bottom implements InterfaceC20742716Ev {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.mbk);
        linearLayout.setGravity(16);
        linearLayout.setOrientation(0);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -1, viewGroup);
        if (RelativeLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            ((RelativeLayout.LayoutParams) marginLayoutParamsLJ).addRule(15, -1);
        }
        View frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.video_view_entrance_container);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -1);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.weight = 1;
        }
        a.LIZ(frameLayout);
        if (frameLayout.getParent() == null) {
            linearLayout.addView(frameLayout, layoutParams);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setPadding((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), frameLayout2.getPaddingTop(), frameLayout2.getPaddingRight(), frameLayout2.getPaddingBottom());
        frameLayout2.setPadding(frameLayout2.getPaddingLeft(), frameLayout2.getPaddingTop(), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), frameLayout2.getPaddingBottom());
        frameLayout2.setId(R.id.zr3);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -1);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.weight = 1;
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setId(R.id.ksu);
        linearLayout2.setGravity(16);
        linearLayout2.setOrientation(0);
        C786410Ut5.LJLLLLLL(8, linearLayout2);
        ViewGroup.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -1);
        TuxIconView tuxIconView = new TuxIconView(context);
        C786410Ut5.x5(tuxIconView, 0.75f);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        new k();
        k.LIZ("app:tux_icon", new a.b("2130774125", "raw"), tuxIconView);
        k.LIZ("app:tux_iconHeight", new a.d("16", "dp"), tuxIconView);
        k.LIZ("app:tux_iconWidth", new a.d("16", "dp"), tuxIconView);
        k.LIZ("app:tux_tintColor", new a.b("2131099768", "attr"), tuxIconView);
        android.view.a.LIZ(tuxIconView);
        if (tuxIconView.getParent() == null) {
            linearLayout2.addView(tuxIconView, layoutParams4);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.zr2);
        C786410Ut5.T4(tuxTextView, 0.75f);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setLines(1);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.ee});
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.setMarginStart((int) TypedValue.applyDimension(1, 9.0f, resources.getDisplayMetrics()));
        }
        new o();
        o.LIZ("app:tux_font", new a.c("H4_Regular"), tuxTextView);
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            linearLayout2.addView(tuxTextView, layoutParams5);
        }
        android.view.a.LIZ(linearLayout2);
        if (linearLayout2.getParent() == null) {
            frameLayout2.addView(linearLayout2, layoutParams3);
        }
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setId(R.id.kst);
        linearLayout3.setGravity(16);
        linearLayout3.setOrientation(0);
        ViewGroup.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, -1);
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setGravity(16);
        linearLayout4.setOrientation(0);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams7)) {
            layoutParams7.weight = 1;
        }
        TuxIconView tuxIconView2 = new TuxIconView(context);
        C786410Ut5.x5(tuxIconView2, 0.75f);
        tuxIconView2.setImportantForAccessibility(2);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams8)) {
            layoutParams8.gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams8)) {
            ((FrameLayout.LayoutParams) layoutParams8).gravity = 17;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams8)) {
            ((DrawerLayout$LayoutParams) layoutParams8).gravity = 17;
        }
        new k();
        k.LIZ("app:tux_icon", new a.b("2130774488", "raw"), tuxIconView2);
        k.LIZ("app:tux_iconHeight", new a.d("16", "dp"), tuxIconView2);
        k.LIZ("app:tux_iconWidth", new a.d("16", "dp"), tuxIconView2);
        k.LIZ("app:tux_tintColor", new a.b("2131099768", "attr"), tuxIconView2);
        android.view.a.LIZ(tuxIconView2);
        if (tuxIconView2.getParent() == null) {
            linearLayout4.addView(tuxIconView2, layoutParams8);
        }
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.ksp);
        tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView2.setMaxLines(1);
        TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.eg});
        tuxTextView2.setTextColor(typedArrayObtainStyledAttributes2.getColor(0, 0));
        typedArrayObtainStyledAttributes2.recycle();
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams9)) {
            layoutParams9.setMarginStart((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()));
        }
        new o();
        o.LIZ("app:tux_font", new a.c("H4_Regular"), tuxTextView2);
        android.view.a.LIZ(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            linearLayout4.addView(tuxTextView2, layoutParams9);
        }
        TuxIconView tuxIconView3 = new TuxIconView(context);
        tuxIconView3.setImportantForAccessibility(2);
        C786410Ut5.x5(tuxIconView3, 0.75f);
        LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams10)) {
            i = 17;
            layoutParams10.gravity = 17;
        } else {
            i = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams10)) {
            ((FrameLayout.LayoutParams) layoutParams10).gravity = i;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams10)) {
            ((DrawerLayout$LayoutParams) layoutParams10).gravity = i;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams10)) {
            layoutParams10.setMarginStart((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        new k();
        k.LIZ("app:tux_icon", new a.b("2130772476", "raw"), tuxIconView3);
        k.LIZ("app:tux_iconHeight", new a.d("16", "dp"), tuxIconView3);
        k.LIZ("app:tux_iconWidth", new a.d("16", "dp"), tuxIconView3);
        k.LIZ("app:tux_tintColor", new a.b("2131099768", "attr"), tuxIconView3);
        android.view.a.LIZ(tuxIconView3);
        if (tuxIconView3.getParent() == null) {
            linearLayout4.addView(tuxIconView3, layoutParams10);
        }
        TuxTextView tuxTextView3 = new TuxTextView(context);
        tuxTextView3.setId(R.id.kss);
        tuxTextView3.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView3.setMaxLines(1);
        TypedArray typedArrayObtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.eg});
        tuxTextView3.setTextColor(typedArrayObtainStyledAttributes3.getColor(0, 0));
        typedArrayObtainStyledAttributes3.recycle();
        LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams11)) {
            layoutParams11.setMarginStart((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()));
        }
        new o();
        o.LIZ("app:tux_font", new a.c("H4_Regular"), tuxTextView3);
        android.view.a.LIZ(tuxTextView3);
        if (tuxTextView3.getParent() == null) {
            linearLayout4.addView(tuxTextView3, layoutParams11);
        }
        TuxIconView tuxIconView4 = new TuxIconView(context);
        tuxIconView4.setId(R.id.ksr);
        tuxIconView4.setImportantForAccessibility(2);
        C786410Ut5.x5(tuxIconView4, 0.75f);
        C786410Ut5.LLLLLLZZ(tuxIconView4, 8);
        LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams12)) {
            i2 = 17;
            layoutParams12.gravity = 17;
        } else {
            i2 = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams12)) {
            ((FrameLayout.LayoutParams) layoutParams12).gravity = i2;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams12)) {
            ((DrawerLayout$LayoutParams) layoutParams12).gravity = i2;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams12)) {
            layoutParams12.setMarginStart((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        new k();
        k.LIZ("app:tux_icon", new a.b("2130773857", "raw"), tuxIconView4);
        k.LIZ("app:tux_iconHeight", new a.d("16", "dp"), tuxIconView4);
        k.LIZ("app:tux_iconWidth", new a.d("16", "dp"), tuxIconView4);
        k.LIZ("app:tux_tintColor", new a.b("2131099768", "attr"), tuxIconView4);
        android.view.a.LIZ(tuxIconView4);
        if (tuxIconView4.getParent() == null) {
            linearLayout4.addView(tuxIconView4, layoutParams12);
        }
        TuxTextView tuxTextView4 = new TuxTextView(context);
        tuxTextView4.setId(R.id.ksq);
        tuxTextView4.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView4.setMaxLines(1);
        TypedArray typedArrayObtainStyledAttributes4 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.eg});
        tuxTextView4.setTextColor(typedArrayObtainStyledAttributes4.getColor(0, 0));
        typedArrayObtainStyledAttributes4.recycle();
        C786410Ut5.LJLLLLLL(8, tuxTextView4);
        LinearLayout.LayoutParams layoutParams13 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams13)) {
            layoutParams13.setMarginStart((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()));
        }
        new o();
        o.LIZ("app:tux_font", new a.c("H4_Regular"), tuxTextView4);
        android.view.a.LIZ(tuxTextView4);
        if (tuxTextView4.getParent() == null) {
            linearLayout4.addView(tuxTextView4, layoutParams13);
        }
        android.view.a.LIZ(linearLayout4);
        if (linearLayout4.getParent() == null) {
            linearLayout3.addView(linearLayout4, layoutParams7);
        }
        C197039127h c197039127h = new C197039127h(context);
        c197039127h.setId(R.id.s_b);
        c197039127h.setEllipsize(TextUtils.TruncateAt.END);
        c197039127h.setMaxLines(1);
        if (TextView.class.isInstance(c197039127h)) {
            android.view.a.LJII((int) TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()), c197039127h);
        } else {
            c197039127h.setMinimumWidth((int) TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()));
        }
        c197039127h.setText(2131845525);
        C786410Ut5.LJLLLLLL(8, c197039127h);
        LinearLayout.LayoutParams layoutParams14 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams14)) {
            layoutParams14.setMarginStart((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        new f();
        f.LIZ("app:tux_buttonSize", new a.c("small"), c197039127h);
        f.LIZ("app:tux_buttonVariant", new a.c("primary"), c197039127h);
        android.view.a.LIZ(c197039127h);
        if (c197039127h.getParent() == null) {
            linearLayout3.addView(c197039127h, layoutParams14);
        }
        android.view.a.LIZ(linearLayout3);
        if (linearLayout3.getParent() == null) {
            frameLayout2.addView(linearLayout3, layoutParams6);
        }
        android.view.a.LIZ(frameLayout2);
        if (frameLayout2.getParent() == null) {
            linearLayout.addView(frameLayout2, layoutParams2);
        }
        C421130GfH c421130GfH = new C421130GfH(context, null);
        c421130GfH.setId(R.id.es_);
        TypedArray typedArrayObtainStyledAttributes5 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.e9});
        c421130GfH.setBackgroundColor(typedArrayObtainStyledAttributes5.getColor(0, 0));
        typedArrayObtainStyledAttributes5.recycle();
        c421130GfH.setOrientation(0);
        c421130GfH.setPadding((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), c421130GfH.getPaddingTop(), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), c421130GfH.getPaddingBottom());
        c421130GfH.setPadding(c421130GfH.getPaddingLeft(), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), c421130GfH.getPaddingRight(), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        if (TextView.class.isInstance(c421130GfH)) {
            android.view.a.LJII((int) TypedValue.applyDimension(1, 60.0f, resources.getDisplayMetrics()), c421130GfH);
        } else {
            c421130GfH.setMinimumWidth((int) TypedValue.applyDimension(1, 60.0f, resources.getDisplayMetrics()));
        }
        LinearLayout.LayoutParams layoutParams15 = new LinearLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams15)) {
            i3 = 16;
            layoutParams15.gravity = 16;
        } else {
            i3 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams15)) {
            ((FrameLayout.LayoutParams) layoutParams15).gravity = i3;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams15)) {
            ((DrawerLayout$LayoutParams) layoutParams15).gravity = i3;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams15)) {
            i4 = 1;
            layoutParams15.setMarginStart((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        } else {
            i4 = 1;
        }
        C19M4 c19m4 = new C19M4(context);
        c19m4.setId(R.id.zr4);
        int[] iArr = new int[i4];
        iArr[0] = R.attr.ee;
        TypedArray typedArrayObtainStyledAttributes6 = context.getTheme().obtainStyledAttributes(iArr);
        c19m4.setTextColor(typedArrayObtainStyledAttributes6.getColor(0, 0));
        typedArrayObtainStyledAttributes6.recycle();
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ2 = android.view.a.LJ(-2, -2, c421130GfH);
        new o();
        o.LIZ("app:tux_iconPadding", new a.d("4", "dp"), c19m4);
        o.LIZ("app:tux_font", new a.c("P1_Semibold"), c19m4);
        android.view.a.LIZ(c19m4);
        if (c19m4.getParent() == null) {
            c421130GfH.addView(c19m4, marginLayoutParamsLJ2);
        }
        android.view.a.LIZ(c421130GfH);
        if (c421130GfH.getParent() == null) {
            linearLayout.addView(c421130GfH, layoutParams15);
        }
        android.view.a.LIZ(linearLayout);
        C786410Ut5.W5(linearLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(linearLayout);
        }
        return linearLayout;
    }
}
