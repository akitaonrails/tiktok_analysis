package X;

import com.ss.android.ugc.aweme.ecommercelive.audience.common.settings.ECContentClientAIConfig;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0pUe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1513700pUe {
    public static boolean LIZIZ() {
        C01GW c01gw = C1513710pUf.LIZIZ;
        if (!((ECContentClientAIConfig) c01gw.getValue()).liveShopBagPrerenderedEnable) {
            return false;
        }
        if (C20595415iS.LIZIZ() || C20595415iS.LIZJ()) {
            return ((ECContentClientAIConfig) c01gw.getValue()).liveShopBagPrerenderLowEndEnable;
        }
        return true;
    }

    public static C1511870pRh LIZ(long j) {
        Map<Long, C1511870pRh> map = C1511870pRh.LIZJ;
        Long lValueOf = Long.valueOf(j);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        Object c1511870pRh = linkedHashMap.get(lValueOf);
        if (c1511870pRh == null) {
            c1511870pRh = new C1511870pRh(j);
            linkedHashMap.put(lValueOf, c1511870pRh);
        }
        return (C1511870pRh) c1511870pRh;
    }
}
