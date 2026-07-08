package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.09ca, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2411009ca {
    public static volatile C2411009ca LIZIZ;
    public int LIZ;

    public static C2411009ca LIZ() {
        if (LIZIZ == null) {
            synchronized (C2411009ca.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new C2411009ca();
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
