package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0bsB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C990130bsB {
    public static C990120bsA LIZ() {
        if (C990120bsA.LIZIZ == null) {
            synchronized (C990120bsA.class) {
                try {
                    if (C990120bsA.LIZIZ == null) {
                        C990120bsA.LIZIZ = new C990120bsA();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return C990120bsA.LIZIZ;
    }
}
