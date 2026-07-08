package X;

import kotlin.text.a0;

/* JADX INFO: renamed from: X.13Ji, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19990013Ji {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(long j) {
        long jLJIJI = C19990113Jj.LJIJI(j, EnumC19990213Jk.HOURS);
        int iLJIIL = C19990113Jj.LJIIL(j);
        int iLJIILL = C19990113Jj.LJIILL(j);
        C19990113Jj.LJIILJJIL(j);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(a0.LJJJJJL('0', 2, Long.valueOf(jLJIJI).toString()));
        sbLIZ.append(':');
        sbLIZ.append(a0.LJJJJJL('0', 2, Integer.valueOf(iLJIIL).toString()));
        sbLIZ.append(':');
        sbLIZ.append(a0.LJJJJJL('0', 2, Integer.valueOf(iLJIILL).toString()));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LIZIZ(Integer num) {
        if (num != null) {
            if (num.intValue() == 0) {
                return "not_start";
            }
            if (num.intValue() == 1) {
                return "on_going";
            }
            if (num.intValue() == 2) {
                return "suspended";
            }
            if (num.intValue() != 3) {
                num.intValue();
                return "not_set";
            }
            return "not_set";
        }
        return "not_set";
    }
}
