package com.by.andInflater;

import X.C19ME;
import X.C427660Gpo;
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
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import dc.a;
import jf8.c;
import xem.k;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class feed_skylight_go_live_cell_layout implements InterfaceC20742716Ev {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setPadding(constraintLayout.getPaddingLeft(), constraintLayout.getPaddingTop(), constraintLayout.getPaddingRight(), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ((int) TypedValue.applyDimension(1, 88.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 122.0f, resources.getDisplayMetrics()), viewGroup);
        C427660Gpo c427660Gpo = new C427660Gpo(new ContextThemeWrapper(context, R.style.z4));
        c427660Gpo.setId(R.id.vig);
        C19ME c19me = new C19ME((int) TypedValue.applyDimension(1, 80.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 80.0f, resources.getDisplayMetrics()));
        if (C19ME.class.isInstance(c19me)) {
            c19me.topToTop = 0;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.endToEnd = 0;
        }
        c cVar = new c();
        cVar.LIZIZ("app:tux_avatarSize", new a.c("size64"), c427660Gpo);
        cVar.LIZ(c427660Gpo);
        android.view.a.LIZ(c427660Gpo);
        if (c427660Gpo.getParent() == null) {
            constraintLayout.addView(c427660Gpo, c19me);
        }
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setId(R.id.j35);
        C786410Ut5.ed(tuxIconView, TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()));
        C786410Ut5.LLLLLLZZ(tuxIconView, 0);
        tuxIconView.setBackgroundResource(R.drawable.bsf);
        tuxIconView.setImportantForAccessibility(2);
        C19ME c19me2 = new C19ME((int) TypedValue.applyDimension(1, 26.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 26.0f, resources.getDisplayMetrics()));
        new k();
        k.LIZ("app:tux_iconWidth", new a.d("12", "dp"), tuxIconView);
        k.LIZ("app:tux_iconHeight", new a.d("12", "dp"), tuxIconView);
        if (RelativeLayout.LayoutParams.class.isInstance(c19me2)) {
            ((RelativeLayout.LayoutParams) c19me2).addRule(15, -1);
        }
        k.LIZ("app:tux_icon", new a.b("2130775000", "raw"), tuxIconView);
        k.LIZ("app:tux_tintColor", new a.b("2131099768", "attr"), tuxIconView);
        k.LIZ("app:actualImageScaleType", new a.c("fitCenter"), tuxIconView);
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.endToEnd = R.id.vig;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.bottomToBottom = R.id.vig;
        }
        android.view.a.LIZ(tuxIconView);
        if (tuxIconView.getParent() == null) {
            constraintLayout.addView(tuxIconView, c19me2);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.vif);
        tuxTextView.setMaxWidth((int) TypedValue.applyDimension(1, 72.0f, resources.getDisplayMetrics()));
        tuxTextView.setMaxLines(1);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setGravity(17);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.ee});
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        tuxTextView.setText(2131842012);
        C19ME c19me3 = new C19ME(-2, -2);
        new o();
        o.LIZ("app:tux_font", new a.c("P3_Semibold"), tuxTextView);
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.startToStart = R.id.vig;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.endToEnd = R.id.vig;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.bottomToBottom = 0;
        }
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            constraintLayout.addView(tuxTextView, c19me3);
        }
        android.view.a.LIZ(constraintLayout);
        C786410Ut5.W5(constraintLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(constraintLayout);
        }
        return constraintLayout;
    }
}
