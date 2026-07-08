package X;

import Y.ARunnableS49S0300000_16;
import android.os.Handler;
import com.bytedance.ies.ugc.aweme.rich.model.GMTBaseModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.rich.reward.GmtRewardAdModel;
import com.ss.android.ugc.aweme.rich.reward.experiment.RewardPreloadStrategy;
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
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS0S3101000_16;
import kotlin.jvm.internal.AwS23S2200000_16;
import kotlin.jvm.internal.AwS40S2100000_16;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cz8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1032880cz8 {
    public static final Map<Class<?>, InterfaceC1032120cxu> LIZ = new LinkedHashMap();
    public static final ConcurrentHashMap<String, ArrayList<C1033110czV>> LIZIZ = new ConcurrentHashMap<>();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(497));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(498));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(321));
    public static final C01GW LJFF = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(320));

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
        GMTBaseModel gMTBaseModel;
        Long l;
        if (str == null || str.length() == 0) {
            str = "____local_prefix_default";
        }
        ConcurrentHashMap<String, ArrayList<C1033110czV>> concurrentHashMap = LIZIZ;
        ArrayList<C1033110czV> arrayList = concurrentHashMap.get(str);
        if (arrayList == null) {
            ArrayList<C1033110czV> arrayList2 = new ArrayList<>();
            concurrentHashMap.put(str, arrayList2);
            return new Pair(str, arrayList2);
        }
        if (arrayList.isEmpty()) {
            return new Pair(str, arrayList);
        }
        ArrayList<C1033110czV> arrayList3 = new ArrayList<>();
        for (C1033110czV c1033110czV : arrayList) {
            if (c1033110czV != null) {
                long jCurrentTimeMillis = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                GmtRewardAdModel gmtRewardAdModel = c1033110czV.LIZJ;
                if (gmtRewardAdModel != null && (gMTBaseModel = gmtRewardAdModel.awemeRawAd) != null && (l = gMTBaseModel.preloadAdExpireTimestamp) != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = 0;
                }
                if (jLongValue >= jCurrentTimeMillis) {
                    arrayList3.add(c1033110czV);
                }
            }
        }
        LIZIZ.put(str, arrayList3);
        return new Pair(str, arrayList3);
    }

    public static void LIZLLL(C1032800cz0 c1032800cz0, AbstractC1033330czr abstractC1033330czr) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleRequestADError, error:");
        sbLIZ.append(abstractC1033330czr);
        C2188811AlT.LIZIZ(sbLIZ);
        if (c1032800cz0 != null) {
            c1032800cz0.updateState(new C1032960czG(new C1032980czI(abstractC1033330czr)));
        }
    }

    public static boolean LJ(String str, String str2) {
        long jLongValue;
        String string;
        GMTBaseModel gMTBaseModel;
        Long adId;
        GMTBaseModel gMTBaseModel2;
        Long l;
        ArrayList<C1033110czV> arrayList = (ArrayList) LIZJ(str).getSecond();
        if (arrayList.isEmpty()) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        for (C1033110czV c1033110czV : arrayList) {
            try {
                GmtRewardAdModel gmtRewardAdModel = c1033110czV.LIZJ;
                if (gmtRewardAdModel != null && (gMTBaseModel2 = gmtRewardAdModel.awemeRawAd) != null && (l = gMTBaseModel2.preloadAdExpireTimestamp) != null) {
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
                    GmtRewardAdModel gmtRewardAdModel2 = c1033110czV.LIZJ;
                    if (gmtRewardAdModel2 != null && (gMTBaseModel = gmtRewardAdModel2.awemeRawAd) != null && (adId = gMTBaseModel.getAdId()) != null) {
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

    public static void LIZIZ(int i, InterfaceC1033150czZ interfaceC1033150czZ, String str) {
        HashMap map;
        C01GW c01gw = LJFF;
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
            LIZIZ(i, interfaceC1033150czZ, str);
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append(" preload start,no cache! cacheKey=");
        sbLIZ2.append(str3);
        sbLIZ2.append(",adId=");
        sbLIZ2.append(str2);
        C2188811AlT.LIZIZ(sbLIZ2);
        String str4 = (String) mapLIZ2.get("task_id");
        if (str4 == null) {
            str4 = "";
        }
        C1032900czA.LJII(i, interfaceC1033150czZ, str4);
        LJIIIIZZ(str3, interfaceC1033150czZ, mapLIZ2, new AwS0S3101000_16(str, str3, str2, interfaceC1033150czZ, i, 1));
    }

    public static C1033110czV LJI(InterfaceC1033000czK interfaceC1033000czK, n nVar, String str) throws JSONException {
        Object c098200Yq;
        int iIntValue;
        Object c098200Yq2;
        Object c098200Yq3;
        Object c098200Yq4;
        InterfaceC1032120cxu interfaceC1032120cxu;
        InterfaceC1033150czZ interfaceC1033150czZ;
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
            LJFF(interfaceC1033000czK, false, "networkerror", iIntValue + '-' + str2, str, true);
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
            LJFF(interfaceC1033000czK, false, "networkerror", "empty", str, true);
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
            LJFF(interfaceC1033000czK, false, "networkerror", "empty", str, true);
            return null;
        }
        Object objParsingHostModel = interfaceC1033000czK.parsingHostModel(kVar);
        try {
            Gson gson = interfaceC1033000czK.getGson();
            if (gson != null) {
                c098200Yq4 = (GmtRewardAdModel) gson.LIZJ(kVar, GmtRewardAdModel.class);
            } else {
                c098200Yq4 = null;
            }
            C189200o6.m2constructorimpl(c098200Yq4);
        } catch (Throwable th5) {
            TryCatchGuardChecker.doCheck(th5);
            c098200Yq4 = new C098200Yq(th5);
            C189200o6.m2constructorimpl(c098200Yq4);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq4)) {
            c098200Yq4 = null;
        }
        GmtRewardAdModel gmtRewardAdModel = (GmtRewardAdModel) c098200Yq4;
        if (interfaceC1033000czK instanceof InterfaceC1032120cxu) {
            interfaceC1032120cxu = (InterfaceC1032120cxu) interfaceC1033000czK;
        } else {
            interfaceC1032120cxu = null;
        }
        if (interfaceC1032120cxu != null) {
            interfaceC1032120cxu.trackEvent(new C1031480cws("receive", null, 12), objParsingHostModel);
        } else if ((interfaceC1033000czK instanceof InterfaceC1033150czZ) && (interfaceC1033150czZ = (InterfaceC1033150czZ) interfaceC1033000czK) != null) {
            interfaceC1033150czZ.trackEvent(new C1031480cws("receive", null, 12), objParsingHostModel);
        }
        LJFF(interfaceC1033000czK, true, null, null, str, true);
        C1033110czV c1033110czV = new C1033110czV(0);
        c1033110czV.LIZ = hVar;
        c1033110czV.LIZJ = gmtRewardAdModel;
        c1033110czV.LIZIZ = objParsingHostModel;
        return c1033110czV;
    }

    public static void LJII(String str, C1033110czV c1033110czV, InterfaceC1033000czK interfaceC1033000czK) {
        GMTBaseModel gMTBaseModel;
        GMTBaseModel gMTBaseModel2;
        h hVar = c1033110czV.LIZ;
        Long adId = null;
        if (hVar != null && hVar.size() >= 1) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cacheRewardAd success, data=");
            GmtRewardAdModel gmtRewardAdModel = c1033110czV.LIZJ;
            if (gmtRewardAdModel != null && (gMTBaseModel2 = gmtRewardAdModel.awemeRawAd) != null) {
                adId = gMTBaseModel2.getAdId();
            }
            sbLIZ.append(adId);
            C2188811AlT.LIZIZ(sbLIZ);
            Pair pairLIZJ = LIZJ(str);
            Object first = pairLIZJ.getFirst();
            ArrayList arrayList = (ArrayList) pairLIZJ.getSecond();
            ArrayList<C1033110czV> arrayList2 = new ArrayList<>();
            arrayList2.addAll(arrayList);
            arrayList2.add(c1033110czV);
            LIZIZ.put((String) first, arrayList2);
            interfaceC1033000czK.incentiveAdPreloadData(c1033110czV.LIZIZ);
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("cacheRewardAd aweme error, data=");
        GmtRewardAdModel gmtRewardAdModel2 = c1033110czV.LIZJ;
        if (gmtRewardAdModel2 != null && (gMTBaseModel = gmtRewardAdModel2.awemeRawAd) != null) {
            adId = gMTBaseModel.getAdId();
        }
        sbLIZ2.append(adId);
        C2188811AlT.LIZIZ(sbLIZ2);
    }

    public static void LJIIIZ(C1032800cz0 c1032800cz0, String str, HashMap map) {
        String str2;
        int iIntValue;
        Integer num;
        if (map == null || (str2 = (String) map.get("task_id")) == null) {
            str2 = "";
        }
        Boolean bool = Boolean.TRUE;
        C1032900czA.LJIIIIZZ(c1032800cz0, str2, bool, bool);
        boolean z = false;
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("ad_num", "1"), new Pair("is_pre_req", "true"));
        Integer num2 = c1032800cz0.getAdConfig().LIZ;
        if (num2 != null) {
            mapLJIIJ.put("video_seconds", String.valueOf(num2.intValue()));
        }
        if (map == null || map.isEmpty()) {
            z = true;
        }
        if ((!z) && map != null) {
            mapLJIIJ.putAll(map);
        }
        AwS40S2100000_16 awS40S2100000_16 = new AwS40S2100000_16(c1032800cz0, str2, str, 10);
        RewardPreloadStrategy rewardPreloadStrategy = C1033520d0A.LIZ;
        if (rewardPreloadStrategy != null && (num = rewardPreloadStrategy.preloadDelayTimeAfterShow) != null && num.intValue() >= 0) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 3;
        }
        C786410Ut5.LJLIIL(((long) iIntValue) * 1000, (Handler) LJ.getValue(), new ARunnableS49S0300000_16(c1032800cz0, mapLJIIJ, awS40S2100000_16, 17));
    }

    public static void LJIIIIZZ(String str, InterfaceC1033150czZ interfaceC1033150czZ, HashMap map, Function1 function1) {
        String str2;
        if (map == null || (str2 = (String) map.get("task_id")) == null) {
            str2 = "";
        }
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("ad_num", "1"), new Pair("is_pre_req", "true"));
        if (map != null && !map.isEmpty()) {
            mapLJIIJ.putAll(map);
        }
        interfaceC1033150czZ.request(EnumC1033600d0I.GET, "/tiktok/v1/ad/incentive/", null, mapLJIIJ, new AwS23S2200000_16(function1, (Function1<? super AbstractC1033390czx, Unit>) interfaceC1033150czZ, (InterfaceC1033150czZ) str2, str, (String) 6));
    }

    public static void LJFF(Object obj, boolean z, String str, String str2, String str3, boolean z2) throws JSONException {
        InterfaceC1033150czZ interfaceC1033150czZ;
        InterfaceC1032120cxu interfaceC1032120cxu;
        if ((obj instanceof InterfaceC1032120cxu) && (interfaceC1032120cxu = (InterfaceC1032120cxu) obj) != null) {
            C1032900czA.LJI(interfaceC1032120cxu, z, str, str2, str3, z2, null, null, 192);
            return;
        }
        if ((obj instanceof InterfaceC1033150czZ) && (interfaceC1033150czZ = (InterfaceC1033150czZ) obj) != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("tag", "reward_ad");
            jSONObject.putOpt("task_id", str3);
            jSONObject.putOpt("is_pre_request", Integer.valueOf(z2 ? 1 : 0));
            jSONObject.putOpt("success", Integer.valueOf(z ? 1 : 0));
            jSONObject.putOpt("duration", Long.valueOf(System.currentTimeMillis() - C1032900czA.LIZ));
            jSONObject.putOpt("fail_reason", str);
            jSONObject.putOpt("failed_detail_reason", str2);
            interfaceC1033150czZ.trackUserEvent("reward_load_result", jSONObject);
        }
    }
}
