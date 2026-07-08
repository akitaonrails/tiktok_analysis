package X;

import Y.ARunnableS92S0200000_23;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0pYE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1515920pYE {
    public final Function2<byte[], String, Unit> LIZ;
    public final String LIZIZ;
    public final Object LIZJ = new Object();
    public final AtomicBoolean LIZLLL = new AtomicBoolean(false);
    public ExecutorService LJ;

    public final void LIZ() {
        if (this.LIZLLL.compareAndSet(false, true)) {
            synchronized (this.LIZJ) {
                try {
                    ExecutorService executorService = this.LJ;
                    if (executorService != null) {
                        executorService.shutdown();
                    }
                    this.LJ = null;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public final void LIZIZ(byte[] bArr) {
        if (this.LIZLLL.get()) {
            return;
        }
        ExecutorService executorServiceLIZ = this.LJ;
        if (executorServiceLIZ == null) {
            synchronized (this.LIZJ) {
                try {
                    if (this.LIZLLL.get()) {
                        return;
                    }
                    executorServiceLIZ = this.LJ;
                    if (executorServiceLIZ == null) {
                        C2123408To c2123408ToLIZ = C2123508Tp.LIZ(C0WQX.SERIAL);
                        c2123408ToLIZ.LIZIZ = "ecom-chunk-hook";
                        executorServiceLIZ = C823050WQl.LIZ(c2123408ToLIZ.LIZ());
                        this.LJ = executorServiceLIZ;
                    }
                    if (executorServiceLIZ == null) {
                        return;
                    }
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }
        try {
            executorServiceLIZ.submit(new ARunnableS92S0200000_23(this, bArr, 125));
        } catch (RejectedExecutionException th) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1515920pYE(Function2<? super byte[], ? super String, Unit> function2, String str) {
        this.LIZ = function2;
        this.LIZIZ = str;
    }
}
