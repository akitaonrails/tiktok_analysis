package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* JADX INFO: renamed from: X.08Mt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2105708Mt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r4v3 */
    public static String LIZ(String str) throws Throwable {
        BufferedReader bufferedReader;
        ?? r4 = 0;
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            try {
                try {
                    try {
                        Runtime runtime = Runtime.getRuntime();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("getprop ");
                        sbLIZ.append(str);
                        bufferedReader = new BufferedReader(new InputStreamReader(runtime.exec(C2188811AlT.LIZIZ(sbLIZ)).getInputStream(), "UTF-8"), 1024);
                    } catch (Throwable th2) {
                        th = th2;
                        r4 = 1;
                        TryCatchGuardChecker.doCheck(th);
                        if (r4 != 0) {
                            try {
                                r4.close();
                                throw th;
                            } catch (IOException e) {
                                TryCatchGuardChecker.doCheck(e);
                                throw th;
                            }
                        }
                        throw th;
                    }
                } catch (IOException e2) {
                    e = e2;
                    bufferedReader = null;
                }
                try {
                    String line = bufferedReader.readLine();
                    bufferedReader.close();
                    try {
                        bufferedReader.close();
                        return line;
                    } catch (IOException e3) {
                        TryCatchGuardChecker.doCheck(e3);
                        return line;
                    }
                } catch (IOException e4) {
                    e = e4;
                    TryCatchGuardChecker.doCheck(e);
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                            return null;
                        } catch (IOException e5) {
                            TryCatchGuardChecker.doCheck(e5);
                            return null;
                        }
                    }
                    return null;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }
}
