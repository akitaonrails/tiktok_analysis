package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.07lS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1956407lS {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(Object obj) {
        if (!(obj instanceof Map) && !(obj instanceof List)) {
            return obj.toString();
        }
        return C1741890vQh.LJIIIIZZ(obj);
    }

    public static List LIZIZ(Map map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new C080U((String) entry.getKey(), LIZ(entry.getValue())));
        }
        return arrayList;
    }
}
