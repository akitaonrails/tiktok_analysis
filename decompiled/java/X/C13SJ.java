package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: renamed from: X.13SJ, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13SJ {
    public static String LIZJ(String str) {
        char[] cArr = new char[str.length()];
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            cArr[i] = cCharAt;
            if (cCharAt != '_' && cCharAt != '-' && ((Intrinsics.LJI(cCharAt, 97) < 0 || Intrinsics.LJI(cCharAt, 122) > 0) && (Intrinsics.LJI(cCharAt, 48) < 0 || Intrinsics.LJI(cCharAt, 57) > 0))) {
                cArr[i] = '_';
            }
        }
        return new String(cArr);
    }

    public static String LIZLLL(String str) {
        int length = str.length();
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            cArr[i] = cCharAt;
            if (cCharAt == C13SB.LIZ.charAt(0)) {
                cArr[i] = '_';
            }
        }
        return new String(cArr);
    }

    public static void LIZIZ(C13M9 c13m9, C13M9 c13m92, boolean z) throws C564610MCl {
        if (z && C13SB.LIZLLL(c13m92) && !C13SB.LJIILLIIL(c13m92)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("delete file exception occur,file = ");
            sbLIZ.append(c13m92);
            throw new C564610MCl(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (C13SB.LJIJ(c13m9, c13m92)) {
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("rename file exception occur, from = ");
        sbLIZ2.append(c13m9);
        sbLIZ2.append(",to = ");
        sbLIZ2.append(c13m92);
        throw new C564610MCl(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public static C13SG LIZ(String str, int i, int i2, long j, C13SP c13sp, boolean z, Pair pair) throws C564610MCl {
        C13M9 c13m9LIZ;
        if (j > 0) {
            if (i2 > 0) {
                if (!C13SB.LJ(str)) {
                    C13SB.LJIIJ(str);
                    if (!C13SB.LJ(str)) {
                        C13SS c13ss = C13SS.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Cache directory error");
                        sbLIZ.append(str);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        c13ss.getClass();
                        C13SS.LIZIZ("DiskLruCache", strLIZIZ, null);
                    }
                }
                C13M9 c13m9LIZ2 = new C13M9(str).LIZ("journal.bkp");
                if (c13m9LIZ2 != null && C13SB.LIZLLL(c13m9LIZ2) && (c13m9LIZ = new C13M9(str).LIZ("journal")) != null && C13SB.LIZLLL(c13m9LIZ)) {
                    if (C13SB.LIZLLL(c13m9LIZ)) {
                        C13SB.LJIILLIIL(c13m9LIZ2);
                    } else {
                        Regex regex = C13SG.LJJ;
                        LIZIZ(c13m9LIZ2, c13m9LIZ, false);
                    }
                }
                C13SG c13sg = new C13SG(str, i, i2, j, c13sp, z, pair);
                C13SS.LIZ.getClass();
                C13SS.LIZ("ToolsDiskInitialize", "DiskLruCache start init");
                if (C13SB.LIZLLL(c13sg.LJII)) {
                    try {
                        c13sg.LJIILLIIL();
                        c13sg.LJIILJJIL();
                        c13sg.LJIILL = true;
                        C13SS.LIZ("ToolsDiskInitialize", "DiskLruCache init success");
                        return c13sg;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C13SS c13ss2 = C13SS.LIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("failed: e -> ");
                        sbLIZ2.append(e);
                        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                        c13ss2.getClass();
                        C13SS.LIZIZ("ToolsDiskInitialize", strLIZIZ2, null);
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("DiskLruCache ");
                        sbLIZ3.append(str);
                        sbLIZ3.append(" is corrupt: ");
                        sbLIZ3.append(e.getMessage());
                        sbLIZ3.append(", removing");
                        C13SS.LIZIZ("DiskLruCache", C2188811AlT.LIZIZ(sbLIZ3), null);
                        c13sg.LJFF();
                    }
                }
                C13SB.LJIIJ(str);
                C13SG c13sg2 = new C13SG(str, i, i2, j, c13sp, z, null);
                c13sg2.LJIIZILJ();
                return c13sg2;
            }
            throw new IllegalArgumentException("valueCount <= 0");
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }
}
