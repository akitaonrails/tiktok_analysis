package X;

import java.util.Comparator;

/* JADX INFO: renamed from: X.0YXA, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YXA<T> implements Comparator {
    public static final C0YXA<T> LL = new C0YXA<>();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        long sortOrder = ((C0YX2) obj2).LIZ.getSortOrder() - ((C0YX2) obj).LIZ.getSortOrder();
        if (sortOrder > 0) {
            return 1;
        }
        if (sortOrder < 0) {
            return -1;
        }
        return 0;
    }
}
