package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.11Kt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19484111Kt<T> implements InterfaceC626120Oh8<T> {
    public final InterfaceC626120Oh8<? super T> LL;
    public final InterfaceC1487280oo2<? super Throwable, ? extends C098D<? extends T>> LLILLJJLI;
    public final boolean LLILLL;
    public final C19484811La LLILZ = new C19484811La();
    public boolean LLILZIL;
    public boolean LLILZLL;

    @Override // X.InterfaceC626120Oh8
    public final void onComplete() {
        if (this.LLILZLL) {
            return;
        }
        this.LLILZLL = true;
        this.LLILZIL = true;
        this.LL.onComplete();
    }

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) throws Throwable {
        if (this.LLILZIL) {
            if (this.LLILZLL) {
                C19489211Ms.LIZIZ(th);
                return;
            } else {
                this.LL.onError(th);
                return;
            }
        }
        this.LLILZIL = true;
        if (this.LLILLL && !(th instanceof Exception)) {
            this.LL.onError(th);
            return;
        }
        try {
            C098D<? extends T> c098dApply = this.LLILLJJLI.apply(th);
            if (c098dApply == null) {
                NullPointerException nullPointerException = new NullPointerException("Observable is null");
                nullPointerException.initCause(th);
                this.LL.onError(nullPointerException);
                return;
            }
            c098dApply.LIZIZ(this);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C11SP.LIZ(th2);
            this.LL.onError(new C0VYA(th, th2));
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(T t) {
        if (this.LLILZLL) {
            return;
        }
        this.LL.onNext(t);
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        this.LLILZ.replace(interfaceC420801kM);
    }

    public C19484111Kt(InterfaceC626120Oh8<? super T> interfaceC626120Oh8, InterfaceC1487280oo2<? super Throwable, ? extends C098D<? extends T>> interfaceC1487280oo2, boolean z) {
        this.LL = interfaceC626120Oh8;
        this.LLILLJJLI = interfaceC1487280oo2;
        this.LLILLL = z;
    }
}
