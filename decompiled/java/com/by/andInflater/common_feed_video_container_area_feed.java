package com.by.andInflater;

import X.C0RSF;
import X.C1324820ka0;
import X.C20479115Bl;
import X.C709080Rre;
import X.C714400S0o;
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
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public class common_feed_video_container_area_feed implements InterfaceC20742716Ev {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.video_container_area);
        linearLayout.setOrientation(1);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -1, viewGroup);
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ).gravity = 1;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ).gravity = 1;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ).gravity = 1;
        }
        View view = new View(context);
        view.setId(R.id.dlw);
        C786410Ut5.LJLLLLLL(4, view);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.e1});
        view.setBackgroundColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        a.LIZ(view);
        if (view.getParent() == null) {
            linearLayout.addView(view, layoutParams);
        }
        C709080Rre c709080Rre = new C709080Rre(context);
        c709080Rre.setId(R.id.video_visible_area_container);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.weight = 1;
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams2)) {
            ((FrameLayout.LayoutParams) layoutParams2).gravity = 17;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams2)) {
            ((DrawerLayout$LayoutParams) layoutParams2).gravity = 17;
        }
        View c714400S0o = new C714400S0o(context, null);
        c714400S0o.setId(R.id.qtw);
        C786410Ut5.LJLLLLLL(8, c714400S0o);
        ViewGroup.LayoutParams layoutParamsLJ = a.LJ(-1, -1, c709080Rre);
        a.LIZ(c714400S0o);
        if (c714400S0o.getParent() == null) {
            c709080Rre.addView(c714400S0o, layoutParamsLJ);
        }
        View c0rsf = new C0RSF(context);
        c0rsf.setId(R.id.player_view);
        ViewGroup.LayoutParams layoutParamsLJ2 = a.LJ(-1, -1, c709080Rre);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParamsLJ2)) {
            ((LinearLayout.LayoutParams) layoutParamsLJ2).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParamsLJ2)) {
            ((FrameLayout.LayoutParams) layoutParamsLJ2).gravity = 17;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParamsLJ2)) {
            ((DrawerLayout$LayoutParams) layoutParamsLJ2).gravity = 17;
        }
        a.LIZ(c0rsf);
        if (c0rsf.getParent() == null) {
            c709080Rre.addView(c0rsf, layoutParamsLJ2);
        }
        View frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.o5j);
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
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        a.LIZ(c1324820ka0);
        if (c1324820ka0.getParent() == null) {
            frameLayout2.addView(c1324820ka0, layoutParams3);
        }
        C20479115Bl c20479115Bl = new C20479115Bl(context);
        c20479115Bl.setId(R.id.video_effective_area);
        C786410Ut5.LJLLLLLL(8, c20479115Bl);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -1);
        a.LIZ(c20479115Bl);
        if (c20479115Bl.getParent() == null) {
            frameLayout2.addView(c20479115Bl, layoutParams4);
        }
        a.LIZ(frameLayout2);
        if (frameLayout2.getParent() == null) {
            c709080Rre.addView(frameLayout2, layoutParamsLJ4);
        }
        View c20479115Bl2 = new C20479115Bl(context);
        c20479115Bl2.setId(R.id.video_obstructed_area);
        C786410Ut5.LJLLLLLL(8, c20479115Bl2);
        ViewGroup.LayoutParams layoutParamsLJ5 = a.LJ(-1, -1, c709080Rre);
        a.LIZ(c20479115Bl2);
        if (c20479115Bl2.getParent() == null) {
            c709080Rre.addView(c20479115Bl2, layoutParamsLJ5);
        }
        a.LIZ(c709080Rre);
        if (c709080Rre.getParent() == null) {
            linearLayout.addView(c709080Rre, layoutParams2);
        }
        View view2 = new View(context);
        view2.setId(R.id.dlg);
        C786410Ut5.LJLLLLLL(4, view2);
        TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.e1});
        view2.setBackgroundColor(typedArrayObtainStyledAttributes2.getColor(0, 0));
        typedArrayObtainStyledAttributes2.recycle();
        ViewGroup.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        a.LIZ(view2);
        if (view2.getParent() == null) {
            linearLayout.addView(view2, layoutParams5);
        }
        a.LIZ(linearLayout);
        C786410Ut5.W5(linearLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(linearLayout);
        }
        return linearLayout;
    }
}
