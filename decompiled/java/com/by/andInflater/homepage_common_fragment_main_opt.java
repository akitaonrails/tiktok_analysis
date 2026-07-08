package com.by.andInflater;

import X.C0SUP;
import X.C0SUQ;
import X.C20742916Ex;
import X.C21600519gB;
import X.C486650J6p;
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
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public class homepage_common_fragment_main_opt implements InterfaceC20742716Ev {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.i9v);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -1, viewGroup);
        View frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.rnx);
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        a.LIZ(frameLayout2);
        if (frameLayout2.getParent() == null) {
            frameLayout.addView(frameLayout2, layoutParams);
        }
        C486650J6p c486650J6p = new C486650J6p(context);
        c486650J6p.setId(R.id.i4u);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        View c21600519gB = new C21600519gB(context);
        c21600519gB.setId(R.id.viewpager);
        ViewGroup.LayoutParams layoutParamsLJ = a.LJ(-1, -1, c486650J6p);
        a.LIZ(c21600519gB);
        if (c21600519gB.getParent() == null) {
            c486650J6p.addView(c21600519gB, layoutParamsLJ);
        }
        View frameLayout3 = new FrameLayout(context);
        frameLayout3.setId(R.id.yhw);
        frameLayout3.setBackgroundColor(resources.getColor(R.color.b6));
        C786410Ut5.LJLLLLLL(8, frameLayout3);
        ViewGroup.LayoutParams layoutParamsLJ2 = a.LJ(-1, -1, c486650J6p);
        a.LIZ(frameLayout3);
        if (frameLayout3.getParent() == null) {
            c486650J6p.addView(frameLayout3, layoutParamsLJ2);
        }
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R.id.title_shadow);
        appCompatImageView.setImageResource(R.drawable.buc);
        C786410Ut5.LJZI(0, appCompatImageView);
        ViewGroup.LayoutParams layoutParamsLJ3 = a.LJ(-1, -2, c486650J6p);
        a.LIZ(appCompatImageView);
        if (appCompatImageView.getParent() == null) {
            c486650J6p.addView(appCompatImageView, layoutParamsLJ3);
        }
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(R.id.nww);
        viewStub.setLayoutResource(R.layout.b_n);
        ViewGroup.LayoutParams layoutParamsLJ4 = a.LJ(-1, -2, c486650J6p);
        viewStub.setInflatedId(-1);
        a.LIZ(viewStub);
        if (viewStub.getParent() == null) {
            c486650J6p.addView(viewStub, layoutParamsLJ4);
        }
        C0SUP c0sup = new C0SUP(context);
        c0sup.setId(R.id.y0b);
        c0sup.setOrientation(1);
        c0sup.setClipChildren(false);
        ViewGroup.LayoutParams layoutParamsLJ5 = a.LJ(-1, -1, c486650J6p);
        View view = new View(context);
        view.setId(R.id.w0u);
        ViewGroup.LayoutParams layoutParamsLJ6 = a.LJ(-1, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), c0sup);
        a.LIZ(view);
        if (view.getParent() == null) {
            c0sup.addView(view, layoutParamsLJ6);
        }
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout4.setClipChildren(false);
        ViewGroup.LayoutParams layoutParamsLJ7 = a.LJ(-1, -2, c0sup);
        C0SUQ c0suq = new C0SUQ(context);
        c0suq.setId(R.id.tpm);
        c0suq.setClipChildren(false);
        c0suq.setClipToPadding(false);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams3)) {
            ((LinearLayout.LayoutParams) layoutParams3).gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.gravity = 16;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams3)) {
            ((DrawerLayout$LayoutParams) layoutParams3).gravity = 16;
        }
        a.LIZ(c0suq);
        if (c0suq.getParent() == null) {
            frameLayout4.addView(c0suq, layoutParams3);
        }
        ViewStub viewStub2 = new ViewStub(context);
        viewStub2.setId(R.id.xg7);
        viewStub2.setInflatedId(R.id.xg6);
        viewStub2.setLayoutResource(R.layout.cdr);
        ViewGroup.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -2);
        a.LIZ(viewStub2);
        if (viewStub2.getParent() == null) {
            frameLayout4.addView(viewStub2, layoutParams4);
        }
        a.LIZ(frameLayout4);
        if (frameLayout4.getParent() == null) {
            c0sup.addView(frameLayout4, layoutParamsLJ7);
        }
        View frameLayout5 = new FrameLayout(context);
        frameLayout5.setId(R.id.pay);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ2 = a.LJ(-1, -2, c0sup);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            marginLayoutParamsLJ2.topMargin = (int) TypedValue.applyDimension(1, 26.0f, resources.getDisplayMetrics());
        }
        a.LIZ(frameLayout5);
        if (frameLayout5.getParent() == null) {
            c0sup.addView(frameLayout5, marginLayoutParamsLJ2);
        }
        View frameLayout6 = new FrameLayout(context);
        frameLayout6.setId(R.id.awl);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ3 = a.LJ(-1, -2, c0sup);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            marginLayoutParamsLJ3.topMargin = (int) TypedValue.applyDimension(1, 26.0f, resources.getDisplayMetrics());
        }
        a.LIZ(frameLayout6);
        if (frameLayout6.getParent() == null) {
            c0sup.addView(frameLayout6, marginLayoutParamsLJ3);
        }
        a.LIZ(c0sup);
        if (c0sup.getParent() == null) {
            c486650J6p.addView(c0sup, layoutParamsLJ5);
        }
        a.LIZ(c486650J6p);
        if (c486650J6p.getParent() == null) {
            frameLayout.addView(c486650J6p, layoutParams2);
        }
        ViewStub viewStub3 = new ViewStub(context);
        viewStub3.setId(R.id.jqo);
        ViewGroup.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, -1);
        viewStub3.setInflatedId(-1);
        a.LIZ(viewStub3);
        if (viewStub3.getParent() == null) {
            frameLayout.addView(viewStub3, layoutParams5);
        }
        View viewLIZ = C20742916Ex.LIZ(context, R.layout.cde, frameLayout, false, R.layout.cda);
        viewLIZ.setId(R.id.vji);
        if (viewLIZ.getParent() == null) {
            frameLayout.addView(viewLIZ);
        }
        a.LIZ(frameLayout);
        C786410Ut5.W5(frameLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        return frameLayout;
    }
}
