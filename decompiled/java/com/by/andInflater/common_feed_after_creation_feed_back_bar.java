package com.by.andInflater;

import X.C19ME;
import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.k;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class common_feed_after_creation_feed_back_bar implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        int i2;
        float f;
        int i3;
        Resources resources = context.getResources();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, R.style.y0);
        Resources resources2 = contextThemeWrapper.getResources();
        ConstraintLayout constraintLayout = new ConstraintLayout(contextThemeWrapper);
        constraintLayout.setId(R.id.trr);
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.getTheme().obtainStyledAttributes(new int[]{R.attr.zg});
        constraintLayout.setBackgroundColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -2, viewGroup);
        TuxIconView tuxIconView = new TuxIconView(contextThemeWrapper);
        tuxIconView.setId(R.id.k1_);
        tuxIconView.setContentDescription("icon");
        C19ME c19me = new C19ME((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        if (C19ME.class.isInstance(c19me)) {
            c19me.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.topToTop = 0;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.bottomToBottom = 0;
        }
        new k();
        k.LIZ("app:tux_iconWidth", new a.d("16", "dp"), tuxIconView);
        k.LIZ("app:tux_iconHeight", new a.d("16", "dp"), tuxIconView);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me)) {
            c19me.setMarginStart((int) TypedValue.applyDimension(1, 12.0f, resources2.getDisplayMetrics()));
        }
        k.LIZ("app:tux_tintColor", new a.b("2131100622", "attr"), tuxIconView);
        k.LIZ("app:tux_icon", new a.b("2130773827", "raw"), tuxIconView);
        android.view.a.LIZ(tuxIconView);
        if (tuxIconView.getParent() == null) {
            constraintLayout.addView(tuxIconView, c19me);
        }
        TuxTextView tuxTextView = new TuxTextView(contextThemeWrapper);
        tuxTextView.setId(R.id.y3j);
        tuxTextView.setMaxLines(2);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setSingleLine(false);
        TypedArray typedArrayObtainStyledAttributes2 = contextThemeWrapper.getTheme().obtainStyledAttributes(new int[]{R.attr.ee});
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes2.getColor(0, 0));
        typedArrayObtainStyledAttributes2.recycle();
        C19ME c19me2 = new C19ME((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (C19ME.class.isInstance(c19me2)) {
            i = 0;
            c19me2.topToTop = 0;
        } else {
            i = 0;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.bottomToBottom = i;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.startToEnd = R.id.k1_;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.endToStart = R.id.dre;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me2)) {
            i2 = 1;
            c19me2.setMarginStart((int) TypedValue.applyDimension(1, 4.0f, resources2.getDisplayMetrics()));
        } else {
            i2 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me2)) {
            f = 12.0f;
            c19me2.setMarginEnd((int) TypedValue.applyDimension(i2, 12.0f, resources2.getDisplayMetrics()));
        } else {
            f = 12.0f;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me2)) {
            ((ViewGroup.MarginLayoutParams) c19me2).topMargin = (int) TypedValue.applyDimension(i2, f, resources2.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me2)) {
            ((ViewGroup.MarginLayoutParams) c19me2).bottomMargin = (int) TypedValue.applyDimension(i2, f, resources2.getDisplayMetrics());
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P3_Regular"), tuxTextView);
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            constraintLayout.addView(tuxTextView, c19me2);
        }
        TuxIconView tuxIconView2 = new TuxIconView(contextThemeWrapper);
        tuxIconView2.setId(R.id.dre);
        tuxIconView2.setContentDescription("close icon");
        C19ME c19me3 = new C19ME((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        if (C19ME.class.isInstance(c19me3)) {
            i3 = 0;
            c19me3.endToEnd = 0;
        } else {
            i3 = 0;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.topToTop = i3;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.bottomToBottom = i3;
        }
        new k();
        k.LIZ("app:tux_iconWidth", new a.d("16", "dp"), tuxIconView2);
        k.LIZ("app:tux_iconHeight", new a.d("16", "dp"), tuxIconView2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me3)) {
            c19me3.setMarginEnd((int) TypedValue.applyDimension(1, f, resources2.getDisplayMetrics()));
        }
        k.LIZ("app:tux_icon", new a.b("2130772916", "raw"), tuxIconView2);
        k.LIZ("app:tux_tintColor", new a.b("2131100622", "attr"), tuxIconView2);
        android.view.a.LIZ(tuxIconView2);
        if (tuxIconView2.getParent() == null) {
            constraintLayout.addView(tuxIconView2, c19me3);
        }
        android.view.a.LIZ(constraintLayout);
        C786410Ut5.W5(constraintLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(constraintLayout);
        }
        return constraintLayout;
    }
}
