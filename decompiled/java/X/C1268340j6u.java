package X;

import android.content.Context;
import com.bytedance.android.livesdk.media.ttlhadaptive.gear.config.TTLHGearAdaptiveConfig;
import com.bytedance.android.starship.engine.strategy.IStarShipStrategy;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0j6u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1268340j6u {
    public C1268330j6t LIZ;
    public final C1267080j4s LIZIZ = new C1267080j4s();

    public final C1283410jVD LIZ() {
        C1283410jVD c1283410jVDLIZLLL;
        HashMap map = new HashMap();
        map.putAll(this.LIZIZ.LIZJ());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("gearSelect request");
        sbLIZ.append(map);
        C1283420jVE.LIZLLL("TTLHGearAdaptive", C2188811AlT.LIZIZ(sbLIZ));
        C1268330j6t c1268330j6t = this.LIZ;
        if (c1268330j6t.LIZ()) {
            String str = c1268330j6t.LIZLLL;
            InterfaceC1268370j6x interfaceC1268370j6x = c1268330j6t.LIZ;
            if (interfaceC1268370j6x == null) {
                return null;
            }
            c1283410jVDLIZLLL = interfaceC1268370j6x.LJI(str, map);
        } else {
            byte[] bArr = c1268330j6t.LIZJ;
            InterfaceC1268370j6x interfaceC1268370j6x2 = c1268330j6t.LIZ;
            if (interfaceC1268370j6x2 == null) {
                return null;
            }
            c1283410jVDLIZLLL = interfaceC1268370j6x2.LIZLLL(bArr, map);
        }
        if (c1283410jVDLIZLLL != null) {
            Map<String, Object> map2 = c1283410jVDLIZLLL.LIZ;
            if (map2 != null) {
                map2.containsKey("adaptive_results");
            }
            map.containsKey("adaptive_results");
            if (!this.LIZ.LIZ()) {
                c1283410jVDLIZLLL.LIZJ = map;
                return c1283410jVDLIZLLL;
            }
            c1283410jVDLIZLLL.LIZJ = c1283410jVDLIZLLL.LIZ;
        }
        return c1283410jVDLIZLLL;
    }

    public C1268340j6u(TTLHGearAdaptiveConfig tTLHGearAdaptiveConfig, Context context, IStarShipStrategy iStarShipStrategy) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initEngine adaptiveConfig");
        sbLIZ.append(tTLHGearAdaptiveConfig);
        C1283420jVE.LIZLLL("TTLHGearAdaptive", C2188811AlT.LIZIZ(sbLIZ));
        this.LIZ = new C1268330j6t(tTLHGearAdaptiveConfig, context, iStarShipStrategy);
    }
}
