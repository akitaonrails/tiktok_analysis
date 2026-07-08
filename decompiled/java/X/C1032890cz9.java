package X;

import Y.ARunnableS49S0300000_16;
import android.os.Handler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.RewardAdModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.rich.reward.experiment.RewardPreloadStrategy;
import com.ss.android.ugc.aweme.utils.GsonProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS0S3101000_16;
import kotlin.jvm.internal.AwS23S2200000_16;
import kotlin.jvm.internal.AwS40S2100000_16;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cz9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1032890cz9 {
    public static final C1032890cz9 LIZ = new C1032890cz9();
    public static final Map<Class<?>, InterfaceC1031540cwy> LIZIZ = new LinkedHashMap();
    public static final ConcurrentHashMap<String, ArrayList<C1033050czP>> LIZJ = new ConcurrentHashMap<>();
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(213));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(215));
    public static final C01GW LJFF = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(214));
    public static final C01GW LJI = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(212));

    public static HashMap LIZ(Object obj) {
        Map map;
        String string;
        boolean z;
        String string2;
        HashMap map2 = new HashMap();
        if (obj == null) {
            return map2;
        }
        try {
            if (obj instanceof Map) {
                map = (Map) obj;
            } else {
                map = null;
            }
            if (map == null || map.isEmpty()) {
                return map2;
            }
            Set setKeySet = map.keySet();
            if (setKeySet.isEmpty()) {
                return map2;
            }
            for (Object obj2 : setKeySet) {
                if (obj2 != null) {
                    string = obj2.toString();
                } else {
                    string = null;
                }
                if (string == null || string.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    Object obj3 = map.get(obj2);
                    if (obj3 != null) {
                        string2 = obj3.toString();
                    } else {
                        string2 = null;
                    }
                    if (string2 != null) {
                        map2.put(string, string2);
                    }
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return map2;
    }

    public static Pair LIZJ(String str) {
        long jLongValue;
        AwemeRawAd awemeRawAd;
        Long l;
        if (str == null || str.length() == 0) {
            str = "____local_prefix_default";
        }
        ConcurrentHashMap<String, ArrayList<C1033050czP>> concurrentHashMap = LIZJ;
        ArrayList<C1033050czP> arrayList = concurrentHashMap.get(str);
        if (arrayList == null) {
            ArrayList<C1033050czP> arrayList2 = new ArrayList<>();
            concurrentHashMap.put(str, arrayList2);
            return new Pair(str, arrayList2);
        }
        if (arrayList.isEmpty()) {
            return new Pair(str, arrayList);
        }
        ArrayList<C1033050czP> arrayList3 = new ArrayList<>();
        for (C1033050czP c1033050czP : arrayList) {
            if (c1033050czP != null) {
                long jCurrentTimeMillis = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                RewardAdModel rewardAdModel = c1033050czP.LIZJ;
                if (rewardAdModel != null && (awemeRawAd = rewardAdModel.awemeRawAd) != null && (l = awemeRawAd.preloadAdExpireTimestamp) != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = 0;
                }
                if (jLongValue >= jCurrentTimeMillis) {
                    arrayList3.add(c1033050czP);
                }
            }
        }
        LIZJ.put(str, arrayList3);
        return new Pair(str, arrayList3);
    }

    public static Aweme LJII(k kVar) {
        Object c098200Yq;
        try {
            c098200Yq = (Aweme) ((GsonProvider) ServiceManager.get().getService(GsonProvider.class)).getGson().LIZJ(kVar, Aweme.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return (Aweme) c098200Yq;
    }

    public static void LIZLLL(C1032810cz1 c1032810cz1, AbstractC1033200cze abstractC1033200cze) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleRequestADError, error:");
        sbLIZ.append(abstractC1033200cze);
        C2188811AlT.LIZIZ(sbLIZ);
        C625790Ogb.LIZ();
        if (c1032810cz1 != null) {
            c1032810cz1.updateState(new C1032950czF(new C1032970czH(abstractC1033200cze)));
        }
    }

    public static boolean LJ(String str, String str2) {
        long jLongValue;
        String string;
        AwemeRawAd awemeRawAd;
        Long adId;
        AwemeRawAd awemeRawAd2;
        Long l;
        ArrayList<C1033050czP> arrayList = (ArrayList) LIZJ(str).getSecond();
        if (arrayList.isEmpty()) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        for (C1033050czP c1033050czP : arrayList) {
            try {
                RewardAdModel rewardAdModel = c1033050czP.LIZJ;
                if (rewardAdModel != null && (awemeRawAd2 = rewardAdModel.awemeRawAd) != null && (l = awemeRawAd2.preloadAdExpireTimestamp) != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = jCurrentTimeMillis;
                }
                if (jCurrentTimeMillis - jLongValue >= 0) {
                    continue;
                } else {
                    if (str2 == null || str2.length() == 0) {
                        return true;
                    }
                    RewardAdModel rewardAdModel2 = c1033050czP.LIZJ;
                    if (rewardAdModel2 != null && (awemeRawAd = rewardAdModel2.awemeRawAd) != null && (adId = awemeRawAd.getAdId()) != null) {
                        string = adId.toString();
                    } else {
                        string = null;
                    }
                    if (Intrinsics.LJFF(str2, string)) {
                        return true;
                    }
                }
            } catch (UnsupportedOperationException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return false;
    }

    public static void LJIIIIZZ(String str, C1033050czP c1033050czP) {
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        h hVar = c1033050czP.LIZ;
        Long adId = null;
        if (hVar != null && hVar.size() >= 1) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cacheRewardAd success, data=");
            RewardAdModel rewardAdModel = c1033050czP.LIZJ;
            if (rewardAdModel != null && (awemeRawAd2 = rewardAdModel.awemeRawAd) != null) {
                adId = awemeRawAd2.getAdId();
            }
            sbLIZ.append(adId);
            C2188811AlT.LIZIZ(sbLIZ);
            C625790Ogb.LIZ();
            Pair pairLIZJ = LIZJ(str);
            Object first = pairLIZJ.getFirst();
            ArrayList arrayList = (ArrayList) pairLIZJ.getSecond();
            ArrayList<C1033050czP> arrayList2 = new ArrayList<>();
            arrayList2.addAll(arrayList);
            arrayList2.add(c1033050czP);
            LIZJ.put((String) first, arrayList2);
            C989160bqc.LIZ(c1033050czP.LIZIZ);
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("cacheRewardAd aweme error, data=");
        RewardAdModel rewardAdModel2 = c1033050czP.LIZJ;
        if (rewardAdModel2 != null && (awemeRawAd = rewardAdModel2.awemeRawAd) != null) {
            adId = awemeRawAd.getAdId();
        }
        sbLIZ2.append(adId);
        C2188811AlT.LIZIZ(sbLIZ2);
        C625790Ogb.LIZ();
    }

    public static void LIZIZ(int i, InterfaceC1033130czX interfaceC1033130czX, String str) {
        HashMap map;
        C01GW c01gw = LJI;
        if (((ConcurrentLinkedQueue) c01gw.getValue()).isEmpty() || (map = (HashMap) ((ConcurrentLinkedQueue) c01gw.getValue()).poll()) == null) {
            return;
        }
        HashMap mapLIZ = LIZ(map.get("common_params"));
        HashMap mapLIZ2 = LIZ(map.get("request_params"));
        String str2 = (String) mapLIZ.get("ad_id");
        String str3 = (String) mapLIZ.get("cache_key");
        if (LJ(str3, str2)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(" preload start,hit cache! cacheKey=");
            sbLIZ.append(str3);
            sbLIZ.append(",adId=");
            sbLIZ.append(str2);
            C2188811AlT.LIZIZ(sbLIZ);
            C625790Ogb.LIZ();
            LIZIZ(i, interfaceC1033130czX, str);
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append(" preload start,no cache! cacheKey=");
        sbLIZ2.append(str3);
        sbLIZ2.append(",adId=");
        sbLIZ2.append(str2);
        C2188811AlT.LIZIZ(sbLIZ2);
        C625790Ogb.LIZ();
        String str4 = (String) mapLIZ2.get("task_id");
        if (str4 == null) {
            str4 = "";
        }
        C1032910czB.LJ(i, interfaceC1033130czX, str4);
        LJIIIZ(str3, interfaceC1033130czX, mapLIZ2, new AwS0S3101000_16(str, str3, str2, interfaceC1033130czX, i, 0));
    }

    public static C1033050czP LJI(n nVar, InterfaceC1033030czN interfaceC1033030czN, String str) throws JSONException {
        Object c098200Yq;
        int iIntValue;
        Object c098200Yq2;
        Object c098200Yq3;
        Object c098200Yq4;
        InterfaceC1031540cwy interfaceC1031540cwy;
        InterfaceC1033130czX interfaceC1033130czX;
        Object c098200Yq5;
        try {
            c098200Yq = Integer.valueOf(nVar.LJJIIZ("status_code").LJIIJJI());
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        if (iIntValue != 0) {
            try {
                c098200Yq5 = nVar.LJJIIZ("status_msg").LJIL();
                C189200o6.m2constructorimpl(c098200Yq5);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq5 = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq5);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq5)) {
                c098200Yq5 = null;
            }
            String str2 = (String) c098200Yq5;
            if (str2 == null) {
                str2 = "";
            }
            LJFF(interfaceC1033030czN, false, "networkerror", iIntValue + '-' + str2, str, true);
            return null;
        }
        try {
            c098200Yq2 = nVar.LJJIIZ("aweme_list").LJIIL();
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            c098200Yq2 = new C098200Yq(th3);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq2)) {
            c098200Yq2 = null;
        }
        h hVar = (h) c098200Yq2;
        if (hVar == null) {
            LIZ.getClass();
            LJFF(interfaceC1033030czN, false, "networkerror", "empty", str, true);
            return null;
        }
        try {
            c098200Yq3 = hVar.LJJIIJZLJL(0);
            C189200o6.m2constructorimpl(c098200Yq3);
        } catch (Throwable th4) {
            TryCatchGuardChecker.doCheck(th4);
            c098200Yq3 = new C098200Yq(th4);
            C189200o6.m2constructorimpl(c098200Yq3);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq3)) {
            c098200Yq3 = null;
        }
        k kVar = (k) c098200Yq3;
        if (kVar == null) {
            LIZ.getClass();
            LJFF(interfaceC1033030czN, false, "networkerror", "empty", str, true);
            return null;
        }
        Aweme awemeLJII = LJII(kVar);
        try {
            c098200Yq4 = (RewardAdModel) ((GsonProvider) ServiceManager.get().getService(GsonProvider.class)).getGson().LIZJ(kVar, RewardAdModel.class);
            C189200o6.m2constructorimpl(c098200Yq4);
        } catch (Throwable th5) {
            TryCatchGuardChecker.doCheck(th5);
            c098200Yq4 = new C098200Yq(th5);
            C189200o6.m2constructorimpl(c098200Yq4);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq4)) {
            c098200Yq4 = null;
        }
        RewardAdModel rewardAdModel = (RewardAdModel) c098200Yq4;
        if (interfaceC1033030czN instanceof InterfaceC1031540cwy) {
            interfaceC1031540cwy = (InterfaceC1031540cwy) interfaceC1033030czN;
        } else {
            interfaceC1031540cwy = null;
        }
        if (interfaceC1031540cwy != null) {
            interfaceC1031540cwy.trackEvent(new C1031310cwb("receive", null, 12), awemeLJII);
        } else if ((interfaceC1033030czN instanceof InterfaceC1033130czX) && (interfaceC1033130czX = (InterfaceC1033130czX) interfaceC1033030czN) != null) {
            interfaceC1033130czX.trackEvent(new C1031310cwb("receive", null, 12), awemeLJII);
        }
        LJFF(interfaceC1033030czN, true, null, null, str, true);
        C1033050czP c1033050czP = new C1033050czP(0);
        c1033050czP.LIZ = hVar;
        c1033050czP.LIZJ = rewardAdModel;
        c1033050czP.LIZIZ = awemeLJII;
        return c1033050czP;
    }

    public static void LJIIIZ(String str, InterfaceC1033130czX interfaceC1033130czX, HashMap map, Function1 function1) {
        String str2;
        if (map == null || (str2 = (String) map.get("task_id")) == null) {
            str2 = "";
        }
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("ad_num", "1"), new Pair("is_pre_req", "true"));
        if (map != null && !map.isEmpty()) {
            mapLJIIJ.putAll(map);
        }
        interfaceC1033130czX.request(EnumC1033610d0J.GET, "/tiktok/v1/ad/incentive/", null, mapLJIIJ, new AwS23S2200000_16(function1, (Function1<? super AbstractC1033380czw, Unit>) interfaceC1033130czX, (InterfaceC1033130czX) str2, str, (String) 4));
    }

    public static void LJIIJ(C1032810cz1 c1032810cz1, String str, InterfaceC1033030czN interfaceC1033030czN, HashMap map) {
        String str2;
        int iIntValue;
        Integer num;
        if (map == null || (str2 = (String) map.get("task_id")) == null) {
            str2 = "";
        }
        Boolean bool = Boolean.TRUE;
        C1032910czB.LJFF(c1032810cz1, str2, bool, bool);
        boolean z = false;
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("ad_num", "1"), new Pair("is_pre_req", "true"));
        Integer num2 = c1032810cz1.getAdConfig().LIZ;
        if (num2 != null) {
            mapLJIIJ.put("video_seconds", String.valueOf(num2.intValue()));
        }
        if (map == null || map.isEmpty()) {
            z = true;
        }
        if ((!z) && map != null) {
            mapLJIIJ.putAll(map);
        }
        AwS40S2100000_16 awS40S2100000_16 = new AwS40S2100000_16(c1032810cz1, str2, str, 4);
        RewardPreloadStrategy rewardPreloadStrategyLIZ = C1033060czQ.LIZ();
        if (rewardPreloadStrategyLIZ != null && (num = rewardPreloadStrategyLIZ.preloadDelayTimeAfterShow) != null && num.intValue() >= 0) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 3;
        }
        C786410Ut5.LJLIIL(((long) iIntValue) * 1000, (Handler) LJFF.getValue(), new ARunnableS49S0300000_16(interfaceC1033030czN, mapLJIIJ, awS40S2100000_16, 5));
    }

    public static void LJFF(InterfaceC1033030czN interfaceC1033030czN, boolean z, String str, String str2, String str3, boolean z2) throws JSONException {
        InterfaceC1033130czX interfaceC1033130czX;
        InterfaceC1031540cwy interfaceC1031540cwy;
        if ((interfaceC1033030czN instanceof InterfaceC1031540cwy) && (interfaceC1031540cwy = (InterfaceC1031540cwy) interfaceC1033030czN) != null) {
            C1032910czB.LIZLLL(interfaceC1031540cwy, z, str, str2, str3, z2);
            return;
        }
        if ((interfaceC1033030czN instanceof InterfaceC1033130czX) && (interfaceC1033130czX = (InterfaceC1033130czX) interfaceC1033030czN) != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("tag", "reward_ad");
            jSONObject.putOpt("task_id", str3);
            jSONObject.putOpt("is_pre_request", Integer.valueOf(z2 ? 1 : 0));
            jSONObject.putOpt("success", Integer.valueOf(z ? 1 : 0));
            jSONObject.putOpt("duration", Long.valueOf(System.currentTimeMillis() - C1032910czB.LIZ));
            jSONObject.putOpt("fail_reason", str);
            jSONObject.putOpt("failed_detail_reason", str2);
            interfaceC1033130czX.trackUserEvent("reward_load_result", jSONObject);
        }
    }
}
