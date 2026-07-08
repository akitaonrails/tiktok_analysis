package com.by.andInflater;

import X.C1749280vcc;
import X.C19ME;
import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public class story_assem_story_arch_list implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        context.getResources();
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(R.id.b9v);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -1, viewGroup);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = new ViewOnAttachStateChangeListenerC20604515jv(context, null);
        viewOnAttachStateChangeListenerC20604515jv.setId(R.id.w9f);
        C786410Ut5.LJLLLLLL(8, viewOnAttachStateChangeListenerC20604515jv);
        C19ME c19me = new C19ME(-1, -1);
        a.LIZ(viewOnAttachStateChangeListenerC20604515jv);
        if (viewOnAttachStateChangeListenerC20604515jv.getParent() == null) {
            constraintLayout.addView(viewOnAttachStateChangeListenerC20604515jv, c19me);
        }
        C1749280vcc c1749280vcc = new C1749280vcc(context);
        c1749280vcc.setId(R.id.w28);
        C19ME c19me2 = new C19ME(-1, -1);
        a.LIZ(c1749280vcc);
        if (c1749280vcc.getParent() == null) {
            constraintLayout.addView(c1749280vcc, c19me2);
        }
        a.LIZ(constraintLayout);
        C786410Ut5.W5(constraintLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(constraintLayout);
        }
        return constraintLayout;
    }
}
