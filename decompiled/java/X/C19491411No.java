package X;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11No, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19491411No<T> extends AtomicInteger implements C11PF<T>, C11LR {
    public static final long serialVersionUID = 163080509307634843L;
    public final C11M9<? super T> LL;
    public C11LR LLILLJJLI;
    public volatile boolean LLILLL;
    public Throwable LLILZ;
    public volatile boolean LLILZIL;
    public final AtomicLong LLILZLL = new AtomicLong();
    public final AtomicReference<T> LLIZ = new AtomicReference<>();

    @Override // X.C11M9
    public final void onComplete() {
        this.LLILLL = true;
        LIZIZ();
    }

    @Override // X.C11LR
    public final void cancel() {
        if (this.LLILZIL) {
            return;
        }
        this.LLILZIL = true;
        this.LLILLJJLI.cancel();
        if (getAndIncrement() == 0) {
            this.LLIZ.lazySet(null);
        }
    }

    public final void LIZIZ() {
        if (getAndIncrement() != 0) {
            return;
        }
        C11M9<? super T> c11m9 = this.LL;
        AtomicLong atomicLong = this.LLILZLL;
        AtomicReference<T> atomicReference = this.LLIZ;
        int iAddAndGet = 1;
        do {
            long j = 0;
            while (true) {
                if (j == atomicLong.get()) {
                    break;
                }
                boolean z = this.LLILLL;
                T andSet = atomicReference.getAndSet(null);
                boolean z2 = andSet == null;
                if (!LIZ(z, z2, c11m9, atomicReference)) {
                    if (z2) {
                        break;
                    }
                    c11m9.onNext(andSet);
                    j++;
                } else {
                    return;
                }
            }
            if (j == atomicLong.get()) {
                if (LIZ(this.LLILLL, atomicReference.get() == null, c11m9, atomicReference)) {
                    return;
                }
            }
            if (j != 0) {
                C19492311Nx.LIZJ(atomicLong, j);
            }
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
    }

    public C19491411No(C11M9<? super T> c11m9) {
        this.LL = c11m9;
    }

    @Override // X.C11M9
    public final void onError(Throwable th) {
        this.LLILZ = th;
        this.LLILLL = true;
        LIZIZ();
    }

    @Override // X.C11M9
    public final void onNext(T t) {
        this.LLIZ.lazySet(t);
        LIZIZ();
    }

    @Override // X.C11PF, X.C11M9
    public final void onSubscribe(C11LR c11lr) {
        if (C11NC.validate(this.LLILLJJLI, c11lr)) {
            this.LLILLJJLI = c11lr;
            this.LL.onSubscribe(this);
            c11lr.request(Long.MAX_VALUE);
        }
    }

    @Override // X.C11LR
    public final void request(long j) {
        if (C11NC.validate(j)) {
            C19492311Nx.LIZ(this.LLILZLL, j);
            LIZIZ();
        }
    }

    public final boolean LIZ(boolean z, boolean z2, C11M9<?> c11m9, AtomicReference<T> atomicReference) {
        if (this.LLILZIL) {
            atomicReference.lazySet(null);
            return true;
        }
        if (z) {
            Throwable th = this.LLILZ;
            if (th != null) {
                atomicReference.lazySet(null);
                c11m9.onError(th);
                return true;
            }
            if (z2) {
                c11m9.onComplete();
                return true;
            }
            return false;
        }
        return false;
    }
}
