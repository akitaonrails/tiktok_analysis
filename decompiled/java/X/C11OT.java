package X;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11OT, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11OT<T, U> extends AtomicInteger implements C11PF<Object>, C11LR {
    public static final long serialVersionUID = 2827772011130406689L;
    public final C11LE<T> LL;
    public final AtomicReference<C11LR> LLILLJJLI = new AtomicReference<>();
    public final AtomicLong LLILLL = new AtomicLong();
    public C11OV LLILZ;

    @Override // X.C11LR
    public final void cancel() {
        C11NC.cancel(this.LLILLJJLI);
    }

    @Override // X.C11M9
    public final void onComplete() {
        cancel();
        this.LLILZ.LLJ.onComplete();
    }

    public C11OT(C11NN c11nn) {
        this.LL = c11nn;
    }

    @Override // X.C11M9
    public final void onError(Throwable th) {
        cancel();
        this.LLILZ.LLJ.onError(th);
    }

    @Override // X.C11M9
    public final void onNext(Object obj) {
        if (getAndIncrement() == 0) {
            while (this.LLILLJJLI.get() != C11NC.CANCELLED) {
                this.LL.subscribe(this.LLILZ);
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    @Override // X.C11PF, X.C11M9
    public final void onSubscribe(C11LR c11lr) {
        C11NC.deferredSetOnce(this.LLILLJJLI, this.LLILLL, c11lr);
    }

    @Override // X.C11LR
    public final void request(long j) {
        C11NC.deferredRequest(this.LLILLJJLI, this.LLILLL, j);
    }
}
