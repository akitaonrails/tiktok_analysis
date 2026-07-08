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
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public class aweme_comment_single_line_input_check_box implements InterfaceC20742716Ev {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -2, viewGroup);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setId(R.id.rfb);
        linearLayout2.setGravity(8388627);
        linearLayout2.setOrientation(0);
        C786410Ut5.LJLLLLLL(8, linearLayout2);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        View viewLIZ = C20742916Ex.LIZ(context, R.layout.a37, linearLayout2, false, 0);
        viewLIZ.setId(R.id.ngh);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.gravity = 8388627;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams2)) {
            ((FrameLayout.LayoutParams) layoutParams2).gravity = 8388627;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams2)) {
            ((DrawerLayout$LayoutParams) layoutParams2).gravity = 8388627;
        }
        if (viewLIZ.getParent() == null) {
            linearLayout2.addView(viewLIZ, layoutParams2);
        }
        a.LIZ(linearLayout2);
        if (linearLayout2.getParent() == null) {
            linearLayout.addView(linearLayout2, layoutParams);
        }
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setId(R.id.vc9);
        linearLayout3.setOrientation(0);
        linearLayout3.setPadding(linearLayout3.getPaddingLeft(), linearLayout3.getPaddingTop(), linearLayout3.getPaddingRight(), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        ViewGroup.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        View viewLIZ2 = C20742916Ex.LIZ(context, R.layout.a36, linearLayout3, false, 0);
        viewLIZ2.setId(R.id.nak);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.gravity = 8388627;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams4)) {
            ((FrameLayout.LayoutParams) layoutParams4).gravity = 8388627;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams4)) {
            ((DrawerLayout$LayoutParams) layoutParams4).gravity = 8388627;
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.weight = 1;
        }
        if (viewLIZ2.getParent() == null) {
            linearLayout3.addView(viewLIZ2, layoutParams4);
        }
        View viewLIZ3 = C20742916Ex.LIZ(context, R.layout.a3h, linearLayout3, false, 0);
        viewLIZ3.setId(R.id.vc_);
        C786410Ut5.LJLLLLLL(8, viewLIZ3);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.gravity = 8388629;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams5)) {
            ((FrameLayout.LayoutParams) layoutParams5).gravity = 8388629;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams5)) {
            ((DrawerLayout$LayoutParams) layoutParams5).gravity = 8388629;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.setMarginEnd((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        if (viewLIZ3.getParent() == null) {
            linearLayout3.addView(viewLIZ3, layoutParams5);
        }
        a.LIZ(linearLayout3);
        if (linearLayout3.getParent() == null) {
            linearLayout.addView(linearLayout3, layoutParams3);
        }
        a.LIZ(linearLayout);
        C786410Ut5.W5(linearLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(linearLayout);
        }
        return linearLayout;
    }
}
