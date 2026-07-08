package X;

import android.text.TextUtils;
import java.util.Locale;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.14Qp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20263714Qp {
    public static final Integer LIZ(String str) {
        String string;
        String lowerCase;
        if (str == null || (string = a0.LJLIIIL(str).toString()) == null || (lowerCase = string.toLowerCase(Locale.ROOT)) == null) {
            return null;
        }
        int iHashCode = lowerCase.hashCode();
        if (iHashCode != -1364013995) {
            if (iHashCode != 3317767) {
                if (iHashCode != 108511772 || !lowerCase.equals("right")) {
                    return null;
                }
                return 6;
            }
            if (!lowerCase.equals("left")) {
                return null;
            }
            return 5;
        }
        if (!lowerCase.equals("center")) {
            return null;
        }
        return 4;
    }

    public static final Integer LIZIZ(String str) {
        String string;
        String lowerCase;
        if (str == null || (string = a0.LJLIIIL(str).toString()) == null || (lowerCase = string.toLowerCase(Locale.ROOT)) == null) {
            return null;
        }
        int iHashCode = lowerCase.hashCode();
        if (iHashCode != -1097462182) {
            if (iHashCode != 107498) {
                if (iHashCode != 113258 || !lowerCase.equals("rtl")) {
                    return null;
                }
                return 4;
            }
            if (!lowerCase.equals("ltr")) {
                return null;
            }
            return 3;
        }
        if (!lowerCase.equals("locale")) {
            return null;
        }
        return 5;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final TextUtils.TruncateAt LIZJ(String str) {
        String string;
        String lowerCase;
        if (str != null && (string = a0.LJLIIIL(str).toString()) != null && (lowerCase = string.toLowerCase(Locale.ROOT)) != null) {
            switch (lowerCase.hashCode()) {
                case -1074341483:
                    if (lowerCase.equals("middle")) {
                        return TextUtils.TruncateAt.MIDDLE;
                    }
                    break;
                case 100571:
                    if (lowerCase.equals("end")) {
                        return TextUtils.TruncateAt.END;
                    }
                    break;
                case 109757538:
                    if (lowerCase.equals("start")) {
                        return TextUtils.TruncateAt.START;
                    }
                    break;
                case 839444514:
                    if (lowerCase.equals("marquee")) {
                        return TextUtils.TruncateAt.MARQUEE;
                    }
                    break;
            }
        }
        return TextUtils.TruncateAt.END;
    }
}
