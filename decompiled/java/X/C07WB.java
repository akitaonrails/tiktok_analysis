package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: renamed from: X.07WB, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07WB {
    /* JADX WARN: Multi-variable type inference failed */
    public static final List<Integer> LIZ(List<Integer> list) {
        if (list.size() == 4) {
            if (C07ID.LIZ()) {
                return C1697810uHb.LJIIJJI(16, 0, 16, 0);
            }
            return C1697810uHb.LJIIJJI(Integer.valueOf(((Number) ListProtector.get(list, 1)).intValue() - 12), ListProtector.get(list, 0), Integer.valueOf(((Number) ListProtector.get(list, 3)).intValue() - 12), ListProtector.get(list, 2));
        }
        return C1697810uHb.LJIIJJI(0, 0, 0, 0);
    }
}
