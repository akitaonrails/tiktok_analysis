package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AwS394S0200000_28;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0znP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1909730znP {
    public static final Regex LIZ = new Regex("\\{num, plural, (.+?)\\}$");

    public static Object LIZJ(int i) {
        if (i >= 1000000000) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(((double) C814420VxA.LIZ(((double) i) / 1.0E8d)) / 10.0d);
            sbLIZ.append('B');
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        if (i >= 1000000) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(((double) C814420VxA.LIZ(((double) i) / 100000.0d)) / 10.0d);
            sbLIZ2.append('M');
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        if (i >= 10000) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(((double) C814420VxA.LIZ(((double) i) / 100.0d)) / 10.0d);
            sbLIZ3.append('K');
            return C2188811AlT.LIZIZ(sbLIZ3);
        }
        return Integer.valueOf(i);
    }

    public static String LIZ(String str, EnumC1906250zhn enumC1906250zhn) {
        int iLJJJ = a0.LJJJ(str, enumC1906250zhn.name().toLowerCase(Locale.ROOT), 0, false, 6);
        if (iLJJJ == -1) {
            return LIZ(str, EnumC1906250zhn.OTHER);
        }
        String strSubstring = str.substring(iLJJJ);
        int iLJJIZ = a0.LJJIZ(strSubstring, '{', 0, false, 6) + 1;
        List listLJIILJJIL = C1697810uHb.LJIILJJIL('{');
        int length = strSubstring.length();
        for (int i = iLJJIZ; i < length; i++) {
            char cCharAt = strSubstring.charAt(i);
            if (cCharAt == '}') {
                if (listLJIILJJIL.size() == 1) {
                    if (i != -1) {
                        return strSubstring.substring(iLJJIZ, i);
                    }
                    return "";
                }
            } else {
                if (cCharAt != '}') {
                    if (cCharAt == '{') {
                        listLJIILJJIL.add('{');
                    }
                }
            }
            ListProtector.remove(listLJIILJJIL, listLJIILJJIL.size() - 1);
        }
        return "";
    }

    public static String LIZIZ(String str, C1909740znQ c1909740znQ, String str2) {
        EnumC1906250zhn enumC1906250zhn;
        if (str.length() == 0) {
            return str2;
        }
        if (Intrinsics.LJFF(c1909740znQ.LIZLLL, Boolean.TRUE)) {
            Integer num = c1909740znQ.LIZ;
            if (str.length() != 0 && num != null && LIZ.matches(str)) {
                Regex regex = new Regex("\\{(number|num|s_num)\\}");
                String str3 = c1909740znQ.LIZJ;
                if (str3 != null) {
                    regex = new Regex(str3);
                }
                String strReplace = regex.replace(str, new AwS394S0200000_28(c1909740znQ, num, 57));
                int iIntValue = num.intValue();
                if (iIntValue == 0) {
                    enumC1906250zhn = EnumC1906250zhn.ZERO;
                } else if (iIntValue == 1) {
                    enumC1906250zhn = EnumC1906250zhn.ONE;
                } else if (iIntValue == 2) {
                    enumC1906250zhn = EnumC1906250zhn.TWO;
                } else if (iIntValue > 4) {
                    enumC1906250zhn = EnumC1906250zhn.MANY;
                } else {
                    enumC1906250zhn = EnumC1906250zhn.FEW;
                }
                String strLIZ = LIZ(strReplace, enumC1906250zhn);
                if (strLIZ.length() > 0 && u.LJJIIJZLJL(str, "&rlm;", false)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("&rlm;");
                    sbLIZ.append(strLIZ);
                    strLIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
                if (strLIZ.length() != 0) {
                    str = strLIZ;
                }
            }
        }
        C1909750znR[] c1909750znRArr = c1909740znQ.LJ;
        if (c1909750znRArr != null) {
            for (C1909750znR c1909750znR : c1909750znRArr) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append('{');
                sbLIZ2.append(c1909750znR.LIZ);
                sbLIZ2.append('}');
                str = u.LJJIFFI(str, C2188811AlT.LIZIZ(sbLIZ2), c1909750znR.LIZIZ, false);
            }
        }
        if (c1909740znQ.LJFF != null) {
            Object string = c1909740znQ.LJI;
            if (string instanceof Integer) {
                string = LIZJ(((Number) string).intValue()).toString();
            }
            if (string instanceof Object[]) {
                List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{c1909740znQ.LJFF}, 0, 6);
                int size = listLJJLIIIJILLIZJL.size() - 1;
                String strLIZIZ = "";
                for (int i = 0; i < size; i++) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(strLIZIZ);
                    sbLIZ3.append((String) ListProtector.get(listLJJLIIIJILLIZJL, i));
                    sbLIZ3.append(((Object[]) string)[i]);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                }
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(strLIZIZ);
                sbLIZ4.append((String) ListProtector.get(listLJJLIIIJILLIZJL, listLJJLIIIJILLIZJL.size() - 1));
                return C2188811AlT.LIZIZ(sbLIZ4);
            }
            return u.LJJIFFI(str, c1909740znQ.LJFF, String.valueOf(string), false);
        }
        return str;
    }
}
