package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11I7, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11I7<T> extends AtomicReference<InterfaceC420801kM> implements InterfaceC19474811He<T>, Runnable, InterfaceC420801kM {
    public static final long serialVersionUID = 37497744973048446L;
    public final InterfaceC19474811He<? super T> LL;
    public final AtomicReference<InterfaceC420801kM> LLILLJJLI = new AtomicReference<>();
    public final C11I3<T> LLILLL;
    public InterfaceC19473011Gm<? extends T> LLILZ;
    public final long LLILZIL;
    public final TimeUnit LLILZLL;

    public final void LIZ() {
        InterfaceC420801kM interfaceC420801kM = get();
        C11JE c11je = C11JE.DISPOSED;
        if (interfaceC420801kM == c11je || !compareAndSet(interfaceC420801kM, c11je)) {
            return;
        }
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
        }
        InterfaceC19473011Gm<? extends T> interfaceC19473011Gm = this.LLILZ;
        if (interfaceC19473011Gm == null) {
            this.LL.onError(new TimeoutException(C11QG.LIZ(this.LLILZIL, this.LLILZLL)));
        } else {
            this.LLILZ = null;
            interfaceC19473011Gm.LIZ(this.LLILLL);
        }
    }

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        C11JE.dispose(this);
        C11JE.dispose(this.LLILLJJLI);
        C11I3<T> c11i3 = this.LLILLL;
        if (c11i3 != null) {
            C11JE.dispose(c11i3);
        }
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return C11JE.isDisposed(get());
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            LIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    @Override // X.InterfaceC19474811He
    public final void onError(Throwable th) {
        InterfaceC420801kM interfaceC420801kM = get();
        C11JE c11je = C11JE.DISPOSED;
        if (interfaceC420801kM != c11je && compareAndSet(interfaceC420801kM, c11je)) {
            C11JE.dispose(this.LLILLJJLI);
            this.LL.onError(th);
        } else {
            C19489211Ms.LIZIZ(th);
        }
    }

    @Override // X.InterfaceC19474811He
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        C11JE.setOnce(this, interfaceC420801kM);
    }

    @Override // X.InterfaceC19474811He
    public final void onSuccess(T t) {
        InterfaceC420801kM interfaceC420801kM = get();
        C11JE c11je = C11JE.DISPOSED;
        if (interfaceC420801kM != c11je && compareAndSet(interfaceC420801kM, c11je)) {
            C11JE.dispose(this.LLILLJJLI);
            this.LL.onSuccess(t);
        }
    }

    public C11I7(InterfaceC19474811He<? super T> interfaceC19474811He, InterfaceC19473011Gm<? extends T> interfaceC19473011Gm, long j, TimeUnit timeUnit) {
        this.LL = interfaceC19474811He;
        this.LLILZ = interfaceC19473011Gm;
        this.LLILZIL = j;
        this.LLILZLL = timeUnit;
        if (interfaceC19473011Gm != null) {
            this.LLILLL = new C11I3<>(interfaceC19474811He);
        } else {
            this.LLILLL = null;
        }
    }
}
