package X;

import ez6.b;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.11Sf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19503511Sf<T> extends AtomicBoolean implements InterfaceC420801kM {
    public static final long serialVersionUID = 3562861878281475070L;
    public final InterfaceC626120Oh8<? super T> LL;
    public final b<T> LLILLJJLI;

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        if (compareAndSet(false, true)) {
            this.LLILLJJLI.LJLLLL(this);
        }
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return get();
    }

    public C19503511Sf(InterfaceC626120Oh8<? super T> interfaceC626120Oh8, b<T> bVar) {
        this.LL = interfaceC626120Oh8;
        this.LLILLJJLI = bVar;
    }
}
