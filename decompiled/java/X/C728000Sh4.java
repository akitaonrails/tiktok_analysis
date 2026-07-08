package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Sh4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C728000Sh4 {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(433));

    public final synchronized long LIZLLL() {
        try {
            String strLIZIZ = LIZIZ();
            if (Intrinsics.LJFF(strLIZIZ, "display_promo_cell_timestamps_")) {
                return 0L;
            }
            Long lLJIILIIL = C2095008Iq.LJIILIIL(LIZJ().getString(strLIZIZ, ""));
            return lLJIILIIL != null ? lLJIILIIL.longValue() : 0L;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 0L;
        }
    }

    public final synchronized boolean LJIIIIZZ() {
        boolean z = false;
        if (((Number) C0AV1.LIZ.getValue()).intValue() == 1) {
            return true;
        }
        C728010Sh5.LIZ.getClass();
        if (C728010Sh5.LIZIZ()) {
            C728020Sh6.LIZ.getClass();
            if (C728020Sh6.LIZIZ.LIZ().intValue() == 1 && ((Number) C0AV2.LIZ.getValue()).intValue() == 1) {
                try {
                    String strLJFF = LJFF();
                    if (Intrinsics.LJFF(strLJFF, "display_timestamps_")) {
                        return false;
                    }
                    String strLJI = LJI();
                    if (Intrinsics.LJFF(strLJI, "display_total_count_")) {
                        return false;
                    }
                    if (LIZJ().getInt(strLJI, 0) >= 2) {
                        return false;
                    }
                    if (LJII()) {
                        return false;
                    }
                    Long l = (Long) C13LP.LJJLIIIJLJLI(LJIIJ(LIZJ().getString(strLJFF, "")));
                    if (l != null) {
                        long jLongValue = l.longValue();
                        if (jLongValue > 0) {
                            if (System.currentTimeMillis() - jLongValue < 259200000) {
                                return false;
                            }
                        }
                    }
                    z = true;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                return z;
            }
        }
        return false;
    }

    public final synchronized void LJIIIZ() {
        String strLJFF;
        try {
            strLJFF = LJFF();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (Intrinsics.LJFF(strLJFF, "display_timestamps_")) {
            return;
        }
        ArrayList arrayList = new ArrayList(LJIIJ(LIZJ().getString(strLJFF, "")));
        arrayList.add(Long.valueOf(System.currentTimeMillis()));
        List listLL = C13LP.LL(C13LP.LJLLL(arrayList), 2);
        String strLJFF2 = LJFF();
        if (!Intrinsics.LJFF(strLJFF2, "display_timestamps_")) {
            LIZJ().storeString(strLJFF2, C13LP.LJJLIIIJ(listLL, ",", null, null, 0, null, null, 62));
        }
        String strLJI = LJI();
        if (!Intrinsics.LJFF(strLJI, "display_total_count_")) {
            LIZJ().storeInt(strLJI, LIZJ().getInt(strLJI, 0) + 1);
        }
    }

    public final synchronized void LJIIJJI() {
        String strLJ;
        try {
            strLJ = LJ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (Intrinsics.LJFF(strLJ, "last_publish_ts_")) {
            return;
        }
        LIZJ().storeLong(strLJ, System.currentTimeMillis());
    }

    public final Keva LIZJ() {
        return (Keva) this.LIZ.getValue();
    }

    public static String LIZIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("display_promo_cell_timestamps_");
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        sbLIZ.append(curUserId);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("last_publish_ts_");
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        sbLIZ.append(curUserId);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LJFF() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("display_timestamps_");
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        sbLIZ.append(curUserId);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LJI() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("display_total_count_");
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        sbLIZ.append(curUserId);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean LJII() {
        String strLJ = LJ();
        if (Intrinsics.LJFF(strLJ, "last_publish_ts_")) {
            return false;
        }
        long j = LIZJ().getLong(strLJ, 0L);
        if (j <= 0) {
            return false;
        }
        return Intrinsics.LJFF(LIZ(j), LIZ(System.currentTimeMillis()));
    }

    public static String LIZ(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        return C786410Ut5.j4("%04d%02d%02d", Arrays.copyOf(new Object[]{Integer.valueOf(calendar.get(1)), Integer.valueOf(calendar.get(2) + 1), Integer.valueOf(calendar.get(5))}, 3));
    }

    public static List LJIIJ(String str) {
        List listLJJLIIIJILLIZJL;
        if (str != null && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6)) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it2 = listLJJLIIIJILLIZJL.iterator();
            while (it2.hasNext()) {
                Long lLJIILIIL = C2095008Iq.LJIILIIL(a0.LJLIIIL((String) it2.next()).toString());
                if (lLJIILIIL != null) {
                    arrayList.add(lLJIILIIL);
                }
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }
}
