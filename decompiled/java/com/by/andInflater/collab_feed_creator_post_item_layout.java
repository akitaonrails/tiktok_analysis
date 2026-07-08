package com.by.andInflater;

import X.C12P4;
import X.C424560Gko;
import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.base.widget.FixedRatioFrameLayout;
import com.ss.android.ugc.aweme.challenge.ui.q0;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import dc.a;
import jf8.c;
import xem.i;
import xem.k;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class collab_feed_creator_post_item_layout implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, R.style.xz);
        Resources resources2 = contextThemeWrapper.getResources();
        FixedRatioFrameLayout fixedRatioFrameLayout = new FixedRatioFrameLayout(contextThemeWrapper, null);
        fixedRatioFrameLayout.setId(R.id.e4q);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-2, -2, viewGroup);
        new q0();
        q0.LIZ("app:frMode", new a.c("fixed_width"), fixedRatioFrameLayout);
        q0.LIZ("app:whRatio", new a.c("0.75"), fixedRatioFrameLayout);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            marginLayoutParamsLJ.setMarginStart((int) TypedValue.applyDimension(1, 6.0f, resources2.getDisplayMetrics()));
        }
        C424560Gko c424560Gko = new C424560Gko(contextThemeWrapper);
        c424560Gko.setId(R.id.e4p);
        ViewGroup.LayoutParams layoutParamsLJ = android.view.a.LJ(-1, -1, fixedRatioFrameLayout);
        c cVar = new c();
        cVar.LIZIZ("app:placeholderImage", new a.b("2131230723", "color"), c424560Gko);
        cVar.LIZIZ("app:placeholderImageScaleType", new a.c("centerCrop"), c424560Gko);
        cVar.LIZIZ("app:roundedCornerRadius", new a.d("4", "dp"), c424560Gko);
        cVar.LIZ(c424560Gko);
        android.view.a.LIZ(c424560Gko);
        if (c424560Gko.getParent() == null) {
            fixedRatioFrameLayout.addView(c424560Gko, layoutParamsLJ);
        }
        TuxIconView tuxIconView = new TuxIconView(contextThemeWrapper);
        tuxIconView.setId(R.id.e4o);
        tuxIconView.setImportantForAccessibility(2);
        C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ2 = android.view.a.LJ((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), fixedRatioFrameLayout);
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ2).gravity = 8388691;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ2).gravity = 8388691;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ2).gravity = 8388691;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            marginLayoutParamsLJ2.setMarginStart((int) TypedValue.applyDimension(1, 4.0f, resources2.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            marginLayoutParamsLJ2.bottomMargin = (int) TypedValue.applyDimension(1, 5.0f, resources2.getDisplayMetrics());
        }
        new k();
        k.LIZ("app:tux_icon", new a.b("2130774496", "raw"), tuxIconView);
        k.LIZ("app:tux_tintColor", new a.b("2131099768", "attr"), tuxIconView);
        android.view.a.LIZ(tuxIconView);
        if (tuxIconView.getParent() == null) {
            fixedRatioFrameLayout.addView(tuxIconView, marginLayoutParamsLJ2);
        }
        TuxTextView tuxTextView = new TuxTextView(contextThemeWrapper);
        tuxTextView.setId(R.id.e4t);
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.getTheme().obtainStyledAttributes(new int[]{R.attr.ee});
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        C786410Ut5.LJLLLLLL(8, tuxTextView);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ3 = android.view.a.LJ(-2, -2, fixedRatioFrameLayout);
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ3).gravity = 8388691;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ3).gravity = 8388691;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ3).gravity = 8388691;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            marginLayoutParamsLJ3.setMarginStart((int) TypedValue.applyDimension(1, 22.0f, resources2.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            marginLayoutParamsLJ3.bottomMargin = (int) TypedValue.applyDimension(1, 5.0f, resources2.getDisplayMetrics());
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P2_Semibold"), tuxTextView);
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            fixedRatioFrameLayout.addView(tuxTextView, marginLayoutParamsLJ3);
        }
        View view = new View(contextThemeWrapper);
        view.setId(R.id.e4r);
        TypedArray typedArrayObtainStyledAttributes2 = contextThemeWrapper.getTheme().obtainStyledAttributes(new int[]{R.attr.a1_});
        view.setBackgroundColor(typedArrayObtainStyledAttributes2.getColor(0, 0));
        typedArrayObtainStyledAttributes2.recycle();
        C786410Ut5.LJLLLLLL(8, view);
        ViewGroup.LayoutParams layoutParamsLJ2 = android.view.a.LJ(-1, -1, fixedRatioFrameLayout);
        android.view.a.LIZ(view);
        if (view.getParent() == null) {
            fixedRatioFrameLayout.addView(view, layoutParamsLJ2);
        }
        TuxTextView tuxTextView2 = new TuxTextView(contextThemeWrapper);
        tuxTextView2.setId(R.id.e4s);
        TypedArray typedArrayObtainStyledAttributes3 = contextThemeWrapper.getTheme().obtainStyledAttributes(new int[]{R.attr.ee});
        tuxTextView2.setTextColor(typedArrayObtainStyledAttributes3.getColor(0, 0));
        typedArrayObtainStyledAttributes3.recycle();
        tuxTextView2.setText(2131830588);
        C786410Ut5.LJLLLLLL(8, tuxTextView2);
        ViewGroup.LayoutParams layoutParamsLJ3 = android.view.a.LJ(-2, -2, fixedRatioFrameLayout);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParamsLJ3)) {
            ((LinearLayout.LayoutParams) layoutParamsLJ3).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParamsLJ3)) {
            ((FrameLayout.LayoutParams) layoutParamsLJ3).gravity = 17;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParamsLJ3)) {
            ((DrawerLayout$LayoutParams) layoutParamsLJ3).gravity = 17;
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P2_Semibold"), tuxTextView2);
        android.view.a.LIZ(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            fixedRatioFrameLayout.addView(tuxTextView2, layoutParamsLJ3);
        }
        RadiusLayout radiusLayout = new RadiusLayout(contextThemeWrapper);
        radiusLayout.setId(R.id.e4n);
        C786410Ut5.LJLLLLLL(8, radiusLayout);
        ViewGroup.LayoutParams layoutParamsLJ4 = android.view.a.LJ(-1, -1, fixedRatioFrameLayout);
        View view2 = new View(contextThemeWrapper);
        view2.setId(R.id.e4m);
        TypedArray typedArrayObtainStyledAttributes4 = contextThemeWrapper.getTheme().obtainStyledAttributes(new int[]{R.attr.bv});
        view2.setBackgroundColor(typedArrayObtainStyledAttributes4.getColor(0, 0));
        typedArrayObtainStyledAttributes4.recycle();
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ4 = android.view.a.LJ(-1, -1, radiusLayout);
        android.view.a.LIZ(view2);
        if (view2.getParent() == null) {
            radiusLayout.addView(view2, marginLayoutParamsLJ4);
        }
        C12P4 c12p4 = new C12P4(contextThemeWrapper);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ5 = android.view.a.LJ(-1, (int) TypedValue.applyDimension(1, 54.0f, resources.getDisplayMetrics()), radiusLayout);
        new i();
        i.LIZ("app:tux_shadeColor", new a.b("2131099754", "attr"), c12p4);
        i.LIZ("app:tux_beginShadeOpacity", new a.c(CardStruct.IStatusCode.DEFAULT), c12p4);
        i.LIZ("app:tux_endShadeOpacity", new a.c("0.27"), c12p4);
        i.LIZ("app:tux_shader", new a.d("ea", "in"), c12p4);
        i.LIZ("app:tux_style", new a.c("vertical"), c12p4);
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ5)) {
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ5).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ5)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ5).gravity = 80;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ5)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ5).gravity = 80;
        }
        android.view.a.LIZ(c12p4);
        if (c12p4.getParent() == null) {
            radiusLayout.addView(c12p4, marginLayoutParamsLJ5);
        }
        android.view.a.LIZ(radiusLayout);
        if (radiusLayout.getParent() == null) {
            fixedRatioFrameLayout.addView(radiusLayout, layoutParamsLJ4);
        }
        android.view.a.LIZ(fixedRatioFrameLayout);
        C786410Ut5.W5(fixedRatioFrameLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(fixedRatioFrameLayout);
        }
        return fixedRatioFrameLayout;
    }
}
