package com.by.andInflater;

import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.innerpush.ui.InnerPushPullUpLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public class inner_push_layout implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        InnerPushPullUpLayout innerPushPullUpLayout = new InnerPushPullUpLayout(context, null, 6);
        innerPushPullUpLayout.setId(R.id.si2);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -2, viewGroup);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.tp9);
        frameLayout.setPadding(frameLayout.getPaddingLeft(), (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()), frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        frameLayout.setPadding(frameLayout.getPaddingLeft(), frameLayout.getPaddingTop(), frameLayout.getPaddingRight(), (int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics()));
        frameLayout.setPadding((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), frameLayout.getPaddingTop(), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), frameLayout.getPaddingBottom());
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ2 = a.LJ(-1, -2, innerPushPullUpLayout);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            marginLayoutParamsLJ2.bottomMargin = (int) TypedValue.applyDimension(1, 70.0f, resources.getDisplayMetrics());
        }
        a.LIZ(frameLayout);
        if (frameLayout.getParent() == null) {
            innerPushPullUpLayout.addView(frameLayout, marginLayoutParamsLJ2);
        }
        a.LIZ(innerPushPullUpLayout);
        C786410Ut5.W5(innerPushPullUpLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(innerPushPullUpLayout);
        }
        return innerPushPullUpLayout;
    }
}
