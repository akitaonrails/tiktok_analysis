package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.regex.Matcher;

/* JADX INFO: renamed from: X.0orN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1489350orN {
    public static String LIZJ(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String strTrim = str.trim();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strTrim.length(); i++) {
            sb.append(C1E91.LIZJ(strTrim.charAt(i)));
        }
        return sb.toString();
    }

    public static boolean LIZLLL(String str) {
        try {
            Matcher matcher = PatternProtector.compile("(?:[\\uD83C\\uDF00-\\uD83D\\uDDFF]|[\\uD83E\\uDD00-\\uD83E\\uDDFF]|[\\uD83D\\uDE00-\\uD83D\\uDE4F]|[\\uD83D\\uDE80-\\uD83D\\uDEFF]|[\\u2600-\\u26FF]\\uFE0F?|[\\u2700-\\u27BF]\\uFE0F?|\\u24C2\\uFE0F?|[\\uD83C\\uDDE6-\\uD83C\\uDDFF]{1,2}|[\\uD83C\\uDD70\\uD83C\\uDD71\\uD83C\\uDD7E\\uD83C\\uDD7F\\uD83C\\uDD8E\\uD83C\\uDD91-\\uD83C\\uDD9A]\\uFE0F?|[\\u0023\\u002A\\u0030-\\u0039]\\uFE0F?\\u20E3|[\\u2194-\\u2199\\u21A9-\\u21AA]\\uFE0F?|[\\u2B05-\\u2B07\\u2B1B\\u2B1C\\u2B50\\u2B55]\\uFE0F?|[\\u2934\\u2935]\\uFE0F?|[\\u3030\\u303D]\\uFE0F?|[\\u3297\\u3299]\\uFE0F?|[\\uD83C\\uDE01\\uD83C\\uDE02\\uD83C\\uDE1A\\uD83C\\uDE2F\\uD83C\\uDE32-\\uD83C\\uDE3A\\uD83C\\uDE50\\uD83C\\uDE51]\\uFE0F?|[\\u203C\\u2049]\\uFE0F?|[\\u25AA\\u25AB\\u25B6\\u25C0\\u25FB-\\u25FE]\\uFE0F?|[\\u00A9\\u00AE]\\uFE0F?|[\\u2122\\u2139]\\uFE0F?|\\uD83C\\uDC04\\uFE0F?|\\uD83C\\uDCCF\\uFE0F?|[\\u231A\\u231B\\u2328\\u23CF\\u23E9-\\u23F3\\u23F8-\\u23FA]\\uFE0F?)").matcher(str);
            if (matcher.find()) {
                if (str.indexOf(matcher.group()) != 0) {
                    return false;
                }
                return true;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return false;
    }

    public static boolean LJ(char c) {
        if (!Character.isUpperCase(c) && !Character.isLowerCase(c)) {
            return false;
        }
        return true;
    }

    public static boolean LJFF(char c) {
        return PatternProtector.compile("[\\p{P}\\p{S}\\p{Z}]").matcher(String.valueOf(c)).matches();
    }

    public static String LIZIZ(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return "#";
        }
        char cCharAt = str.charAt(0);
        if ((cCharAt >= 19968 && cCharAt <= 40869) || LJ(cCharAt)) {
            String upperCase = LIZJ(str).substring(0, 1).toUpperCase();
            if (TextUtils.isEmpty(upperCase)) {
                return str.substring(0, 1).toUpperCase();
            }
            return upperCase;
        }
        if (Character.isDigit(cCharAt) || LJFF(cCharAt) || LIZLLL(str) || z) {
            return "#";
        }
        return str.substring(0, 1);
    }

    public static String LIZ(String str, String str2, String str3, String str4) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
            if (str.contains(str4)) {
                return str4;
            }
            str4 = LIZJ(str4).toLowerCase();
            StringBuilder sb = new StringBuilder();
            int iIndexOf = str3.indexOf(str4);
            int iIndexOf2 = str2.indexOf(str4);
            int i = 0;
            if (iIndexOf2 != -1) {
                int i2 = 0;
                int i3 = 0;
                while (i < str.length()) {
                    int length = C1E91.LIZJ(str.charAt(i)).toLowerCase().length() + i3;
                    if (i3 >= iIndexOf2 && i3 < str4.length() + iIndexOf2) {
                        sb.append(str.charAt(i));
                    } else if (length > iIndexOf2 && length <= str4.length() + iIndexOf2) {
                        sb.append(str.charAt(i));
                    } else if (iIndexOf2 <= i3 || iIndexOf2 >= length) {
                        i++;
                        i3 = length;
                    } else {
                        sb.append(str.charAt(i));
                    }
                    i2++;
                    i++;
                    i3 = length;
                }
                i = i2;
            }
            if (iIndexOf != -1 && iIndexOf < str.length() && str4.length() > i) {
                return str.substring(iIndexOf, Math.min(str.length(), str4.length() + iIndexOf));
            }
            if (!TextUtils.isEmpty(sb.toString())) {
                return sb.toString();
            }
        }
        return str4;
    }
}
