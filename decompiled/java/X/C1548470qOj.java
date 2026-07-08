package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0qOj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1548470qOj {
    public static final Map<String, String> LIZ = C2097608Jq.LJ();

    public static EnumC1548460qOi LIZ(String str) {
        Integer numLJIIJJI;
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        Map<String, String> map = LIZ;
        Map<String, String> map2 = (Map) c0c64LJIILLIIL.LJJII(Map.class, map, "short_drama_lynx_preload_mode_settings", true);
        if (map2 != null) {
            map = map2;
        }
        String str2 = map.get(str);
        if (str2 != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str2)) != null) {
            if (numLJIIJJI.intValue() == 1) {
                return EnumC1548460qOi.FOREST_RESOURCE_PRELOAD;
            }
            if (numLJIIJJI.intValue() == 2) {
                return EnumC1548460qOi.SPARK_PRELOAD_PENDING_LOAD;
            }
            if (numLJIIJJI.intValue() == 3) {
                return EnumC1548460qOi.SPARK_PRELOAD_PENDING_RUNTIME;
            }
            if (numLJIIJJI.intValue() == 4) {
                return EnumC1548460qOi.SPARK_PRELOAD_FULL_MODE;
            }
        }
        return EnumC1548460qOi.FOREST_RESOURCE_PRELOAD;
    }
}
