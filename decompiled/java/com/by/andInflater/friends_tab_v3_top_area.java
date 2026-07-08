package com.by.andInflater;

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
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.f;
import xem.k;

/* JADX INFO: loaded from: classes32.dex */
public class friends_tab_v3_top_area implements InterfaceC20742716Ev {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.nj8);
        linearLayout.setGravity(16);
        linearLayout.setOrientation(0);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -1, viewGroup);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            marginLayoutParamsLJ.setMarginStart((int) TypedValue.applyDimension(1, 68.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            marginLayoutParamsLJ.setMarginEnd((int) resources.getDimension(R.dimen.sz));
        }
        View frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.ib9);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            layoutParams.setMarginEnd((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()));
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.weight = 1;
        }
        a.LIZ(frameLayout);
        if (frameLayout.getParent() == null) {
            linearLayout.addView(frameLayout, layoutParams);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.cn7);
        ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        RelationButton relationButton = new RelationButton(context);
        relationButton.setId(R.id.t4f);
        relationButton.setEllipsize(TextUtils.TruncateAt.END);
        relationButton.setMaxWidth((int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        relationButton.setPadding((int) resources.getDimension(R.dimen.s9), relationButton.getPaddingTop(), relationButton.getPaddingRight(), relationButton.getPaddingBottom());
        relationButton.setPadding(relationButton.getPaddingLeft(), relationButton.getPaddingTop(), (int) resources.getDimension(R.dimen.s9), relationButton.getPaddingBottom());
        C786410Ut5.LJLLLLLL(8, relationButton);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        new f();
        f.LIZ("app:tux_buttonSize", new a.c("tiny"), relationButton);
        f.LIZ("app:tux_font", new a.c("P3_Semibold"), relationButton);
        f.LIZ("app:tux_minTextSize", new a.d("10", "dp"), relationButton);
        android.view.a.LIZ(relationButton);
        if (relationButton.getParent() == null) {
            frameLayout2.addView(relationButton, layoutParams3);
        }
        android.view.a.LIZ(frameLayout2);
        if (frameLayout2.getParent() == null) {
            linearLayout.addView(frameLayout2, layoutParams2);
        }
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setId(R.id.zy0);
        tuxIconView.setImportantForAccessibility(2);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), (int) resources.getDimension(R.dimen.sn));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.gravity = 48;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams4)) {
            ((FrameLayout.LayoutParams) layoutParams4).gravity = 48;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams4)) {
            ((DrawerLayout$LayoutParams) layoutParams4).gravity = 48;
        }
        new k();
        k.LIZ("app:tux_icon", new a.b("2130773650", "raw"), tuxIconView);
        k.LIZ("app:tux_iconHeight", new a.d("16", "dp"), tuxIconView);
        k.LIZ("app:tux_iconWidth", new a.d("16", "dp"), tuxIconView);
        k.LIZ("app:tux_tintColor", new a.b("2131100625", "attr"), tuxIconView);
        android.view.a.LIZ(tuxIconView);
        if (tuxIconView.getParent() == null) {
            linearLayout.addView(tuxIconView, layoutParams4);
        }
        android.view.a.LIZ(linearLayout);
        C786410Ut5.W5(linearLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(linearLayout);
        }
        return linearLayout;
    }
}
