package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0YT6, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YT6 {
    public static Map LIZ(Map map) {
        C461720I8s.LIZIZ().toString();
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((LinkedHashMap) map).entrySet().iterator();
        while (it2.hasNext()) {
            Iterable iterable = (Iterable) ((Map.Entry) it2.next()).getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                if (!TextUtils.equals(((C0YA1) obj).uid.toString(), r6)) {
                    arrayList2.add(obj);
                }
            }
            C19719612Di.LJJI(arrayList2, arrayList);
        }
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(arrayList, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (Object obj2 : arrayList) {
            C0YA1 c0ya1 = (C0YA1) obj2;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(c0ya1.key);
            sbLIZ.append(c0ya1.msgUuid);
            sbLIZ.append(c0ya1.conversationId);
            sbLIZ.append(c0ya1.idempotent_id);
            linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ), obj2);
        }
        return linkedHashMap;
    }

    public static final List<C0YT7> LIZIZ(Map<String, ? extends C0YA1> map, Map<String, ? extends C0YA1> map2, C0YTC c0ytc) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            if (!map2.containsKey(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            arrayList.add(new C0YT7(new C0YT8((C0YA1) entry2.getValue(), ((C0YA1) entry2.getValue()).key), c0ytc));
        }
        return arrayList;
    }
}
