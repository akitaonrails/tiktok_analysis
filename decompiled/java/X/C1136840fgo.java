package X;

import java.util.Comparator;

/* JADX INFO: renamed from: X.0fgo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1136840fgo<T> implements Comparator {
    public static final C1136840fgo<T> LL = new C1136840fgo<>();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        long j;
        C916720Zxm c916720Zxm = (C916720Zxm) obj;
        C916720Zxm c916720Zxm2 = (C916720Zxm) obj2;
        long j2 = 0;
        if (c916720Zxm != null) {
            j = c916720Zxm.LIZ;
        } else {
            j = 0;
        }
        if (c916720Zxm2 != null) {
            j2 = c916720Zxm2.LIZ;
        }
        if (j > j2) {
            return 1;
        }
        return -1;
    }
}
