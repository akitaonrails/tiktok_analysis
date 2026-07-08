package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Czx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C332030Czx {
    public final C0D0E LIZ() {
        C0D0E c0d0e = C0D0E.LJFF;
        if (c0d0e == null) {
            synchronized (this) {
                try {
                    c0d0e = C0D0E.LJFF;
                    if (c0d0e == null) {
                        c0d0e = new C0D0E(new C332000Czu());
                        C0D0E.LJFF = c0d0e;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return c0d0e;
    }
}
