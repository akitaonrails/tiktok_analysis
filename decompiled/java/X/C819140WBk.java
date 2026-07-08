package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0WBk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C819140WBk {
    public final boolean LIZ;
    public final InterfaceC819160WBm LIZIZ;

    public C819140WBk(Context context) {
        try {
            C819200WBq.LIZIZ(context);
            this.LIZIZ = C819200WBq.LIZ().LIZJ(C819190WBp.LJ).LIZ("PLAY_BILLING_LIBRARY", new C814570VxP("proto"), new C0WC0() { // from class: X.0WBn
                @Override // X.C0WC0
                public final Object apply(Object obj) {
                    return ((AbstractC19900712th) obj).LIZIZ();
                }
            });
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZ = true;
        }
    }

    public final void LIZ(C1BB0 c1bb0) {
        if (this.LIZ) {
            return;
        }
        try {
            this.LIZIZ.LIZ(new C818650W9n(null, c1bb0, EnumC816340W0q.DEFAULT));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
