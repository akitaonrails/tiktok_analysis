package X;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.11RO, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public abstract class C11RO {
    public static final long LIZ = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    public abstract C11RN LIZ();

    public InterfaceC420801kM LIZIZ(Runnable runnable) {
        return LIZJ(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    public InterfaceC420801kM LIZJ(Runnable runnable, long j, TimeUnit timeUnit) {
        C11RN c11rnLIZ = LIZ();
        C1701890uOB.LIZ(runnable, "run is null");
        C11RR c11rr = new C11RR(runnable, c11rnLIZ);
        c11rnLIZ.LIZJ(c11rr, j, timeUnit);
        return c11rr;
    }

    public InterfaceC420801kM LIZLLL(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        C11RN c11rnLIZ = LIZ();
        C1701890uOB.LIZ(runnable, "run is null");
        C11R2 c11r2 = new C11R2(runnable, c11rnLIZ);
        InterfaceC420801kM interfaceC420801kMLIZLLL = c11rnLIZ.LIZLLL(c11r2, j, j2, timeUnit);
        if (interfaceC420801kMLIZLLL == C11JT.INSTANCE) {
            return interfaceC420801kMLIZLLL;
        }
        return c11r2;
    }
}
