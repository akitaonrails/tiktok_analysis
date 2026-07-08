package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.00vk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C236600vk {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(String str) {
        int i;
        int length = str.length();
        int i2 = 0;
        while (true) {
            i = -1;
            if (i2 < length) {
                if (Character.isDigit(str.charAt(i2))) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        int length2 = str.length() - 1;
        if (length2 >= 0) {
            while (true) {
                int i3 = length2 - 1;
                if (Character.isDigit(str.charAt(length2))) {
                    i = length2;
                    break;
                }
                if (i3 < 0) {
                    break;
                }
                length2 = i3;
            }
        }
        try {
            return str.substring(i2, Math.min(i + 1, str.length()));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public static Long LIZIZ(String str) {
        try {
            if (!a0.LJJJIL(str)) {
                StringBuilder sb = new StringBuilder();
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    char cCharAt = str.charAt(i);
                    if (Character.isDigit(cCharAt)) {
                        sb.append(cCharAt);
                    }
                }
                return C2095008Iq.LJIILIIL(sb.toString());
            }
            return null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
