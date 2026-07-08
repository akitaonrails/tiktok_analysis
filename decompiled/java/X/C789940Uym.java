package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.chromium.CronetSystemApiSandbox;

/* JADX INFO: renamed from: X.0Uym, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C789940Uym {
    public static volatile C789940Uym LIZIZ;
    public CronetSystemApiSandbox LIZ;

    public static C789940Uym LIZ() {
        if (LIZIZ == null) {
            synchronized (C789940Uym.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new C789940Uym();
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
