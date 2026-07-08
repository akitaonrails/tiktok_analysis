package com.by.andInflater;

import X.C20742916Ex;
import X.C21613119iD;
import X.C21696019va;
import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.bytedance.tux.widget.RadiusLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public class friends_tab_v3_photo_content implements InterfaceC20742716Ev {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.ng8);
        linearLayout.setClipChildren(false);
        linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), linearLayout.getPaddingRight(), (int) resources.getDimension(R.dimen.s9));
        linearLayout.setOrientation(1);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-2, -2, viewGroup);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.qc4);
        frameLayout.setClipChildren(false);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = new ViewOnAttachStateChangeListenerC20604515jv(context, null);
        viewOnAttachStateChangeListenerC20604515jv.setId(R.id.qcz);
        viewOnAttachStateChangeListenerC20604515jv.setClipToPadding(false);
        viewOnAttachStateChangeListenerC20604515jv.setOrientation(0);
        viewOnAttachStateChangeListenerC20604515jv.setPadding((int) TypedValue.applyDimension(1, 68.0f, resources.getDisplayMetrics()), viewOnAttachStateChangeListenerC20604515jv.getPaddingTop(), viewOnAttachStateChangeListenerC20604515jv.getPaddingRight(), viewOnAttachStateChangeListenerC20604515jv.getPaddingBottom());
        viewOnAttachStateChangeListenerC20604515jv.setPadding(viewOnAttachStateChangeListenerC20604515jv.getPaddingLeft(), viewOnAttachStateChangeListenerC20604515jv.getPaddingTop(), (int) resources.getDimension(R.dimen.sf), viewOnAttachStateChangeListenerC20604515jv.getPaddingBottom());
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 200.0f, resources.getDisplayMetrics()));
        a.LIZ(viewOnAttachStateChangeListenerC20604515jv);
        if (viewOnAttachStateChangeListenerC20604515jv.getParent() == null) {
            frameLayout.addView(viewOnAttachStateChangeListenerC20604515jv, layoutParams2);
        }
        C21613119iD c21613119iD = new C21613119iD(context, null, 6);
        c21613119iD.setId(R.id.jrp);
        c21613119iD.setClipToPadding(false);
        ViewGroup.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 200.0f, resources.getDisplayMetrics()));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setId(R.id.jr8);
        linearLayout2.setClipToPadding(false);
        linearLayout2.setOrientation(0);
        linearLayout2.setPadding((int) TypedValue.applyDimension(1, 68.0f, resources.getDisplayMetrics()), linearLayout2.getPaddingTop(), linearLayout2.getPaddingRight(), linearLayout2.getPaddingBottom());
        linearLayout2.setPadding(linearLayout2.getPaddingLeft(), linearLayout2.getPaddingTop(), (int) resources.getDimension(R.dimen.sf), linearLayout2.getPaddingBottom());
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ2 = a.LJ(-2, -2, c21613119iD);
        a.LIZ(linearLayout2);
        if (linearLayout2.getParent() == null) {
            c21613119iD.addView(linearLayout2, marginLayoutParamsLJ2);
        }
        a.LIZ(c21613119iD);
        if (c21613119iD.getParent() == null) {
            frameLayout.addView(c21613119iD, layoutParams3);
        }
        View c21696019va = new C21696019va(context);
        c21696019va.setId(R.id.vcd);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.setMarginStart((int) TypedValue.applyDimension(1, 68.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.setMarginEnd((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        a.LIZ(c21696019va);
        if (c21696019va.getParent() == null) {
            frameLayout.addView(c21696019va, layoutParams4);
        }
        View radiusLayout = new RadiusLayout(context);
        radiusLayout.setId(R.id.lqs);
        C786410Ut5.LJLLLLLL(8, radiusLayout);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams5)) {
            ((LinearLayout.LayoutParams) layoutParams5).gravity = 8388659;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.gravity = 8388659;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams5)) {
            ((DrawerLayout$LayoutParams) layoutParams5).gravity = 8388659;
        }
        a.LIZ(radiusLayout);
        if (radiusLayout.getParent() == null) {
            frameLayout.addView(radiusLayout, layoutParams5);
        }
        a.LIZ(frameLayout);
        if (frameLayout.getParent() == null) {
            linearLayout.addView(frameLayout, layoutParams);
        }
        View viewLIZ = C20742916Ex.LIZ(context, R.layout.cbv, linearLayout, false, R.layout.cb5);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.setMarginStart((int) TypedValue.applyDimension(1, 68.0f, resources.getDisplayMetrics()));
        }
        if (viewLIZ.getParent() == null) {
            linearLayout.addView(viewLIZ, layoutParams6);
        }
        a.LIZ(linearLayout);
        C786410Ut5.W5(linearLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(linearLayout);
        }
        return linearLayout;
    }
}
