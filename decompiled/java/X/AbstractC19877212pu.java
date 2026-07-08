package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.12pu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19877212pu<T> implements Comparator<T> {
    public static <T> AbstractC19877212pu<T> LIZ(Comparator<T> comparator) {
        if (comparator instanceof AbstractC19877212pu) {
            return (AbstractC19877212pu) comparator;
        }
        return new C19877112pt(comparator);
    }

    public final <E extends T> List<E> LIZIZ(Iterable<E> iterable) {
        Collection arrayList;
        if (iterable instanceof Collection) {
            arrayList = (Collection) iterable;
        } else {
            Iterator<E> it2 = iterable.iterator();
            arrayList = new ArrayList();
            C19867212oI.LIZ(arrayList, it2);
        }
        Object[] array = arrayList.toArray();
        Arrays.sort(array, this);
        return C19881612qc.LIZ(Arrays.asList(array));
    }
}
