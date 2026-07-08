package X;

import kotlin.text.Regex;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.00vl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C236700vl {
    public static final Regex LIZ = new Regex("^\\+?[1-9]\\d{0,2}$");
    public static final Regex LIZIZ = new Regex("^\\d{4,14}$");

    public static String LIZIZ(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isDigit(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }

    public static boolean LIZ(String str, String str2) {
        if (str != null && !a0.LJJJIL(str) && LIZ.matches(u.LJJIFFI(str, " ", "", false)) && str2 != null && !a0.LJJJIL(str2) && LIZIZ.matches(LIZIZ(str2))) {
            return true;
        }
        return false;
    }
}
