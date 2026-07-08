package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: X.11R3, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11R3<T> extends CountDownLatch implements InterfaceC19474811He<T>, C11IY, C11IH<T> {
    public T LL;
    public Throwable LLILLJJLI;
    public InterfaceC420801kM LLILLL;
    public volatile boolean LLILZ;

    public C11R3() {
        super(1);
    }

    public final T LIZ() {
        if (getCount() != 0) {
            try {
                await();
            } catch (InterruptedException e) {
                TryCatchGuardChecker.doCheck(e);
                this.LLILZ = true;
                InterfaceC420801kM interfaceC420801kM = this.LLILLL;
                if (interfaceC420801kM != null) {
                    interfaceC420801kM.dispose();
                }
                throw C11QG.LIZIZ(e);
            }
        }
        Throwable th = this.LLILLJJLI;
        if (th == null) {
            return this.LL;
        }
        throw C11QG.LIZIZ(th);
    }

    @Override // X.C11IY
    public final void onComplete() {
        countDown();
    }

    @Override // X.InterfaceC19474811He
    public final void onError(Throwable th) {
        this.LLILLJJLI = th;
        countDown();
    }

    @Override // X.InterfaceC19474811He
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        this.LLILLL = interfaceC420801kM;
        if (this.LLILZ) {
            interfaceC420801kM.dispose();
        }
    }

    @Override // X.InterfaceC19474811He
    public final void onSuccess(T t) {
        this.LL = t;
        countDown();
    }
}
