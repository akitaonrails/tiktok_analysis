package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11Rg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class RunnableC19501011Rg extends AtomicReference<InterfaceC420801kM> implements Runnable, C09JN<InterfaceC420801kM> {
    public static final long serialVersionUID = -4552101107598366241L;
    public final C19500811Re<?> LL;
    public long LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.LL.LJLLLLLL(this);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    public RunnableC19501011Rg(C19500811Re<?> c19500811Re) {
        this.LL = c19500811Re;
    }

    @Override // X.C09JN
    public final void accept(InterfaceC420801kM interfaceC420801kM) {
        InterfaceC420801kM interfaceC420801kM2 = interfaceC420801kM;
        C11JE.replace(this, interfaceC420801kM2);
        synchronized (this.LL) {
            try {
                if (this.LLILZ) {
                    ((InterfaceC19501111Rh) this.LL.LL).LIZ(interfaceC420801kM2);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
