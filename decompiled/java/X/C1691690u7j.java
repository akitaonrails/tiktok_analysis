package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: renamed from: X.0u7j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1691690u7j {
    public static final boolean LIZ(C1692220u8a c1692220u8a) {
        int length = c1692220u8a.length();
        List<C1692270u8f<? extends InterfaceC1692820u9Y>> list = c1692220u8a.LL;
        if (list == null) {
            return false;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C1692270u8f c1692270u8f = (C1692270u8f) ListProtector.get(list, i);
            if ((c1692270u8f.LIZ instanceof AbstractC1693010u9r) && C1692250u8d.LIZIZ(0, length, c1692270u8f.LIZIZ, c1692270u8f.LIZJ)) {
                return true;
            }
        }
        return false;
    }
}
