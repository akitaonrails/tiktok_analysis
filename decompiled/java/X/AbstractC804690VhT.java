package X;

import android.os.Process;
import android.os.Trace;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0VhT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC804690VhT {
    public C804730VhX[] LIZ;
    public C804730VhX LIZIZ;
    public int LIZJ;
    public boolean LIZLLL;
    public boolean LJ;

    public abstract boolean LJI();

    public abstract void LJIILJJIL(String[] strArr);

    public void LIZ() throws Throwable {
        if (!this.LIZLLL || this.LIZ == null) {
            return;
        }
        if (this.LJ) {
            LJIIIZ(false);
            for (int i = 0; i < this.LIZ.length; i++) {
            }
            if (C2187451AjH.LJIIJ()) {
                Trace.beginSection("All cpu");
            }
        } else {
            C804730VhX c804730VhXLJIIJ = LJIIJ(false);
            int i2 = this.LIZJ + 1;
            this.LIZJ = i2;
            this.LIZJ = i2 % this.LIZ.length;
            if (c804730VhXLJIIJ == null) {
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cpu = ");
            sbLIZ.append(c804730VhXLJIIJ.LIZ);
            sbLIZ.append(" use = ");
            sbLIZ.append(c804730VhXLJIIJ.LJI);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (C2187451AjH.LJIIJ()) {
                Trace.beginSection(strLIZIZ);
            }
        }
        if (C2187451AjH.LJIIJ()) {
            Trace.endSection();
        }
    }

    public final void LJ() {
        if (!this.LIZLLL && LJI()) {
            LJIIJJI();
            this.LIZLLL = true;
        }
    }

    public final void LJIIJJI() {
        File[] fileArrListFiles;
        try {
            if (C2187451AjH.LJIIJ()) {
                Trace.beginSection("init");
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("/proc/");
            sbLIZ.append(Process.myPid());
            sbLIZ.append("/task/");
            C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
            if (c0vsj.isDirectory() && (fileArrListFiles = c0vsj.listFiles()) != null) {
                for (File file : fileArrListFiles) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(file.getPath());
                    sbLIZ2.append("/stat");
                    String strLJIIIIZZ = LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ2));
                    if (!strLJIIIIZZ.isEmpty()) {
                        try {
                            String[] strArr = new String[2];
                            char[] charArray = strLJIIIIZZ.toCharArray();
                            String str = null;
                            int i = 0;
                            int i2 = 0;
                            String str2 = null;
                            while (true) {
                                if (i >= charArray.length) {
                                    break;
                                }
                                char c = charArray[i];
                                if (c != ' ') {
                                    if (c != '(') {
                                        if (c == ')') {
                                            str = new String(charArray, i2, i - i2);
                                            break;
                                        }
                                    } else {
                                        i2 = i + 1;
                                    }
                                } else if (str2 == null) {
                                    str2 = new String(charArray, 0, i);
                                }
                                i++;
                            }
                            strArr[0] = str2;
                            strArr[1] = str;
                            LJIILJJIL(strArr);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                }
            }
            if (C2187451AjH.LJIIJ()) {
                Trace.endSection();
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    public final void LJIIL() throws Throwable {
        if (!this.LIZLLL || this.LIZ == null) {
            return;
        }
        if (this.LJ) {
            LJIIIZ(true);
        } else {
            LJIIJ(true);
        }
    }

    public static long LJII(String str) {
        if (str != null && !str.isEmpty()) {
            char[] charArray = str.toCharArray();
            String str2 = null;
            int i = 0;
            String str3 = null;
            int i2 = 0;
            int i3 = 0;
            boolean z = false;
            while (true) {
                if (i >= charArray.length) {
                    break;
                }
                char c = charArray[i];
                if (c == ' ') {
                    if (i2 == 12) {
                        str3 = new String(charArray, i3, i - i3);
                    } else if (i2 == 13) {
                        str2 = new String(charArray, i3, i - i3);
                        break;
                    }
                    if (z) {
                        i2++;
                        i3 = i + 1;
                    }
                } else if (c == ')') {
                    z = true;
                }
                i++;
            }
            if (str3 != null && str2 != null) {
                try {
                    return (CastIntegerProtector.parseInt(str3) + CastIntegerProtector.parseInt(str2)) * 10;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    return -1L;
                }
            }
            return -1L;
        }
        return -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.BufferedInputStream] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r6v2 */
    public static String LJIIIIZZ(String str) throws Throwable {
        C0VSP c0vsp;
        BufferedInputStream bufferedInputStream;
        ?? r2 = 0;
        r2 = 0;
        try {
            try {
                c0vsp = new C0VSP(str);
            } catch (Throwable th) {
                th = th;
                r2 = str;
            }
            try {
                bufferedInputStream = new BufferedInputStream(c0vsp);
                try {
                    StringBuilder sb = new StringBuilder();
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = bufferedInputStream.read(bArr);
                        if (i == -1) {
                            break;
                        }
                        sb.append(new String(bArr, 0, i));
                    }
                    String string = sb.toString();
                    try {
                        bufferedInputStream.close();
                    } catch (IOException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    try {
                        c0vsp.close();
                        return string;
                    } catch (IOException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        return string;
                    }
                } catch (Exception e3) {
                    e = e3;
                    TryCatchGuardChecker.doCheck(e);
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (IOException e4) {
                            TryCatchGuardChecker.doCheck(e4);
                        }
                    }
                    if (c0vsp != null) {
                        try {
                            c0vsp.close();
                            return "";
                        } catch (IOException e5) {
                            TryCatchGuardChecker.doCheck(e5);
                            return "";
                        }
                    }
                    return "";
                }
            } catch (Exception e6) {
                e = e6;
                bufferedInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                while (true) {
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        break;
                    } catch (Throwable th3) {
                        th = th3;
                        r2 = r2;
                    }
                    r2 = r2;
                }
                if (r2 != 0) {
                    try {
                        r2.close();
                    } catch (IOException e7) {
                        TryCatchGuardChecker.doCheck(e7);
                    }
                }
                if (c0vsp != null) {
                    try {
                        c0vsp.close();
                        throw th;
                    } catch (IOException e8) {
                        TryCatchGuardChecker.doCheck(e8);
                        throw th;
                    }
                }
                throw th;
            }
        } catch (Exception e9) {
            e = e9;
            c0vsp = null;
            bufferedInputStream = null;
        } catch (Throwable th4) {
            th = th4;
            c0vsp = null;
        }
    }

    public final void LJIIIZ(boolean z) throws Throwable {
        if (C2187451AjH.LJIIJ()) {
            Trace.beginSection("cpu refresh");
        }
        for (C804730VhX c804730VhX : this.LIZ) {
            if (c804730VhX != null) {
                C804730VhX c804730VhX2 = this.LIZIZ;
                if (c804730VhX2 != null) {
                    LIZJ(LJIIIIZZ("/proc/self/stat"), c804730VhX2);
                }
                int i = c804730VhX.LJII;
                if (i == 1) {
                    LIZLLL(c804730VhX.LIZIZ, c804730VhX);
                } else if (i == 2 && c804730VhX.LIZJ != null) {
                    c804730VhX.LIZLLL = 0L;
                    if (z) {
                        c804730VhX.LJ = System.currentTimeMillis();
                    }
                    LIZIZ(c804730VhX.LIZJ, c804730VhX);
                    if (z) {
                        c804730VhX.LJFF = c804730VhX.LIZLLL;
                    } else {
                        c804730VhX.LJI = (c804730VhX.LIZLLL - c804730VhX.LJFF) / (System.currentTimeMillis() - c804730VhX.LJ);
                    }
                }
            }
        }
        if (C2187451AjH.LJIIJ()) {
            Trace.endSection();
        }
    }

    public final C804730VhX LJIIJ(boolean z) throws Throwable {
        if (C2187451AjH.LJIIJ()) {
            Trace.beginSection("cpu refresh");
        }
        C804730VhX c804730VhX = this.LIZ[this.LIZJ];
        if (c804730VhX == null) {
            return null;
        }
        C804730VhX c804730VhX2 = this.LIZIZ;
        if (c804730VhX2 != null) {
            LIZJ(LJIIIIZZ("/proc/self/stat"), c804730VhX2);
        }
        int i = c804730VhX.LJII;
        if (i == 1) {
            LIZLLL(c804730VhX.LIZIZ, c804730VhX);
        } else if (i == 2) {
            if (c804730VhX.LIZJ == null) {
                return c804730VhX;
            }
            c804730VhX.LIZLLL = 0L;
            if (z) {
                c804730VhX.LJ = System.currentTimeMillis();
            }
            LIZIZ(c804730VhX.LIZJ, c804730VhX);
            if (z) {
                c804730VhX.LJFF = c804730VhX.LIZLLL;
            } else {
                c804730VhX.LJI = (c804730VhX.LIZLLL - c804730VhX.LJFF) / (System.currentTimeMillis() - c804730VhX.LJ);
            }
        }
        if (C2187451AjH.LJIIJ()) {
            Trace.endSection();
        }
        return c804730VhX;
    }

    public static void LIZIZ(HashSet hashSet, C804730VhX c804730VhX) throws Throwable {
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("/proc/self/task/");
            sbLIZ.append(str);
            sbLIZ.append("/stat");
            String strLJIIIIZZ = LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ));
            if (strLJIIIIZZ != null && !strLJIIIIZZ.isEmpty()) {
                long jLJII = LJII(strLJIIIIZZ);
                if (jLJII != -1) {
                    c804730VhX.LIZLLL += jLJII;
                }
            } else {
                it2.remove();
            }
        }
    }

    public static void LIZJ(String str, C804730VhX c804730VhX) {
        if (c804730VhX == null) {
            c804730VhX = new C804730VhX();
        }
        long jLJII = LJII(str);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (c804730VhX.LJ == 0 || jLJII == -1) {
            c804730VhX.LJI = -1.0f;
        } else {
            c804730VhX.LJI = (jLJII - c804730VhX.LIZLLL) / (jCurrentTimeMillis - r8);
        }
        c804730VhX.LIZLLL = jLJII;
        c804730VhX.LJ = jCurrentTimeMillis;
    }

    public static void LIZLLL(String str, C804730VhX c804730VhX) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("/proc/self/task/");
        sbLIZ.append(str);
        sbLIZ.append("/stat");
        LIZJ(LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ)), c804730VhX);
    }

    public final void LJFF(int i, String str) {
        C804730VhX c804730VhX = new C804730VhX();
        c804730VhX.LIZ = str;
        this.LIZ[i] = c804730VhX;
    }

    public final boolean LJIILIIL(int i, String[] strArr) {
        if (!strArr[1].startsWith(this.LIZ[i].LIZ)) {
            return false;
        }
        C804730VhX c804730VhX = this.LIZ[i];
        if (c804730VhX.LIZJ == null) {
            c804730VhX.LIZJ = new HashSet<>();
        }
        this.LIZ[i].LIZJ.add(strArr[0]);
        return true;
    }
}
