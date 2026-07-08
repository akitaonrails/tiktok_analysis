package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedReader;

/* JADX INFO: renamed from: X.1Dyt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2273571Dyt {
    public static long LIZJ(long j, long j2) {
        long j3 = j + j2;
        if (((j ^ j3) & (j2 ^ j3)) < 0) {
            return Long.MAX_VALUE;
        }
        return j3;
    }

    public static long LIZ(long j, long j2, boolean z) {
        if (j < 0) {
            return j2;
        }
        if (z) {
            return LIZJ(j, j2);
        }
        return j;
    }

    public static boolean LIZIZ(String str, C2273591Dyv c2273591Dyv, boolean z, boolean z2) {
        BufferedReader bufferedReader;
        boolean z3;
        boolean z4;
        char c;
        char cCharAt;
        try {
            bufferedReader = new BufferedReader(new C0VSF(str), 8192);
            z3 = false;
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line != null) {
                        int iIndexOf = line.indexOf(58);
                        if (iIndexOf >= 0) {
                            int i = iIndexOf + 1;
                            int length = line.length();
                            while (i < length) {
                                char cCharAt2 = line.charAt(i);
                                if (cCharAt2 != ' ' && cCharAt2 != '\t') {
                                    break;
                                }
                                i++;
                            }
                            if (i >= length || line.charAt(i) != '-') {
                                z4 = false;
                            } else {
                                i++;
                                z4 = true;
                            }
                            long j = 0;
                            while (true) {
                                c = '0';
                                if (i >= length || (cCharAt = line.charAt(i)) < '0' || cCharAt > '9') {
                                    break;
                                }
                                j = (j * 10) + ((long) (cCharAt - '0'));
                                i++;
                            }
                            if (i < length && line.charAt(i) == '.') {
                                int i2 = i + 1;
                                int i3 = 0;
                                long j2 = 0;
                                while (i2 < length) {
                                    if (i3 >= 6) {
                                        break;
                                    }
                                    char cCharAt3 = line.charAt(i2);
                                    if (cCharAt3 < c || cCharAt3 > '9') {
                                        break;
                                    }
                                    j2 = (j2 * 10) + ((long) (cCharAt3 - '0'));
                                    i3++;
                                    i2++;
                                    c = '0';
                                }
                                while (i3 < 6) {
                                    j2 *= 10;
                                    i3++;
                                }
                                j = (j * 1000000) + j2;
                            }
                            if (z4) {
                                j = -j;
                            }
                            if (line.contains("sum_exec_runtime")) {
                                if (z2) {
                                    long j3 = c2273591Dyv.LIZIZ;
                                    if (j3 < 0) {
                                        c2273591Dyv.LIZIZ = j;
                                    } else if (z) {
                                        c2273591Dyv.LIZIZ = LIZJ(j3, j);
                                    }
                                    z3 = true;
                                }
                            } else {
                                if (line.contains("iowait_sum")) {
                                    c2273591Dyv.LIZLLL = LIZ(c2273591Dyv.LIZLLL, j, z);
                                } else if (line.contains("sum_sleep_runtime")) {
                                    c2273591Dyv.LJ = LIZ(c2273591Dyv.LJ, j, z);
                                } else if (line.contains("sum_block_runtime")) {
                                    c2273591Dyv.LJFF = LIZ(c2273591Dyv.LJFF, j, z);
                                } else if (line.contains("nr_involuntary_switches")) {
                                    c2273591Dyv.LJII = LIZ(c2273591Dyv.LJII, j, z);
                                } else if (line.contains("nr_voluntary_switches")) {
                                    c2273591Dyv.LJI = LIZ(c2273591Dyv.LJI, j, z);
                                } else if (line.contains("wait_sum") && z2) {
                                    long j4 = c2273591Dyv.LIZJ;
                                    if (j4 < 0) {
                                        c2273591Dyv.LIZJ = j;
                                    } else if (z) {
                                        c2273591Dyv.LIZJ = LIZJ(j4, j);
                                    }
                                }
                                z3 = true;
                            }
                        }
                    } else {
                        try {
                            bufferedReader.close();
                            return z3;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            return z3;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                                return z3;
                            } catch (Throwable th3) {
                                TryCatchGuardChecker.doCheck(th3);
                                return z3;
                            }
                        }
                        return z3;
                    } catch (Throwable th4) {
                        TryCatchGuardChecker.doCheck(th4);
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                                throw th4;
                            } catch (Throwable th5) {
                                TryCatchGuardChecker.doCheck(th5);
                                throw th4;
                            }
                        }
                        throw th4;
                    }
                }
            }
        } catch (Throwable th6) {
            th = th6;
            bufferedReader = null;
            z3 = false;
        }
    }
}
