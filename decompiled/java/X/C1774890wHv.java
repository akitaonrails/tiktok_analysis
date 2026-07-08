package X;

import android.view.View;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.track.ECMixMallTrackEvent;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.track.ECMixMallTrackEventGroup;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.track.ECMixMallTrackEventParams;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.track.ECMixMallTrackGroupParams;
import com.ss.android.ugc.aweme.ecommerce.performance.EcMallMemOptConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0wHv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1774890wHv {
    public final C1773590wFp LIZ = new C1773590wFp();
    public final C1774930wHz LIZIZ = new C1774930wHz();
    public final C2252331DDr LIZJ = C09IR.LIZIZ(0, 0, null, 7);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [kotlin.jvm.functions.Function1] */
    public static Map LIZ(InterfaceC1774910wHx interfaceC1774910wHx, ECMixMallTrackEventParams eCMixMallTrackEventParams, ECMixMallTrackGroupParams eCMixMallTrackGroupParams, InterfaceC1773310wFN interfaceC1773310wFN, C1775190wIP c1775190wIP, Map map, C1774840wHq c1774840wHq) {
        C1775180wIO c1775180wIO;
        String str;
        int i;
        CharSequence charSequence;
        Map mapCreateReportParams$default;
        Object obj;
        Map map2;
        Map<String, Object> mapLIZJ;
        C1775180wIO c1775180wIO2;
        Object objLIZIZ;
        Object obj2;
        Map<String, Object> map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(interfaceC1774910wHx.LIZ());
        InterfaceC599750Nfh interfaceC599750NfhLIZ = interfaceC1773310wFN.LIZ();
        for (String str2 : interfaceC1774910wHx.LJI()) {
            Object objLIZLLL = interfaceC599750NfhLIZ.LIZLLL(str2, EnumC599720Nfe.NATIVE, C2097608Jq.LJ());
            if (objLIZLLL != null) {
                linkedHashMap.put(str2, objLIZLLL);
            }
        }
        if (eCMixMallTrackEventParams.withRdParams == 1) {
            for (String str3 : interfaceC1774910wHx.LJFF()) {
                Object objLIZLLL2 = interfaceC599750NfhLIZ.LIZLLL(str3, EnumC599720Nfe.NATIVE, C2097608Jq.LJ());
                if (objLIZLLL2 != null) {
                    linkedHashMap.put(str3, objLIZLLL2);
                }
            }
        }
        if (eCMixMallTrackEventParams.withBizParams == 1) {
            for (String str4 : interfaceC1774910wHx.LIZLLL()) {
                Object objLIZLLL3 = interfaceC599750NfhLIZ.LIZLLL(str4, EnumC599720Nfe.NATIVE, C2097608Jq.LJ());
                if (objLIZLLL3 != null) {
                    linkedHashMap.put(str4, objLIZLLL3);
                }
            }
            if (c1775190wIP != null) {
                linkedHashMap.put("is_use_cache", c1775190wIP.LIZIZ.LIZJ);
            } else {
                linkedHashMap.put("is_use_cache", interfaceC599750NfhLIZ.LIZLLL("is_use_cache", EnumC599720Nfe.NATIVE, C2097608Jq.LJ()));
            }
        }
        if (eCMixMallTrackGroupParams != null && (map3 = eCMixMallTrackGroupParams.staticParams) != null) {
            linkedHashMap.putAll(map3);
        }
        Map<String, String> map4 = eCMixMallTrackEventParams.pageParams;
        if (map4 != null) {
            for (Map.Entry<String, String> entry : map4.entrySet()) {
                String key = entry.getKey();
                Object objLIZLLL4 = interfaceC599750NfhLIZ.LIZLLL(entry.getValue(), EnumC599720Nfe.NATIVE, C2097608Jq.LJ());
                if (objLIZLLL4 != null) {
                    linkedHashMap.put(key, objLIZLLL4);
                }
            }
        }
        Map<String, String> map5 = eCMixMallTrackEventParams.itemDataCommonParams;
        if (map5 != null) {
            for (Map.Entry<String, String> entry2 : map5.entrySet()) {
                String key2 = entry2.getKey();
                String value = entry2.getValue();
                if (map != null && (obj2 = map.get(value)) != null) {
                    linkedHashMap.put(key2, obj2);
                }
            }
        }
        Map<String, String> map6 = eCMixMallTrackEventParams.traceParams;
        if (map6 != null) {
            for (Map.Entry<String, String> entry3 : map6.entrySet()) {
                String key3 = entry3.getKey();
                String value2 = entry3.getValue();
                if (c1775190wIP != null && (c1775180wIO2 = c1775190wIP.LIZIZ) != null && (objLIZIZ = c1775180wIO2.LIZIZ(value2)) != null) {
                    linkedHashMap.put(key3, objLIZIZ);
                }
            }
        }
        Map<String, Object> map7 = eCMixMallTrackEventParams.staticParams;
        if (map7 != null) {
            linkedHashMap.putAll(map7);
        }
        if (c1774840wHq != null && (mapLIZJ = interfaceC1774910wHx.LIZJ(c1774840wHq)) != null) {
            linkedHashMap.putAll(mapLIZJ);
        }
        if (c1775190wIP != null) {
            c1775180wIO = c1775190wIP.LIZIZ;
        } else {
            c1775180wIO = null;
        }
        Object obj3 = linkedHashMap.get("btm");
        if (obj3 instanceof String) {
            str = (String) obj3;
        } else {
            str = null;
        }
        if (str == null || str.length() == 0) {
            str = "c0.d0";
        }
        if (c1775180wIO == null) {
            i = 4;
            charSequence = null;
            mapCreateReportParams$default = BtmSDK.createReportParams$default(BtmSDK.INSTANCE, str, PageFinder.via((View) interfaceC1773310wFN.LIZLLL().LJ), null, 4, null);
        } else {
            int i2 = c1775180wIO.LJIIJJI - 1;
            if (i2 < 0) {
                i2 = 0;
            }
            i = 4;
            charSequence = null;
            mapCreateReportParams$default = BtmSDK.createReportParams$default(BtmSDK.INSTANCE, u.LJJIFFI(str, "{index}", String.valueOf(i2), false), PageFinder.via((View) interfaceC1773310wFN.LIZLLL().LJ), null, 4, null);
        }
        if (mapCreateReportParams$default != null) {
            linkedHashMap.putAll(mapCreateReportParams$default);
        }
        Object obj4 = linkedHashMap.get("traffic_diversion_info");
        if (obj4 instanceof Map) {
            obj = (Map) obj4;
        } else {
            obj = charSequence;
        }
        if (obj != null && (linkedHashMap.get("btm") != null || linkedHashMap.get("bcm") != null)) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.putAll(obj);
            Object obj5 = linkedHashMap.get("btm");
            if ((obj5 instanceof String) && obj5 != null) {
                linkedHashMap2.put("mall_btm", obj5);
            }
            Object obj6 = linkedHashMap.get("bcm");
            if ((obj6 instanceof Map) && (map2 = (Map) obj6) != null) {
                Object[] objArr = new Object[i];
                Object obj7 = map2.get("template_id");
                Object obj8 = "";
                if (obj7 == null) {
                    obj7 = "";
                }
                objArr[0] = obj7;
                Object obj9 = map2.get("task_id");
                if (obj9 == null) {
                    obj9 = "";
                }
                objArr[1] = obj9;
                Object obj10 = map2.get("task_setting_id");
                if (obj10 == null) {
                    obj10 = "";
                }
                objArr[2] = obj10;
                Object obj11 = map2.get("task_frame_id");
                if (obj11 != null) {
                    obj8 = obj11;
                }
                objArr[3] = obj8;
                linkedHashMap2.put("mall_bcm", C13LP.LJJLIIIJ(C1697810uHb.LJIIJJI(objArr), "|", charSequence, charSequence, 0, charSequence, charSequence, 62));
            }
            linkedHashMap.put("traffic_diversion_info", linkedHashMap2);
        }
        for (Object obj12 : C1697810uHb.LJIIJJI("traffic_diversion_info", "bcm")) {
            Object obj13 = linkedHashMap.get(obj12);
            if (obj13 != null && (obj13 instanceof Map)) {
                linkedHashMap.put(obj12, C1741890vQh.LJIIIIZZ(obj13));
            }
        }
        linkedHashMap.putAll(C2190491AoB.LIZ());
        return linkedHashMap;
    }

    public static void LIZIZ(InterfaceC1774910wHx interfaceC1774910wHx, String str, InterfaceC1773310wFN interfaceC1773310wFN, C1775190wIP c1775190wIP, Map map, C1774840wHq c1774840wHq, List list) {
        ECMixMallTrackEventGroup eCMixMallTrackEventGroup;
        List<ECMixMallTrackEvent> list2;
        Object obj;
        boolean z;
        Iterator<ECMixMallTrackEvent> it2;
        List listLLIIII;
        Map<String, ECMixMallTrackEventGroup> mapLIZIZ = interfaceC1774910wHx.LIZIZ(c1775190wIP);
        if (mapLIZIZ == null || (eCMixMallTrackEventGroup = mapLIZIZ.get(str)) == null || (list2 = eCMixMallTrackEventGroup.eventList) == null) {
            return;
        }
        if (map != null) {
            obj = map.get("from");
        } else {
            obj = null;
        }
        if (((EcMallMemOptConfig) C1771710wCn.LIZIZ.getValue()).enableClearReportOnceTrackEvent == 1) {
            z = true;
        } else {
            z = false;
        }
        ArrayList arrayList = new ArrayList();
        if (z) {
            synchronized (list2) {
                try {
                    listLLIIII = C13LP.LLIIII(list2);
                } catch (Throwable th) {
                    throw th;
                }
            }
            it2 = listLLIIII.iterator();
        } else {
            it2 = list2.iterator();
        }
        while (it2.hasNext()) {
            ECMixMallTrackEvent next = it2.next();
            if (next.config.ignoreCache != 1 || !Intrinsics.LJFF(obj, "prefetch_cache")) {
                if (next.config.isReportOnce == 1) {
                    if (!next.LIZ.LIZ) {
                        next.LIZ.LIZ = true;
                    }
                }
                if (list == null || list.isEmpty() || list.contains(next.eventName)) {
                    ECMixMallTrackGroupParams eCMixMallTrackGroupParams = eCMixMallTrackEventGroup.groupParams;
                    ECMixMallTrackEventParams eCMixMallTrackEventParams = next.data;
                    if (eCMixMallTrackEventParams != null) {
                        interfaceC1774910wHx.LJ(interfaceC1773310wFN, next.eventName, LIZ(interfaceC1774910wHx, eCMixMallTrackEventParams, eCMixMallTrackGroupParams, interfaceC1773310wFN, c1775190wIP, map, c1774840wHq), next.data, c1774840wHq);
                    }
                    if (next.config.isReportOnce == 1 && z) {
                        arrayList.add(next);
                    }
                }
            }
        }
        if (z && (!arrayList.isEmpty())) {
            synchronized (list2) {
                try {
                    Iterator<ECMixMallTrackEvent> it3 = list2.iterator();
                    while (it3.hasNext()) {
                        ECMixMallTrackEvent next2 = it3.next();
                        if (!arrayList.isEmpty()) {
                            Iterator it4 = arrayList.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    break;
                                } else if (((ECMixMallTrackEvent) it4.next()) == next2) {
                                    it3.remove();
                                    break;
                                }
                            }
                        }
                    }
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }
    }
}
