package com.by.andInflater;

import X.C19ME;
import X.C708910RrN;
import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public class common_feed_friends_detail_bottom_area implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.nb0);
        linearLayout.setOrientation(1);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -2, viewGroup);
        if (C19ME.class.isInstance(marginLayoutParamsLJ)) {
            ((C19ME) marginLayoutParamsLJ).startToStart = 0;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ)) {
            ((C19ME) marginLayoutParamsLJ).endToEnd = 0;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ)) {
            ((C19ME) marginLayoutParamsLJ).bottomToBottom = 0;
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            layoutParams.setMarginStart((int) resources.getDimension(R.dimen.sb));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            layoutParams.setMarginEnd((int) resources.getDimension(R.dimen.sb));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = (int) resources.getDimension(R.dimen.sb);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.i48);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        a.LIZ(frameLayout);
        if (frameLayout.getParent() == null) {
            linearLayout2.addView(frameLayout, layoutParams2);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.i86);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = (int) resources.getDimension(R.dimen.t8);
        }
        a.LIZ(frameLayout2);
        if (frameLayout2.getParent() == null) {
            linearLayout2.addView(frameLayout2, layoutParams3);
        }
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setId(R.id.i2f);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin = (int) resources.getDimension(R.dimen.t8);
        }
        a.LIZ(frameLayout3);
        if (frameLayout3.getParent() == null) {
            linearLayout2.addView(frameLayout3, layoutParams4);
        }
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout4.setId(R.id.i2i);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            ((ViewGroup.MarginLayoutParams) layoutParams5).topMargin = (int) resources.getDimension(R.dimen.t8);
        }
        a.LIZ(frameLayout4);
        if (frameLayout4.getParent() == null) {
            linearLayout2.addView(frameLayout4, layoutParams5);
        }
        C708910RrN c708910RrN = new C708910RrN(context, null);
        c708910RrN.setId(R.id.i8_);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams6)) {
            ((ViewGroup.MarginLayoutParams) layoutParams6).topMargin = (int) resources.getDimension(R.dimen.t8);
        }
        a.LIZ(c708910RrN);
        if (c708910RrN.getParent() == null) {
            linearLayout2.addView(c708910RrN, layoutParams6);
        }
        FrameLayout frameLayout5 = new FrameLayout(context);
        frameLayout5.setId(R.id.i_w);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams7)) {
            ((ViewGroup.MarginLayoutParams) layoutParams7).topMargin = (int) resources.getDimension(R.dimen.t8);
        }
        a.LIZ(frameLayout5);
        if (frameLayout5.getParent() == null) {
            linearLayout2.addView(frameLayout5, layoutParams7);
        }
        FrameLayout frameLayout6 = new FrameLayout(context);
        frameLayout6.setId(R.id.ibj);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams8)) {
            ((ViewGroup.MarginLayoutParams) layoutParams8).topMargin = (int) resources.getDimension(R.dimen.t8);
        }
        a.LIZ(frameLayout6);
        if (frameLayout6.getParent() == null) {
            linearLayout2.addView(frameLayout6, layoutParams8);
        }
        a.LIZ(linearLayout2);
        if (linearLayout2.getParent() == null) {
            linearLayout.addView(linearLayout2, layoutParams);
        }
        View frameLayout7 = new FrameLayout(context);
        frameLayout7.setId(R.id.i39);
        ViewGroup.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-1, -2);
        a.LIZ(frameLayout7);
        if (frameLayout7.getParent() == null) {
            linearLayout.addView(frameLayout7, layoutParams9);
        }
        View frameLayout8 = new FrameLayout(context);
        frameLayout8.setId(R.id.i5a);
        ViewGroup.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(-1, -2);
        a.LIZ(frameLayout8);
        if (frameLayout8.getParent() == null) {
            linearLayout.addView(frameLayout8, layoutParams10);
        }
        a.LIZ(linearLayout);
        C786410Ut5.W5(linearLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(linearLayout);
        }
        return linearLayout;
    }
}
