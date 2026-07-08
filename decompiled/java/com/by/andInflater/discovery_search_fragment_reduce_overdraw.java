package com.by.andInflater;

import X.C20742916Ex;
import X.C418710GbN;
import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import X.ViewOnClickListenerC19400210vA;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.k;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class discovery_search_fragment_reduce_overdraw implements InterfaceC20742716Ev {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        float f;
        int i5;
        int i6;
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.np7);
        linearLayout.setOrientation(1);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -1, viewGroup);
        if (RelativeLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            ((RelativeLayout.LayoutParams) marginLayoutParamsLJ).addRule(15, -1);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.bx});
        linearLayout2.setBackgroundColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        linearLayout2.setOrientation(1);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        View view = new View(context);
        view.setId(R.id.iso);
        ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        a.LIZ(view);
        if (view.getParent() == null) {
            linearLayout2.addView(view, layoutParams2);
        }
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setId(R.id.ydn);
        linearLayout3.setOrientation(0);
        ViewGroup.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, (int) resources.getDimension(R.dimen.b3i));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.mjp);
        ViewGroup.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -1);
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setId(R.id.f677bn3);
        tuxIconView.setPadding((int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        C786410Ut5.LLLLLLZZ(tuxIconView, 0);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams5)) {
            ((LinearLayout.LayoutParams) layoutParams5).gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.gravity = 16;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams5)) {
            ((DrawerLayout$LayoutParams) layoutParams5).gravity = 16;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.setMarginStart((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        new k();
        k.LIZ("app:tux_icon", new a.b("2130772433", "raw"), tuxIconView);
        k.LIZ("app:tux_tintColor", new a.b("2131100622", "attr"), tuxIconView);
        android.view.a.LIZ(tuxIconView);
        if (tuxIconView.getParent() == null) {
            frameLayout.addView(tuxIconView, layoutParams5);
        }
        View viewOnClickListenerC19400210vA = new ViewOnClickListenerC19400210vA(context, null);
        viewOnClickListenerC19400210vA.setId(R.id.ue7);
        C786410Ut5.LJLLLLLL(8, viewOnClickListenerC19400210vA);
        ViewGroup.MarginLayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, -1);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams6)) {
            ((RelativeLayout.LayoutParams) layoutParams6).addRule(15, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams6)) {
            i = 1;
            layoutParams6.setMarginEnd((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        } else {
            i = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.rightMargin = (int) TypedValue.applyDimension(i, 2.0f, resources.getDisplayMetrics());
        }
        android.view.a.LIZ(viewOnClickListenerC19400210vA);
        if (viewOnClickListenerC19400210vA.getParent() == null) {
            frameLayout.addView(viewOnClickListenerC19400210vA, layoutParams6);
        }
        TuxIconView tuxIconView2 = new TuxIconView(context);
        tuxIconView2.setId(R.id.adl);
        C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
        FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams7)) {
            ((LinearLayout.LayoutParams) layoutParams7).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams7)) {
            layoutParams7.gravity = 17;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams7)) {
            ((DrawerLayout$LayoutParams) layoutParams7).gravity = 17;
        }
        new k();
        k.LIZ("app:tux_iconWidth", new a.d("24", "dp"), tuxIconView2);
        k.LIZ("app:tux_iconHeight", new a.d("24", "dp"), tuxIconView2);
        k.LIZ("app:tux_icon", new a.b("2130774436", "raw"), tuxIconView2);
        android.view.a.LIZ(tuxIconView2);
        if (tuxIconView2.getParent() == null) {
            frameLayout.addView(tuxIconView2, layoutParams7);
        }
        android.view.a.LIZ(frameLayout);
        if (frameLayout.getParent() == null) {
            linearLayout3.addView(frameLayout, layoutParams4);
        }
        View viewLIZ = C20742916Ex.LIZ(context, R.layout.f1r, linearLayout3, false, 0);
        viewLIZ.setId(R.id.tny);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams8)) {
            i2 = -1;
            ((RelativeLayout.LayoutParams) layoutParams8).addRule(20, -1);
        } else {
            i2 = -1;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams8)) {
            ((RelativeLayout.LayoutParams) layoutParams8).addRule(9, i2);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams8)) {
            ((RelativeLayout.LayoutParams) layoutParams8).addRule(15, i2);
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams8)) {
            i3 = 16;
            layoutParams8.gravity = 16;
        } else {
            i3 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams8)) {
            ((FrameLayout.LayoutParams) layoutParams8).gravity = i3;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams8)) {
            ((DrawerLayout$LayoutParams) layoutParams8).gravity = i3;
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams8)) {
            layoutParams8.weight = 1;
        }
        if (viewLIZ.getParent() == null) {
            linearLayout3.addView(viewLIZ, layoutParams8);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.tks);
        ViewGroup.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-2, i2);
        C418710GbN c418710GbN = new C418710GbN(context, null);
        c418710GbN.setId(R.id.bn5);
        c418710GbN.setPadding((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), c418710GbN.getPaddingTop(), c418710GbN.getPaddingRight(), c418710GbN.getPaddingBottom());
        c418710GbN.setPadding(c418710GbN.getPaddingLeft(), c418710GbN.getPaddingTop(), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), c418710GbN.getPaddingBottom());
        c418710GbN.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        C786410Ut5.LJZI(8, c418710GbN);
        c418710GbN.setImageResource(R.drawable.bid);
        FrameLayout.LayoutParams layoutParams10 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()), -1);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams10)) {
            i4 = 17;
            ((LinearLayout.LayoutParams) layoutParams10).gravity = 17;
        } else {
            i4 = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams10)) {
            layoutParams10.gravity = i4;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams10)) {
            ((DrawerLayout$LayoutParams) layoutParams10).gravity = i4;
        }
        android.view.a.LIZ(c418710GbN);
        if (c418710GbN.getParent() == null) {
            frameLayout2.addView(c418710GbN, layoutParams10);
        }
        View viewOnClickListenerC19400210vA2 = new ViewOnClickListenerC19400210vA(context, null);
        viewOnClickListenerC19400210vA2.setId(R.id.ue8);
        C786410Ut5.LJLLLLLL(0, viewOnClickListenerC19400210vA2);
        ViewGroup.MarginLayoutParams layoutParams11 = new FrameLayout.LayoutParams(-2, -1);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams11)) {
            ((RelativeLayout.LayoutParams) layoutParams11).addRule(15, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams11)) {
            f = 2.0f;
            i5 = 1;
            layoutParams11.setMarginEnd((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        } else {
            f = 2.0f;
            i5 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams11)) {
            layoutParams11.rightMargin = (int) TypedValue.applyDimension(i5, f, resources.getDisplayMetrics());
        }
        android.view.a.LIZ(viewOnClickListenerC19400210vA2);
        if (viewOnClickListenerC19400210vA2.getParent() == null) {
            frameLayout2.addView(viewOnClickListenerC19400210vA2, layoutParams11);
        }
        android.view.a.LIZ(frameLayout2);
        if (frameLayout2.getParent() == null) {
            linearLayout3.addView(frameLayout2, layoutParams9);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.tv_search_textview);
        tuxTextView.setGravity(17);
        if (TextView.class.isInstance(tuxTextView)) {
            android.view.a.LJII((int) TypedValue.applyDimension(i5, 64.0f, resources.getDisplayMetrics()), tuxTextView);
        } else {
            tuxTextView.setMinimumWidth((int) TypedValue.applyDimension(i5, 64.0f, resources.getDisplayMetrics()));
        }
        tuxTextView.setPadding((int) TypedValue.applyDimension(i5, 16.0f, resources.getDisplayMetrics()), tuxTextView.getPaddingTop(), tuxTextView.getPaddingRight(), tuxTextView.getPaddingBottom());
        tuxTextView.setPadding(tuxTextView.getPaddingLeft(), tuxTextView.getPaddingTop(), (int) TypedValue.applyDimension(i5, 16.0f, resources.getDisplayMetrics()), tuxTextView.getPaddingBottom());
        tuxTextView.setText(R.string.spp);
        int[] iArr = new int[i5];
        iArr[0] = R.attr.a04;
        TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(iArr);
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes2.getColor(0, 0));
        typedArrayObtainStyledAttributes2.recycle();
        C786410Ut5.LJLLLLLL(8, tuxTextView);
        LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(-2, -1);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams12)) {
            i6 = 16;
            layoutParams12.gravity = 16;
        } else {
            i6 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams12)) {
            ((FrameLayout.LayoutParams) layoutParams12).gravity = i6;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams12)) {
            ((DrawerLayout$LayoutParams) layoutParams12).gravity = i6;
        }
        new o();
        o.LIZ("app:tux_font", new a.c("H4_Semibold"), tuxTextView);
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            linearLayout3.addView(tuxTextView, layoutParams12);
        }
        android.view.a.LIZ(linearLayout3);
        if (linearLayout3.getParent() == null) {
            linearLayout2.addView(linearLayout3, layoutParams3);
        }
        View view2 = new View(context);
        view2.setId(R.id.mpp);
        int[] iArr2 = new int[i5];
        iArr2[0] = R.attr.ng;
        TypedArray typedArrayObtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(iArr2);
        view2.setBackgroundColor(typedArrayObtainStyledAttributes3.getColor(0, 0));
        typedArrayObtainStyledAttributes3.recycle();
        ViewGroup.LayoutParams layoutParams13 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(i5, 0.5f, resources.getDisplayMetrics()));
        android.view.a.LIZ(view2);
        if (view2.getParent() == null) {
            linearLayout2.addView(view2, layoutParams13);
        }
        android.view.a.LIZ(linearLayout2);
        if (linearLayout2.getParent() == null) {
            linearLayout.addView(linearLayout2, layoutParams);
        }
        FrameLayout frameLayout3 = new FrameLayout(context);
        int[] iArr3 = new int[i5];
        iArr3[0] = R.attr.bx;
        TypedArray typedArrayObtainStyledAttributes4 = context.getTheme().obtainStyledAttributes(iArr3);
        frameLayout3.setBackgroundColor(typedArrayObtainStyledAttributes4.getColor(0, 0));
        typedArrayObtainStyledAttributes4.recycle();
        ViewGroup.LayoutParams layoutParams14 = new LinearLayout.LayoutParams(-1, -1);
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout4.setId(R.id.iiv);
        FrameLayout.LayoutParams layoutParams15 = new FrameLayout.LayoutParams(-1, -1);
        View viewLIZ2 = C20742916Ex.LIZ(context, R.layout.bn_, frameLayout4, false, 0);
        if (viewLIZ2.getParent() == null) {
            frameLayout4.addView(viewLIZ2);
        }
        android.view.a.LIZ(frameLayout4);
        if (frameLayout4.getParent() == null) {
            frameLayout3.addView(frameLayout4, layoutParams15);
        }
        android.view.a.LIZ(frameLayout3);
        if (frameLayout3.getParent() == null) {
            linearLayout.addView(frameLayout3, layoutParams14);
        }
        android.view.a.LIZ(linearLayout);
        C786410Ut5.W5(linearLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(linearLayout);
        }
        return linearLayout;
    }
}
