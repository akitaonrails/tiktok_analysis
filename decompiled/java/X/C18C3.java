package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;
import kotlin.text.u;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.18C3, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18C3 {
    public static final Regex LIZ = new Regex("_[ikl][${index}0-9]*");

    /* JADX WARN: Removed duplicated region for block: B:32:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ(java.lang.String r9) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18C3.LIZ(java.lang.String):java.lang.String");
    }

    public static String LIZIZ(String str) {
        boolean z;
        int iLJJIZ;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z || (iLJJIZ = a0.LJJIZ(str, '.', 0, false, 6)) < 0) {
            return "";
        }
        int iLJJIZ2 = a0.LJJIZ(str, '.', iLJJIZ + 1, false, 4);
        if (iLJJIZ2 > 0) {
            return str.substring(0, iLJJIZ2);
        }
        return str;
    }

    public static String LIZJ(String str) {
        boolean z;
        int iLJJIZ;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z || (iLJJIZ = a0.LJJIZ(str, '.', 0, false, 6)) < 0) {
            return "";
        }
        int iLJJIZ2 = a0.LJJIZ(str, '.', iLJJIZ + 1, false, 4);
        if (iLJJIZ2 > 0) {
            str = str.substring(0, iLJJIZ2);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(".c0.d0");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LIZLLL(String str) {
        if (str != null && u.LJJIIJZLJL(str, "aUnknown.", false)) {
            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{e3.d}, 0, 6);
            if (listLJJLIIIJILLIZJL.size() > 1 && ((String) ListProtector.get(listLJJLIIIJILLIZJL, 1)).length() > 1) {
                return ((String) ListProtector.get(listLJJLIIIJILLIZJL, 1)).substring(1);
            }
            return "error";
        }
        return null;
    }

    public static String LJ(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        String strLJI = LJI(str);
        if (Intrinsics.LJFF(strLJI, "a0.b0.c0.d0")) {
            return null;
        }
        return strLJI;
    }

    public static String LJI(String str) {
        if (str == null) {
            return null;
        }
        int iLJFF = LJFF(4, str);
        if (iLJFF > 0) {
            return str.substring(0, iLJFF);
        }
        return str;
    }

    public static String LJII(String str) {
        String strLJI = LJI(str);
        if (strLJI == null) {
            return null;
        }
        return a0.LJJZ(strLJI, "_i", strLJI);
    }

    public static int LJFF(int i, String str) {
        int length = str.length();
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.charAt(i3) == '.' && (i2 = i2 + 1) == i) {
                return i3;
            }
        }
        return -1;
    }
}
