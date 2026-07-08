package com.by.andInflater;

import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.LinearLayout;
import com.bytedance.tux.tag.TuxTag;
import com.zhiliaoapp.musically.R;
import dc.a;
import jem.b;

/* JADX INFO: loaded from: classes32.dex */
public class common_feed_layout_auto_dubbing_consumption_tag implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-2, -2, viewGroup);
        TuxTag tuxTag = new TuxTag(context);
        tuxTag.setId(R.id.bdu);
        tuxTag.setText(2131828762);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        new b();
        b.LIZ("app:tux_tagSize", new a.c("medium"), tuxTag);
        b.LIZ("app:tux_font", new a.c("SmallText1_Semibold"), tuxTag);
        b.LIZ("app:tux_tagTextColor", new a.b("2131100549", "attr"), tuxTag);
        b.LIZ("app:tux_backgroundColor", new a.b("2131099924", "attr"), tuxTag);
        android.view.a.LIZ(tuxTag);
        if (tuxTag.getParent() == null) {
            linearLayout.addView(tuxTag, layoutParams);
        }
        android.view.a.LIZ(linearLayout);
        C786410Ut5.W5(linearLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(linearLayout);
        }
        return linearLayout;
    }
}
