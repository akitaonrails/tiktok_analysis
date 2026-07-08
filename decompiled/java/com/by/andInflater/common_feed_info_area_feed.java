package com.by.andInflater;

import X.C20742916Ex;
import X.C709060Rrc;
import X.C709160Rrm;
import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.a;
import com.ss.android.ugc.feed.platform.cell.interact.view.InteractFrameLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes12.dex */
public class common_feed_info_area_feed implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        context.getResources();
        InteractFrameLayout interactFrameLayout = new InteractFrameLayout(context);
        interactFrameLayout.setId(R.id.bm6);
        interactFrameLayout.setClipChildren(false);
        interactFrameLayout.setClipToPadding(false);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-2, -2, viewGroup);
        C709160Rrm c709160Rrm = new C709160Rrm(context, null, 6);
        c709160Rrm.setId(R.id.bm5);
        c709160Rrm.setOrientation(1);
        ViewGroup.LayoutParams layoutParamsLJ = a.LJ(-1, -2, interactFrameLayout);
        C709060Rrc c709060Rrc = new C709060Rrc(14, context, null);
        c709060Rrc.setId(R.id.kv_);
        c709060Rrc.setOrientation(1);
        ViewGroup.LayoutParams layoutParamsLJ2 = a.LJ(-1, -2, c709160Rrm);
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(R.id.kva);
        viewStub.setLayoutResource(R.layout.b7d);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ2 = a.LJ(-1, -2, c709060Rrc);
        viewStub.setInflatedId(-1);
        a.LIZ(viewStub);
        if (viewStub.getParent() == null) {
            c709060Rrc.addView(viewStub, marginLayoutParamsLJ2);
        }
        a.LIZ(c709060Rrc);
        if (c709060Rrc.getParent() == null) {
            c709160Rrm.addView(c709060Rrc, layoutParamsLJ2);
        }
        a.LIZ(c709160Rrm);
        if (c709160Rrm.getParent() == null) {
            interactFrameLayout.addView(c709160Rrm, layoutParamsLJ);
        }
        View viewLIZ = C20742916Ex.LIZ(context, R.layout.b59, interactFrameLayout, false, R.layout.b79);
        viewLIZ.setId(R.id.c25);
        ViewGroup.LayoutParams layoutParamsLJ3 = a.LJ(-1, -2, interactFrameLayout);
        if (viewLIZ.getParent() == null) {
            interactFrameLayout.addView(viewLIZ, layoutParamsLJ3);
        }
        a.LIZ(interactFrameLayout);
        C786410Ut5.W5(interactFrameLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(interactFrameLayout);
        }
        return interactFrameLayout;
    }
}
