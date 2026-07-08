package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11I0, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11I0 extends AtomicReference<InterfaceC420801kM> implements InterfaceC420801kM, Runnable {
    public static final long serialVersionUID = 8465401857522493082L;
    public final InterfaceC19474811He<? super Long> LL;

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.LL.onSuccess(0L);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return C11JE.isDisposed(get());
    }

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        C11JE.dispose(this);
    }

    public C11I0(InterfaceC19474811He<? super Long> interfaceC19474811He) {
        this.LL = interfaceC19474811He;
    }
}
