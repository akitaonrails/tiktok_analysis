package X;

import android.icu.text.PluralRules;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import org.json.JSONException;

/* JADX INFO: renamed from: X.10r7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19375110r7 {
    public static String LJFF(String str) {
        int iIndexOf = str.indexOf(59);
        if (iIndexOf != -1) {
            String strSubstring = str.substring(iIndexOf + 1);
            if (TextUtils.isEmpty(strSubstring)) {
                return "ROLLBACK";
            }
            return strSubstring;
        }
        return null;
    }

    public static String LJI(String str) {
        int iIndexOf = str.indexOf(59);
        if (iIndexOf != -1) {
            return str.substring(0, iIndexOf);
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c0 A[Catch: Exception -> 0x0185, TryCatch #0 {Exception -> 0x0185, blocks: (B:31:0x0072, B:33:0x007c, B:35:0x0085, B:36:0x008b, B:43:0x00ac, B:45:0x00b2, B:46:0x00b8, B:48:0x00c0, B:54:0x00db, B:56:0x00e1, B:57:0x00e3, B:62:0x00ec, B:63:0x00fb, B:65:0x00ff, B:66:0x0101, B:68:0x0105, B:70:0x010b, B:79:0x0122, B:81:0x013e, B:82:0x0146, B:84:0x0156, B:85:0x0164, B:88:0x016e, B:89:0x017c, B:73:0x0112, B:49:0x00c8, B:51:0x00d0, B:41:0x00a5, B:38:0x009f), top: B:170:0x0072, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ff A[Catch: Exception -> 0x0185, TryCatch #0 {Exception -> 0x0185, blocks: (B:31:0x0072, B:33:0x007c, B:35:0x0085, B:36:0x008b, B:43:0x00ac, B:45:0x00b2, B:46:0x00b8, B:48:0x00c0, B:54:0x00db, B:56:0x00e1, B:57:0x00e3, B:62:0x00ec, B:63:0x00fb, B:65:0x00ff, B:66:0x0101, B:68:0x0105, B:70:0x010b, B:79:0x0122, B:81:0x013e, B:82:0x0146, B:84:0x0156, B:85:0x0164, B:88:0x016e, B:89:0x017c, B:73:0x0112, B:49:0x00c8, B:51:0x00d0, B:41:0x00a5, B:38:0x009f), top: B:170:0x0072, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0105 A[Catch: Exception -> 0x0185, TryCatch #0 {Exception -> 0x0185, blocks: (B:31:0x0072, B:33:0x007c, B:35:0x0085, B:36:0x008b, B:43:0x00ac, B:45:0x00b2, B:46:0x00b8, B:48:0x00c0, B:54:0x00db, B:56:0x00e1, B:57:0x00e3, B:62:0x00ec, B:63:0x00fb, B:65:0x00ff, B:66:0x0101, B:68:0x0105, B:70:0x010b, B:79:0x0122, B:81:0x013e, B:82:0x0146, B:84:0x0156, B:85:0x0164, B:88:0x016e, B:89:0x017c, B:73:0x0112, B:49:0x00c8, B:51:0x00d0, B:41:0x00a5, B:38:0x009f), top: B:170:0x0072, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0112 A[Catch: Exception -> 0x0185, TryCatch #0 {Exception -> 0x0185, blocks: (B:31:0x0072, B:33:0x007c, B:35:0x0085, B:36:0x008b, B:43:0x00ac, B:45:0x00b2, B:46:0x00b8, B:48:0x00c0, B:54:0x00db, B:56:0x00e1, B:57:0x00e3, B:62:0x00ec, B:63:0x00fb, B:65:0x00ff, B:66:0x0101, B:68:0x0105, B:70:0x010b, B:79:0x0122, B:81:0x013e, B:82:0x0146, B:84:0x0156, B:85:0x0164, B:88:0x016e, B:89:0x017c, B:73:0x0112, B:49:0x00c8, B:51:0x00d0, B:41:0x00a5, B:38:0x009f), top: B:170:0x0072, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0122 A[Catch: Exception -> 0x0185, TryCatch #0 {Exception -> 0x0185, blocks: (B:31:0x0072, B:33:0x007c, B:35:0x0085, B:36:0x008b, B:43:0x00ac, B:45:0x00b2, B:46:0x00b8, B:48:0x00c0, B:54:0x00db, B:56:0x00e1, B:57:0x00e3, B:62:0x00ec, B:63:0x00fb, B:65:0x00ff, B:66:0x0101, B:68:0x0105, B:70:0x010b, B:79:0x0122, B:81:0x013e, B:82:0x0146, B:84:0x0156, B:85:0x0164, B:88:0x016e, B:89:0x017c, B:73:0x0112, B:49:0x00c8, B:51:0x00d0, B:41:0x00a5, B:38:0x009f), top: B:170:0x0072, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C19375310r9 LIZIZ(java.lang.Double r26, X.C19374810r4 r27) {
        /*
            Method dump skipped, instruction units count: 759
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19375110r7.LIZIZ(java.lang.Double, X.10r4):X.10r9");
    }

    public static C19375310r9 LIZJ(double d, C19374810r4 c19374810r4) {
        boolean zBooleanValue;
        boolean z;
        boolean z2;
        String strReplace;
        C19375310r9 c19375310r9 = new C19375310r9();
        Boolean bool = c19374810r4.LIZLLL;
        int i = c19374810r4.LIZJ;
        int value = c19374810r4.LIZIZ.LIZLLL.getValue();
        C19375410rA c19375410rA = c19374810r4.LIZ;
        if (bool == null) {
            zBooleanValue = false;
        } else {
            zBooleanValue = bool.booleanValue();
        }
        double dAbs = Math.abs(d);
        if (d < 0.0d) {
            z = true;
        } else {
            z = false;
        }
        String str = c19375410rA.LLILLJJLI;
        if (d < 0.0d) {
            z2 = true;
        } else {
            z2 = false;
        }
        String strLIZLLL = LIZLLL(dAbs, c19375410rA, i, value, str, zBooleanValue, z2);
        if (!c19374810r4.LJ) {
            if (z) {
                strReplace = LJ(c19375410rA.LLILLL, strLIZLLL);
            } else {
                strReplace = LJI(c19375410rA.LLILLL).replace("{0}", strLIZLLL);
            }
        } else {
            strReplace = strLIZLLL;
        }
        LJIIIIZZ(c19375310r9, strReplace, strLIZLLL, c19375410rA, c19374810r4.LJFF);
        c19375310r9.LIZIZ = strReplace;
        return c19375310r9;
    }

    public static String LJ(String str, String str2) {
        String strLJFF = LJFF(str);
        if (strLJFF != null && !strLJFF.equals("ROLLBACK")) {
            String strReplace = strLJFF.replace("{0}", str2);
            if (str2.equals(CardStruct.IStatusCode.DEFAULT)) {
                return strReplace.replace("-", "");
            }
            return strReplace;
        }
        String strReplace2 = LJI(str).replace("{0}", str2);
        if (str2.equals(CardStruct.IStatusCode.DEFAULT)) {
            return strReplace2;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('-');
        sbLIZ.append(strReplace2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static double LJIIIZ(double d, int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("%.");
        sbLIZ.append(i);
        sbLIZ.append("f");
        try {
            return CastDoubleProtector.parseDouble(C786410Ut5.k4(Locale.ENGLISH, C2188811AlT.LIZIZ(sbLIZ), new Object[]{Double.valueOf(d)}));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return d;
        }
    }

    public static boolean LJII(C19375710rD c19375710rD, String str, boolean z, double d) {
        String string;
        if (c19375710rD == null) {
            return false;
        }
        double dPow = d / Math.pow(10.0d, c19375710rD.LL - 1);
        if (z) {
            try {
                string = JSONObjectProtectorUtils.getString(c19375710rD.LLILLJJLI, PluralRules.forLocale(Locale.forLanguageTag(str)).select(dPow));
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                string = "";
            }
            if (string.charAt(string.length() - 1) == ';') {
                return false;
            }
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c9, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C19375210r8 LIZ(java.lang.Double r16, boolean r17, X.EnumC826620Wbk r18, X.C19375410rA r19, int r20) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19375110r7.LIZ(java.lang.Double, boolean, X.0Wbk, X.10rA, int):X.10r8");
    }

    public static void LJIIIIZZ(C19375310r9 c19375310r9, String str, String str2, C19375410rA c19375410rA, boolean z) {
        int iIndexOf;
        if (!z) {
            return;
        }
        if (str2 != null && (iIndexOf = str2.indexOf(c19375410rA.LLILZIL.charValue())) != -1) {
            str2.substring(iIndexOf);
            str2.substring(0, iIndexOf);
        }
        if (str2 != null) {
            str = str.replace(str2, "ID");
        } else {
            str.replace("-", "");
        }
        String[] strArrSplit = str.replace("ID", "-").split("-");
        for (int i = 0; i < strArrSplit.length; i++) {
            if (!strArrSplit[i].isEmpty()) {
                str = str.replace(strArrSplit[i], "U");
                c19375310r9.LIZ.put(strArrSplit[i]);
            }
        }
        c19375410rA.LLILZIL.getClass();
    }

    public static String LIZLLL(double d, C19375410rA c19375410rA, int i, int i2, String str, boolean z, boolean z2) {
        String strSubstring;
        String str2;
        if (i < 0) {
            String string = new BigDecimal(String.valueOf(Math.abs(d))).toString();
            int iIndexOf = string.indexOf(46);
            if (iIndexOf != -1) {
                String strSubstring2 = string.substring(iIndexOf + 1);
                for (char c : strSubstring2.toCharArray()) {
                    if (c != '0') {
                        i = strSubstring2.length();
                        break;
                    }
                }
                i = 0;
            } else {
                i = 0;
            }
        }
        Character ch = c19375410rA.LLILZIL;
        String strSubstring3 = str.substring(0, str.lastIndexOf(ch.charValue()));
        if (i > 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strSubstring3);
            sbLIZ.append(ch);
            StringBuilder sb = new StringBuilder(C2188811AlT.LIZIZ(sbLIZ));
            int i3 = 0;
            do {
                if (z) {
                    str2 = CardStruct.IStatusCode.DEFAULT;
                } else {
                    str2 = "#";
                }
                sb.append(str2);
                i3++;
            } while (i3 < i);
            strSubstring3 = sb.toString();
        }
        char[] charArray = strSubstring3.toCharArray();
        for (int i4 = 0; i4 < charArray.length; i4++) {
            char c2 = charArray[i4];
            if (c2 == c19375410rA.LLILZIL.charValue()) {
                charArray[i4] = '.';
            }
            if (c2 == c19375410rA.LLILZLL.charValue()) {
                charArray[i4] = ',';
            }
        }
        String strValueOf = String.valueOf(charArray);
        double dLJIIIZ = LJIIIZ(d, i);
        if (dLJIIIZ <= d ? d < Math.pow(10.0d, c19375410rA.LLILZ.intValue() - 1) : dLJIIIZ < Math.pow(10.0d, c19375410rA.LLILZ.intValue() - 1)) {
            int iIndexOf2 = strValueOf.indexOf(44);
            if (iIndexOf2 > 0) {
                StringBuilder sb2 = new StringBuilder(strValueOf);
                sb2.deleteCharAt(iIndexOf2);
                strValueOf = sb2.toString();
            }
        }
        DecimalFormat decimalFormat = new DecimalFormat(strValueOf, DecimalFormatSymbols.getInstance(Locale.ENGLISH));
        decimalFormat.setRoundingMode(RoundingMode.valueOf(i2));
        if (z2) {
            strSubstring = decimalFormat.format(-d).substring(1);
        } else {
            strSubstring = decimalFormat.format(d);
        }
        char[] charArray2 = strSubstring.toCharArray();
        for (int i5 = 0; i5 < charArray2.length; i5++) {
            char c3 = charArray2[i5];
            if (c3 == '.') {
                charArray2[i5] = c19375410rA.LLILZIL.charValue();
            } else if (c3 == ',') {
                charArray2[i5] = c19375410rA.LLILZLL.charValue();
            }
        }
        return String.valueOf(charArray2);
    }
}
