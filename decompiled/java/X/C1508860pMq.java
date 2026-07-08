package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.ml.feature.flash.FlashCommonFreeRideApiConfig;
import com.ss.android.ugc.aweme.ml.feature.flash.FlashFreeRideConfig;
import com.ss.android.ugc.aweme.ml.request.meta.FlashFeatureSetConfig;
import com.ss.ugc.clientai.core.api.meta.FeatureSetConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0pMq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1508860pMq {
    public static final HashMap<String, FeatureSetConfig> LIZ = new HashMap<>();

    public static HashMap LIZ() {
        HashMap<String, FeatureSetConfig> map = LIZ;
        if (map.isEmpty()) {
            String strLIZIZ = C0R1F.LIZIZ("feature_set_info");
            try {
                if (!(strLIZIZ.length() > 0)) {
                    return map;
                }
                Map<? extends String, ? extends FeatureSetConfig> map2 = (Map) C08JS.LIZIZ().LJIIIIZZ(strLIZIZ, new TypeToken<Map<String, ? extends FeatureSetConfig>>() { // from class: X.0pMr
                }.getType());
                if (map2 != null) {
                    map.putAll(map2);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getFeatureSetConfigList error: ");
                sbLIZ.append(e);
                C2188811AlT.LIZIZ(sbLIZ);
            }
        }
        return LIZ;
    }

    public static Map LIZIZ() {
        Map map;
        HashMap map2 = new HashMap();
        String strLIZIZ = C0R1F.LIZIZ("flash_feed_feature_set");
        try {
            if ((strLIZIZ.length() > 0) && (map = (Map) C08JS.LIZIZ().LJIIIIZZ(strLIZIZ, new TypeToken<Map<String, ? extends List<? extends FlashFeatureSetConfig>>>() { // from class: X.0pMs
            }.getType())) != null) {
                map2.putAll(map);
                return map2;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1337780kuu.LIZ(e, null, 6);
        }
        return map2;
    }

    public static Map LIZJ() {
        Map map;
        HashMap map2 = new HashMap();
        String strLIZIZ = C0R1F.LIZIZ("flash_free_ride_config");
        try {
            if ((strLIZIZ.length() > 0) && (map = (Map) C08JS.LIZIZ().LJIIIIZZ(strLIZIZ, new TypeToken<Map<String, ? extends FlashFreeRideConfig>>() { // from class: X.0pMo
            }.getType())) != null) {
                map2.putAll(map);
                return map2;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1337780kuu.LIZ(e, null, 6);
        }
        return map2;
    }

    public static Map LIZLLL() {
        Map map;
        HashMap map2 = new HashMap();
        String strLIZIZ = C0R1F.LIZIZ("flash_link_config");
        try {
            if ((strLIZIZ.length() > 0) && (map = (Map) C08JS.LIZIZ().LJIIIIZZ(strLIZIZ, new TypeToken<Map<String, ? extends FlashCommonFreeRideApiConfig>>() { // from class: X.0pMp
            }.getType())) != null) {
                map2.putAll(map);
                return map2;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1337780kuu.LIZ(e, null, 6);
        }
        return map2;
    }
}
