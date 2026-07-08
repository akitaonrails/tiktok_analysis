package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: renamed from: X.0HO0, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HO0 {
    public static final <T> C0HZV<T> LIZ(List<? extends T> list) {
        if (list.size() >= 5) {
            return new C0HZV<>(ListProtector.get(list, 0), ListProtector.get(list, 1), ListProtector.get(list, 2), ListProtector.get(list, 3), ListProtector.get(list, 4));
        }
        throw new RuntimeException("Attempt to create Quintuple with list with less than 5 elements.");
    }
}
