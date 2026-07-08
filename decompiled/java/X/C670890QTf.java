package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0QTf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C670890QTf {
    public static final int LIZ = C0C64.LJIILLIIL().LJIJ(31744, 0, "masked_sug_search_sample_rate", true);
    public static EnumC670900QTg LIZIZ = EnumC670900QTg.IDLE;
    public static final CopyOnWriteArrayList<C670880QTe> LIZJ = new CopyOnWriteArrayList<>();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v7, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v2, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList] */
    public static Map LIZ() {
        Object obj;
        ?? arrayList;
        ?? arrayList2;
        ?? arrayList3;
        if (LIZIZ != EnumC670900QTg.MASKED) {
            return null;
        }
        CopyOnWriteArrayList<C670880QTe> copyOnWriteArrayList = LIZJ;
        if (copyOnWriteArrayList.isEmpty()) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(copyOnWriteArrayList, 10));
            Iterator<C670880QTe> it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                arrayList4.add(it2.next().LIZ);
            }
            linkedHashMap.put("masked_sug_raw_query", arrayList4.toString());
            CopyOnWriteArrayList<C670880QTe> copyOnWriteArrayList2 = LIZJ;
            ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(copyOnWriteArrayList2, 10));
            Iterator<C670880QTe> it3 = copyOnWriteArrayList2.iterator();
            while (it3.hasNext()) {
                List<SearchSugEntity> list = it3.next().LIZIZ.sugList;
                if (list != null) {
                    arrayList3 = new ArrayList(C15438062q.LJIJJ(list, 10));
                    Iterator<SearchSugEntity> it4 = list.iterator();
                    while (it4.hasNext()) {
                        arrayList3.add(it4.next().content);
                    }
                } else {
                    arrayList3 = C13BV.INSTANCE;
                }
                arrayList5.add(arrayList3);
            }
            linkedHashMap.put("masked_sug_keywords", arrayList5.toString());
            CopyOnWriteArrayList<C670880QTe> copyOnWriteArrayList3 = LIZJ;
            ArrayList arrayList6 = new ArrayList(C15438062q.LJIJJ(copyOnWriteArrayList3, 10));
            Iterator<C670880QTe> it5 = copyOnWriteArrayList3.iterator();
            while (it5.hasNext()) {
                List<SearchSugEntity> list2 = it5.next().LIZIZ.sugList;
                if (list2 != null) {
                    arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                    Iterator<SearchSugEntity> it6 = list2.iterator();
                    while (it6.hasNext()) {
                        arrayList2.add(C0QNG.LJ(it6.next()) ? "enrich_sug" : "normal_sug");
                    }
                } else {
                    arrayList2 = C13BV.INSTANCE;
                }
                arrayList6.add(arrayList2);
            }
            linkedHashMap.put("masked_sug_type", arrayList6.toString());
            CopyOnWriteArrayList<C670880QTe> copyOnWriteArrayList4 = LIZJ;
            ArrayList arrayList7 = new ArrayList(C15438062q.LJIJJ(copyOnWriteArrayList4, 10));
            Iterator<C670880QTe> it7 = copyOnWriteArrayList4.iterator();
            while (it7.hasNext()) {
                List<SearchSugEntity> list3 = it7.next().LIZIZ.sugList;
                if (list3 != null) {
                    arrayList = new ArrayList(C15438062q.LJIJJ(list3, 10));
                    int i = 0;
                    for (SearchSugEntity searchSugEntity : list3) {
                        int i2 = i + 1;
                        if (i < 0) {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                        arrayList.add(Integer.valueOf(i));
                        i = i2;
                    }
                } else {
                    arrayList = C13BV.INSTANCE;
                }
                arrayList7.add(arrayList);
            }
            linkedHashMap.put("masked_sug_words_position", arrayList7.toString());
            C189200o6.m2constructorimpl(linkedHashMap);
            obj = linkedHashMap;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj = c098200Yq;
        }
        return (Map) (C189200o6.m7isFailureimpl(obj) ? null : obj);
    }

    public static boolean LIZIZ() {
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "masked_sug_search", true, false)) {
            return false;
        }
        if (LIZIZ == EnumC670900QTg.IDLE) {
            LIZIZ = new SecureRandom().nextInt(100000) + 1 <= LIZ ? EnumC670900QTg.MASKED : EnumC670900QTg.NORMAL;
        }
        return LIZIZ == EnumC670900QTg.MASKED;
    }
}
