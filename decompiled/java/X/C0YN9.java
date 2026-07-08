package X;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.0YN9, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YN9 {
    public final InterfaceC869780YAe LIZ;
    public final C868780Y6i LIZIZ;
    public final boolean LIZJ;

    public static C0YNC LIZ(List list) {
        Iterator it2 = list.iterator();
        if (it2.hasNext()) {
            Object next = it2.next();
            if (it2.hasNext()) {
                long index = ((C869590Y9l) next).getIndex();
                do {
                    Object next2 = it2.next();
                    long index2 = ((C869590Y9l) next2).getIndex();
                    if (index > index2) {
                        next = next2;
                        index = index2;
                    }
                } while (it2.hasNext());
            }
            long index3 = ((C869590Y9l) next).getIndex();
            Iterator it3 = list.iterator();
            if (it3.hasNext()) {
                Object next3 = it3.next();
                if (it3.hasNext()) {
                    long index4 = ((C869590Y9l) next3).getIndex();
                    do {
                        Object next4 = it3.next();
                        long index5 = ((C869590Y9l) next4).getIndex();
                        if (index4 < index5) {
                            next3 = next4;
                            index4 = index5;
                        }
                    } while (it3.hasNext());
                }
                return new C0YNC(index3, -1L, ((C869590Y9l) next3).getIndex(), -1L);
            }
            throw new NoSuchElementException();
        }
        throw new NoSuchElementException();
    }

    public C0YN9(InterfaceC869780YAe interfaceC869780YAe, C868780Y6i c868780Y6i, boolean z) {
        this.LIZ = interfaceC869780YAe;
        this.LIZIZ = c868780Y6i;
        this.LIZJ = z;
    }
}
