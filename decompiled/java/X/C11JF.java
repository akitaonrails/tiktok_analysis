package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11JF, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11JF<T> extends AtomicReference<InterfaceC420801kM> implements InterfaceC626120Oh8<T>, InterfaceC420801kM {
    public static final long serialVersionUID = -7251123623727029452L;
    public final C09JN<? super T> LL;
    public final C09JN<? super Throwable> LLILLJJLI;
    public final InterfaceC781210Ukh LLILLL;
    public final C09JN<? super InterfaceC420801kM> LLILZ;

    public boolean hasCustomOnError() {
        return this.LLILLJJLI != C19487811Me.LJFF;
    }

    @Override // X.InterfaceC420801kM
    public boolean isDisposed() {
        return get() == C11JE.DISPOSED;
    }

    @Override // X.InterfaceC626120Oh8
    public void onComplete() throws Throwable {
        if (isDisposed()) {
            return;
        }
        lazySet(C11JE.DISPOSED);
        try {
            this.LLILLL.run();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C11SP.LIZ(th);
            C19489211Ms.LIZIZ(th);
        }
    }

    @Override // X.InterfaceC420801kM
    public void dispose() {
        C11JE.dispose(this);
    }

    @Override // X.InterfaceC626120Oh8
    public void onError(Throwable th) throws Throwable {
        if (!isDisposed()) {
            lazySet(C11JE.DISPOSED);
            try {
                this.LLILLJJLI.accept(th);
                return;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C11SP.LIZ(th2);
                C19489211Ms.LIZIZ(new C0VYA(th, th2));
                return;
            }
        }
        C19489211Ms.LIZIZ(th);
    }

    @Override // X.InterfaceC626120Oh8
    public void onNext(T t) throws Throwable {
        if (!isDisposed()) {
            try {
                this.LL.accept(t);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C11SP.LIZ(th);
                get().dispose();
                onError(th);
            }
        }
    }

    @Override // X.InterfaceC626120Oh8
    public void onSubscribe(InterfaceC420801kM interfaceC420801kM) throws Throwable {
        if (C11JE.setOnce(this, interfaceC420801kM)) {
            try {
                this.LLILZ.accept(this);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C11SP.LIZ(th);
                interfaceC420801kM.dispose();
                onError(th);
            }
        }
    }

    public C11JF(C09JN<? super T> c09jn, C09JN<? super Throwable> c09jn2, InterfaceC781210Ukh interfaceC781210Ukh, C09JN<? super InterfaceC420801kM> c09jn3) {
        this.LL = c09jn;
        this.LLILLJJLI = c09jn2;
        this.LLILLL = interfaceC781210Ukh;
        this.LLILZ = c09jn3;
    }
}
