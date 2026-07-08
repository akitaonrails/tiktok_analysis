package com.by.andInflater;

import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import com.ss.android.ugc.aweme.commentv2.headeranchor.common.component.CommonTopBarView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes32.dex */
public class comment_common_top_bar implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        context.getResources();
        CommonTopBarView commonTopBarView = new CommonTopBarView(context, null, 6);
        commonTopBarView.setId(R.id.eel);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -2, viewGroup);
        a.LIZ(commonTopBarView);
        C786410Ut5.W5(commonTopBarView, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(commonTopBarView);
        }
        return commonTopBarView;
    }
}
