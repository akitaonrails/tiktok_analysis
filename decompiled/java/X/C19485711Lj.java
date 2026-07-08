package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11Lj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19485711Lj<T> extends AtomicReference<InterfaceC420801kM> implements InterfaceC19474811He<T> {
    public static final long serialVersionUID = 3323743579927613702L;
    public final C19485611Li<T, ?> LL;
    public final int LLILLJJLI;

    @Override // X.InterfaceC19474811He
    public final void onError(Throwable th) {
        this.LL.LIZ(this.LLILLJJLI, th);
    }

    @Override // X.InterfaceC19474811He
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        C11JE.setOnce(this, interfaceC420801kM);
    }

    @Override // X.InterfaceC19474811He
    public final void onSuccess(T t) throws Throwable {
        C19485611Li<T, ?> c19485611Li = this.LL;
        c19485611Li.LLILZ[this.LLILLJJLI] = t;
        if (c19485611Li.decrementAndGet() == 0) {
            try {
                Object objApply = c19485611Li.LLILLJJLI.apply(c19485611Li.LLILZ);
                C1701890uOB.LIZ(objApply, "The zipper returned a null value");
                c19485611Li.LL.onSuccess(objApply);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C11SP.LIZ(th);
                c19485611Li.LL.onError(th);
            }
        }
    }

    public C19485711Lj(C19485611Li<T, ?> c19485611Li, int i) {
        this.LL = c19485611Li;
        this.LLILLJJLI = i;
    }
}
