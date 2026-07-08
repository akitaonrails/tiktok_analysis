package com.by.andInflater;

import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import com.bytedance.tux.tag.TuxTag;
import com.zhiliaoapp.musically.R;
import dc.a;
import jem.b;

/* JADX INFO: loaded from: classes32.dex */
public class common_feed_social_relation_tag_layout implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, R.style.hk);
        Resources resources2 = contextThemeWrapper.getResources();
        TuxTag tuxTag = new TuxTag(contextThemeWrapper);
        tuxTag.setId(R.id.zt1);
        tuxTag.setPadding(tuxTag.getPaddingLeft(), tuxTag.getPaddingTop(), (int) TypedValue.applyDimension(1, 5.0f, resources2.getDisplayMetrics()), tuxTag.getPaddingBottom());
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-2, (int) TypedValue.applyDimension(1, 22.0f, resources.getDisplayMetrics()), viewGroup);
        new b();
        b.LIZ("app:tux_tagSize", new a.c("large"), tuxTag);
        b.LIZ("app:tux_tagTextColor", new a.b("2131099754", "attr"), tuxTag);
        b.LIZ("app:tux_tagIconColor", new a.b("2131099754", "attr"), tuxTag);
        android.view.a.LIZ(tuxTag);
        C786410Ut5.W5(tuxTag, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(tuxTag);
        }
        return tuxTag;
    }
}
