package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedReader;

/* JADX INFO: renamed from: X.08Jl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2097108Jl {
    public static C2097208Jm LIZIZ(String str) {
        try {
            int length = str.length();
            long jLIZJ = LIZJ(0, str);
            int iLIZ = LIZ(0, str) + 1;
            if (iLIZ > 0 && iLIZ < length) {
                long jLIZJ2 = LIZJ(iLIZ, str);
                int iLIZ2 = LIZ(iLIZ, str) + 1;
                if (iLIZ2 > 0 && iLIZ2 < length) {
                    int iLIZ3 = LIZ(iLIZ2, str);
                    if (iLIZ3 < 0) {
                        iLIZ3 = str.length();
                    }
                    return new C2097208Jm(jLIZJ, jLIZJ2, CastLongProtector.parseLong(str.substring(iLIZ2, iLIZ3).trim()), System.nanoTime());
                }
            }
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public static C2097208Jm LIZLLL(String str) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new C0VSF(str), 96);
            try {
                String line = bufferedReader.readLine();
                if (line == null) {
                    bufferedReader.close();
                    return null;
                }
                C2097208Jm c2097208JmLIZIZ = LIZIZ(line);
                bufferedReader.close();
                return c2097208JmLIZIZ;
            } finally {
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
        TryCatchGuardChecker.doCheck(th);
        return null;
    }

    public static int LIZ(int i, String str) {
        int length = str.length();
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\t') {
                i++;
            } else {
                return i;
            }
        }
        return -1;
    }

    public static long LIZJ(int i, String str) {
        int length = str.length();
        long j = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt < '0' || cCharAt > '9') {
                break;
            }
            j = (j * 10) + ((long) (cCharAt - '0'));
            i++;
        }
        return j;
    }
}
