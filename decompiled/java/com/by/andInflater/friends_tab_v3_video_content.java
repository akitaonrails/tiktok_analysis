package com.by.andInflater;

import X.C20742916Ex;
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
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.widget.RadiusLayout;
import com.zhiliaoapp.musically.R;
import dc.a;
import jf8.c;

/* JADX INFO: loaded from: classes32.dex */
public class friends_tab_v3_video_content implements InterfaceC20742716Ev {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.ibd);
        frameLayout.setClipChildren(false);
        frameLayout.setPadding(frameLayout.getPaddingLeft(), frameLayout.getPaddingTop(), (int) resources.getDimension(R.dimen.sf), frameLayout.getPaddingBottom());
        frameLayout.setPadding(frameLayout.getPaddingLeft(), frameLayout.getPaddingTop(), frameLayout.getPaddingRight(), (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -2, viewGroup);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.nc5);
        linearLayout.setClipChildren(false);
        linearLayout.setOrientation(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            layoutParams.setMarginStart((int) resources.getDimension(R.dimen.y7));
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setClipChildren(false);
        ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        RadiusLayout radiusLayout = new RadiusLayout(context);
        radiusLayout.setId(R.id.ibc);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a03});
        radiusLayout.setBackgroundColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        ViewGroup.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setId(R.id.ibf);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ2 = a.LJ(-1, -1, radiusLayout);
        a.LIZ(frameLayout3);
        if (frameLayout3.getParent() == null) {
            radiusLayout.addView(frameLayout3, marginLayoutParamsLJ2);
        }
        SmartImageView smartImageView = new SmartImageView(context);
        smartImageView.setId(R.id.ld7);
        C786410Ut5.LJZI(8, smartImageView);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ3 = a.LJ(-1, -1, radiusLayout);
        c cVar = new c();
        cVar.LIZIZ("app:placeholderImage", new a.b("2131100570", "attr"), smartImageView);
        cVar.LIZIZ("app:placeholderImageScaleType", new a.c("centerCrop"), smartImageView);
        cVar.LIZ(smartImageView);
        android.view.a.LIZ(smartImageView);
        if (smartImageView.getParent() == null) {
            radiusLayout.addView(smartImageView, marginLayoutParamsLJ3);
        }
        View viewLIZ = C20742916Ex.LIZ(context, R.layout.cbz, radiusLayout, false, 0);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ4 = android.view.a.LJ(-1, (int) TypedValue.applyDimension(1, 54.0f, resources.getDisplayMetrics()), radiusLayout);
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ4)) {
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ4).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ4)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ4).gravity = 80;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ4)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ4).gravity = 80;
        }
        if (viewLIZ.getParent() == null) {
            radiusLayout.addView(viewLIZ, marginLayoutParamsLJ4);
        }
        View viewLIZ2 = C20742916Ex.LIZ(context, R.layout.cc1, radiusLayout, false, 0);
        if (viewLIZ2.getParent() == null) {
            radiusLayout.addView(viewLIZ2);
        }
        View viewLIZ3 = C20742916Ex.LIZ(context, R.layout.cbu, radiusLayout, false, 0);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ5 = android.view.a.LJ(-2, (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()), radiusLayout);
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ5)) {
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ5).gravity = 8388661;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ5)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ5).gravity = 8388661;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ5)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ5).gravity = 8388661;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ5)) {
            i = 1;
            marginLayoutParamsLJ5.topMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        } else {
            i = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ5)) {
            marginLayoutParamsLJ5.setMarginEnd((int) TypedValue.applyDimension(i, 8.0f, resources.getDisplayMetrics()));
        }
        if (viewLIZ3.getParent() == null) {
            radiusLayout.addView(viewLIZ3, marginLayoutParamsLJ5);
        }
        android.view.a.LIZ(radiusLayout);
        if (radiusLayout.getParent() == null) {
            frameLayout2.addView(radiusLayout, layoutParams3);
        }
        View radiusLayout2 = new RadiusLayout(context);
        radiusLayout2.setId(R.id.lzf);
        C786410Ut5.LJLLLLLL(8, radiusLayout2);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams4)) {
            ((LinearLayout.LayoutParams) layoutParams4).gravity = 8388659;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.gravity = 8388659;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams4)) {
            ((DrawerLayout$LayoutParams) layoutParams4).gravity = 8388659;
        }
        android.view.a.LIZ(radiusLayout2);
        if (radiusLayout2.getParent() == null) {
            frameLayout2.addView(radiusLayout2, layoutParams4);
        }
        android.view.a.LIZ(frameLayout2);
        if (frameLayout2.getParent() == null) {
            linearLayout.addView(frameLayout2, layoutParams2);
        }
        View viewLIZ4 = C20742916Ex.LIZ(context, R.layout.cbv, linearLayout, false, 0);
        if (viewLIZ4.getParent() == null) {
            linearLayout.addView(viewLIZ4);
        }
        android.view.a.LIZ(linearLayout);
        if (linearLayout.getParent() == null) {
            frameLayout.addView(linearLayout, layoutParams);
        }
        android.view.a.LIZ(frameLayout);
        C786410Ut5.W5(frameLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        return frameLayout;
    }
}
