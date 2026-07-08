package X;

import android.content.Context;

/* JADX INFO: renamed from: X.0hax, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1210090hax extends C21202017y6 {
    public final Integer LLIZLLLIL;

    @Override // android.view.View
    public final Integer getHeight() {
        return this.LLIZLLLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1210090hax(int i, Context context, Integer num) {
        super(context, null, 0);
        num = (i & 8) != 0 ? null : num;
        this.LLIZLLLIL = num;
        if (num != null) {
            C19ME c19me = new C19ME(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(num)));
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setLayoutParams(c19me);
        }
    }
}
