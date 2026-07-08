package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.08L9, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08L9 {
    public static final Long LIZIZ(String str, String str2) {
        Long lLJIILIIL;
        List<String> listLJIIJJI = C1697810uHb.LJIIJJI(str, str2);
        ArrayList arrayList = new ArrayList();
        for (String str3 : listLJIIJJI) {
            if (str3 != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str3)) != null && lLJIILIIL.longValue() > 0) {
                arrayList.add(lLJIILIIL);
            }
        }
        return (Long) C13LP.LJJLIIIJLJLI(arrayList);
    }

    public static final <K, V> V LIZ(Map<K, ? extends V> map, K k, V v) {
        V v2;
        if (map.containsKey(k) && (v2 = map.get(k)) != null) {
            return v2;
        }
        return v;
    }
}
