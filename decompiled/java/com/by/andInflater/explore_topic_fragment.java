package com.by.andInflater;

import X.C1086520eNe;
import X.C1749280vcc;
import X.C20522315Sb;
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
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.b;
import xem.n;

/* JADX INFO: loaded from: classes32.dex */
public class explore_topic_fragment implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.hh6);
        frameLayout.setClipChildren(false);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -1, viewGroup);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.hho);
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        View view = new View(context);
        view.setId(R.id.hhn);
        view.setBackgroundResource(R.drawable.brl);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        a.LIZ(view);
        if (view.getParent() == null) {
            frameLayout2.addView(view, layoutParams2);
        }
        C20522315Sb c20522315Sb = new C20522315Sb(context, null, 6);
        c20522315Sb.setId(R.id.t25);
        ViewGroup.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        new b();
        b.LIZ("app:tux_scrollMode", new a.c("refresh"), c20522315Sb);
        C1086520eNe c1086520eNe = new C1086520eNe(context);
        c1086520eNe.setId(R.id.hh7);
        c1086520eNe.setPadding(c1086520eNe.getPaddingLeft(), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), c1086520eNe.getPaddingRight(), c1086520eNe.getPaddingBottom());
        c1086520eNe.setClipToPadding(false);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ2 = android.view.a.LJ(-1, -1, c20522315Sb);
        android.view.a.LIZ(c1086520eNe);
        if (c1086520eNe.getParent() == null) {
            c20522315Sb.addView(c1086520eNe, marginLayoutParamsLJ2);
        }
        android.view.a.LIZ(c20522315Sb);
        if (c20522315Sb.getParent() == null) {
            frameLayout2.addView(c20522315Sb, layoutParams3);
        }
        C1749280vcc c1749280vcc = new C1749280vcc(context);
        c1749280vcc.setId(R.id.w28);
        ViewGroup.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -1);
        new n();
        n.LIZ(new a.c("fixed_height"), c1749280vcc);
        android.view.a.LIZ(c1749280vcc);
        if (c1749280vcc.getParent() == null) {
            frameLayout2.addView(c1749280vcc, layoutParams4);
        }
        android.view.a.LIZ(frameLayout2);
        if (frameLayout2.getParent() == null) {
            frameLayout.addView(frameLayout2, layoutParams);
        }
        View viewLIZ = C20742916Ex.LIZ(context, R.layout.c5v, frameLayout, false, R.layout.c5q);
        C786410Ut5.LJLLLLLL(8, viewLIZ);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            i = 1;
            layoutParams5.setMarginStart((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        } else {
            i = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            ((ViewGroup.MarginLayoutParams) layoutParams5).topMargin = (int) TypedValue.applyDimension(i, 8.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.setMarginEnd((int) TypedValue.applyDimension(i, 12.0f, resources.getDisplayMetrics()));
        }
        if (viewLIZ.getParent() == null) {
            frameLayout.addView(viewLIZ, layoutParams5);
        }
        android.view.a.LIZ(frameLayout);
        C786410Ut5.W5(frameLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        return frameLayout;
    }
}
