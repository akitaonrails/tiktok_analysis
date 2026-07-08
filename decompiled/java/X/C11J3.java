package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11J3, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11J3<T> extends AtomicReference<InterfaceC420801kM> implements InterfaceC19474811He<T>, C11IY, InterfaceC420801kM {
    public static final long serialVersionUID = -2177128922851101253L;
    public final C11IY LL;
    public final InterfaceC1487280oo2<? super T, ? extends C11IV> LLILLJJLI;

    @Override // X.C11IY
    public final void onComplete() {
        this.LL.onComplete();
    }

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
        C11JE.replace(this, interfaceC420801kM);
    }

    @Override // X.InterfaceC19474811He
    public final void onSuccess(T t) throws Throwable {
        try {
            C11IV c11ivApply = this.LLILLJJLI.apply(t);
            C1701890uOB.LIZ(c11ivApply, "The mapper returned a null CompletableSource");
            C11IV c11iv = c11ivApply;
            if (!isDisposed()) {
                c11iv.LIZIZ(this);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C11SP.LIZ(th);
            onError(th);
        }
    }

    public C11J3(C11IY c11iy, InterfaceC1487280oo2<? super T, ? extends C11IV> interfaceC1487280oo2) {
        this.LL = c11iy;
        this.LLILLJJLI = interfaceC1487280oo2;
    }
}
