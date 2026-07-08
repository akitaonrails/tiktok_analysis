package X;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.08dN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2161108dN {
    public static String LIZ() {
        StringBuilder sb;
        String[] strArr;
        StringBuilder sb2 = new StringBuilder();
        try {
            strArr = Build.SUPPORTED_ABIS;
        } catch (Exception e) {
            e = e;
            sb = sb2;
        }
        if (strArr.length > 0) {
            sb = new StringBuilder();
            for (int i = 0; i < strArr.length; i++) {
                try {
                    sb.append(strArr[i]);
                    if (i != strArr.length - 1) {
                        sb.append(", ");
                    }
                } catch (Exception e2) {
                    e = e2;
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            sb2 = sb;
        }
        String string = sb2.toString();
        return TextUtils.isEmpty(string) ? "unknown" : string;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x007f A[Catch: IOException -> 0x0083, TRY_LEAVE, TryCatch #3 {IOException -> 0x0083, blocks: (B:46:0x007a, B:48:0x007f), top: B:57:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x007a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZIZ() throws java.lang.Throwable {
        /*
            java.lang.String r6 = ":"
            r2 = 0
            X.0VSF r5 = new X.0VSF     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L59
            java.lang.String r0 = "/proc/cpuinfo"
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L59
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L50
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L50
        Lf:
            java.lang.String r1 = r4.readLine()     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L53
            if (r1 == 0) goto L43
            boolean r0 = r1.contains(r6)     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L53
            if (r0 == 0) goto Lf
            java.lang.String[] r3 = r1.split(r6)     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L53
            r2 = 0
            r1 = r3[r2]     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L53
            java.lang.String r0 = "Hardware"
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L53
            if (r0 != 0) goto L34
            r1 = r3[r2]     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L53
            java.lang.String r0 = "model name"
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L53
            if (r0 == 0) goto Lf
        L34:
            r0 = 1
            r1 = r3[r0]     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L53
            r5.close()     // Catch: java.io.IOException -> L3e
            r4.close()     // Catch: java.io.IOException -> L3e
            return r1
        L3e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r1
        L43:
            r5.close()     // Catch: java.io.IOException -> L69
            r4.close()     // Catch: java.io.IOException -> L69
            goto L6d
        L4a:
            r1 = move-exception
            r4 = r2
            goto L4e
        L4d:
            r1 = move-exception
        L4e:
            r2 = r5
            goto L75
        L50:
            r0 = move-exception
            r4 = r2
            goto L54
        L53:
            r0 = move-exception
        L54:
            r2 = r5
            goto L5b
        L56:
            r1 = move-exception
            r4 = r2
            goto L75
        L59:
            r0 = move-exception
            r4 = r2
        L5b:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L74
            if (r2 == 0) goto L63
            r2.close()     // Catch: java.io.IOException -> L69
        L63:
            if (r4 == 0) goto L6d
            r4.close()     // Catch: java.io.IOException -> L69
            goto L6d
        L69:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L6d:
            java.lang.String r0 = android.os.Build.BOARD
            if (r0 != 0) goto L73
            java.lang.String r0 = "unknown"
        L73:
            return r0
        L74:
            r1 = move-exception
        L75:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L74
            if (r2 == 0) goto L7d
            r2.close()     // Catch: java.io.IOException -> L83
        L7d:
            if (r4 == 0) goto L87
            r4.close()     // Catch: java.io.IOException -> L83
            throw r1
        L83:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L87:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2161108dN.LIZIZ():java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZJ() {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2161108dN.LIZJ():java.lang.String");
    }
}
