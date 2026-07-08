package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11JL, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11JL<T> extends AtomicReference<InterfaceC420801kM> implements InterfaceC19474811He<T>, InterfaceC420801kM {
    public static final long serialVersionUID = -7012088219455310787L;
    public final C09JN<? super T> LL;
    public final C09JN<? super Throwable> LLILLJJLI;

    public boolean hasCustomOnError() {
        return this.LLILLJJLI != C19487811Me.LJFF;
    }

    @Override // X.InterfaceC420801kM
    public boolean isDisposed() {
        return get() == C11JE.DISPOSED;
    }

    @Override // X.InterfaceC420801kM
    public void dispose() {
        C11JE.dispose(this);
    }

    @Override // X.InterfaceC19474811He
    public void onError(Throwable th) throws Throwable {
        lazySet(C11JE.DISPOSED);
        try {
            this.LLILLJJLI.accept(th);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C11SP.LIZ(th2);
            C19489211Ms.LIZIZ(new C0VYA(th, th2));
        }
    }

    @Override // X.InterfaceC19474811He
    public void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        C11JE.setOnce(this, interfaceC420801kM);
    }

    @Override // X.InterfaceC19474811He
    public void onSuccess(T t) throws Throwable {
        lazySet(C11JE.DISPOSED);
        try {
            this.LL.accept(t);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C11SP.LIZ(th);
            C19489211Ms.LIZIZ(th);
        }
    }

    public C11JL(C09JN<? super T> c09jn, C09JN<? super Throwable> c09jn2) {
        this.LL = c09jn;
        this.LLILLJJLI = c09jn2;
    }
}
