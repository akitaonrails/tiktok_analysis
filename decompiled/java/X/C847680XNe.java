package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0XNe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C847680XNe {
    public static volatile C847680XNe LIZIZ;
    public C847780XNo LIZ;

    public static C847680XNe LIZ() {
        if (LIZIZ == null) {
            synchronized (C847680XNe.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new C847680XNe();
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
