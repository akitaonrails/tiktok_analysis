package X;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.0uHc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1697820uHc {
    public static final C13DV LIZIZ() {
        return new C13DV(0, 1, null);
    }

    public static final <E> List<E> LIZ(List<E> list) {
        return ((C13DV) list).build();
    }

    public static final <T> List<T> LIZLLL(Iterable<? extends T> iterable) {
        List<T> listLLIIIJ = C13LP.LLIIIJ(iterable);
        Collections.shuffle(listLLIIIJ);
        return listLLIIIJ;
    }
}
