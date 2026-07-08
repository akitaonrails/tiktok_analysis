package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.1A2n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2172991A2n<T> {
    public static final Object LIZJ = new Object();
    public static Executor LIZLLL = null;
    public Executor LIZ;
    public final AbstractC339510DSr<T> LIZIZ;

    public final C2173011A2p<T> LIZ() {
        if (this.LIZ == null) {
            synchronized (LIZJ) {
                try {
                    if (LIZLLL == null) {
                        LIZLLL = C786410Ut5.d4(2);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            this.LIZ = LIZLLL;
        }
        return new C2173011A2p<>(this.LIZIZ, this.LIZ);
    }

    public C2172991A2n(AbstractC339510DSr<T> abstractC339510DSr) {
        this.LIZIZ = abstractC339510DSr;
    }
}
