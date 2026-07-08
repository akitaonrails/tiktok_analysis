package com.by.andInflater;

import X.C21459118yT;
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
import androidx.appcompat.widget.AppCompatImageView;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import dc.a;
import kotlin.jvm.internal.Intrinsics;
import mmc.r2;
import xem.k;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class common_feed_layout_video_title_music implements InterfaceC20742716Ev {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        int i2;
        int i3;
        Resources resources = context.getResources();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, R.style.hk);
        Resources resources2 = contextThemeWrapper.getResources();
        LinearLayout linearLayout = new LinearLayout(contextThemeWrapper);
        linearLayout.setId(R.id.nfh);
        linearLayout.setGravity(16);
        linearLayout.setOrientation(0);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-2, -2, viewGroup);
        FrameLayout frameLayout = new FrameLayout(contextThemeWrapper);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        LinearLayout linearLayout2 = new LinearLayout(contextThemeWrapper);
        linearLayout2.setId(R.id.oso);
        linearLayout2.setBackgroundResource(R.drawable.b_v);
        linearLayout2.setGravity(16);
        linearLayout2.setOrientation(0);
        C786410Ut5.LJLLLLLL(8, linearLayout2);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        TuxIconView tuxIconView = new TuxIconView(contextThemeWrapper);
        tuxIconView.setId(R.id.osn);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = (int) TypedValue.applyDimension(1, 2.0f, resources2.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin = (int) TypedValue.applyDimension(1, 2.0f, resources2.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.setMarginStart((int) TypedValue.applyDimension(1, 4.0f, resources2.getDisplayMetrics()));
        }
        new k();
        k.LIZ("app:tux_icon", new a.b("2130774143", "raw"), tuxIconView);
        k.LIZ("app:tux_tintColor", new a.b("2131099768", "attr"), tuxIconView);
        k.LIZ("app:tux_iconWidth", new a.d("16", "dp"), tuxIconView);
        k.LIZ("app:tux_iconHeight", new a.d("16", "dp"), tuxIconView);
        android.view.a.LIZ(tuxIconView);
        if (tuxIconView.getParent() == null) {
            linearLayout2.addView(tuxIconView, layoutParams3);
        }
        TuxTextView tuxTextView = new TuxTextView(contextThemeWrapper);
        tuxTextView.setId(R.id.osp);
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.getTheme().obtainStyledAttributes(new int[]{R.attr.ee});
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setMaxLines(1);
        tuxTextView.setMaxWidth((int) TypedValue.applyDimension(1, 93.0f, resources2.getDisplayMetrics()));
        tuxTextView.setTextAlignment(4);
        tuxTextView.setText(2131824934);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            i = 1;
            layoutParams4.setMarginStart((int) TypedValue.applyDimension(1, 2.0f, resources2.getDisplayMetrics()));
        } else {
            i = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.setMarginEnd((int) TypedValue.applyDimension(i, 4.0f, resources2.getDisplayMetrics()));
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P2_Semibold"), tuxTextView);
        o.LIZ("app:tux_minTextSize", new a.d("11", "dp"), tuxTextView);
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            linearLayout2.addView(tuxTextView, layoutParams4);
        }
        android.view.a.LIZ(linearLayout2);
        if (linearLayout2.getParent() == null) {
            frameLayout.addView(linearLayout2, layoutParams2);
        }
        TuxTextView tuxTextView2 = new TuxTextView(contextThemeWrapper);
        tuxTextView2.setId(R.id.p7i);
        tuxTextView2.setBackgroundResource(R.drawable.b_v);
        tuxTextView2.setPadding((int) TypedValue.applyDimension(1, 4.0f, resources2.getDisplayMetrics()), tuxTextView2.getPaddingTop(), tuxTextView2.getPaddingRight(), tuxTextView2.getPaddingBottom());
        tuxTextView2.setPadding(tuxTextView2.getPaddingLeft(), tuxTextView2.getPaddingTop(), (int) TypedValue.applyDimension(1, 4.0f, resources2.getDisplayMetrics()), tuxTextView2.getPaddingBottom());
        tuxTextView2.setGravity(17);
        tuxTextView2.setTextAlignment(4);
        TypedArray typedArrayObtainStyledAttributes2 = contextThemeWrapper.getTheme().obtainStyledAttributes(new int[]{R.attr.ee});
        tuxTextView2.setTextColor(typedArrayObtainStyledAttributes2.getColor(0, 0));
        typedArrayObtainStyledAttributes2.recycle();
        C786410Ut5.LJLLLLLL(8, tuxTextView2);
        ViewGroup.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        new o();
        o.LIZ("app:tux_font", new a.c("P3_Semibold"), tuxTextView2);
        android.view.a.LIZ(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            frameLayout.addView(tuxTextView2, layoutParams5);
        }
        AppCompatImageView appCompatImageView = new AppCompatImageView(contextThemeWrapper);
        appCompatImageView.setId(R.id.osx);
        C786410Ut5.LJZI(8, appCompatImageView);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 70.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams6)) {
            i2 = 16;
            ((LinearLayout.LayoutParams) layoutParams6).gravity = 16;
        } else {
            i2 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.gravity = i2;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams6)) {
            ((DrawerLayout$LayoutParams) layoutParams6).gravity = i2;
        }
        android.view.a.LIZ(appCompatImageView);
        if (appCompatImageView.getParent() == null) {
            frameLayout.addView(appCompatImageView, layoutParams6);
        }
        TuxTextView tuxTextView3 = new TuxTextView(contextThemeWrapper);
        tuxTextView3.setId(R.id.ow7);
        tuxTextView3.setPadding((int) TypedValue.applyDimension(1, 6.0f, resources2.getDisplayMetrics()), tuxTextView3.getPaddingTop(), (int) TypedValue.applyDimension(1, 6.0f, resources2.getDisplayMetrics()), tuxTextView3.getPaddingBottom());
        tuxTextView3.setPadding(tuxTextView3.getPaddingLeft(), (int) TypedValue.applyDimension(1, 2.0f, resources2.getDisplayMetrics()), tuxTextView3.getPaddingRight(), (int) TypedValue.applyDimension(1, 2.0f, resources2.getDisplayMetrics()));
        TypedArray typedArrayObtainStyledAttributes3 = contextThemeWrapper.getTheme().obtainStyledAttributes(new int[]{R.attr.ze});
        tuxTextView3.setBackgroundColor(typedArrayObtainStyledAttributes3.getColor(0, 0));
        typedArrayObtainStyledAttributes3.recycle();
        TypedArray typedArrayObtainStyledAttributes4 = contextThemeWrapper.getTheme().obtainStyledAttributes(new int[]{R.attr.ee});
        tuxTextView3.setTextColor(typedArrayObtainStyledAttributes4.getColor(0, 0));
        typedArrayObtainStyledAttributes4.recycle();
        C786410Ut5.LJLLLLLL(8, tuxTextView3);
        FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams7)) {
            i3 = 16;
            ((LinearLayout.LayoutParams) layoutParams7).gravity = 16;
        } else {
            i3 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams7)) {
            layoutParams7.gravity = i3;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams7)) {
            ((DrawerLayout$LayoutParams) layoutParams7).gravity = i3;
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P3_Semibold"), tuxTextView3);
        android.view.a.LIZ(tuxTextView3);
        if (tuxTextView3.getParent() == null) {
            frameLayout.addView(tuxTextView3, layoutParams7);
        }
        android.view.a.LIZ(frameLayout);
        if (frameLayout.getParent() == null) {
            linearLayout.addView(frameLayout, layoutParams);
        }
        FrameLayout frameLayout2 = new FrameLayout(contextThemeWrapper);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams8)) {
            layoutParams8.gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams8)) {
            ((FrameLayout.LayoutParams) layoutParams8).gravity = 80;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams8)) {
            ((DrawerLayout$LayoutParams) layoutParams8).gravity = 80;
        }
        ContextThemeWrapper contextThemeWrapper2 = new ContextThemeWrapper(contextThemeWrapper, R.style.y0);
        Resources resources3 = contextThemeWrapper2.getResources();
        TuxIconView tuxIconView2 = new TuxIconView(contextThemeWrapper2);
        tuxIconView2.setId(R.id.ovk);
        C786410Ut5.x5(tuxIconView2, 0.9f);
        C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
        FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams9)) {
            ((LinearLayout.LayoutParams) layoutParams9).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams9)) {
            layoutParams9.gravity = 80;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams9)) {
            ((DrawerLayout$LayoutParams) layoutParams9).gravity = 80;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams9)) {
            ((ViewGroup.MarginLayoutParams) layoutParams9).bottomMargin = (int) TypedValue.applyDimension(1, 1.0f, resources3.getDisplayMetrics());
        }
        new k();
        k.LIZ("app:tux_icon", new a.b("2130774324", "raw"), tuxIconView2);
        k.LIZ("app:tux_tintColor", new a.b("2131099768", "attr"), tuxIconView2);
        k.LIZ("app:tux_iconShadow", new a.c("true"), tuxIconView2);
        android.view.a.LIZ(tuxIconView2);
        if (tuxIconView2.getParent() == null) {
            frameLayout2.addView(tuxIconView2, layoutParams9);
        }
        android.view.a.LIZ(frameLayout2);
        if (frameLayout2.getParent() == null) {
            linearLayout.addView(frameLayout2, layoutParams8);
        }
        FrameLayout frameLayout3 = new FrameLayout(contextThemeWrapper);
        ViewGroup.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(-2, -2);
        C21459118yT c21459118yT = new C21459118yT(contextThemeWrapper, null);
        c21459118yT.setId(R.id.ox6);
        c21459118yT.setSpeed((int) TypedValue.applyDimension(1, 25.0f, resources2.getDisplayMetrics()));
        c21459118yT.setTextColor(android.view.a.LIZIZ(R.attr.ee, contextThemeWrapper));
        c21459118yT.setTextShadow(resources2.getColor(R.color.cx));
        FrameLayout.LayoutParams layoutParams11 = new FrameLayout.LayoutParams(-1, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams11)) {
            layoutParams11.setMarginStart((int) TypedValue.applyDimension(1, 4.0f, resources2.getDisplayMetrics()));
        }
        new r2();
        a.c cVar = new a.c("H4_Regular");
        if (Intrinsics.LJFF("app:common_feed_marque_font", "app:common_feed_marque_font")) {
            String str = cVar.LIZ;
            if (Intrinsics.LJFF(str, "H4_Regular")) {
                c21459118yT.setTuxFont(41);
            } else if (Intrinsics.LJFF(str, "P1_Regular")) {
                c21459118yT.setTuxFont(51);
            }
        }
        android.view.a.LIZ(c21459118yT);
        if (c21459118yT.getParent() == null) {
            frameLayout3.addView(c21459118yT, layoutParams11);
        }
        android.view.a.LIZ(frameLayout3);
        if (frameLayout3.getParent() == null) {
            linearLayout.addView(frameLayout3, layoutParams10);
        }
        FrameLayout frameLayout4 = new FrameLayout(contextThemeWrapper);
        ViewGroup.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(-2, -2);
        TuxTextView tuxTextView4 = new TuxTextView(contextThemeWrapper);
        tuxTextView4.setId(R.id.oxa);
        tuxTextView4.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView4.setMaxWidth((int) TypedValue.applyDimension(1, 360.0f, resources2.getDisplayMetrics()));
        tuxTextView4.setMaxLines(1);
        tuxTextView4.setShadowLayer(tuxTextView4.getShadowRadius(), tuxTextView4.getShadowDx(), tuxTextView4.getShadowDy(), android.view.a.LIZIZ(R.attr.a1a, contextThemeWrapper));
        TypedArray typedArrayObtainStyledAttributes5 = contextThemeWrapper.getTheme().obtainStyledAttributes(new int[]{R.attr.ee});
        tuxTextView4.setTextColor(typedArrayObtainStyledAttributes5.getColor(0, 0));
        typedArrayObtainStyledAttributes5.recycle();
        C786410Ut5.LJLLLLLL(8, tuxTextView4);
        FrameLayout.LayoutParams layoutParams13 = new FrameLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams13)) {
            layoutParams13.setMarginStart((int) TypedValue.applyDimension(1, 4.0f, resources2.getDisplayMetrics()));
        }
        new o();
        o.LIZ("app:tux_font", new a.c("H4_Regular"), tuxTextView4);
        android.view.a.LIZ(tuxTextView4);
        if (tuxTextView4.getParent() == null) {
            frameLayout4.addView(tuxTextView4, layoutParams13);
        }
        android.view.a.LIZ(frameLayout4);
        if (frameLayout4.getParent() == null) {
            linearLayout.addView(frameLayout4, layoutParams12);
        }
        android.view.a.LIZ(linearLayout);
        C786410Ut5.W5(linearLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(linearLayout);
        }
        return linearLayout;
    }
}
