package X;

import java.util.Set;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.0iTj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1244050iTj {
    public static final Set<Integer> LIZ = C15442062u.LJIIIZ(C15442062u.LJIIIZ(C13LQ.LJLIIL(new Integer[]{847, 4447, 4448, 6068, 6069, 10240, 12644, 65440, 119129}), new IntRange(65024, 65037)), new IntRange(917760, 917999));

    public static boolean LIZ(String str) {
        boolean z;
        Set setLJLIIL = C13LQ.LJLIIL(new EnumC1244060iTk[]{EnumC1244060iTk.CONTROL, EnumC1244060iTk.LINE_SEPARATOR, EnumC1244060iTk.PARAGRAPH_SEPARATOR});
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 8205) {
                }
            }
            return true;
        }
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (LIZ.contains(Integer.valueOf(cCharAt)) || ((C1244080iTm.LIZLLL(cCharAt) == EnumC1244060iTk.FORMAT && cCharAt != 8205) || setLJLIIL.contains(C1244080iTm.LIZLLL(cCharAt)))) {
                return true;
            }
        }
        return false;
    }
}
