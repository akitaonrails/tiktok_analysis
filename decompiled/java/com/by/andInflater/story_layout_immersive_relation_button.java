package com.by.andInflater;

import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.f;

/* JADX INFO: loaded from: classes32.dex */
public class story_layout_immersive_relation_button implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        RelationButton relationButton = new RelationButton(context);
        relationButton.setId(R.id.t4l);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-2, (int) TypedValue.applyDimension(1, 28.0f, resources.getDisplayMetrics()), viewGroup);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            marginLayoutParamsLJ.setMarginStart((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        new f();
        f.LIZ("app:tux_buttonSize", new a.c("tiny"), relationButton);
        android.view.a.LIZ(relationButton);
        C786410Ut5.W5(relationButton, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(relationButton);
        }
        return relationButton;
    }
}
