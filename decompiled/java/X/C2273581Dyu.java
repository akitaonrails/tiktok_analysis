package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;

/* JADX INFO: renamed from: X.1Dyu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2273581Dyu {
    public final long LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final long LJ;
    public final long LJFF;
    public final long LJI;
    public final long LJII;

    public static long LIZIZ(long j, long j2) {
        if (j < 0 || j2 < 0) {
            return -1L;
        }
        long j3 = j2 - j;
        if (j3 >= 0) {
            return j3;
        }
        return 0L;
    }

    public static long LIZJ(long j, long j2) {
        long j3 = j + j2;
        if (((j ^ j3) & (j2 ^ j3)) < 0) {
            return Long.MAX_VALUE;
        }
        return j3;
    }

    public static C2273581Dyu LIZ(C2273571Dyt c2273571Dyt) {
        File[] fileArrListFiles;
        int i;
        boolean z;
        int i2;
        boolean z2;
        C2097208Jm c2097208JmLIZLLL;
        File[] fileArrListFiles2;
        C2273591Dyv c2273591Dyv = new C2273591Dyv();
        c2273571Dyt.getClass();
        c2273591Dyv.LIZ = -1L;
        c2273591Dyv.LIZIZ = -1L;
        c2273591Dyv.LIZJ = -1L;
        c2273591Dyv.LIZLLL = -1L;
        c2273591Dyv.LJ = -1L;
        c2273591Dyv.LJFF = -1L;
        c2273591Dyv.LJI = -1L;
        c2273591Dyv.LJII = -1L;
        c2273591Dyv.LIZ = System.nanoTime();
        try {
            fileArrListFiles = new C0VSJ("/proc/self/task").listFiles();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            fileArrListFiles = null;
        }
        if (fileArrListFiles != null && fileArrListFiles.length != 0) {
            i = 0;
            long jLIZJ = 0;
            long jLIZJ2 = 0;
            for (File file : fileArrListFiles) {
                try {
                    int i3 = CastIntegerProtector.parseInt(file.getName());
                    if (i3 > 0) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("/proc/self/task/");
                        sbLIZ.append(i3);
                        sbLIZ.append("/schedstat");
                        C2097208Jm c2097208JmLIZLLL2 = C2097108Jl.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
                        if (c2097208JmLIZLLL2 != null) {
                            jLIZJ2 = C2273571Dyt.LIZJ(jLIZJ2, c2097208JmLIZLLL2.LIZ);
                            jLIZJ = C2273571Dyt.LIZJ(jLIZJ, c2097208JmLIZLLL2.LIZIZ);
                            i++;
                        }
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
            }
            if (i > 0) {
                c2273591Dyv.LIZIZ = jLIZJ2;
                c2273591Dyv.LIZJ = jLIZJ;
            }
        } else {
            i = 0;
        }
        if (i <= 0) {
            z = true;
        } else {
            z = false;
        }
        try {
            fileArrListFiles2 = new C0VSJ("/proc/self/task").listFiles();
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
        }
        if (fileArrListFiles2 != null && fileArrListFiles2.length != 0) {
            i2 = 0;
            for (File file2 : fileArrListFiles2) {
                try {
                    int i4 = CastIntegerProtector.parseInt(file2.getName());
                    if (i4 > 0) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("/proc/self/task/");
                        sbLIZ2.append(i4);
                        sbLIZ2.append("/sched");
                        if (C2273571Dyt.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2), c2273591Dyv, true, z)) {
                            i2++;
                        }
                    }
                } catch (Throwable th4) {
                    TryCatchGuardChecker.doCheck(th4);
                }
            }
        } else {
            i2 = 0;
        }
        if (i <= 0 && (c2097208JmLIZLLL = C2097108Jl.LIZLLL("/proc/self/schedstat")) != null) {
            c2273591Dyv.LIZIZ = c2097208JmLIZLLL.LIZ;
            c2273591Dyv.LIZJ = c2097208JmLIZLLL.LIZIZ;
            c2273591Dyv.LIZ = c2097208JmLIZLLL.LIZLLL;
        }
        if (i2 <= 0) {
            if (i <= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            C2273571Dyt.LIZIZ("/proc/self/sched", c2273591Dyv, false, z2);
        }
        long j = c2273591Dyv.LIZIZ;
        if (j >= 0 && c2273591Dyv.LIZJ >= 0) {
            return new C2273581Dyu(c2273591Dyv.LIZ, j, c2273591Dyv.LIZJ, c2273591Dyv.LIZLLL, c2273591Dyv.LJ, c2273591Dyv.LJFF, c2273591Dyv.LJI, c2273591Dyv.LJII);
        }
        return null;
    }

    public C2273581Dyu(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = j3;
        this.LIZLLL = j4;
        this.LJ = j5;
        this.LJFF = j6;
        this.LJI = j7;
        this.LJII = j8;
    }
}
