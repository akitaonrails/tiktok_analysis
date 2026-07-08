package X;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11R7, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11R7<T> extends AtomicReference<Object> implements InterfaceC420801kM {
    public static final long serialVersionUID = -1100270633763673112L;
    public final InterfaceC626120Oh8<? super T> LL;

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        Object andSet = getAndSet(this);
        if (andSet == null || andSet == this) {
            return;
        }
        ((C11R5) andSet).LIZ(this);
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return get() == this;
    }

    public C11R7(InterfaceC626120Oh8<? super T> interfaceC626120Oh8) {
        this.LL = interfaceC626120Oh8;
    }
}
