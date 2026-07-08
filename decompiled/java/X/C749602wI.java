package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.effectcreator.experiments.AmePreloaderNetConfig;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.02wI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C749602wI {
    public static final C749602wI LIZ = new C749602wI();
    public static final Map<String, Map<String, String>> LIZIZ;
    public static final Map<String, ? extends Map<String, String>> LIZJ;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LIZIZ = linkedHashMap;
        LIZJ = (Map) C0C64.LJIILLIIL().LJJII(Map.class, linkedHashMap, "ame_task_config_map", true);
    }

    public static final Map<String, AmePreloaderNetConfig> LIZ() {
        Map<String, ? extends Map<String, String>> map = LIZJ;
        if (map == null) {
            return new LinkedHashMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            for (Map.Entry<String, ? extends Map<String, String>> entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), C7740030o.LIZ().getGson().LIZJ(C7740030o.LIZ().getGson().LJIJJLI(entry.getValue()), AmePreloaderNetConfig.class));
            }
            return linkedHashMap;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return linkedHashMap;
        }
    }
}
