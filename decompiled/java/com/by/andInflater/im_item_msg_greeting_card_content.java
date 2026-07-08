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
public class im_item_msg_greeting_card_content implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        SmartImageView smartImageView = new SmartImageView(context);
        smartImageView.setId(R.id.o9i);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ((int) TypedValue.applyDimension(1, 150.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 150.0f, resources.getDisplayMetrics()), viewGroup);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            marginLayoutParamsLJ.setMargins((int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()));
        }
        c cVar = new c();
        cVar.LIZIZ("app:failureImageScaleType", new a.c("fitXY"), smartImageView);
        cVar.LIZ(smartImageView);
        android.view.a.LIZ(smartImageView);
        C786410Ut5.W5(smartImageView, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(smartImageView);
        }
        return smartImageView;
    }
}
