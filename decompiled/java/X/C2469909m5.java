package X;

import java.util.Arrays;
import kotlin.text.u;

/* JADX INFO: renamed from: X.09m5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2469909m5 {
    public static final String LIZ(int i) {
        String strJ4 = C786410Ut5.j4("%02X", Arrays.copyOf(new Object[]{Integer.valueOf((i >>> 24) & 255)}, 1));
        String strJ42 = C786410Ut5.j4("%02X", Arrays.copyOf(new Object[]{Integer.valueOf(((16711680 & i) >> 16) & 255)}, 1));
        String strJ43 = C786410Ut5.j4("%02X", Arrays.copyOf(new Object[]{Integer.valueOf(((65280 & i) >> 8) & 255)}, 1));
        String strJ44 = C786410Ut5.j4("%02X", Arrays.copyOf(new Object[]{Integer.valueOf(i & 255 & 255)}, 1));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strJ42);
        sbLIZ.append(strJ43);
        sbLIZ.append(strJ44);
        sbLIZ.append(strJ4);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LIZIZ(String str) {
        if (str.length() != 8 && str.length() != 9) {
            if (str.length() == 6) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('#');
                sbLIZ.append(str);
                return C2188811AlT.LIZIZ(sbLIZ);
            }
            return str;
        }
        if (u.LJJIIJZLJL(str, "#", false)) {
            str = C13LN.LJLJLJ(1, str);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(C13LN.LL(2, str));
        sbLIZ2.append(C13LN.LJLL(2, str));
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append('#');
        sbLIZ3.append(strLIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ3);
    }
}
