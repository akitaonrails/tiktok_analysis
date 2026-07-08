package X;

import Y.AComparatorS39S0000000_20;
import android.content.Context;
import com.bytedance.common.utility.Logger;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: X.0ksy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1336580ksy {
    public static String LIZJ;
    public static String LIZLLL;
    public static String LJ;
    public static String LJFF;
    public static boolean LJI;
    public static String LJII;
    public static volatile boolean LJIIIIZZ;
    public final int LIZ = 5;
    public final int LIZIZ = 1;

    public static long LIZIZ() {
        long jLJI = 0;
        try {
            jLJI = 0 + C2112608Pk.LJI(new C0VSJ(LIZJ));
            return jLJI;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return jLJI;
        }
    }

    public C1336580ksy(Context context) {
        C786410Ut5.N3(context);
        if (!LJI) {
            synchronized (C1336580ksy.class) {
                if (LJI) {
                    return;
                }
                if (!C2093608Ic.LJ(context.getPackageName())) {
                    LJI = true;
                    File fileX2 = C786410Ut5.x2(context);
                    if (fileX2 != null || (fileX2 = C786410Ut5.x2(context)) != null || (fileX2 = C786410Ut5.w2(context)) != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(fileX2.getPath());
                        sbLIZ.append("/");
                        LIZJ = C2188811AlT.LIZIZ(sbLIZ);
                    }
                    try {
                        LJII = C2112608Pk.LJFF(context);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        LJII = null;
                    }
                    if (!C2093608Ic.LJ(LJII)) {
                        LJFF = LJII + "/hashedimages/";
                    } else {
                        LJFF = null;
                    }
                    LIZLLL = LIZJ + "hashedimages/";
                    LJ = LIZJ + "tmpimages/";
                    try {
                        if ("mounted".equals(C786410Ut5.X3())) {
                            C0VSJ c0vsj = new C0VSJ(LIZJ);
                            if (!c0vsj.exists()) {
                                c0vsj.mkdirs();
                            }
                            C0VSJ c0vsj2 = new C0VSJ(LIZLLL);
                            if (!c0vsj2.exists()) {
                                c0vsj2.mkdirs();
                            }
                            C0VSJ c0vsj3 = new C0VSJ(LJ);
                            if (!c0vsj3.exists()) {
                                c0vsj3.mkdirs();
                            }
                        }
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        Logger.debug();
                    }
                    try {
                        if (C2093608Ic.LJ(LJFF)) {
                            return;
                        }
                        C0VSJ c0vsj4 = new C0VSJ(LJFF);
                        if (!c0vsj4.exists()) {
                            c0vsj4.mkdirs();
                        }
                    } catch (Exception e3) {
                        TryCatchGuardChecker.doCheck(e3);
                    }
                }
            }
        }
    }

    public static long LIZ(long j, String str) {
        C1336590ksz c1336590ksz = new C1336590ksz();
        C1335730krb.LIZJ(new C0VSJ(str), c1336590ksz);
        ArrayList<C1336600kt0> arrayList = new ArrayList(Collections.unmodifiableList(c1336590ksz.LIZ));
        Collections.sort(arrayList, new AComparatorS39S0000000_20(12));
        long j2 = 0;
        for (C1336600kt0 c1336600kt0 : arrayList) {
            j2 += c1336600kt0.LIZIZ;
            if (j2 > j) {
                C0VSJ c0vsj = new C0VSJ(c1336600kt0.LIZJ);
                c0vsj.getName();
                try {
                    c0vsj.delete();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        return j2;
    }

    public static void LIZJ(int i, C0VSJ c0vsj) {
        File[] fileArrListFiles;
        File[] fileArrListFiles2;
        if (c0vsj.exists() && c0vsj.isDirectory() && (fileArrListFiles = c0vsj.listFiles()) != null && fileArrListFiles.length != 0) {
            for (File file : fileArrListFiles) {
                if (file.isDirectory() && file.exists() && file.isDirectory() && (fileArrListFiles2 = file.listFiles()) != null && fileArrListFiles2.length != 0) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long j = ((long) (i * 24 * 3600)) * 1000;
                    for (File file2 : fileArrListFiles2) {
                        if (file2.isFile()) {
                            file2.getName();
                            try {
                                if (jCurrentTimeMillis - file2.lastModified() > j) {
                                    file2.delete();
                                }
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }
                    }
                }
            }
        }
    }
}
