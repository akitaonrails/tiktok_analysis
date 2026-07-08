package X;

import Y.ARunnableS76S0200000_7;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0J0u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C485140J0u<T> {
    public final int LIZ;
    public final AbstractC470910IdN LIZIZ;
    public final AbstractC485160J0w<T> LIZJ;
    public Executor LJ;
    public final Object LIZLLL = new Object();
    public boolean LJFF = false;

    public final boolean LIZ() {
        if (!this.LIZIZ.LJ()) {
            return false;
        }
        LIZIZ(C0J10.LJFF);
        return true;
    }

    public final void LIZIZ(C0J10<T> c0j10) {
        Executor executor;
        synchronized (this.LIZLLL) {
            try {
                if (!this.LJFF) {
                    this.LJFF = true;
                    executor = this.LJ;
                } else {
                    throw new IllegalStateException("callback.onResult already called, cannot call again.");
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (executor != null) {
            executor.execute(new ARunnableS76S0200000_7(c0j10, this, 45));
        } else {
            this.LIZJ.LIZ(this.LIZ, c0j10);
        }
    }

    public C485140J0u(AbstractC470910IdN abstractC470910IdN, int i, Executor executor, AbstractC485160J0w<T> abstractC485160J0w) {
        this.LIZIZ = abstractC470910IdN;
        this.LIZ = i;
        this.LJ = executor;
        this.LIZJ = abstractC485160J0w;
    }
}
