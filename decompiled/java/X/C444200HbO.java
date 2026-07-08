package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0HbO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C444200HbO {
    public static final List LIZJ(Iterable iterable) {
        ArrayList arrayList = new ArrayList(20);
        int i = 0;
        for (Object obj : iterable) {
            if (obj != null) {
                arrayList.add(obj);
                i++;
                if (i == 20) {
                    break;
                }
            }
        }
        return arrayList;
    }

    public static final Object LIZ(int i, List list) {
        if (list == null || i >= list.size() || i < 0) {
            return null;
        }
        return ListProtector.get(list, i);
    }

    public static final Object LIZIZ(Object obj, Map map) {
        if (map == null || obj == null || !map.containsKey(obj)) {
            return null;
        }
        return map.get(obj);
    }
}
