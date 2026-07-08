package com.by.andInflater;

import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.k;

/* JADX INFO: loaded from: classes32.dex */
public class im_chat_left_icon_error implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setScaleType(ImageView.ScaleType.FIT_XY);
        C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        tuxIconView.setId(R.id.w1v);
        tuxIconView.setContentDescription(context.getResources().getString(R.string.s_u));
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ((int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()), viewGroup);
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ).gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ).gravity = 16;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ).gravity = 16;
        }
        new k();
        k.LIZ("app:tux_icon", new a.b("2130773677", "raw"), tuxIconView);
        k.LIZ("app:tux_tintColor", new a.b("2131100559", "attr"), tuxIconView);
        k.LIZ("app:tux_iconWidth", new a.d("20", "dp"), tuxIconView);
        k.LIZ("app:tux_iconHeight", new a.d("20", "dp"), tuxIconView);
        android.view.a.LIZ(tuxIconView);
        C786410Ut5.W5(tuxIconView, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(tuxIconView);
        }
        return tuxIconView;
    }
}
