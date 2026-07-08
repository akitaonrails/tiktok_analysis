package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0WqA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C835560WqA<TResult> implements InterfaceC835690WqN<TResult> {
    public final Executor LIZ;
    public final Object LIZIZ = new Object();
    public final InterfaceC834580Woa<TResult> LIZJ;

    @Override // X.InterfaceC835690WqN
    public final void LIZ(final AbstractC835450Wpz<TResult> abstractC835450Wpz) {
        synchronized (this.LIZIZ) {
            try {
                if (this.LIZJ == null) {
                    return;
                }
                this.LIZ.execute(new Runnable() { // from class: X.0WqJ
                    /* JADX WARN: Type inference incomplete: some casts might be missing */
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("zzj@3085.run");
                        try {
                            synchronized (this.LLILLJJLI.LIZIZ) {
                                try {
                                    InterfaceC834580Woa<TResult> interfaceC834580Woa = this.LLILLJJLI.LIZJ;
                                    if (interfaceC834580Woa != 0) {
                                        interfaceC834580Woa.LIZ((AbstractC835450Wpz<TResult>) abstractC835450Wpz);
                                    }
                                } finally {
                                }
                            }
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("zzj@3085.run");
                    }
                });
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public C835560WqA(Executor executor, InterfaceC834580Woa<TResult> interfaceC834580Woa) {
        this.LIZ = executor;
        this.LIZJ = interfaceC834580Woa;
    }
}
