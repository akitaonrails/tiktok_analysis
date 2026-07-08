package X;

import kotlin.text.Regex;
import kotlin.text.u;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0s4V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1612810s4V {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(String str) {
        if (str == null) {
            str = "";
        }
        if (str.length() <= 0) {
            return "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('$');
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LIZIZ(String str) {
        String strLJJIFFI;
        if (str == null) {
            return null;
        }
        String strReplace = new Regex("[^\\d,.]").replace(str, "");
        if (new Regex("\\d,\\d{2}(?!\\d)").containsMatchIn(strReplace)) {
            strLJJIFFI = u.LJJIFFI(u.LJJIFFI(strReplace, e3.d, "", false), ",", e3.d, false);
        } else {
            strLJJIFFI = u.LJJIFFI(strReplace, ",", "", false);
        }
        if (strLJJIFFI.length() == 0) {
            return null;
        }
        return strLJJIFFI;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LIZJ(java.util.List r37, java.util.Map r38, java.util.Map r39, java.util.Map r40) {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1612810s4V.LIZJ(java.util.List, java.util.Map, java.util.Map, java.util.Map):java.util.List");
    }
}
