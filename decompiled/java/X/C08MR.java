package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: X.08MR, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08MR {
    public static C0VSJ LIZ(String str) {
        C0VSJ c0vsj = new C0VSJ(str);
        if (!c0vsj.exists()) {
            try {
                c0vsj.createNewFile();
                return c0vsj;
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return c0vsj;
    }

    public static C0VSJ LIZIZ(String str) {
        C0VSJ c0vsj = new C0VSJ(str);
        if (!c0vsj.exists()) {
            c0vsj.mkdir();
        }
        return c0vsj;
    }

    public static C0VSJ LIZJ(C0VSJ c0vsj) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c0vsj.getAbsolutePath());
        String str = File.separator;
        sbLIZ.append(str);
        sbLIZ.append("dns_domain_dump");
        C0VSJ c0vsjLIZIZ = LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(c0vsjLIZIZ.getAbsolutePath());
        sbLIZ2.append(str);
        sbLIZ2.append(System.currentTimeMillis());
        return LIZ(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public static C0VSJ LJ(C0VSJ c0vsj) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c0vsj.getAbsolutePath());
        String str = File.separator;
        sbLIZ.append(str);
        sbLIZ.append("quic_dump");
        C0VSJ c0vsjLIZIZ = LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(c0vsjLIZIZ.getAbsolutePath());
        sbLIZ2.append(str);
        sbLIZ2.append(System.currentTimeMillis());
        return LIZ(C2188811AlT.LIZIZ(sbLIZ2));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:8|(1:39)(1:40)|31|13|33|14|(5:15|(1:17)(1:41)|35|24|27)|18|35|24|27) */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x004d, code lost:
    
        r0 = r1.processName;
        X.C08MS.LIZ = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a3, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a9, code lost:
    
        r4 = r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008b A[Catch: all -> 0x0098, LOOP:1: B:15:0x0085->B:17:0x008b, LOOP_END, TryCatch #1 {all -> 0x0098, blocks: (B:14:0x0080, B:15:0x0085, B:17:0x008b, B:18:0x0090), top: B:33:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0090 A[EDGE_INSN: B:41:0x0090->B:18:0x0090 BREAK  A[LOOP:1: B:15:0x0085->B:17:0x008b], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C0VSJ LJI(android.content.Context r6) {
        /*
            java.lang.StringBuilder r5 = X.C2188811AlT.LIZ()
            java.io.File r0 = X.C786410Ut5.w2(r6)
            java.lang.String r0 = r0.getAbsolutePath()
            r5.append(r0)
            java.lang.String r0 = java.io.File.separator
            r5.append(r0)
            java.lang.String r0 = "skynet:"
            r5.append(r0)
            java.lang.String r4 = X.C08MS.LIZ
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto Laa
            r4 = 0
            int r3 = android.os.Process.myPid()     // Catch: java.lang.Exception -> L52
            java.lang.String r0 = "activity"
            java.lang.Object r2 = X.C786410Ut5.H2(r6, r0)     // Catch: java.lang.Exception -> L52
            android.app.ActivityManager r2 = (android.app.ActivityManager) r2     // Catch: java.lang.Exception -> L52
            X.0WZX r1 = new X.0WZX     // Catch: java.lang.Exception -> L52
            java.lang.String r0 = "dzBzEgAjS8/YVFkiQFyXbSYb42k9s+EwAoEmbeb0amUf9wiN+A=="
            r1.<init>(r0, r4)     // Catch: java.lang.Exception -> L52
            java.util.List r0 = X.C2204961BRm.LJII(r2, r1)     // Catch: java.lang.Exception -> L52
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Exception -> L52
        L3d:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Exception -> L52
            if (r0 == 0) goto L56
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Exception -> L52
            android.app.ActivityManager$RunningAppProcessInfo r1 = (android.app.ActivityManager.RunningAppProcessInfo) r1     // Catch: java.lang.Exception -> L52
            int r0 = r1.pid     // Catch: java.lang.Exception -> L52
            if (r0 != r3) goto L3d
            java.lang.String r0 = r1.processName     // Catch: java.lang.Exception -> L52
            X.C08MS.LIZ = r0     // Catch: java.lang.Exception -> L52
            goto La9
        L52:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L56:
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L95
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L95
            X.0VSP r2 = new X.0VSP     // Catch: java.lang.Throwable -> L95
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L95
            java.lang.String r0 = "/proc/"
            r1.append(r0)     // Catch: java.lang.Throwable -> L95
            int r0 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L95
            r1.append(r0)     // Catch: java.lang.Throwable -> L95
            java.lang.String r0 = "/cmdline"
            r1.append(r0)     // Catch: java.lang.Throwable -> L95
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L95
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L95
            java.lang.String r0 = "iso-8859-1"
            r3.<init>(r2, r0)     // Catch: java.lang.Throwable -> L95
            r6.<init>(r3)     // Catch: java.lang.Throwable -> L95
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L98
            r1.<init>()     // Catch: java.lang.Throwable -> L98
        L85:
            int r0 = r6.read()     // Catch: java.lang.Throwable -> L98
            if (r0 <= 0) goto L90
            char r0 = (char) r0     // Catch: java.lang.Throwable -> L98
            r1.append(r0)     // Catch: java.lang.Throwable -> L98
            goto L85
        L90:
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L98
            goto L9e
        L95:
            r0 = move-exception
            r6 = r4
            goto L99
        L98:
            r0 = move-exception
        L99:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            if (r6 == 0) goto La6
        L9e:
            r6.close()     // Catch: java.lang.Exception -> La2
            goto La6
        La2:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        La6:
            X.C08MS.LIZ = r4
            goto Laa
        La9:
            r4 = r0
        Laa:
            r5.append(r4)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r5)
            X.0VSJ r0 = LIZIZ(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08MR.LJI(android.content.Context):X.0VSJ");
    }

    public static String LIZLLL(C0VSJ c0vsj, boolean z) {
        if (z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(c0vsj.getAbsolutePath());
            String str = File.separator;
            sbLIZ.append(str);
            sbLIZ.append("local_dump");
            C0VSJ c0vsjLIZIZ = LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(c0vsjLIZIZ.getAbsolutePath());
            sbLIZ2.append(str);
            sbLIZ2.append(System.currentTimeMillis());
            return LIZ(C2188811AlT.LIZIZ(sbLIZ2)).getAbsolutePath();
        }
        return null;
    }

    public static String LJFF(C0VSJ c0vsj, boolean z) {
        if (z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(c0vsj.getAbsolutePath());
            String str = File.separator;
            sbLIZ.append(str);
            sbLIZ.append("quic_trace");
            C0VSJ c0vsjLIZIZ = LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(c0vsjLIZIZ.getAbsolutePath());
            sbLIZ2.append(str);
            sbLIZ2.append(System.currentTimeMillis());
            return LIZ(C2188811AlT.LIZIZ(sbLIZ2)).getAbsolutePath();
        }
        return null;
    }

    public static String LJII(C0VSJ c0vsj, boolean z) {
        if (z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(c0vsj.getAbsolutePath());
            String str = File.separator;
            sbLIZ.append(str);
            sbLIZ.append("dns_trace");
            C0VSJ c0vsjLIZIZ = LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(c0vsjLIZIZ.getAbsolutePath());
            sbLIZ2.append(str);
            sbLIZ2.append(System.currentTimeMillis());
            return LIZ(C2188811AlT.LIZIZ(sbLIZ2)).getAbsolutePath();
        }
        return null;
    }
}
