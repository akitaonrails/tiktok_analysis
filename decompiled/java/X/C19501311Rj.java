package X;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11Rj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19501311Rj<T> extends AtomicInteger implements InterfaceC420801kM {
    public static final long serialVersionUID = 6770240836423125754L;
    public final InterfaceC626120Oh8<? super T> LL;
    public final C19501211Ri<T> LLILLJJLI;
    public C19501411Rk<T> LLILLL;
    public int LLILZ;
    public long LLILZIL;
    public volatile boolean LLILZLL;

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        C19501311Rj<T>[] c19501311RjArr;
        if (this.LLILZLL) {
            return;
        }
        this.LLILZLL = true;
        C19501211Ri<T> c19501211Ri = this.LLILLJJLI;
        while (true) {
            C19501311Rj<T>[] c19501311RjArr2 = c19501211Ri.LLILZ.get();
            int length = c19501311RjArr2.length;
            if (length != 0) {
                int i = 0;
                while (c19501311RjArr2[i] != this) {
                    i++;
                    if (i >= length) {
                        return;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        c19501311RjArr = C19501211Ri.LLJIJIL;
                    } else {
                        c19501311RjArr = new C19501311Rj[length - 1];
                        System.arraycopy(c19501311RjArr2, 0, c19501311RjArr, 0, i);
                        System.arraycopy(c19501311RjArr2, i + 1, c19501311RjArr, i, (length - i) - 1);
                    }
                    AtomicReference<C19501311Rj<T>[]> atomicReference = c19501211Ri.LLILZ;
                    while (!atomicReference.compareAndSet(c19501311RjArr2, c19501311RjArr)) {
                        if (atomicReference.get() != c19501311RjArr2) {
                            break;
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LLILZLL;
    }

    public C19501311Rj(InterfaceC626120Oh8<? super T> interfaceC626120Oh8, C19501211Ri<T> c19501211Ri) {
        this.LL = interfaceC626120Oh8;
        this.LLILLJJLI = c19501211Ri;
        this.LLILLL = c19501211Ri.LLILZLL;
    }
}
