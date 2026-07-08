package X;

import java.util.Comparator;
import java.util.SortedSet;

/* JADX INFO: renamed from: X.12na, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19862812na {
    public static boolean LIZ(Comparator comparator, Iterable iterable) {
        Comparator comparator2;
        comparator.getClass();
        iterable.getClass();
        if (iterable instanceof SortedSet) {
            comparator2 = ((SortedSet) iterable).comparator();
            if (comparator2 == null) {
                comparator2 = C19863212ne.LL;
            }
        } else if (iterable instanceof InterfaceC19863512nh) {
            comparator2 = ((InterfaceC19863512nh) iterable).comparator();
        } else {
            return false;
        }
        return comparator.equals(comparator2);
    }
}
