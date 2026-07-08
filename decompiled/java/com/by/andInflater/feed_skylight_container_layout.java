package com.by.andInflater;

import X.C0R1W;
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
public class feed_skylight_container_layout implements InterfaceC20742716Ev {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.hv1);
        C786410Ut5.LJLLLLLL(8, frameLayout);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.e1});
        frameLayout.setBackgroundColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        frameLayout.setClipChildren(false);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, (int) TypedValue.applyDimension(1, 181.0f, resources.getDisplayMetrics()), viewGroup);
        C0R1W c0r1w = new C0R1W(context);
        c0r1w.setId(R.id.hv0);
        C786410Ut5.LJLLLLLL(0, c0r1w);
        c0r1w.setClipChildren(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((LinearLayout.LayoutParams) layoutParams).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.gravity = 80;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams)) {
            ((DrawerLayout$LayoutParams) layoutParams).gravity = 80;
        }
        a.LIZ(c0r1w);
        if (c0r1w.getParent() == null) {
            frameLayout.addView(c0r1w, layoutParams);
        }
        a.LIZ(frameLayout);
        C786410Ut5.W5(frameLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        return frameLayout;
    }
}
