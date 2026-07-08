package com.by.andInflater;

import X.C20742916Ex;
import X.C487390J9l;
import X.C725840Sda;
import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tux.widget.RadiusLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public class friends_tab_v3_repost_content implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.t9o);
        linearLayout.setOrientation(1);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-2, -2, viewGroup);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            marginLayoutParamsLJ.setMarginStart((int) TypedValue.applyDimension(1, 68.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            marginLayoutParamsLJ.bottomMargin = (int) resources.getDimension(R.dimen.s9);
        }
        RadiusLayout radiusLayout = new RadiusLayout(context);
        radiusLayout.setId(R.id.t9e);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            layoutParams.setMarginEnd((int) resources.getDimension(R.dimen.sf));
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        ViewGroup.LayoutParams layoutParamsLJ = a.LJ(-2, -2, radiusLayout);
        C487390J9l c487390J9l = new C487390J9l(context, null, 6);
        c487390J9l.setOrientation(1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.setMarginStart((int) resources.getDimension(R.dimen.s9));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.setMarginEnd((int) resources.getDimension(R.dimen.s9));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = (int) resources.getDimension(R.dimen.s9);
        }
        C725840Sda c725840Sda = new C725840Sda(context, null, 6);
        c725840Sda.setId(R.id.t9a);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ2 = a.LJ(-1, -2, c487390J9l);
        a.LIZ(c725840Sda);
        if (c725840Sda.getParent() == null) {
            c487390J9l.addView(c725840Sda, marginLayoutParamsLJ2);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.t9r);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ3 = a.LJ(-1, -2, c487390J9l);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            marginLayoutParamsLJ3.topMargin = (int) resources.getDimension(R.dimen.sz);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            marginLayoutParamsLJ3.bottomMargin = (int) resources.getDimension(R.dimen.sz);
        }
        a.LIZ(frameLayout);
        if (frameLayout.getParent() == null) {
            c487390J9l.addView(frameLayout, marginLayoutParamsLJ3);
        }
        a.LIZ(c487390J9l);
        if (c487390J9l.getParent() == null) {
            linearLayout2.addView(c487390J9l, layoutParams2);
        }
        View frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.dec);
        ViewGroup.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        a.LIZ(frameLayout2);
        if (frameLayout2.getParent() == null) {
            linearLayout2.addView(frameLayout2, layoutParams3);
        }
        a.LIZ(linearLayout2);
        if (linearLayout2.getParent() == null) {
            radiusLayout.addView(linearLayout2, layoutParamsLJ);
        }
        a.LIZ(radiusLayout);
        if (radiusLayout.getParent() == null) {
            linearLayout.addView(radiusLayout, layoutParams);
        }
        View viewLIZ = C20742916Ex.LIZ(context, R.layout.cbv, linearLayout, false, R.layout.cbe);
        if (viewLIZ.getParent() == null) {
            linearLayout.addView(viewLIZ);
        }
        a.LIZ(linearLayout);
        C786410Ut5.W5(linearLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(linearLayout);
        }
        return linearLayout;
    }
}
