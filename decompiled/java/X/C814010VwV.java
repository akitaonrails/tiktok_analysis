package X;

import java.util.Comparator;

/* JADX INFO: renamed from: X.0VwV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C814010VwV<T> implements Comparator {
    public static final C814010VwV<T> LL = new C814010VwV<>();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        long j = ((C814040VwY) obj).LJ;
        long j2 = ((C814040VwY) obj2).LJ;
        if (j == j2) {
            return 0;
        }
        if (j < j2) {
            return -1;
        }
        return 1;
    }
}
