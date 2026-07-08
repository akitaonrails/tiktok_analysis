package X;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11LA, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11LA<U> extends AtomicReference<C11LR> implements C11PF<U> {
    public static final long serialVersionUID = -1266041316834525931L;
    public final C11L9<?, U> LL;

    @Override // X.C11M9
    public final void onComplete() {
        this.LL.LIZ();
    }

    public C11LA(C11L9<?, U> c11l9) {
        this.LL = c11l9;
    }

    @Override // X.C11M9
    public final void onError(Throwable th) {
        C11L9<?, U> c11l9 = this.LL;
        c11l9.getClass();
        if (C11JE.dispose(c11l9)) {
            c11l9.LL.onError(th);
        } else {
            C19489211Ms.LIZIZ(th);
        }
    }

    @Override // X.C11M9
    public final void onNext(Object obj) {
        C11NC.cancel(this);
        this.LL.LIZ();
    }

    @Override // X.C11PF, X.C11M9
    public final void onSubscribe(C11LR c11lr) {
        C11NC.setOnce(this, c11lr, Long.MAX_VALUE);
    }
}
