package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0WG6, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WG6 {
    public final C0WG5 LIZ(Context context) {
        C0WG5 c0wg5;
        C0WG5 c0wg52 = C0WG5.LIZJ;
        if (c0wg52 != null) {
            return c0wg52;
        }
        synchronized (this) {
            try {
                c0wg5 = C0WG5.LIZJ;
                if (c0wg5 == null) {
                    c0wg5 = new C0WG5(context);
                    C0WG5.LIZJ = c0wg5;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c0wg5;
    }
}
