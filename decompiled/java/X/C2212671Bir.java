package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: X.1Bir, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2212671Bir {
    public static volatile C2212671Bir LIZIZ;
    public volatile ExecutorService LIZ;

    public static C2212671Bir LIZ() {
        if (LIZIZ == null) {
            synchronized (C2212671Bir.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new C2212671Bir();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZIZ;
    }
}
