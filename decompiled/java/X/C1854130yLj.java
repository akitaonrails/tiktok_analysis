package X;

import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.0yLj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1854130yLj {
    public static long LIZ;
    public static Integer LIZIZ;
    public static long LIZJ;
    public static String LIZLLL;

    public static Integer LIZ() {
        if (((Number) C07I9.LIZ.getValue()).intValue() != 1) {
            return LIZIZ;
        }
        C1860520yW2.LIZ.getClass();
        Keva kevaLJIIL = C1860520yW2.LJIIL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tako_active_mode_");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        int i = kevaLJIIL.getInt(C2188811AlT.LIZIZ(sbLIZ), 0);
        if (LIZIZ == null && i == 1) {
            LIZIZ = Integer.valueOf(i);
        }
        return LIZIZ;
    }

    public static void LIZIZ(Integer num) {
        LIZIZ = num;
        if (num != null && num.intValue() == 1) {
            C01GW c01gw = C07I9.LIZ;
            if (((Number) c01gw.getValue()).intValue() == 1) {
                C1860520yW2 c1860520yW2 = C1860520yW2.LIZ;
                int iIntValue = num.intValue();
                c1860520yW2.getClass();
                C1860520yW2.LJJIIJZLJL(iIntValue);
            } else if (((Number) c01gw.getValue()).intValue() == 2) {
                C1860520yW2.LIZ.getClass();
                C1860520yW2.LJJIIJZLJL(0);
            }
        } else {
            C1860520yW2.LIZ.getClass();
            C1860520yW2.LJJIIJZLJL(0);
        }
        LIZ = System.currentTimeMillis();
    }
}
