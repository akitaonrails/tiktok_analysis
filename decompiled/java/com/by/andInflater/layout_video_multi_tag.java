package com.by.andInflater;

import X.C705790RmL;
import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public class layout_video_multi_tag implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-2, -2, viewGroup);
        C705790RmL c705790RmL = new C705790RmL(new ContextThemeWrapper(context, R.style.hk), null, 6);
        c705790RmL.setId(R.id.feed_multi_tag_layout);
        c705790RmL.setClickable(true);
        c705790RmL.setFocusable(true);
        C786410Ut5.LJLLLLLL(8, c705790RmL);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        a.LIZ(c705790RmL);
        if (c705790RmL.getParent() == null) {
            frameLayout.addView(c705790RmL, layoutParams);
        }
        FrameLayout frameLayout2 = new FrameLayout(new ContextThemeWrapper(context, R.style.hk));
        frameLayout2.setId(R.id.hu8);
        frameLayout2.setClickable(true);
        frameLayout2.setFocusable(true);
        C786410Ut5.LJLLLLLL(8, frameLayout2);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        a.LIZ(frameLayout2);
        if (frameLayout2.getParent() == null) {
            frameLayout.addView(frameLayout2, layoutParams2);
        }
        a.LIZ(frameLayout);
        C786410Ut5.W5(frameLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        return frameLayout;
    }
}
