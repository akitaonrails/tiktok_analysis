package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.11RN, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public abstract class C11RN implements InterfaceC420801kM {
    public abstract InterfaceC420801kM LIZJ(Runnable runnable, long j, TimeUnit timeUnit);

    public static long LIZ(TimeUnit timeUnit) {
        return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    public InterfaceC420801kM LIZIZ(Runnable runnable) {
        return LIZJ(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    public final InterfaceC420801kM LIZLLL(final Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        C19484811La c19484811La = new C19484811La();
        final C19484811La c19484811La2 = new C19484811La(c19484811La);
        C1701890uOB.LIZ(runnable, "run is null");
        final long nanos = timeUnit.toNanos(j2);
        final long jLIZ = LIZ(TimeUnit.NANOSECONDS);
        final long nanos2 = jLIZ + timeUnit.toNanos(j);
        InterfaceC420801kM interfaceC420801kMLIZJ = LIZJ(new Runnable(nanos2, runnable, jLIZ, c19484811La2, nanos) { // from class: X.11RM
            public final Runnable LL;
            public final C19484811La LLILLJJLI;
            public final long LLILLL;
            public long LLILZ;
            public long LLILZIL;
            public long LLILZLL;

            /* JADX WARN: Removed duplicated region for block: B:11:0x0044  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ() {
                /*
                    r13 = this;
                    java.lang.Runnable r0 = r13.LL
                    r0.run()
                    X.11La r0 = r13.LLILLJJLI
                    boolean r0 = r0.isDisposed()
                    if (r0 != 0) goto L43
                    X.11RN r0 = r13.LLIZ
                    java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.NANOSECONDS
                    r0.getClass()
                    long r4 = X.C11RN.LIZ(r8)
                    long r11 = X.C11RO.LIZ
                    long r6 = r4 + r11
                    long r1 = r13.LLILZIL
                    int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                    r9 = 1
                    if (r0 < 0) goto L44
                    long r6 = r13.LLILLL
                    long r1 = r1 + r6
                    long r1 = r1 + r11
                    int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                    if (r0 >= 0) goto L44
                    long r2 = r13.LLILZLL
                    long r0 = r13.LLILZ
                    long r0 = r0 + r9
                    r13.LLILZ = r0
                    long r0 = r0 * r6
                    long r2 = r2 + r0
                L35:
                    r13.LLILZIL = r4
                    long r2 = r2 - r4
                    X.11La r1 = r13.LLILLJJLI
                    X.11RN r0 = r13.LLIZ
                    X.01kM r0 = r0.LIZJ(r13, r2, r8)
                    r1.replace(r0)
                L43:
                    return
                L44:
                    long r6 = r13.LLILLL
                    long r2 = r4 + r6
                    long r0 = r13.LLILZ
                    long r0 = r0 + r9
                    r13.LLILZ = r0
                    long r6 = r6 * r0
                    long r0 = r2 - r6
                    r13.LLILZLL = r0
                    goto L35
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C11RM.LIZ():void");
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

            {
                this.LL = runnable;
                this.LLILLJJLI = c19484811La2;
                this.LLILLL = nanos;
                this.LLILZIL = jLIZ;
                this.LLILZLL = nanos2;
            }
        }, j, timeUnit);
        if (interfaceC420801kMLIZJ == C11JT.INSTANCE) {
            return interfaceC420801kMLIZJ;
        }
        c19484811La.replace(interfaceC420801kMLIZJ);
        return c19484811La2;
    }
}
