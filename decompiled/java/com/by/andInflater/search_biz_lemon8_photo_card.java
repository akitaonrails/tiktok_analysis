package com.by.andInflater;

import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.a;

/* JADX INFO: loaded from: classes8.dex */
public class search_biz_lemon8_photo_card implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        context.getResources();
        ViewStub viewStub = new ViewStub(context);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -1, viewGroup);
        viewStub.setInflatedId(-1);
        a.LIZ(viewStub);
        C786410Ut5.W5(viewStub, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(viewStub);
        }
        return viewStub;
    }
}
