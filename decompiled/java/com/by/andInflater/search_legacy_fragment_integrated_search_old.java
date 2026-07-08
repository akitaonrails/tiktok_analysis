package com.by.andInflater;

import X.C20742916Ex;
import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public class search_legacy_fragment_integrated_search_old implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.np7);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -1, viewGroup);
        View frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.a5w);
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        a.LIZ(frameLayout2);
        if (frameLayout2.getParent() == null) {
            frameLayout.addView(frameLayout2, layoutParams);
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setId(R.id.ydn);
        ViewGroup.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        View viewLIZ = C20742916Ex.LIZ(context, R.layout.f1v, relativeLayout, false, 0);
        viewLIZ.setId(R.id.u78);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, (int) resources.getDimension(R.dimen.b3i));
        if (viewLIZ.getParent() == null) {
            relativeLayout.addView(viewLIZ, layoutParams4);
        }
        a.LIZ(relativeLayout);
        if (relativeLayout.getParent() == null) {
            linearLayout.addView(relativeLayout, layoutParams3);
        }
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setId(R.id.iit);
        ViewGroup.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -1);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams5)) {
            ((RelativeLayout.LayoutParams) layoutParams5).addRule(3, R.id.ydn);
        }
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout4.setId(R.id.iiv);
        ViewGroup.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, -1);
        SmartImageView smartImageView = new SmartImageView(context);
        smartImageView.setId(R.id.tdn);
        C786410Ut5.LJZI(0, smartImageView);
        FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-1, -1);
        a.LIZ(smartImageView);
        if (smartImageView.getParent() == null) {
            frameLayout4.addView(smartImageView, layoutParams7);
        }
        a.LIZ(frameLayout4);
        if (frameLayout4.getParent() == null) {
            frameLayout3.addView(frameLayout4, layoutParams6);
        }
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(R.id.ub6);
        ViewGroup.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(-1, -1);
        viewStub.setInflatedId(-1);
        a.LIZ(viewStub);
        if (viewStub.getParent() == null) {
            frameLayout3.addView(viewStub, layoutParams8);
        }
        a.LIZ(frameLayout3);
        if (frameLayout3.getParent() == null) {
            linearLayout.addView(frameLayout3, layoutParams5);
        }
        a.LIZ(linearLayout);
        if (linearLayout.getParent() == null) {
            frameLayout.addView(linearLayout, layoutParams2);
        }
        ViewStub viewStub2 = new ViewStub(context);
        viewStub2.setId(R.id.u6y);
        viewStub2.setLayoutResource(R.layout.esj);
        ViewGroup.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(-1, -1);
        viewStub2.setInflatedId(-1);
        a.LIZ(viewStub2);
        if (viewStub2.getParent() == null) {
            frameLayout.addView(viewStub2, layoutParams9);
        }
        a.LIZ(frameLayout);
        C786410Ut5.W5(frameLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        return frameLayout;
    }
}
