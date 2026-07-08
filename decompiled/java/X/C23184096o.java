package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.Future;

/* JADX INFO: renamed from: X.096o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C23184096o {
    public static <V> V LIZ(Future<V> future) {
        V v;
        boolean z = false;
        while (true) {
            try {
                try {
                    v = future.get();
                    break;
                } catch (InterruptedException e) {
                    TryCatchGuardChecker.doCheck(e);
                    z = true;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (z) {
                    C786410Ut5.u3().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            C786410Ut5.u3().interrupt();
        }
        return v;
    }
}
