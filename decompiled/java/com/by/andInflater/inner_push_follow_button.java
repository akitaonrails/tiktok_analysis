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
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.zhiliaoapp.musically.R;
import dc.a;
import mcf.d0;
import xem.f;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class inner_push_follow_button implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-2, -2, viewGroup);
        RelationButton relationButton = new RelationButton(context);
        relationButton.setId(R.id.iea);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.c5});
        relationButton.setBackgroundColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        relationButton.setEllipsize(TextUtils.TruncateAt.END);
        relationButton.setSingleLine(true);
        TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a04});
        relationButton.setTextColor(typedArrayObtainStyledAttributes2.getColor(0, 0));
        typedArrayObtainStyledAttributes2.recycle();
        C786410Ut5.LJLLLLLL(0, relationButton);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        new f();
        f.LIZ("app:tux_buttonVariant", new a.c("none"), relationButton);
        f.LIZ("app:tux_font", new a.c("H4_Semibold"), relationButton);
        f.LIZ("app:tux_minTextSize", new a.d("12", "dp"), relationButton);
        android.view.a.LIZ(relationButton);
        if (relationButton.getParent() == null) {
            frameLayout.addView(relationButton, layoutParams);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.idu);
        TypedArray typedArrayObtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.c5});
        tuxTextView.setBackgroundColor(typedArrayObtainStyledAttributes3.getColor(0, 0));
        typedArrayObtainStyledAttributes3.recycle();
        tuxTextView.setPadding((int) TypedValue.applyDimension(0, 0.0f, resources.getDisplayMetrics()), tuxTextView.getPaddingTop(), (int) TypedValue.applyDimension(0, 0.0f, resources.getDisplayMetrics()), tuxTextView.getPaddingBottom());
        tuxTextView.setSingleLine(true);
        tuxTextView.setText(2131823125);
        TypedArray typedArrayObtainStyledAttributes4 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a04});
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes4.getColor(0, 0));
        typedArrayObtainStyledAttributes4.recycle();
        C786410Ut5.LJLLLLLL(8, tuxTextView);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        new o();
        o.LIZ("app:tux_font", new a.c("H4_Semibold"), tuxTextView);
        o.LIZ("app:tux_minTextSize", new a.d("12", "dp"), tuxTextView);
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            frameLayout.addView(tuxTextView, layoutParams2);
        }
        TuxSpinner tuxSpinner = new TuxSpinner(context);
        tuxSpinner.setId(R.id.if0);
        C786410Ut5.LLZILL(tuxSpinner, 8);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        d0 d0Var = new d0();
        d0Var.LIZ("app:tux_icon", new a.b("2130774720", "raw"), tuxSpinner);
        d0Var.LIZ("app:tux_tintColor", new a.b("2131100630", "attr"), tuxSpinner);
        android.view.a.LIZ(tuxSpinner);
        if (tuxSpinner.getParent() == null) {
            frameLayout.addView(tuxSpinner, layoutParams3);
        }
        android.view.a.LIZ(frameLayout);
        C786410Ut5.W5(frameLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        return frameLayout;
    }
}
