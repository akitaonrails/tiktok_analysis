package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11Lp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class RunnableC19486311Lp extends AtomicReference<InterfaceC420801kM> implements C11IY, InterfaceC420801kM, Runnable {
    public static final long serialVersionUID = 7000911171163930287L;
    public final C11IY LL;
    public final C19484811La LLILLJJLI = new C19484811La();
    public final C11IV LLILLL;

    @Override // X.C11IY
    public final void onComplete() {
        this.LL.onComplete();
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.LLILLL.LIZIZ(this);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        C11JE.dispose(this);
        this.LLILLJJLI.dispose();
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return C11JE.isDisposed(get());
    }

    @Override // X.C11IY
    public final void onError(Throwable th) {
        this.LL.onError(th);
    }

    @Override // X.C11IY
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        C11JE.setOnce(this, interfaceC420801kM);
    }

    public RunnableC19486311Lp(C11IY c11iy, C11IV c11iv) {
        this.LL = c11iy;
        this.LLILLL = c11iv;
    }
}
