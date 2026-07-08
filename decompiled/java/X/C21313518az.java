package X;

import android.text.TextUtils;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.rules.BtmParamsRule;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughAbilityOptConfig;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughEnableCommonParamsConfig;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughKeyNeedMergedSettings;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughStoreUUidConfig;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassthroughParamsBtmExp;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassthroughParamsBtmV2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AwS394S0200000_28;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.18az, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21313518az {
    public static final C21313518az LIZ = new C21313518az();

    public static LinkedHashMap LIZJ(C18C6 c18c6) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C1766940w56 c1766940w56 : c18c6.LIZ) {
            String strLJFF = LJFF(c1766940w56.LIZIZ);
            if (strLJFF != null && strLJFF.length() != 0) {
                Object arrayList = linkedHashMap.get(strLJFF);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(strLJFF, arrayList);
                }
                ((List) arrayList).add(c1766940w56);
            }
        }
        return linkedHashMap;
    }

    public static String LIZLLL(PageFinder pageFinder) {
        BtmSDK btmSDK = BtmSDK.INSTANCE;
        C21244318Bt c21244318Bt = new C21244318Bt();
        c21244318Bt.LIZ = "";
        if (pageFinder != null) {
            c21244318Bt.LIZIZ = pageFinder;
        }
        C18C6 bcmChainByBtmModel = btmSDK.getBcmChainByBtmModel(c21244318Bt, 20, false);
        String strValueOf = String.valueOf(C18GG.LIZJ.getAndIncrement());
        if (LSPassThroughStoreUUidConfig.INSTANCE.shouldStoreMap() && C296990BkX.LIZ()) {
            C18GG.LIZIZ.put(strValueOf, bcmChainByBtmModel);
        }
        return strValueOf;
    }

    public static String LJFF(String str) {
        List listLJJLIIIJILLIZJL;
        List listLL;
        if (str != null && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{e3.d}, 0, 6)) != null && (listLL = C13LP.LL(listLJJLIIIJILLIZJL, 2)) != null) {
            return C13LP.LJJLIIIJ(listLL, e3.d, null, null, 0, null, null, 62);
        }
        return null;
    }

    public static Map LJIIIIZZ(C18C6 c18c6) {
        BcmParams bcmParams;
        Object objOpt;
        Object objOpt2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C1766940w56 c1766940w56 : c18c6.LIZ) {
            BcmParams[] bcmParamsArr = new BcmParams[2];
            C1766990w5B c1766990w5B = c1766940w56.LJIIIZ;
            BcmParams bcmParams2 = null;
            if (c1766990w5B != null) {
                bcmParams = c1766990w5B.LIZIZ;
            } else {
                bcmParams = null;
            }
            bcmParamsArr[0] = bcmParams;
            if (c1766990w5B != null) {
                bcmParams2 = c1766990w5B.LIZ;
            }
            bcmParamsArr[1] = bcmParams2;
            for (BcmParams bcmParams3 : C1697810uHb.LJIIJJI(bcmParamsArr)) {
                if (bcmParams3 != null && (objOpt = bcmParams3.opt("local_service_pass_through_params")) != null) {
                    LIZ.getClass();
                    JSONObject jSONObjectLJIJI = LJIJI(objOpt);
                    Iterator<String> itKeys = jSONObjectLJIJI.keys();
                    while (itKeys.hasNext()) {
                        if (TextUtils.equals("order_attribute", itKeys.next()) && (objOpt2 = jSONObjectLJIJI.opt("order_attribute")) != null) {
                            String str = c1766940w56.LIZIZ;
                            if (str == null) {
                                str = "";
                            }
                            linkedHashMap.put(str, objOpt2);
                        }
                    }
                }
            }
        }
        return linkedHashMap;
    }

    public static JSONObject LJIJI(Object obj) {
        try {
            if (obj instanceof JSONObject) {
                return (JSONObject) obj;
            }
            if (obj instanceof String) {
                return new JSONObject((String) obj);
            }
            return new JSONObject();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("parseToJsonObject, error: ");
            sbLIZ.append(e.getMessage());
            C2188811AlT.LIZIZ(sbLIZ);
            C21314018b4.LIZ(C21314018b4.LIZ, EnumC21315318bH.PARSE_JSON_ERROR, e);
            return new JSONObject();
        }
    }

    public static void LJIJJLI(JSONObject jSONObject) {
        try {
            String strOptString = jSONObject.optString("local_service_pass_through_uuid");
            if (strOptString.length() > 0) {
                jSONObject.remove("local_service_pass_through_uuid");
                C18GG.LIZIZ.remove(strOptString);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static C18C6 LJ(String str, JSONObject jSONObject) {
        boolean z;
        try {
            String strOptString = jSONObject.optString("local_service_pass_through_uuid");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("eventName: ");
            sbLIZ.append(str);
            sbLIZ.append(", uuid: ");
            sbLIZ.append(strOptString);
            C2188811AlT.LIZIZ(sbLIZ);
            if (strOptString.length() <= 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                C18C6 c18c6 = C18GG.LIZIZ.get(strOptString);
                if (c18c6 == null) {
                    return BtmSDK.INSTANCE.getBcmChainByBtmModel(new C21244318Bt(), 20, false);
                }
                return c18c6;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return BtmSDK.INSTANCE.getBcmChainByBtmModel(new C21244318Bt(), 20, false);
    }

    public static void LJIIJ(Object obj, JSONObject jSONObject) {
        if (obj == null) {
            return;
        }
        try {
            JSONObject jSONObjectLJIJI = LJIJI(obj);
            Iterator<String> itKeys = jSONObjectLJIJI.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                C2365509Or.LIZJ(jSONObject, next, jSONObjectLJIJI.opt(next));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static boolean LJIIJJI(String str, List list) {
        if (list == null || list.isEmpty()) {
            return true;
        }
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            if (u.LJJIIJZLJL(str, (String) it2.next(), false)) {
                return true;
            }
        }
        return false;
    }

    public static boolean LJIIL(String str, List list) {
        if (list == null || list.isEmpty()) {
            return true;
        }
        if (str == null) {
            return false;
        }
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            if (u.LJJIIJZLJL(str, (String) it2.next(), false)) {
                return true;
            }
        }
        return false;
    }

    public static void LJIIZILJ(List list, JSONObject jSONObject) {
        Map<String, String> mapLJJIJIIJIL = C1ER1.LIZIZ.LJJIJIIJIL(null);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            if (mapLJJIJIIJIL.containsKey(str)) {
                C2365509Or.LIZJ(jSONObject, str, mapLJJIJIIJIL.get(str));
            }
        }
    }

    public static Object LJIJ(Object obj, Object obj2) {
        JSONObject jSONObject;
        try {
            JSONObject jSONObject2 = null;
            if (obj instanceof JSONObject) {
                jSONObject = (JSONObject) obj;
            } else {
                jSONObject = null;
            }
            if (obj2 instanceof JSONObject) {
                jSONObject2 = (JSONObject) obj2;
            }
            if (jSONObject != null && jSONObject2 != null) {
                JSONObject jSONObject3 = new JSONObject();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    C2365509Or.LIZLLL(jSONObject3, next, jSONObject.opt(next));
                }
                Iterator<String> itKeys2 = jSONObject2.keys();
                while (itKeys2.hasNext()) {
                    String next2 = itKeys2.next();
                    C2365509Or.LIZLLL(jSONObject3, next2, jSONObject2.opt(next2));
                }
                return jSONObject3;
            }
            return obj2;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("mergeJson failed: ");
            sbLIZ.append(e.getMessage());
            C2188811AlT.LIZIZ(sbLIZ);
            return obj2;
        }
    }

    public static void LJIJJ(List list, JSONObject jSONObject) {
        try {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (jSONObject.has((String) it2.next())) {
                    it2.remove();
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static Set LJI(List list, JSONObject jSONObject, boolean z) {
        BcmParams bcmParams;
        BcmParams bcmParams2;
        Object objOpt;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            linkedHashSet.add(itKeys.next());
        }
        if (z) {
            return linkedHashSet;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            BcmParams[] bcmParamsArr = new BcmParams[2];
            C1766990w5B c1766990w5B = ((C1766940w56) it2.next()).LJIIIZ;
            if (c1766990w5B != null) {
                bcmParams = c1766990w5B.LIZIZ;
            } else {
                bcmParams = null;
            }
            bcmParamsArr[0] = bcmParams;
            if (c1766990w5B != null) {
                bcmParams2 = c1766990w5B.LIZ;
            } else {
                bcmParams2 = null;
            }
            bcmParamsArr[1] = bcmParams2;
            for (BcmParams bcmParams3 : C1697810uHb.LJIIJJI(bcmParamsArr)) {
                C21313518az c21313518az = LIZ;
                if (bcmParams3 != null) {
                    objOpt = bcmParams3.opt("local_service_pass_through_params");
                } else {
                    objOpt = null;
                }
                c21313518az.getClass();
                Iterator<String> itKeys2 = LJIJI(objOpt).keys();
                while (itKeys2.hasNext()) {
                    String next = itKeys2.next();
                    if (linkedHashSet.contains(next) && !LSPassThroughKeyNeedMergedSettings.INSTANCE.needMerge(next)) {
                        linkedHashSet.remove(next);
                    }
                }
            }
        }
        return linkedHashSet;
    }

    public static Map LJII(C18C6 c18c6, List list, List list2) {
        LinkedHashMap linkedHashMap;
        Pair pair;
        BcmParams bcmParams;
        BcmParams bcmParams2;
        Object objOpt;
        BcmParams bcmParams3;
        BcmParams bcmParams4;
        Object objOpt2;
        if (!LSPassThroughAbilityOptConfig.INSTANCE.enable()) {
            try {
                if (c18c6.LIZ.isEmpty()) {
                    linkedHashMap = new LinkedHashMap();
                } else {
                    linkedHashMap = new LinkedHashMap();
                    Iterator<C1766940w56> it2 = c18c6.LIZ.iterator();
                    while (it2.hasNext()) {
                        BcmParams[] bcmParamsArr = new BcmParams[2];
                        C1766990w5B c1766990w5B = it2.next().LJIIIZ;
                        if (c1766990w5B != null) {
                            bcmParams = c1766990w5B.LIZIZ;
                        } else {
                            bcmParams = null;
                        }
                        bcmParamsArr[0] = bcmParams;
                        if (c1766990w5B == null) {
                            bcmParams2 = null;
                        } else {
                            bcmParams2 = c1766990w5B.LIZ;
                        }
                        bcmParamsArr[1] = bcmParams2;
                        for (BcmParams bcmParams5 : C1697810uHb.LJIIJJI(bcmParamsArr)) {
                            if (bcmParams5 != null && (objOpt = bcmParams5.opt("local_service_pass_through_params")) != null) {
                                LIZ.getClass();
                                JSONObject jSONObjectLJIJI = LJIJI(objOpt);
                                Iterator<String> itKeys = jSONObjectLJIJI.keys();
                                while (itKeys.hasNext()) {
                                    String next = itKeys.next();
                                    if (!linkedHashMap.containsKey(next)) {
                                        linkedHashMap.put(next, jSONObjectLJIJI.opt(next));
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C21314018b4.LIZ(C21314018b4.LIZ, EnumC21315318bH.PT_GET_VALUE_ERROR, e);
                linkedHashMap = new LinkedHashMap();
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                Object obj2 = linkedHashMap.get(obj);
                if (obj2 != null) {
                    pair = new Pair(obj, obj2);
                } else {
                    pair = null;
                }
                if (pair != null) {
                    arrayList.add(pair);
                }
            }
            return C2097608Jq.LJIILLIIL(arrayList);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ArrayList arrayList2 = new ArrayList(list);
        for (C1766940w56 c1766940w56 : c18c6.LIZ) {
            if (arrayList2.isEmpty()) {
                break;
            }
            if (LJIIL(c1766940w56.LIZIZ, list2)) {
                BcmParams[] bcmParamsArr2 = new BcmParams[2];
                C1766990w5B c1766990w5B2 = c1766940w56.LJIIIZ;
                if (c1766990w5B2 != null) {
                    bcmParams3 = c1766990w5B2.LIZIZ;
                } else {
                    bcmParams3 = null;
                }
                bcmParamsArr2[0] = bcmParams3;
                if (c1766990w5B2 != null) {
                    bcmParams4 = c1766990w5B2.LIZ;
                } else {
                    bcmParams4 = null;
                }
                bcmParamsArr2[1] = bcmParams4;
                for (BcmParams bcmParams6 : C1697810uHb.LJIIJJI(bcmParamsArr2)) {
                    if (bcmParams6 != null && bcmParams6.opt("local_service_pass_through_params") != null) {
                        C21313518az c21313518az = LIZ;
                        Object objOpt3 = bcmParams6.opt("local_service_pass_through_params");
                        c21313518az.getClass();
                        JSONObject jSONObjectLJIJI2 = LJIJI(objOpt3);
                        Iterator<String> itKeys2 = jSONObjectLJIJI2.keys();
                        while (itKeys2.hasNext()) {
                            String next2 = itKeys2.next();
                            if (!arrayList2.isEmpty()) {
                                if (arrayList2.contains(next2) && (objOpt2 = jSONObjectLJIJI2.opt(next2)) != null) {
                                    arrayList2.remove(next2);
                                    linkedHashMap2.put(next2, objOpt2);
                                }
                            }
                        }
                    }
                }
            }
        }
        return linkedHashMap2;
    }

    public static void LJIIIZ(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2) {
        Pair pair;
        try {
            Object objOpt = jSONObject.opt(str);
            if (objOpt instanceof JSONObject) {
                pair = new Pair(objOpt, C786410Ut5.J3((JSONObject) objOpt));
            } else {
                String strOptString = jSONObject.optString(str);
                pair = new Pair(new JSONObject(strOptString), strOptString);
            }
            JSONObject jSONObject3 = (JSONObject) pair.getFirst();
            C2365509Or.LIZJ(jSONObject2, str, (String) pair.getSecond());
            Iterator<String> itKeys = jSONObject3.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                C2365509Or.LIZJ(jSONObject2, next, jSONObject3.opt(next));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C21314018b4.LIZ.getClass();
            C21314018b4.LIZJ(str2, "collect_info_error");
        }
    }

    public static void LJIILIIL(String str, C21314318b7 c21314318b7, Map map, JSONObject jSONObject) {
        ArrayList arrayList;
        ArrayList arrayList2;
        BcmParams bcmParams;
        BcmParams bcmParams2;
        Object objOpt;
        List<String> list = c21314318b7.LIZIZ;
        if (list != null) {
            arrayList = new ArrayList(list);
        } else {
            arrayList = new ArrayList();
        }
        List<String> list2 = c21314318b7.LJI;
        if (list2 != null) {
            arrayList2 = new ArrayList(list2);
        } else {
            arrayList2 = new ArrayList();
        }
        List<String> list3 = c21314318b7.LIZ;
        if (list3 == null) {
            return;
        }
        LJIJJ(arrayList, jSONObject);
        if (arrayList.isEmpty() && arrayList2.isEmpty()) {
            return;
        }
        boolean z = false;
        for (String str2 : list3) {
            if (arrayList.isEmpty() && arrayList2.isEmpty()) {
                break;
            }
            List list4 = (List) ((LinkedHashMap) map).get(str2);
            if (list4 != null) {
                Iterator it2 = list4.iterator();
                while (it2.hasNext()) {
                    BcmParams[] bcmParamsArr = new BcmParams[2];
                    C1766990w5B c1766990w5B = ((C1766940w56) it2.next()).LJIIIZ;
                    if (c1766990w5B != null) {
                        bcmParams = c1766990w5B.LIZIZ;
                    } else {
                        bcmParams = null;
                    }
                    bcmParamsArr[0] = bcmParams;
                    if (c1766990w5B != null) {
                        bcmParams2 = c1766990w5B.LIZ;
                    } else {
                        bcmParams2 = null;
                    }
                    bcmParamsArr[1] = bcmParams2;
                    for (BcmParams bcmParams3 : C1697810uHb.LJIIJJI(bcmParamsArr)) {
                        C21313518az c21313518az = LIZ;
                        if (bcmParams3 != null) {
                            objOpt = bcmParams3.opt("local_service_pass_through_params");
                        } else {
                            objOpt = null;
                        }
                        c21313518az.getClass();
                        JSONObject jSONObjectLJIJI = LJIJI(objOpt);
                        C13BX c13bx = new C13BX(new C13BY(C09R4.LIZIZ(jSONObjectLJIJI.keys()), new AwS394S0200000_28(arrayList, (List<String>) arrayList2, (List<String>) 49)));
                        while (c13bx.hasNext()) {
                            String str3 = (String) c13bx.next();
                            if (arrayList.remove(str3)) {
                                if (Intrinsics.LJFF(str3, "collect_info")) {
                                    LIZ.getClass();
                                    LJIIIZ(str3, str, jSONObjectLJIJI, jSONObject);
                                } else {
                                    C2365509Or.LIZJ(jSONObject, str3, jSONObjectLJIJI.opt(str3));
                                }
                                z = true;
                            }
                            if (arrayList2.remove(str3)) {
                                C21313518az c21313518az2 = LIZ;
                                Object objOpt2 = jSONObjectLJIJI.opt(str3);
                                c21313518az2.getClass();
                                LJIIJ(objOpt2, jSONObject);
                                z = true;
                            }
                        }
                    }
                }
            }
        }
        if (!z && Intrinsics.LJFF(str, "enter_poi_detail")) {
            C21314018b4.LIZ.getClass();
            C21314018b4.LIZJ(str, "bcm_passthrough_params_empty");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIILJJIL(java.lang.String r17, X.C21314318b7 r18, org.json.JSONObject r19, X.C18C6 r20) {
        /*
            Method dump skipped, instruction units count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21313518az.LJIILJJIL(java.lang.String, X.18b7, org.json.JSONObject, X.18C6):void");
    }

    public static void LJIILL(String str, BtmParamsRule btmParamsRule, List list, JSONObject jSONObject) {
        BcmParams bcmParams;
        BcmParams bcmParams2;
        Object objOpt;
        ArrayList<String> arrayList = new ArrayList(btmParamsRule.params);
        ArrayList arrayList2 = new ArrayList(btmParamsRule.unzipParams);
        if (arrayList.isEmpty() && arrayList2.isEmpty()) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = list.iterator();
        boolean z = false;
        while (it2.hasNext()) {
            BcmParams[] bcmParamsArr = new BcmParams[2];
            C1766990w5B c1766990w5B = ((C1766940w56) it2.next()).LJIIIZ;
            if (c1766990w5B != null) {
                bcmParams = c1766990w5B.LIZIZ;
            } else {
                bcmParams = null;
            }
            bcmParamsArr[0] = bcmParams;
            if (c1766990w5B != null) {
                bcmParams2 = c1766990w5B.LIZ;
            } else {
                bcmParams2 = null;
            }
            bcmParamsArr[1] = bcmParams2;
            for (BcmParams bcmParams3 : C1697810uHb.LJIIJJI(bcmParamsArr)) {
                C21313518az c21313518az = LIZ;
                if (bcmParams3 != null) {
                    objOpt = bcmParams3.opt("local_service_pass_through_params");
                } else {
                    objOpt = null;
                }
                c21313518az.getClass();
                JSONObject jSONObjectLJIJI = LJIJI(objOpt);
                Iterator<String> itKeys = jSONObjectLJIJI.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (!linkedHashMap.containsKey(next)) {
                        linkedHashMap.put(next, jSONObjectLJIJI.opt(next));
                    }
                    z = true;
                }
            }
        }
        for (String str2 : arrayList) {
            if (linkedHashMap.containsKey(str2)) {
                C2365509Or.LIZJ(jSONObject, str2, linkedHashMap.get(str2));
            }
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            Object obj = linkedHashMap.get(it3.next());
            if (obj != null) {
                LIZ.getClass();
                LJIIJ(obj, jSONObject);
            }
        }
        if (!z && Intrinsics.LJFF(str, "enter_poi_detail")) {
            C21314018b4.LIZ.getClass();
            C21314018b4.LIZJ(str, "bcm_passthrough_params_empty");
        }
    }

    public static void LJIILLIIL(String str, BtmParamsRule btmParamsRule, C18C6 c18c6, JSONObject jSONObject) {
        BcmParams bcmParams;
        BcmParams bcmParams2;
        Object objOpt;
        ArrayList arrayList = new ArrayList(btmParamsRule.params);
        ArrayList arrayList2 = new ArrayList(btmParamsRule.unzipParams);
        List<String> list = btmParamsRule.dataBtmList;
        if (LSPassThroughEnableCommonParamsConfig.INSTANCE.enable()) {
            LJIJJ(arrayList, jSONObject);
        }
        if (arrayList.isEmpty() && arrayList2.isEmpty()) {
            return;
        }
        boolean z = false;
        for (C1766940w56 c1766940w56 : c18c6.LIZ) {
            if (arrayList.isEmpty() && arrayList2.isEmpty()) {
                break;
            }
            if (LJIIL(c1766940w56.LIZIZ, list)) {
                BcmParams[] bcmParamsArr = new BcmParams[2];
                C1766990w5B c1766990w5B = c1766940w56.LJIIIZ;
                if (c1766990w5B != null) {
                    bcmParams = c1766990w5B.LIZIZ;
                } else {
                    bcmParams = null;
                }
                bcmParamsArr[0] = bcmParams;
                if (c1766990w5B != null) {
                    bcmParams2 = c1766990w5B.LIZ;
                } else {
                    bcmParams2 = null;
                }
                bcmParamsArr[1] = bcmParams2;
                for (BcmParams bcmParams3 : C1697810uHb.LJIIJJI(bcmParamsArr)) {
                    C21313518az c21313518az = LIZ;
                    if (bcmParams3 != null) {
                        objOpt = bcmParams3.opt("local_service_pass_through_params");
                    } else {
                        objOpt = null;
                    }
                    c21313518az.getClass();
                    JSONObject jSONObjectLJIJI = LJIJI(objOpt);
                    Iterator<String> itKeys = jSONObjectLJIJI.keys();
                    while (true) {
                        if (itKeys.hasNext()) {
                            String next = itKeys.next();
                            if (arrayList.isEmpty() && arrayList2.isEmpty()) {
                                z = true;
                                break;
                            }
                            if (arrayList.contains(next)) {
                                C2365509Or.LIZJ(jSONObject, next, jSONObjectLJIJI.opt(next));
                                arrayList.remove(next);
                            }
                            if (arrayList2.contains(next)) {
                                C21313518az c21313518az2 = LIZ;
                                Object objOpt2 = jSONObjectLJIJI.opt(next);
                                c21313518az2.getClass();
                                LJIIJ(objOpt2, jSONObject);
                                arrayList2.remove(next);
                            }
                            z = true;
                        }
                    }
                }
            }
        }
        if (!z && Intrinsics.LJFF(str, "enter_poi_detail")) {
            C21314018b4.LIZ.getClass();
            C21314018b4.LIZJ(str, "bcm_passthrough_params_empty");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIL(java.lang.String r3, boolean r4, boolean r5, boolean r6) {
        /*
            java.lang.String r2 = "enter_poi_detail"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r2)
            if (r0 != 0) goto L9
            return
        L9:
            if (r4 != 0) goto L18
            if (r6 == 0) goto L1f
            java.lang.String r1 = "event_search_rule_is_empty"
        Lf:
            X.18b4 r0 = X.C21314018b4.LIZ
            r0.getClass()
            X.C21314018b4.LIZJ(r2, r1)
            return
        L18:
            if (r5 != 0) goto L22
            if (r6 == 0) goto L1f
            java.lang.String r1 = "event_general_rule_is_empty"
            goto Lf
        L1f:
            java.lang.String r1 = "biz_common_search_rule_is_empty"
            goto Lf
        L22:
            java.lang.String r1 = ""
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21313518az.LJIL(java.lang.String, boolean, boolean, boolean):void");
    }

    public static String LIZ(C21313518az c21313518az, PageFinder pageFinder, Map map, Map map2, String str, int i) {
        Map map3 = map2;
        Map map4 = map;
        if ((i & 2) != 0) {
            map4 = null;
        }
        if ((i & 4) != 0) {
            map3 = null;
        }
        c21313518az.getClass();
        return LIZIZ(c21313518az, pageFinder, null, null, map4, map3, 6);
    }

    public static void LJJ(String str, String str2, JSONObject jSONObject, C2344009Gk c2344009Gk, Map map, Map map2) {
        CharSequence charSequence;
        String strLJIIIZ;
        if (str2 == null) {
            return;
        }
        if (jSONObject != null) {
            C2365509Or.LIZJ(jSONObject, str, str2);
            return;
        }
        if (c2344009Gk != null && ((strLJIIIZ = c2344009Gk.LJIIIZ(str)) == null || strLJIIIZ.length() == 0)) {
            c2344009Gk.LJFF(str, str2);
            return;
        }
        if (map != null && C19719512Dh.LJII(map) && ((charSequence = (CharSequence) map.get(str)) == null || charSequence.length() == 0)) {
            map.put(str, str2);
            return;
        }
        if (map2 == null || !C19719512Dh.LJII(map2)) {
            return;
        }
        CharSequence charSequence2 = (CharSequence) map2.get(str);
        if (charSequence2 != null && charSequence2.length() != 0) {
            return;
        }
        map2.put(str, str2);
    }

    public static String LIZIZ(C21313518az c21313518az, PageFinder pageFinder, JSONObject jSONObject, C2344009Gk c2344009Gk, Map map, Map map2, int i) {
        String strLJIIIZ;
        boolean z;
        String str;
        String str2;
        Boolean boolValueOf;
        boolean z2;
        Map map3 = map2;
        Map map4 = map;
        C2344009Gk c2344009Gk2 = c2344009Gk;
        JSONObject jSONObject2 = jSONObject;
        if ((i & 2) != 0) {
            jSONObject2 = null;
        }
        if ((i & 4) != 0) {
            c2344009Gk2 = null;
        }
        if ((i & 8) != 0) {
            map4 = null;
        }
        if ((i & 16) != 0) {
            map3 = null;
        }
        c21313518az.getClass();
        try {
            if (LSPassThroughEnableCommonParamsConfig.INSTANCE.enable()) {
                if (jSONObject2 != null) {
                    strLJIIIZ = jSONObject2.optString("btm");
                } else if (c2344009Gk2 != null) {
                    strLJIIIZ = c2344009Gk2.LJIIIZ("btm");
                } else if (map4 != null) {
                    strLJIIIZ = (String) map4.get("btm");
                } else if (map3 != null) {
                    strLJIIIZ = (String) map3.get("btm");
                } else {
                    strLJIIIZ = null;
                }
                boolean z3 = true;
                if (strLJIIIZ == null || strLJIIIZ.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    str = strLJIIIZ;
                } else if (pageFinder != null) {
                    C21246818Cs btmPageInfoV2 = BtmSDK.INSTANCE.getBtmPageInfoV2(pageFinder);
                    if (btmPageInfoV2 != null) {
                        str = btmPageInfoV2.LIZIZ;
                    } else {
                        str = null;
                    }
                } else {
                    str = ((C1766940w56) ListProtector.get(BtmSDK.INSTANCE.getBcmChainByBtmModel(new C21244318Bt(), 20, false).LIZ, 0)).LIZIZ;
                }
                if (str != null) {
                    String strLJFF = LJFF(str);
                    LSPassthroughParamsBtmExp lSPassthroughParamsBtmExp = LSPassthroughParamsBtmExp.INSTANCE;
                    if (lSPassthroughParamsBtmExp.hitExperiment()) {
                        C21313818b2.LIZ.getClass();
                        if (C13LP.LJJJJ(strLJFF, C21313818b2.LJFF)) {
                            if (strLJIIIZ == null || strLJIIIZ.length() == 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z2 && C123100dR.LIZ(str)) {
                                LJJ("btm", str, jSONObject2, c2344009Gk2, map4, map3);
                            }
                        }
                    }
                    C21314618bA c21314618bALIZIZ = C21313818b2.LIZ.LIZIZ(strLJFF, EnumC993900byG.BTM);
                    if (c21314618bALIZIZ == null) {
                        if (LSPassthroughParamsBtmV2.INSTANCE.enable()) {
                            return strLJFF;
                        }
                    } else {
                        if (!lSPassthroughParamsBtmExp.hitExperiment()) {
                            if (strLJIIIZ != null && strLJIIIZ.length() != 0) {
                                z3 = false;
                            }
                            if (z3 && C123100dR.LIZ(str)) {
                                List<String> list = c21314618bALIZIZ.LIZ;
                                if (list != null) {
                                    boolValueOf = Boolean.valueOf(list.contains("btm"));
                                } else {
                                    boolValueOf = null;
                                }
                                if (C1189060h32.LJIILJJIL(boolValueOf)) {
                                    LJJ("btm", str, jSONObject2, c2344009Gk2, map4, map3);
                                }
                            }
                        }
                        if (pageFinder != null) {
                            Map mapCreateReportParams$default = BtmSDK.createReportParams$default(BtmSDK.INSTANCE, str, pageFinder, null, 4, null);
                            List<String> list2 = c21314618bALIZIZ.LIZ;
                            if (list2 != null) {
                                for (String str3 : list2) {
                                    C21313518az c21313518az2 = LIZ;
                                    Object obj = mapCreateReportParams$default.get(str3);
                                    if (obj instanceof String) {
                                        str2 = (String) obj;
                                    } else {
                                        str2 = null;
                                    }
                                    c21313518az2.getClass();
                                    LJJ(str3, str2, jSONObject2, c2344009Gk2, map4, map3);
                                }
                            }
                        }
                        if (!LSPassthroughParamsBtmV2.INSTANCE.enable()) {
                            return str;
                        }
                        return strLJFF;
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("appendBTMCommonParamsInternal e:");
            sbLIZ.append(e.getMessage());
            C2188811AlT.LIZIZ(sbLIZ);
        }
        return null;
    }
}
