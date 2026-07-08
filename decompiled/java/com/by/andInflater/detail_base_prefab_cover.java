package com.by.andInflater;

import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;
import dc.a;
import jf8.c;

/* JADX INFO: loaded from: classes32.dex */
public class detail_base_prefab_cover implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        SmartImageView smartImageView = new SmartImageView(context);
        smartImageView.setId(R.id.bh2);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ((int) TypedValue.applyDimension(1, 80.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 80.0f, resources.getDisplayMetrics()), viewGroup);
        c cVar = new c();
        cVar.LIZIZ("app:actualImageScaleType", new a.c("fitCenter"), smartImageView);
        cVar.LIZIZ("app:roundingBorderWidth", new a.d("0.5", "dp"), smartImageView);
        cVar.LIZIZ("app:roundingBorderColor", new a.b("2131100103", "attr"), smartImageView);
        cVar.LIZIZ("app:placeholderImage", new a.b("2130971108", "drawable"), smartImageView);
        cVar.LIZIZ("app:roundedCornerRadius", new a.d("4", "dp"), smartImageView);
        cVar.LIZ(smartImageView);
        android.view.a.LIZ(smartImageView);
        C786410Ut5.W5(smartImageView, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(smartImageView);
        }
        return smartImageView;
    }
}
