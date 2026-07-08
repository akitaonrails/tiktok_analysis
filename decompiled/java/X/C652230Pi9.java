package X;

import java.util.List;

/* JADX INFO: renamed from: X.0Pi9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C652230Pi9 {
    public static List LIZ(int i, int i2, List list) {
        int i3;
        if (list.isEmpty()) {
            return list;
        }
        int size = list.size() - 1;
        if (i >= 0 && i <= size && i2 - 1 >= 0 && i3 <= size && i < i2) {
            return list.subList(i, i2);
        }
        return list;
    }
}
