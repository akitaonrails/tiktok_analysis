package com.by.andInflater;

import X.C418990Gbp;
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
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.relation.label.RelationLabelTextView;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.k;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class friends_tab_v3_user_info_area_layout implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -1, viewGroup);
        C418990Gbp c418990Gbp = new C418990Gbp(context, null, 6);
        c418990Gbp.setGravity(16);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.ilv);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setGravity(16);
        tuxTextView.setMaxLines(1);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1h});
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        ViewGroup.LayoutParams layoutParamsLJ = a.LJ(-2, -2, c418990Gbp);
        new o();
        o.LIZ("app:tux_font", new a.c("Headline_Semibold"), tuxTextView);
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            c418990Gbp.addView(tuxTextView, layoutParamsLJ);
        }
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setId(R.id.verified_icon);
        tuxIconView.setImportantForAccessibility(2);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ2 = android.view.a.LJ(-2, -2, c418990Gbp);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            marginLayoutParamsLJ2.setMarginStart((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        }
        new k();
        k.LIZ("app:tux_icon", new a.b("2130773493", "raw"), tuxIconView);
        k.LIZ("app:tux_iconHeight", new a.d("16", "dp"), tuxIconView);
        k.LIZ("app:tux_iconWidth", new a.d("16", "dp"), tuxIconView);
        android.view.a.LIZ(tuxIconView);
        if (tuxIconView.getParent() == null) {
            c418990Gbp.addView(tuxIconView, marginLayoutParamsLJ2);
        }
        View frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.wa5);
        C786410Ut5.LJLLLLLL(8, frameLayout);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ3 = android.view.a.LJ(-2, -2, c418990Gbp);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            marginLayoutParamsLJ3.setMarginStart((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        }
        android.view.a.LIZ(frameLayout);
        if (frameLayout.getParent() == null) {
            c418990Gbp.addView(frameLayout, marginLayoutParamsLJ3);
        }
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.tv_user_info_timestamp);
        tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView2.setGravity(16);
        tuxTextView2.setMaxLines(1);
        TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1k});
        tuxTextView2.setTextColor(typedArrayObtainStyledAttributes2.getColor(0, 0));
        typedArrayObtainStyledAttributes2.recycle();
        C786410Ut5.LJLLLLLL(8, tuxTextView2);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ4 = android.view.a.LJ(-2, -2, c418990Gbp);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ4)) {
            marginLayoutParamsLJ4.setMarginStart((int) resources.getDimension(R.dimen.sz));
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P3_Regular"), tuxTextView2);
        android.view.a.LIZ(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            c418990Gbp.addView(tuxTextView2, marginLayoutParamsLJ4);
        }
        RadiusLayout radiusLayout = new RadiusLayout(context);
        radiusLayout.setId(R.id.ke_);
        TypedArray typedArrayObtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a03});
        radiusLayout.setBackgroundColor(typedArrayObtainStyledAttributes3.getColor(0, 0));
        typedArrayObtainStyledAttributes3.recycle();
        radiusLayout.setPadding((int) resources.getDimension(R.dimen.t2), radiusLayout.getPaddingTop(), radiusLayout.getPaddingRight(), radiusLayout.getPaddingBottom());
        radiusLayout.setPadding(radiusLayout.getPaddingLeft(), radiusLayout.getPaddingTop(), (int) resources.getDimension(R.dimen.t2), radiusLayout.getPaddingBottom());
        C786410Ut5.LJLLLLLL(8, radiusLayout);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ5 = android.view.a.LJ(-2, -2, c418990Gbp);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ5)) {
            marginLayoutParamsLJ5.setMarginStart((int) resources.getDimension(R.dimen.sz));
        }
        RelativeLayout relativeLayout = new RelativeLayout(context);
        ViewGroup.LayoutParams layoutParamsLJ2 = android.view.a.LJ(-2, (int) resources.getDimension(R.dimen.sl), radiusLayout);
        TuxIconView tuxIconView2 = new TuxIconView(context);
        tuxIconView2.setId(R.id.ke9);
        tuxIconView2.setImportantForAccessibility(2);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            i = -1;
            layoutParams2.addRule(20, -1);
        } else {
            i = -1;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.addRule(15, i);
        }
        new k();
        k.LIZ("app:tux_icon", new a.b("2130773995", "raw"), tuxIconView2);
        k.LIZ("app:tux_iconHeight", new a.d("12", "dp"), tuxIconView2);
        k.LIZ("app:tux_iconWidth", new a.d("12", "dp"), tuxIconView2);
        k.LIZ("app:tux_tintColor", new a.b("2131100567", "attr"), tuxIconView2);
        android.view.a.LIZ(tuxIconView2);
        if (tuxIconView2.getParent() == null) {
            relativeLayout.addView(tuxIconView2, layoutParams2);
        }
        TuxTextView tuxTextView3 = new TuxTextView(context);
        tuxTextView3.setId(R.id.kc8);
        tuxTextView3.setMaxLines(1);
        TypedArray typedArrayObtainStyledAttributes4 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1h});
        tuxTextView3.setTextColor(typedArrayObtainStyledAttributes4.getColor(0, 0));
        typedArrayObtainStyledAttributes4.recycle();
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.addRule(15, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.setMarginStart((int) resources.getDimension(R.dimen.sv));
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.addRule(17, R.id.ke9);
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P3_Semibold"), tuxTextView3);
        android.view.a.LIZ(tuxTextView3);
        if (tuxTextView3.getParent() == null) {
            relativeLayout.addView(tuxTextView3, layoutParams3);
        }
        android.view.a.LIZ(relativeLayout);
        if (relativeLayout.getParent() == null) {
            radiusLayout.addView(relativeLayout, layoutParamsLJ2);
        }
        android.view.a.LIZ(radiusLayout);
        if (radiusLayout.getParent() == null) {
            c418990Gbp.addView(radiusLayout, marginLayoutParamsLJ5);
        }
        android.view.a.LIZ(c418990Gbp);
        if (c418990Gbp.getParent() == null) {
            linearLayout.addView(c418990Gbp, layoutParams);
        }
        RelationLabelTextView relationLabelTextView = new RelationLabelTextView(context);
        relationLabelTextView.setId(R.id.t4q);
        relationLabelTextView.setMaxLines(1);
        TypedArray typedArrayObtainStyledAttributes5 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.uh});
        relationLabelTextView.setTextColor(typedArrayObtainStyledAttributes5.getColor(0, 0));
        typedArrayObtainStyledAttributes5.recycle();
        C786410Ut5.LJLLLLLL(8, relationLabelTextView);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, (int) resources.getDimension(R.dimen.sh));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin = (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics());
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P2_Regular"), relationLabelTextView);
        android.view.a.LIZ(relationLabelTextView);
        if (relationLabelTextView.getParent() == null) {
            linearLayout.addView(relationLabelTextView, layoutParams4);
        }
        android.view.a.LIZ(linearLayout);
        C786410Ut5.W5(linearLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(linearLayout);
        }
        return linearLayout;
    }
}
