package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.11OR, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11OR<T> extends AtomicInteger implements C11PF<T> {
    public static final long serialVersionUID = -7098360935104053232L;
    public final C11M9<? super T> LL;
    public final C11OS LLILLJJLI;
    public final C11LE<? extends T> LLILLL;
    public final InterfaceC19483011Ki<? super Throwable> LLILZ;
    public long LLILZIL;
    public long LLILZLL;

    @Override // X.C11M9
    public final void onComplete() {
        this.LL.onComplete();
    }

    public final void LIZ() {
        if (getAndIncrement() == 0) {
            int iAddAndGet = 1;
            while (!this.LLILLJJLI.isCancelled()) {
                long j = this.LLILZLL;
                if (j != 0) {
                    this.LLILZLL = 0L;
                    this.LLILLJJLI.produced(j);
                }
                this.LLILLL.subscribe(this);
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }

    @Override // X.C11M9
    public final void onError(Throwable th) throws Throwable {
        long j = this.LLILZIL;
        if (j != Long.MAX_VALUE) {
            this.LLILZIL = j - 1;
        }
        if (j == 0) {
            this.LL.onError(th);
            return;
        }
        try {
            if (!this.LLILZ.test(th)) {
                this.LL.onError(th);
            } else {
                LIZ();
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C11SP.LIZ(th2);
            this.LL.onError(new C0VYA(th, th2));
        }
    }

    @Override // X.C11M9
    public final void onNext(T t) {
        this.LLILZLL++;
        this.LL.onNext(t);
    }

    @Override // X.C11PF, X.C11M9
    public final void onSubscribe(C11LR c11lr) {
        this.LLILLJJLI.setSubscription(c11lr);
    }

    public C11OR(C11M9 c11m9, long j, InterfaceC19483011Ki interfaceC19483011Ki, C11OS c11os, C11NN c11nn) {
        this.LL = c11m9;
        this.LLILLJJLI = c11os;
        this.LLILLL = c11nn;
        this.LLILZ = interfaceC19483011Ki;
        this.LLILZIL = j;
    }
}
