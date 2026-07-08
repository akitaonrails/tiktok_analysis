package X;

import android.text.format.DateUtils;
import com.bytedance.android.livesdk.model.DateFrequencyModel;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0eKY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1084600eKY {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(C1084590eKX c1084590eKX) {
        int i = C585030Mx3.LIZ[c1084590eKX.LJFF.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return "all";
            }
            throw new C1954807lC();
        }
        return String.valueOf(c1084590eKX.LIZ);
    }

    public static Map LIZJ(EnumC585020Mx2 enumC585020Mx2) {
        Map<String, DateFrequencyModel> mapLIZ;
        int i = C585030Mx3.LIZ[enumC585020Mx2.ordinal()];
        if (i != 1) {
            if (i == 2) {
                mapLIZ = InterfaceC1106030et7.ea.LIZ();
            } else {
                throw new C1954807lC();
            }
        } else {
            mapLIZ = InterfaceC1106030et7.ca.LIZ();
        }
        if (mapLIZ == null) {
            return C2097608Jq.LJ();
        }
        return mapLIZ;
    }

    public static Map LIZLLL(EnumC585020Mx2 enumC585020Mx2) {
        Map<String, Long> mapLIZ;
        int i = C585030Mx3.LIZ[enumC585020Mx2.ordinal()];
        if (i != 1) {
            if (i == 2) {
                mapLIZ = InterfaceC1106030et7.fa.LIZ();
            } else {
                throw new C1954807lC();
            }
        } else {
            mapLIZ = InterfaceC1106030et7.da.LIZ();
        }
        if (mapLIZ == null) {
            return C2097608Jq.LJ();
        }
        return mapLIZ;
    }

    public static String LIZIZ(long j, C1084590eKX c1084590eKX) {
        int i = C585030Mx3.LIZ[c1084590eKX.LJFF.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return String.valueOf(j);
            }
            throw new C1954807lC();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c1084590eKX.LIZ);
        sbLIZ.append('#');
        sbLIZ.append(j);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LJ(long j, C1084590eKX c1084590eKX) {
        long jLongValue = 0;
        if (j <= 0) {
            return;
        }
        String strLIZIZ = LIZIZ(j, c1084590eKX);
        LinkedHashMap linkedHashMap = new LinkedHashMap(LIZLLL(c1084590eKX.LJFF));
        Long l = (Long) linkedHashMap.get(strLIZIZ);
        if (l != null) {
            jLongValue = l.longValue();
        }
        linkedHashMap.put(strLIZIZ, Long.valueOf(jLongValue + 1));
        int i = C585030Mx3.LIZ[c1084590eKX.LJFF.ordinal()];
        if (i != 1) {
            if (i == 2) {
                InterfaceC1106030et7.fa.LIZJ(linkedHashMap);
            } else {
                throw new C1954807lC();
            }
        } else {
            InterfaceC1106030et7.da.LIZJ(linkedHashMap);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(LIZJ(c1084590eKX.LJFF));
        String strLIZ = LIZ(c1084590eKX);
        DateFrequencyModel dateFrequencyModel = (DateFrequencyModel) linkedHashMap2.get(strLIZ);
        if (dateFrequencyModel == null) {
            dateFrequencyModel = new DateFrequencyModel(0L, 0);
        }
        if (!DateUtils.isToday(dateFrequencyModel.timestamp)) {
            dateFrequencyModel.timestamp = System.currentTimeMillis();
            dateFrequencyModel.frequencyCount = 0;
        }
        dateFrequencyModel.frequencyCount++;
        linkedHashMap2.put(strLIZ, dateFrequencyModel);
        LJFF(c1084590eKX.LJFF, linkedHashMap2);
    }

    public static void LJFF(EnumC585020Mx2 enumC585020Mx2, Map map) {
        int i = C585030Mx3.LIZ[enumC585020Mx2.ordinal()];
        if (i != 1) {
            if (i == 2) {
                InterfaceC1106030et7.ea.LIZJ(map);
                return;
            }
            throw new C1954807lC();
        }
        InterfaceC1106030et7.ca.LIZJ(map);
    }

    public static boolean LJI(long j, C1084590eKX c1084590eKX) {
        long jLongValue = 0;
        if (j <= 0) {
            return false;
        }
        long j2 = c1084590eKX.LIZLLL;
        long j3 = -1;
        if (j2 == -1) {
            j2 = -1;
        } else if (j2 <= 0) {
            j2 = 1;
        }
        long j4 = c1084590eKX.LJ;
        if (j4 != -1) {
            if (j4 > 0) {
                j3 = j4;
            } else {
                j3 = 10;
            }
        }
        if (j2 == 0 || j3 == 0) {
            return false;
        }
        if (j2 >= 0) {
            Long l = (Long) LIZLLL(c1084590eKX.LJFF).get(LIZIZ(j, c1084590eKX));
            if (l != null) {
                jLongValue = l.longValue();
            }
            if (jLongValue >= j2) {
                return false;
            }
        }
        if (j3 < 0) {
            return true;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(LIZJ(c1084590eKX.LJFF));
        String strLIZ = LIZ(c1084590eKX);
        DateFrequencyModel dateFrequencyModel = (DateFrequencyModel) linkedHashMap.get(strLIZ);
        if (dateFrequencyModel == null) {
            dateFrequencyModel = new DateFrequencyModel(0L, 0);
        }
        if (!DateUtils.isToday(dateFrequencyModel.timestamp)) {
            dateFrequencyModel.timestamp = System.currentTimeMillis();
            dateFrequencyModel.frequencyCount = 0;
            linkedHashMap.put(strLIZ, dateFrequencyModel);
            LJFF(c1084590eKX.LJFF, linkedHashMap);
        }
        if (dateFrequencyModel.frequencyCount >= j3) {
            return false;
        }
        return true;
    }
}
