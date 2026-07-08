package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.effectcreator.experiments.AmePreloaderNetConfig;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.02wH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C749502wH {
    public static final C749502wH LIZ = new C749502wH();
    public static final Map<String, Map<String, String>> LIZIZ;
    public static final Map<String, ? extends Map<String, String>> LIZJ;
    public static Map<String, AmePreloaderNetConfig> LIZLLL;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LIZIZ = linkedHashMap;
        LIZJ = (Map) C0C64.LJIILLIIL().LJJII(Map.class, linkedHashMap, "ame_main_tab_config_map", true);
    }

    public static final Map<String, AmePreloaderNetConfig> LIZ() {
        Map<String, AmePreloaderNetConfig> map = LIZLLL;
        if (map != null) {
            return map;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            Map<String, ? extends Map<String, String>> map2 = LIZJ;
            if (map2 != null) {
                for (Map.Entry<String, ? extends Map<String, String>> entry : map2.entrySet()) {
                    linkedHashMap.put(entry.getKey(), C7740030o.LIZ().getGson().LIZJ(C7740030o.LIZ().getGson().LJIJJLI(entry.getValue()), AmePreloaderNetConfig.class));
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZLLL = linkedHashMap;
        return linkedHashMap;
    }
}
