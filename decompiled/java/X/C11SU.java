package X;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11SU, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11SU<T> extends C11PR<T> {
    public static final C11SV[] LLILZ = new C11SV[0];
    public static final C11SV[] LLILZIL = new C11SV[0];
    public static final Object[] LLILZLL = new Object[0];
    public final C11SW<T> LL;
    public final AtomicReference<C11SV<T>[]> LLILLJJLI = new AtomicReference<>(LLILZ);
    public boolean LLILLL;

    public static <T> C11SU<T> LJLLLLLL() {
        return new C11SU<>(new C11ST());
    }

    @Override // X.InterfaceC626120Oh8
    public final void onComplete() {
        if (this.LLILLL) {
            return;
        }
        this.LLILLL = true;
        Object objComplete = C11PO.complete();
        C11ST c11st = (C11ST) this.LL;
        ((ArrayList) c11st.LL).add(objComplete);
        c11st.LLILLL++;
        c11st.LLILLJJLI = true;
        boolean zCompareAndSet = this.LL.compareAndSet(null, objComplete);
        C11SV<T>[] andSet = LLILZIL;
        if (zCompareAndSet) {
            andSet = this.LLILLJJLI.getAndSet(andSet);
        }
        for (C11SV<T> c11sv : andSet) {
            c11st.LIZ(c11sv);
        }
    }

    public C11SU(C11ST c11st) {
        this.LL = c11st;
    }

    @Override // X.C11NZ
    public final void LJJZZIII(InterfaceC626120Oh8<? super T> interfaceC626120Oh8) {
        C11SV<T> c11sv = new C11SV<>(interfaceC626120Oh8, this);
        interfaceC626120Oh8.onSubscribe(c11sv);
        if (!c11sv.LLILZ) {
            while (true) {
                C11SV<T>[] c11svArr = this.LLILLJJLI.get();
                if (c11svArr == LLILZIL) {
                    break;
                }
                int length = c11svArr.length;
                C11SV<T>[] c11svArr2 = new C11SV[length + 1];
                System.arraycopy(c11svArr, 0, c11svArr2, 0, length);
                c11svArr2[length] = c11sv;
                AtomicReference<C11SV<T>[]> atomicReference = this.LLILLJJLI;
                while (!atomicReference.compareAndSet(c11svArr, c11svArr2)) {
                    if (atomicReference.get() != c11svArr) {
                        break;
                    }
                }
                if (c11sv.LLILZ) {
                    LJLZ(c11sv);
                    return;
                }
            }
            ((C11ST) this.LL).LIZ(c11sv);
        }
    }

    public final void LJLZ(C11SV<T> c11sv) {
        C11SV<T>[] c11svArr;
        while (true) {
            C11SV<T>[] c11svArr2 = this.LLILLJJLI.get();
            if (c11svArr2 != LLILZIL && c11svArr2 != (c11svArr = LLILZ)) {
                int length = c11svArr2.length;
                for (int i = 0; i < length; i++) {
                    if (c11svArr2[i] == c11sv) {
                        if (i >= 0) {
                            if (length != 1) {
                                c11svArr = new C11SV[length - 1];
                                System.arraycopy(c11svArr2, 0, c11svArr, 0, i);
                                System.arraycopy(c11svArr2, i + 1, c11svArr, i, (length - i) - 1);
                            }
                            AtomicReference<C11SV<T>[]> atomicReference = this.LLILLJJLI;
                            while (!atomicReference.compareAndSet(c11svArr2, c11svArr)) {
                                if (atomicReference.get() != c11svArr2) {
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

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) {
        C1701890uOB.LIZ(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.LLILLL) {
            C19489211Ms.LIZIZ(th);
            return;
        }
        this.LLILLL = true;
        Object objError = C11PO.error(th);
        C11ST c11st = (C11ST) this.LL;
        ((ArrayList) c11st.LL).add(objError);
        c11st.LLILLL++;
        c11st.LLILLJJLI = true;
        boolean zCompareAndSet = this.LL.compareAndSet(null, objError);
        C11SV<T>[] andSet = LLILZIL;
        if (zCompareAndSet) {
            andSet = this.LLILLJJLI.getAndSet(andSet);
        }
        for (C11SV<T> c11sv : andSet) {
            c11st.LIZ(c11sv);
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(T t) {
        C1701890uOB.LIZ(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.LLILLL) {
            return;
        }
        C11ST c11st = (C11ST) this.LL;
        ((ArrayList) c11st.LL).add(t);
        c11st.LLILLL++;
        for (C11SV<T> c11sv : this.LLILLJJLI.get()) {
            c11st.LIZ(c11sv);
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        if (this.LLILLL) {
            interfaceC420801kM.dispose();
        }
    }
}
