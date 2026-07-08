package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.062q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C15438062q extends C1697810uHb {
    public static final <T> List<T> LJIJJLI(Iterable<? extends Iterable<? extends T>> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<? extends Iterable<? extends T>> it2 = iterable.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(it2.next(), arrayList);
        }
        return arrayList;
    }

    public static final <T> int LJIJJ(Iterable<? extends T> iterable, int i) {
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return i;
    }
}
