package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11JI, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11JI<T> extends AtomicReference<InterfaceC420801kM> implements C11IH<T>, InterfaceC420801kM {
    public static final long serialVersionUID = -6076952298809384986L;
    public final C09JN<? super T> LL;
    public final C09JN<? super Throwable> LLILLJJLI;
    public final InterfaceC781210Ukh LLILLL;

    public boolean hasCustomOnError() {
        return this.LLILLJJLI != C19487811Me.LJFF;
    }

    @Override // X.C11IH
    public void onComplete() throws Throwable {
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
    public boolean isDisposed() {
        return C11JE.isDisposed(get());
    }

    @Override // X.InterfaceC420801kM
    public void dispose() {
        C11JE.dispose(this);
    }

    @Override // X.C11IH
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

    @Override // X.C11IH
    public void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        C11JE.setOnce(this, interfaceC420801kM);
    }

    @Override // X.C11IH
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

    public C11JI(C09JN<? super T> c09jn, C09JN<? super Throwable> c09jn2, InterfaceC781210Ukh interfaceC781210Ukh) {
        this.LL = c09jn;
        this.LLILLJJLI = c09jn2;
        this.LLILLL = interfaceC781210Ukh;
    }
}
