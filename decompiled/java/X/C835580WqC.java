package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0WqC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C835580WqC<TResult> implements InterfaceC835690WqN<TResult> {
    public final Executor LIZ;
    public final Object LIZIZ = new Object();
    public final InterfaceC835740WqS LIZJ;

    @Override // X.InterfaceC835690WqN
    public final void LIZ(AbstractC835450Wpz abstractC835450Wpz) {
        if (abstractC835450Wpz.LJIIL()) {
            synchronized (this.LIZIZ) {
                try {
                    if (this.LIZJ == null) {
                        return;
                    }
                    this.LIZ.execute(new Runnable() { // from class: X.0WqL
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("zzh@3087.run");
                            try {
                                synchronized (this.LL.LIZIZ) {
                                    try {
                                        InterfaceC835740WqS interfaceC835740WqS = this.LL.LIZJ;
                                        if (interfaceC835740WqS != null) {
                                            interfaceC835740WqS.onCanceled();
                                        }
                                    } finally {
                                    }
                                }
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("zzh@3087.run");
                        }
                    });
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public C835580WqC(ExecutorC835500Wq4 executorC835500Wq4, InterfaceC835740WqS interfaceC835740WqS) {
        this.LIZ = executorC835500Wq4;
        this.LIZJ = interfaceC835740WqS;
    }
}
