package X;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11Oe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19493011Oe<T> extends AbstractC19492911Od<T> {
    public static final C19493111Of[] LLILZ = new C19493111Of[0];
    public static final C19493111Of[] LLILZIL = new C19493111Of[0];
    public final AtomicReference<C19493111Of<T>[]> LLILLJJLI = new AtomicReference<>(LLILZIL);
    public Throwable LLILLL;

    @Override // X.C11M9
    public final void onComplete() {
        C19493111Of<T>[] c19493111OfArr = this.LLILLJJLI.get();
        C19493111Of<T>[] c19493111OfArr2 = LLILZ;
        if (c19493111OfArr == c19493111OfArr2) {
            return;
        }
        for (C19493111Of<T> c19493111Of : this.LLILLJJLI.getAndSet(c19493111OfArr2)) {
            if (c19493111Of.get() != Long.MIN_VALUE) {
                c19493111Of.LL.onComplete();
            }
        }
    }

    @Override // X.C11NN
    public final void LJIILLIIL(C11M9<? super T> c11m9) {
        C19493111Of<T> c19493111Of = new C19493111Of<>(c11m9, this);
        c11m9.onSubscribe(c19493111Of);
        while (true) {
            C19493111Of<T>[] c19493111OfArr = this.LLILLJJLI.get();
            if (c19493111OfArr == LLILZ) {
                Throwable th = this.LLILLL;
                if (th != null) {
                    c11m9.onError(th);
                    return;
                } else {
                    c11m9.onComplete();
                    return;
                }
            }
            int length = c19493111OfArr.length;
            C19493111Of<T>[] c19493111OfArr2 = new C19493111Of[length + 1];
            System.arraycopy(c19493111OfArr, 0, c19493111OfArr2, 0, length);
            c19493111OfArr2[length] = c19493111Of;
            AtomicReference<C19493111Of<T>[]> atomicReference = this.LLILLJJLI;
            while (!atomicReference.compareAndSet(c19493111OfArr, c19493111OfArr2)) {
                if (atomicReference.get() != c19493111OfArr) {
                    break;
                }
            }
            if (c19493111Of.get() != Long.MIN_VALUE) {
                return;
            }
            LJIJ(c19493111Of);
            return;
        }
    }

    public final void LJIJ(C19493111Of<T> c19493111Of) {
        C19493111Of<T>[] c19493111OfArr;
        while (true) {
            C19493111Of<T>[] c19493111OfArr2 = this.LLILLJJLI.get();
            if (c19493111OfArr2 != LLILZ && c19493111OfArr2 != (c19493111OfArr = LLILZIL)) {
                int length = c19493111OfArr2.length;
                for (int i = 0; i < length; i++) {
                    if (c19493111OfArr2[i] == c19493111Of) {
                        if (i >= 0) {
                            if (length != 1) {
                                c19493111OfArr = new C19493111Of[length - 1];
                                System.arraycopy(c19493111OfArr2, 0, c19493111OfArr, 0, i);
                                System.arraycopy(c19493111OfArr2, i + 1, c19493111OfArr, i, (length - i) - 1);
                            }
                            AtomicReference<C19493111Of<T>[]> atomicReference = this.LLILLJJLI;
                            while (!atomicReference.compareAndSet(c19493111OfArr2, c19493111OfArr)) {
                                if (atomicReference.get() != c19493111OfArr2) {
                                    break;
                                }
                            }
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            return;
        }
    }

    @Override // X.C11M9
    public final void onError(Throwable th) {
        C1701890uOB.LIZ(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        C19493111Of<T>[] c19493111OfArr = this.LLILLJJLI.get();
        C19493111Of<T>[] c19493111OfArr2 = LLILZ;
        if (c19493111OfArr == c19493111OfArr2) {
            C19489211Ms.LIZIZ(th);
            return;
        }
        this.LLILLL = th;
        for (C19493111Of<T> c19493111Of : this.LLILLJJLI.getAndSet(c19493111OfArr2)) {
            if (c19493111Of.get() != Long.MIN_VALUE) {
                c19493111Of.LL.onError(th);
            } else {
                C19489211Ms.LIZIZ(th);
            }
        }
    }

    @Override // X.C11M9
    public final void onNext(T t) {
        C1701890uOB.LIZ(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (C19493111Of<T> c19493111Of : this.LLILLJJLI.get()) {
            long j = c19493111Of.get();
            long j2 = Long.MIN_VALUE;
            if (j != Long.MIN_VALUE) {
                if (j != 0) {
                    c19493111Of.LL.onNext(t);
                    while (true) {
                        long j3 = c19493111Of.get();
                        if (j3 == j2 || j3 == Long.MAX_VALUE) {
                            break;
                        }
                        long j4 = j3 - 1;
                        if (j4 < 0) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("More produced than requested: ");
                            sbLIZ.append(j4);
                            C19489211Ms.LIZIZ(new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ)));
                            j4 = 0;
                        }
                        if (!c19493111Of.compareAndSet(j3, j4)) {
                            j2 = Long.MIN_VALUE;
                        }
                    }
                } else {
                    c19493111Of.cancel();
                    c19493111Of.LL.onError(new C11MF("Could not emit value due to lack of requests"));
                }
            }
        }
    }

    @Override // X.C11M9
    public final void onSubscribe(C11LR c11lr) {
        if (this.LLILLJJLI.get() == LLILZ) {
            c11lr.cancel();
        } else {
            c11lr.request(Long.MAX_VALUE);
        }
    }
}
