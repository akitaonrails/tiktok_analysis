package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Closeable;

/* JADX INFO: renamed from: X.08Nh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2107108Nh {
    public static final void LIZ(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C13SZ.LIZ(th, th2);
            }
        }
    }
}
