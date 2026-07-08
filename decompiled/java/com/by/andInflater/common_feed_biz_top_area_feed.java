package com.by.andInflater;

import X.C708910RrN;
import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.Space;
import com.ss.android.ugc.feed.platform.cell.interact.view.InteractCheckDrawRelativeLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes12.dex */
public class common_feed_biz_top_area_feed implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        InteractCheckDrawRelativeLayout interactCheckDrawRelativeLayout = new InteractCheckDrawRelativeLayout(context);
        interactCheckDrawRelativeLayout.setId(R.id.c26);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-2, -1, viewGroup);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.s7m);
        C786410Ut5.LJLLLLLL(8, frameLayout);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ2 = a.LJ(-1, -2, interactCheckDrawRelativeLayout);
        if (RelativeLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            ((RelativeLayout.LayoutParams) marginLayoutParamsLJ2).alignWithParent = true;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            ((RelativeLayout.LayoutParams) marginLayoutParamsLJ2).addRule(2, R.id.qe_);
        }
        a.LIZ(frameLayout);
        if (frameLayout.getParent() == null) {
            interactCheckDrawRelativeLayout.addView(frameLayout, marginLayoutParamsLJ2);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.qe_);
        C786410Ut5.LJLLLLLL(8, frameLayout2);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ3 = a.LJ(-1, -2, interactCheckDrawRelativeLayout);
        if (RelativeLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            ((RelativeLayout.LayoutParams) marginLayoutParamsLJ3).addRule(12, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            ((RelativeLayout.LayoutParams) marginLayoutParamsLJ3).addRule(14, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            marginLayoutParamsLJ3.bottomMargin = (int) TypedValue.applyDimension(1, -40.0f, resources.getDisplayMetrics());
        }
        a.LIZ(frameLayout2);
        if (frameLayout2.getParent() == null) {
            interactCheckDrawRelativeLayout.addView(frameLayout2, marginLayoutParamsLJ3);
        }
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setId(R.id.vle);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ4 = a.LJ(-2, -2, interactCheckDrawRelativeLayout);
        if (RelativeLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ4)) {
            ((RelativeLayout.LayoutParams) marginLayoutParamsLJ4).addRule(12, -1);
        }
        a.LIZ(frameLayout3);
        if (frameLayout3.getParent() == null) {
            interactCheckDrawRelativeLayout.addView(frameLayout3, marginLayoutParamsLJ4);
        }
        C708910RrN c708910RrN = new C708910RrN(context, null);
        c708910RrN.setId(R.id.vlf);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ5 = a.LJ(-2, -2, interactCheckDrawRelativeLayout);
        if (RelativeLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ5)) {
            ((RelativeLayout.LayoutParams) marginLayoutParamsLJ5).alignWithParent = true;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ5)) {
            ((RelativeLayout.LayoutParams) marginLayoutParamsLJ5).addRule(2, R.id.s7m);
        }
        a.LIZ(c708910RrN);
        if (c708910RrN.getParent() == null) {
            interactCheckDrawRelativeLayout.addView(c708910RrN, marginLayoutParamsLJ5);
        }
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout4.setId(R.id.a99);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ6 = a.LJ(-2, -2, interactCheckDrawRelativeLayout);
        if (RelativeLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ6)) {
            ((RelativeLayout.LayoutParams) marginLayoutParamsLJ6).addRule(10, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ6)) {
            ((RelativeLayout.LayoutParams) marginLayoutParamsLJ6).addRule(21, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ6)) {
            marginLayoutParamsLJ6.setMarginEnd((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        a.LIZ(frameLayout4);
        if (frameLayout4.getParent() == null) {
            interactCheckDrawRelativeLayout.addView(frameLayout4, marginLayoutParamsLJ6);
        }
        Space space = new Space(context);
        space.setId(R.id.qk4);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ7 = a.LJ((int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), interactCheckDrawRelativeLayout);
        if (RelativeLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ7)) {
            ((RelativeLayout.LayoutParams) marginLayoutParamsLJ7).addRule(12, -1);
        }
        a.LIZ(space);
        if (space.getParent() == null) {
            interactCheckDrawRelativeLayout.addView(space, marginLayoutParamsLJ7);
        }
        FrameLayout frameLayout5 = new FrameLayout(context);
        frameLayout5.setId(R.id.y_8);
        C786410Ut5.LJLLLLLL(8, frameLayout5);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ8 = a.LJ(-1, -2, interactCheckDrawRelativeLayout);
        if (RelativeLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ8)) {
            ((RelativeLayout.LayoutParams) marginLayoutParamsLJ8).addRule(14, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ8)) {
            ((RelativeLayout.LayoutParams) marginLayoutParamsLJ8).addRule(10, -1);
        }
        a.LIZ(frameLayout5);
        if (frameLayout5.getParent() == null) {
            interactCheckDrawRelativeLayout.addView(frameLayout5, marginLayoutParamsLJ8);
        }
        a.LIZ(interactCheckDrawRelativeLayout);
        C786410Ut5.W5(interactCheckDrawRelativeLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(interactCheckDrawRelativeLayout);
        }
        return interactCheckDrawRelativeLayout;
    }
}
