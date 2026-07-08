package com.by.andInflater;

import X.C11CQ;
import X.C11CS;
import X.C1749280vcc;
import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.RelativeLayout;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.n;

/* JADX INFO: loaded from: classes32.dex */
public class discovery_fragment_tab_reduce_overdraw implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setId(R.id.i9v);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -1, viewGroup);
        C11CS c11cs = new C11CS(context, null);
        c11cs.setId(R.id.ckc);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.addRule(3, R.id.w0u);
        }
        C11CQ c11cq = new C11CQ(context);
        c11cq.setId(R.id.msy);
        c11cq.setClipToPadding(false);
        c11cq.setPadding(c11cq.getPaddingLeft(), c11cq.getPaddingTop(), c11cq.getPaddingRight(), (int) resources.getDimension(R.dimen.tg));
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ2 = a.LJ(-1, -1, c11cs);
        a.LIZ(c11cq);
        if (c11cq.getParent() == null) {
            c11cs.addView(c11cq, marginLayoutParamsLJ2);
        }
        a.LIZ(c11cs);
        if (c11cs.getParent() == null) {
            relativeLayout.addView(c11cs, layoutParams);
        }
        View view = new View(context);
        view.setId(R.id.w0u);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.bx});
        view.setBackgroundColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        ViewGroup.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        a.LIZ(view);
        if (view.getParent() == null) {
            relativeLayout.addView(view, layoutParams2);
        }
        C1749280vcc c1749280vcc = new C1749280vcc(context);
        c1749280vcc.setId(R.id.w28);
        TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.bx});
        c1749280vcc.setBackgroundColor(typedArrayObtainStyledAttributes2.getColor(0, 0));
        typedArrayObtainStyledAttributes2.recycle();
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.addRule(3, R.id.w0u);
        }
        new n();
        n.LIZ(new a.c("fixed_height"), c1749280vcc);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin = (int) resources.getDimension(R.dimen.a3q);
        }
        android.view.a.LIZ(c1749280vcc);
        if (c1749280vcc.getParent() == null) {
            relativeLayout.addView(c1749280vcc, layoutParams3);
        }
        android.view.a.LIZ(relativeLayout);
        C786410Ut5.W5(relativeLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(relativeLayout);
        }
        return relativeLayout;
    }
}
