package X;

import java.util.Iterator;

/* JADX INFO: renamed from: X.11K0, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11K0<T> extends C11K1<T> {
    public final InterfaceC626120Oh8<? super T> LL;
    public final Iterator<? extends T> LLILLJJLI;
    public volatile boolean LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;

    @Override // X.InterfaceC19494911Ox
    public final void clear() {
        this.LLILZIL = true;
    }

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        this.LLILLL = true;
    }

    @Override // X.InterfaceC19494911Ox
    public final T poll() {
        if (this.LLILZIL) {
            return null;
        }
        if (!this.LLILZLL) {
            this.LLILZLL = true;
        } else if (!this.LLILLJJLI.hasNext()) {
            this.LLILZIL = true;
            return null;
        }
        T next = this.LLILLJJLI.next();
        C1701890uOB.LIZ(next, "The iterator returned a null value");
        return next;
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC19494911Ox
    public final boolean isEmpty() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC19495111Oz
    public final int requestFusion(int i) {
        if ((i & 1) != 0) {
            this.LLILZ = true;
            return 1;
        }
        return 0;
    }

    public C11K0(InterfaceC626120Oh8<? super T> interfaceC626120Oh8, Iterator<? extends T> it2) {
        this.LL = interfaceC626120Oh8;
        this.LLILLJJLI = it2;
    }
}
