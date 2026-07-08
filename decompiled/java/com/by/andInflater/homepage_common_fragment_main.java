package com.by.andInflater;

import X.C0SUP;
import X.C0SUQ;
import X.C20742916Ex;
import X.C21600519gB;
import X.C486650J6p;
import X.C705880RmU;
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
public class homepage_common_fragment_main implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.i9v);
        frameLayout.setClipChildren(false);
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
        C0SUP c0sup = new C0SUP(context);
        c0sup.setId(R.id.y0b);
        c0sup.setClipChildren(false);
        c0sup.setOrientation(1);
        ViewGroup.LayoutParams layoutParamsLJ4 = a.LJ(-1, -1, c486650J6p);
        View view = new View(context);
        view.setId(R.id.w0u);
        ViewGroup.LayoutParams layoutParamsLJ5 = a.LJ(-1, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), c0sup);
        a.LIZ(view);
        if (view.getParent() == null) {
            c0sup.addView(view, layoutParamsLJ5);
        }
        C705880RmU c705880RmU = new C705880RmU(14, context, null);
        c705880RmU.setClipChildren(false);
        ViewGroup.LayoutParams layoutParamsLJ6 = a.LJ(-1, -2, c0sup);
        C0SUQ c0suq = new C0SUQ(context);
        c0suq.setId(R.id.tpm);
        c0suq.setClipToPadding(false);
        c0suq.setClipChildren(false);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ2 = a.LJ(-1, -2, c705880RmU);
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ2).gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ2).gravity = 16;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ2).gravity = 16;
        }
        a.LIZ(c0suq);
        if (c0suq.getParent() == null) {
            c705880RmU.addView(c0suq, marginLayoutParamsLJ2);
        }
        View viewLIZ = C20742916Ex.LIZ(context, R.layout.cdr, c705880RmU, false, 0);
        if (viewLIZ.getParent() == null) {
            c705880RmU.addView(viewLIZ);
        }
        a.LIZ(c705880RmU);
        if (c705880RmU.getParent() == null) {
            c0sup.addView(c705880RmU, layoutParamsLJ6);
        }
        View frameLayout4 = new FrameLayout(context);
        frameLayout4.setId(R.id.pay);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ3 = a.LJ(-1, -2, c0sup);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            marginLayoutParamsLJ3.topMargin = (int) TypedValue.applyDimension(1, 26.0f, resources.getDisplayMetrics());
        }
        a.LIZ(frameLayout4);
        if (frameLayout4.getParent() == null) {
            c0sup.addView(frameLayout4, marginLayoutParamsLJ3);
        }
        View frameLayout5 = new FrameLayout(context);
        frameLayout5.setId(R.id.awl);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ4 = a.LJ(-1, -2, c0sup);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ4)) {
            marginLayoutParamsLJ4.topMargin = (int) TypedValue.applyDimension(1, 26.0f, resources.getDisplayMetrics());
        }
        a.LIZ(frameLayout5);
        if (frameLayout5.getParent() == null) {
            c0sup.addView(frameLayout5, marginLayoutParamsLJ4);
        }
        a.LIZ(c0sup);
        if (c0sup.getParent() == null) {
            c486650J6p.addView(c0sup, layoutParamsLJ4);
        }
        a.LIZ(c486650J6p);
        if (c486650J6p.getParent() == null) {
            frameLayout.addView(c486650J6p, layoutParams2);
        }
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(R.id.jqo);
        ViewGroup.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        viewStub.setInflatedId(-1);
        a.LIZ(viewStub);
        if (viewStub.getParent() == null) {
            frameLayout.addView(viewStub, layoutParams3);
        }
        View viewLIZ2 = C20742916Ex.LIZ(context, R.layout.cde, frameLayout, false, R.layout.cd_);
        viewLIZ2.setId(R.id.vji);
        if (viewLIZ2.getParent() == null) {
            frameLayout.addView(viewLIZ2);
        }
        a.LIZ(frameLayout);
        C786410Ut5.W5(frameLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        return frameLayout;
    }
}
