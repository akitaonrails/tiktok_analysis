package com.by.andInflater;

import X.C0RH0;
import X.C0SUL;
import X.C1324820ka0;
import X.C19ME;
import X.C487360J9i;
import X.C709080Rre;
import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.bytedance.tux.widget.RadiusLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public class story_item_video implements InterfaceC20742716Ev {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        context.getResources();
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(R.id.tqy);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.e1});
        constraintLayout.setBackgroundColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -1, viewGroup);
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(R.id.x0c);
        viewStub.setLayoutResource(R.layout.bat);
        ViewGroup.LayoutParams c19me = new C19ME(-1, -1);
        viewStub.setInflatedId(-1);
        a.LIZ(viewStub);
        if (viewStub.getParent() == null) {
            constraintLayout.addView(viewStub, c19me);
        }
        View c0rh0 = new C0RH0(context, null);
        c0rh0.setId(R.id.io9);
        C786410Ut5.LJLLLLLL(8, c0rh0);
        ViewGroup.LayoutParams c19me2 = new C19ME(-1, -1);
        a.LIZ(c0rh0);
        if (c0rh0.getParent() == null) {
            constraintLayout.addView(c0rh0, c19me2);
        }
        RadiusLayout radiusLayout = new RadiusLayout(context);
        radiusLayout.setId(R.id.ia4);
        C19ME c19me3 = new C19ME(-1, -1);
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.endToEnd = 0;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.topToTop = 0;
        }
        View c0sul = new C0SUL(context, null);
        c0sul.setId(R.id.long_press_layout);
        ViewGroup.LayoutParams layoutParamsLJ = a.LJ(-1, -1, radiusLayout);
        a.LIZ(c0sul);
        if (c0sul.getParent() == null) {
            radiusLayout.addView(c0sul, layoutParamsLJ);
        }
        C709080Rre c709080Rre = new C709080Rre(context);
        c709080Rre.setId(R.id.video_visible_area_container);
        ViewGroup.LayoutParams layoutParamsLJ2 = a.LJ(-1, -1, radiusLayout);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParamsLJ2)) {
            ((LinearLayout.LayoutParams) layoutParamsLJ2).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParamsLJ2)) {
            ((FrameLayout.LayoutParams) layoutParamsLJ2).gravity = 17;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParamsLJ2)) {
            ((DrawerLayout$LayoutParams) layoutParamsLJ2).gravity = 17;
        }
        View frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.player_view);
        ViewGroup.LayoutParams layoutParamsLJ3 = a.LJ(-1, -1, c709080Rre);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParamsLJ3)) {
            ((LinearLayout.LayoutParams) layoutParamsLJ3).gravity = 1;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParamsLJ3)) {
            ((FrameLayout.LayoutParams) layoutParamsLJ3).gravity = 1;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParamsLJ3)) {
            ((DrawerLayout$LayoutParams) layoutParamsLJ3).gravity = 1;
        }
        a.LIZ(frameLayout);
        if (frameLayout.getParent() == null) {
            c709080Rre.addView(frameLayout, layoutParamsLJ3);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.video_adapted_wrapper_container);
        C786410Ut5.LJLLLLLL(4, frameLayout2);
        ViewGroup.LayoutParams layoutParamsLJ4 = a.LJ(-1, -1, c709080Rre);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParamsLJ4)) {
            ((LinearLayout.LayoutParams) layoutParamsLJ4).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParamsLJ4)) {
            ((FrameLayout.LayoutParams) layoutParamsLJ4).gravity = 17;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParamsLJ4)) {
            ((DrawerLayout$LayoutParams) layoutParamsLJ4).gravity = 17;
        }
        C1324820ka0 c1324820ka0 = new C1324820ka0(context);
        c1324820ka0.setId(R.id.cover);
        c1324820ka0.setBackgroundResource(R.drawable.cfy);
        C786410Ut5.LJZI(8, c1324820ka0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((LinearLayout.LayoutParams) layoutParams).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.gravity = 17;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams)) {
            ((DrawerLayout$LayoutParams) layoutParams).gravity = 17;
        }
        a.LIZ(c1324820ka0);
        if (c1324820ka0.getParent() == null) {
            frameLayout2.addView(c1324820ka0, layoutParams);
        }
        a.LIZ(frameLayout2);
        if (frameLayout2.getParent() == null) {
            c709080Rre.addView(frameLayout2, layoutParamsLJ4);
        }
        a.LIZ(c709080Rre);
        if (c709080Rre.getParent() == null) {
            radiusLayout.addView(c709080Rre, layoutParamsLJ2);
        }
        View c0rh02 = new C0RH0(context, null);
        c0rh02.setId(R.id.oqx);
        ViewGroup.LayoutParams layoutParamsLJ5 = a.LJ(-1, -1, radiusLayout);
        a.LIZ(c0rh02);
        if (c0rh02.getParent() == null) {
            radiusLayout.addView(c0rh02, layoutParamsLJ5);
        }
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setId(R.id.kvg);
        ViewGroup.LayoutParams layoutParamsLJ6 = a.LJ(-1, -1, radiusLayout);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParamsLJ6)) {
            i = 1;
            ((LinearLayout.LayoutParams) layoutParamsLJ6).gravity = 1;
        } else {
            i = 1;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParamsLJ6)) {
            ((FrameLayout.LayoutParams) layoutParamsLJ6).gravity = i;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParamsLJ6)) {
            ((DrawerLayout$LayoutParams) layoutParamsLJ6).gravity = i;
        }
        View c487360J9i = new C487360J9i(context, null);
        c487360J9i.setId(R.id.kvf);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
            ((LinearLayout.LayoutParams) layoutParams2).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.gravity = 17;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams2)) {
            ((DrawerLayout$LayoutParams) layoutParams2).gravity = 17;
        }
        a.LIZ(c487360J9i);
        if (c487360J9i.getParent() == null) {
            frameLayout3.addView(c487360J9i, layoutParams2);
        }
        a.LIZ(frameLayout3);
        if (frameLayout3.getParent() == null) {
            radiusLayout.addView(frameLayout3, layoutParamsLJ6);
        }
        a.LIZ(radiusLayout);
        if (radiusLayout.getParent() == null) {
            constraintLayout.addView(radiusLayout, c19me3);
        }
        a.LIZ(constraintLayout);
        C786410Ut5.W5(constraintLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(constraintLayout);
        }
        return constraintLayout;
    }
}
