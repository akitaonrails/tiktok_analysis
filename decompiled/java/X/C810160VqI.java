package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0VqI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C810160VqI {
    public static volatile C810160VqI LIZJ;
    public volatile C810190VqL LIZ;
    public volatile C810240VqQ LIZIZ;

    public static C810160VqI LIZ() {
        if (LIZJ == null) {
            synchronized (C810160VqI.class) {
                try {
                    if (LIZJ == null) {
                        LIZJ = new C810160VqI();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZJ;
    }

    public final InterfaceC810270VqT LIZIZ() {
        if (this.LIZ == null) {
            synchronized (this) {
                try {
                    if (this.LIZ == null) {
                        this.LIZ = new C810190VqL();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return this.LIZ;
    }
}
