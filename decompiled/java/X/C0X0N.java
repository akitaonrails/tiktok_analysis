package X;

import java.util.Locale;
import java.util.Set;
import java.util.regex.Matcher;

/* JADX INFO: renamed from: X.0X0N, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X0N {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(String str) {
        Object obj;
        C0X0O c0x0oLIZIZ = LIZIZ(str);
        if (c0x0oLIZIZ != null && (obj = C841650Wzz.LIZ.get(c0x0oLIZIZ.LIZIZ)) != null) {
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue();
            }
            if (obj instanceof Set) {
                return ((Set) obj).contains(c0x0oLIZIZ.LIZJ);
            }
            return false;
        }
        return false;
    }

    public static C0X0O LIZIZ(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        Matcher matcher = C0X0O.LIZLLL.matcher(str);
        if (matcher.lookingAt()) {
            String strGroup = matcher.group(1);
            Locale locale = Locale.US;
            String lowerCase = strGroup.toLowerCase(locale);
            String lowerCase2 = matcher.group(2).toLowerCase(locale);
            Matcher matcher2 = C0X0O.LJ.matcher(str);
            String str2 = null;
            for (int iEnd = matcher.end(); iEnd < str.length(); iEnd = matcher2.end()) {
                matcher2.region(iEnd, str.length());
                if (matcher2.lookingAt()) {
                    String strGroup2 = matcher2.group(1);
                    if (strGroup2 != null && strGroup2.equalsIgnoreCase("charset")) {
                        String strGroup3 = matcher2.group(2);
                        if (strGroup3 != null) {
                            if (strGroup3.startsWith("'") && strGroup3.endsWith("'") && strGroup3.length() > 2) {
                                strGroup3 = strGroup3.substring(1, strGroup3.length() - 1);
                            }
                        } else {
                            strGroup3 = matcher2.group(3);
                        }
                        if (str2 == null || strGroup3.equalsIgnoreCase(str2)) {
                            str2 = strGroup3;
                        }
                    }
                }
            }
            return new C0X0O(str, lowerCase, lowerCase2);
        }
        return null;
    }
}
