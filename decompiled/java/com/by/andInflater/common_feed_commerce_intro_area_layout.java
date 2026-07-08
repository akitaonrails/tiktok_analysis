package com.by.andInflater;

import X.C0JAD;
import X.C0JAE;
import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public class common_feed_commerce_intro_area_layout implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.egv);
        C786410Ut5.LJLLLLLL(0, linearLayout);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -2, viewGroup);
        C0JAD c0jad = new C0JAD(context);
        c0jad.setId(R.id.a80);
        c0jad.setInflater(new C0JAE() { // from class: X.0J9s
            @Override // X.C0JAE
            public final View LIZ(Context context2, ViewGroup viewGroup2, ViewGroup.LayoutParams layoutParams) {
                context2.getResources();
                FrameLayout frameLayout = new FrameLayout(context2);
                frameLayout.setId(R.id.a80);
                C786410Ut5.LJLLLLLL(8, frameLayout);
                a.LIZ(frameLayout);
                return frameLayout;
            }
        });
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        if (c0jad.getParent() == null) {
            linearLayout.addView(c0jad, layoutParams);
        }
        a.LIZ(linearLayout);
        C786410Ut5.W5(linearLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(linearLayout);
        }
        return linearLayout;
    }
}
