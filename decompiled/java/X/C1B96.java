package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.1B96, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1B96 {
    public AtomicReference<C1B97> LIZLLL;
    public int LJFF;
    public final C1B99 LIZ = new C1B99(0.05d);
    public volatile boolean LIZIZ = false;
    public final AtomicReference<C1B97> LIZJ = new AtomicReference<>(C1B97.UNKNOWN);
    public final List<InterfaceC2200011B8l> LJ = new CopyOnWriteArrayList();

    public final synchronized C1B97 LIZ() {
        C1B99 c1b99 = this.LIZ;
        if (c1b99 == null) {
            return C1B97.UNKNOWN;
        }
        try {
            double d = c1b99.LIZJ;
            return d < 0.0d ? C1B97.UNKNOWN : d < 150.0d ? C1B97.POOR : d < 550.0d ? C1B97.MODERATE : d < 2000.0d ? C1B97.GOOD : C1B97.EXCELLENT;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return C1B97.UNKNOWN;
        }
    }
}
