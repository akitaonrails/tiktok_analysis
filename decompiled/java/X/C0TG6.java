package X;

import java.util.Comparator;

/* JADX INFO: renamed from: X.0TG6, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TG6<T> implements Comparator {
    public static final C0TG6<T> LL = new C0TG6<>();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((AbstractRunnableC2239851Clb) obj2).LL - ((AbstractRunnableC2239851Clb) obj).LL;
    }
}
