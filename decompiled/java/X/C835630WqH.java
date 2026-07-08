package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0WqH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C835630WqH<TResult, TContinuationResult> implements InterfaceC835690WqN<TResult> {
    public final Executor LIZ;
    public final InterfaceC835680WqM<TResult, TContinuationResult> LIZIZ;
    public final C835510Wq5<TContinuationResult> LIZJ;

    @Override // X.InterfaceC835690WqN
    public final void LIZ(final AbstractC835450Wpz<TResult> abstractC835450Wpz) {
        this.LIZ.execute(new Runnable() { // from class: X.0WqI
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            public final void LIZ() {
                if (abstractC835450Wpz.LJIIL()) {
                    this.LLILLJJLI.LIZJ.LJIJI();
                    return;
                }
                try {
                    this.LLILLJJLI.LIZJ.LJIJ((TContinuationResult) this.LLILLJJLI.LIZIZ.LIZ((AbstractC835450Wpz<TResult>) abstractC835450Wpz));
                } catch (C835720WqQ e) {
                    TryCatchGuardChecker.doCheck(e);
                    if (e.getCause() instanceof Exception) {
                        this.LLILLJJLI.LIZJ.LJIIZILJ((Exception) e.getCause());
                    } else {
                        this.LLILLJJLI.LIZJ.LJIIZILJ(e);
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    this.LLILLJJLI.LIZJ.LJIIZILJ(e2);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("zzd@308b.run");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("zzd@308b.run");
            }
        });
    }

    public C835630WqH(Executor executor, InterfaceC835680WqM<TResult, TContinuationResult> interfaceC835680WqM, C835510Wq5<TContinuationResult> c835510Wq5) {
        this.LIZ = executor;
        this.LIZIZ = interfaceC835680WqM;
        this.LIZJ = c835510Wq5;
    }
}
