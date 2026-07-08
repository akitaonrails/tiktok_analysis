package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0VTG, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VTG {
    public static volatile C0VTG LIZIZ;
    public boolean LIZ;

    public static C0VTG LIZ() {
        if (LIZIZ == null) {
            synchronized (C0VTG.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new C0VTG();
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
