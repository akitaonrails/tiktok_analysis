package com.by.andInflater;

import X.C19ME;
import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.RelativeLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class nearby_tab_top_navigation_view implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setPadding((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), tuxTextView.getPaddingTop(), tuxTextView.getPaddingRight(), tuxTextView.getPaddingBottom());
        tuxTextView.setPadding(tuxTextView.getPaddingLeft(), tuxTextView.getPaddingTop(), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), tuxTextView.getPaddingBottom());
        tuxTextView.setLines(1);
        tuxTextView.setPadding((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), tuxTextView.getPaddingTop(), tuxTextView.getPaddingRight(), tuxTextView.getPaddingBottom());
        tuxTextView.setPadding(tuxTextView.getPaddingLeft(), tuxTextView.getPaddingTop(), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), tuxTextView.getPaddingBottom());
        tuxTextView.setGravity(17);
        C786410Ut5.T4(tuxTextView, 0.6f);
        tuxTextView.setTextColor(resources.getColorStateList(R.color.ao));
        tuxTextView.setId(android.R.id.text1);
        tuxTextView.setGravity(16);
        tuxTextView.setText(2131837937);
        C786410Ut5.LJLLLLLL(0, tuxTextView);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-2, (int) TypedValue.applyDimension(1, 58.0f, resources.getDisplayMetrics()), viewGroup);
        if (RelativeLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            ((RelativeLayout.LayoutParams) marginLayoutParamsLJ).addRule(15, -1);
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ)) {
            ((C19ME) marginLayoutParamsLJ).bottomToBottom = 0;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ)) {
            ((C19ME) marginLayoutParamsLJ).endToEnd = 0;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ)) {
            ((C19ME) marginLayoutParamsLJ).startToStart = 0;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ)) {
            ((C19ME) marginLayoutParamsLJ).topToTop = 0;
        }
        new o();
        o.LIZ("app:tux_font", new a.c("H3_Semibold"), tuxTextView);
        android.view.a.LIZ(tuxTextView);
        C786410Ut5.W5(tuxTextView, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(tuxTextView);
        }
        return tuxTextView;
    }
}
