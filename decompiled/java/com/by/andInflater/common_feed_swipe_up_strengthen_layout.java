package com.by.andInflater;

import X.C1303280k1G;
import X.C423100GiS;
import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ug.guide.SwipeUpGuideStrengthenLayout;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class common_feed_swipe_up_strengthen_layout implements InterfaceC20742716Ev {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        float f;
        int i2;
        Resources resources = context.getResources();
        SwipeUpGuideStrengthenLayout swipeUpGuideStrengthenLayout = new SwipeUpGuideStrengthenLayout(context);
        swipeUpGuideStrengthenLayout.setId(R.id.wsp);
        C786410Ut5.T4(swipeUpGuideStrengthenLayout, 0.5f);
        swipeUpGuideStrengthenLayout.setBackgroundColor(resources.getColor(R.color.cw));
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -1, viewGroup);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.wsk);
        linearLayout.setOrientation(1);
        ViewGroup.LayoutParams layoutParamsLJ = a.LJ(-1, -1, swipeUpGuideStrengthenLayout);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.addRule(13, -1);
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
            ((LinearLayout.LayoutParams) layoutParams2).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams2)) {
            ((FrameLayout.LayoutParams) layoutParams2).gravity = 17;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams2)) {
            ((DrawerLayout$LayoutParams) layoutParams2).gravity = 17;
        }
        View c1303280k1G = new C1303280k1G(context);
        c1303280k1G.setId(R.id.lj4);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 210.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams3)) {
            i = 17;
            layoutParams3.gravity = 17;
        } else {
            i = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams3)) {
            ((FrameLayout.LayoutParams) layoutParams3).gravity = i;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams3)) {
            ((DrawerLayout$LayoutParams) layoutParams3).gravity = i;
        }
        a.LIZ(c1303280k1G);
        if (c1303280k1G.getParent() == null) {
            linearLayout2.addView(c1303280k1G, layoutParams3);
        }
        View c423100GiS = new C423100GiS(context);
        c423100GiS.setId(R.id.lj9);
        C786410Ut5.LJLLLLLL(8, c423100GiS);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 260.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 210.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.gravity = 1;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams4)) {
            ((FrameLayout.LayoutParams) layoutParams4).gravity = 1;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams4)) {
            ((DrawerLayout$LayoutParams) layoutParams4).gravity = 1;
        }
        a.LIZ(c423100GiS);
        if (c423100GiS.getParent() == null) {
            linearLayout2.addView(c423100GiS, layoutParams4);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(frameLayout.getPaddingLeft(), (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()), frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            ((ViewGroup.MarginLayoutParams) layoutParams5).leftMargin = (int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            ((ViewGroup.MarginLayoutParams) layoutParams5).rightMargin = (int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics());
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.tv_strengthen_swipe_up_guide);
        tuxTextView.setGravity(17);
        tuxTextView.setText(2131849403);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.ee});
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, -2);
        new o();
        o.LIZ("app:tux_font", new a.c("H1_Bold"), tuxTextView);
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            frameLayout.addView(tuxTextView, layoutParams6);
        }
        android.view.a.LIZ(frameLayout);
        if (frameLayout.getParent() == null) {
            linearLayout2.addView(frameLayout, layoutParams5);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams7)) {
            f = 32.0f;
            i2 = 1;
            ((ViewGroup.MarginLayoutParams) layoutParams7).leftMargin = (int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics());
        } else {
            f = 32.0f;
            i2 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams7)) {
            ((ViewGroup.MarginLayoutParams) layoutParams7).rightMargin = (int) TypedValue.applyDimension(i2, f, resources.getDisplayMetrics());
        }
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.tv_strengthen_swipe_up_guide_second_line);
        tuxTextView2.setGravity(17);
        tuxTextView2.setText(2131849403);
        int[] iArr = new int[i2];
        iArr[0] = R.attr.ee;
        TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(iArr);
        tuxTextView2.setTextColor(typedArrayObtainStyledAttributes2.getColor(0, 0));
        typedArrayObtainStyledAttributes2.recycle();
        C786410Ut5.LJLLLLLL(8, tuxTextView2);
        FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(-1, -2);
        new o();
        o.LIZ("app:tux_font", new a.c("H2_Bold"), tuxTextView2);
        android.view.a.LIZ(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            frameLayout2.addView(tuxTextView2, layoutParams8);
        }
        android.view.a.LIZ(frameLayout2);
        if (frameLayout2.getParent() == null) {
            linearLayout2.addView(frameLayout2, layoutParams7);
        }
        android.view.a.LIZ(linearLayout2);
        if (linearLayout2.getParent() == null) {
            relativeLayout.addView(linearLayout2, layoutParams2);
        }
        android.view.a.LIZ(relativeLayout);
        if (relativeLayout.getParent() == null) {
            linearLayout.addView(relativeLayout, layoutParams);
        }
        android.view.a.LIZ(linearLayout);
        if (linearLayout.getParent() == null) {
            swipeUpGuideStrengthenLayout.addView(linearLayout, layoutParamsLJ);
        }
        android.view.a.LIZ(swipeUpGuideStrengthenLayout);
        C786410Ut5.W5(swipeUpGuideStrengthenLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(swipeUpGuideStrengthenLayout);
        }
        return swipeUpGuideStrengthenLayout;
    }
}
