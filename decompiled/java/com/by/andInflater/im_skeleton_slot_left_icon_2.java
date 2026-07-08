package com.by.andInflater;

import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.a;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public class im_skeleton_slot_left_icon_2 implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.k6q);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-2, -2, viewGroup);
        View view = new View(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        a.LIZ(view);
        if (view.getParent() == null) {
            frameLayout.addView(view, layoutParams);
        }
        ViewStub viewStub = new ViewStub(context);
        viewStub.setLayoutResource(R.layout.cfc);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        viewStub.setInflatedId(-1);
        a.LIZ(viewStub);
        if (viewStub.getParent() == null) {
            frameLayout.addView(viewStub, layoutParams2);
        }
        ViewStub viewStub2 = new ViewStub(context);
        viewStub2.setId(R.id.nni);
        viewStub2.setLayoutResource(R.layout.cff);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        viewStub2.setInflatedId(-1);
        a.LIZ(viewStub2);
        if (viewStub2.getParent() == null) {
            frameLayout.addView(viewStub2, layoutParams3);
        }
        ViewStub viewStub3 = new ViewStub(context);
        viewStub3.setId(R.id.iid);
        viewStub3.setLayoutResource(R.layout.cfd);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()));
        viewStub3.setInflatedId(-1);
        a.LIZ(viewStub3);
        if (viewStub3.getParent() == null) {
            frameLayout.addView(viewStub3, layoutParams4);
        }
        ViewStub viewStub4 = new ViewStub(context);
        viewStub4.setId(R.id.t7q);
        viewStub4.setLayoutResource(R.layout.cfe);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()));
        viewStub4.setInflatedId(-1);
        a.LIZ(viewStub4);
        if (viewStub4.getParent() == null) {
            frameLayout.addView(viewStub4, layoutParams5);
        }
        ViewStub viewStub5 = new ViewStub(context);
        viewStub5.setLayoutResource(R.layout.cnn);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        viewStub5.setInflatedId(-1);
        a.LIZ(viewStub5);
        if (viewStub5.getParent() == null) {
            frameLayout.addView(viewStub5, layoutParams6);
        }
        ViewStub viewStub6 = new ViewStub(context);
        viewStub6.setId(R.id.af9);
        viewStub6.setLayoutResource(R.layout.cnl);
        FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()));
        viewStub6.setInflatedId(-1);
        a.LIZ(viewStub6);
        if (viewStub6.getParent() == null) {
            frameLayout.addView(viewStub6, layoutParams7);
        }
        a.LIZ(frameLayout);
        C786410Ut5.W5(frameLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        return frameLayout;
    }
}
