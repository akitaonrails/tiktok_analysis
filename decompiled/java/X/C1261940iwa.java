package X;

import android.os.Build;
import android.os.SystemClock;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.time.DateTimeException;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.0iwa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1261940iwa {
    public static final C1261940iwa LIZ = new C1261940iwa();
    public static final Set<String> LIZIZ = new HashSet();
    public static final Set<String> LIZJ = new HashSet();
    public static final long LIZLLL;

    static {
        Long l = (Long) C1263590izF.LJI.getValue();
        LIZLLL = l != null ? l.longValue() : 1728000L;
    }

    public static Keva LIZIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ffpFreqControl");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        return Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static boolean LIZ(EnumC1261960iwc enumC1261960iwc) {
        Set<String> set = LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(enumC1261960iwc);
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        return ((HashSet) set).contains(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static boolean LIZJ(EnumC1261960iwc enumC1261960iwc) {
        long jCurrentTimeMillis;
        if (Build.VERSION.SDK_INT >= 34) {
            try {
                jCurrentTimeMillis = SystemClock.currentNetworkTimeClock().millis();
            } catch (DateTimeException e) {
                TryCatchGuardChecker.doCheck(e);
                jCurrentTimeMillis = System.currentTimeMillis();
            }
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        Keva kevaLIZIZ = LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("lastRemoveTime");
        sbLIZ.append(enumC1261960iwc);
        if (jCurrentTimeMillis - kevaLIZIZ.getLong(C2188811AlT.LIZIZ(sbLIZ), 0L) < LIZLLL) {
            return true;
        }
        return false;
    }

    public static EnumC1261960iwc LIZLLL(EnumC1262370ixH enumC1262370ixH) {
        if (enumC1262370ixH != null) {
            int i = C1262380ixI.LIZ[enumC1262370ixH.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return EnumC1261960iwc.FRIEND_LIST;
                    }
                } else {
                    return EnumC1261960iwc.FOLLOWING_LIST;
                }
            } else {
                return EnumC1261960iwc.INBOX_PAGE;
            }
        }
        return EnumC1261960iwc.UNKNOWN;
    }

    public static void LJ(EnumC1261960iwc enumC1261960iwc) {
        int iIntValue;
        Keva kevaLIZIZ = LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("loadTime");
        sbLIZ.append(enumC1261960iwc);
        int i = kevaLIZIZ.getInt(C2188811AlT.LIZIZ(sbLIZ), 0);
        Keva kevaLIZIZ2 = LIZIZ();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("exposeTime");
        sbLIZ2.append(enumC1261960iwc);
        int i2 = kevaLIZIZ2.getInt(C2188811AlT.LIZIZ(sbLIZ2), 0);
        Integer num = (Integer) C1263590izF.LJFF.getValue();
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        if (i - i2 >= iIntValue) {
            LJFF(enumC1261960iwc);
            return;
        }
        Set<String> set = LIZJ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(enumC1261960iwc);
        sbLIZ3.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        HashSet hashSet = (HashSet) set;
        if (!hashSet.contains(C2188811AlT.LIZIZ(sbLIZ3))) {
            Keva kevaLIZIZ3 = LIZIZ();
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("loadTime");
            sbLIZ4.append(enumC1261960iwc);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
            Keva kevaLIZIZ4 = LIZIZ();
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("loadTime");
            sbLIZ5.append(enumC1261960iwc);
            kevaLIZIZ3.storeInt(strLIZIZ, kevaLIZIZ4.getInt(C2188811AlT.LIZIZ(sbLIZ5), 0) + 1);
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append(enumC1261960iwc);
            sbLIZ6.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
            hashSet.add(C2188811AlT.LIZIZ(sbLIZ6));
        }
    }

    public static void LJFF(EnumC1261960iwc enumC1261960iwc) {
        long jCurrentTimeMillis;
        Keva kevaLIZIZ = LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("exposeTime");
        sbLIZ.append(enumC1261960iwc);
        kevaLIZIZ.storeInt(C2188811AlT.LIZIZ(sbLIZ), 0);
        Keva kevaLIZIZ2 = LIZIZ();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("loadTime");
        sbLIZ2.append(enumC1261960iwc);
        kevaLIZIZ2.storeInt(C2188811AlT.LIZIZ(sbLIZ2), 0);
        if (Build.VERSION.SDK_INT >= 34) {
            try {
                jCurrentTimeMillis = SystemClock.currentNetworkTimeClock().millis();
            } catch (DateTimeException e) {
                TryCatchGuardChecker.doCheck(e);
                jCurrentTimeMillis = System.currentTimeMillis();
            }
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        Keva kevaLIZIZ3 = LIZIZ();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("lastRemoveTime");
        sbLIZ3.append(enumC1261960iwc);
        kevaLIZIZ3.storeLong(C2188811AlT.LIZIZ(sbLIZ3), jCurrentTimeMillis);
    }
}
