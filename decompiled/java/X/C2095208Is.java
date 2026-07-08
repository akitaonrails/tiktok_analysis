package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedReader;
import java.io.IOException;

/* JADX INFO: renamed from: X.08Is, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2095208Is {
    public static final String LIZ(int i) throws Throwable {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("/proc/self/task/");
        sbLIZ.append(i);
        sbLIZ.append("/comm");
        C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
        if (c0vsj.exists()) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new C0VSF(c0vsj));
                try {
                    String line = bufferedReader.readLine();
                    C2107108Nh.LIZ(bufferedReader, null);
                    return line;
                } catch (Throwable th) {
                    th = th;
                    try {
                        try {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        } catch (Throwable th2) {
                            th = th2;
                            th = null;
                            TryCatchGuardChecker.doCheck(th);
                            C2107108Nh.LIZ(bufferedReader, th);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                return "Unknown";
            }
        } else {
            return "Unknown";
        }
    }
}
