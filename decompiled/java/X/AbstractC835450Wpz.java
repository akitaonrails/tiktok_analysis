package X;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0Wpz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC835450Wpz<TResult> {
    public abstract C835510Wq5 LIZLLL(InterfaceC835730WqR interfaceC835730WqR);

    public abstract C835510Wq5 LJ(Executor executor, InterfaceC835730WqR interfaceC835730WqR);

    public abstract C835510Wq5 LJFF(InterfaceC835710WqP interfaceC835710WqP);

    public abstract C835510Wq5 LJI(Executor executor, InterfaceC835710WqP interfaceC835710WqP);

    public abstract Exception LJIIIZ();

    public abstract TResult LJIIJ();

    public abstract <X extends Throwable> TResult LJIIJJI(Class<X> cls);

    public abstract boolean LJIIL();

    public abstract boolean LJIILIIL();

    public abstract boolean LJIILJJIL();

    public AbstractC835450Wpz LJIILL() {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    public AbstractC835450Wpz<TResult> LIZIZ(InterfaceC834580Woa<TResult> interfaceC834580Woa) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public void LIZ(ExecutorC835500Wq4 executorC835500Wq4, InterfaceC835740WqS interfaceC835740WqS) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    public void LIZJ(Executor executor, InterfaceC834580Woa interfaceC834580Woa) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public <TContinuationResult> AbstractC835450Wpz<TContinuationResult> LJII(Executor executor, InterfaceC835680WqM<TResult, TContinuationResult> interfaceC835680WqM) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> AbstractC835450Wpz<TContinuationResult> LJIIIIZZ(Executor executor, InterfaceC835680WqM<TResult, AbstractC835450Wpz<TContinuationResult>> interfaceC835680WqM) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public <TContinuationResult> AbstractC835450Wpz<TContinuationResult> LJIILLIIL(Executor executor, InterfaceC835700WqO<TResult, TContinuationResult> interfaceC835700WqO) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
