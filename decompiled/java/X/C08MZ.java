package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedReader;
import java.io.IOException;

/* JADX INFO: renamed from: X.08MZ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08MZ {
    public static String LIZ;
    public static Boolean LIZIZ;

    public static String LIZ(int i) {
        BufferedReader bufferedReader;
        if (!TextUtils.isEmpty(LIZ)) {
            return LIZ;
        }
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("/proc/");
            sbLIZ.append(i);
            sbLIZ.append("/cmdline");
            bufferedReader = new BufferedReader(new C0VSF(C2188811AlT.LIZIZ(sbLIZ)));
            try {
                String line = bufferedReader.readLine();
                if (!TextUtils.isEmpty(line)) {
                    line = line.trim();
                }
                LIZ = line;
                try {
                    bufferedReader.close();
                    return line;
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                    return line;
                }
            } catch (Throwable th) {
                th = th;
                try {
                    TryCatchGuardChecker.doCheck(th);
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                            return null;
                        } catch (IOException e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            return null;
                        }
                    }
                    return null;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                            throw th2;
                        } catch (IOException e3) {
                            TryCatchGuardChecker.doCheck(e3);
                            throw th2;
                        }
                    }
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = null;
        }
    }
}
