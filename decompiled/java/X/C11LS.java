package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11LS, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11LS<T> extends AtomicReference<C11LR> implements C11PF<T>, C11LR, InterfaceC420801kM {
    public static final long serialVersionUID = -7251123623727029452L;
    public final C09JN<? super T> LL;
    public final C09JN<? super Throwable> LLILLJJLI;
    public final InterfaceC781210Ukh LLILLL;
    public final C09JN<? super C11LR> LLILZ;

    public boolean hasCustomOnError() {
        return this.LLILLJJLI != C19487811Me.LJFF;
    }

    @Override // X.InterfaceC420801kM
    public boolean isDisposed() {
        return get() == C11NC.CANCELLED;
    }

    @Override // X.C11M9
    public void onComplete() throws Throwable {
        C11LR c11lr = get();
        C11NC c11nc = C11NC.CANCELLED;
        if (c11lr != c11nc) {
            lazySet(c11nc);
            try {
                this.LLILLL.run();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C11SP.LIZ(th);
                C19489211Ms.LIZIZ(th);
            }
        }
    }

    @Override // X.C11LR
    public void cancel() {
        C11NC.cancel(this);
    }

    @Override // X.InterfaceC420801kM
    public void dispose() {
        cancel();
    }

    @Override // X.C11M9
    public void onError(Throwable th) throws Throwable {
        C11LR c11lr = get();
        C11NC c11nc = C11NC.CANCELLED;
        if (c11lr != c11nc) {
            lazySet(c11nc);
            try {
                this.LLILLJJLI.accept(th);
                return;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C11SP.LIZ(th2);
                C19489211Ms.LIZIZ(new C0VYA(th, th2));
                return;
            }
        }
        C19489211Ms.LIZIZ(th);
    }

    @Override // X.C11M9
    public void onNext(T t) throws Throwable {
        if (!isDisposed()) {
            try {
                this.LL.accept(t);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C11SP.LIZ(th);
                get().cancel();
                onError(th);
            }
        }
    }

    @Override // X.C11PF, X.C11M9
    public void onSubscribe(C11LR c11lr) throws Throwable {
        if (C11NC.setOnce(this, c11lr)) {
            try {
                this.LLILZ.accept(this);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C11SP.LIZ(th);
                c11lr.cancel();
                onError(th);
            }
        }
    }

    @Override // X.C11LR
    public void request(long j) {
        get().request(j);
    }

    public C11LS(C09JN<? super T> c09jn, C09JN<? super Throwable> c09jn2, InterfaceC781210Ukh interfaceC781210Ukh, C09JN<? super C11LR> c09jn3) {
        this.LL = c09jn;
        this.LLILLJJLI = c09jn2;
        this.LLILLL = interfaceC781210Ukh;
        this.LLILZ = c09jn3;
    }
}
