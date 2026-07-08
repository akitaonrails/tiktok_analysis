package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11In, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19478311In<T> extends AtomicReference<InterfaceC420801kM> implements InterfaceC19474811He<T>, InterfaceC420801kM {
    public static final long serialVersionUID = -5314538511045349925L;
    public final InterfaceC19474811He<? super T> LL;
    public final InterfaceC1487280oo2<? super Throwable, ? extends InterfaceC19473011Gm<? extends T>> LLILLJJLI;

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return C11JE.isDisposed(get());
    }

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        C11JE.dispose(this);
    }

    @Override // X.InterfaceC19474811He
    public final void onError(Throwable th) throws Throwable {
        try {
            InterfaceC19473011Gm<? extends T> interfaceC19473011GmApply = this.LLILLJJLI.apply(th);
            C1701890uOB.LIZ(interfaceC19473011GmApply, "The nextFunction returned a null SingleSource.");
            interfaceC19473011GmApply.LIZ(new C11I4(this.LL, this));
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C11SP.LIZ(th2);
            this.LL.onError(new C0VYA(th, th2));
        }
    }

    @Override // X.InterfaceC19474811He
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        if (C11JE.setOnce(this, interfaceC420801kM)) {
            this.LL.onSubscribe(this);
        }
    }

    @Override // X.InterfaceC19474811He
    public final void onSuccess(T t) {
        this.LL.onSuccess(t);
    }

    public C19478311In(InterfaceC19474811He<? super T> interfaceC19474811He, InterfaceC1487280oo2<? super Throwable, ? extends InterfaceC19473011Gm<? extends T>> interfaceC1487280oo2) {
        this.LL = interfaceC19474811He;
        this.LLILLJJLI = interfaceC1487280oo2;
    }
}
