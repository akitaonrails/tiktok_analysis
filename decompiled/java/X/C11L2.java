package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11L2, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11L2<T> extends AtomicReference<InterfaceC420801kM> implements InterfaceC19474811He<T>, InterfaceC420801kM {
    public static final long serialVersionUID = 4943102778943297569L;
    public final C11L5<? super T, ? super Throwable> LL;

    @Override // X.InterfaceC420801kM
    public boolean isDisposed() {
        return get() == C11JE.DISPOSED;
    }

    @Override // X.InterfaceC420801kM
    public void dispose() {
        C11JE.dispose(this);
    }

    public C11L2(C11L5<? super T, ? super Throwable> c11l5) {
        this.LL = c11l5;
    }

    @Override // X.InterfaceC19474811He
    public void onError(Throwable th) throws Throwable {
        try {
            lazySet(C11JE.DISPOSED);
            this.LL.accept(null, th);
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
        try {
            lazySet(C11JE.DISPOSED);
            this.LL.accept(t, null);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C11SP.LIZ(th);
            C19489211Ms.LIZIZ(th);
        }
    }
}
