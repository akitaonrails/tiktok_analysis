package com.by.andInflater;

import X.C0RH0;
import X.C0SUL;
import X.C19ME;
import X.C20742916Ex;
import X.C709080Rre;
import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public class common_feed_friends_detail_photo implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
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
        View c0sul = new C0SUL(context, null);
        c0sul.setId(R.id.long_press_layout);
        ViewGroup.LayoutParams c19me2 = new C19ME(-1, -1);
        a.LIZ(c0sul);
        if (c0sul.getParent() == null) {
            constraintLayout.addView(c0sul, c19me2);
        }
        C709080Rre c709080Rre = new C709080Rre(context);
        c709080Rre.setId(R.id.video_visible_area_container);
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
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.bottomToBottom = 0;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.player_view);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ2 = a.LJ(-1, -1, c709080Rre);
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ2).gravity = 1;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ2).gravity = 1;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ2).gravity = 1;
        }
        a.LIZ(frameLayout);
        if (frameLayout.getParent() == null) {
            c709080Rre.addView(frameLayout, marginLayoutParamsLJ2);
        }
        a.LIZ(c709080Rre);
        if (c709080Rre.getParent() == null) {
            constraintLayout.addView(c709080Rre, c19me3);
        }
        View view = new View(context);
        view.setId(R.id.gradual_top);
        view.setBackgroundResource(R.drawable.baw);
        C19ME c19me4 = new C19ME(-1, (int) TypedValue.applyDimension(1, 136.0f, resources.getDisplayMetrics()));
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.topToTop = 0;
        }
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.endToEnd = 0;
        }
        a.LIZ(view);
        if (view.getParent() == null) {
            constraintLayout.addView(view, c19me4);
        }
        View view2 = new View(context);
        view2.setId(R.id.gradual_bottom);
        view2.setBackgroundResource(R.drawable.bav);
        C19ME c19me5 = new C19ME(-1, (int) TypedValue.applyDimension(1, 158.0f, resources.getDisplayMetrics()));
        if (C19ME.class.isInstance(c19me5)) {
            c19me5.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me5)) {
            c19me5.bottomToBottom = 0;
        }
        if (C19ME.class.isInstance(c19me5)) {
            c19me5.endToEnd = 0;
        }
        a.LIZ(view2);
        if (view2.getParent() == null) {
            constraintLayout.addView(view2, c19me5);
        }
        View c0rh0 = new C0RH0(context, null);
        c0rh0.setId(R.id.oqx);
        ViewGroup.LayoutParams c19me6 = new C19ME(-1, -1);
        a.LIZ(c0rh0);
        if (c0rh0.getParent() == null) {
            constraintLayout.addView(c0rh0, c19me6);
        }
        RelativeLayout relativeLayout = new RelativeLayout(context);
        C19ME c19me7 = new C19ME(-1, -2);
        if (C19ME.class.isInstance(c19me7)) {
            c19me7.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me7)) {
            c19me7.endToEnd = 0;
        }
        if (C19ME.class.isInstance(c19me7)) {
            c19me7.bottomToBottom = 0;
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.f787qcm);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.addRule(14, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = (int) TypedValue.applyDimension(1, 26.0f, resources.getDisplayMetrics());
        }
        a.LIZ(frameLayout2);
        if (frameLayout2.getParent() == null) {
            relativeLayout.addView(frameLayout2, layoutParams);
        }
        a.LIZ(relativeLayout);
        if (relativeLayout.getParent() == null) {
            constraintLayout.addView(relativeLayout, c19me7);
        }
        View viewLIZ = C20742916Ex.LIZ(context, R.layout.b6x, constraintLayout, false, R.layout.b6z);
        if (viewLIZ.getParent() == null) {
            constraintLayout.addView(viewLIZ);
        }
        a.LIZ(constraintLayout);
        C786410Ut5.W5(constraintLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(constraintLayout);
        }
        return constraintLayout;
    }
}
