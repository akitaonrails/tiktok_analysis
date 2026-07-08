package com.by.andInflater;

import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import com.ss.android.ugc.aweme.im.common.view.IMSystemMsgTextView;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class im_item_date_view_holder implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        context.getResources();
        IMSystemMsgTextView iMSystemMsgTextView = new IMSystemMsgTextView(context, null, 6);
        iMSystemMsgTextView.setId(R.id.ome);
        iMSystemMsgTextView.setGravity(17);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1k});
        iMSystemMsgTextView.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        C786410Ut5.LJLLLLLL(8, iMSystemMsgTextView);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -2, viewGroup);
        new o();
        o.LIZ("app:tux_font", new a.c("P3_Regular"), iMSystemMsgTextView);
        android.view.a.LIZ(iMSystemMsgTextView);
        C786410Ut5.W5(iMSystemMsgTextView, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(iMSystemMsgTextView);
        }
        return iMSystemMsgTextView;
    }
}
