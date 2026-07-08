package com.by.andInflater;

import X.C481090Itn;
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
import android.widget.RelativeLayout;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public class detail_base_page_container_layout implements InterfaceC20742716Ev {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setFitsSystemWindows(true);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -1, viewGroup);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        ViewGroup.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.p15);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        a.LIZ(frameLayout);
        if (frameLayout.getParent() == null) {
            linearLayout.addView(frameLayout, layoutParams2);
        }
        C481090Itn c481090Itn = new C481090Itn(context);
        c481090Itn.setId(R.id.t25);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.weight = 1;
        }
        a.LIZ(c481090Itn);
        if (c481090Itn.getParent() == null) {
            linearLayout.addView(c481090Itn, layoutParams3);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.cad);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        a.LIZ(frameLayout2);
        if (frameLayout2.getParent() == null) {
            linearLayout.addView(frameLayout2, layoutParams4);
        }
        a.LIZ(linearLayout);
        if (linearLayout.getParent() == null) {
            relativeLayout.addView(linearLayout, layoutParams);
        }
        View frameLayout3 = new FrameLayout(context);
        frameLayout3.setId(R.id.w0k);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -1);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.addRule(10, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            ((ViewGroup.MarginLayoutParams) layoutParams5).topMargin = (int) TypedValue.applyDimension(1, 52.0f, resources.getDisplayMetrics());
        }
        a.LIZ(frameLayout3);
        if (frameLayout3.getParent() == null) {
            relativeLayout.addView(frameLayout3, layoutParams5);
        }
        View frameLayout4 = new FrameLayout(context);
        C786410Ut5.LJLLLLLL(8, frameLayout4);
        frameLayout4.setId(R.id.btq);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-1, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.addRule(12, -1);
        }
        a.LIZ(frameLayout4);
        if (frameLayout4.getParent() == null) {
            relativeLayout.addView(frameLayout4, layoutParams6);
        }
        View frameLayout5 = new FrameLayout(context);
        frameLayout5.setId(R.id.sy6);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams7)) {
            layoutParams7.addRule(12, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams7)) {
            layoutParams7.addRule(14, -1);
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams7)) {
            ((LinearLayout.LayoutParams) layoutParams7).gravity = 81;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams7)) {
            ((FrameLayout.LayoutParams) layoutParams7).gravity = 81;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams7)) {
            ((DrawerLayout$LayoutParams) layoutParams7).gravity = 81;
        }
        a.LIZ(frameLayout5);
        if (frameLayout5.getParent() == null) {
            relativeLayout.addView(frameLayout5, layoutParams7);
        }
        a.LIZ(relativeLayout);
        C786410Ut5.W5(relativeLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(relativeLayout);
        }
        return relativeLayout;
    }
}
