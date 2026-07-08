package X;

import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.07jJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1943107jJ {
    public static Long LIZ(String str) {
        boolean z;
        Long lLJIILIIL;
        boolean z2 = true;
        if (str != null && !a0.LJJJIL(str)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return 0L;
        }
        String string = a0.LJLIIIL(a0.LJJLIL(str, "bytes=", "")).toString();
        if (string.length() <= 0) {
            z2 = false;
        }
        if (!z2 || a0.LJJIIZI(string, ",", false) || u.LJJIIJZLJL(string, "-", false) || (lLJIILIIL = C2095008Iq.LJIILIIL(a0.LJLIIIL(a0.LJJZ(string, "-", string)).toString())) == null) {
            return null;
        }
        long jLongValue = lLJIILIIL.longValue();
        if (jLongValue < 0) {
            return null;
        }
        return Long.valueOf(jLongValue);
    }
}
