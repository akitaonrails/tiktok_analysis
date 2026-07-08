package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.11Kv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19484311Kv<T> implements InterfaceC626120Oh8<T>, InterfaceC420801kM {
    public final InterfaceC626120Oh8<? super T> LL;
    public final InterfaceC19483011Ki<? super T> LLILLJJLI;
    public InterfaceC420801kM LLILLL;
    public boolean LLILZ;

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        this.LLILLL.dispose();
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LLILLL.isDisposed();
    }

    @Override // X.InterfaceC626120Oh8
    public final void onComplete() {
        this.LL.onComplete();
    }

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) {
        this.LL.onError(th);
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(T t) throws Throwable {
        if (this.LLILZ) {
            this.LL.onNext(t);
            return;
        }
        try {
            if (this.LLILLJJLI.test(t)) {
                return;
            }
            this.LLILZ = true;
            this.LL.onNext(t);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C11SP.LIZ(th);
            this.LLILLL.dispose();
            this.LL.onError(th);
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        if (C11JE.validate(this.LLILLL, interfaceC420801kM)) {
            this.LLILLL = interfaceC420801kM;
            this.LL.onSubscribe(this);
        }
    }

    public C19484311Kv(InterfaceC626120Oh8<? super T> interfaceC626120Oh8, InterfaceC19483011Ki<? super T> interfaceC19483011Ki) {
        this.LL = interfaceC626120Oh8;
        this.LLILLJJLI = interfaceC19483011Ki;
    }
}
