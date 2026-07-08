package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.regex.Matcher;

/* JADX INFO: renamed from: X.0Gwy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C432100Gwy {
    static {
        PatternProtector.compile("[\\p{P}\\p{S}\\p{Z}]");
    }

    public static boolean LIZ(String str) {
        int length;
        if (str == null || (length = str.length()) == 0 || Character.isAlphabetic(Character.codePointAt(str, 0))) {
            return false;
        }
        try {
            Matcher matcher = C439870HMr.LIZJ.matcher(str);
            int length2 = 0;
            int i = 0;
            while (matcher.find()) {
                i++;
                length2 += matcher.group().length();
                if (length2 > length || i > 3) {
                    return false;
                }
            }
            if (length2 != length) {
                return false;
            }
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }
}
