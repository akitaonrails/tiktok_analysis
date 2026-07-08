package X;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11Lo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19486211Lo extends AtomicReference<C11LR> implements C11PF<Object> {
    public static final long serialVersionUID = 5170026210238877381L;
    public final C19486111Ln<?> LL;

    @Override // X.C11M9
    public final void onComplete() {
        C11LR c11lr = get();
        C11NC c11nc = C11NC.CANCELLED;
        if (c11lr != c11nc) {
            lazySet(c11nc);
            this.LL.LIZ(new CancellationException());
        }
    }

    public C19486211Lo(C19486111Ln<?> c19486111Ln) {
        this.LL = c19486111Ln;
    }

    @Override // X.C11M9
    public final void onError(Throwable th) {
        this.LL.LIZ(th);
    }

    @Override // X.C11M9
    public final void onNext(Object obj) {
        if (C11NC.cancel(this)) {
            this.LL.LIZ(new CancellationException());
        }
    }

    @Override // X.C11PF, X.C11M9
    public final void onSubscribe(C11LR c11lr) {
        C11NC.setOnce(this, c11lr, Long.MAX_VALUE);
    }
}
