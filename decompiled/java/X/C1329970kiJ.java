package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: X.0kiJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1329970kiJ {
    public static volatile ExecutorService LIZ;

    public static ExecutorService LIZ() {
        if (LIZ == null) {
            synchronized (C1329970kiJ.class) {
                try {
                    if (LIZ == null) {
                        LIZ = C786410Ut5.h4();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZ;
    }
}
