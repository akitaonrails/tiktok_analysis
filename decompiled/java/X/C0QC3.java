package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: renamed from: X.0QC3, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QC3 {
    public static final Object LIZ(int i, List list) {
        if (list == null || i >= list.size() || i < 0) {
            return null;
        }
        return ListProtector.get(list, i);
    }
}
