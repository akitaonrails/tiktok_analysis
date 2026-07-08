package X;

import com.bytedance.android.bcm.api.model.BcmParams;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.text.u;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.189M, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C189M {
    public static final void LIZ(C21244118Br c21244118Br) {
        BcmParams bcmParams;
        BcmParams bcmParams2;
        List<String> listLIZLLL = C18CS.LIZ.LIZJ().LIZLLL();
        if (listLIZLLL.isEmpty()) {
            return;
        }
        for (C1766940w56 c1766940w56 : c21244118Br.LIZ) {
            C1766990w5B c1766990w5B = c1766940w56.LJIIIZ;
            if (c1766990w5B != null && (bcmParams2 = c1766990w5B.LIZ) != null) {
                Iterator<String> it2 = listLIZLLL.iterator();
                while (it2.hasNext()) {
                    bcmParams2.remove(it2.next());
                }
            }
            C1766990w5B c1766990w5B2 = c1766940w56.LJIIIZ;
            if (c1766990w5B2 != null && (bcmParams = c1766990w5B2.LIZIZ) != null) {
                Iterator<String> it3 = listLIZLLL.iterator();
                while (it3.hasNext()) {
                    bcmParams.remove(it3.next());
                }
            }
        }
    }

    public static final void LIZIZ(C18C6 c18c6) {
        BcmParams bcmParams;
        Map<String, Object> map;
        BcmParams bcmParams2;
        Map<String, Object> map2;
        if (C18A2.LIZJ.get() == 0) {
            C18A2.LIZ();
        }
        List<C1766940w56> list = c18c6.LIZ;
        ArrayList arrayList = new ArrayList();
        for (C1766940w56 c1766940w56 : list) {
            C1766950w57 c1766950w57 = new C1766950w57(c1766940w56);
            List<String> list2 = C18A2.LIZ.bcmInChain;
            C1766990w5B c1766990w5B = c1766940w56.LJIIIZ;
            if (c1766990w5B != null && (bcmParams2 = c1766990w5B.LIZ) != null && (map2 = bcmParams2.toMap()) != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, Object> entry : map2.entrySet()) {
                    if (list2.contains(entry.getKey())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                if (!linkedHashMap.isEmpty()) {
                    c1766950w57.LJIIJ = C051S.LIZ(linkedHashMap);
                }
            }
            C1766990w5B c1766990w5B2 = c1766940w56.LJIIIZ;
            if (c1766990w5B2 != null && (bcmParams = c1766990w5B2.LIZIZ) != null && (map = bcmParams.toMap()) != null) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry<String, Object> entry2 : map.entrySet()) {
                    if (list2.contains(entry2.getKey())) {
                        linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                    }
                }
                if (!linkedHashMap2.isEmpty()) {
                    c1766950w57.LJIIJJI = C051S.LIZ(linkedHashMap2);
                }
            }
            arrayList.add(c1766950w57);
        }
        c18c6.LIZ = arrayList;
    }

    public static final JSONArray LJFF(C18C6 c18c6) {
        List<C1766940w56> list = c18c6.LIZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<C1766940w56> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().LIZIZ);
        }
        return new JSONArray((Collection) arrayList);
    }

    public static final boolean LIZLLL(String str, List list) {
        if (str == null) {
            return false;
        }
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                String str2 = (String) it2.next();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str2);
                sbLIZ.append('.');
                if (u.LJJIIJZLJL(str, C2188811AlT.LIZIZ(sbLIZ), false)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean LJ(String str, List list) {
        if (str == null) {
            return false;
        }
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (u.LJJIIJZLJL(str, (String) it2.next(), false)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean LIZJ(List list, String str, List list2, boolean z) {
        if (z) {
            if (!LIZLLL(str, list2)) {
                return true;
            }
            return false;
        }
        return LIZLLL(str, list);
    }
}
