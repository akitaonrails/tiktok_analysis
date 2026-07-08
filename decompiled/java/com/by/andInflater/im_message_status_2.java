package com.by.andInflater;

import X.C19M4;
import X.C427760Gpy;
import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class im_message_status_2 implements InterfaceC20742716Ev {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-2, (int) resources.getDimension(R.dimen.a1u), viewGroup);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            marginLayoutParamsLJ.topMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            marginLayoutParamsLJ.bottomMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        C19M4 c19m4 = new C19M4(context);
        c19m4.setId(R.id.uq7);
        c19m4.setMaxWidth((int) TypedValue.applyDimension(1, 154.0f, resources.getDisplayMetrics()));
        c19m4.setEllipsize(TextUtils.TruncateAt.END);
        c19m4.setMaxLines(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 16;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams)) {
            ((DrawerLayout$LayoutParams) layoutParams).gravity = 16;
        }
        new o();
        o.LIZ("app:tux_iconPadding", new a.d("2", "dp"), c19m4);
        o.LIZ("app:tux_iconHeightStart", new a.d("14", "dp"), c19m4);
        o.LIZ("app:tux_iconWidthStart", new a.d("14", "dp"), c19m4);
        o.LIZ("app:tux_font", new a.c("P3_Regular"), c19m4);
        android.view.a.LIZ(c19m4);
        if (c19m4.getParent() == null) {
            linearLayout.addView(c19m4, layoutParams);
        }
        View c427760Gpy = new C427760Gpy(context);
        c427760Gpy.setId(R.id.bk1);
        ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        android.view.a.LIZ(c427760Gpy);
        if (c427760Gpy.getParent() == null) {
            linearLayout.addView(c427760Gpy, layoutParams2);
        }
        android.view.a.LIZ(linearLayout);
        C786410Ut5.W5(linearLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(linearLayout);
        }
        return linearLayout;
    }
}
