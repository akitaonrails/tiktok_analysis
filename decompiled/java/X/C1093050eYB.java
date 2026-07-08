package X;

import com.bytedance.android.livestrategy.ILiveStrategyCenterService;
import com.bytedance.android.livestrategy.config.StrategyConfig;
import com.bytedance.android.livestrategy.config.TriggerStrategyConfig;
import kotlin.jvm.internal.AFwS205S0000000_17;

/* JADX INFO: renamed from: X.0eYB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1093050eYB {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(205));

    public final ILiveStrategyCenterService LIZ() {
        return (ILiveStrategyCenterService) this.LIZ.getValue();
    }

    public final void LIZIZ(String str) {
        TriggerStrategyConfig triggerStrategyConfig;
        StrategyConfig strategyConfig = C1093080eYE.LIZ.get(str);
        if (strategyConfig != null && (triggerStrategyConfig = strategyConfig.getTriggerStrategyConfig()) != null) {
            LIZ().T4(triggerStrategyConfig);
        } else {
            ILiveStrategyCenterService iLiveStrategyCenterServiceLIZ = LIZ();
            TriggerStrategyConfig triggerStrategyConfig2 = new TriggerStrategyConfig("", "", 1L, 0L, null, null, null, null, null, null, null, null, null);
            triggerStrategyConfig2.setStrategyName(str);
            triggerStrategyConfig2.setType(EnumC1093190eYP.FEATURE_MODIFY.getType());
            iLiveStrategyCenterServiceLIZ.T4(triggerStrategyConfig2);
        }
        if (strategyConfig == null) {
            LIZ().Hv1(str);
        }
    }
}
