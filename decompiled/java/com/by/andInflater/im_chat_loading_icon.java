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
import com.bytedance.tux.status.loading.TuxSpinner;
import com.zhiliaoapp.musically.R;
import dc.a;
import mcf.d0;

/* JADX INFO: loaded from: classes32.dex */
public class im_chat_loading_icon implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        TuxSpinner tuxSpinner = new TuxSpinner(context);
        tuxSpinner.setScaleType(ImageView.ScaleType.FIT_XY);
        C786410Ut5.LLZILL(tuxSpinner, 8);
        tuxSpinner.setId(R.id.nmn);
        C786410Ut5.LLZILL(tuxSpinner, 8);
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
        new d0().LIZ("app:tux_tintColor", new a.b("2131100630", "attr"), tuxSpinner);
        android.view.a.LIZ(tuxSpinner);
        C786410Ut5.W5(tuxSpinner, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(tuxSpinner);
        }
        return tuxSpinner;
    }
}
