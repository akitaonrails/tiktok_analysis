package com.by.andInflater;

import X.C20742916Ex;
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
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class friends_tab_v3_live_content implements InterfaceC20742716Ev {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        int i2;
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.i75);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -2, viewGroup);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            marginLayoutParamsLJ.setMarginEnd((int) resources.getDimension(R.dimen.sf));
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.nc5);
        linearLayout.setOrientation(1);
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.zvr);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setMaxLines(2);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1h});
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = (int) resources.getDimension(R.dimen.s9);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.setMarginStart((int) TypedValue.applyDimension(1, 68.0f, resources.getDisplayMetrics()));
        }
        a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            linearLayout.addView(tuxTextView, layoutParams2);
        }
        RadiusLayout radiusLayout = new RadiusLayout(context);
        radiusLayout.setId(R.id.i72);
        TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a03});
        radiusLayout.setBackgroundColor(typedArrayObtainStyledAttributes2.getColor(0, 0));
        typedArrayObtainStyledAttributes2.recycle();
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -1);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin = (int) resources.getDimension(R.dimen.s9);
        }
        View frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.i8u);
        ViewGroup.LayoutParams layoutParamsLJ = a.LJ(-1, -1, radiusLayout);
        a.LIZ(frameLayout2);
        if (frameLayout2.getParent() == null) {
            radiusLayout.addView(frameLayout2, layoutParamsLJ);
        }
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setId(R.id.i4w);
        ViewGroup.LayoutParams layoutParamsLJ2 = a.LJ(-1, -1, radiusLayout);
        RemoteImageView remoteImageView = new RemoteImageView(context);
        remoteImageView.setId(R.id.kgf);
        remoteImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        ViewGroup.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -1);
        bc.a aVar = new bc.a();
        aVar.LIZLLL("app:actualImageScaleType", new a.c("centerCrop"), remoteImageView);
        aVar.LIZJ(remoteImageView);
        android.view.a.LIZ(remoteImageView);
        if (remoteImageView.getParent() == null) {
            frameLayout3.addView(remoteImageView, layoutParams4);
        }
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.n7h);
        tuxTextView2.setText(2131855011);
        TypedArray typedArrayObtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.zk});
        tuxTextView2.setTextColor(typedArrayObtainStyledAttributes3.getColor(0, 0));
        typedArrayObtainStyledAttributes3.recycle();
        tuxTextView2.setGravity(17);
        tuxTextView2.setPadding((int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), tuxTextView2.getPaddingTop(), tuxTextView2.getPaddingRight(), tuxTextView2.getPaddingBottom());
        tuxTextView2.setPadding(tuxTextView2.getPaddingLeft(), tuxTextView2.getPaddingTop(), (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), tuxTextView2.getPaddingBottom());
        tuxTextView2.setPadding(tuxTextView2.getPaddingLeft(), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), tuxTextView2.getPaddingRight(), tuxTextView2.getPaddingBottom());
        tuxTextView2.setPadding(tuxTextView2.getPaddingLeft(), tuxTextView2.getPaddingTop(), tuxTextView2.getPaddingRight(), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        C786410Ut5.LJLLLLLL(8, tuxTextView2);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams5)) {
            i = 17;
            ((LinearLayout.LayoutParams) layoutParams5).gravity = 17;
        } else {
            i = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.gravity = i;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams5)) {
            ((DrawerLayout$LayoutParams) layoutParams5).gravity = i;
        }
        new o();
        o.LIZ("app:tux_font", new a.c("H4_Semibold"), tuxTextView2);
        android.view.a.LIZ(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            frameLayout3.addView(tuxTextView2, layoutParams5);
        }
        android.view.a.LIZ(frameLayout3);
        if (frameLayout3.getParent() == null) {
            radiusLayout.addView(frameLayout3, layoutParamsLJ2);
        }
        View viewLIZ = C20742916Ex.LIZ(context, R.layout.cb1, radiusLayout, false, 0);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ2 = android.view.a.LJ(-2, -2, radiusLayout);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            i2 = 1;
            marginLayoutParamsLJ2.setMarginStart((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        } else {
            i2 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            marginLayoutParamsLJ2.topMargin = (int) TypedValue.applyDimension(i2, 8.0f, resources.getDisplayMetrics());
        }
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ2).gravity = 8388659;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ2).gravity = 8388659;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ2).gravity = 8388659;
        }
        if (viewLIZ.getParent() == null) {
            radiusLayout.addView(viewLIZ, marginLayoutParamsLJ2);
        }
        View viewLIZ2 = C20742916Ex.LIZ(context, R.layout.caz, radiusLayout, false, 0);
        ViewGroup.LayoutParams layoutParamsLJ3 = android.view.a.LJ(-1, (int) TypedValue.applyDimension(i2, 54.0f, resources.getDisplayMetrics()), radiusLayout);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParamsLJ3)) {
            ((LinearLayout.LayoutParams) layoutParamsLJ3).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParamsLJ3)) {
            ((FrameLayout.LayoutParams) layoutParamsLJ3).gravity = 80;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParamsLJ3)) {
            ((DrawerLayout$LayoutParams) layoutParamsLJ3).gravity = 80;
        }
        if (viewLIZ2.getParent() == null) {
            radiusLayout.addView(viewLIZ2, layoutParamsLJ3);
        }
        android.view.a.LIZ(radiusLayout);
        if (radiusLayout.getParent() == null) {
            linearLayout.addView(radiusLayout, layoutParams3);
        }
        TuxTextView tuxTextView3 = new TuxTextView(context);
        tuxTextView3.setId(R.id.zve);
        tuxTextView3.setMaxLines(i2);
        int[] iArr = new int[i2];
        iArr[0] = R.attr.a1k;
        TypedArray typedArrayObtainStyledAttributes4 = context.getTheme().obtainStyledAttributes(iArr);
        tuxTextView3.setTextColor(typedArrayObtainStyledAttributes4.getColor(0, 0));
        typedArrayObtainStyledAttributes4.recycle();
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams6)) {
            ((ViewGroup.MarginLayoutParams) layoutParams6).topMargin = (int) resources.getDimension(R.dimen.t8);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.setMarginStart((int) TypedValue.applyDimension(i2, 68.0f, resources.getDisplayMetrics()));
        }
        android.view.a.LIZ(tuxTextView3);
        if (tuxTextView3.getParent() == null) {
            linearLayout.addView(tuxTextView3, layoutParams6);
        }
        android.view.a.LIZ(linearLayout);
        if (linearLayout.getParent() == null) {
            frameLayout.addView(linearLayout, layoutParams);
        }
        TuxTextView tuxTextView4 = new TuxTextView(context);
        tuxTextView4.setId(R.id.fgo);
        int[] iArr2 = new int[i2];
        iArr2[0] = R.attr.e3;
        TypedArray typedArrayObtainStyledAttributes5 = context.getTheme().obtainStyledAttributes(iArr2);
        tuxTextView4.setBackgroundColor(typedArrayObtainStyledAttributes5.getColor(0, 0));
        typedArrayObtainStyledAttributes5.recycle();
        int[] iArr3 = new int[i2];
        iArr3[0] = R.attr.ee;
        TypedArray typedArrayObtainStyledAttributes6 = context.getTheme().obtainStyledAttributes(iArr3);
        tuxTextView4.setTextColor(typedArrayObtainStyledAttributes6.getColor(0, 0));
        typedArrayObtainStyledAttributes6.recycle();
        FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams7)) {
            ((LinearLayout.LayoutParams) layoutParams7).gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams7)) {
            layoutParams7.gravity = 16;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams7)) {
            ((DrawerLayout$LayoutParams) layoutParams7).gravity = 16;
        }
        android.view.a.LIZ(tuxTextView4);
        if (tuxTextView4.getParent() == null) {
            frameLayout.addView(tuxTextView4, layoutParams7);
        }
        android.view.a.LIZ(frameLayout);
        C786410Ut5.W5(frameLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        return frameLayout;
    }
}
