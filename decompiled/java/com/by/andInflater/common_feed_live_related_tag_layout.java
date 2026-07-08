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
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class common_feed_live_related_tag_layout implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.zt1);
        tuxTextView.setPadding((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()), tuxTextView.getPaddingTop(), tuxTextView.getPaddingRight(), tuxTextView.getPaddingBottom());
        tuxTextView.setPadding(tuxTextView.getPaddingLeft(), tuxTextView.getPaddingTop(), (int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()), tuxTextView.getPaddingBottom());
        tuxTextView.setGravity(17);
        tuxTextView.setMaxLines(1);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.z_});
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        tuxTextView.setBackgroundResource(R.drawable.b_n);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-2, (int) TypedValue.applyDimension(1, 22.0f, resources.getDisplayMetrics()), viewGroup);
        new o();
        o.LIZ("app:tux_font", new a.c("P3_Semibold"), tuxTextView);
        android.view.a.LIZ(tuxTextView);
        C786410Ut5.W5(tuxTextView, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(tuxTextView);
        }
        return tuxTextView;
    }
}
