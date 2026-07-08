package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0Wq9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C835550Wq9<TResult> implements InterfaceC835690WqN<TResult> {
    public final Executor LIZ;
    public final Object LIZIZ = new Object();
    public final InterfaceC835730WqR LIZJ;

    @Override // X.InterfaceC835690WqN
    public final void LIZ(final AbstractC835450Wpz<TResult> abstractC835450Wpz) {
        if (!abstractC835450Wpz.LJIILJJIL() && !abstractC835450Wpz.LJIIL()) {
            synchronized (this.LIZIZ) {
                try {
                    if (this.LIZJ == null) {
                        return;
                    }
                    this.LIZ.execute(new Runnable() { // from class: X.0WqB
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("zzl@3083.run");
                            try {
                                synchronized (this.LLILLJJLI.LIZIZ) {
                                    try {
                                        InterfaceC835730WqR interfaceC835730WqR = this.LLILLJJLI.LIZJ;
                                        if (interfaceC835730WqR != null) {
                                            interfaceC835730WqR.onFailure(abstractC835450Wpz.LJIIIZ());
                                        }
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        throw th;
                                    }
                                }
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("zzl@3083.run");
                        }
                    });
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public C835550Wq9(Executor executor, InterfaceC835730WqR interfaceC835730WqR) {
        this.LIZ = executor;
        this.LIZJ = interfaceC835730WqR;
    }
}
