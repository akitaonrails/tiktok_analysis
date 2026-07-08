package X;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import android.os.Process;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0VGK, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VGK {
    /* JADX WARN: Removed duplicated region for block: B:38:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static aa3.a LIZ() {
        /*
            X.01GW r0 = X.C0AQI.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r9 = 360(0x168, double:1.78E-321)
            if (r0 == 0) goto L38
            aa3.a r8 = new aa3.a
            r8.<init>()
            X.0VTm r1 = new X.0VTm     // Catch: java.lang.Throwable -> L33
            r1.<init>()     // Catch: java.lang.Throwable -> L33
            r1.LIZ()     // Catch: java.lang.Throwable -> L33
            java.lang.Thread.sleep(r9)     // Catch: java.lang.InterruptedException -> L21 java.lang.Throwable -> L33
            goto L25
        L21:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L33
        L25:
            r1.LIZ()     // Catch: java.lang.Throwable -> L33
            X.0VTl r2 = r1.LJI     // Catch: java.lang.Throwable -> L33
            double r0 = r2.LIZ     // Catch: java.lang.Throwable -> L33
            r8.LIZ = r0     // Catch: java.lang.Throwable -> L33
            double r0 = r2.LIZIZ     // Catch: java.lang.Throwable -> L33
            r8.LIZIZ = r0     // Catch: java.lang.Throwable -> L33
            return r8
        L33:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r8
        L38:
            aa3.a r8 = new aa3.a
            r8.<init>()
            long r13 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> Laf
            long r2 = X.C08OX.LIZIZ()     // Catch: java.lang.Exception -> Laf
            int r0 = X.C08OX.LIZJ     // Catch: java.lang.Exception -> Laf
            r4 = 1
            if (r0 != 0) goto L64
            X.0VSJ r1 = new X.0VSJ     // Catch: java.lang.Exception -> Laf
            java.lang.String r0 = "/proc/stat"
            r1.<init>(r0)     // Catch: java.lang.Exception -> Laf
            boolean r0 = r1.exists()     // Catch: java.lang.Exception -> Laf
            if (r0 == 0) goto L60
            boolean r0 = r1.canRead()     // Catch: java.lang.Exception -> Laf
            if (r0 == 0) goto L60
            X.C08OX.LIZJ = r4     // Catch: java.lang.Exception -> Laf
            goto L66
        L60:
            r0 = 2
            X.C08OX.LIZJ = r0     // Catch: java.lang.Exception -> Laf
            goto L6b
        L64:
            if (r0 != r4) goto L6b
        L66:
            r11 = 0
            if (r4 == 0) goto L72
            goto L6d
        L6b:
            r4 = 0
            goto L66
        L6d:
            long r6 = X.C08OX.LJII()     // Catch: java.lang.Exception -> Laf
            goto L74
        L72:
            r6 = 0
        L74:
            java.lang.Thread.sleep(r9)     // Catch: java.lang.InterruptedException -> L78 java.lang.Exception -> Laf
            goto L7c
        L78:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Exception -> Laf
        L7c:
            long r9 = X.C08OX.LIZIZ()     // Catch: java.lang.Exception -> Laf
            if (r4 == 0) goto L92
            long r4 = X.C08OX.LJII()     // Catch: java.lang.Exception -> Laf
            long r4 = r4 - r6
            int r0 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r0 <= 0) goto L92
            float r1 = (float) r9     // Catch: java.lang.Exception -> Laf
            float r0 = (float) r2     // Catch: java.lang.Exception -> Laf
            float r1 = r1 - r0
            float r0 = (float) r4     // Catch: java.lang.Exception -> Laf
            float r1 = r1 / r0
            double r6 = (double) r1     // Catch: java.lang.Exception -> Laf
            goto L94
        L92:
            r6 = 0
        L94:
            double r4 = (double) r9     // Catch: java.lang.Exception -> Laf
            double r0 = (double) r2     // Catch: java.lang.Exception -> Laf
            double r4 = r4 - r0
            r0 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r4 = r4 * r0
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> Laf
            long r2 = r2 - r13
            double r0 = (double) r2     // Catch: java.lang.Exception -> Laf
            double r4 = r4 / r0
            long r2 = X.C08OX.LJFF()     // Catch: java.lang.Exception -> Laf
            double r0 = (double) r2     // Catch: java.lang.Exception -> Laf
            double r4 = r4 / r0
            r8.LIZ = r6     // Catch: java.lang.Exception -> Laf
            r8.LIZIZ = r4     // Catch: java.lang.Exception -> Laf
            return r8
        Laf:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0VGK.LIZ():aa3.a");
    }

    public static C0VGL LIZIZ(Context context) {
        C0VGL c0vgl = new C0VGL();
        try {
            long j = Runtime.getRuntime().totalMemory();
            long jFreeMemory = Runtime.getRuntime().freeMemory();
            c0vgl.LIZ = j;
            c0vgl.LIZIZ = jFreeMemory;
            c0vgl.LIZJ = j - jFreeMemory;
            int iMyPid = Process.myPid();
            Debug.MemoryInfo memoryInfo = null;
            if (context != null) {
                try {
                    ActivityManager activityManager = (ActivityManager) C786410Ut5.H2(context, "activity");
                    if (activityManager != null) {
                        memoryInfo = activityManager.getProcessMemoryInfo(new int[]{iMyPid})[0];
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            if (memoryInfo != null) {
                int i = memoryInfo.dalvikPss;
                int i2 = memoryInfo.nativePss;
                int totalPss = memoryInfo.getTotalPss();
                try {
                    c0vgl.LJI = ((long) CastIntegerProtector.parseInt(memoryInfo.getMemoryStat("summary.graphics"))) * 1024;
                    CastIntegerProtector.parseInt(memoryInfo.getMemoryStat("summary.java-heap"));
                    CastIntegerProtector.parseInt(memoryInfo.getMemoryStat("summary.native-heap"));
                    CastIntegerProtector.parseInt(memoryInfo.getMemoryStat("summary.code"));
                    CastIntegerProtector.parseInt(memoryInfo.getMemoryStat("summary.stack"));
                    CastIntegerProtector.parseInt(memoryInfo.getMemoryStat("summary.private-other"));
                    CastIntegerProtector.parseInt(memoryInfo.getMemoryStat("summary.system"));
                    CastIntegerProtector.parseInt(memoryInfo.getMemoryStat("summary.total-pss"));
                    CastIntegerProtector.parseInt(memoryInfo.getMemoryStat("summary.total-swap"));
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
                c0vgl.LIZLLL = ((long) i) * 1024;
                c0vgl.LJ = ((long) i2) * 1024;
                c0vgl.LJFF = ((long) totalPss) * 1024;
                memoryInfo.getTotalSwappablePss();
                memoryInfo.getTotalPrivateDirty();
                memoryInfo.getTotalSharedClean();
            }
            c0vgl.LJII = C08OX.LJIIIIZZ() * 1024;
            return c0vgl;
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
            return c0vgl;
        }
    }
}
