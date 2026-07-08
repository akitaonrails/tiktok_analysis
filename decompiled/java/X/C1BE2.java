package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: X.1BE2, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BE2 {
    public static ExecutorService LIZ;

    public static void LIZ(C05F1 c05f1) {
        if (LIZ == null) {
            synchronized (C1BE2.class) {
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
        LIZ.execute(c05f1);
    }
}
