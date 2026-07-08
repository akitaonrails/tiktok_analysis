package com.by.andInflater;

import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class im_layout_msg_notice implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.pd8);
        tuxTextView.setBackgroundResource(R.drawable.ca_);
        tuxTextView.setGravity(17);
        tuxTextView.setPadding(tuxTextView.getPaddingLeft(), tuxTextView.getPaddingTop(), tuxTextView.getPaddingRight(), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        tuxTextView.setPadding((int) TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()), tuxTextView.getPaddingTop(), tuxTextView.getPaddingRight(), tuxTextView.getPaddingBottom());
        tuxTextView.setPadding(tuxTextView.getPaddingLeft(), tuxTextView.getPaddingTop(), (int) TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()), tuxTextView.getPaddingBottom());
        tuxTextView.setPadding(tuxTextView.getPaddingLeft(), (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()), tuxTextView.getPaddingRight(), tuxTextView.getPaddingBottom());
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1k});
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        C786410Ut5.LJLLLLLL(8, tuxTextView);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-2, -2, viewGroup);
        new o();
        o.LIZ("app:tux_font", new a.c("P3_Regular"), tuxTextView);
        android.view.a.LIZ(tuxTextView);
        C786410Ut5.W5(tuxTextView, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(tuxTextView);
        }
        return tuxTextView;
    }
}
