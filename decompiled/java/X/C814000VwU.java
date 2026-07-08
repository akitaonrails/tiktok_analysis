package X;

import java.util.Comparator;

/* JADX INFO: renamed from: X.0VwU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C814000VwU<T> implements Comparator {
    public static final C814000VwU<T> LL = new C814000VwU<>();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        long j = ((C814040VwY) obj).LIZLLL;
        long j2 = ((C814040VwY) obj2).LIZLLL;
        if (j == j2) {
            return 0;
        }
        if (j < j2) {
            return -1;
        }
        return 1;
    }
}
