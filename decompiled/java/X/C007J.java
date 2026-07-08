package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.007J, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C007J {
    public static final List LIZ(String str, Map map) {
        Iterable iterable;
        Object obj = map.get(str);
        if ((obj instanceof Iterable) && (iterable = (Iterable) obj) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : iterable) {
                if (obj2 instanceof String) {
                    arrayList.add(obj2);
                }
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }
}
