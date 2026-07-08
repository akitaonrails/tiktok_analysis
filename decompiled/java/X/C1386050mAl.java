package X;

import com.tiktok.strategycenterengine.manager.TTMStrategyCenterManager;
import com.tiktok.ttm.TTMParamData;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mAl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1386050mAl {
    public static final C1386040mAk LIZJ = new C1386040mAk();
    public static volatile C1386050mAl LIZLLL;
    public final ConcurrentHashMap<String, InterfaceC830890Wid> LIZ = new ConcurrentHashMap<>();
    public boolean LIZIZ;

    public final void LIZIZ() {
        LIZJ("social_search_config");
        LIZJ("social_search_matcher");
        LIZJ("social_search_matching_condition");
        LIZJ("social_search_ranking_strategy");
        LIZJ("social_search_preprocessor");
        LIZJ("social_search_threading_config");
        LIZJ("social_search_matching_filter");
        LIZJ("social_search_typing_feature");
    }

    public final InterfaceC830890Wid LIZ(String str) {
        return this.LIZ.get(str);
    }

    public final void LIZJ(final String str) {
        C830920Wig c830920Wig = new C830920Wig();
        c830920Wig.LIZ = new Object() { // from class: X.0mAn
            {
                System.currentTimeMillis();
                C461720I8s.LIZIZ();
            }
        };
        c830920Wig.LIZIZ = true;
        TTMStrategyCenterManager.asyncRegisterSceneWithSceneKey(str, C13BV.INSTANCE, c830920Wig.LIZ(), new AbstractC830880Wic() { // from class: X.0mAm
            @Override // X.AbstractC830880Wic
            public final void LIZJ(InterfaceC830890Wid interfaceC830890Wid, EnumC2213771Bkd enumC2213771Bkd) {
                InterfaceC830890Wid interfaceC830890WidLIZ;
                if (interfaceC830890Wid != null && enumC2213771Bkd == EnumC2213771Bkd.TTMStateCodeSuccess) {
                    this.LIZ.LIZ.put(str, interfaceC830890Wid);
                    if (Intrinsics.LJFF(str, "social_search_config") && (interfaceC830890WidLIZ = this.LIZ.LIZ(str)) != null) {
                        C1386000mAg.LIZ.getClass();
                        C1386000mAg.LIZJ = new LinkedHashMap(C1386000mAg.LIZIZ);
                        Map<String, InterfaceC805220ViK> mapRunScene = TTMStrategyCenterManager.runScene(interfaceC830890WidLIZ, new TTMParamData((Map<String, Object>) C2097608Jq.LJ()));
                        if (mapRunScene != null) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            for (Map.Entry<String, InterfaceC805220ViK> entry : mapRunScene.entrySet()) {
                                String key = entry.getKey();
                                InterfaceC805220ViK value = entry.getValue();
                                if (value != null) {
                                    Object objLIZJ = value.LIZJ();
                                    if ((objLIZJ instanceof Map) && objLIZJ != null) {
                                        linkedHashMap.put(key, objLIZJ);
                                    }
                                }
                            }
                            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                                C1386000mAg.LIZJ.put((String) entry2.getKey(), (Map<String, Object>) entry2.getValue());
                            }
                        }
                    }
                }
            }
        });
    }
}
