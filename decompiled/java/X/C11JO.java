package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11JO, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11JO<T> extends AtomicReference<InterfaceC781210Ukh> implements InterfaceC19474811He<T>, InterfaceC420801kM {
    public static final long serialVersionUID = -8583764624474935784L;
    public final InterfaceC19474811He<? super T> LL;
    public InterfaceC420801kM LLILLJJLI;

    @Override // X.InterfaceC420801kM
    public final void dispose() throws Throwable {
        InterfaceC781210Ukh andSet = getAndSet(null);
        if (andSet != null) {
            try {
                andSet.run();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C11SP.LIZ(th);
                C19489211Ms.LIZIZ(th);
            }
            this.LLILLJJLI.dispose();
        }
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LLILLJJLI.isDisposed();
    }

    @Override // X.InterfaceC19474811He
    public final void onError(Throwable th) {
        this.LL.onError(th);
    }

    @Override // X.InterfaceC19474811He
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        if (C11JE.validate(this.LLILLJJLI, interfaceC420801kM)) {
            this.LLILLJJLI = interfaceC420801kM;
            this.LL.onSubscribe(this);
        }
    }

    @Override // X.InterfaceC19474811He
    public final void onSuccess(T t) {
        this.LL.onSuccess(t);
    }

    public C11JO(InterfaceC19474811He<? super T> interfaceC19474811He, InterfaceC781210Ukh interfaceC781210Ukh) {
        this.LL = interfaceC19474811He;
        lazySet(interfaceC781210Ukh);
    }
}
