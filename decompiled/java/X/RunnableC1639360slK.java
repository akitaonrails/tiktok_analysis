package X;

import Y.AkS486S0100000_25;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.Future;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0slK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class RunnableC1639360slK implements Runnable, Comparable<Object> {
    public final C1639670slp LL;
    public final int LLILLJJLI;
    public final InterfaceC1487280oo2<C1639670slp, C1639400slO> LLILLL;
    public final C11PQ<C1639340slI> LLILZ;
    public volatile boolean LLILZIL;
    public volatile Future<?> LLILZLL;

    public RunnableC1639360slK() {
        throw null;
    }

    public final void LIZJ() {
        this.LLILZ.onNext(new C1639340slI(EnumC1641430sof.START, this.LL, null));
        try {
            try {
                this.LLILZ.onNext(new C1639340slI(EnumC1641430sof.SUCCESS, this.LL, this.LLILLL.apply(this.LL)));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                this.LLILZ.onNext(new C1639340slI(EnumC1641430sof.FAILED, this.LL, null));
            }
            this.LLILZ.onComplete();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLILZ.onComplete();
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("FilterDownloadTask@5202.run");
        try {
            LIZJ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FilterDownloadTask@5202.run");
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        if (obj instanceof RunnableC1639360slK) {
            boolean z = this.LLILZIL;
            RunnableC1639360slK runnableC1639360slK = (RunnableC1639360slK) obj;
            boolean z2 = runnableC1639360slK.LLILZIL;
            int i = this.LLILLJJLI;
            int i2 = runnableC1639360slK.LLILLJJLI;
            if (z == z2) {
                return Intrinsics.LJI(i, i2);
            }
            if (z) {
                return -1;
            }
            return 1;
        }
        return 0;
    }

    public RunnableC1639360slK(C1639670slp c1639670slp, int i, AkS486S0100000_25 akS486S0100000_25, C11PQ c11pq, boolean z) {
        this.LL = c1639670slp;
        this.LLILLJJLI = i;
        this.LLILLL = akS486S0100000_25;
        this.LLILZ = c11pq;
        this.LLILZIL = z;
        this.LLILZLL = null;
    }
}
