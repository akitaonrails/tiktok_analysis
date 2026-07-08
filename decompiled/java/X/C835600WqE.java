package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0WqE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C835600WqE<TResult, TContinuationResult> implements InterfaceC835740WqS, InterfaceC835730WqR, InterfaceC835710WqP<TContinuationResult>, InterfaceC835690WqN<TResult> {
    public final Executor LIZ;
    public final InterfaceC835700WqO<TResult, TContinuationResult> LIZIZ;
    public final C835510Wq5<TContinuationResult> LIZJ;

    @Override // X.InterfaceC835740WqS
    public final void onCanceled() {
        this.LIZJ.LJIJI();
    }

    @Override // X.InterfaceC835690WqN
    public final void LIZ(final AbstractC835450Wpz<TResult> abstractC835450Wpz) {
        this.LIZ.execute(new Runnable() { // from class: X.0WqD
            public final void LIZ() {
                try {
                    C835510Wq5 c835510Wq5Then = this.LLILLJJLI.LIZIZ.then(abstractC835450Wpz.LJIIJ());
                    if (c835510Wq5Then == null) {
                        this.LLILLJJLI.onFailure(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    ExecutorC835500Wq4 executorC835500Wq4 = C835490Wq3.LIZIZ;
                    c835510Wq5Then.LJI(executorC835500Wq4, this.LLILLJJLI);
                    c835510Wq5Then.LJ(executorC835500Wq4, this.LLILLJJLI);
                    c835510Wq5Then.LIZ(executorC835500Wq4, this.LLILLJJLI);
                } catch (C835720WqQ e) {
                    TryCatchGuardChecker.doCheck(e);
                    if (e.getCause() instanceof Exception) {
                        this.LLILLJJLI.onFailure((Exception) e.getCause());
                    } else {
                        this.LLILLJJLI.onFailure(e);
                    }
                } catch (CancellationException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    this.LLILLJJLI.onCanceled();
                } catch (Exception e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    this.LLILLJJLI.onFailure(e3);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("zzp@307f.run");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("zzp@307f.run");
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

    public C835600WqE(Executor executor, InterfaceC835700WqO<TResult, TContinuationResult> interfaceC835700WqO, C835510Wq5<TContinuationResult> c835510Wq5) {
        this.LIZ = executor;
        this.LIZIZ = interfaceC835700WqO;
        this.LIZJ = c835510Wq5;
    }
}
