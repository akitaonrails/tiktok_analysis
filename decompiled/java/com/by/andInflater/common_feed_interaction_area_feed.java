package com.by.andInflater;

import X.C0SUU;
import X.C20742916Ex;
import X.C708910RrN;
import X.C709020RrY;
import X.C726240SeE;
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
import android.widget.RelativeLayout;
import com.ss.android.ugc.aweme.experiment.ViewStubOptExperimentV2;
import com.ss.android.ugc.feed.platform.cell.interact.view.InteractCheckDrawRelativeLayout;
import com.ss.android.ugc.feed.platform.componentmanager.view.InteractAreaRootLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes12.dex */
public class common_feed_interaction_area_feed implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        InteractAreaRootLayout interactAreaRootLayout = new InteractAreaRootLayout(context);
        interactAreaRootLayout.setId(R.id.widget_container);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -1, viewGroup);
        View frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.iny);
        C786410Ut5.LJLLLLLL(8, frameLayout);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ2 = a.LJ(-1, -1, interactAreaRootLayout);
        if (RelativeLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            ((RelativeLayout.LayoutParams) marginLayoutParamsLJ2).addRule(12, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            marginLayoutParamsLJ2.bottomMargin = (int) TypedValue.applyDimension(1, 47.0f, resources.getDisplayMetrics());
        }
        a.LIZ(frameLayout);
        if (frameLayout.getParent() == null) {
            interactAreaRootLayout.addView(frameLayout, marginLayoutParamsLJ2);
        }
        View viewLIZ = C20742916Ex.LIZ(context, R.layout.b6f, interactAreaRootLayout, false, R.layout.b7j);
        viewLIZ.setId(R.id.hpa);
        if (viewLIZ.getParent() == null) {
            interactAreaRootLayout.addView(viewLIZ);
        }
        InteractCheckDrawRelativeLayout interactCheckDrawRelativeLayout = new InteractCheckDrawRelativeLayout(context);
        interactCheckDrawRelativeLayout.setId(R.id.yeg);
        ViewGroup.LayoutParams layoutParamsLJ = a.LJ(-1, -1, interactAreaRootLayout);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParamsLJ)) {
            ((RelativeLayout.LayoutParams) layoutParamsLJ).addRule(2, R.id.kv2);
        }
        C708910RrN c708910RrN = new C708910RrN(context, null);
        c708910RrN.setId(R.id.videomusiccoverblock);
        c708910RrN.setImportantForAccessibility(2);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ3 = a.LJ((int) TypedValue.applyDimension(1, 95.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 95.0f, resources.getDisplayMetrics()), interactCheckDrawRelativeLayout);
        if (RelativeLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            ((RelativeLayout.LayoutParams) marginLayoutParamsLJ3).addRule(21, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            ((RelativeLayout.LayoutParams) marginLayoutParamsLJ3).addRule(12, -1);
        }
        a.LIZ(c708910RrN);
        if (c708910RrN.getParent() == null) {
            interactCheckDrawRelativeLayout.addView(c708910RrN, marginLayoutParamsLJ3);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.video_caption_layout);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ4 = a.LJ(-2, -2, interactCheckDrawRelativeLayout);
        if (RelativeLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ4)) {
            ((RelativeLayout.LayoutParams) marginLayoutParamsLJ4).alignWithParent = true;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ4)) {
            ((RelativeLayout.LayoutParams) marginLayoutParamsLJ4).addRule(2, R.id.bm6);
        }
        a.LIZ(frameLayout2);
        if (frameLayout2.getParent() == null) {
            interactCheckDrawRelativeLayout.addView(frameLayout2, marginLayoutParamsLJ4);
        }
        View viewLIZ2 = C20742916Ex.LIZ(context, R.layout.b5_, interactCheckDrawRelativeLayout, false, 0);
        viewLIZ2.setId(R.id.c26);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ5 = a.LJ(-2, -1, interactCheckDrawRelativeLayout);
        if (RelativeLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ5)) {
            ((RelativeLayout.LayoutParams) marginLayoutParamsLJ5).alignWithParent = true;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ5)) {
            ((RelativeLayout.LayoutParams) marginLayoutParamsLJ5).addRule(2, R.id.bm6);
        }
        if (viewLIZ2.getParent() == null) {
            interactCheckDrawRelativeLayout.addView(viewLIZ2, marginLayoutParamsLJ5);
        }
        View viewLIZ3 = C20742916Ex.LIZ(context, R.layout.b79, interactCheckDrawRelativeLayout, false, 0);
        viewLIZ3.setId(R.id.bm6);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ6 = a.LJ(-1, -2, interactCheckDrawRelativeLayout);
        if (RelativeLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ6)) {
            ((RelativeLayout.LayoutParams) marginLayoutParamsLJ6).addRule(20, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ6)) {
            ((RelativeLayout.LayoutParams) marginLayoutParamsLJ6).addRule(2, R.id.qea);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ6)) {
            ((RelativeLayout.LayoutParams) marginLayoutParamsLJ6).alignWithParent = true;
        }
        if (viewLIZ3.getParent() == null) {
            interactCheckDrawRelativeLayout.addView(viewLIZ3, marginLayoutParamsLJ6);
        }
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setId(R.id.qea);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ7 = a.LJ(-1, -2, interactCheckDrawRelativeLayout);
        if (RelativeLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ7)) {
            ((RelativeLayout.LayoutParams) marginLayoutParamsLJ7).addRule(12, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ7)) {
            ((RelativeLayout.LayoutParams) marginLayoutParamsLJ7).addRule(2, R.id.i2c);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ7)) {
            ((RelativeLayout.LayoutParams) marginLayoutParamsLJ7).addRule(14, -1);
        }
        a.LIZ(frameLayout3);
        if (frameLayout3.getParent() == null) {
            interactCheckDrawRelativeLayout.addView(frameLayout3, marginLayoutParamsLJ7);
        }
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout4.setId(R.id.ad_feed_card_container_v2);
        C786410Ut5.LJLLLLLL(8, frameLayout4);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ8 = a.LJ(-2, -2, interactCheckDrawRelativeLayout);
        if (RelativeLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ8)) {
            ((RelativeLayout.LayoutParams) marginLayoutParamsLJ8).addRule(2, R.id.i2c);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ8)) {
            marginLayoutParamsLJ8.setMarginStart((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        a.LIZ(frameLayout4);
        if (frameLayout4.getParent() == null) {
            interactCheckDrawRelativeLayout.addView(frameLayout4, marginLayoutParamsLJ8);
        }
        C708910RrN c708910RrN2 = new C708910RrN(context, null);
        c708910RrN2.setId(R.id.m5d);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ9 = a.LJ(-2, -2, interactCheckDrawRelativeLayout);
        if (RelativeLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ9)) {
            ((RelativeLayout.LayoutParams) marginLayoutParamsLJ9).addRule(14, -1);
        }
        View viewLIZ4 = C20742916Ex.LIZ(context, R.layout.b8z, c708910RrN2, false, 0);
        viewLIZ4.setId(R.id.vl7);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ10 = a.LJ(-2, (int) TypedValue.applyDimension(1, 30.0f, resources.getDisplayMetrics()), c708910RrN2);
        if (viewLIZ4.getParent() == null) {
            c708910RrN2.addView(viewLIZ4, marginLayoutParamsLJ10);
        }
        a.LIZ(c708910RrN2);
        if (c708910RrN2.getParent() == null) {
            interactCheckDrawRelativeLayout.addView(c708910RrN2, marginLayoutParamsLJ9);
        }
        C708910RrN c708910RrN3 = new C708910RrN(context, null);
        c708910RrN3.setId(R.id.inz);
        C786410Ut5.W(c708910RrN3, 8);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ11 = a.LJ(-1, -1, interactCheckDrawRelativeLayout);
        a.LIZ(c708910RrN3);
        if (c708910RrN3.getParent() == null) {
            interactCheckDrawRelativeLayout.addView(c708910RrN3, marginLayoutParamsLJ11);
        }
        C709020RrY c709020RrY = new C709020RrY(context, null);
        c709020RrY.setId(R.id.kvd);
        c709020RrY.setGravity(8388613);
        c709020RrY.setOrientation(1);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ12 = a.LJ(-2, -2, interactCheckDrawRelativeLayout);
        if (RelativeLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ12)) {
            ((RelativeLayout.LayoutParams) marginLayoutParamsLJ12).addRule(21, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ12)) {
            ((RelativeLayout.LayoutParams) marginLayoutParamsLJ12).addRule(12, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ12)) {
            marginLayoutParamsLJ12.bottomMargin = (int) TypedValue.applyDimension(1, 78.0f, resources.getDisplayMetrics());
        }
        a.LIZ(c709020RrY);
        if (c709020RrY.getParent() == null) {
            interactCheckDrawRelativeLayout.addView(c709020RrY, marginLayoutParamsLJ12);
        }
        FrameLayout frameLayout5 = new FrameLayout(context);
        frameLayout5.setId(R.id.i2c);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ13 = a.LJ(-2, -2, interactCheckDrawRelativeLayout);
        if (RelativeLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ13)) {
            ((RelativeLayout.LayoutParams) marginLayoutParamsLJ13).addRule(12, -1);
        }
        a.LIZ(frameLayout5);
        if (frameLayout5.getParent() == null) {
            interactCheckDrawRelativeLayout.addView(frameLayout5, marginLayoutParamsLJ13);
        }
        a.LIZ(interactCheckDrawRelativeLayout);
        if (interactCheckDrawRelativeLayout.getParent() == null) {
            interactAreaRootLayout.addView(interactCheckDrawRelativeLayout, layoutParamsLJ);
        }
        C0SUU c0suu = new C0SUU(context, null);
        c0suu.setId(R.id.kv2);
        c0suu.setOrientation(1);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ14 = a.LJ(-1, -2, interactAreaRootLayout);
        if (RelativeLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ14)) {
            ((RelativeLayout.LayoutParams) marginLayoutParamsLJ14).addRule(20, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ14)) {
            ((RelativeLayout.LayoutParams) marginLayoutParamsLJ14).addRule(12, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ14)) {
            marginLayoutParamsLJ14.bottomMargin = (int) TypedValue.applyDimension(1, 47.0f, resources.getDisplayMetrics());
        }
        a.LIZ(c0suu);
        if (c0suu.getParent() == null) {
            interactAreaRootLayout.addView(c0suu, marginLayoutParamsLJ14);
        }
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(R.id.vs_tako_entrance);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ15 = a.LJ(-2, -2, interactAreaRootLayout);
        if (RelativeLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ15)) {
            ((RelativeLayout.LayoutParams) marginLayoutParamsLJ15).addRule(21, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ15)) {
            ((RelativeLayout.LayoutParams) marginLayoutParamsLJ15).addRule(12, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ15)) {
            marginLayoutParamsLJ15.bottomMargin = (int) TypedValue.applyDimension(1, 47.0f, resources.getDisplayMetrics());
        }
        viewStub.setInflatedId(-1);
        a.LIZ(viewStub);
        if (viewStub.getParent() == null) {
            interactAreaRootLayout.addView(viewStub, marginLayoutParamsLJ15);
        }
        View frameLayout6 = new FrameLayout(context);
        frameLayout6.setId(R.id.kv9);
        ViewGroup.LayoutParams layoutParamsLJ2 = a.LJ(-1, -2, interactAreaRootLayout);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParamsLJ2)) {
            ((RelativeLayout.LayoutParams) layoutParamsLJ2).addRule(8, R.id.kv2);
        }
        a.LIZ(frameLayout6);
        if (frameLayout6.getParent() == null) {
            interactAreaRootLayout.addView(frameLayout6, layoutParamsLJ2);
        }
        C726240SeE c726240SeE = new C726240SeE(context);
        c726240SeE.setExperimentImplementation(new ViewStubOptExperimentV2());
        c726240SeE.setId(R.id.vs_debugInfoContainer);
        c726240SeE.setInflatedId(R.id.fge);
        c726240SeE.setLayoutResource(R.layout.bbj);
        ViewGroup.LayoutParams layoutParamsLJ3 = a.LJ((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), interactAreaRootLayout);
        a.LIZ(c726240SeE);
        if (c726240SeE.getParent() == null) {
            interactAreaRootLayout.addView(c726240SeE, layoutParamsLJ3);
        }
        C726240SeE c726240SeE2 = new C726240SeE(context);
        c726240SeE2.setExperimentImplementation(new ViewStubOptExperimentV2());
        c726240SeE2.setId(R.id.vs_tv_restrict);
        c726240SeE2.setInflatedId(R.id.tv_restrict);
        c726240SeE2.setLayoutResource(R.layout.bbo);
        ViewGroup.LayoutParams layoutParamsLJ4 = a.LJ((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), interactAreaRootLayout);
        a.LIZ(c726240SeE2);
        if (c726240SeE2.getParent() == null) {
            interactAreaRootLayout.addView(c726240SeE2, layoutParamsLJ4);
        }
        C726240SeE c726240SeE3 = new C726240SeE(context);
        c726240SeE3.setExperimentImplementation(new ViewStubOptExperimentV2());
        c726240SeE3.setId(R.id.vs_txt_prohibited);
        c726240SeE3.setInflatedId(R.id.txt_prohibited);
        c726240SeE3.setLayoutResource(R.layout.bbp);
        ViewGroup.LayoutParams layoutParamsLJ5 = a.LJ((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), interactAreaRootLayout);
        a.LIZ(c726240SeE3);
        if (c726240SeE3.getParent() == null) {
            interactAreaRootLayout.addView(c726240SeE3, layoutParamsLJ5);
        }
        C726240SeE c726240SeE4 = new C726240SeE(context);
        c726240SeE4.setExperimentImplementation(new ViewStubOptExperimentV2());
        c726240SeE4.setId(R.id.vs_bottom_widget_container);
        c726240SeE4.setInflatedId(R.id.ci1);
        c726240SeE4.setLayoutResource(R.layout.bbi);
        ViewGroup.LayoutParams layoutParamsLJ6 = a.LJ((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), interactAreaRootLayout);
        a.LIZ(c726240SeE4);
        if (c726240SeE4.getParent() == null) {
            interactAreaRootLayout.addView(c726240SeE4, layoutParamsLJ6);
        }
        C708910RrN c708910RrN4 = new C708910RrN(context, null);
        c708910RrN4.setId(R.id.inv);
        C786410Ut5.W(c708910RrN4, 8);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ16 = a.LJ(-1, -1, interactAreaRootLayout);
        if (RelativeLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ16)) {
            ((RelativeLayout.LayoutParams) marginLayoutParamsLJ16).addRule(12, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ16)) {
            marginLayoutParamsLJ16.bottomMargin = (int) TypedValue.applyDimension(1, 47.0f, resources.getDisplayMetrics());
        }
        a.LIZ(c708910RrN4);
        if (c708910RrN4.getParent() == null) {
            interactAreaRootLayout.addView(c708910RrN4, marginLayoutParamsLJ16);
        }
        a.LIZ(interactAreaRootLayout);
        C786410Ut5.W5(interactAreaRootLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(interactAreaRootLayout);
        }
        return interactAreaRootLayout;
    }
}
