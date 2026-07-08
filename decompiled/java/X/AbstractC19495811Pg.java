package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: X.11Pg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public abstract class AbstractC19495811Pg<T> extends AtomicLong implements C09AK<T>, C11LR {
    public static final long serialVersionUID = 7326289992464377023L;
    public final C11M9<? super T> LL;
    public final C19484811La LLILLJJLI = new C19484811La();

    public void LIZJ() {
    }

    public void LIZLLL() {
    }

    @Override // X.InterfaceC947803nA
    public abstract /* synthetic */ void onNext(T t);

    @Override // java.util.concurrent.atomic.AtomicLong
    public String toString() {
        return C786410Ut5.j4("%s{%s}", new Object[]{getClass().getSimpleName(), super.toString()});
    }

    @Override // X.C11LR
    public final void cancel() {
        this.LLILLJJLI.dispose();
        LIZLLL();
    }

    public final boolean isCancelled() {
        return this.LLILLJJLI.isDisposed();
    }

    public final C09AK<T> serialize() {
        return new C19495911Ph(this);
    }

    public final void LIZ() {
        if (isCancelled()) {
            return;
        }
        try {
            this.LL.onComplete();
            this.LLILLJJLI.dispose();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLILLJJLI.dispose();
            throw th;
        }
    }

    public final long requested() {
        return get();
    }

    @Override // X.InterfaceC947803nA
    public void onComplete() {
        LIZ();
    }

    public AbstractC19495811Pg(C11M9<? super T> c11m9) {
        this.LL = c11m9;
    }

    public final boolean LIZIZ(Throwable th) {
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        if (isCancelled()) {
            return false;
        }
        try {
            this.LL.onError(th);
            this.LLILLJJLI.dispose();
            return true;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            this.LLILLJJLI.dispose();
            throw th2;
        }
    }

    @Override // X.InterfaceC947803nA
    public final void onError(Throwable th) {
        if (!tryOnError(th)) {
            C19489211Ms.LIZIZ(th);
        }
    }

    @Override // X.C11LR
    public final void request(long j) {
        if (C11NC.validate(j)) {
            C19492311Nx.LIZ(this, j);
            LIZJ();
        }
    }

    public final void setCancellable(C11KX c11kx) {
        setDisposable(new C11KW(c11kx));
    }

    public final void setDisposable(InterfaceC420801kM interfaceC420801kM) {
        this.LLILLJJLI.update(interfaceC420801kM);
    }

    public boolean tryOnError(Throwable th) {
        return LIZIZ(th);
    }
}
