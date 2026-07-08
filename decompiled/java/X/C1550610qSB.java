package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0qSB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1550610qSB {
    public static String LJ(String str) {
        if (str.indexOf("/") == 0) {
            str = str.substring(1);
        }
        if (str.lastIndexOf("/") == str.length() - 1) {
            return str.substring(0, str.lastIndexOf("/"));
        }
        return str;
    }

    public static boolean LIZ(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            C1551940qUK c1551940qUK = C797990VSb.LIZ;
            c1551940qUK.LIZIZ();
            File rootDirectory = c1551940qUK.LIZLLL.getRootDirectory();
            if (rootDirectory.exists() && rootDirectory.isDirectory()) {
                String strLJ = LJ(str2);
                try {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(File.separator);
                    sbLIZ.append(str);
                    C0VSJ c0vsj = new C0VSJ(rootDirectory, C2188811AlT.LIZIZ(sbLIZ));
                    if (!c0vsj.exists()) {
                        return false;
                    }
                    C0VSJ c0vsj2 = new C0VSJ(c0vsj.getAbsolutePath(), strLJ);
                    if (!c0vsj2.exists()) {
                        return false;
                    }
                    boolean zLJ = C0X9F.LJ(c0vsj2);
                    if (zLJ) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(strLJ);
                        C1550730qSN.LIZ.getClass();
                        C1550730qSN.LIZ(str, arrayList);
                    }
                    return zLJ;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C1553130qWF.LJ("gecko-debug-tag", "deleteChannel:error:", th);
                }
            }
        }
        return false;
    }

    public static String LIZIZ(String str, String str2) {
        return C1550600qSA.LIZJ(str, null, true, str2);
    }

    public static Long LIZJ(String str, String str2) {
        if (C1549140qPo.LIZ().opt_objective.contains("opt_consume")) {
            return LIZLLL(str, str2);
        }
        return C1550600qSA.LJIIIIZZ(str, str2, true, true);
    }

    public static Long LIZLLL(String str, String str2) {
        C1550640qSE c1550640qSELJIIJJI = C1550600qSA.LJIIJJI(str, str2);
        if (c1550640qSELJIIJJI == null) {
            return null;
        }
        return Long.valueOf(c1550640qSELJIIJJI.LIZ);
    }
}
