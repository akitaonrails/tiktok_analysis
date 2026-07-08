package X;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11ND, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11ND<T> extends AtomicInteger implements C11PF<T>, C11LR {
    public static final long serialVersionUID = -4945028590049415624L;
    public final C11M9<? super T> LL;
    public final C19487711Md LLILLJJLI = new C19487711Md();
    public final AtomicLong LLILLL = new AtomicLong();
    public final AtomicReference<C11LR> LLILZ = new AtomicReference<>();
    public final AtomicBoolean LLILZIL = new AtomicBoolean();
    public volatile boolean LLILZLL;

    @Override // X.C11M9
    public void onComplete() {
        this.LLILZLL = true;
        C11M9<? super T> c11m9 = this.LL;
        C19487711Md c19487711Md = this.LLILLJJLI;
        if (getAndIncrement() == 0) {
            Throwable thTerminate = c19487711Md.terminate();
            if (thTerminate != null) {
                c11m9.onError(thTerminate);
            } else {
                c11m9.onComplete();
            }
        }
    }

    @Override // X.C11LR
    public void cancel() {
        if (this.LLILZLL) {
            return;
        }
        C11NC.cancel(this.LLILZ);
    }

    public C11ND(C11M9<? super T> c11m9) {
        this.LL = c11m9;
    }

    @Override // X.C11M9
    public void onError(Throwable th) {
        this.LLILZLL = true;
        C11M9<? super T> c11m9 = this.LL;
        C19487711Md c19487711Md = this.LLILLJJLI;
        if (c19487711Md.addThrowable(th)) {
            if (getAndIncrement() == 0) {
                c11m9.onError(c19487711Md.terminate());
                return;
            }
            return;
        }
        C19489211Ms.LIZIZ(th);
    }

    @Override // X.C11M9
    public void onNext(T t) {
        C11M9<? super T> c11m9 = this.LL;
        C19487711Md c19487711Md = this.LLILLJJLI;
        if (get() == 0 && compareAndSet(0, 1)) {
            c11m9.onNext(t);
            if (decrementAndGet() != 0) {
                Throwable thTerminate = c19487711Md.terminate();
                if (thTerminate != null) {
                    c11m9.onError(thTerminate);
                } else {
                    c11m9.onComplete();
                }
            }
        }
    }

    @Override // X.C11PF, X.C11M9
    public void onSubscribe(C11LR c11lr) {
        if (this.LLILZIL.compareAndSet(false, true)) {
            this.LL.onSubscribe(this);
            C11NC.deferredSetOnce(this.LLILZ, this.LLILLL, c11lr);
        } else {
            c11lr.cancel();
            cancel();
            onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
        }
    }

    @Override // X.C11LR
    public void request(long j) {
        if (j <= 0) {
            cancel();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("§3.9 violated: positive request amount required but it was ");
            sbLIZ.append(j);
            onError(new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ)));
            return;
        }
        C11NC.deferredRequest(this.LLILZ, this.LLILLL, j);
    }
}
