package com.by.andInflater;

import X.C418880Gbe;
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
public class layout_loading implements InterfaceC20742716Ev {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.s8l);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-2, -2, viewGroup);
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ).gravity = 17;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ).gravity = 17;
        }
        View c418880Gbe = new C418880Gbe(context, null);
        c418880Gbe.setId(R.id.g3w);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((LinearLayout.LayoutParams) layoutParams).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.gravity = 17;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams)) {
            ((DrawerLayout$LayoutParams) layoutParams).gravity = 17;
        }
        a.LIZ(c418880Gbe);
        if (c418880Gbe.getParent() == null) {
            frameLayout.addView(c418880Gbe, layoutParams);
        }
        a.LIZ(frameLayout);
        C786410Ut5.W5(frameLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        return frameLayout;
    }
}
