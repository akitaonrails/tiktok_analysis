package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0jtl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1298630jtl {
    public static final C1298620jtk LIZ(Context context) {
        C1298620jtk c1298620jtk;
        C1298640jtm c1298640jtm = C1298620jtk.LIZJ;
        Context contextN3 = C786410Ut5.N3(context);
        C1298620jtk c1298620jtk2 = C1298620jtk.LIZLLL;
        if (c1298620jtk2 == null) {
            synchronized (c1298640jtm) {
                try {
                    c1298620jtk = C1298620jtk.LIZLLL;
                    if (c1298620jtk == null) {
                        c1298620jtk = new C1298620jtk(contextN3);
                        C1298620jtk.LIZLLL = c1298620jtk;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return c1298620jtk;
        }
        return c1298620jtk2;
    }
}
