package X;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11Mu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19489411Mu<T> extends AtomicReference<C19489311Mt<T>> implements InterfaceC420801kM {
    public static final long serialVersionUID = -7650903191002190468L;
    public final InterfaceC19474811He<? super T> LL;

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        C19489311Mt<T> andSet = getAndSet(null);
        if (andSet != null) {
            andSet.LJJJIL(this);
        }
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return get() == null;
    }

    public C19489411Mu(InterfaceC19474811He<? super T> interfaceC19474811He, C19489311Mt<T> c19489311Mt) {
        this.LL = interfaceC19474811He;
        lazySet(c19489311Mt);
    }
}
