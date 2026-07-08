package com.by.andInflater;

import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import com.bytedance.tux.tag.TuxTag;
import com.zhiliaoapp.musically.R;
import dc.a;
import jem.b;

/* JADX INFO: loaded from: classes32.dex */
public class common_feed_paid_content_preview_tag implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        TuxTag tuxTag = new TuxTag(context);
        tuxTag.setId(R.id.rsc);
        tuxTag.setText(2131850346);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-2, (int) TypedValue.applyDimension(1, 22.0f, resources.getDisplayMetrics()), viewGroup);
        new b();
        b.LIZ("app:tux_tagSize", new a.c("large"), tuxTag);
        b.LIZ("app:tux_backgroundColor", new a.b("2131099768", "attr"), tuxTag);
        b.LIZ("app:tux_tagTextColor", new a.b("2131099754", "attr"), tuxTag);
        android.view.a.LIZ(tuxTag);
        C786410Ut5.W5(tuxTag, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(tuxTag);
        }
        return tuxTag;
    }
}
