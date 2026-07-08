package com.by.andInflater;

import X.C20742916Ex;
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
import com.ss.android.ugc.aweme.friendstab.ui.FriendsV3GestureInterceptLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public class friends_tab_v3_post_item implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        FriendsV3GestureInterceptLayout friendsV3GestureInterceptLayout = new FriendsV3GestureInterceptLayout(context, null, 6);
        friendsV3GestureInterceptLayout.setId(R.id.tqy);
        friendsV3GestureInterceptLayout.setClickable(true);
        friendsV3GestureInterceptLayout.setFocusable(true);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -2, viewGroup);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            marginLayoutParamsLJ.topMargin = (int) resources.getDimension(R.dimen.sf);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            marginLayoutParamsLJ.bottomMargin = (int) resources.getDimension(R.dimen.sf);
        }
        View viewLIZ = C20742916Ex.LIZ(context, R.layout.caj, friendsV3GestureInterceptLayout, false, R.layout.cb_);
        if (viewLIZ.getParent() == null) {
            friendsV3GestureInterceptLayout.addView(viewLIZ);
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(8388611);
        ViewGroup.LayoutParams layoutParamsLJ = a.LJ(-1, -2, friendsV3GestureInterceptLayout);
        View viewLIZ2 = C20742916Ex.LIZ(context, R.layout.cbx, linearLayout, false, 0);
        if (viewLIZ2.getParent() == null) {
            linearLayout.addView(viewLIZ2);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.fmh);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            layoutParams.setMarginStart((int) TypedValue.applyDimension(1, 68.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            layoutParams.setMarginEnd((int) resources.getDimension(R.dimen.sf));
        }
        a.LIZ(frameLayout);
        if (frameLayout.getParent() == null) {
            linearLayout.addView(frameLayout, layoutParams);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.t9q);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.setMarginStart((int) TypedValue.applyDimension(1, 68.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = (int) resources.getDimension(R.dimen.t4);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.setMarginEnd((int) resources.getDimension(R.dimen.sf));
        }
        a.LIZ(frameLayout2);
        if (frameLayout2.getParent() == null) {
            linearLayout.addView(frameLayout2, layoutParams2);
        }
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setId(R.id.eui);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = (int) resources.getDimension(R.dimen.s9);
        }
        a.LIZ(frameLayout3);
        if (frameLayout3.getParent() == null) {
            linearLayout.addView(frameLayout3, layoutParams3);
        }
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout4.setId(R.id.kvy);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.setMarginStart((int) TypedValue.applyDimension(1, 68.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.setMarginEnd((int) resources.getDimension(R.dimen.t8));
        }
        a.LIZ(frameLayout4);
        if (frameLayout4.getParent() == null) {
            linearLayout.addView(frameLayout4, layoutParams4);
        }
        FrameLayout frameLayout5 = new FrameLayout(context);
        frameLayout5.setId(R.id.t9m);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.setMarginStart((int) TypedValue.applyDimension(1, 68.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.setMarginEnd((int) resources.getDimension(R.dimen.t8));
        }
        a.LIZ(frameLayout5);
        if (frameLayout5.getParent() == null) {
            linearLayout.addView(frameLayout5, layoutParams5);
        }
        FrameLayout frameLayout6 = new FrameLayout(context);
        frameLayout6.setId(R.id.t_o);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.setMarginStart((int) TypedValue.applyDimension(1, 68.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.setMarginEnd((int) resources.getDimension(R.dimen.sf));
        }
        a.LIZ(frameLayout6);
        if (frameLayout6.getParent() == null) {
            linearLayout.addView(frameLayout6, layoutParams6);
        }
        View viewLIZ3 = C20742916Ex.LIZ(context, R.layout.can, linearLayout, false, 0);
        if (viewLIZ3.getParent() == null) {
            linearLayout.addView(viewLIZ3);
        }
        View viewLIZ4 = C20742916Ex.LIZ(context, R.layout.cbd, linearLayout, false, 0);
        if (viewLIZ4.getParent() == null) {
            linearLayout.addView(viewLIZ4);
        }
        FrameLayout frameLayout7 = new FrameLayout(context);
        frameLayout7.setId(R.id.ebe);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams7)) {
            layoutParams7.setMarginStart((int) TypedValue.applyDimension(1, 64.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams7)) {
            layoutParams7.setMarginEnd((int) resources.getDimension(R.dimen.sf));
        }
        a.LIZ(frameLayout7);
        if (frameLayout7.getParent() == null) {
            linearLayout.addView(frameLayout7, layoutParams7);
        }
        FrameLayout frameLayout8 = new FrameLayout(context);
        frameLayout8.setId(R.id.t9l);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams8)) {
            layoutParams8.setMarginStart((int) TypedValue.applyDimension(1, 64.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams8)) {
            layoutParams8.setMarginEnd((int) resources.getDimension(R.dimen.sf));
        }
        a.LIZ(frameLayout8);
        if (frameLayout8.getParent() == null) {
            linearLayout.addView(frameLayout8, layoutParams8);
        }
        a.LIZ(linearLayout);
        if (linearLayout.getParent() == null) {
            friendsV3GestureInterceptLayout.addView(linearLayout, layoutParamsLJ);
        }
        a.LIZ(friendsV3GestureInterceptLayout);
        C786410Ut5.W5(friendsV3GestureInterceptLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(friendsV3GestureInterceptLayout);
        }
        return friendsV3GestureInterceptLayout;
    }
}
