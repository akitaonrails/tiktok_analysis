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
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.k;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class layout_bottom_quick_dm implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        C786410Ut5.LJLLLLLL(0, frameLayout);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-2, (int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()), viewGroup);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setId(R.id.snx);
        C786410Ut5.LJLLLLLL(0, relativeLayout);
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()));
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setId(R.id.so2);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        new k();
        k.LIZ("app:tux_icon", new a.b("2130774372", "raw"), tuxIconView);
        k.LIZ("app:tux_tintColor", new a.b("2131099769", "attr"), tuxIconView);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.setMarginStart((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        k.LIZ("app:tux_iconHeight", new a.d("20", "dp"), tuxIconView);
        k.LIZ("app:tux_iconWidth", new a.d("20", "dp"), tuxIconView);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.addRule(15, -1);
        }
        android.view.a.LIZ(tuxIconView);
        if (tuxIconView.getParent() == null) {
            relativeLayout.addView(tuxIconView, layoutParams2);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.so1);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.ee});
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        tuxTextView.setHint(context.getResources().getString(2131830718));
        tuxTextView.setHintTextColor(android.view.a.LIZIZ(R.attr.ee, context));
        tuxTextView.setSingleLine(true);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        new o();
        o.LIZ("app:tux_font", new a.c("P1_Regular"), tuxTextView);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.addRule(15, -1);
        }
        o.LIZ("app:tux_minTextSize", new a.d("12", "dp"), tuxTextView);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.addRule(17, R.id.so2);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.addRule(16, R.id.gzl);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.setMarginStart((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            relativeLayout.addView(tuxTextView, layoutParams3);
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.gzl);
        linearLayout.setOrientation(0);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -1);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.addRule(21, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.setMarginEnd((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.addRule(15, -1);
        }
        android.view.a.LIZ(linearLayout);
        if (linearLayout.getParent() == null) {
            relativeLayout.addView(linearLayout, layoutParams4);
        }
        android.view.a.LIZ(relativeLayout);
        if (relativeLayout.getParent() == null) {
            frameLayout.addView(relativeLayout, layoutParams);
        }
        android.view.a.LIZ(frameLayout);
        C786410Ut5.W5(frameLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        return frameLayout;
    }
}
