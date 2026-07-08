package X;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: X.12oI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19867212oI {
    public static void LIZIZ(Iterator<?> it2) {
        it2.getClass();
        while (it2.hasNext()) {
            it2.next();
            it2.remove();
        }
    }

    public static <T> boolean LIZ(Collection<T> collection, Iterator<? extends T> it2) {
        collection.getClass();
        it2.getClass();
        boolean zAdd = false;
        while (it2.hasNext()) {
            zAdd |= collection.add(it2.next());
        }
        return zAdd;
    }
}
