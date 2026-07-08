package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11ME, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11ME extends AtomicReference<InterfaceC420801kM> implements C11LR, Runnable {
    public static final long serialVersionUID = -2809475196591179431L;
    public final C11M9<? super Long> LL;
    public volatile boolean LLILLJJLI;

    public final void LIZ() {
        if (get() != C11JE.DISPOSED) {
            if (!this.LLILLJJLI) {
                lazySet(C11JT.INSTANCE);
                this.LL.onError(new C11MF("Can't deliver value due to lack of requests"));
            } else {
                this.LL.onNext(0L);
                lazySet(C11JT.INSTANCE);
                this.LL.onComplete();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            LIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    @Override // X.C11LR
    public final void cancel() {
        C11JE.dispose(this);
    }

    public C11ME(C11M9<? super Long> c11m9) {
        this.LL = c11m9;
    }

    @Override // X.C11LR
    public final void request(long j) {
        if (C11NC.validate(j)) {
            this.LLILLJJLI = true;
        }
    }
}
