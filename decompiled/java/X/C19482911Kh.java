package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.11Kh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19482911Kh<T> implements C11IH<T>, InterfaceC420801kM {
    public final C11IH<? super T> LL;
    public final InterfaceC19483011Ki<? super Throwable> LLILLJJLI;
    public InterfaceC420801kM LLILLL;

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        this.LLILLL.dispose();
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LLILLL.isDisposed();
    }

    @Override // X.C11IH
    public final void onComplete() {
        this.LL.onComplete();
    }

    @Override // X.C11IH
    public final void onError(Throwable th) throws Throwable {
        try {
            if (this.LLILLJJLI.test(th)) {
                this.LL.onComplete();
            } else {
                this.LL.onError(th);
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C11SP.LIZ(th2);
            this.LL.onError(new C0VYA(th, th2));
        }
    }

    @Override // X.C11IH
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        if (C11JE.validate(this.LLILLL, interfaceC420801kM)) {
            this.LLILLL = interfaceC420801kM;
            this.LL.onSubscribe(this);
        }
    }

    @Override // X.C11IH
    public final void onSuccess(T t) {
        this.LL.onSuccess(t);
    }

    public C19482911Kh(C11IH<? super T> c11ih, InterfaceC19483011Ki<? super Throwable> interfaceC19483011Ki) {
        this.LL = c11ih;
        this.LLILLJJLI = interfaceC19483011Ki;
    }
}
