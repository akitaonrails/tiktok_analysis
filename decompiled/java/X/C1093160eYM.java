package X;

import com.bytedance.android.livestrategy.ILiveFeatureCenterService;
import com.bytedance.android.livestrategy.config.TriggerStrategyConfig;
import com.tiktok.ttm.TTMParamData;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0eYM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1093160eYM extends AbstractC830880Wic {
    public final /* synthetic */ InterfaceC1092770eXj LIZ;
    public final /* synthetic */ TriggerStrategyConfig LIZIZ;

    public C1093160eYM(InterfaceC1092770eXj interfaceC1092770eXj, TriggerStrategyConfig triggerStrategyConfig) {
        this.LIZ = interfaceC1092770eXj;
        this.LIZIZ = triggerStrategyConfig;
    }

    @Override // X.AbstractC830880Wic
    public final void LIZ(InterfaceC805220ViK interfaceC805220ViK, InterfaceC830890Wid interfaceC830890Wid) {
        this.LIZ.LIZLLL(C1093130eYJ.LIZJ(this.LIZIZ.getStrategyName(), interfaceC830890Wid, interfaceC805220ViK));
    }

    @Override // X.AbstractC830880Wic
    public final void LIZJ(InterfaceC830890Wid interfaceC830890Wid, EnumC2213771Bkd enumC2213771Bkd) {
        this.LIZIZ.setTtmScene(interfaceC830890Wid);
        this.LIZ.LIZIZ(interfaceC830890Wid, enumC2213771Bkd);
    }

    @Override // X.AbstractC830880Wic
    public final TTMParamData LIZIZ(C830870Wib c830870Wib, String str, AnonymousClass1696 anonymousClass1696) {
        C1090000eTG c1090000eTGO3;
        Object obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, Map<String, List<String>>> inputParamsKey = this.LIZIZ.getInputParamsKey();
        if (inputParamsKey != null) {
            for (Map.Entry<String, Map<String, List<String>>> entry : inputParamsKey.entrySet()) {
                String key = entry.getKey();
                Map<String, List<String>> value = entry.getValue();
                EnumC1094630eaj.Companion.getClass();
                EnumC1094630eaj enumC1094630eajLIZ = C1094620eai.LIZ(key);
                for (Map.Entry<String, List<String>> entry2 : value.entrySet()) {
                    String key2 = entry2.getKey();
                    for (String str2 : entry2.getValue()) {
                        ILiveFeatureCenterService iLiveFeatureCenterService = (ILiveFeatureCenterService) C1161920gLG.LIZJ(ILiveFeatureCenterService.class);
                        if (iLiveFeatureCenterService != null && (c1090000eTGO3 = iLiveFeatureCenterService.O3(enumC1094630eajLIZ, key2, str2)) != null && (obj = c1090000eTGO3.LIZJ) != null) {
                            linkedHashMap.put(str2, obj);
                        }
                    }
                }
            }
        }
        return new TTMParamData((Map<String, Object>) linkedHashMap);
    }
}
