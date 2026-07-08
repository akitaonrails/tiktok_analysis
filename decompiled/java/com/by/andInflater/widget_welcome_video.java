package com.by.andInflater;

import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.RelativeLayout;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.zhiliaoapp.musically.R;
import dc.a;

/* JADX INFO: loaded from: classes32.dex */
public class widget_welcome_video implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        context.getResources();
        RelativeLayout relativeLayout = new RelativeLayout(context);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -1, viewGroup);
        RelativeLayout relativeLayout2 = new RelativeLayout(context);
        relativeLayout2.setId(R.id.video_container);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        RemoteImageView remoteImageView = new RemoteImageView(context);
        remoteImageView.setId(R.id.cover);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        a.LIZ(remoteImageView);
        if (remoteImageView.getParent() == null) {
            relativeLayout2.addView(remoteImageView, layoutParams2);
        }
        a.LIZ(relativeLayout2);
        if (relativeLayout2.getParent() == null) {
            relativeLayout.addView(relativeLayout2, layoutParams);
        }
        RemoteImageView remoteImageView2 = new RemoteImageView(context);
        remoteImageView2.setId(R.id.w0e);
        C786410Ut5.LJZI(8, remoteImageView2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
        bc.a aVar = new bc.a();
        aVar.LIZLLL("fresco:actualImageScaleType", new a.c("fitCenter"), remoteImageView2);
        aVar.LIZJ(remoteImageView2);
        android.view.a.LIZ(remoteImageView2);
        if (remoteImageView2.getParent() == null) {
            relativeLayout.addView(remoteImageView2, layoutParams3);
        }
        android.view.a.LIZ(relativeLayout);
        C786410Ut5.W5(relativeLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(relativeLayout);
        }
        return relativeLayout;
    }
}
