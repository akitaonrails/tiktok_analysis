package com.by.andInflater;

import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import dc.a;

/* JADX INFO: loaded from: classes32.dex */
public class im_item_msg_gif_content_slot implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        RemoteImageView remoteImageView = new RemoteImageView(context);
        remoteImageView.setId(R.id.qfn);
        remoteImageView.setBackgroundColor(resources.getColor(R.color.dr));
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ((int) TypedValue.applyDimension(1, 120.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 120.0f, resources.getDisplayMetrics()), viewGroup);
        bc.a aVar = new bc.a();
        aVar.LIZLLL("app:roundWithOverlayColor", new a.b("2131099676", "attr"), remoteImageView);
        aVar.LIZLLL("app:roundedCornerRadius", new a.b("2131296290", "dimen"), remoteImageView);
        aVar.LIZLLL("app:roundingBorderWidth", new a.d(CardStruct.IStatusCode.DEFAULT, "dp"), remoteImageView);
        aVar.LIZLLL("fresco:actualImageScaleType", new a.c("fitCenter"), remoteImageView);
        aVar.LIZJ(remoteImageView);
        android.view.a.LIZ(remoteImageView);
        C786410Ut5.W5(remoteImageView, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(remoteImageView);
        }
        return remoteImageView;
    }
}
