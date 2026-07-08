package X;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: X.0Vhb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C804770Vhb {
    public static boolean LJFF;
    public static volatile Boolean LJII;
    public static boolean LJIIIIZZ;
    public static boolean LJIIIZ;
    public static final C804770Vhb LIZ = new C804770Vhb();
    public static final boolean LIZIZ = C0C64.LJIILLIIL().LJIIIZ(31744, "restore_mock_android_version", true, false);
    public static String LIZJ = "";
    public static String LIZLLL = "";
    public static long LJ = -1;
    public static final C01GW LJI = C452501pT.LIZIZ(new C804790Vhd());

    public static Keva LJI() {
        return (Keva) LJI.getValue();
    }

    public static ApplicationExitInfo LJ(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return (ApplicationExitInfo) C13LP.LJJJLL(((ActivityManager) C786410Ut5.H2(context, "activity")).getHistoricalProcessExitReasons(context.getPackageName(), 0, 1));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public static long LJFF(Context context) {
        long j = LJ;
        long timestamp = 0;
        if (j > 0) {
            return j;
        }
        if (Build.VERSION.SDK_INT >= 30 && !LIZIZ) {
            ApplicationExitInfo applicationExitInfoLJ = LJ(context);
            if (applicationExitInfoLJ != null) {
                timestamp = applicationExitInfoLJ.getTimestamp();
            }
        } else {
            boolean z = LJI().getBoolean("low_memory", false);
            long j2 = LJI().getLong("exit_by_exception_time", 0L);
            if (j2 > 0) {
                timestamp = j2;
            } else if (z) {
                timestamp = LJI().getLong("low_memory_time", 0L);
            } else {
                timestamp = LJI().getLong("in_background_time", 0L);
            }
        }
        LJ = timestamp;
        return timestamp;
    }

    public final boolean LIZ(Context context) {
        Boolean boolValueOf = LJII;
        if (boolValueOf == null) {
            synchronized (this) {
                try {
                    boolValueOf = LJII;
                    if (boolValueOf == null) {
                        boolValueOf = Boolean.valueOf(LIZ.LIZIZ(context));
                        LJII = boolValueOf;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return boolValueOf.booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZIZ(android.content.Context r9) {
        /*
            r8 = this;
            int r1 = android.os.Build.VERSION.SDK_INT
            r6 = 3
            r0 = 30
            r7 = 0
            if (r1 < r0) goto L36
            boolean r0 = X.C804770Vhb.LIZIZ
            if (r0 != 0) goto L36
            android.app.ApplicationExitInfo r1 = LJ(r9)
            if (r1 == 0) goto L1f
            int r0 = r1.getReason()
            if (r0 < r6) goto L1f
            int r1 = r1.getReason()
            r0 = 6
            if (r1 <= r0) goto L55
        L1f:
            r3 = 1
        L20:
            LIZJ(r9, r7)
            LJFF(r9)
            X.1DFB r0 = X.C0PEM.LIZJ
            X.054G r2 = X.C2296808zG.LIZ(r0)
            X.0Vhf r1 = new X.0Vhf
            r0 = 0
            r1.<init>(r0)
            X.C23250099c.LIZLLL(r2, r0, r0, r1, r6)
            return r3
        L36:
            com.bytedance.keva.Keva r1 = LJI()
            java.lang.String r0 = "low_memory"
            boolean r5 = r1.getBoolean(r0, r7)
            com.bytedance.keva.Keva r3 = LJI()
            java.lang.String r2 = "exit_by_exception_time"
            r0 = -1
            long r3 = r3.getLong(r2, r0)
            if (r5 != 0) goto L55
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L55
            goto L1f
        L55:
            r3 = 0
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C804770Vhb.LIZIZ(android.content.Context):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00de, code lost:
    
        if (r2.intValue() == 6) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LIZJ(android.content.Context r8, boolean r9) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C804770Vhb.LIZJ(android.content.Context, boolean):java.lang.String");
    }

    public static final long LIZLLL(long j, Context context) {
        ApplicationExitInfo applicationExitInfoPrevious;
        long timestamp = 0;
        if (Build.VERSION.SDK_INT >= 30 && !LIZIZ) {
            if (context == null) {
                return 0L;
            }
            try {
                List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) C786410Ut5.H2(context, "activity")).getHistoricalProcessExitReasons(context.getPackageName(), 0, 0);
                ListIterator<ApplicationExitInfo> listIterator = historicalProcessExitReasons.listIterator(historicalProcessExitReasons.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        applicationExitInfoPrevious = listIterator.previous();
                        if (applicationExitInfoPrevious.getTimestamp() > j) {
                            break;
                        }
                    } else {
                        applicationExitInfoPrevious = null;
                        break;
                    }
                }
                ApplicationExitInfo applicationExitInfo = applicationExitInfoPrevious;
                if (applicationExitInfo != null) {
                    timestamp = applicationExitInfo.getTimestamp();
                    return timestamp;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return timestamp;
    }
}
