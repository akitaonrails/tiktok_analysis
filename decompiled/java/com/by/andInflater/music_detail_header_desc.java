package com.by.andInflater;

import X.C630930Oot;
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
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.k;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class music_detail_header_desc implements InterfaceC20742716Ev {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v50 */
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        float f;
        int i6;
        int i7;
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setId(R.id.m6p);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -1, viewGroup);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setId(R.id.ari);
        C786410Ut5.LJLLLLLL(8, linearLayout2);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 49.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()));
        View smartImageView = new SmartImageView(context);
        smartImageView.setId(R.id.arh);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 49.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams2)) {
            ((FrameLayout.LayoutParams) layoutParams2).gravity = 17;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams2)) {
            ((DrawerLayout$LayoutParams) layoutParams2).gravity = 17;
        }
        a.LIZ(smartImageView);
        if (smartImageView.getParent() == null) {
            linearLayout2.addView(smartImageView, layoutParams2);
        }
        a.LIZ(linearLayout2);
        if (linearLayout2.getParent() == null) {
            linearLayout.addView(linearLayout2, layoutParams);
        }
        RelativeLayout relativeLayout = new RelativeLayout(context);
        ViewGroup.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.title);
        tuxTextView.setGravity(8388627);
        tuxTextView.setTextAlignment(5);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1h});
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        tuxTextView.setTextDirection(5);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.addRule(16, R.id.uy7);
        }
        new o();
        o.LIZ("app:tux_font", new a.c("H2_Bold"), tuxTextView);
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            relativeLayout.addView(tuxTextView, layoutParams4);
        }
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setId(R.id.uy7);
        tuxIconView.setImportantForAccessibility(2);
        C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.setMarginStart((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.addRule(21, -1);
        }
        new k();
        k.LIZ("app:tux_icon", new a.b("2130772475", "raw"), tuxIconView);
        k.LIZ("app:tux_tintColor", new a.b("2131100622", "attr"), tuxIconView);
        android.view.a.LIZ(tuxIconView);
        if (tuxIconView.getParent() == null) {
            relativeLayout.addView(tuxIconView, layoutParams5);
        }
        android.view.a.LIZ(relativeLayout);
        if (relativeLayout.getParent() == null) {
            linearLayout.addView(relativeLayout, layoutParams3);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.osr);
        ViewGroup.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
        View c630930Oot = new C630930Oot(context, null);
        c630930Oot.setId(R.id.osq);
        C786410Ut5.LJLLLLLL(8, c630930Oot);
        ViewGroup.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 28.0f, resources.getDisplayMetrics()));
        android.view.a.LIZ(c630930Oot);
        if (c630930Oot.getParent() == null) {
            frameLayout.addView(c630930Oot, layoutParams7);
        }
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setId(R.id.oss);
        linearLayout3.setOrientation(0);
        C786410Ut5.LJLLLLLL(8, linearLayout3);
        FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams8)) {
            i = 1;
            ((ViewGroup.MarginLayoutParams) layoutParams8).topMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        } else {
            i = 1;
        }
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.zz3);
        tuxTextView2.setCompoundDrawablePadding((int) TypedValue.applyDimension(i, 4.0f, resources.getDisplayMetrics()));
        tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView2.setGravity(8388611);
        tuxTextView2.setSingleLine(i);
        tuxTextView2.setTextAlignment(5);
        int[] iArr = new int[i];
        iArr[0] = R.attr.a1k;
        TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(iArr);
        tuxTextView2.setTextColor(typedArrayObtainStyledAttributes2.getColor(0, 0));
        typedArrayObtainStyledAttributes2.recycle();
        tuxTextView2.setTextDirection(5);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams9)) {
            layoutParams9.weight = 1;
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P1_Semibold"), tuxTextView2);
        android.view.a.LIZ(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            linearLayout3.addView(tuxTextView2, layoutParams9);
        }
        TuxIconView tuxIconView2 = new TuxIconView(context);
        tuxIconView2.setId(R.id.ntc);
        C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
        LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams10)) {
            layoutParams10.setMarginStart((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams10)) {
            i2 = 17;
            layoutParams10.gravity = 17;
        } else {
            i2 = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams10)) {
            ((FrameLayout.LayoutParams) layoutParams10).gravity = i2;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams10)) {
            ((DrawerLayout$LayoutParams) layoutParams10).gravity = i2;
        }
        new k();
        k.LIZ("app:tux_icon", new a.b("2130772915", "raw"), tuxIconView2);
        k.LIZ("app:tux_tintColor", new a.b("2131100622", "attr"), tuxIconView2);
        android.view.a.LIZ(tuxIconView2);
        if (tuxIconView2.getParent() == null) {
            linearLayout3.addView(tuxIconView2, layoutParams10);
        }
        android.view.a.LIZ(linearLayout3);
        if (linearLayout3.getParent() == null) {
            frameLayout.addView(linearLayout3, layoutParams8);
        }
        View view = new View(context);
        view.setId(R.id.ost);
        TypedArray typedArrayObtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a03});
        view.setBackgroundColor(typedArrayObtainStyledAttributes3.getColor(0, 0));
        typedArrayObtainStyledAttributes3.recycle();
        C786410Ut5.LJLLLLLL(8, view);
        FrameLayout.LayoutParams layoutParams11 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 100.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams11)) {
            ((ViewGroup.MarginLayoutParams) layoutParams11).topMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        android.view.a.LIZ(view);
        if (view.getParent() == null) {
            frameLayout.addView(view, layoutParams11);
        }
        android.view.a.LIZ(frameLayout);
        if (frameLayout.getParent() == null) {
            linearLayout.addView(frameLayout, layoutParams6);
        }
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(0);
        LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams12)) {
            ((ViewGroup.MarginLayoutParams) layoutParams12).topMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        LinearLayout linearLayout5 = new LinearLayout(context);
        linearLayout5.setId(R.id.used_count_root);
        linearLayout5.setOrientation(0);
        LinearLayout.LayoutParams layoutParams13 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams13)) {
            layoutParams13.setMarginEnd((int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()));
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams13)) {
            i3 = 16;
            layoutParams13.gravity = 16;
        } else {
            i3 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams13)) {
            ((FrameLayout.LayoutParams) layoutParams13).gravity = i3;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams13)) {
            ((DrawerLayout$LayoutParams) layoutParams13).gravity = i3;
        }
        TuxTextView tuxTextView3 = new TuxTextView(context);
        tuxTextView3.setId(R.id.used_count);
        tuxTextView3.setMaxWidth((int) TypedValue.applyDimension(1, 330.0f, resources.getDisplayMetrics()));
        tuxTextView3.setSingleLine(true);
        TypedArray typedArrayObtainStyledAttributes4 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1k});
        tuxTextView3.setTextColor(typedArrayObtainStyledAttributes4.getColor(0, 0));
        typedArrayObtainStyledAttributes4.recycle();
        LinearLayout.LayoutParams layoutParams14 = new LinearLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams14)) {
            i4 = 16;
            layoutParams14.gravity = 16;
        } else {
            i4 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams14)) {
            ((FrameLayout.LayoutParams) layoutParams14).gravity = i4;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams14)) {
            ((DrawerLayout$LayoutParams) layoutParams14).gravity = i4;
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P1_Regular"), tuxTextView3);
        android.view.a.LIZ(tuxTextView3);
        if (tuxTextView3.getParent() == null) {
            linearLayout5.addView(tuxTextView3, layoutParams14);
        }
        android.view.a.LIZ(linearLayout5);
        if (linearLayout5.getParent() == null) {
            linearLayout4.addView(linearLayout5, layoutParams13);
        }
        LinearLayout linearLayout6 = new LinearLayout(context);
        C786410Ut5.LJLLLLLL(8, linearLayout6);
        linearLayout6.setId(R.id.sqw);
        linearLayout6.setPadding(linearLayout6.getPaddingLeft(), linearLayout6.getPaddingTop(), (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()), linearLayout6.getPaddingBottom());
        linearLayout6.setPadding((int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()), linearLayout6.getPaddingTop(), linearLayout6.getPaddingRight(), linearLayout6.getPaddingBottom());
        LinearLayout.LayoutParams layoutParams15 = new LinearLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams15)) {
            i5 = 16;
            layoutParams15.gravity = 16;
        } else {
            i5 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams15)) {
            ((FrameLayout.LayoutParams) layoutParams15).gravity = i5;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams15)) {
            ((DrawerLayout$LayoutParams) layoutParams15).gravity = i5;
        }
        TuxIconView tuxIconView3 = new TuxIconView(context);
        tuxIconView3.setImportantForAccessibility(2);
        LinearLayout.LayoutParams layoutParams16 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams16)) {
            f = 4.0f;
            ((ViewGroup.MarginLayoutParams) layoutParams16).topMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        } else {
            f = 4.0f;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams16)) {
            ((ViewGroup.MarginLayoutParams) layoutParams16).bottomMargin = (int) TypedValue.applyDimension(1, f, resources.getDisplayMetrics());
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams16)) {
            i6 = 16;
            layoutParams16.gravity = 16;
        } else {
            i6 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams16)) {
            ((FrameLayout.LayoutParams) layoutParams16).gravity = i6;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams16)) {
            ((DrawerLayout$LayoutParams) layoutParams16).gravity = i6;
        }
        new k();
        k.LIZ("app:tux_tintColor", new a.b("2131100624", "attr"), tuxIconView3);
        k.LIZ("app:tux_icon", new a.b("2130772399", "raw"), tuxIconView3);
        android.view.a.LIZ(tuxIconView3);
        if (tuxIconView3.getParent() == null) {
            linearLayout6.addView(tuxIconView3, layoutParams16);
        }
        TuxTextView tuxTextView4 = new TuxTextView(context);
        tuxTextView4.setId(R.id.x22);
        tuxTextView4.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView4.setMaxLines(1);
        TypedArray typedArrayObtainStyledAttributes5 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1j});
        tuxTextView4.setTextColor(typedArrayObtainStyledAttributes5.getColor(0, 0));
        typedArrayObtainStyledAttributes5.recycle();
        LinearLayout.LayoutParams layoutParams17 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams17)) {
            layoutParams17.setMarginStart((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams17)) {
            i7 = 16;
            layoutParams17.gravity = 16;
        } else {
            i7 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams17)) {
            ((FrameLayout.LayoutParams) layoutParams17).gravity = i7;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams17)) {
            ((DrawerLayout$LayoutParams) layoutParams17).gravity = i7;
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P3_Semibold"), tuxTextView4);
        android.view.a.LIZ(tuxTextView4);
        if (tuxTextView4.getParent() == null) {
            linearLayout6.addView(tuxTextView4, layoutParams17);
        }
        android.view.a.LIZ(linearLayout6);
        if (linearLayout6.getParent() == null) {
            linearLayout4.addView(linearLayout6, layoutParams15);
        }
        android.view.a.LIZ(linearLayout4);
        if (linearLayout4.getParent() == null) {
            linearLayout.addView(linearLayout4, layoutParams12);
        }
        android.view.a.LIZ(linearLayout);
        C786410Ut5.W5(linearLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(linearLayout);
        }
        return linearLayout;
    }
}
