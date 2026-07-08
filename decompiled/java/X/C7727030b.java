package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: renamed from: X.030b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7727030b {
    public static final Object LIZ(int i, List list) {
        if (list == null || i >= list.size() || i < 0) {
            return null;
        }
        return ListProtector.get(list, i);
    }
}
