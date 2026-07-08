package X;

import Y.ARunnableS103S0100000_3;
import Y.ARunnableS27S1200000_23;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ml.feature.flash.FirstFeedPbFeatureConfig;
import com.ss.android.ugc.aweme.ml.feature.flash.FirstFlashFeedPbFeatureConfigs;
import com.ss.android.ugc.aweme.ml.feature.flash.FlashFeedPBMonitor;
import com.ss.android.ugc.aweme.ml.feature.flash.FlashFeedPbFeatureConfig;
import com.ss.android.ugc.aweme.ml.request.meta.FlashFeatureSetConfig;
import com.ss.ugc.clientai.core.api.FeatureServiceManager;
import com.ss.ugc.clientai.core.api.meta.FeatureGroup;
import com.ss.ugc.clientai.core.api.meta.FeatureSetConfig;
import com.ss.ugc.clientai.core.api.meta.FlattenConfig;
import com.tiktok.strategycenterengine.manager.TTMStrategyCenterManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pOR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1509850pOR {
    public static final C1509850pOR LIZ = new C1509850pOR();
    public static final Map<String, List<FeatureGroup>> LIZIZ = new LinkedHashMap();
    public static final Map<Pair<String, String>, List<FeatureGroup>> LIZJ = new LinkedHashMap();
    public static final Map<String, Boolean> LIZLLL = new LinkedHashMap();
    public static final Map<String, List<FlashFeatureSetConfig>> LJ = new LinkedHashMap();
    public static final AtomicBoolean LJFF = new AtomicBoolean(false);
    public static final Map<String, Boolean> LJI = new LinkedHashMap();

    public final synchronized void LIZ() {
        for (FeatureSetConfig featureSetConfig : C1508860pMq.LIZ().values()) {
            System.currentTimeMillis();
            FeatureServiceManager.Companion.getClass();
            C1510050pOl.LIZ().enableBatchProducer(featureSetConfig.features);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void LIZJ() {
        String str;
        System.currentTimeMillis();
        TTMStrategyCenterManager.registerTTMStrategyCenterStateListener(new InterfaceC829930Wh5() { // from class: X.0Wii
            @Override // X.InterfaceC829930Wh5
            public final void LIZ(EnumC829940Wh6 enumC829940Wh6) {
                if (enumC829940Wh6 == EnumC829940Wh6.TTMStateSceneDataUpdateFinish) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("TTMFeatureManager register retry ");
                    Map<String, String> map = C830950Wij.LIZIZ;
                    sbLIZ.append(map);
                    C2188811AlT.LIZIZ(sbLIZ);
                    for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                        final String str2 = (String) entry.getKey();
                        final String str3 = (String) entry.getValue();
                        C830930Wih c830930Wih = C830910Wif.LIZ;
                        TTMStrategyCenterManager.asyncRegisterSceneWithSceneKey(str2, null, C830910Wif.LIZ, new AbstractC830880Wic() { // from class: X.0XEI
                            @Override // X.AbstractC830880Wic
                            public final void LIZ(InterfaceC805220ViK interfaceC805220ViK, InterfaceC830890Wid interfaceC830890Wid) {
                                String str4;
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("feature:");
                                sbLIZ2.append(str3);
                                sbLIZ2.append(" TTMSceneKey:");
                                if (interfaceC830890Wid != null) {
                                    str4 = ((C830870Wib) interfaceC830890Wid).LIZ;
                                } else {
                                    str4 = null;
                                }
                                sbLIZ2.append(str4);
                                sbLIZ2.append(" action result statuscode:");
                                sbLIZ2.append(interfaceC805220ViK.LIZIZ());
                                sbLIZ2.append(" errorMsg:");
                                sbLIZ2.append(interfaceC805220ViK.getErrorMessage());
                                C2188811AlT.LIZIZ(sbLIZ2);
                            }

                            @Override // X.AbstractC830880Wic
                            public final void LIZJ(InterfaceC830890Wid interfaceC830890Wid, EnumC2213771Bkd enumC2213771Bkd) {
                                if (enumC2213771Bkd == EnumC2213771Bkd.TTMStateCodeSuccess) {
                                    C0XEN.LJIIIIZZ.LJI.add(str2);
                                }
                                if (C0XEL.LIZ().open) {
                                    C1510170pOx c1510170pOx = C1510170pOx.LIZ;
                                    float f = C0XEL.LIZ().registerMonitorRate;
                                    c1510170pOx.getClass();
                                    if (C1510170pOx.LIZJ(f)) {
                                        C2344009Gk c2344009Gk = new C2344009Gk();
                                        c2344009Gk.LJFF("feature_name", str3);
                                        c2344009Gk.LIZJ(1, "retry");
                                        c2344009Gk.LJFF("register_scene_state_code", enumC2213771Bkd.toString());
                                        C20684815ws.LJIILLIIL("ttm_feature_register", c2344009Gk.LIZ);
                                    }
                                }
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("feature:");
                                sbLIZ2.append(str3);
                                sbLIZ2.append(" registerSceneResult TTMScene:");
                                sbLIZ2.append(interfaceC830890Wid);
                                sbLIZ2.append(" stateCode:");
                                sbLIZ2.append(enumC2213771Bkd);
                                C2188811AlT.LIZIZ(sbLIZ2);
                            }
                        });
                    }
                    ((LinkedHashMap) C830950Wij.LIZIZ).clear();
                }
            }
        });
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            List<com.ss.android.ugc.aweme.ml.feature.flash.FlashFeatureSetConfig> list = (List) C2190811Aoh.LIZIZ.getValue();
            if (list != null) {
                for (com.ss.android.ugc.aweme.ml.feature.flash.FlashFeatureSetConfig flashFeatureSetConfig : list) {
                    String str2 = flashFeatureSetConfig.sequenceName;
                    if (str2 != null) {
                        List<FeatureGroup> list2 = flashFeatureSetConfig.tt_features;
                        List<FeatureGroup> list3 = list2;
                        if (list2 == null) {
                            list3 = C13BV.INSTANCE;
                        }
                        ArrayList arrayList = (ArrayList) linkedHashMap.get(str2);
                        if (arrayList != null) {
                            arrayList.addAll(list3);
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.addAll(list3);
                            linkedHashMap.put(str2, arrayList2);
                        }
                    }
                }
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                Map<String, List<FeatureGroup>> map = LIZIZ;
                map.put((String) entry.getKey(), C849220XTc.LIZ((List) entry.getValue()));
                System.currentTimeMillis();
                List<FeatureGroup> list4 = (List) ((LinkedHashMap) map).get(entry.getKey());
                if (list4 != null) {
                    FeatureServiceManager.Companion.getClass();
                    C1510050pOl.LIZ().enableBatchProducer(list4);
                }
            }
            LIZ();
            C0XEN c0xen = C0XEN.LJIIIIZZ;
            if (c0xen.LIZLLL()) {
                c0xen.LIZ.LIZLLL(c0xen.LIZJ);
                ((LinkedHashMap) c0xen.LIZIZ).clear();
                ((LinkedHashMap) c0xen.LIZJ).clear();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1337780kuu.LIZ(th, "mlflash_manager", 2);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        List<FlashFeedPbFeatureConfig> list5 = (List) C2118008Rm.LIZJ.getValue();
        if (list5 != null) {
            for (FlashFeedPbFeatureConfig flashFeedPbFeatureConfig : list5) {
                String str3 = flashFeedPbFeatureConfig.paramsKey;
                if (str3 != null) {
                    LIZLLL.put(str3, Boolean.valueOf(flashFeedPbFeatureConfig.isFlat()));
                }
                Iterator<String> it2 = flashFeedPbFeatureConfig.featureSetList.iterator();
                while (it2.hasNext()) {
                    Collection collection = (Collection) ((LinkedHashMap) LIZIZ).get(it2.next());
                    if (collection != null && (str = flashFeedPbFeatureConfig.paramsKey) != null) {
                        String str4 = flashFeedPbFeatureConfig.pbKey;
                        if (str4 == null) {
                            str4 = "pitaya_info";
                        }
                        ArrayList arrayList3 = (ArrayList) linkedHashMap2.get(new Pair(str, str4));
                        if (arrayList3 != null) {
                            arrayList3.addAll(collection);
                        } else {
                            ArrayList arrayList4 = new ArrayList();
                            arrayList4.addAll(collection);
                            String str5 = flashFeedPbFeatureConfig.pbKey;
                            linkedHashMap2.put(new Pair(str, str5 != null ? str5 : "pitaya_info"), arrayList4);
                        }
                    }
                }
            }
        }
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            LIZJ.put((Pair<String, String>) entry2.getKey(), C849220XTc.LIZ((List) entry2.getValue()));
        }
        C1509900pOW.LIZJ = true;
        C1511690pRP.LIZJ(6000L, new Runnable() { // from class: X.0pOX
            public static void LIZ() {
                for (C1509920pOY c1509920pOY : C1509900pOW.LIZIZ) {
                    int i = c1509920pOY.LIZJ;
                    if (i == 0) {
                        C20684815ws.LJIJ(c1509920pOY.LIZ, c1509920pOY.LIZIZ);
                    } else if (i == 1) {
                        TTMStrategyCenterManager.asyncEmitEventToGlobalStrategyEventStream(c1509920pOY.LIZ, c1509920pOY.LIZIZ, (ExecutorService) null);
                    }
                }
                C1509900pOW.LIZIZ.clear();
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("AppLogFeatureProducerHandler@144b.flushCompensationEvent$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("AppLogFeatureProducerHandler@144b.flushCompensationEvent$1");
            }
        });
    }

    public final synchronized void LJFF(boolean z) {
        ScheduledExecutorService scheduledExecutorServiceLIZIZ;
        if (!z) {
            if (LJFF.compareAndSet(false, true)) {
            }
        }
        Map<? extends String, ? extends List<FlashFeatureSetConfig>> mapLIZIZ = C1508860pMq.LIZIZ();
        Set setKeySet = ((HashMap) mapLIZIZ).keySet();
        C1510170pOx c1510170pOx = C1510170pOx.LIZ;
        float f = ((FlashFeedPBMonitor) C1509880pOU.LIZIZ.getValue()).sampleRate / ((FlashFeedPBMonitor) r2.getValue()).nextTrigger;
        c1510170pOx.getClass();
        if (C1510170pOx.LIZJ(f) && (scheduledExecutorServiceLIZIZ = C1510720pPq.LIZIZ()) != null) {
            scheduledExecutorServiceLIZIZ.execute(new ARunnableS103S0100000_3(setKeySet, 67));
        }
        Map<String, List<FlashFeatureSetConfig>> map = LJ;
        map.putAll(mapLIZIZ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tryInitFlashFeedFeatureSet ");
        sbLIZ.append(z);
        sbLIZ.append(" : ");
        sbLIZ.append(map);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LJ(String str, JSONObject jSONObject) {
        Map<String, FirstFeedPbFeatureConfig> map;
        String str2;
        if (!LJI.containsKey(str) && (map = ((FirstFlashFeedPbFeatureConfigs) C1509860pOS.LIZIZ.getValue()).configMap) != null) {
            for (Map.Entry<String, FirstFeedPbFeatureConfig> entry : map.entrySet()) {
                if (Intrinsics.LJFF(entry.getValue().pbKey, str) || (Intrinsics.LJFF(str, "pitaya_info") && ((str2 = entry.getValue().pbKey) == null || str2.length() == 0))) {
                    ARunnableS27S1200000_23 aRunnableS27S1200000_23 = new ARunnableS27S1200000_23(str, entry, jSONObject, 12);
                    if (jSONObject.has(entry.getKey())) {
                        Object objOpt = jSONObject.opt(entry.getKey());
                        if (objOpt != null && (objOpt instanceof JSONObject)) {
                            ((JSONObject) objOpt).length();
                        }
                        aRunnableS27S1200000_23.run();
                    } else {
                        aRunnableS27S1200000_23.run();
                    }
                }
            }
        }
    }

    public static JSONObject LIZIZ(String str, JSONObject jSONObject, String str2, boolean z) {
        List list = (List) ((LinkedHashMap) LIZIZ).get(str);
        if (list != null) {
            if (z) {
                FeatureServiceManager.Companion.getClass();
                return FeatureServiceManager.getBatchFeatures$default(C1510050pOl.LIZ(), list, new FlattenConfig("", "", false, null), jSONObject, str2, false, 16, null);
            }
            FeatureServiceManager.Companion.getClass();
            return FeatureServiceManager.getBatchFeatures$default(C1510050pOl.LIZ(), list, null, jSONObject, str2, false, 18, null);
        }
        return null;
    }

    public static void LIZLLL(String str, String str2, JSONObject jSONObject, long j) throws JSONException {
        Map map;
        C1510170pOx c1510170pOx = C1510170pOx.LIZ;
        float f = ((FlashFeedPBMonitor) C1509880pOU.LIZIZ.getValue()).sampleRate / ((FlashFeedPBMonitor) r2.getValue()).nextTrigger;
        c1510170pOx.getClass();
        if (C1510170pOx.LIZJ(f)) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                arrayList2.add(itKeys.next());
            }
            arrayList.addAll(arrayList2);
            if (!((Boolean) C282650B5z.LIZ.getValue()).booleanValue()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str2);
                sbLIZ.append('_');
                sbLIZ.append(str);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                C2241008qG c2241008qG = new C2241008qG();
                C2241008qG c2241008qG2 = new C2241008qG();
                c2241008qG.LIZLLL(strLIZIZ, arrayList.toString());
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strLIZIZ);
                sbLIZ2.append("_time_cost");
                c2241008qG2.LIZJ(Long.valueOf(j), C2188811AlT.LIZIZ(sbLIZ2));
                C793770VBv.LJII("flash_feed_pb_info", c2241008qG.LJ(), c2241008qG2.LJ(), null);
                return;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("/feed/");
            sbLIZ3.append(str2);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
            JSONObject jSONObject2 = new JSONObject();
            try {
                Map map2 = (Map) C2189311AmH.LIZIZ.getValue();
                if (map2 != null && (map = (Map) map2.get(strLIZIZ2)) != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        if (Intrinsics.LJFF(entry.getKey(), str)) {
                            for (String str3 : (Iterable) entry.getValue()) {
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.put((String) entry.getKey(), C116100cJ.LIZ(str3, jSONObject));
                                jSONObject2 = C116100cJ.LIZJ(jSONObject3, jSONObject2);
                            }
                        }
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("time_cost", j);
            jSONObject4.put("pb_key", str2);
            jSONObject4.put("param_key", str);
            jSONObject4.put("first_level_features", arrayList.toString());
            jSONObject4.put("first_request", !LJI.containsKey(str2));
            jSONObject4.put("filter_sequence", C786410Ut5.J3(jSONObject2));
            jSONObject4.put("length", C786410Ut5.J3(jSONObject).length());
            C20684815ws.LJIJ("flash_feed_pb_info", jSONObject4);
        }
    }
}
