package com.by.andInflater;

import X.C714420S0q;
import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import com.ss.android.ugc.aweme.story.feed.immersive.panel.ui.ImmersiveGestureMonitor;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public class story_layout_immersive_user_feed implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        context.getResources();
        ImmersiveGestureMonitor immersiveGestureMonitor = new ImmersiveGestureMonitor(context, null);
        immersiveGestureMonitor.setId(R.id.toh);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -1, viewGroup);
        C714420S0q c714420S0q = new C714420S0q(context, null);
        c714420S0q.setId(R.id.vp_story_immersive_feed);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ2 = a.LJ(-1, -1, immersiveGestureMonitor);
        a.LIZ(c714420S0q);
        if (c714420S0q.getParent() == null) {
            immersiveGestureMonitor.addView(c714420S0q, marginLayoutParamsLJ2);
        }
        a.LIZ(immersiveGestureMonitor);
        C786410Ut5.W5(immersiveGestureMonitor, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(immersiveGestureMonitor);
        }
        return immersiveGestureMonitor;
    }
}
