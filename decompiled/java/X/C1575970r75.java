package X;

import com.ss.android.ugc.aweme.vibefeed.clientai.IVibeClientAIService;
import com.ss.android.ugc.aweme.vibefeed.experiment.SharedFeedExitStrategyClientAIConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0r75, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1575970r75 {
    public static final /* synthetic */ int LIZ = 0;

    public static C1575990r77 LIZ(Map map, EnumC1576090r7H enumC1576090r7H) {
        Number number;
        int iIntValue;
        int iIntValue2;
        Number number2;
        Number number3;
        Object obj = map.get("expose_impression_limit_total");
        if (obj instanceof Number) {
            number = (Number) obj;
        } else {
            number = null;
        }
        int iIntValue3 = 0;
        if (number != null) {
            iIntValue = number.intValue();
        } else {
            iIntValue = 0;
        }
        Object obj2 = map.get("expose_days_without_click");
        if ((obj2 instanceof Number) && (number3 = (Number) obj2) != null) {
            iIntValue2 = number3.intValue();
        } else {
            iIntValue2 = 0;
        }
        Object obj3 = map.get("auto_re_entrance_days");
        if ((obj3 instanceof Number) && (number2 = (Number) obj3) != null) {
            iIntValue3 = number2.intValue();
        }
        return new C1575990r77(enumC1576090r7H, iIntValue, iIntValue2, iIntValue3);
    }

    public static C1575990r77 LIZJ(String str, boolean z) {
        Object next;
        double dDoubleValue;
        double dDoubleValue2;
        Number number;
        Number number2;
        Number number3;
        C1265704xL.LIZ.getClass();
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        SharedFeedExitStrategyClientAIConfig sharedFeedExitStrategyClientAIConfig = C1265704xL.LIZIZ;
        SharedFeedExitStrategyClientAIConfig sharedFeedExitStrategyClientAIConfig2 = (SharedFeedExitStrategyClientAIConfig) c0c64LJIILLIIL.LJJII(SharedFeedExitStrategyClientAIConfig.class, sharedFeedExitStrategyClientAIConfig, "tt_shared_feed_exit_strategy_client_ai", true);
        if (sharedFeedExitStrategyClientAIConfig2 != null) {
            sharedFeedExitStrategyClientAIConfig = sharedFeedExitStrategyClientAIConfig2;
        }
        if (!sharedFeedExitStrategyClientAIConfig.clientAIEnabled) {
            return null;
        }
        C1576080r7G c1576080r7G = EnumC1576090r7H.Companion;
        Boolean boolValueOf = Boolean.valueOf(z);
        c1576080r7G.getClass();
        EnumC1576090r7H enumC1576090r7HLIZ = C1576080r7G.LIZ(boolValueOf);
        IVibeClientAIService iVibeClientAIService = (IVibeClientAIService) C1557990qe5.LJ.getValue();
        if (iVibeClientAIService == null) {
            return LIZIZ(sharedFeedExitStrategyClientAIConfig.noScoreBucket, enumC1576090r7HLIZ, str);
        }
        C1610940s1U c1610940s1ULIZJ = iVibeClientAIService.LIZJ(str, enumC1576090r7HLIZ);
        if (c1610940s1ULIZJ != null) {
            double d = c1610940s1ULIZJ.LIZJ;
            List<Map<String, Object>> list = sharedFeedExitStrategyClientAIConfig.buckets;
            ArrayList arrayList = new ArrayList();
            for (Map<String, Object> map : list) {
                Object obj = map.get("min_score");
                if ((obj instanceof Number) && (number3 = (Number) obj) != null && d >= number3.doubleValue()) {
                    arrayList.add(map);
                }
            }
            Iterator it2 = arrayList.iterator();
            if (!it2.hasNext()) {
                next = null;
            } else {
                next = it2.next();
                if (it2.hasNext()) {
                    Object obj2 = ((Map) next).get("min_score");
                    if ((obj2 instanceof Number) && (number2 = (Number) obj2) != null) {
                        dDoubleValue = number2.doubleValue();
                    } else {
                        dDoubleValue = Double.NEGATIVE_INFINITY;
                    }
                    do {
                        Object next2 = it2.next();
                        Object obj3 = ((Map) next2).get("min_score");
                        if ((obj3 instanceof Number) && (number = (Number) obj3) != null) {
                            dDoubleValue2 = number.doubleValue();
                        } else {
                            dDoubleValue2 = Double.NEGATIVE_INFINITY;
                        }
                        if (Double.compare(dDoubleValue, dDoubleValue2) < 0) {
                            next = next2;
                            dDoubleValue = dDoubleValue2;
                        }
                    } while (it2.hasNext());
                }
            }
            Map map2 = (Map) next;
            if (map2 == null) {
                return null;
            }
            C1575990r77 c1575990r77LIZ = LIZ(map2, enumC1576090r7HLIZ);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("exitStrategy hit conv=");
            sbLIZ.append(str);
            sbLIZ.append(" intent=");
            sbLIZ.append(enumC1576090r7HLIZ.getTrackingName());
            sbLIZ.append(" score=");
            sbLIZ.append(d);
            sbLIZ.append(" total=");
            sbLIZ.append(c1575990r77LIZ.LIZIZ);
            sbLIZ.append(" days=");
            sbLIZ.append(c1575990r77LIZ.LIZJ);
            sbLIZ.append(" reEntrance=");
            sbLIZ.append(c1575990r77LIZ.LIZLLL);
            C2188811AlT.LIZIZ(sbLIZ);
            return c1575990r77LIZ;
        }
        return LIZIZ(sharedFeedExitStrategyClientAIConfig.noScoreBucket, enumC1576090r7HLIZ, str);
    }

    public static C1575990r77 LIZIZ(Map map, EnumC1576090r7H enumC1576090r7H, String str) {
        if (map.isEmpty()) {
            return null;
        }
        C1575990r77 c1575990r77LIZ = LIZ(map, enumC1576090r7H);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("exitStrategy noScoreBucket conv=");
        sbLIZ.append(str);
        sbLIZ.append(" intent=");
        sbLIZ.append(enumC1576090r7H.getTrackingName());
        sbLIZ.append(" total=");
        sbLIZ.append(c1575990r77LIZ.LIZIZ);
        sbLIZ.append(" days=");
        sbLIZ.append(c1575990r77LIZ.LIZJ);
        sbLIZ.append(" reEntrance=");
        sbLIZ.append(c1575990r77LIZ.LIZLLL);
        C2188811AlT.LIZIZ(sbLIZ);
        return c1575990r77LIZ;
    }
}
