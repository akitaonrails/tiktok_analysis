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
import com.ss.android.ugc.aweme.im.sdk.chat.ui.view.SearchableEditText;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.j;

/* JADX INFO: loaded from: classes32.dex */
public class im_input_field implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        SearchableEditText searchableEditText = new SearchableEditText(context, null, 6);
        searchableEditText.setPadding((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), searchableEditText.getPaddingTop(), searchableEditText.getPaddingRight(), searchableEditText.getPaddingBottom());
        searchableEditText.setFocusableInTouchMode(true);
        searchableEditText.setPadding(searchableEditText.getPaddingLeft(), searchableEditText.getPaddingTop(), (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()), searchableEditText.getPaddingBottom());
        searchableEditText.setHint(context.getResources().getString(2131831183));
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1h});
        searchableEditText.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        searchableEditText.setHintTextColor(a.LIZIZ(R.attr.a1k, context));
        searchableEditText.setInputType(147457);
        searchableEditText.setVerticalScrollBarEnabled(true);
        searchableEditText.setPadding(searchableEditText.getPaddingLeft(), searchableEditText.getPaddingTop(), searchableEditText.getPaddingRight(), (int) TypedValue.applyDimension(1, 10.5f, resources.getDisplayMetrics()));
        searchableEditText.setMaxLines(5);
        searchableEditText.setScrollbarFadingEnabled(true);
        if (TextView.class.isInstance(searchableEditText)) {
            a.LJI((int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()), searchableEditText);
        } else {
            searchableEditText.setMinimumHeight((int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()));
        }
        searchableEditText.setTextAlignment(5);
        searchableEditText.setPadding(searchableEditText.getPaddingLeft(), (int) TypedValue.applyDimension(1, 10.5f, resources.getDisplayMetrics()), searchableEditText.getPaddingRight(), searchableEditText.getPaddingBottom());
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -2, viewGroup);
        new j();
        j.LIZ("android:scrollbarThumbVertical", new a.b("2130972287", "drawable"), searchableEditText);
        j.LIZ("app:tux_font", new a.c("H3_Regular"), searchableEditText);
        searchableEditText.setLineSpacing(TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()), 1.0f);
        android.view.a.LIZ(searchableEditText);
        C786410Ut5.W5(searchableEditText, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(searchableEditText);
        }
        return searchableEditText;
    }
}
