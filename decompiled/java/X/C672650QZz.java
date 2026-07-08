package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchBusinessEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: renamed from: X.0QZz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C672650QZz {
    public static final C672650QZz LIZ = new C672650QZz();
    public static final Map<String, List<String>> LIZIZ = C2097608Jq.LJ();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(642));

    public static List LIZ(int i, String... strArr) {
        Collection<?> collection;
        Map map = (Map) ((Map) C1846607Lc.LIZIZ.getValue()).get(String.valueOf(i));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : strArr) {
            Collection collection2 = (Collection) ((Map) LIZJ.getValue()).get(str);
            if (map != null && (collection = (Collection) map.get(str)) != null) {
                if (collection2 != null) {
                    new ArrayList(collection2).removeAll(collection);
                    linkedHashSet.addAll(collection2);
                }
            } else if (collection2 != null) {
                linkedHashSet.addAll(collection2);
            }
        }
        return C13LP.LLIIII(linkedHashSet);
    }

    public static Map LIZIZ(C0QER c0qer, String... strArr) {
        Map<String, Object> ecSearchCommonParams;
        Object obj;
        int iLIZIZ = C650500PfM.LIZIZ(c0qer);
        if (C0QYF.LIZIZ(c0qer)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            List listLIZ = LIZ(iLIZIZ, (String[]) Arrays.copyOf(strArr, strArr.length));
            if (listLIZ != null) {
                for (Object obj2 : listLIZ) {
                    if (c0qer != null && (ecSearchCommonParams = c0qer.getEcSearchCommonParams()) != null && (obj = ecSearchCommonParams.get(obj2)) != null) {
                        linkedHashMap.put(obj2, obj);
                    }
                }
            }
            if (!linkedHashMap.isEmpty()) {
                return linkedHashMap;
            }
            return null;
        }
        return null;
    }

    public static Map LIZJ(PhotoSearchEnterParams photoSearchEnterParams, String... strArr) {
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams;
        Object obj;
        if (photoSearchEnterParams != null && (photoSearchBusinessEnterParams = photoSearchEnterParams.businessParams) != null) {
            int i = photoSearchBusinessEnterParams.rootEnterFromType;
            if (C0QYF.LIZ(i)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                C672650QZz c672650QZz = LIZ;
                String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
                c672650QZz.getClass();
                List listLIZ = LIZ(i, strArr2);
                if (listLIZ != null) {
                    for (Object obj2 : listLIZ) {
                        HashMap<String, Object> map = photoSearchEnterParams.ecSearchCommonParams;
                        if (map != null && (obj = map.get(obj2)) != null) {
                            linkedHashMap.put(obj2, obj);
                        }
                    }
                }
                if (!linkedHashMap.isEmpty()) {
                    return linkedHashMap;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static String LIZLLL(C0QER c0qer, String... strArr) {
        Map mapLIZIZ = LIZIZ(c0qer, (String[]) Arrays.copyOf(strArr, strArr.length));
        if (mapLIZIZ != null) {
            return GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), mapLIZIZ);
        }
        return null;
    }

    public static Map LJ(SearchResultParam searchResultParam, String... strArr) {
        C0QER searchEnterParam;
        Map<String, Object> ecSearchCommonParams;
        if (searchResultParam != null) {
            searchEnterParam = searchResultParam.getSearchEnterParam();
        } else {
            searchEnterParam = null;
        }
        int iLIZIZ = C650500PfM.LIZIZ(searchEnterParam);
        if (C0QYF.LIZIZ(searchEnterParam)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            List listLIZ = LIZ(iLIZIZ, (String[]) Arrays.copyOf(strArr, strArr.length));
            if (listLIZ != null) {
                for (Object obj : listLIZ) {
                    if ((searchResultParam != null && (ecSearchCommonParams = searchResultParam.getEcSearchCommonParamsFromMiddle()) != null && (!ecSearchCommonParams.isEmpty())) || (searchEnterParam != null && (ecSearchCommonParams = searchEnterParam.getEcSearchCommonParams()) != null)) {
                        Object obj2 = ecSearchCommonParams.get(obj);
                        if (obj2 != null) {
                            linkedHashMap.put(obj, obj2);
                        }
                    }
                }
            }
            if (!linkedHashMap.isEmpty()) {
                return linkedHashMap;
            }
        }
        return null;
    }
}
