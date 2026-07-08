package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11Jd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19479911Jd<T, R> extends AtomicReference<InterfaceC420801kM> implements InterfaceC19474811He<T>, InterfaceC420801kM {
    public static final long serialVersionUID = 3258103020495908596L;
    public final InterfaceC19474811He<? super R> LL;
    public final InterfaceC1487280oo2<? super T, ? extends InterfaceC19473011Gm<? extends R>> LLILLJJLI;

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return C11JE.isDisposed(get());
    }

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        C11JE.dispose(this);
    }

    @Override // X.InterfaceC19474811He
    public final void onError(Throwable th) {
        this.LL.onError(th);
    }

    @Override // X.InterfaceC19474811He
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        if (C11JE.setOnce(this, interfaceC420801kM)) {
            this.LL.onSubscribe(this);
        }
    }

    @Override // X.InterfaceC19474811He
    public final void onSuccess(T t) throws Throwable {
        try {
            InterfaceC19473011Gm<? extends R> interfaceC19473011GmApply = this.LLILLJJLI.apply(t);
            C1701890uOB.LIZ(interfaceC19473011GmApply, "The single returned by the mapper is null");
            InterfaceC19473011Gm<? extends R> interfaceC19473011Gm = interfaceC19473011GmApply;
            if (!isDisposed()) {
                final InterfaceC19474811He<? super R> interfaceC19474811He = this.LL;
                interfaceC19473011Gm.LIZ(new InterfaceC19474811He<R>(interfaceC19474811He, this) { // from class: X.11Jf
                    public final AtomicReference<InterfaceC420801kM> LL;
                    public final InterfaceC19474811He<? super R> LLILLJJLI;

                    @Override // X.InterfaceC19474811He
                    public final void onError(Throwable th) {
                        this.LLILLJJLI.onError(th);
                    }

                    @Override // X.InterfaceC19474811He
                    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
                        C11JE.replace(this.LL, interfaceC420801kM);
                    }

                    @Override // X.InterfaceC19474811He
                    public final void onSuccess(R r) {
                        this.LLILLJJLI.onSuccess(r);
                    }

                    {
                        this.LL = this;
                        this.LLILLJJLI = interfaceC19474811He;
                    }
                });
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C11SP.LIZ(th);
            this.LL.onError(th);
        }
    }

    public C19479911Jd(InterfaceC19474811He<? super R> interfaceC19474811He, InterfaceC1487280oo2<? super T, ? extends InterfaceC19473011Gm<? extends R>> interfaceC1487280oo2) {
        this.LL = interfaceC19474811He;
        this.LLILLJJLI = interfaceC1487280oo2;
    }
}
