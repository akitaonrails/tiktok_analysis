package com.by.andInflater;

import X.C16FB;
import X.C20742916Ex;
import X.C420470GeD;
import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.b;

/* JADX INFO: loaded from: classes32.dex */
public class detail_feed_story_detail_page implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -1, viewGroup);
        C16FB c16fb = new C16FB(context);
        c16fb.setId(R.id.vw9);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.oh});
        c16fb.setBackgroundColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        new b();
        b.LIZ("app:tux_forceHandleEventMode", new a.c("true"), c16fb);
        View viewLIZ = C20742916Ex.LIZ(context, R.layout.bl5, c16fb, false, 0);
        if (viewLIZ.getParent() == null) {
            c16fb.addView(viewLIZ);
        }
        android.view.a.LIZ(c16fb);
        if (c16fb.getParent() == null) {
            frameLayout.addView(c16fb, layoutParams);
        }
        C420470GeD c420470GeD = new C420470GeD(context);
        c420470GeD.setId(R.id.nnp);
        C786410Ut5.LJLLLLLL(8, c420470GeD);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        android.view.a.LIZ(c420470GeD);
        if (c420470GeD.getParent() == null) {
            frameLayout.addView(c420470GeD, layoutParams2);
        }
        android.view.a.LIZ(frameLayout);
        C786410Ut5.W5(frameLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        return frameLayout;
    }
}
