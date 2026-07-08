package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0cnT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1025650cnT {
    public final C1034340d1U LIZ() {
        C1034340d1U c1034340d1U = C1034340d1U.LJ;
        if (c1034340d1U == null) {
            synchronized (this) {
                try {
                    c1034340d1U = C1034340d1U.LJ;
                    if (c1034340d1U == null) {
                        c1034340d1U = new C1034340d1U();
                        C1034340d1U.LJ = c1034340d1U;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return c1034340d1U;
    }
}
