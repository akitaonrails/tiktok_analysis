package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: renamed from: X.0EBq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C360560EBq {
    public static final <T> T LIZ(List<? extends T> list) {
        if (list.size() <= 1) {
            return null;
        }
        return (T) ListProtector.get(list, 1);
    }
}
