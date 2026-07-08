package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: renamed from: X.08FK, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08FK {
    public static final <T> T LIZ(List<T> list, int i, T t) {
        if (C13LP.LJJJLZIJ(i, list) != null) {
            return (T) ListProtector.set(list, i, t);
        }
        int size = list.size();
        if (size > i) {
            return t;
        }
        while (true) {
            list.add(t);
            if (size == i) {
                return t;
            }
            size++;
        }
    }
}
