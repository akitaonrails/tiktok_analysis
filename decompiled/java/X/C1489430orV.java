package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0orV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1489430orV {
    public static final C1843110y3x LIZ(String str) {
        int length = str.length();
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            if (i3 < 1 || !Character.isLetter(str.charAt(i3 - 1))) {
                if (Character.isDigit(str.charAt(i3))) {
                    if (i == -1) {
                        i = i3;
                    }
                    i2 = i3;
                } else if (i != -1) {
                    break;
                }
            }
        }
        if (i >= 0 && i < str.length() && i2 >= 0 && i2 < str.length()) {
            int i4 = i2 + 1;
            try {
                return new C1843110y3x(CastIntegerProtector.parseInt(str.substring(i, i4)), str.substring(0, i), str.substring(i4, str.length()));
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return null;
    }
}
