package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11Hx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class RunnableC19476711Hx<T> extends AtomicReference<InterfaceC420801kM> implements InterfaceC19474811He<T>, InterfaceC420801kM, Runnable {
    public static final long serialVersionUID = 3528003840217436037L;
    public final InterfaceC19474811He<? super T> LL;
    public final C11RO LLILLJJLI;
    public T LLILLL;
    public Throwable LLILZ;

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Throwable th = this.LLILZ;
            if (th != null) {
                this.LL.onError(th);
            } else {
                this.LL.onSuccess(this.LLILLL);
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            if (!C2179971ATj.LIZ(th2)) {
                throw th2;
            }
        }
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return C11JE.isDisposed(get());
    }

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        C11JE.dispose(this);
    }

    @Override // X.InterfaceC19474811He
    public final void onError(Throwable th) {
        this.LLILZ = th;
        C11JE.replace(this, this.LLILLJJLI.LIZIZ(this));
    }

    @Override // X.InterfaceC19474811He
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        if (C11JE.setOnce(this, interfaceC420801kM)) {
            this.LL.onSubscribe(this);
        }
    }

    @Override // X.InterfaceC19474811He
    public final void onSuccess(T t) {
        this.LLILLL = t;
        C11JE.replace(this, this.LLILLJJLI.LIZIZ(this));
    }

    public RunnableC19476711Hx(InterfaceC19474811He<? super T> interfaceC19474811He, C11RO c11ro) {
        this.LL = interfaceC19474811He;
        this.LLILLJJLI = c11ro;
    }
}
