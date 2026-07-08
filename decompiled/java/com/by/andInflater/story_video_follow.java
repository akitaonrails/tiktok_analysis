package com.by.andInflater;

import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.f;

/* JADX INFO: loaded from: classes32.dex */
public class story_video_follow implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -1, viewGroup);
        RelationButton relationButton = new RelationButton(new ContextThemeWrapper(context, R.style.xz));
        relationButton.setId(R.id.idt);
        relationButton.setText("Follow");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        new f();
        f.LIZ("app:tux_buttonCapsule", new a.c("true"), relationButton);
        android.view.a.LIZ(relationButton);
        if (relationButton.getParent() == null) {
            linearLayout.addView(relationButton, layoutParams);
        }
        android.view.a.LIZ(linearLayout);
        C786410Ut5.W5(linearLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(linearLayout);
        }
        return linearLayout;
    }
}
