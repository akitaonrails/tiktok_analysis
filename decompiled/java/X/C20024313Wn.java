package X;

import java.io.File;
import kotlin.text.u;

/* JADX INFO: renamed from: X.13Wn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20024313Wn {
    public static String LIZ(String str) {
        if (str == null) {
            return null;
        }
        String str2 = File.separator;
        if (u.LJIIZILJ(str, str2, false)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("config.json");
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append(str2);
        sbLIZ2.append("config.json");
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0062: MOVE (r6 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:16777314), block:B:62:0x0063 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZIZ(java.lang.String r7) {
        /*
            X.0VSJ r0 = new X.0VSJ
            r0.<init>(r7)
            boolean r0 = r0.exists()
            r6 = 0
            if (r0 == 0) goto L7a
            X.0VSP r5 = new X.0VSP     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L36
            r5.<init>(r7)     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L36
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            java.lang.String r0 = "UTF-8"
            r4.<init>(r5, r0)     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            int r0 = r5.available()     // Catch: java.io.IOException -> L2a java.lang.Throwable -> L61
            char[] r3 = new char[r0]     // Catch: java.io.IOException -> L2a java.lang.Throwable -> L61
            r4.read(r3)     // Catch: java.io.IOException -> L28 java.lang.Throwable -> L61
            r4.close()     // Catch: java.io.IOException -> L28 java.lang.Throwable -> L61
            r5.close()     // Catch: java.io.IOException -> L28 java.lang.Throwable -> L61
            goto L4e
        L28:
            r2 = move-exception
            goto L3a
        L2a:
            r2 = move-exception
            r3 = r6
            goto L3a
        L2d:
            r1 = move-exception
            goto L63
        L2f:
            r2 = move-exception
            r4 = r6
            r3 = r6
            goto L3a
        L33:
            r1 = move-exception
            r5 = r6
            goto L63
        L36:
            r2 = move-exception
            r4 = r6
            r5 = r6
            r3 = r6
        L3a:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)     // Catch: java.lang.Throwable -> L61
            X.0fo9 r1 = X.C1141500foK.LIZ     // Catch: java.lang.Throwable -> L61
            if (r1 == 0) goto L46
            java.lang.String r0 = "ttlive_gift_render"
            r1.e(r0, r6, r2)     // Catch: java.lang.Throwable -> L61
        L46:
            if (r4 == 0) goto L4b
            r4.close()     // Catch: java.io.IOException -> L55
        L4b:
            if (r5 == 0) goto L59
            goto L51
        L4e:
            r4.close()     // Catch: java.io.IOException -> L55
        L51:
            r5.close()     // Catch: java.io.IOException -> L55
            goto L59
        L55:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L59:
            if (r3 == 0) goto L7a
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3)
            return r0
        L61:
            r1 = move-exception
        L62:
            r6 = r4
        L63:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L67
            goto L6a
        L67:
            r1 = move-exception
            r4 = r6
            goto L62
        L6a:
            if (r6 == 0) goto L6f
            r6.close()     // Catch: java.io.IOException -> L75
        L6f:
            if (r5 == 0) goto L79
            r5.close()     // Catch: java.io.IOException -> L75
            throw r1
        L75:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L79:
            throw r1
        L7a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20024313Wn.LIZIZ(java.lang.String):java.lang.String");
    }
}
