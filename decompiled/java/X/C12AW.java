package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.recommendationcard.EffectRecommendationCardConfig;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.12AW, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12AW {
    public static Map LIZ() {
        Keva kevaLIZIZ = LIZIZ();
        Map map = null;
        try {
            map = (Map) GsonProtectorUtils.fromJson(C19598511m3.LIZ(), kevaLIZIZ != null ? kevaLIZIZ.getString("effectCardInteractionMap", "") : null, new TypeToken<Map<String, Boolean>>() { // from class: X.12AX
            }.getType());
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
            C201955140j.LJIIJ(C20012313Rx.LIZIZ, "getCardInteractionMap JsonSyntaxException", e);
        }
        return map == null ? new LinkedHashMap() : map;
    }

    public static Keva LIZIZ() {
        IAccountService iAccountService;
        AccountUserService accountUserServiceLJIIJ;
        ServiceManager serviceManager = ServiceManager.get();
        if (serviceManager == null || (iAccountService = (IAccountService) serviceManager.getService(IAccountService.class)) == null || (accountUserServiceLJIIJ = iAccountService.LJIIJ()) == null) {
            return null;
        }
        if (accountUserServiceLJIIJ.isLogin()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("effect_recommendation_card_");
            sbLIZ.append(accountUserServiceLJIIJ.getCurUserId());
            return Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("effect_recommendation_card_");
        sbLIZ2.append(AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getInstallId());
        return Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public static void LIZJ(String str) {
        if (str != null) {
            String strLIZ = C2084808Es.LIZ(str);
            Map mapLIZ = LIZ();
            mapLIZ.put(strLIZ, Boolean.TRUE);
            String json = GsonProtectorUtils.toJson(C19598511m3.LIZ(), mapLIZ);
            Keva kevaLIZIZ = LIZIZ();
            if (kevaLIZIZ != null) {
                kevaLIZIZ.storeString("effectCardInteractionMap", json);
            }
        }
    }

    public static void LIZLLL(String str) {
        Integer numValueOf;
        String[] stringArray;
        Keva kevaLIZIZ = LIZIZ();
        List listLJLI = null;
        if (kevaLIZIZ != null && (stringArray = kevaLIZIZ.getStringArray("effectCardHasShownCardId", new String[0])) != null) {
            listLJLI = C13LQ.LJLI(stringArray);
        }
        Map mapLIZ = LIZ();
        if (str != null) {
            String strLIZ = C2084808Es.LIZ(str);
            if (listLJLI != null && (!listLJLI.contains(strLIZ))) {
                listLJLI.add(strLIZ);
                mapLIZ.put(strLIZ, Boolean.FALSE);
                while (listLJLI.size() > ((EffectRecommendationCardConfig) C19711112Ab.LIZIZ.getValue()).noActionTimes) {
                    mapLIZ.remove(C13LP.LJJJJZI(listLJLI));
                    C19719612Di.LJJIIZ(listLJLI);
                }
                Keva kevaLIZIZ2 = LIZIZ();
                if (kevaLIZIZ2 != null) {
                    kevaLIZIZ2.storeStringArray("effectCardHasShownCardId", (String[]) listLJLI.toArray(new String[0]));
                }
                String json = GsonProtectorUtils.toJson(C19598511m3.LIZ(), mapLIZ);
                Keva kevaLIZIZ3 = LIZIZ();
                if (kevaLIZIZ3 != null) {
                    kevaLIZIZ3.storeString("effectCardInteractionMap", json);
                }
                Keva kevaLIZIZ4 = LIZIZ();
                if (kevaLIZIZ4 != null && (numValueOf = Integer.valueOf(kevaLIZIZ4.getInt("effectCardHasShownCountKey", 0))) != null) {
                    if (numValueOf.intValue() == 0) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        Keva kevaLIZIZ5 = LIZIZ();
                        if (kevaLIZIZ5 != null) {
                            kevaLIZIZ5.storeLong("effectCardLastStartCountingTime", jCurrentTimeMillis);
                        }
                    }
                    int iIntValue = numValueOf.intValue() + 1;
                    Keva kevaLIZIZ6 = LIZIZ();
                    if (kevaLIZIZ6 != null) {
                        kevaLIZIZ6.storeInt("effectCardHasShownCountKey", iIntValue);
                    }
                }
            }
        }
    }
}
