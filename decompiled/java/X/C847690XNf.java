package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0XNf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C847690XNf {
    public static volatile C847690XNf LIZIZ;
    public C847820XNs LIZ;

    public static C847690XNf LIZ() {
        if (LIZIZ == null) {
            synchronized (C847690XNf.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new C847690XNf();
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
