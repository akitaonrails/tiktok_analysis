package X;

import java.util.Comparator;
import java.util.TreeSet;

/* JADX INFO: renamed from: X.093Z, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public class C093Z {
    public static final <T> TreeSet<T> LIZ(Comparator<? super T> comparator, T... tArr) {
        TreeSet<T> treeSet = new TreeSet<>(comparator);
        C13LQ.LJJLIIIJL(treeSet, tArr);
        return treeSet;
    }
}
