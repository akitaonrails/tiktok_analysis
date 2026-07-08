package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.util.HashMap;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: X.08VD, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08VD {
    public static final C08VE LIZ = new FileFilter() { // from class: X.08VE
        @Override // java.io.FileFilter
        public final boolean accept(File file) {
            return Pattern.matches("cpu[0-9]", file.getName());
        }
    };

    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0039 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ(java.lang.String r5) {
        /*
            java.lang.String r4 = "0"
            r3 = 0
            X.0VSJ r1 = new X.0VSJ     // Catch: java.lang.Throwable -> L2c
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L2c
            boolean r0 = r1.exists()     // Catch: java.lang.Throwable -> L2c
            if (r0 != 0) goto Lf
            return r4
        Lf:
            X.0VSF r2 = new X.0VSF     // Catch: java.lang.Throwable -> L2c
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L2c
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L26
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L26
            java.lang.String r3 = r1.readLine()     // Catch: java.lang.Throwable -> L33
            r1.close()     // Catch: java.lang.Throwable -> L21
            goto L43
        L21:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            goto L43
        L26:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r1 = r3
            goto L37
        L2c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r2 = r3
            r1 = r3
            goto L37
        L33:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L37:
            if (r1 == 0) goto L41
            r1.close()     // Catch: java.lang.Throwable -> L3d
            goto L41
        L3d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L41:
            if (r2 == 0) goto L4b
        L43:
            r2.close()     // Catch: java.lang.Throwable -> L47
            goto L4b
        L47:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L4b:
            if (r3 == 0) goto L51
            java.lang.String r4 = r3.trim()
        L51:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08VD.LIZ(java.lang.String):java.lang.String");
    }

    public static String LIZIZ(String str, HashMap map) {
        String str2;
        try {
            str2 = (String) map.get(str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            str2 = null;
        }
        return str2 == null ? "" : str2.trim();
    }

    public static HashMap<String, String> LIZJ() {
        C0VSF c0vsf;
        HashMap<String, String> map = new HashMap<>();
        BufferedReader bufferedReader = null;
        try {
            c0vsf = new C0VSF("/proc/cpuinfo");
            try {
                BufferedReader bufferedReader2 = new BufferedReader(c0vsf);
                while (true) {
                    try {
                        String line = bufferedReader2.readLine();
                        if (line == null) {
                            break;
                        }
                        String[] strArrSplit = line.split(":", 2);
                        if (strArrSplit.length >= 2) {
                            String strTrim = strArrSplit[0].trim();
                            String strTrim2 = strArrSplit[1].trim();
                            if (map.get(strTrim) == null) {
                                map.put(strTrim, strTrim2);
                            }
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                            }
                        }
                        if (c0vsf != null) {
                        }
                        return map;
                    }
                }
                try {
                    bufferedReader2.close();
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                }
            } catch (Throwable th4) {
                TryCatchGuardChecker.doCheck(th4);
            }
        } catch (Throwable th5) {
            TryCatchGuardChecker.doCheck(th5);
            c0vsf = null;
        }
        try {
            c0vsf.close();
            return map;
        } catch (Throwable th6) {
            TryCatchGuardChecker.doCheck(th6);
            return map;
        }
    }
}
