package X;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11Ri, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19501211Ri<T> extends C11J7<T, T> implements InterfaceC626120Oh8<T> {
    public static final C19501311Rj[] LLJIJIL = new C19501311Rj[0];
    public static final C19501311Rj[] LLJILJIL = new C19501311Rj[0];
    public final AtomicBoolean LLILLJJLI;
    public final int LLILLL;
    public final AtomicReference<C19501311Rj<T>[]> LLILZ;
    public volatile long LLILZIL;
    public final C19501411Rk<T> LLILZLL;
    public C19501411Rk<T> LLIZ;
    public int LLIZLLLIL;
    public Throwable LLJ;
    public volatile boolean LLJI;

    @Override // X.InterfaceC626120Oh8
    public final void onComplete() {
        this.LLJI = true;
        for (C19501311Rj<T> c19501311Rj : this.LLILZ.getAndSet(LLJILJIL)) {
            LJLLLL(c19501311Rj);
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
    }

    @Override // X.C11NZ
    public final void LJJZZIII(InterfaceC626120Oh8<? super T> interfaceC626120Oh8) {
        C19501311Rj<T> c19501311Rj = new C19501311Rj<>(interfaceC626120Oh8, this);
        interfaceC626120Oh8.onSubscribe(c19501311Rj);
        loop0: while (true) {
            C19501311Rj<T>[] c19501311RjArr = this.LLILZ.get();
            if (c19501311RjArr == LLJILJIL) {
                break;
            }
            int length = c19501311RjArr.length;
            C19501311Rj<T>[] c19501311RjArr2 = new C19501311Rj[length + 1];
            System.arraycopy(c19501311RjArr, 0, c19501311RjArr2, 0, length);
            c19501311RjArr2[length] = c19501311Rj;
            AtomicReference<C19501311Rj<T>[]> atomicReference = this.LLILZ;
            while (!atomicReference.compareAndSet(c19501311RjArr, c19501311RjArr2)) {
                if (atomicReference.get() != c19501311RjArr) {
                    break;
                }
            }
            break loop0;
        }
        if (!this.LLILLJJLI.get() && this.LLILLJJLI.compareAndSet(false, true)) {
            this.LL.LIZIZ(this);
        } else {
            LJLLLL(c19501311Rj);
        }
    }

    public final void LJLLLL(C19501311Rj<T> c19501311Rj) {
        boolean z;
        if (c19501311Rj.getAndIncrement() != 0) {
            return;
        }
        long j = c19501311Rj.LLILZIL;
        int i = c19501311Rj.LLILZ;
        C19501411Rk<T> c19501411Rk = c19501311Rj.LLILLL;
        InterfaceC626120Oh8<? super T> interfaceC626120Oh8 = c19501311Rj.LL;
        int i2 = this.LLILLL;
        int iAddAndGet = 1;
        while (!c19501311Rj.LLILZLL) {
            boolean z2 = this.LLJI;
            if (this.LLILZIL == j) {
                z = true;
            } else {
                z = false;
            }
            if (z2) {
                if (z) {
                    c19501311Rj.LLILLL = null;
                    Throwable th = this.LLJ;
                    if (th != null) {
                        interfaceC626120Oh8.onError(th);
                        return;
                    } else {
                        interfaceC626120Oh8.onComplete();
                        return;
                    }
                }
            } else if (z) {
                c19501311Rj.LLILZIL = j;
                c19501311Rj.LLILZ = i;
                c19501311Rj.LLILLL = c19501411Rk;
                iAddAndGet = c19501311Rj.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            if (i == i2) {
                c19501411Rk = c19501411Rk.LIZIZ;
                i = 0;
            }
            interfaceC626120Oh8.onNext(c19501411Rk.LIZ[i]);
            i++;
            j++;
        }
        c19501311Rj.LLILLL = null;
    }

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) {
        this.LLJ = th;
        this.LLJI = true;
        for (C19501311Rj<T> c19501311Rj : this.LLILZ.getAndSet(LLJILJIL)) {
            LJLLLL(c19501311Rj);
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(T t) {
        int i = this.LLIZLLLIL;
        if (i == this.LLILLL) {
            C19501411Rk<T> c19501411Rk = new C19501411Rk<>(i);
            c19501411Rk.LIZ[0] = t;
            this.LLIZLLLIL = 1;
            this.LLIZ.LIZIZ = c19501411Rk;
            this.LLIZ = c19501411Rk;
        } else {
            this.LLIZ.LIZ[i] = t;
            this.LLIZLLLIL = i + 1;
        }
        this.LLILZIL++;
        for (C19501311Rj<T> c19501311Rj : this.LLILZ.get()) {
            LJLLLL(c19501311Rj);
        }
    }

    public C19501211Ri(C11NZ<T> c11nz, int i) {
        super(c11nz);
        this.LLILLL = i;
        this.LLILLJJLI = new AtomicBoolean();
        C19501411Rk<T> c19501411Rk = new C19501411Rk<>(i);
        this.LLILZLL = c19501411Rk;
        this.LLIZ = c19501411Rk;
        this.LLILZ = new AtomicReference<>(LLJIJIL);
    }
}
