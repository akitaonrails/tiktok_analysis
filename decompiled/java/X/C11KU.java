package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11KU, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11KU extends AtomicReference<InterfaceC420801kM> implements InterfaceC512380K7o, InterfaceC420801kM {
    public static final long serialVersionUID = -2467358622224974244L;
    public final C11IY LL;

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        return C786410Ut5.j4("%s{%s}", new Object[]{C11KU.class.getSimpleName(), super.toString()});
    }

    @Override // X.InterfaceC420801kM
    public boolean isDisposed() {
        return C11JE.isDisposed(get());
    }

    public void onComplete() {
        InterfaceC420801kM andSet;
        InterfaceC420801kM interfaceC420801kM = get();
        C11JE c11je = C11JE.DISPOSED;
        if (interfaceC420801kM == c11je || (andSet = getAndSet(c11je)) == c11je) {
            return;
        }
        try {
            this.LL.onComplete();
            if (andSet != null) {
                andSet.dispose();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (andSet != null) {
                andSet.dispose();
            }
            throw th;
        }
    }

    @Override // X.InterfaceC420801kM
    public void dispose() {
        C11JE.dispose(this);
    }

    public C11KU(C11IY c11iy) {
        this.LL = c11iy;
    }

    public void onError(Throwable th) {
        if (!tryOnError(th)) {
            C19489211Ms.LIZIZ(th);
        }
    }

    public void setCancellable(C11KX c11kx) {
        setDisposable(new C11KW(c11kx));
    }

    public void setDisposable(InterfaceC420801kM interfaceC420801kM) {
        C11JE.set(this, interfaceC420801kM);
    }

    public boolean tryOnError(Throwable th) {
        InterfaceC420801kM andSet;
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        InterfaceC420801kM interfaceC420801kM = get();
        C11JE c11je = C11JE.DISPOSED;
        if (interfaceC420801kM != c11je && (andSet = getAndSet(c11je)) != c11je) {
            try {
                this.LL.onError(th);
                if (andSet != null) {
                    andSet.dispose();
                    return true;
                }
                return true;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                if (andSet != null) {
                    andSet.dispose();
                }
                throw th2;
            }
        }
        return false;
    }
}
