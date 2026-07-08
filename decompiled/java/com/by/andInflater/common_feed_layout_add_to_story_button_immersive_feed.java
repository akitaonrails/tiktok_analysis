package com.by.andInflater;

import X.C197039127h;
import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.f;

/* JADX INFO: loaded from: classes32.dex */
public class common_feed_layout_add_to_story_button_immersive_feed implements InterfaceC20742716Ev {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -2, viewGroup);
        C197039127h c197039127h = new C197039127h(context);
        c197039127h.setId(R.id.afa);
        if (TextView.class.isInstance(c197039127h)) {
            a.LJII((int) TypedValue.applyDimension(1, 164.0f, resources.getDisplayMetrics()), c197039127h);
        } else {
            c197039127h.setMinimumWidth((int) TypedValue.applyDimension(1, 164.0f, resources.getDisplayMetrics()));
        }
        c197039127h.setPadding((int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics()), c197039127h.getPaddingTop(), c197039127h.getPaddingRight(), c197039127h.getPaddingBottom());
        c197039127h.setPadding(c197039127h.getPaddingLeft(), c197039127h.getPaddingTop(), (int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics()), c197039127h.getPaddingBottom());
        c197039127h.setText(2131847851);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics());
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((LinearLayout.LayoutParams) layoutParams).gravity = 1;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.gravity = 1;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams)) {
            ((DrawerLayout$LayoutParams) layoutParams).gravity = 1;
        }
        new f();
        f.LIZ("app:tux_font", new a.c("Headline_Bold"), c197039127h);
        f.LIZ("app:tux_iconStart", new a.b("2130774778", "raw"), c197039127h);
        f.LIZ("app:tux_buttonCapsule", new a.c("true"), c197039127h);
        f.LIZ("app:tux_iconWidth", new a.d("20", "dp"), c197039127h);
        f.LIZ("app:tux_iconHeight", new a.d("20", "dp"), c197039127h);
        f.LIZ("app:tux_buttonAutoSizing", new a.c("true"), c197039127h);
        android.view.a.LIZ(c197039127h);
        if (c197039127h.getParent() == null) {
            frameLayout.addView(c197039127h, layoutParams);
        }
        android.view.a.LIZ(frameLayout);
        C786410Ut5.W5(frameLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        return frameLayout;
    }
}
