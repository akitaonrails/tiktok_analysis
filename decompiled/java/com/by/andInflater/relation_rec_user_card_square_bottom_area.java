package com.by.andInflater;

import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.RelativeLayout;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.f;

/* JADX INFO: loaded from: classes32.dex */
public class relation_rec_user_card_square_bottom_area implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        RelationButton relationButton = new RelationButton(context);
        relationButton.setId(R.id.t4m);
        relationButton.setEllipsize(TextUtils.TruncateAt.END);
        relationButton.setGravity(17);
        relationButton.setMaxLines(1);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ((int) TypedValue.applyDimension(1, 136.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 28.0f, resources.getDisplayMetrics()), viewGroup);
        if (RelativeLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            ((RelativeLayout.LayoutParams) marginLayoutParamsLJ).addRule(12, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            ((RelativeLayout.LayoutParams) marginLayoutParamsLJ).addRule(14, -1);
        }
        new f();
        f.LIZ("app:tux_buttonSize", new a.c("small"), relationButton);
        f.LIZ("app:tux_buttonVariant", new a.c("primary"), relationButton);
        f.LIZ("app:tux_font", new a.c("P2_Semibold"), relationButton);
        android.view.a.LIZ(relationButton);
        C786410Ut5.W5(relationButton, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(relationButton);
        }
        return relationButton;
    }
}
