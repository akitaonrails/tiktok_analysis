package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11O7, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11O7<T> extends AtomicInteger implements InterfaceC626120Oh8<T>, InterfaceC420801kM, Runnable {
    public static final long serialVersionUID = -8296689127439125014L;
    public final InterfaceC626120Oh8<? super T> LL;
    public final long LLILLJJLI;
    public final TimeUnit LLILLL;
    public final C11RN LLILZ;
    public final boolean LLILZIL;
    public final AtomicReference<T> LLILZLL = new AtomicReference<>();
    public InterfaceC420801kM LLIZ;
    public volatile boolean LLIZLLLIL;
    public Throwable LLJ;
    public volatile boolean LLJI;
    public volatile boolean LLJIJIL;
    public boolean LLJILJIL;

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        this.LLJI = true;
        this.LLIZ.dispose();
        this.LLILZ.dispose();
        if (getAndIncrement() == 0) {
            this.LLILZLL.lazySet(null);
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onComplete() {
        this.LLIZLLLIL = true;
        LIZ();
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.LLJIJIL = true;
            LIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    public final void LIZ() {
        if (getAndIncrement() != 0) {
            return;
        }
        AtomicReference<T> atomicReference = this.LLILZLL;
        InterfaceC626120Oh8<? super T> interfaceC626120Oh8 = this.LL;
        int iAddAndGet = 1;
        while (!this.LLJI) {
            boolean z = this.LLIZLLLIL;
            if (z && this.LLJ != null) {
                atomicReference.lazySet(null);
                interfaceC626120Oh8.onError(this.LLJ);
                this.LLILZ.dispose();
                return;
            }
            boolean z2 = atomicReference.get() == null;
            if (z) {
                T andSet = atomicReference.getAndSet(null);
                if (!z2 && this.LLILZIL) {
                    interfaceC626120Oh8.onNext(andSet);
                }
                interfaceC626120Oh8.onComplete();
                this.LLILZ.dispose();
                return;
            }
            if (z2) {
                if (this.LLJIJIL) {
                    this.LLJILJIL = false;
                    this.LLJIJIL = false;
                }
            } else if (!this.LLJILJIL || this.LLJIJIL) {
                interfaceC626120Oh8.onNext(atomicReference.getAndSet(null));
                this.LLJIJIL = false;
                this.LLJILJIL = true;
                this.LLILZ.LIZJ(this, this.LLILLJJLI, this.LLILLL);
            }
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
        atomicReference.lazySet(null);
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LLJI;
    }

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) {
        this.LLJ = th;
        this.LLIZLLLIL = true;
        LIZ();
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(T t) {
        this.LLILZLL.set(t);
        LIZ();
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        if (C11JE.validate(this.LLIZ, interfaceC420801kM)) {
            this.LLIZ = interfaceC420801kM;
            this.LL.onSubscribe(this);
        }
    }

    public C11O7(InterfaceC626120Oh8<? super T> interfaceC626120Oh8, long j, TimeUnit timeUnit, C11RN c11rn, boolean z) {
        this.LL = interfaceC626120Oh8;
        this.LLILLJJLI = j;
        this.LLILLL = timeUnit;
        this.LLILZ = c11rn;
        this.LLILZIL = z;
    }
}
