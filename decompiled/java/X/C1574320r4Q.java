package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import com.ss.android.ugc.aweme.minidrama.common.preload.MiniDramaVideoApi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS74S1000000_24;

/* JADX INFO: renamed from: X.0r4Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1574320r4Q {
    public static final C1574320r4Q LIZ = new C1574320r4Q();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(238));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(240));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(239));

    public static void LIZ(String str, Map map) {
        String str2;
        Object obj = ((HashMap) map).get("awemeList");
        if ((obj instanceof String) && (str2 = (String) obj) != null) {
            Gson gson = (Gson) LIZLLL.getValue();
            if (gson == null) {
                return;
            }
            Map map2 = (Map) LIZJ.getValue();
            Object linkedHashMap = map2.get(str);
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
                map2.put(str, linkedHashMap);
            }
            Map map3 = (Map) linkedHashMap;
            int i = 0;
            for (Object obj2 : (List) GsonProtectorUtils.fromJson(gson, str2, new TypeToken<List<? extends Aweme>>() { // from class: X.0r4R
            }.getType())) {
                int i2 = i + 1;
                if (i >= 0) {
                    Aweme aweme = (Aweme) obj2;
                    if (aweme.getAid() != null) {
                        map3.put(aweme.getAid(), aweme);
                        C1574320r4Q c1574320r4Q = LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Parsed aweme, aid=");
                        sbLIZ.append(aweme.getAid());
                        C2188811AlT.LIZIZ(sbLIZ);
                        c1574320r4Q.getClass();
                    } else {
                        C1574320r4Q c1574320r4Q2 = LIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Failed to parse aweme at index=");
                        sbLIZ2.append(i);
                        sbLIZ2.append(';');
                        C2188811AlT.LIZIZ(sbLIZ2);
                        c1574320r4Q2.getClass();
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            return;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("awemeList is null for uniqueKey=");
        sbLIZ3.append(str);
        C2188811AlT.LIZIZ(sbLIZ3);
    }

    public static void LIZIZ(String str, Map map) {
        String str2;
        Long lLJIILIIL;
        Object obj = ((HashMap) map).get("awemeList");
        if ((obj instanceof String) && (str2 = (String) obj) != null) {
            Gson gson = (Gson) LIZLLL.getValue();
            if (gson == null) {
                return;
            }
            int i = 0;
            for (Aweme aweme : (List) GsonProtectorUtils.fromJson(gson, str2, new TypeToken<List<? extends Aweme>>() { // from class: X.0r4S
            }.getType())) {
                String aid = aweme.getAid();
                if (aid != null && (lLJIILIIL = C2095008Iq.LJIILIIL(aid)) != null) {
                    long jLongValue = lLJIILIIL.longValue();
                    PaidContentInfo paidContentInfo = aweme.mPaidContentInfo;
                    if (paidContentInfo != null) {
                        long paidCollectionId = paidContentInfo.getPaidCollectionId();
                        if (paidCollectionId > 0) {
                            C1574580r4q.LIZIZ.LIZIZ(paidCollectionId, new C1574370r4V(jLongValue), aweme, new C1556040qaw(str));
                            i++;
                        }
                    }
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("parseAwemeListV2 uniqueKey=");
            sbLIZ.append(str);
            sbLIZ.append(" put=");
            sbLIZ.append(i);
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("awemeList is null for uniqueKey=");
        sbLIZ2.append(str);
        C2188811AlT.LIZIZ(sbLIZ2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.ArrayList] */
    public static void LIZJ(String str, Map map) {
        String str2;
        ?? arrayList;
        Set setKeySet;
        Object obj = ((HashMap) map).get("collectionList");
        if ((obj instanceof String) && (str2 = (String) obj) != null && C1573840r3e.LIZ(str2)) {
            Gson gson = (Gson) LIZLLL.getValue();
            if (gson == null) {
                return;
            }
            List list = (List) GsonProtectorUtils.fromJson(gson, str2, new TypeToken<List<? extends String>>() { // from class: X.0r4T
            }.getType());
            if (list.isEmpty()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("No parsedIds found for uniqueKey=");
                sbLIZ.append(str);
                C2188811AlT.LIZIZ(sbLIZ);
                return;
            }
            Map map2 = (Map) ((Map) LIZIZ.getValue()).get(str);
            if (map2 != null && (setKeySet = map2.keySet()) != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(setKeySet, 10));
                Iterator it2 = setKeySet.iterator();
                while (it2.hasNext()) {
                    arrayList.add(C2095008Iq.LJIILIIL((String) it2.next()));
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (obj2 != null) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                arrayList3.add(C2095008Iq.LJIILIIL((String) it3.next()));
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj3 : arrayList3) {
                if (obj3 != null) {
                    arrayList4.add(obj3);
                }
            }
            ArrayList arrayList5 = new ArrayList();
            for (Object obj4 : arrayList4) {
                if (!arrayList2.contains(Long.valueOf(((Number) obj4).longValue()))) {
                    arrayList5.add(obj4);
                }
            }
            if (arrayList5.isEmpty()) {
                return;
            }
            C1617470sC1 c1617470sC1 = MiniDramaVideoApi.LIZ;
            AwS74S1000000_24 awS74S1000000_24 = new AwS74S1000000_24(str, 2);
            Integer numValueOf = Integer.valueOf(CastIntegerProtector.parseInt("1"));
            c1617470sC1.getClass();
            C1617470sC1.LIZ(arrayList5, numValueOf, awS74S1000000_24);
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("No collectionId found for uniqueKey=");
        sbLIZ2.append(str);
        C2188811AlT.LIZIZ(sbLIZ2);
    }

    public static void LIZLLL(String str, Map map) {
        String str2;
        Object obj = ((HashMap) map).get("collectionList");
        if ((obj instanceof String) && (str2 = (String) obj) != null && C1573840r3e.LIZ(str2)) {
            Gson gson = (Gson) LIZLLL.getValue();
            if (gson == null) {
                return;
            }
            List list = (List) GsonProtectorUtils.fromJson(gson, str2, new TypeToken<List<? extends String>>() { // from class: X.0r4U
            }.getType());
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Long lLJIILIIL = C2095008Iq.LJIILIIL((String) it2.next());
                if (lLJIILIIL != null) {
                    arrayList.add(lLJIILIIL);
                }
            }
            if (arrayList.isEmpty()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("parseCollectionAndFetchV2: no valid ids for uniqueKey=");
                sbLIZ.append(str);
                C2188811AlT.LIZIZ(sbLIZ);
                return;
            }
            C1574580r4q.LIZIZ.LJI(arrayList, C1574380r4W.LIZ, new C1556040qaw(str), new AwS74S1000000_24(str, 3));
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("No collectionId found for uniqueKey=");
        sbLIZ2.append(str);
        C2188811AlT.LIZIZ(sbLIZ2);
    }
}
