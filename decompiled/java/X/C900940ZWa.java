package X;

import android.content.Context;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0ZWa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C900940ZWa extends FrameLayout {
    public AnonymousClass0956 LL;
    public String LLILLJJLI;

    public C900940ZWa(Context context) {
        super(context, null, 0);
        C1295960jpS c1295960jpS = new C1295960jpS(context);
        c1295960jpS.setContentDescription(null);
        addView(c1295960jpS, new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(220)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(220)), 17));
        c1295960jpS.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC913900ZtE(this, c1295960jpS, 1));
    }

    public final void setMessageUuid(String str) {
        this.LLILLJJLI = str;
    }
}
