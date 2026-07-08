package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0Wq8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C835540Wq8<TResult> implements InterfaceC835690WqN<TResult> {
    public final Executor LIZ;
    public final Object LIZIZ = new Object();
    public final InterfaceC835710WqP<? super TResult> LIZJ;

    @Override // X.InterfaceC835690WqN
    public final void LIZ(final AbstractC835450Wpz<TResult> abstractC835450Wpz) {
        if (abstractC835450Wpz.LJIILJJIL()) {
            synchronized (this.LIZIZ) {
                try {
                    if (this.LIZJ == null) {
                        return;
                    }
                    this.LIZ.execute(new Runnable() { // from class: X.0WqK
                        /* JADX WARN: Type inference incomplete: some casts might be missing */
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("zzn@3081.run");
                            try {
                                synchronized (this.LLILLJJLI.LIZIZ) {
                                    try {
                                        InterfaceC835710WqP<? super TResult> interfaceC835710WqP = this.LLILLJJLI.LIZJ;
                                        if (interfaceC835710WqP != 0) {
                                            interfaceC835710WqP.onSuccess((Object) abstractC835450Wpz.LJIIJ());
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
                            C1C7U.LIZIZ("zzn@3081.run");
                        }
                    });
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public C835540Wq8(Executor executor, InterfaceC835710WqP<? super TResult> interfaceC835710WqP) {
        this.LIZ = executor;
        this.LIZJ = interfaceC835710WqP;
    }
}
