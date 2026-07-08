package X;

import android.app.ActivityManager;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1Al5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2188571Al5 {
    public static volatile long LIZ = -1;
    public static volatile int LIZIZ = -1;

    public static long LIZ(Context context) {
        long j = -1;
        try {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ActivityManager activityManager = (ActivityManager) C786410Ut5.H2(C786410Ut5.N3(context), "activity");
            if (activityManager != null) {
                C2204961BRm.LJFF(activityManager, memoryInfo, new C0WZX("dzBzEgAjS8/YVFkiQFyJY1i1X88gd6XeEgrDr8p1zFH5RdWZYEM=", null));
                j = memoryInfo.availMem;
                return j;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return j;
    }

    public static long LIZIZ(Context context) {
        if (LIZ > 0) {
            return LIZ;
        }
        long j = -1;
        try {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ActivityManager activityManager = (ActivityManager) C786410Ut5.H2(C786410Ut5.N3(context), "activity");
            if (activityManager != null) {
                C2204961BRm.LJFF(activityManager, memoryInfo, new C0WZX("dzBzEgAjS8/YVFkiQFyJY1i1X88gd6XeEgrDr8p1zFH5RdWZYEM=", null));
                j = memoryInfo.totalMem;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        LIZ = j;
        return LIZ;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZJ(android.content.Context r6, X.EnumC2188591Al7 r7) {
        /*
            long r5 = LIZIZ(r6)
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            r4 = 0
            if (r0 > 0) goto Lc
            return r4
        Lc:
            int[] r1 = X.C2188621AlA.LIZ
            int r0 = r7.ordinal()
            r0 = r1[r0]
            r3 = 1
            switch(r0) {
                case 1: goto L19;
                case 2: goto L24;
                case 3: goto L2f;
                case 4: goto L3a;
                case 5: goto L45;
                case 6: goto L50;
                case 7: goto L5b;
                default: goto L18;
            }
        L18:
            return r4
        L19:
            X.1Al7 r0 = X.EnumC2188591Al7.LESS_THAN_4G
            long r1 = r0.getSize()
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L18
            return r3
        L24:
            X.1Al7 r0 = X.EnumC2188591Al7.LESS_THAN_3_5G
            long r1 = r0.getSize()
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L18
            return r3
        L2f:
            X.1Al7 r0 = X.EnumC2188591Al7.LESS_THAN_3G
            long r1 = r0.getSize()
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L18
            return r3
        L3a:
            X.1Al7 r0 = X.EnumC2188591Al7.LESS_THAN_2G
            long r1 = r0.getSize()
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L18
            return r3
        L45:
            X.1Al7 r0 = X.EnumC2188591Al7.LESS_THAN_1_8G
            long r1 = r0.getSize()
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L18
            return r3
        L50:
            X.1Al7 r0 = X.EnumC2188591Al7.LESS_THAN_1_75G
            long r1 = r0.getSize()
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L18
            return r3
        L5b:
            X.1Al7 r0 = X.EnumC2188591Al7.LESS_THAN_1G
            long r1 = r0.getSize()
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L18
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2188571Al5.LIZJ(android.content.Context, X.1Al7):boolean");
    }
}
