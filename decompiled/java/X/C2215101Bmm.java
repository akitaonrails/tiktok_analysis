package X;

import com.bytedance.bddatefmt.BDDateFormat;
import java.util.Calendar;
import java.util.Collections;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.1Bmm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2215101Bmm {
    public static BDDateFormat LJIILJJIL() {
        return C2215181Bmu.LJJI.getValue();
    }

    public static BDDateFormat LJIILL() {
        return C2215181Bmu.LJI.getValue();
    }

    public static String LIZJ(long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" · ");
        sbLIZ.append(LJII(j));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LIZLLL(long j) {
        if (j == 0) {
            return "";
        }
        if (C1387310mCn.LJFF(j)) {
            return C2215181Bmu.LJJIII.getValue().LIZIZ(j, Locale.getDefault());
        }
        if (C1387310mCn.LJIIIIZZ(j)) {
            return C2215181Bmu.LJJIFFI.getValue().LIZIZ(j, Locale.getDefault());
        }
        if (LJJIFFI(j)) {
            return C2215181Bmu.LIZLLL.getValue().LIZIZ(j, Locale.getDefault());
        }
        if (LJJ(j)) {
            return C2215181Bmu.LJIILLIIL.getValue().LIZIZ(j, Locale.getDefault());
        }
        return C2215181Bmu.LJIIZILJ.getValue().LIZIZ(j, Locale.getDefault());
    }

    public static String LJ(long j) {
        if (LJIL(j)) {
            return LJIILJJIL().LIZIZ(j, Locale.getDefault());
        }
        if (LJIJJLI(j)) {
            return C2215091Bml.LIZ(LJIJI(j), EnumC21173917tZ.MINUTE);
        }
        if (LJIJJ(j)) {
            return C2215091Bml.LIZ(LJIJ(j), EnumC21173917tZ.HOUR);
        }
        if (LJJIFFI(j)) {
            return C2215091Bml.LIZ(LJIIZILJ(j), EnumC21173917tZ.DAY);
        }
        if (LJIIZILJ(j) == 7) {
            return C2215091Bml.LIZ(1, EnumC21173917tZ.WEEK);
        }
        if (LJJ(j)) {
            return C2215181Bmu.LJ.getValue().LIZIZ(j, Locale.getDefault());
        }
        return LJIILL().LIZIZ(j, Locale.getDefault());
    }

    public static String LJFF(long j) {
        if (LJIL(j)) {
            return LJIILJJIL().LIZIZ(j, Locale.getDefault());
        }
        if (LJIJJLI(j)) {
            return C2215091Bml.LIZIZ(-LJIJI(j), EnumC21173917tZ.MINUTE);
        }
        if (LJIJJ(j)) {
            return C2215091Bml.LIZIZ(-LJIJ(j), EnumC21173917tZ.HOUR);
        }
        if (LJJIFFI(j)) {
            return C2215091Bml.LIZIZ(-LJIIZILJ(j), EnumC21173917tZ.DAY);
        }
        if (LJJ(j)) {
            return C2215181Bmu.LJIILJJIL.getValue().LIZIZ(j, Locale.getDefault());
        }
        return C2215181Bmu.LJIILL.getValue().LIZIZ(j, Locale.getDefault());
    }

    public static String LJII(long j) {
        if (LJIL(j)) {
            return LJIILJJIL().LIZIZ(j, Locale.getDefault());
        }
        if (LJJIFFI(j)) {
            return C2215091Bml.LIZLLL(j, Locale.getDefault(), Collections.singleton(EnumC2215081Bmk.Date), EnumC2207011BZj.Mid, true, false, false, 1552);
        }
        if (LJJ(j)) {
            return C2215091Bml.LIZLLL(j, Locale.getDefault(), Collections.singleton(EnumC2215081Bmk.Date), EnumC2207011BZj.Mid, true, false, false, 1552);
        }
        return C2215091Bml.LIZLLL(j, Locale.getDefault(), C13LQ.LJLIIL(new EnumC2215081Bmk[]{EnumC2215081Bmk.Year, EnumC2215081Bmk.Date}), EnumC2207011BZj.Mid, true, false, false, 1552);
    }

    public static String LJIIIIZZ(long j) {
        long millis = TimeUnit.SECONDS.toMillis(j);
        if (j == 0) {
            return "";
        }
        if (C1387310mCn.LJIIIIZZ(millis)) {
            return C2215181Bmu.LJJIFFI.getValue().LIZIZ(millis, Locale.getDefault());
        }
        if (C1387310mCn.LJFF(millis)) {
            return C2215181Bmu.LJJIII.getValue().LIZIZ(millis, Locale.getDefault());
        }
        if (LJJI(millis)) {
            return C2215181Bmu.LJJIIJZLJL.getValue().LIZIZ(millis, Locale.getDefault());
        }
        if (!LJJ(millis)) {
            return C2215181Bmu.LJII.getValue().LIZIZ(millis, Locale.getDefault());
        }
        return C2215181Bmu.LJIIIZ.getValue().LIZIZ(millis, Locale.getDefault());
    }

    public static String LJIIIZ(long j) {
        if (LJIL(j)) {
            return LJIILJJIL().LIZIZ(j, Locale.getDefault());
        }
        if (LJIJJLI(j)) {
            return C2215091Bml.LIZ(LJIJI(j), EnumC21173917tZ.MINUTE);
        }
        if (LJIJJ(j)) {
            return C2215091Bml.LIZ(LJIJ(j), EnumC21173917tZ.HOUR);
        }
        if (LJJIFFI(j)) {
            return C2215091Bml.LIZ(LJIIZILJ(j), EnumC21173917tZ.DAY);
        }
        if (LJIIZILJ(j) == 7) {
            return C2215091Bml.LIZ(1, EnumC21173917tZ.WEEK);
        }
        if (LJJ(j)) {
            return C2215181Bmu.LJIJ.getValue().LIZIZ(j, Locale.getDefault());
        }
        return C2215181Bmu.LJIJI.getValue().LIZIZ(j, Locale.getDefault());
    }

    public static String LJIIJ(long j) {
        long millis = TimeUnit.SECONDS.toMillis(j);
        if (j == 0) {
            return "";
        }
        if (C1387310mCn.LJIIIIZZ(millis)) {
            return C2215181Bmu.LJJIFFI.getValue().LIZIZ(millis, Locale.getDefault());
        }
        if (C1387310mCn.LJFF(millis)) {
            return C2215181Bmu.LJJIII.getValue().LIZIZ(millis, Locale.getDefault());
        }
        if (LJJI(millis)) {
            return C2215181Bmu.LJJIIJZLJL.getValue().LIZIZ(millis, Locale.getDefault());
        }
        if (!LJJ(millis)) {
            return C2215181Bmu.LJIIJJI.getValue().LIZIZ(millis, Locale.getDefault());
        }
        return C2215181Bmu.LJIIL.getValue().LIZIZ(millis, Locale.getDefault());
    }

    public static String LJIIJJI(long j) {
        long millis = TimeUnit.SECONDS.toMillis(j);
        if (j == 0) {
            return "";
        }
        if (C1387310mCn.LJFF(millis)) {
            return C2215181Bmu.LJJII.getValue().LIZIZ(millis, Locale.getDefault());
        }
        if (LJJI(millis)) {
            return C2215181Bmu.LJJIIJ.getValue().LIZIZ(millis, Locale.getDefault());
        }
        return C2215181Bmu.LJIIIIZZ.getValue().LIZIZ(millis, Locale.getDefault());
    }

    public static String LJIIL(long j) {
        if (LJIL(j)) {
            return LJIILJJIL().LIZIZ(j, Locale.getDefault());
        }
        if (LJIJJLI(j)) {
            return C2215091Bml.LIZJ(-LJIJI(j), EnumC21173917tZ.MINUTE);
        }
        if (LJIJJ(j)) {
            return C2215091Bml.LIZJ(-LJIJ(j), EnumC21173917tZ.HOUR);
        }
        if (LJJIFFI(j)) {
            return C2215091Bml.LIZJ(-LJIIZILJ(j), EnumC21173917tZ.DAY);
        }
        if (System.currentTimeMillis() - j < 2419200000L) {
            return C2215091Bml.LIZJ(-LJIILLIIL(j, 604800000L), EnumC21173917tZ.WEEK);
        }
        if (LJJ(j)) {
            return C2215181Bmu.LJIJJLI.getValue().LIZIZ(j, Locale.getDefault());
        }
        return C2215181Bmu.LJIJJ.getValue().LIZIZ(j, Locale.getDefault());
    }

    public static String LJIILIIL(long j) {
        if (LJIL(j)) {
            return LJIILJJIL().LIZIZ(j, Locale.getDefault());
        }
        if (LJIJJLI(j)) {
            return C2215091Bml.LIZ(LJIJI(j), EnumC21173917tZ.MINUTE);
        }
        if (LJIJJ(j)) {
            return C2215091Bml.LIZ(LJIJ(j), EnumC21173917tZ.HOUR);
        }
        if (LJJIFFI(j)) {
            return C2215091Bml.LIZ(LJIIZILJ(j), EnumC21173917tZ.DAY);
        }
        if (LJIIZILJ(j) == 7) {
            return C2215091Bml.LIZ(1, EnumC21173917tZ.WEEK);
        }
        if (LJJ(j)) {
            return C2215181Bmu.LJIILIIL.getValue().LIZIZ(j, Locale.getDefault());
        }
        return LJIILL().LIZIZ(j, Locale.getDefault());
    }

    public static int LJIIZILJ(long j) {
        return LJIILLIIL(j, 86400000L);
    }

    public static int LJIJ(long j) {
        return LJIILLIIL(j, 3600000L);
    }

    public static int LJIJI(long j) {
        return LJIILLIIL(j, 60000L);
    }

    public static boolean LJIJJ(long j) {
        if (System.currentTimeMillis() - j < 86400000) {
            return true;
        }
        return false;
    }

    public static boolean LJIJJLI(long j) {
        if (System.currentTimeMillis() - j < 3600000) {
            return true;
        }
        return false;
    }

    public static boolean LJIL(long j) {
        if (System.currentTimeMillis() - j < 60000) {
            return true;
        }
        return false;
    }

    public static boolean LJJ(long j) {
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j);
        if (calendar2.get(1) == calendar.get(1)) {
            return true;
        }
        return false;
    }

    public static boolean LJJI(long j) {
        C1387320mCo c1387320mCoLIZLLL = C1387310mCn.LIZLLL();
        if (j > c1387320mCoLIZLLL.LIZ && j < c1387320mCoLIZLLL.LIZIZ) {
            return true;
        }
        return false;
    }

    public static boolean LJJIFFI(long j) {
        if (System.currentTimeMillis() - j < 604800000) {
            return true;
        }
        return false;
    }

    public static String LIZ(long j, String str) {
        return new BDDateFormat(str).LIZIZ(j, Locale.getDefault());
    }

    public static String LIZIZ(long j, boolean z) {
        boolean z2;
        String strLIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" · ");
        if (LJIL(j)) {
            strLIZIZ = LJIILJJIL().LIZIZ(j, Locale.getDefault());
        } else if (LJIJJLI(j)) {
            strLIZIZ = C2215091Bml.LIZ(LJIJI(j), EnumC21173917tZ.MINUTE);
        } else if (LJIJJ(j)) {
            strLIZIZ = C2215091Bml.LIZ(LJIJ(j), EnumC21173917tZ.HOUR);
        } else {
            C1387320mCo c1387320mCoLIZJ = C1387310mCn.LIZJ();
            long jLIZIZ = c1387320mCoLIZJ.LIZ - C1387310mCn.LIZIZ(6);
            c1387320mCoLIZJ.LIZ = jLIZIZ;
            long j2 = c1387320mCoLIZJ.LIZIZ;
            if (jLIZIZ <= j && j <= j2) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i = Integer.MAX_VALUE;
            if (z2) {
                long j3 = (C1387310mCn.LIZJ().LIZIZ - j) / 86400000;
                if (j3 <= 2147483647L) {
                    i = (int) j3;
                }
                strLIZIZ = C2215091Bml.LIZ(i, EnumC21173917tZ.DAY);
            } else if (LJJ(j)) {
                if (z) {
                    long j4 = (C1387310mCn.LIZJ().LIZIZ - j) / 604800000;
                    if (j4 <= 2147483647L) {
                        i = (int) j4;
                    }
                    strLIZIZ = C2215091Bml.LIZ(i, EnumC21173917tZ.WEEK);
                } else {
                    strLIZIZ = C2215181Bmu.LJIILIIL.getValue().LIZIZ(j, Locale.getDefault());
                }
            } else {
                strLIZIZ = LJIILL().LIZIZ(j, Locale.getDefault());
            }
        }
        sbLIZ.append(strLIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LJI(long j, boolean z) {
        if (LJIL(j)) {
            return LJIILJJIL().LIZIZ(j, Locale.getDefault());
        }
        if (LJIJJLI(j)) {
            return C2215091Bml.LIZ(LJIJI(j), EnumC21173917tZ.MINUTE);
        }
        if (LJIJJ(j)) {
            return C2215091Bml.LIZ(LJIJ(j), EnumC21173917tZ.HOUR);
        }
        if (LJJIFFI(j)) {
            return C2215091Bml.LIZ(LJIIZILJ(j), EnumC21173917tZ.DAY);
        }
        if (LJJ(j)) {
            if (z) {
                return C2215091Bml.LIZ(LJIILLIIL(j, 604800000L), EnumC21173917tZ.WEEK);
            }
            return C2215181Bmu.LJIILIIL.getValue().LIZIZ(j, Locale.getDefault());
        }
        return LJIILL().LIZIZ(j, Locale.getDefault());
    }

    public static int LJIILLIIL(long j, long j2) {
        long jCurrentTimeMillis = (System.currentTimeMillis() - j) / j2;
        if (jCurrentTimeMillis > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) jCurrentTimeMillis;
    }
}
