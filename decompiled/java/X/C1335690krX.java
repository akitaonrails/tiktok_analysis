package X;

import java.io.File;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0krX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1335690krX {
    public final String LIZ;
    public final String LIZIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append(e3.h);
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(")");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static C1335690krX LIZ(File file) {
        String name = file.getName();
        int iLastIndexOf = name.lastIndexOf(46);
        if (iLastIndexOf <= 0) {
            return null;
        }
        String strSubstring = name.substring(iLastIndexOf);
        String str = ".cnt";
        if (!".cnt".equals(strSubstring)) {
            if (!".tmp".equals(strSubstring)) {
                return null;
            }
            str = ".tmp";
        }
        String strSubstring2 = name.substring(0, iLastIndexOf);
        if (str.equals(".tmp")) {
            int iLastIndexOf2 = strSubstring2.lastIndexOf(46);
            if (iLastIndexOf2 <= 0) {
                return null;
            }
            strSubstring2 = strSubstring2.substring(0, iLastIndexOf2);
        }
        return new C1335690krX(str, strSubstring2);
    }

    public C1335690krX(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
