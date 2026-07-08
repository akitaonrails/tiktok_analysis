package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0gzd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1186950gzd {
    public static final C1186950gzd LIZ = new C1186950gzd();
    public static final Keva LIZIZ = Keva.getRepo(LIZJ());

    public static Map LIZ() {
        Map map;
        Double d;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LIZ.getClass();
        Object objLJIIIZ = C1323690kYB.LIZ(C1BWL.LIZ()).LJIIIZ("com.tiktok.poi.jsb", LIZJ());
        if ((objLJIIIZ instanceof Map) && (map = (Map) objLJIIIZ) != null) {
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                if ((key instanceof String) && key != null) {
                    Object value = entry.getValue();
                    if ((value instanceof Double) && (d = (Double) value) != null) {
                        long jDoubleValue = (long) d.doubleValue();
                        if (jDoubleValue > 0) {
                            long jCurrentTimeMillis = System.currentTimeMillis() - jDoubleValue;
                            SettingsManager.LIZLLL().getClass();
                            Integer numValueOf = Integer.valueOf(SettingsManager.LJ("poi_takeout_3p_pin_to_top_valid_period", 30));
                            if (jCurrentTimeMillis < ((long) (numValueOf.intValue() > 0 ? numValueOf.intValue() : 30)) * 86400000) {
                                linkedHashMap.put(key, Long.valueOf(jDoubleValue));
                            }
                        }
                    }
                }
            }
        }
        return linkedHashMap;
    }

    public static String LIZJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("poi_detail_storage_merchant_dialog_key_");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LIZIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("merchant_click_time_");
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
