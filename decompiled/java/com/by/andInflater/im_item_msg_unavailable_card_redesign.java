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
import android.widget.TextView;
import com.ss.android.ugc.aweme.im.common.view.TightTuxTextView;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class im_item_msg_unavailable_card_redesign implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        TightTuxTextView tightTuxTextView = new TightTuxTextView(context);
        tightTuxTextView.setId(R.id.k4n);
        tightTuxTextView.setMaxWidth((int) TypedValue.applyDimension(1, 260.0f, resources.getDisplayMetrics()));
        tightTuxTextView.setPadding((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), tightTuxTextView.getPaddingTop(), tightTuxTextView.getPaddingRight(), tightTuxTextView.getPaddingBottom());
        tightTuxTextView.setPadding(tightTuxTextView.getPaddingLeft(), tightTuxTextView.getPaddingTop(), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), tightTuxTextView.getPaddingBottom());
        tightTuxTextView.setPadding(tightTuxTextView.getPaddingLeft(), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), tightTuxTextView.getPaddingRight(), tightTuxTextView.getPaddingBottom());
        if (TextView.class.isInstance(tightTuxTextView)) {
            a.LJI((int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()), tightTuxTextView);
        } else {
            tightTuxTextView.setMinimumHeight((int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()));
        }
        tightTuxTextView.setPadding(tightTuxTextView.getPaddingLeft(), tightTuxTextView.getPaddingTop(), tightTuxTextView.getPaddingRight(), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        tightTuxTextView.setGravity(16);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1k});
        tightTuxTextView.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        tightTuxTextView.setHighlightColor(resources.getColor(R.color.a1d));
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-2, -2, viewGroup);
        new o();
        o.LIZ("app:tux_font", new a.c("P2_Regular"), tightTuxTextView);
        o.LIZ("app:tux_iconHeightStart", new a.d("36", "dp"), tightTuxTextView);
        o.LIZ("app:tux_iconPadding", new a.d("12", "dp"), tightTuxTextView);
        android.view.a.LIZ(tightTuxTextView);
        C786410Ut5.W5(tightTuxTextView, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(tightTuxTextView);
        }
        return tightTuxTextView;
    }
}
