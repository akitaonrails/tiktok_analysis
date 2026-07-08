package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11Nz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class RunnableC19492511Nz extends AtomicLong implements C11LR, Runnable {
    public static final long serialVersionUID = -2809475196591179431L;
    public final C11M9<? super Long> LL;
    public long LLILLJJLI;
    public final AtomicReference<InterfaceC420801kM> LLILLL = new AtomicReference<>();

    public final void LIZ() {
        if (this.LLILLL.get() != C11JE.DISPOSED) {
            if (get() != 0) {
                C11M9<? super Long> c11m9 = this.LL;
                long j = this.LLILLJJLI;
                this.LLILLJJLI = j + 1;
                c11m9.onNext(Long.valueOf(j));
                C19492311Nx.LIZJ(this, 1L);
                return;
            }
            C11M9<? super Long> c11m92 = this.LL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Can't deliver value ");
            sbLIZ.append(this.LLILLJJLI);
            sbLIZ.append(" due to lack of requests");
            c11m92.onError(new C11MF(C2188811AlT.LIZIZ(sbLIZ)));
            C11JE.dispose(this.LLILLL);
        }
    }

    @Override // X.C11LR
    public final void cancel() {
        C11JE.dispose(this.LLILLL);
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

    public RunnableC19492511Nz(C11M9<? super Long> c11m9) {
        this.LL = c11m9;
    }

    @Override // X.C11LR
    public final void request(long j) {
        if (C11NC.validate(j)) {
            C19492311Nx.LIZ(this, j);
        }
    }
}
