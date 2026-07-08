package X;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

/* JADX INFO: renamed from: X.13EQ, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public class C13EQ extends C13EP {
    public static final <T extends Comparable<? super T>> SortedSet<T> LJJIJLIJ(Iterable<? extends T> iterable) {
        TreeSet treeSet = new TreeSet();
        C13LP.LLFII(iterable, treeSet);
        return treeSet;
    }

    public static final <R> List<R> LJJIJL(Iterable<?> iterable, Class<R> cls) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (cls.isInstance(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
