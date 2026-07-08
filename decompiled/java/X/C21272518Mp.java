package X;

import android.util.LruCache;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfo;
import com.ss.android.ugc.aweme.ecommerce.model.GetItemProductInfoResponseData;
import com.ss.android.ugc.aweme.ecommerce.model.PanelVoucherInfo;
import com.ss.android.ugc.aweme.ecommerce.model.ProductListModel;
import com.ss.android.ugc.aweme.ecommerce.model.RelatedProductInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.offline.ecommerce.debug.IEComOfflineService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.18Mp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21272518Mp {
    public static boolean LIZIZ;
    public static int LJIIJJI;
    public static final C21272518Mp LIZ = new C21272518Mp();
    public static final Map<String, String> LIZJ = new LinkedHashMap();
    public static final Map<String, Integer> LIZLLL = new LinkedHashMap();
    public static final LruCache<String, GetItemProductInfoResponseData> LJ = new LruCache<>(3);
    public static final LruCache<String, List<PanelVoucherInfo>> LJFF = new LruCache<>(3);
    public static final Map<String, C21271118Mb> LJI = new LinkedHashMap();
    public static final C1977107on LJII = new C1977107on();
    public static final Map<String, Boolean> LJIIIIZZ = new LinkedHashMap();
    public static final Map<String, ProductListModel> LJIIIZ = new LinkedHashMap();
    public static final LruCache<String, Aweme> LJIIJ = new LruCache<>(5);
    public static final Map<String, Object> LJIIL = new LinkedHashMap();
    public static final List<EnumC21274418Ni> LJIILIIL = C1697810uHb.LJIIJJI(EnumC21274418Ni.SHARE, EnumC21274418Ni.PUSH);
    public static final List<Integer> LJIILJJIL = Collections.singletonList(1);
    public static final Map<String, Map<String, Object>> LJIILL = new LinkedHashMap();

    public static void LIZIZ(Integer num) {
        if (num != null) {
            num.intValue();
            LJIIJJI = num.intValue();
        }
    }

    public static void LIZJ(String str) {
        if (str != null && str.length() != 0) {
            Map<String, Boolean> map = LJIIIIZZ;
            if (map.size() > 2) {
                ((LinkedHashMap) map).clear();
            }
            map.put(str, Boolean.TRUE);
        }
    }

    public static void LJ(String str) {
        if (str != null && str.length() != 0) {
            LIZJ.remove(str);
            LJIILL.remove(str);
        }
    }

    public static int LJIIIIZZ(String str) {
        Integer num;
        if (str == null || str.length() == 0 || (num = (Integer) ((LinkedHashMap) LIZLLL).get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    public static Map LJIIIZ(String str) {
        if (str != null && str.length() != 0) {
            return (Map) ((LinkedHashMap) LJIILL).get(str);
        }
        return null;
    }

    public static ProductListModel LJIIJ(String str) {
        boolean z;
        Aweme aweme;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        ProductListModel productListModelLJJIJL = null;
        if (z) {
            return null;
        }
        ProductListModel productListModel = (ProductListModel) ((LinkedHashMap) LJIIIZ).get(str);
        if (productListModel == null) {
            if (str.length() == 0 || (aweme = LJIIJ.get(str)) == null || (productListModelLJJIJL = C21272218Mm.LJJIJL(aweme, null, null, null, null)) == null) {
                IEComOfflineService iEComOfflineService = (IEComOfflineService) ServiceManager.get().getService(IEComOfflineService.class);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Do not find model with key: ");
                sbLIZ.append(str);
                sbLIZ.append('.');
                C2188811AlT.LIZIZ(sbLIZ);
                iEComOfflineService.LIZIZ();
            }
            return productListModelLJJIJL;
        }
        return productListModel;
    }

    public static void LIZ(Aweme aweme, String str) {
        if (str != null && str.length() != 0 && aweme != null) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C13018057o(aweme, str, null), 3);
        }
    }

    public static void LIZLLL(C21272518Mp c21272518Mp, String str) {
        c21272518Mp.getClass();
        if (str != null && str.length() != 0) {
            LruCache<String, GetItemProductInfoResponseData> lruCache = LJ;
            LIZ.getClass();
            lruCache.remove(LJFF(str, "comment_anchor"));
            lruCache.remove(LJFF(str, "video_anchor"));
            LruCache<String, List<PanelVoucherInfo>> lruCache2 = LJFF;
            lruCache2.remove(LJFF(str, "comment_anchor"));
            lruCache2.remove(LJFF(str, "video_anchor"));
        }
    }

    public static String LJFF(String str, String str2) {
        if (str2 == null) {
            return str;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static RelatedProductInfo LJIIJJI(String str, String str2) {
        C1977107on c1977107on = LJII;
        c1977107on.getClass();
        if (str == null) {
            return null;
        }
        return c1977107on.get(C1977107on.LIZ(str, str2));
    }

    public static void LJIILLIIL(String str, Map map) {
        if (str != null && str.length() != 0) {
            Map<String, Map<String, Object>> map2 = LJIILL;
            if (map2.size() > 30) {
                ((LinkedHashMap) map2).clear();
            }
            if (map != null) {
                LIZ.getClass();
                Map map3 = (Map) ((LinkedHashMap) map2).get(str);
                if (map3 != null) {
                    map3.putAll(map);
                } else {
                    map2.put(str, map);
                }
            }
        }
    }

    public static void LJIIL(Long l, String str, String str2) {
        if (str == null) {
            return;
        }
        C1977107on c1977107on = LJII;
        c1977107on.getClass();
        if (l != null) {
            l.longValue();
            RelatedProductInfo relatedProductInfo = c1977107on.get(C1977107on.LIZ(str, str2));
            if (relatedProductInfo != null) {
                relatedProductInfo.clickProductIdList.add(l);
                return;
            }
            RelatedProductInfo relatedProductInfo2 = new RelatedProductInfo(str, str2, new C13LG(50), new C13LG(50), new C13LG(50), new C13LG(1));
            relatedProductInfo2.clickProductIdList.add(l);
            c1977107on.put(C1977107on.LIZ(str, str2), relatedProductInfo2);
        }
    }

    public static void LJIILIIL(Long l, String str, String str2) {
        if (str == null) {
            return;
        }
        C1977107on c1977107on = LJII;
        c1977107on.getClass();
        if (l != null) {
            l.longValue();
            RelatedProductInfo relatedProductInfo = c1977107on.get(C1977107on.LIZ(str, str2));
            if (relatedProductInfo != null) {
                relatedProductInfo.expoProductIdList.add(l);
                return;
            }
            RelatedProductInfo relatedProductInfo2 = new RelatedProductInfo(str, str2, new C13LG(50), new C13LG(50), new C13LG(50), new C13LG(1));
            relatedProductInfo2.expoProductIdList.add(l);
            c1977107on.put(C1977107on.LIZ(str, str2), relatedProductInfo2);
        }
    }

    public static void LJIILJJIL(String str, String str2, List list) {
        if (((ArrayList) list).isEmpty()) {
            return;
        }
        C1977107on c1977107on = LJII;
        c1977107on.getClass();
        RelatedProductInfo relatedProductInfo = c1977107on.get(C1977107on.LIZ(str, str2));
        if (relatedProductInfo != null) {
            relatedProductInfo.productIdList.clear();
            relatedProductInfo.productIdList.addAll(list);
        } else {
            RelatedProductInfo relatedProductInfo2 = new RelatedProductInfo(str, str2, new C13LG(50), new C13LG(50), new C13LG(50), new C13LG(1));
            relatedProductInfo2.productIdList.addAll(list);
            c1977107on.put(C1977107on.LIZ(str, str2), relatedProductInfo2);
        }
    }

    public static void LJIILL(String str, String str2, GetItemProductInfoResponseData getItemProductInfoResponseData) {
        List<AnchorProductInfo> list;
        if (str != null && getItemProductInfoResponseData != null && (list = getItemProductInfoResponseData.products) != null && !list.isEmpty()) {
            LJ.put(LJFF(str, str2), getItemProductInfoResponseData);
        }
    }

    public static GetItemProductInfoResponseData LJI(String str, String str2, Integer num, EnumC21274418Ni enumC21274418Ni) {
        boolean z;
        List<PanelVoucherInfo> list;
        GetItemProductInfoResponseData getItemProductInfoResponseDataLIZ;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z || LJIILIIL.contains(enumC21274418Ni) || C13LP.LJJJJ(num, LJIILJJIL)) {
            return null;
        }
        if (str != null && str.length() != 0 && (list = LJFF.get(LJFF(str, str2))) != null) {
            LruCache<String, GetItemProductInfoResponseData> lruCache = LJ;
            LIZ.getClass();
            GetItemProductInfoResponseData getItemProductInfoResponseData = lruCache.get(LJFF(str, str2));
            if (getItemProductInfoResponseData != null && (getItemProductInfoResponseDataLIZ = GetItemProductInfoResponseData.LIZ(getItemProductInfoResponseData, list, 4031)) != null) {
                return getItemProductInfoResponseDataLIZ;
            }
        }
        LruCache<String, GetItemProductInfoResponseData> lruCache2 = LJ;
        LIZ.getClass();
        return lruCache2.get(LJFF(str, str2));
    }

    public static void LJIIZILJ(String str, Integer num, String str2, Map map) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            Map<String, String> map2 = LIZJ;
            if (map2.size() > 3) {
                ((LinkedHashMap) map2).clear();
            }
            if (str2 != null) {
                LIZ.getClass();
                map2.put(str, str2);
            }
        }
        LJIILLIIL(str, map);
        if (str != null && str.length() != 0) {
            Map<String, Integer> map3 = LIZLLL;
            if (map3.size() > 3) {
                ((LinkedHashMap) map3).clear();
            }
            if (num != null) {
                Integer numValueOf = Integer.valueOf(num.intValue());
                LIZ.getClass();
                map3.put(str, numValueOf);
            }
        }
    }
}
