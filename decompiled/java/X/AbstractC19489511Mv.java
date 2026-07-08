package X;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11Mv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public abstract class AbstractC19489511Mv<T> implements C11PF<T>, InterfaceC420801kM {
    public final AtomicReference<C11LR> LL = new AtomicReference<>();

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        C11NC.cancel(this.LL);
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LL.get() == C11NC.CANCELLED;
    }

    @Override // X.C11PF, X.C11M9
    public final void onSubscribe(C11LR c11lr) {
        if (C19489611Mw.LIZJ(this.LL, c11lr, getClass())) {
            this.LL.get().request(Long.MAX_VALUE);
        }
    }
}
