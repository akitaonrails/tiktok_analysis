package X;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.11Qs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19499611Qs<T> implements InterfaceC420801kM {
    public final InterfaceC626120Oh8<? super T> LL;
    public final C19499511Qr<T>[] LLILLJJLI;
    public final AtomicInteger LLILLL = new AtomicInteger();

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        if (this.LLILLL.get() != -1) {
            this.LLILLL.lazySet(-1);
            for (C19499511Qr<T> c19499511Qr : this.LLILLJJLI) {
                c19499511Qr.getClass();
                C11JE.dispose(c19499511Qr);
            }
        }
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LLILLL.get() == -1;
    }

    public final boolean LIZ(int i) {
        int i2 = this.LLILLL.get();
        int i3 = 0;
        if (i2 == 0) {
            if (!this.LLILLL.compareAndSet(0, i)) {
                return false;
            }
            C19499511Qr<T>[] c19499511QrArr = this.LLILLJJLI;
            int length = c19499511QrArr.length;
            while (i3 < length) {
                int i4 = i3 + 1;
                if (i4 != i) {
                    C19499511Qr<T> c19499511Qr = c19499511QrArr[i3];
                    c19499511Qr.getClass();
                    C11JE.dispose(c19499511Qr);
                }
                i3 = i4;
            }
            return true;
        }
        if (i2 == i) {
            return true;
        }
        return false;
    }

    public C19499611Qs(InterfaceC626120Oh8<? super T> interfaceC626120Oh8, int i) {
        this.LL = interfaceC626120Oh8;
        this.LLILLJJLI = new C19499511Qr[i];
    }
}
