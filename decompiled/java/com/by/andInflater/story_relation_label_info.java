package com.by.andInflater;

import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import com.ss.android.ugc.aweme.relation.label.RelationLabelTextView;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class story_relation_label_info implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        RelationLabelTextView relationLabelTextView = new RelationLabelTextView(context);
        relationLabelTextView.setId(R.id.i9g);
        relationLabelTextView.setEllipsize(TextUtils.TruncateAt.END);
        relationLabelTextView.setMaxLines(1);
        relationLabelTextView.setText("People you may know!");
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.ee});
        relationLabelTextView.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        C786410Ut5.LJLLLLLL(8, relationLabelTextView);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-2, (int) TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()), viewGroup);
        new o();
        o.LIZ("app:tux_font", new a.c("P1_Regular"), relationLabelTextView);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            marginLayoutParamsLJ.setMarginStart((int) resources.getDimension(R.dimen.ahx));
        }
        android.view.a.LIZ(relationLabelTextView);
        C786410Ut5.W5(relationLabelTextView, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(relationLabelTextView);
        }
        return relationLabelTextView;
    }
}
