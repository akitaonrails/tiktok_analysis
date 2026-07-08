package X;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11RT, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11RT<T> implements C098D<T> {
    public final AtomicReference<C11RU<T>> LL;
    public final InterfaceC19500611Rc<T> LLILLJJLI;

    @Override // X.C098D
    public final void LIZIZ(InterfaceC626120Oh8<? super T> interfaceC626120Oh8) {
        C11RU<T> c11ru;
        loop0: while (true) {
            c11ru = this.LL.get();
            if (c11ru != null) {
                break;
            }
            c11ru = new C11RU<>(this.LLILLJJLI.call());
            AtomicReference<C11RU<T>> atomicReference = this.LL;
            while (!atomicReference.compareAndSet(null, c11ru)) {
                if (atomicReference.get() != null) {
                    break;
                }
            }
            break loop0;
        }
        C11RX<T> c11rx = new C11RX<>(c11ru, interfaceC626120Oh8);
        interfaceC626120Oh8.onSubscribe(c11rx);
        loop2: while (true) {
            C11RX[] c11rxArr = c11ru.LLILLL.get();
            if (c11rxArr == C11RU.LLILZLL) {
                break;
            }
            int length = c11rxArr.length;
            C11RX[] c11rxArr2 = new C11RX[length + 1];
            System.arraycopy(c11rxArr, 0, c11rxArr2, 0, length);
            c11rxArr2[length] = c11rx;
            AtomicReference<C11RX[]> atomicReference2 = c11ru.LLILLL;
            while (!atomicReference2.compareAndSet(c11rxArr, c11rxArr2)) {
                if (atomicReference2.get() != c11rxArr) {
                    break;
                }
            }
            break loop2;
        }
        if (c11rx.LLILZ) {
            c11ru.LIZ(c11rx);
        } else {
            c11ru.LL.LJIL(c11rx);
        }
    }

    public C11RT(AtomicReference<C11RU<T>> atomicReference, InterfaceC19500611Rc<T> interfaceC19500611Rc) {
        this.LL = atomicReference;
        this.LLILLJJLI = interfaceC19500611Rc;
    }
}
