package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0WqF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C835610WqF<TResult, TContinuationResult> implements InterfaceC835740WqS, InterfaceC835730WqR, InterfaceC835710WqP<TContinuationResult>, InterfaceC835690WqN<TResult> {
    public final Executor LIZ;
    public final InterfaceC835680WqM<TResult, AbstractC835450Wpz<TContinuationResult>> LIZIZ;
    public final C835510Wq5<TContinuationResult> LIZJ;

    @Override // X.InterfaceC835740WqS
    public final void onCanceled() {
        this.LIZJ.LJIJI();
    }

    @Override // X.InterfaceC835690WqN
    public final void LIZ(final AbstractC835450Wpz<TResult> abstractC835450Wpz) {
        this.LIZ.execute(new Runnable() { // from class: X.0WqG
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            public final void LIZ() {
                try {
                    AbstractC835450Wpz abstractC835450WpzLIZ = this.LLILLJJLI.LIZIZ.LIZ((AbstractC835450Wpz<TResult>) abstractC835450Wpz);
                    if (abstractC835450WpzLIZ == null) {
                        this.LLILLJJLI.onFailure(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    ExecutorC835500Wq4 executorC835500Wq4 = C835490Wq3.LIZIZ;
                    abstractC835450WpzLIZ.LJI(executorC835500Wq4, this.LLILLJJLI);
                    abstractC835450WpzLIZ.LJ(executorC835500Wq4, this.LLILLJJLI);
                    abstractC835450WpzLIZ.LIZ(executorC835500Wq4, this.LLILLJJLI);
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
                C1C7U.LIZ("zzf@3089.run");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("zzf@3089.run");
            }
        });
    }

    @Override // X.InterfaceC835730WqR
    public final void onFailure(Exception exc) {
        this.LIZJ.LJIIZILJ(exc);
    }

    @Override // X.InterfaceC835710WqP
    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.LIZJ.LJIJ(tcontinuationresult);
    }

    public C835610WqF(Executor executor, InterfaceC835680WqM<TResult, AbstractC835450Wpz<TContinuationResult>> interfaceC835680WqM, C835510Wq5<TContinuationResult> c835510Wq5) {
        this.LIZ = executor;
        this.LIZIZ = interfaceC835680WqM;
        this.LIZJ = c835510Wq5;
    }
}
