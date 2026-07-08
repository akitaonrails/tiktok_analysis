package com.by.andInflater;

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
import androidx.appcompat.widget.AppCompatImageView;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public class detail_feed_activity_video_detail implements InterfaceC20742716Ev {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(resources.getColor(R.color.dr));
        frameLayout.setId(R.id.fri);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -1, viewGroup);
        View frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.iiz);
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        a.LIZ(frameLayout2);
        if (frameLayout2.getParent() == null) {
            frameLayout.addView(frameLayout2, layoutParams);
        }
        View frameLayout3 = new FrameLayout(context);
        frameLayout3.setId(R.id.iiv);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        a.LIZ(frameLayout3);
        if (frameLayout3.getParent() == null) {
            frameLayout.addView(frameLayout3, layoutParams2);
        }
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setImageResource(R.drawable.cfh);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams3)) {
            ((LinearLayout.LayoutParams) layoutParams3).gravity = 51;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.gravity = 51;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams3)) {
            ((DrawerLayout$LayoutParams) layoutParams3).gravity = 51;
        }
        a.LIZ(appCompatImageView);
        if (appCompatImageView.getParent() == null) {
            frameLayout.addView(appCompatImageView, layoutParams3);
        }
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context);
        appCompatImageView2.setImageResource(R.drawable.cfi);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams4)) {
            ((LinearLayout.LayoutParams) layoutParams4).gravity = 53;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.gravity = 53;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams4)) {
            ((DrawerLayout$LayoutParams) layoutParams4).gravity = 53;
        }
        a.LIZ(appCompatImageView2);
        if (appCompatImageView2.getParent() == null) {
            frameLayout.addView(appCompatImageView2, layoutParams4);
        }
        View frameLayout4 = new FrameLayout(context);
        frameLayout4.setId(R.id.j2f);
        ViewGroup.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, -1);
        a.LIZ(frameLayout4);
        if (frameLayout4.getParent() == null) {
            frameLayout.addView(frameLayout4, layoutParams5);
        }
        View frameLayout5 = new FrameLayout(context);
        frameLayout5.setId(R.id.ab5);
        ViewGroup.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, -1);
        a.LIZ(frameLayout5);
        if (frameLayout5.getParent() == null) {
            frameLayout.addView(frameLayout5, layoutParams6);
        }
        FrameLayout frameLayout6 = new FrameLayout(context);
        frameLayout6.setId(R.id.ib5);
        C786410Ut5.LJLLLLLL(8, frameLayout6);
        ViewGroup.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-1, -1);
        AppCompatImageView appCompatImageView3 = new AppCompatImageView(context);
        appCompatImageView3.setId(R.id.xuv);
        appCompatImageView3.setImportantForAccessibility(2);
        FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(-1, -1);
        a.LIZ(appCompatImageView3);
        if (appCompatImageView3.getParent() == null) {
            frameLayout6.addView(appCompatImageView3, layoutParams8);
        }
        a.LIZ(frameLayout6);
        if (frameLayout6.getParent() == null) {
            frameLayout.addView(frameLayout6, layoutParams7);
        }
        View frameLayout7 = new FrameLayout(context);
        frameLayout7.setId(R.id.ykw);
        C786410Ut5.LJLLLLLL(8, frameLayout7);
        ViewGroup.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(-2, -2);
        a.LIZ(frameLayout7);
        if (frameLayout7.getParent() == null) {
            frameLayout.addView(frameLayout7, layoutParams9);
        }
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(R.id.emr);
        viewStub.setLayoutResource(R.layout.b5w);
        ViewGroup.LayoutParams layoutParams10 = new FrameLayout.LayoutParams(-1, -1);
        viewStub.setInflatedId(-1);
        a.LIZ(viewStub);
        if (viewStub.getParent() == null) {
            frameLayout.addView(viewStub, layoutParams10);
        }
        ViewStub viewStub2 = new ViewStub(context);
        viewStub2.setId(R.id.a91);
        viewStub2.setLayoutResource(R.layout.bkg);
        ViewGroup.LayoutParams layoutParams11 = new FrameLayout.LayoutParams(-1, -1);
        viewStub2.setInflatedId(-1);
        a.LIZ(viewStub2);
        if (viewStub2.getParent() == null) {
            frameLayout.addView(viewStub2, layoutParams11);
        }
        ViewStub viewStub3 = new ViewStub(context);
        viewStub3.setId(R.id.jqo);
        ViewGroup.LayoutParams layoutParams12 = new FrameLayout.LayoutParams(-1, -1);
        viewStub3.setInflatedId(-1);
        a.LIZ(viewStub3);
        if (viewStub3.getParent() == null) {
            frameLayout.addView(viewStub3, layoutParams12);
        }
        a.LIZ(frameLayout);
        C786410Ut5.W5(frameLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        return frameLayout;
    }
}
