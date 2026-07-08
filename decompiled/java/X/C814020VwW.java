package X;

import java.util.Comparator;

/* JADX INFO: renamed from: X.0VwW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C814020VwW<T> implements Comparator {
    public static final C814020VwW<T> LL = new C814020VwW<>();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        long j = ((C814050VwZ) obj).LIZIZ;
        long j2 = ((C814050VwZ) obj2).LIZIZ;
        if (j == j2) {
            return 0;
        }
        if (j < j2) {
            return -1;
        }
        return 1;
    }
}
