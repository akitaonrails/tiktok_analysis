package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11IZ, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11IZ extends AtomicReference<InterfaceC420801kM> implements C11IY, Runnable, InterfaceC420801kM {
    public static final long serialVersionUID = 465972761105851022L;
    public final C11IY LL;
    public final long LLILLJJLI;
    public final TimeUnit LLILLL;
    public final C11RO LLILZ;
    public final boolean LLILZIL;
    public Throwable LLILZLL;

    @Override // X.C11IY
    public final void onComplete() {
        C11JE.replace(this, this.LLILZ.LIZJ(this, this.LLILLJJLI, this.LLILLL));
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Throwable th = this.LLILZLL;
            this.LLILZLL = null;
            if (th != null) {
                this.LL.onError(th);
            } else {
                this.LL.onComplete();
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
        long j;
        this.LLILZLL = th;
        C11RO c11ro = this.LLILZ;
        if (this.LLILZIL) {
            j = this.LLILLJJLI;
        } else {
            j = 0;
        }
        C11JE.replace(this, c11ro.LIZJ(this, j, this.LLILLL));
    }

    @Override // X.C11IY
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        if (C11JE.setOnce(this, interfaceC420801kM)) {
            this.LL.onSubscribe(this);
        }
    }

    public C11IZ(C11IY c11iy, long j, TimeUnit timeUnit, C11RO c11ro, boolean z) {
        this.LL = c11iy;
        this.LLILLJJLI = j;
        this.LLILLL = timeUnit;
        this.LLILZ = c11ro;
        this.LLILZIL = z;
    }
}
