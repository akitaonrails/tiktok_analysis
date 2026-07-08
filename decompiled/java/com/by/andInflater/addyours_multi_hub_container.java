package com.by.andInflater;

import X.C1846060y8i;
import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import X.ViewOnAttachStateChangeListenerC20631115oD;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public class addyours_multi_hub_container implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -1, viewGroup);
        C1846060y8i c1846060y8i = new C1846060y8i(context, null, 6);
        c1846060y8i.setId(R.id.wwq);
        C786410Ut5.LJLLLLLL(8, c1846060y8i);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        a.LIZ(c1846060y8i);
        if (c1846060y8i.getParent() == null) {
            linearLayout.addView(c1846060y8i, layoutParams);
        }
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = new ViewOnAttachStateChangeListenerC20631115oD(context);
        viewOnAttachStateChangeListenerC20631115oD.setId(R.id.viewPager);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.bx});
        viewOnAttachStateChangeListenerC20631115oD.setBackgroundColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
        a.LIZ(viewOnAttachStateChangeListenerC20631115oD);
        if (viewOnAttachStateChangeListenerC20631115oD.getParent() == null) {
            linearLayout.addView(viewOnAttachStateChangeListenerC20631115oD, layoutParams2);
        }
        a.LIZ(linearLayout);
        C786410Ut5.W5(linearLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(linearLayout);
        }
        return linearLayout;
    }
}
