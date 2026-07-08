package X;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11RU, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11RU<T> extends AtomicReference<InterfaceC420801kM> implements InterfaceC626120Oh8<T>, InterfaceC420801kM {
    public static final C11RX[] LLILZIL = new C11RX[0];
    public static final C11RX[] LLILZLL = new C11RX[0];
    public static final long serialVersionUID = -533785617179540163L;
    public final C11RY<T> LL;
    public boolean LLILLJJLI;
    public final AtomicReference<C11RX[]> LLILLL = new AtomicReference<>(LLILZIL);
    public final AtomicBoolean LLILZ = new AtomicBoolean();

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        this.LLILLL.set(LLILZLL);
        C11JE.dispose(this);
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LLILLL.get() == LLILZLL;
    }

    @Override // X.InterfaceC626120Oh8
    public final void onComplete() {
        if (this.LLILLJJLI) {
            return;
        }
        this.LLILLJJLI = true;
        this.LL.LJFF();
        for (C11RX<T> c11rx : this.LLILLL.getAndSet(LLILZLL)) {
            this.LL.LJIL(c11rx);
        }
    }

    public C11RU(C11RY<T> c11ry) {
        this.LL = c11ry;
    }

    public final void LIZ(C11RX<T> c11rx) {
        C11RX[] c11rxArr;
        while (true) {
            C11RX[] c11rxArr2 = this.LLILLL.get();
            int length = c11rxArr2.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (!c11rxArr2[i].equals(c11rx)) {
                i++;
                if (i >= length) {
                    return;
                }
            }
            if (i >= 0) {
                if (length == 1) {
                    c11rxArr = LLILZIL;
                } else {
                    c11rxArr = new C11RX[length - 1];
                    System.arraycopy(c11rxArr2, 0, c11rxArr, 0, i);
                    System.arraycopy(c11rxArr2, i + 1, c11rxArr, i, (length - i) - 1);
                }
                AtomicReference<C11RX[]> atomicReference = this.LLILLL;
                while (!atomicReference.compareAndSet(c11rxArr2, c11rxArr)) {
                    if (atomicReference.get() != c11rxArr2) {
                        break;
                    }
                }
                return;
            }
            return;
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) {
        if (!this.LLILLJJLI) {
            this.LLILLJJLI = true;
            this.LL.LJIJI(th);
            for (C11RX<T> c11rx : this.LLILLL.getAndSet(LLILZLL)) {
                this.LL.LJIL(c11rx);
            }
            return;
        }
        C19489211Ms.LIZIZ(th);
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(T t) {
        if (!this.LLILLJJLI) {
            this.LL.LJIJ(t);
            for (C11RX<T> c11rx : this.LLILLL.get()) {
                this.LL.LJIL(c11rx);
            }
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        if (C11JE.setOnce(this, interfaceC420801kM)) {
            for (C11RX<T> c11rx : this.LLILLL.get()) {
                this.LL.LJIL(c11rx);
            }
        }
    }
}
