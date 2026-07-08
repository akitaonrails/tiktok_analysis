package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0yOp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1856050yOp {
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
