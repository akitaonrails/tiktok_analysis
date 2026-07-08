package X;

/* JADX INFO: renamed from: X.08MV, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08MV {
    public static String LIZ;

    /* JADX WARN: Can't wrap try/catch for region: R(10:5|22|6|(2:26|7)|(6:8|(1:10)(1:28)|24|17|20|21)|11|24|17|20|21) */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ() {
        /*
            java.lang.String r1 = X.C08MV.LIZ
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L9
            return r1
        L9:
            r5 = 0
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L49
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L49
            X.0VSP r2 = new X.0VSP     // Catch: java.lang.Throwable -> L49
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L49
            java.lang.String r0 = "/proc/"
            r1.append(r0)     // Catch: java.lang.Throwable -> L49
            int r0 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L49
            r1.append(r0)     // Catch: java.lang.Throwable -> L49
            java.lang.String r0 = "/cmdline"
            r1.append(r0)     // Catch: java.lang.Throwable -> L49
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L49
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L49
            java.lang.String r0 = "iso-8859-1"
            r3.<init>(r2, r0)     // Catch: java.lang.Throwable -> L49
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L49
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4c
            r1.<init>()     // Catch: java.lang.Throwable -> L4c
        L39:
            int r0 = r4.read()     // Catch: java.lang.Throwable -> L4c
            if (r0 <= 0) goto L44
            char r0 = (char) r0     // Catch: java.lang.Throwable -> L4c
            r1.append(r0)     // Catch: java.lang.Throwable -> L4c
            goto L39
        L44:
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Throwable -> L4c
            goto L52
        L49:
            r0 = move-exception
            r4 = r5
            goto L4d
        L4c:
            r0 = move-exception
        L4d:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            if (r4 == 0) goto L5a
        L52:
            r4.close()     // Catch: java.lang.Exception -> L56
            goto L5a
        L56:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L5a:
            X.C08MV.LIZ = r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08MV.LIZ():java.lang.String");
    }
}
