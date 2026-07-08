package X;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11NE, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public abstract class C11NE<T> implements C11PF<T>, InterfaceC420801kM {
    public final AtomicReference<C11LR> LL = new AtomicReference<>();
    public final C11NI LLILLJJLI = new C11NI();
    public final AtomicLong LLILLL = new AtomicLong();

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        if (C11NC.cancel(this.LL)) {
            this.LLILLJJLI.dispose();
        }
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LL.get() == C11NC.CANCELLED;
    }

    @Override // X.C11PF, X.C11M9
    public final void onSubscribe(C11LR c11lr) {
        if (C19489611Mw.LIZJ(this.LL, c11lr, getClass())) {
            long andSet = this.LLILLL.getAndSet(0L);
            if (andSet != 0) {
                c11lr.request(andSet);
            }
            C11NC.deferredRequest(this.LL, this.LLILLL, Long.MAX_VALUE);
        }
    }
}
