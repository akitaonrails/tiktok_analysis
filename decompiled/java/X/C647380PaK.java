package X;

import X.C830490Whz;
import Y.ARunnableS110S0100000_10;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.discover.model.NearByAuth;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0PaK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C647380PaK extends C0PZH {
    public static final C647380PaK LJIIIIZZ = new C647380PaK();
    public static final C01GW LJIIIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(781));

    public static ConcurrentHashMap LJIIIZ() {
        return (ConcurrentHashMap) LJIIIZ.getValue();
    }

    public static int LJI(DynamicPatch dynamicPatch) {
        int iHashCode;
        int iHashCode2 = 0;
        if (dynamicPatch.getRawData() != null) {
            iHashCode = dynamicPatch.getRawData().hashCode();
        } else {
            iHashCode = 0;
        }
        int i = iHashCode * 31;
        if (dynamicPatch.getAwemeListRaw() != null) {
            iHashCode2 = dynamicPatch.getAwemeListRaw().hashCode();
        }
        return i + iHashCode2;
    }

    public static Object LJII(C1537480q70 c1537480q70) {
        String strLJIJI;
        C647430PaP c647430PaP;
        if (c1537480q70 != null) {
            strLJIJI = c1537480q70.LJIJI();
        } else {
            strLJIJI = null;
        }
        Object obj = ((Map) C647440PaQ.LIZIZ.getValue()).get(C649470Pdh.LJ(strLJIJI));
        if (obj == null) {
            if (c1537480q70 == null || (c647430PaP = (C647430PaP) c1537480q70.LJFF(C647430PaP.class)) == null) {
                return null;
            }
            return c647430PaP.LIZ;
        }
        return obj;
    }

    public static boolean LJIIJJI(String str) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "enable_clipped_data");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null && CastIntegerProtector.parseInt(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter) == 1) {
            return true;
        }
        return false;
    }

    public static void LJIIL(SearchMixFeedList searchMixFeedList) {
        DynamicPatch dynamicPatch;
        String str;
        if (!C0BQ3.LIZ()) {
            return;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        List<SearchMixFeed> list = searchMixFeedList.mItems;
        if (list != null) {
            for (SearchMixFeed searchMixFeed : list) {
                if (searchMixFeed != null && (dynamicPatch = searchMixFeed.getDynamicPatch()) != null && (str = dynamicPatch.schema) != null && C647740Pau.LIZ(str)) {
                    C647380PaK c647380PaK = LJIIIIZZ;
                    DynamicPatch dynamicPatch2 = searchMixFeed.getDynamicPatch();
                    c647380PaK.getClass();
                    int iLJI = LJI(dynamicPatch2);
                    linkedHashSet.add(Integer.valueOf(iLJI));
                    if (!LJIIIZ().containsKey(Integer.valueOf(iLJI))) {
                        arrayList.add(searchMixFeed);
                    }
                }
            }
        }
        if (!LJIIIZ().isEmpty()) {
            for (Object obj : LJIIIZ().keySet()) {
                if (!linkedHashSet.contains(obj)) {
                    LJIIIIZZ.getClass();
                    LJIIIZ().remove(obj);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            C823050WQl.LIZIZ().execute(new ARunnableS110S0100000_10(arrayList, 228));
        }
    }

    public static List LJIIIIZZ(C1537480q70 c1537480q70, List list) {
        Object objLJII;
        C647430PaP c647430PaP;
        try {
            if (C649610Pdv.LIZ()) {
                objLJII = LJII(c1537480q70);
            } else if (c1537480q70 != null && (c647430PaP = (C647430PaP) c1537480q70.LJFF(C647430PaP.class)) != null) {
                objLJII = c647430PaP.LIZ;
            } else {
                objLJII = null;
            }
            if (objLJII == null) {
                return list;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                C649470Pdh.LIZ.getClass();
                arrayList.add(C649470Pdh.LJI(obj, objLJII));
            }
            C644690PQl.LJIJ = System.currentTimeMillis() - jCurrentTimeMillis;
            return arrayList;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C644690PQl.LJIJ = -1L;
            return list;
        }
    }

    public static List LJIIJ(C1537480q70 c1537480q70, List list) {
        Object objLJII;
        C647430PaP c647430PaP;
        Map map;
        Object obj;
        List list2;
        Map map2;
        try {
            if (C649610Pdv.LIZ()) {
                objLJII = LJII(c1537480q70);
            } else if (c1537480q70 != null && (c647430PaP = (C647430PaP) c1537480q70.LJFF(C647430PaP.class)) != null) {
                objLJII = c647430PaP.LIZ;
            } else {
                objLJII = null;
            }
            if (objLJII == null) {
                return list;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                ArrayList arrayList2 = new ArrayList();
                if (obj2 instanceof Map) {
                    map = (Map) obj2;
                } else {
                    map = null;
                }
                if (map == null) {
                    obj = null;
                } else {
                    obj = map.get("tab_aweme_list");
                }
                if (obj instanceof List) {
                    list2 = (List) obj;
                } else {
                    list2 = null;
                }
                if (list2 != null) {
                    for (Object obj3 : list2) {
                        C649470Pdh.LIZ.getClass();
                        arrayList2.add(C649470Pdh.LJI(obj3, objLJII));
                    }
                }
                if (obj2 instanceof Map) {
                    map2 = (Map) obj2;
                } else {
                    map2 = null;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(map2);
                linkedHashMap.put("tab_aweme_list", arrayList2);
                arrayList.add(linkedHashMap);
            }
            C644690PQl.LJIJ = System.currentTimeMillis() - jCurrentTimeMillis;
            return arrayList;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C644690PQl.LJIJ = -1L;
            return list;
        }
    }

    public static void LJIILIIL(C1537480q70 c1537480q70, Map map) {
        List list;
        List list2;
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        Object obj = linkedHashMap.get("aweme_list");
        if ((obj instanceof List) && (list2 = (List) obj) != null) {
            LJIIIIZZ.getClass();
            map.put("aweme_list", LJIIIIZZ(c1537480q70, list2));
        }
        Object obj2 = linkedHashMap.get("aweme_multi_tab_list");
        if ((obj2 instanceof List) && (list = (List) obj2) != null) {
            LJIIIIZZ.getClass();
            map.put("aweme_multi_tab_list", LJIIJ(c1537480q70, list));
        }
    }

    public static void LJIILJJIL(C1537480q70 c1537480q70, Map map) {
        C647180Pa0 c647180Pa0;
        List<String> list;
        C0PCY<C0PRC> c0pcyPh1;
        C0PCY<C646370PWx> c0pcyWO2;
        C0PCY<C0PM7> c0pcyAk0;
        C0PCY<C0Q39> c0pcyP70;
        C0PCY<C646670PYb> c0pcyJh0;
        C0PCY<C0PM7> c0pcyPR;
        InterfaceC1618170sD9 interfaceC1618170sD9LIZJ;
        Map<String, Object> mapKeyParams;
        if (c1537480q70 != null && (c647180Pa0 = (C647180Pa0) c1537480q70.LJFF(C647180Pa0.class)) != null && (list = c647180Pa0.LIZ) != null) {
            ISearchContextAbility iSearchContextAbility = (ISearchContextAbility) c1537480q70.LJFF(ISearchContextAbility.class);
            C0PCY[] c0pcyArr = new C0PCY[7];
            C0PCY<C647460PaS> c0pcyGX = null;
            if (iSearchContextAbility != null) {
                c0pcyPh1 = iSearchContextAbility.Ph1();
            } else {
                c0pcyPh1 = null;
            }
            c0pcyArr[0] = c0pcyPh1;
            if (iSearchContextAbility != null) {
                c0pcyWO2 = iSearchContextAbility.wO2();
            } else {
                c0pcyWO2 = null;
            }
            c0pcyArr[1] = c0pcyWO2;
            if (iSearchContextAbility != null) {
                c0pcyAk0 = iSearchContextAbility.ak0();
            } else {
                c0pcyAk0 = null;
            }
            c0pcyArr[2] = c0pcyAk0;
            if (iSearchContextAbility != null) {
                c0pcyP70 = iSearchContextAbility.P70();
            } else {
                c0pcyP70 = null;
            }
            c0pcyArr[3] = c0pcyP70;
            if (iSearchContextAbility != null) {
                c0pcyJh0 = iSearchContextAbility.Jh0();
            } else {
                c0pcyJh0 = null;
            }
            c0pcyArr[4] = c0pcyJh0;
            if (iSearchContextAbility != null) {
                c0pcyPR = iSearchContextAbility.pR();
            } else {
                c0pcyPR = null;
            }
            c0pcyArr[5] = c0pcyPR;
            if (iSearchContextAbility != null) {
                c0pcyGX = iSearchContextAbility.gX();
            }
            c0pcyArr[6] = c0pcyGX;
            for (C0PCY c0pcy : C1697810uHb.LJIIJJI(c0pcyArr)) {
                if (c0pcy != null && (interfaceC1618170sD9LIZJ = c0pcy.LIZJ()) != null && (mapKeyParams = interfaceC1618170sD9LIZJ.keyParams()) != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Map.Entry<String, Object> entry : mapKeyParams.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        String strLIZ = C665110Q6z.LIZ(key);
                        if (list.contains(strLIZ) && value != null) {
                            arrayList.add(new Pair(strLIZ, value));
                        }
                    }
                    Map mapLJIILLIIL = C2097608Jq.LJIILLIIL(arrayList);
                    if (mapLJIILLIIL != null) {
                        map.putAll(mapLJIILLIIL);
                    }
                }
            }
        }
    }

    public static TemplateData LJIILL(DynamicPatch dynamicPatch, Map map) throws JSONException {
        JSONObject jSONObjectLIZIZ;
        String rawData = dynamicPatch.getRawData();
        if (rawData == null) {
            rawData = "";
        }
        TemplateData templateDataLJIIIIZZ = TemplateData.LJIIIIZZ(rawData);
        C687860QyW.LIZ.getClass();
        NearByAuth nearByAuth = dynamicPatch.getNearByAuth();
        if (nearByAuth == null) {
            jSONObjectLIZIZ = null;
        } else {
            jSONObjectLIZIZ = C687860QyW.LIZIZ(nearByAuth);
        }
        JSONObject jSONObject = new JSONObject();
        if (map != null && (r2 = map.entrySet().iterator()) != null) {
            for (Map.Entry entry : map.entrySet()) {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            templateDataLJIIIIZZ.LJIILIIL(next, jSONObject.get(next));
        }
        if (jSONObjectLIZIZ != null) {
            templateDataLJIIIIZZ.LJIILIIL("location", jSONObjectLIZIZ);
        }
        String docId = dynamicPatch.getDocId();
        if (docId != null) {
            templateDataLJIIIIZZ.LJIILIIL("docId", docId);
        }
        String alaSrc = dynamicPatch.getAlaSrc();
        if (alaSrc != null) {
            templateDataLJIIIIZZ.LJIILIIL("alaSrc", alaSrc);
        }
        return templateDataLJIIIIZZ;
    }

    public static TemplateData LIZ(C647830Pb3 c647830Pb3, DynamicPatch dynamicPatch, C830490Whz c830490Whz) {
        String rawData;
        TemplateData templateDataLJIIIIZZ;
        C645760PUo.LIZ.getClass();
        String str = "";
        if (C645760PUo.LIZ().predictUpdateDiffJudgeBIZ) {
            String str2 = dynamicPatch.schema;
            if (str2 == null) {
                str2 = "";
            }
            if (C0PZW.LIZ(str2)) {
                return null;
            }
        }
        DynamicPatch dynamicPatch2 = c647830Pb3.LJIIIIZZ;
        if (dynamicPatch2 != null) {
            rawData = dynamicPatch2.getRawData();
        } else {
            rawData = null;
        }
        if (Intrinsics.LJFF(rawData, dynamicPatch.getRawData())) {
            templateDataLJIIIIZZ = TemplateData.LJIIIIZZ("");
        } else {
            String rawData2 = dynamicPatch.getRawData();
            if (rawData2 != null) {
                str = rawData2;
            }
            templateDataLJIIIIZZ = TemplateData.LJIIIIZZ(str);
        }
        Map<String, ? extends Object> map = c647830Pb3.LJIIJ;
        if (map == null) {
            for (Map.Entry entry : (C830490Whz.a) c830490Whz.entrySet()) {
                templateDataLJIIIIZZ.LJIILIIL((String) entry.getKey(), entry.getValue());
            }
        } else {
            for (Map.Entry entry2 : (C830490Whz.a) c830490Whz.entrySet()) {
                String str3 = (String) entry2.getKey();
                Object value = entry2.getValue();
                if (!Intrinsics.LJFF(map.get(str3), value)) {
                    templateDataLJIIIIZZ.LJIILIIL(str3, value);
                }
            }
            Iterator<Map.Entry<String, ? extends Object>> it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                String key = it2.next().getKey();
                if (!c830490Whz.containsKey(key)) {
                    templateDataLJIIIIZZ.LJIILIIL(key, null);
                }
            }
        }
        return templateDataLJIIIIZZ;
    }

    public static TemplateData LIZIZ(DynamicPatch dynamicPatch, Map map, C1537480q70 c1537480q70) {
        String str = dynamicPatch.schema;
        if (str == null) {
            str = "";
        }
        if (C0PZW.LIZ(str)) {
            return LIZLLL(dynamicPatch, map, c1537480q70);
        }
        return LJIILL(dynamicPatch, map);
    }

    public static TemplateData LIZLLL(DynamicPatch dynamicPatch, Map map, C1537480q70 c1537480q70) {
        TemplateData templateData;
        LinkedHashMap linkedHashMap;
        C647340PaG c647340PaG;
        boolean z;
        String str = dynamicPatch.schema;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String strLJIJI = null;
        if (C647740Pau.LIZ(str)) {
            templateData = (TemplateData) LJIIIZ().remove(Integer.valueOf(LJI(dynamicPatch)));
        } else {
            templateData = null;
        }
        if (map != null) {
            linkedHashMap = new LinkedHashMap(map);
            LJIIIIZZ.getClass();
            LJIILJJIL(c1537480q70, linkedHashMap);
            if (C20039613b0.LIZ(dynamicPatch.schema)) {
                LJIILIIL(c1537480q70, linkedHashMap);
            }
        } else {
            linkedHashMap = null;
        }
        if (templateData != null) {
            c647340PaG = new C647340PaG(templateData);
        } else {
            String rawData = dynamicPatch.getRawData();
            if (rawData != null) {
                str2 = rawData;
            }
            c647340PaG = new C647340PaG(str2);
        }
        if (templateData != null) {
            z = true;
        } else {
            z = false;
        }
        c647340PaG.LIZJ(z, linkedHashMap, false);
        c647340PaG.LIZ(c1537480q70);
        if (C287830BPx.LIZ()) {
            LJFF(dynamicPatch, c647340PaG, c1537480q70);
        } else {
            if (dynamicPatch.getNearByAuth() != null) {
                C687860QyW.LIZ.getClass();
                C687860QyW.LIZ(dynamicPatch, c647340PaG);
            }
            if (dynamicPatch.getEncodedSequence() != null) {
                C647370PaJ.LIZ(dynamicPatch, c647340PaG);
            }
            C647410PaN.LIZ(dynamicPatch, c647340PaG);
            C647400PaM.LIZ(c1537480q70, c647340PaG);
        }
        String str3 = dynamicPatch.schema;
        if (str3 == null) {
            if (c1537480q70 != null) {
                strLJIJI = c1537480q70.LJIJI();
            }
        } else {
            strLJIJI = str3;
        }
        return c647340PaG.LIZIZ(strLJIJI);
    }

    public static void LJFF(DynamicPatch dynamicPatch, C647340PaG c647340PaG, C1537480q70 c1537480q70) {
        if (dynamicPatch.getNearByAuth() != null) {
            C687860QyW.LIZ.getClass();
            C687860QyW.LIZ(dynamicPatch, c647340PaG);
        }
        if (dynamicPatch.getEncodedSequence() != null) {
            C647370PaJ.LIZ(dynamicPatch, c647340PaG);
        }
        C647410PaN.LIZ(dynamicPatch, c647340PaG);
        C647400PaM.LIZ(c1537480q70, c647340PaG);
    }

    public static TemplateData LIZJ(String str, String str2, Map map, C1537480q70 c1537480q70) throws JSONException {
        if (C0PZW.LIZ(str)) {
            return LJ(str, str2, map, c1537480q70);
        }
        TemplateData templateDataLJIIIIZZ = TemplateData.LJIIIIZZ(str2);
        JSONObject jSONObject = new JSONObject();
        Iterator it2 = map.entrySet().iterator();
        if (it2 != null) {
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            templateDataLJIIIIZZ.LJIILIIL(next, jSONObject.get(next));
        }
        return templateDataLJIIIIZZ;
    }

    public static TemplateData LJ(String str, String str2, Map map, C1537480q70 c1537480q70) throws JSONException {
        if (map != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            LJIIIIZZ.getClass();
            LJIILJJIL(c1537480q70, linkedHashMap);
            if (C20039613b0.LIZ(str)) {
                LJIILIIL(c1537480q70, linkedHashMap);
            }
            C647340PaG c647340PaG = new C647340PaG(str2);
            c647340PaG.LIZJ(false, linkedHashMap, false);
            c647340PaG.LIZ(c1537480q70);
            return c647340PaG.LIZIZ(str);
        }
        return new C647340PaG(str2).LIZIZ(str);
    }
}
