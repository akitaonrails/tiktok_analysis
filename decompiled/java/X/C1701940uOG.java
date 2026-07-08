package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: X.0uOG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1701940uOG {
    public static final C11RO LIZ;

    static {
        try {
            C11RO c11ro = (C11RO) new Callable<C11RO>() { // from class: X.0uOH
                @Override // java.util.concurrent.Callable
                public final C11RO call() {
                    return C1701930uOF.LIZ;
                }
            }.call();
            if (c11ro == null) {
                throw new NullPointerException("Scheduler Callable returned null");
            }
            LIZ = c11ro;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw C11QG.LIZIZ(th);
        }
    }

    public static C11RO LIZIZ() {
        C11RO c11ro = LIZ;
        if (c11ro != null) {
            return c11ro;
        }
        throw new NullPointerException("scheduler == null");
    }

    public static C1701780uO0 LIZ(Looper looper) {
        if (looper != null) {
            return new C1701780uO0(new BPEAHandler(looper));
        }
        throw new NullPointerException("looper == null");
    }
}
