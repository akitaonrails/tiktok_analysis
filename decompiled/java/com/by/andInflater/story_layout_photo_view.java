package com.by.andInflater;

import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public class story_layout_photo_view implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        context.getResources();
        SmartImageView smartImageView = new SmartImageView(context);
        smartImageView.setId(R.id.lqq);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -1, viewGroup);
        a.LIZ(smartImageView);
        C786410Ut5.W5(smartImageView, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(smartImageView);
        }
        return smartImageView;
    }
}
