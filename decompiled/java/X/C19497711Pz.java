package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.11Pz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19497711Pz<T> implements InterfaceC420801kM, InterfaceC594300NSq<T> {
    public final C0X9S<?> LL;
    public final InterfaceC626120Oh8<? super C0X52<T>> LLILLJJLI;
    public boolean LLILLL;

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        this.LL.cancel();
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LL.isCanceled();
    }

    public C19497711Pz(C0X9S<?> c0x9s, InterfaceC626120Oh8<? super C0X52<T>> interfaceC626120Oh8) {
        this.LL = c0x9s;
        this.LLILLJJLI = interfaceC626120Oh8;
    }

    @Override // X.InterfaceC594300NSq
    public final void onFailure(C0X9S<T> c0x9s, Throwable th) throws Throwable {
        if (c0x9s.isCanceled()) {
            return;
        }
        try {
            this.LLILLJJLI.onError(th);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C11SP.LIZ(th2);
            C19489211Ms.LIZIZ(new C0VYA(th, th2));
        }
    }

    @Override // X.InterfaceC594300NSq
    public final void onResponse(C0X9S<T> c0x9s, C0X52<T> c0x52) throws Throwable {
        if (c0x9s.isCanceled()) {
            return;
        }
        try {
            this.LLILLJJLI.onNext(c0x52);
            if (!c0x9s.isCanceled()) {
                this.LLILLL = true;
                this.LLILLJJLI.onComplete();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (this.LLILLL) {
                C19489211Ms.LIZIZ(th);
                return;
            }
            if (c0x9s.isCanceled()) {
                return;
            }
            try {
                this.LLILLJJLI.onError(th);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C11SP.LIZ(th2);
                C19489211Ms.LIZIZ(new C0VYA(th, th2));
            }
        }
    }
}
