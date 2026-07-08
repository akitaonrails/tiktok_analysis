package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.11Mq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19489011Mq implements C11IY, InterfaceC420801kM {
    public final C11IY LL;
    public InterfaceC420801kM LLILLJJLI;
    public final /* synthetic */ C19489111Mr LLILLL;

    @Override // X.InterfaceC420801kM
    public final void dispose() throws Throwable {
        try {
            this.LLILLL.LLIZ.run();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C11SP.LIZ(th);
            C19489211Ms.LIZIZ(th);
        }
        this.LLILLJJLI.dispose();
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LLILLJJLI.isDisposed();
    }

    @Override // X.C11IY
    public final void onComplete() throws Throwable {
        if (this.LLILLJJLI == C11JE.DISPOSED) {
            return;
        }
        try {
            this.LLILLL.LLILZ.run();
            this.LLILLL.LLILZIL.run();
            this.LL.onComplete();
            try {
                this.LLILLL.LLILZLL.run();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C11SP.LIZ(th);
                C19489211Ms.LIZIZ(th);
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C11SP.LIZ(th2);
            this.LL.onError(th2);
        }
    }

    @Override // X.C11IY
    public final void onError(Throwable th) throws Throwable {
        if (this.LLILLJJLI == C11JE.DISPOSED) {
            C19489211Ms.LIZIZ(th);
            return;
        }
        try {
            this.LLILLL.LLILLL.accept(th);
            this.LLILLL.LLILZIL.run();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C11SP.LIZ(th2);
            th = new C0VYA(th, th2);
        }
        this.LL.onError(th);
        try {
            this.LLILLL.LLILZLL.run();
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            C11SP.LIZ(th3);
            C19489211Ms.LIZIZ(th3);
        }
    }

    @Override // X.C11IY
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) throws Throwable {
        try {
            this.LLILLL.LLILLJJLI.accept(interfaceC420801kM);
            if (C11JE.validate(this.LLILLJJLI, interfaceC420801kM)) {
                this.LLILLJJLI = interfaceC420801kM;
                this.LL.onSubscribe(this);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C11SP.LIZ(th);
            interfaceC420801kM.dispose();
            this.LLILLJJLI = C11JE.DISPOSED;
            C11JT.error(th, this.LL);
        }
    }

    public C19489011Mq(C19489111Mr c19489111Mr, C11IY c11iy) {
        this.LLILLL = c19489111Mr;
        this.LL = c11iy;
    }
}
