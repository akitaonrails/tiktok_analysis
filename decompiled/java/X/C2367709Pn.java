package X;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import com.bytedance.memrelief.monitor.JniPageFault;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.09Pn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2367709Pn {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1068));

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0040, code lost:
    
        r2 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r5.substring(7, r5.indexOf("kb")).trim()) * 1024;
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long LIZ() {
        /*
            r2 = -1
            X.0VSP r4 = new X.0VSP     // Catch: java.lang.Throwable -> L82
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L82
            java.lang.String r0 = "/proc/"
            r1.append(r0)     // Catch: java.lang.Throwable -> L82
            int r0 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L82
            r1.append(r0)     // Catch: java.lang.Throwable -> L82
            java.lang.String r0 = "/status"
            r1.append(r0)     // Catch: java.lang.Throwable -> L82
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L82
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L82
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L72
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L72
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L72
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L72
        L2a:
            java.lang.String r1 = r6.readLine()     // Catch: java.lang.Throwable -> L57
            if (r1 == 0) goto L5b
            java.util.Locale r0 = java.util.Locale.getDefault()     // Catch: java.lang.Throwable -> L57
            java.lang.String r5 = r1.toLowerCase(r0)     // Catch: java.lang.Throwable -> L57
            java.lang.String r0 = "vmsize:"
            boolean r0 = r5.startsWith(r0)     // Catch: java.lang.Throwable -> L57
            if (r0 == 0) goto L2a
            java.lang.String r0 = "kb"
            int r1 = r5.indexOf(r0)     // Catch: java.lang.Throwable -> L57
            r0 = 7
            java.lang.String r0 = r5.substring(r0, r1)     // Catch: java.lang.Throwable -> L57
            java.lang.String r0 = r0.trim()     // Catch: java.lang.Throwable -> L57
            long r2 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r0)     // Catch: java.lang.Throwable -> L57
            r0 = 1024(0x400, double:5.06E-321)
            long r2 = r2 * r0
            goto L5b
        L57:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L62
        L5b:
            r6.close()     // Catch: java.lang.Throwable -> L72
            r4.close()     // Catch: java.lang.Throwable -> L82
            return r2
        L62:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L72
            r6.close()     // Catch: java.lang.Throwable -> L6a
            goto L71
        L6a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L72
            r1.addSuppressed(r0)     // Catch: java.lang.Throwable -> L72
        L71:
            throw r1     // Catch: java.lang.Throwable -> L72
        L72:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L82
            r4.close()     // Catch: java.lang.Throwable -> L7a
            goto L81
        L7a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L82
            r1.addSuppressed(r0)     // Catch: java.lang.Throwable -> L82
        L81:
            throw r1     // Catch: java.lang.Throwable -> L82
        L82:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2367709Pn.LIZ():long");
    }

    public static final long LJ() {
        return ((Number) LIZ.getValue()).longValue();
    }

    public static final long[] LJFF() {
        Object c098200Yq;
        try {
            c098200Yq = JniPageFault.LIZ.getProcessFaultsByNew();
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        long[] jArr = {0, 0};
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = jArr;
        }
        return (long[]) c098200Yq;
    }

    public static final long[] LJI() {
        Object c098200Yq;
        try {
            c098200Yq = JniPageFault.LIZ.getThreadFaultsByNew();
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        long[] jArr = {0, 0};
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = jArr;
        }
        return (long[]) c098200Yq;
    }

    public static final double LIZJ() {
        return LIZLLL() / LJ();
    }

    public static final long LIZLLL() {
        return Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
    }

    public static final boolean LJIIIZ() {
        return LJ() < 536870912;
    }

    public static final long[] LIZIZ(Context context) {
        long j;
        long j2;
        ActivityManager.MemoryInfo memoryInfo;
        ActivityManager activityManager;
        long j3 = -1;
        try {
            memoryInfo = new ActivityManager.MemoryInfo();
            activityManager = (ActivityManager) C786410Ut5.H2(C786410Ut5.N3(context), "activity");
        } catch (Throwable th) {
            th = th;
            j = -1;
        }
        if (activityManager != null) {
            C2204961BRm.LJFF(activityManager, memoryInfo, new C0WZX("dzBzEgAjS8/YVFkiQFyJY1i1X88gd6XeEgrDr8p1zFH5RdWZYEM=", null));
            j = memoryInfo.availMem;
            try {
                j3 = memoryInfo.totalMem;
            } catch (Throwable th2) {
                th = th2;
                TryCatchGuardChecker.doCheck(th);
            }
            j2 = j3;
            j3 = j;
            return new long[]{j3, j2};
        }
        j2 = -1;
        return new long[]{j3, j2};
        TryCatchGuardChecker.doCheck(th);
        j2 = j3;
        j3 = j;
        return new long[]{j3, j2};
    }

    public static final long[] LJII(int i) {
        Object c098200Yq;
        try {
            c098200Yq = JniPageFault.LIZ.getThreadFaults(i);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        long[] jArr = {0, 0};
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = jArr;
        }
        return (long[]) c098200Yq;
    }

    public static final boolean LJIIIIZZ(Context context) {
        if (LJIIIZ() || (!Process.is64Bit()) || C2188571Al5.LIZJ(C786410Ut5.N3(context), EnumC2188591Al7.LESS_THAN_2G)) {
            return true;
        }
        return false;
    }
}
