package com.by.andInflater;

import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import com.ss.android.ugc.aweme.base.ui.TagLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes12.dex */
public class common_feed_social_video_tag_layout implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        context.getResources();
        TagLayout tagLayout = new TagLayout(context, null);
        tagLayout.setId(R.id.hv4);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-2, -2, viewGroup);
        a.LIZ(tagLayout);
        C786410Ut5.W5(tagLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(tagLayout);
        }
        return tagLayout;
    }
}
