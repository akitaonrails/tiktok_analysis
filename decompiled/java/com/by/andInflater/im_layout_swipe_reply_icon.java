package com.by.andInflater;

import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.ImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.k;

/* JADX INFO: loaded from: classes32.dex */
public class im_layout_swipe_reply_icon implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setId(R.id.wse);
        C786410Ut5.LLLLLLZZ(tuxIconView, 4);
        tuxIconView.setScaleType(ImageView.ScaleType.FIT_XY);
        tuxIconView.setBackgroundResource(R.drawable.ca9);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ((int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), viewGroup);
        new k();
        k.LIZ("app:tux_iconWidth", new a.d("13", "dp"), tuxIconView);
        k.LIZ("app:tux_iconHeight", new a.d("13", "dp"), tuxIconView);
        k.LIZ("app:tux_icon", new a.b("2130772473", "raw"), tuxIconView);
        k.LIZ("app:tux_tintColor", new a.b("2131100622", "attr"), tuxIconView);
        android.view.a.LIZ(tuxIconView);
        C786410Ut5.W5(tuxIconView, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(tuxIconView);
        }
        return tuxIconView;
    }
}
