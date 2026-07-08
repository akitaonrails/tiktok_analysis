package X;

import android.content.Context;
import com.bytedance.android.livesdk.media.ttlhadaptive.engine.StrategyNodeConfig;
import com.bytedance.android.livesdk.media.ttlhadaptive.gear.config.TTLHGearAdaptiveConfig;
import com.bytedance.android.starship.engine.strategy.IStarShipStrategy;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: X.0j6t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1268330j6t {
    public final InterfaceC1268370j6x LIZ;
    public final TTLHGearAdaptiveConfig LIZIZ;
    public byte[] LIZJ;
    public String LIZLLL;

    public final boolean LIZ() {
        TTLHGearAdaptiveConfig tTLHGearAdaptiveConfig = this.LIZIZ;
        return tTLHGearAdaptiveConfig != null && tTLHGearAdaptiveConfig.LIZIZ();
    }

    public C1268330j6t(TTLHGearAdaptiveConfig tTLHGearAdaptiveConfig, Context context, IStarShipStrategy iStarShipStrategy) {
        Map<String, StrategyNodeConfig> map;
        boolean z;
        this.LIZIZ = tTLHGearAdaptiveConfig;
        if (LIZ()) {
            C2213491BkB c2213491BkB = new C2213491BkB(context);
            this.LIZ = c2213491BkB;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setStrategyStarShipService. IStarShipStrategy is null: ");
            if (iStarShipStrategy == null) {
                z = true;
            } else {
                z = false;
            }
            sbLIZ.append(z);
            C2188811AlT.LIZIZ(sbLIZ);
            c2213491BkB.LIZ = iStarShipStrategy;
        } else {
            this.LIZ = new C2213501BkC(context);
        }
        if (tTLHGearAdaptiveConfig != null && (map = tTLHGearAdaptiveConfig.strategyData) != null && map.size() == 1) {
            Iterator<Map.Entry<String, StrategyNodeConfig>> it2 = tTLHGearAdaptiveConfig.strategyData.entrySet().iterator();
            while (it2.hasNext()) {
                StrategyNodeConfig value = it2.next().getValue();
                if (LIZ()) {
                    String str = value.strategyKey;
                    InterfaceC1268370j6x interfaceC1268370j6x = this.LIZ;
                    if (interfaceC1268370j6x != null) {
                        interfaceC1268370j6x.LJ(str);
                        this.LIZLLL = str;
                    }
                } else {
                    String str2 = value.b_data;
                    InterfaceC1268370j6x interfaceC1268370j6x2 = this.LIZ;
                    if (interfaceC1268370j6x2 != null) {
                        this.LIZJ = interfaceC1268370j6x2.LIZJ(str2);
                    }
                }
            }
        }
    }
}
