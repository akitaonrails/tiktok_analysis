package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.Future;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0saN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class RunnableC1632570saN<KEY, RESULT> implements Runnable, Comparable<Object> {
    public final KEY LL;
    public final int LLILLJJLI;
    public final InterfaceC500500Jk0<KEY, Function1<Integer, Unit>, RESULT> LLILLL;
    public volatile boolean LLILZ;
    public final C11PQ<C1632580saO<KEY, RESULT>> LLILZIL;
    public volatile Future<?> LLILZLL;

    public RunnableC1632570saN() {
        throw null;
    }

    public final void LIZJ() {
        this.LLILZIL.onNext(new C1632580saO<>(EnumC1641380soa.START, this.LL, null, null));
        try {
            try {
                AwS604S0100000_25 awS604S0100000_25 = new AwS604S0100000_25(this, 830);
                if (C1632670saX.LIZ()) {
                    this.LLILLL.apply(this.LL, awS604S0100000_25);
                } else {
                    this.LLILZIL.onNext(new C1632580saO<>(EnumC1641380soa.SUCCESS, this.LL, this.LLILLL.apply(this.LL, awS604S0100000_25), null));
                }
                if (C1632670saX.LIZ()) {
                    return;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                this.LLILZIL.onNext(new C1632580saO<>(EnumC1641380soa.FAILED, this.LL, null, e));
                if (C1632670saX.LIZ()) {
                    return;
                }
            }
            this.LLILZIL.onComplete();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C1632670saX.LIZ()) {
                this.LLILZIL.onComplete();
            }
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("DownloadTask@452f.run");
        try {
            LIZJ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DownloadTask@452f.run");
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        if (obj instanceof RunnableC1632570saN) {
            boolean z = this.LLILZ;
            RunnableC1632570saN runnableC1632570saN = (RunnableC1632570saN) obj;
            boolean z2 = runnableC1632570saN.LLILZ;
            int i = this.LLILLJJLI;
            int i2 = runnableC1632570saN.LLILLJJLI;
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

    /* JADX WARN: Multi-variable type inference failed */
    public RunnableC1632570saN(Object obj, int i, C1632720sac c1632720sac, boolean z, C11PQ c11pq) {
        this.LL = obj;
        this.LLILLJJLI = i;
        this.LLILLL = c1632720sac;
        this.LLILZ = z;
        this.LLILZIL = c11pq;
        this.LLILZLL = null;
    }
}
