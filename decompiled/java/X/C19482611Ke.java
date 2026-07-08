package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11Ke, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19482611Ke<T> extends AtomicReference<InterfaceC420801kM> implements C09AJ<T>, InterfaceC420801kM {
    public static final long serialVersionUID = -3434801548987643227L;
    public final InterfaceC626120Oh8<? super T> LL;

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        return C786410Ut5.j4("%s{%s}", new Object[]{C19482611Ke.class.getSimpleName(), super.toString()});
    }

    public C09AJ<T> serialize() {
        return new C19495711Pf(this);
    }

    @Override // X.C09AJ, X.InterfaceC420801kM
    public boolean isDisposed() {
        return C11JE.isDisposed(get());
    }

    @Override // X.InterfaceC947803nA
    public void onComplete() {
        if (isDisposed()) {
            return;
        }
        try {
            this.LL.onComplete();
            dispose();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            dispose();
            throw th;
        }
    }

    @Override // X.InterfaceC420801kM
    public void dispose() {
        C11JE.dispose(this);
    }

    public C19482611Ke(InterfaceC626120Oh8<? super T> interfaceC626120Oh8) {
        this.LL = interfaceC626120Oh8;
    }

    @Override // X.InterfaceC947803nA
    public void onError(Throwable th) {
        if (!tryOnError(th)) {
            C19489211Ms.LIZIZ(th);
        }
    }

    @Override // X.InterfaceC947803nA
    public void onNext(T t) {
        if (t == null) {
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
        } else if (!isDisposed()) {
            this.LL.onNext(t);
        }
    }

    @Override // X.C09AJ
    public void setCancellable(C11KX c11kx) {
        setDisposable(new C11KW(c11kx));
    }

    @Override // X.C09AJ
    public void setDisposable(InterfaceC420801kM interfaceC420801kM) {
        C11JE.set(this, interfaceC420801kM);
    }

    @Override // X.C09AJ
    public boolean tryOnError(Throwable th) {
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        if (!isDisposed()) {
            try {
                this.LL.onError(th);
                dispose();
                return true;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                dispose();
                throw th2;
            }
        }
        return false;
    }
}
