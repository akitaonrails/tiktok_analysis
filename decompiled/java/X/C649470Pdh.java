package X;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.aweme.search.lynx.core.config.AutoConcurrencyConfig;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AwS564S0100000_20;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Pdh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C649470Pdh {
    public static int LIZJ;
    public static final C649470Pdh LIZ = new C649470Pdh();
    public static final ConcurrentHashMap<String, Integer> LIZIZ = new ConcurrentHashMap<>();
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2947));

    public static final boolean LJIJ(int i) {
        return i > 16777216 && i < 33554432;
    }

    public static final boolean LJJII(int i) {
        return i > 50331648 && i < 67108864;
    }

    public static final boolean LJJIFFI() {
        LocalTestApi localTestApi;
        ServiceManager serviceManager = ServiceManager.get();
        if (serviceManager == null || (localTestApi = (LocalTestApi) serviceManager.getService(LocalTestApi.class)) == null) {
            return false;
        }
        return Intrinsics.LJFF(localTestApi.isSearchLynxTemplateBundleCacheDisabled(), Boolean.TRUE);
    }

    public static void LIZ(final C1537480q70 c1537480q70) {
        C1537910q7h c1537910q7h;
        HybridSchemaParam hybridSchemaParam;
        if (Intrinsics.LJFF(((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).getSearchDebugSwitch(), Boolean.TRUE)) {
            InterfaceC1531560pxS interfaceC1531560pxS = c1537480q70.hybridParams;
            if (interfaceC1531560pxS instanceof C1537830q7Z) {
                c1537910q7h = (C1537910q7h) interfaceC1531560pxS;
                if (c1537910q7h == null || (hybridSchemaParam = c1537910q7h.LJJIIJ) == null || (surl = hybridSchemaParam.getSurl()) == null) {
                }
                c1537910q7h.LJIJI.LIZIZ.add(new C1536750q5p() { // from class: X.0Pdu
                    @Override // X.C1536750q5p
                    public final void LJ(C1533790q13 c1533790q13) throws JSONException {
                        JSONArray jSONArray = C1533710q0v.LIZ;
                        C1533710q0v.LJI(surl, c1537480q70.templateResData, c1533790q13, System.currentTimeMillis(), System.currentTimeMillis(), false);
                    }
                });
            }
            c1537910q7h = null;
            final String surl = "";
            if (c1537910q7h == null) {
                return;
            }
            c1537910q7h.LJIJI.LIZIZ.add(new C1536750q5p() { // from class: X.0Pdu
                @Override // X.C1536750q5p
                public final void LJ(C1533790q13 c1533790q13) throws JSONException {
                    JSONArray jSONArray = C1533710q0v.LIZ;
                    C1533710q0v.LJI(surl, c1537480q70.templateResData, c1533790q13, System.currentTimeMillis(), System.currentTimeMillis(), false);
                }
            });
        }
    }

    public static int LIZLLL(String str) {
        int iIntValue;
        ConcurrentHashMap<String, Integer> concurrentHashMap = LIZIZ;
        if (concurrentHashMap.get(str) == null) {
            int i = LIZJ + 1;
            LIZJ = i;
            concurrentHashMap.put(str, Integer.valueOf(i + 50331648));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("spark lite lynx card:");
            sbLIZ.append(LJ(str));
            sbLIZ.append(" type:");
            Integer num = concurrentHashMap.get(str);
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            sbLIZ.append(Integer.toHexString(iIntValue));
            C2188811AlT.LIZIZ(sbLIZ);
        }
        Integer num2 = concurrentHashMap.get(str);
        if (num2 != null) {
            return num2.intValue();
        }
        return 15;
    }

    public static final String LJ(String str) {
        return C647540Paa.LIZ(str);
    }

    public static int LJFF(String str) {
        Object objPutIfAbsent;
        if (str != null) {
            LIZ.getClass();
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LIZLLL.getValue();
            Object atomicInteger = concurrentHashMap.get(str);
            if (atomicInteger == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(str, (atomicInteger = new AtomicInteger()))) != null) {
                atomicInteger = objPutIfAbsent;
            }
            return ((AtomicInteger) atomicInteger).incrementAndGet();
        }
        return 0;
    }

    public static final boolean LJIIJ(String str) {
        if (!TextUtils.isEmpty(str)) {
            C649480Pdi.LIZ.getClass();
            C01GW c01gw = C649480Pdi.LIZJ;
            if (((AutoConcurrencyConfig) c01gw.getValue()).enable) {
                return ((AutoConcurrencyConfig) c01gw.getValue()).whiteListedCards.contains(LJ(str));
            }
            return false;
        }
        return false;
    }

    public static boolean LJIIL(SearchMixFeed searchMixFeed) {
        DynamicPatch dynamicPatch = searchMixFeed.getDynamicPatch();
        if (dynamicPatch != null) {
            return C13LQ.LJIILJJIL(dynamicPatch.getOriginType(), (int[]) C649510Pdl.LIZIZ.getValue());
        }
        return false;
    }

    public static final boolean LJIILIIL(String str) {
        C1252804vG.LIZ.getClass();
        if (((List) C1252804vG.LIZJ.getValue()).contains(str)) {
            return true;
        }
        return false;
    }

    public static final boolean LJIILJJIL(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        C0CCB.LIZ.getClass();
        if (!((List) C0CCB.LIZJ.getValue()).contains(LJ(str))) {
            return false;
        }
        return true;
    }

    public static final boolean LJIILL(String str) {
        if (!TextUtils.isEmpty(str)) {
            C0P5N.LIZ.getClass();
            if (C0P5N.LIZIZ.enable_pre_load) {
                C0CCF.LIZ.getClass();
                if (((List) C0CCF.LIZJ.getValue()).contains(LJ(str))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean LJIILLIIL(Aweme aweme) {
        String searchFeedType;
        HashMap<String, String> searchExtraParams;
        String str = null;
        if (aweme != null) {
            searchFeedType = AwemeBizExtKt.getSearchFeedType(aweme);
        } else {
            searchFeedType = null;
        }
        if (Intrinsics.LJFF(searchFeedType, "SearchFeaturedAnswer")) {
            if (aweme != null && (searchExtraParams = AwemeBizExtKt.getSearchExtraParams(aweme)) != null) {
                str = searchExtraParams.get("token_type");
            }
            if (Intrinsics.LJFF(str, "tt_enhance_card")) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean LJIIZILJ(String str) {
        return a0.LJJIIZI(C647540Paa.LIZ(str), "hotspot", false);
    }

    public static boolean LJIJJLI(DynamicPatch dynamicPatch) {
        if (dynamicPatch != null && dynamicPatch.getOriginType() == 9) {
            return true;
        }
        return false;
    }

    public static boolean LJIL(SearchMixFeed searchMixFeed) {
        DynamicPatch dynamicPatch;
        if (searchMixFeed != null) {
            dynamicPatch = searchMixFeed.getDynamicPatch();
        } else {
            dynamicPatch = null;
        }
        return LJIJJLI(dynamicPatch);
    }

    public static boolean LJJ(String str) {
        return a0.LJJIIZI(C647540Paa.LIZ(str), "products", false);
    }

    public static boolean LJJI(String str) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        boolean zLJJIIZI = false;
        try {
            Uri uri = UriProtector.parse(str);
            if (uri != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "channel")) != null) {
                zLJJIIZI = a0.LJJIIZI(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "fe_tiktok_lynx_search_transfer", false);
                return zLJJIIZI;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return zLJJIIZI;
    }

    public static Boolean LJJIII(String str) {
        if (Intrinsics.LJFF(LJIIIZ(str, "autoplay"), "1")) {
            return Boolean.TRUE;
        }
        return null;
    }

    public static final boolean LJJIIZI(String str) {
        try {
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "air_strict_mode");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                return false;
            }
            if (!Boolean.parseBoolean(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
                if (CastIntegerProtector.parseInt(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter) != 1) {
                    return false;
                }
            }
            return true;
        } catch (NullPointerException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static final void LIZIZ(C1537720q7O c1537720q7O, String str) {
        if (c1537720q7O != null) {
            c1537720q7O.attachEngineToUIThread();
        }
        C649470Pdh c649470Pdh = LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("-attachToUIThread");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c649470Pdh.getClass();
        LJJIIJZLJL(c1537720q7O, strLIZIZ);
    }

    public static final void LIZJ(C1537720q7O c1537720q7O, String str) {
        if (c1537720q7O != null) {
            c1537720q7O.detachEngineFromUIThread();
        }
        C649470Pdh c649470Pdh = LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("-detachFromUIThread");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c649470Pdh.getClass();
        LJJIIJZLJL(c1537720q7O, strLIZIZ);
    }

    public static Object LJI(Object obj, Object obj2) {
        if ((obj instanceof Map) && (obj2 instanceof List)) {
            return LJIIIIZZ((List) obj2, (Map) obj);
        }
        if ((obj instanceof List) && (obj2 instanceof Map)) {
            return LJII((List) obj, (Map) obj2);
        }
        return obj;
    }

    public static List LJII(List list, Map map) {
        C20036313aT c20036313aT;
        List list2;
        Object obj = map.get("indexes");
        if ((obj instanceof List) && (list2 = (List) obj) != null) {
            int[] iArr = C649500Pdk.LIZ;
            c20036313aT = new C20036313aT(6);
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                c20036313aT.LIZIZ(((Number) it2.next()).intValue());
            }
        } else {
            c20036313aT = null;
        }
        Object obj2 = map.get("keys");
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (c20036313aT != null && !c20036313aT.LIZ(i)) {
                arrayList.add(null);
            } else {
                Object obj3 = ListProtector.get(list, i);
                if (obj3 == null) {
                    arrayList.add(null);
                } else if (obj2 == null) {
                    arrayList.add(obj3);
                } else if (obj3 instanceof List) {
                    arrayList.add(LJII((List) obj3, (Map) obj2));
                } else if (obj3 instanceof Map) {
                    arrayList.add(LJIIIIZZ((List) obj2, (Map) obj3));
                } else {
                    arrayList.add(null);
                }
            }
        }
        return arrayList;
    }

    public static Map LJIIIIZZ(List list, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            if (obj instanceof String) {
                if (map.containsKey(obj)) {
                    linkedHashMap.put(obj, map.get(obj));
                }
            } else if (obj instanceof Map) {
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    if (map.containsKey(key)) {
                        Object obj2 = map.get(key);
                        if (obj2 == null) {
                            linkedHashMap.put(key, null);
                        } else if (obj2 instanceof Map) {
                            linkedHashMap.put(key, LJIIIIZZ((List) value, (Map) obj2));
                        } else if (obj2 instanceof List) {
                            linkedHashMap.put(key, LJII((List) obj2, (Map) value));
                        }
                    }
                }
            }
        }
        return linkedHashMap;
    }

    public static final String LJIIIZ(String str, String str2) {
        boolean z;
        if (str != null && !a0.LJJJIL(str)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return "";
        }
        try {
            return String.valueOf(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), str2));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public static boolean LJIJI(Integer num, DynamicPatch dynamicPatch) {
        if (num == null || num.intValue() != 65514 || dynamicPatch == null || dynamicPatch.getOriginType() != 37) {
            return false;
        }
        return true;
    }

    public static boolean LJIJJ(Integer num, DynamicPatch dynamicPatch) {
        if (num == null || num.intValue() != 65514 || dynamicPatch == null || dynamicPatch.getOriginType() != 40) {
            return false;
        }
        return true;
    }

    public static boolean LJJIIJ(DynamicPatch dynamicPatch, List list) {
        if (dynamicPatch == null || list == null) {
            return false;
        }
        return list.contains(Integer.valueOf(dynamicPatch.getOriginType()));
    }

    public static void LJJIIJZLJL(C1537720q7O c1537720q7O, String str) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if (Intrinsics.LJFF(((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).getSearchDebugSwitch(), Boolean.TRUE) && c1537720q7O != null) {
            C1537480q70 hybridContext = c1537720q7O.getHybridContext();
            if (hybridContext != null && (jSONObject2 = hybridContext.templateResData) != null) {
                jSONObject2.optString("res_version");
            }
            C1537480q70 hybridContext2 = c1537720q7O.getHybridContext();
            if (hybridContext2 != null && (jSONObject = hybridContext2.templateResData) != null) {
                jSONObject.optString("res_from");
            }
            C1537720q7O.LJJIIZ(c1537720q7O, 2);
        }
    }

    public static void LJJIIZ(C1309760kBi c1309760kBi, String str) {
        C649490Pdj.LIZ.getClass();
        if (C649490Pdj.LIZIZ().enableVsyncMessageLoop == 1 && a0.LJJIIZI(str, "fe_tiktok_lynx_search_transfer", false)) {
            C421540Gfw.LIZ(new AwS564S0100000_20(c1309760kBi, 18));
        }
        if (C649490Pdj.LIZIZ().enablePreUpdateData == 1) {
            c1309760kBi.LJIJ = true;
        }
        if (LJIILJJIL(str)) {
            c1309760kBi.LJII = true;
        }
        if (LJIIJ(str)) {
            c1309760kBi.getClass();
        }
    }

    public static boolean LJIIJJI(DynamicPatch dynamicPatch, DynamicPatch dynamicPatch2, boolean z) {
        if (z && dynamicPatch2 != null) {
            if (Intrinsics.LJFF(dynamicPatch.schema, dynamicPatch2.schema) && Intrinsics.LJFF(dynamicPatch.getBulletSchema(), dynamicPatch2.getBulletSchema())) {
                return true;
            }
            return false;
        }
        return Intrinsics.LJFF(dynamicPatch, dynamicPatch2);
    }
}
