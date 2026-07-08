package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.11RL, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11RL<T> extends AtomicBoolean implements InterfaceC420801kM {
    public static final long serialVersionUID = 3562861878281475070L;
    public final InterfaceC626120Oh8<? super T> LL;
    public final C11RK<T> LLILLJJLI;

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        if (compareAndSet(false, true)) {
            this.LLILLJJLI.LJLLLLLL(this);
        }
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return get();
    }

    public C11RL(InterfaceC626120Oh8<? super T> interfaceC626120Oh8, C11RK<T> c11rk) {
        this.LL = interfaceC626120Oh8;
        this.LLILLJJLI = c11rk;
    }
}
