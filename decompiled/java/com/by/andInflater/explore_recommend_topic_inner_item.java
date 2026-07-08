package com.by.andInflater;

import X.C197039127h;
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
import xem.f;

/* JADX INFO: loaded from: classes32.dex */
public class explore_recommend_topic_inner_item implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(frameLayout.getPaddingLeft(), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), frameLayout.getPaddingRight(), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -2, viewGroup);
        C197039127h c197039127h = new C197039127h(context);
        c197039127h.setId(R.id.yej);
        c197039127h.setPadding((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), c197039127h.getPaddingTop(), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), c197039127h.getPaddingBottom());
        c197039127h.setPadding(c197039127h.getPaddingLeft(), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), c197039127h.getPaddingRight(), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        c197039127h.setText("a");
        c197039127h.setTextAlignment(5);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        new f();
        f.LIZ("app:tux_buttonCapsule", new a.c("true"), c197039127h);
        android.view.a.LIZ(c197039127h);
        if (c197039127h.getParent() == null) {
            frameLayout.addView(c197039127h, layoutParams);
        }
        android.view.a.LIZ(frameLayout);
        C786410Ut5.W5(frameLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        return frameLayout;
    }
}
