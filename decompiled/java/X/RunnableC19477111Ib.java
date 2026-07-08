package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11Ib, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class RunnableC19477111Ib extends AtomicReference<InterfaceC420801kM> implements C11IY, InterfaceC420801kM, Runnable {
    public static final long serialVersionUID = 8571289934935992137L;
    public final C11IY LL;
    public final C11RO LLILLJJLI;
    public Throwable LLILLL;

    @Override // X.C11IY
    public final void onComplete() {
        C11JE.replace(this, this.LLILLJJLI.LIZIZ(this));
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Throwable th = this.LLILLL;
            if (th == null) {
                this.LL.onComplete();
            } else {
                this.LLILLL = null;
                this.LL.onError(th);
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            if (!C2179971ATj.LIZ(th2)) {
                throw th2;
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

    @Override // X.C11IY
    public final void onError(Throwable th) {
        this.LLILLL = th;
        C11JE.replace(this, this.LLILLJJLI.LIZIZ(this));
    }

    @Override // X.C11IY
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        if (C11JE.setOnce(this, interfaceC420801kM)) {
            this.LL.onSubscribe(this);
        }
    }

    public RunnableC19477111Ib(C11IY c11iy, C11RO c11ro) {
        this.LL = c11iy;
        this.LLILLJJLI = c11ro;
    }
}
