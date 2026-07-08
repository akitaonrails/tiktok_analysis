package X;

import java.util.Comparator;

/* JADX INFO: renamed from: X.0za3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1901450za3<T> implements Comparator {
    public static final C1901450za3<T> LL = new C1901450za3<>();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        float f = ((C1900970zZH) obj).LL.affinityScore;
        float f2 = ((C1900970zZH) obj2).LL.affinityScore;
        if (f > f2) {
            return -1;
        }
        if (f < f2) {
            return 1;
        }
        return 0;
    }
}
