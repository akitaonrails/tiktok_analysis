package com.by.andInflater;

import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class im_item_msg_text_big_emoji_content implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        context.getResources();
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setGravity(17);
        tuxTextView.setTextSize(1, 48.0f);
        tuxTextView.setId(R.id.omg);
        tuxTextView.setClickable(false);
        tuxTextView.setLongClickable(false);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-2, -2, viewGroup);
        new o();
        o.LIZ("app:tux_font", new a.c("H1_Bold"), tuxTextView);
        android.view.a.LIZ(tuxTextView);
        C786410Ut5.W5(tuxTextView, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(tuxTextView);
        }
        return tuxTextView;
    }
}
