package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.11Mm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19488611Mm<T> extends AtomicInteger implements InterfaceC626120Oh8<T> {
    public static final long serialVersionUID = -7098360935104053232L;
    public final InterfaceC626120Oh8<? super T> LL;
    public final C19484811La LLILLJJLI;
    public final C098D<? extends T> LLILLL;
    public final InterfaceC19483011Ki<? super Throwable> LLILZ;
    public long LLILZIL;

    @Override // X.InterfaceC626120Oh8
    public final void onComplete() {
        this.LL.onComplete();
    }

    public final void LIZ() {
        if (getAndIncrement() == 0) {
            int iAddAndGet = 1;
            while (!this.LLILLJJLI.isDisposed()) {
                this.LLILLL.LIZIZ(this);
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }

    @Override // X.InterfaceC626120Oh8
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

    @Override // X.InterfaceC626120Oh8
    public final void onNext(T t) {
        this.LL.onNext(t);
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        this.LLILLJJLI.replace(interfaceC420801kM);
    }

    public C19488611Mm(InterfaceC626120Oh8<? super T> interfaceC626120Oh8, long j, InterfaceC19483011Ki<? super Throwable> interfaceC19483011Ki, C19484811La c19484811La, C098D<? extends T> c098d) {
        this.LL = interfaceC626120Oh8;
        this.LLILLJJLI = c19484811La;
        this.LLILLL = c098d;
        this.LLILZ = interfaceC19483011Ki;
        this.LLILZIL = j;
    }
}
