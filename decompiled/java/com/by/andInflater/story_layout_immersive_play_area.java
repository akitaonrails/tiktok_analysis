package com.by.andInflater;

import X.C714430S0r;
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
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.bytedance.tux.widget.RadiusLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public class story_layout_immersive_play_area implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        RadiusLayout radiusLayout = new RadiusLayout(context);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -1, viewGroup);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.i_l);
        C786410Ut5.T4(frameLayout, 0.0f);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ2 = a.LJ(-1, -1, radiusLayout);
        a.LIZ(frameLayout);
        if (frameLayout.getParent() == null) {
            radiusLayout.addView(frameLayout, marginLayoutParamsLJ2);
        }
        C714430S0r c714430S0r = new C714430S0r(context, null);
        c714430S0r.setId(R.id.vp_story_collection);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ3 = a.LJ(-1, -1, radiusLayout);
        a.LIZ(c714430S0r);
        if (c714430S0r.getParent() == null) {
            radiusLayout.addView(c714430S0r, marginLayoutParamsLJ3);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.ia1);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ4 = a.LJ(-1, -1, radiusLayout);
        a.LIZ(frameLayout2);
        if (frameLayout2.getParent() == null) {
            radiusLayout.addView(frameLayout2, marginLayoutParamsLJ4);
        }
        View view = new View(context);
        view.setId(R.id.gradual_top);
        view.setBackgroundResource(R.drawable.b_l);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ5 = a.LJ(-1, (int) TypedValue.applyDimension(1, 108.0f, resources.getDisplayMetrics()), radiusLayout);
        a.LIZ(view);
        if (view.getParent() == null) {
            radiusLayout.addView(view, marginLayoutParamsLJ5);
        }
        View view2 = new View(context);
        view2.setId(R.id.gradual_bottom);
        view2.setBackgroundResource(R.drawable.b_k);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ6 = a.LJ(-1, (int) TypedValue.applyDimension(1, 90.0f, resources.getDisplayMetrics()), radiusLayout);
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ6)) {
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ6).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ6)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ6).gravity = 80;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ6)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ6).gravity = 80;
        }
        a.LIZ(view2);
        if (view2.getParent() == null) {
            radiusLayout.addView(view2, marginLayoutParamsLJ6);
        }
        a.LIZ(radiusLayout);
        C786410Ut5.W5(radiusLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(radiusLayout);
        }
        return radiusLayout;
    }
}
