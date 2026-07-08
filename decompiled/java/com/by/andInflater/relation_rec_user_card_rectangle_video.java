package com.by.andInflater;

import X.C20742916Ex;
import X.C426500Gnw;
import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public class relation_rec_user_card_rectangle_video implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -2, viewGroup);
        View viewLIZ = C20742916Ex.LIZ(context, R.layout.ele, linearLayout, false, R.layout.elg);
        viewLIZ.setId(R.id.pbw);
        if (viewLIZ.getParent() == null) {
            linearLayout.addView(viewLIZ);
        }
        C426500Gnw c426500Gnw = new C426500Gnw(context, null, 6);
        c426500Gnw.setId(R.id.video_cover_list);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        a.LIZ(c426500Gnw);
        if (c426500Gnw.getParent() == null) {
            linearLayout.addView(c426500Gnw, layoutParams);
        }
        a.LIZ(linearLayout);
        C786410Ut5.W5(linearLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(linearLayout);
        }
        return linearLayout;
    }
}
