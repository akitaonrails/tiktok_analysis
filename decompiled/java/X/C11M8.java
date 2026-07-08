package X;

import java.util.Collection;

/* JADX INFO: renamed from: X.11M8, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11M8<T, U extends Collection<? super T>> extends C11M7<U> implements C11PF<T>, C11LR {
    public static final long serialVersionUID = -8134157938864266736L;
    public C11LR LLILLL;

    @Override // X.C11M9
    public final void onComplete() {
        complete(this.LLILLJJLI);
    }

    @Override // X.C11M7, X.C11NT, X.C11LR
    public final void cancel() {
        super.cancel();
        this.LLILLL.cancel();
    }

    @Override // X.C11M9
    public final void onError(Throwable th) {
        this.LLILLJJLI = null;
        this.LL.onError(th);
    }

    @Override // X.C11M9
    public final void onNext(T t) {
        Collection collection = (Collection) this.LLILLJJLI;
        if (collection != null) {
            collection.add(t);
        }
    }

    @Override // X.C11PF, X.C11M9
    public final void onSubscribe(C11LR c11lr) {
        if (C11NC.validate(this.LLILLL, c11lr)) {
            this.LLILLL = c11lr;
            this.LL.onSubscribe(this);
            c11lr.request(Long.MAX_VALUE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C11M8(C11M9<? super U> c11m9, U u) {
        super(c11m9);
        this.LLILLJJLI = u;
    }
}
