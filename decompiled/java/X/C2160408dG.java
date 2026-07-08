package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;

/* JADX INFO: renamed from: X.08dG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2160408dG {
    public static File LIZ(Context context, String str) {
        boolean z;
        if (context != null) {
            String strX3 = C786410Ut5.X3();
            boolean zEquals = false;
            if (!"mounted".equals(strX3) && !"mounted_ro".equals(strX3)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                try {
                    zEquals = "mounted".equals(C786410Ut5.X3());
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1520960pgM.LIZIZ(e);
                }
                if (zEquals) {
                    File fileY2 = C786410Ut5.y2(context, str);
                    if (fileY2 != null && !fileY2.exists() && !fileY2.mkdirs()) {
                        C1520960pgM.LIZIZ(new Throwable("Failed to mkdirs!"));
                    }
                    return fileY2;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0067: MOVE (r4 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:33554535), block:B:45:0x0067 */
    /* JADX WARN: Removed duplicated region for block: B:63:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized void LIZIZ(java.lang.String r7, java.lang.String r8) {
        /*
            java.lang.Class<X.08dG> r6 = X.C2160408dG.class
            monitor-enter(r6)
            if (r7 != 0) goto L7
            monitor-exit(r6)
            return
        L7:
            if (r8 != 0) goto Lb
            monitor-exit(r6)
            return
        Lb:
            X.0VSJ r5 = new X.0VSJ     // Catch: java.lang.Throwable -> L77
            r5.<init>(r7)     // Catch: java.lang.Throwable -> L77
            r4 = 0
            boolean r0 = r5.exists()     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L52
            r3 = 1
            if (r0 != 0) goto L3b
            java.io.File r1 = r5.getParentFile()     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L52
            if (r1 == 0) goto L2a
            boolean r0 = r1.exists()     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L52
            if (r0 != 0) goto L2a
            boolean r0 = r1.mkdirs()     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L52
            if (r0 == 0) goto L3b
        L2a:
            boolean r0 = r5.exists()     // Catch: java.io.IOException -> L34 java.lang.Throwable -> L50
            if (r0 != 0) goto L3b
            r5.createNewFile()     // Catch: java.io.IOException -> L34 java.lang.Throwable -> L50
            goto L3b
        L34:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L52
            X.C1520960pgM.LIZIZ(r0)     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L52
        L3b:
            X.0VDn r2 = new X.0VDn     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L52
            r2.<init>(r5, r3)     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L52
            r2.write(r8)     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4e
            r2.flush()     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4e
            r2.close()     // Catch: java.io.IOException -> L4a java.lang.Throwable -> L77
            goto L64
        L4a:
            r0 = move-exception
            goto L61
        L4c:
            r1 = move-exception
            goto L69
        L4e:
            r0 = move-exception
            goto L54
        L50:
            r1 = move-exception
            goto L68
        L52:
            r0 = move-exception
            r2 = r4
        L54:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L66
            X.C1520960pgM.LIZIZ(r0)     // Catch: java.lang.Throwable -> L66
            if (r2 == 0) goto L64
            r2.close()     // Catch: java.io.IOException -> L60 java.lang.Throwable -> L77
            goto L64
        L60:
            r0 = move-exception
        L61:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L77
        L64:
            monitor-exit(r6)
            return
        L66:
            r1 = move-exception
            r4 = r2
        L68:
            r2 = r4
        L69:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L66
            if (r2 == 0) goto L76
            r2.close()     // Catch: java.io.IOException -> L72 java.lang.Throwable -> L77
            goto L76
        L72:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L77
        L76:
            throw r1     // Catch: java.lang.Throwable -> L77
        L77:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2160408dG.LIZIZ(java.lang.String, java.lang.String):void");
    }
}
