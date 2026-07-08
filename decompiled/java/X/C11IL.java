package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11IL, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11IL extends AtomicReference<InterfaceC420801kM> implements InterfaceC420801kM, Runnable {
    public static final long serialVersionUID = 2875964065294031672L;
    public final C11IH<? super Long> LL;

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

    public C11IL(C11IH<? super Long> c11ih) {
        this.LL = c11ih;
    }
}
