package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collection;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: X.11Mi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19488211Mi<T, U extends Collection<? super T>> implements InterfaceC626120Oh8<T>, InterfaceC420801kM {
    public final InterfaceC626120Oh8<? super U> LL;
    public final int LLILLJJLI;
    public final Callable<U> LLILLL;
    public U LLILZ;
    public int LLILZIL;
    public InterfaceC420801kM LLILZLL;

    public final boolean LIZ() throws Throwable {
        try {
            U uCall = this.LLILLL.call();
            C1701890uOB.LIZ(uCall, "Empty buffer supplied");
            this.LLILZ = uCall;
            return true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C11SP.LIZ(th);
            this.LLILZ = null;
            InterfaceC420801kM interfaceC420801kM = this.LLILZLL;
            if (interfaceC420801kM == null) {
                C11JT.error(th, this.LL);
                return false;
            }
            interfaceC420801kM.dispose();
            this.LL.onError(th);
            return false;
        }
    }

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        this.LLILZLL.dispose();
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LLILZLL.isDisposed();
    }

    @Override // X.InterfaceC626120Oh8
    public final void onComplete() {
        U u = this.LLILZ;
        if (u != null) {
            this.LLILZ = null;
            if (!u.isEmpty()) {
                this.LL.onNext(u);
            }
            this.LL.onComplete();
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) {
        this.LLILZ = null;
        this.LL.onError(th);
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(T t) throws Throwable {
        U u = this.LLILZ;
        if (u != null) {
            u.add(t);
            int i = this.LLILZIL + 1;
            this.LLILZIL = i;
            if (i >= this.LLILLJJLI) {
                this.LL.onNext(u);
                this.LLILZIL = 0;
                LIZ();
            }
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        if (C11JE.validate(this.LLILZLL, interfaceC420801kM)) {
            this.LLILZLL = interfaceC420801kM;
            this.LL.onSubscribe(this);
        }
    }

    public C19488211Mi(InterfaceC626120Oh8<? super U> interfaceC626120Oh8, int i, Callable<U> callable) {
        this.LL = interfaceC626120Oh8;
        this.LLILLJJLI = i;
        this.LLILLL = callable;
    }
}
