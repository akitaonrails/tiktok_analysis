package X;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashSet;

/* JADX INFO: renamed from: X.0VHp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class RunnableC795270VHp implements Runnable {
    public final C795280VHq LL;
    public final C795230VHl LLILLJJLI = new C795230VHl();

    static {
        C0VI8.LIZIZ("EnqueueRunnable");
    }

    public final void LIZ() {
        try {
            C795280VHq c795280VHq = this.LL;
            c795280VHq.getClass();
            if (C795280VHq.LIZIZ(c795280VHq, new HashSet())) {
                throw new IllegalStateException(C786410Ut5.j4("WorkContinuation has cycles (%s)", new Object[]{this.LL}));
            }
            WorkDatabase workDatabase = this.LL.LIZ.LIZJ;
            workDatabase.beginTransaction();
            try {
                boolean zLIZIZ = LIZIZ(this.LL);
                workDatabase.setTransactionSuccessful();
                workDatabase.endTransaction();
                if (zLIZIZ) {
                    C2455509jl.LIZ(this.LL.LIZ.LIZ, RescheduleReceiver.class, true);
                    C0VI1 c0vi1 = this.LL.LIZ;
                    C0VHR.LIZ(c0vi1.LIZIZ, c0vi1.LIZJ, c0vi1.LJ);
                }
                this.LLILLJJLI.LIZ(InterfaceC795220VHk.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                workDatabase.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            this.LLILLJJLI.LIZ(new C795200VHi(th2));
        }
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

    public RunnableC795270VHp(C795280VHq c795280VHq) {
        this.LL = c795280VHq;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01d2 A[PHI: r4 r7 r18 r19 r20
      0x01d2: PHI (r4v3 boolean) = (r4v2 boolean), (r4v2 boolean), (r4v2 boolean), (r4v5 boolean), (r4v6 boolean) binds: [B:37:0x00ba, B:38:0x00bc, B:40:0x00ce, B:147:0x0310, B:99:0x01d1] A[DONT_GENERATE, DONT_INLINE]
      0x01d2: PHI (r7v2 java.lang.String[]) = 
      (r7v1 java.lang.String[])
      (r7v1 java.lang.String[])
      (r7v1 java.lang.String[])
      (r7v5 java.lang.String[])
      (r7v5 java.lang.String[])
     binds: [B:37:0x00ba, B:38:0x00bc, B:40:0x00ce, B:147:0x0310, B:99:0x01d1] A[DONT_GENERATE, DONT_INLINE]
      0x01d2: PHI (r18v2 boolean) = (r18v1 boolean), (r18v1 boolean), (r18v1 boolean), (r18v5 boolean), (r18v5 boolean) binds: [B:37:0x00ba, B:38:0x00bc, B:40:0x00ce, B:147:0x0310, B:99:0x01d1] A[DONT_GENERATE, DONT_INLINE]
      0x01d2: PHI (r19v2 boolean) = (r19v1 boolean), (r19v1 boolean), (r19v1 boolean), (r19v5 boolean), (r19v5 boolean) binds: [B:37:0x00ba, B:38:0x00bc, B:40:0x00ce, B:147:0x0310, B:99:0x01d1] A[DONT_GENERATE, DONT_INLINE]
      0x01d2: PHI (r20v2 boolean) = (r20v1 boolean), (r20v1 boolean), (r20v1 boolean), (r20v4 boolean), (r20v4 boolean) binds: [B:37:0x00ba, B:38:0x00bc, B:40:0x00ce, B:147:0x0310, B:99:0x01d1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZIZ(X.C795280VHq r21) {
        /*
            Method dump skipped, instruction units count: 841
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC795270VHp.LIZIZ(X.0VHq):boolean");
    }
}
