package X;

import java.util.Comparator;
import java.util.SortedSet;

/* JADX INFO: renamed from: X.12pn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19876512pn {
    public static boolean LIZ(Comparator<?> comparator, Iterable<?> iterable) {
        Object objComparator;
        comparator.getClass();
        iterable.getClass();
        if (iterable instanceof SortedSet) {
            objComparator = ((SortedSet) iterable).comparator();
            if (objComparator == null) {
                objComparator = C19876912pr.LL;
            }
        } else if (iterable instanceof C0W39) {
            objComparator = ((C0W39) iterable).comparator();
        } else {
            return false;
        }
        return comparator.equals(objComparator);
    }
}
