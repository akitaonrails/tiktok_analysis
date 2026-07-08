package X;

import com.bytedance.android.livestrategy.LiveStrategyCenterService;
import com.bytedance.android.livestrategy.config.FinalStrategyConfig;
import com.ss.android.ugc.aweme.live.strategy.HostClientAiService$wrapperLivePitayaCore$1;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0eYg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1093360eYg implements C157Y {
    public final /* synthetic */ InterfaceC1092770eXj LIZ;
    public final /* synthetic */ FinalStrategyConfig LIZIZ;
    public final /* synthetic */ LiveStrategyCenterService LIZJ;

    @Override // X.C157Y
    public final void LIZ() {
        this.LIZ.LIZJ(new C477840IoY(EnumC1090770eUV.PITAYA_NOT_INIT.getCode(), "pitaya env not ready"));
    }

    @Override // X.C157Y
    public final void LIZIZ(HostClientAiService$wrapperLivePitayaCore$1 hostClientAiService$wrapperLivePitayaCore$1) throws JSONException {
        String strategyName = this.LIZIZ.getStrategyName();
        LiveStrategyCenterService liveStrategyCenterService = this.LIZJ;
        FinalStrategyConfig finalStrategyConfig = this.LIZIZ;
        liveStrategyCenterService.getClass();
        Map mapLIZ = LiveStrategyCenterService.LIZ(finalStrategyConfig);
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : ((LinkedHashMap) mapLIZ).entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        final InterfaceC1092770eXj interfaceC1092770eXj = this.LIZ;
        final FinalStrategyConfig finalStrategyConfig2 = this.LIZIZ;
        InterfaceC472990Igj interfaceC472990Igj = new InterfaceC472990Igj() { // from class: X.0eYQ
            @Override // X.InterfaceC472990Igj
            public final void LIZ(C1093210eYR c1093210eYR) {
                int i = c1093210eYR.LIZ;
                if (i == 0 && c1093210eYR.LIZIZ != null) {
                    InterfaceC1092770eXj interfaceC1092770eXj2 = interfaceC1092770eXj;
                    String strategyName2 = finalStrategyConfig2.getStrategyName();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("error", c1093210eYR.LIZJ);
                    interfaceC1092770eXj2.LIZLLL(new C1093040eYA(strategyName2, c1093210eYR, linkedHashMap));
                    return;
                }
                interfaceC1092770eXj.LIZJ(new C477840IoY(i, String.valueOf(c1093210eYR.LIZJ)));
            }
        };
        long pendingTimeout = finalStrategyConfig2.getPendingTimeout();
        this.LIZIZ.getAsync();
        hostClientAiService$wrapperLivePitayaCore$1.LIZLLL(strategyName, jSONObject, interfaceC472990Igj, new C464190IIf(pendingTimeout, 15));
    }

    public C1093360eYg(LiveStrategyCenterService liveStrategyCenterService, InterfaceC1092770eXj interfaceC1092770eXj, FinalStrategyConfig finalStrategyConfig) {
        this.LIZ = interfaceC1092770eXj;
        this.LIZIZ = finalStrategyConfig;
        this.LIZJ = liveStrategyCenterService;
    }
}
