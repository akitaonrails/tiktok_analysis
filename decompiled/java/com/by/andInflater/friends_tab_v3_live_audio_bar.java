package com.by.andInflater;

import X.C19ME;
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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.k;

/* JADX INFO: loaded from: classes32.dex */
public class friends_tab_v3_live_audio_bar implements InterfaceC20742716Ev {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(R.id.mtw);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, (int) TypedValue.applyDimension(1, 54.0f, resources.getDisplayMetrics()), viewGroup);
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setId(R.id.ovv);
        tuxIconView.setContentDescription("mute");
        C19ME c19me = new C19ME((int) resources.getDimension(R.dimen.sp), (int) resources.getDimension(R.dimen.sp));
        if (LinearLayout.LayoutParams.class.isInstance(c19me)) {
            ((LinearLayout.LayoutParams) c19me).gravity = 8388629;
        }
        if (FrameLayout.LayoutParams.class.isInstance(c19me)) {
            ((FrameLayout.LayoutParams) c19me).gravity = 8388629;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(c19me)) {
            ((DrawerLayout$LayoutParams) c19me).gravity = 8388629;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me)) {
            c19me.setMarginEnd((int) resources.getDimension(R.dimen.s9));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me)) {
            ((ViewGroup.MarginLayoutParams) c19me).bottomMargin = (int) resources.getDimension(R.dimen.t8);
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.bottomToBottom = 0;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.endToEnd = 0;
        }
        new k();
        k.LIZ("app:tux_icon", new a.b("2130774715", "raw"), tuxIconView);
        k.LIZ("app:tux_iconHeight", new a.b("2131296905", "dimen"), tuxIconView);
        k.LIZ("app:tux_iconWidth", new a.b("2131296905", "dimen"), tuxIconView);
        k.LIZ("app:tux_tintColor", new a.b("2131100549", "attr"), tuxIconView);
        android.view.a.LIZ(tuxIconView);
        if (tuxIconView.getParent() == null) {
            constraintLayout.addView(tuxIconView, c19me);
        }
        android.view.a.LIZ(constraintLayout);
        C786410Ut5.W5(constraintLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(constraintLayout);
        }
        return constraintLayout;
    }
}
