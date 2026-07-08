package X;

import com.ss.ttlivestreamer.livestreamv2.videoquality.probe.model.select.BwProbeBaseGearSelectConfig;
import com.ss.ttlivestreamer.livestreamv2.videoquality.strategycenter.model.BitrateConfig;
import com.ss.ttlivestreamer.livestreamv2.videoquality.strategycenter.model.StrategyConfig;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: X.1D4q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2249981D4q {
    public Map<String, Map<String, BitrateConfig>> LIZ;
    public final Map<String, StrategyConfig> LIZIZ;
    public Map<String, BwProbeBaseGearSelectConfig> LIZJ;
    public final Boolean LIZLLL;
    public EnumC1283150jUn LJ;

    public final void LIZ() {
        Map<String, Map<String, BitrateConfig>> map = this.LIZ;
        if (map != null) {
            for (Map.Entry<String, Map<String, BitrateConfig>> entry : map.entrySet()) {
                entry.getKey();
                Iterator<Map.Entry<String, BitrateConfig>> it2 = entry.getValue().entrySet().iterator();
                while (it2.hasNext()) {
                    it2.next();
                }
            }
        }
    }

    public final void LIZIZ() {
        Map<String, BwProbeBaseGearSelectConfig> map = this.LIZJ;
        if (map != null) {
            for (Map.Entry<String, BwProbeBaseGearSelectConfig> entry : map.entrySet()) {
                entry.getKey();
                entry.getValue();
            }
        }
    }

    public C2249981D4q(Map map, Map map2, Map map3, Boolean bool) {
        this.LIZ = map;
        this.LIZIZ = map2;
        this.LIZJ = map3;
        this.LIZLLL = bool;
        LIZ();
        LIZIZ();
    }
}
