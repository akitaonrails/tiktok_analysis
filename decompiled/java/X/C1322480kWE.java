package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.0kWE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1322480kWE<E> extends ArrayList<E> {
    public C1322480kWE(int i) {
        super(i);
    }

    public static <E> C1322480kWE<E> copyOf(List<E> list) {
        return new C1322480kWE<>(list);
    }

    public static <E> C1322480kWE<E> of(E... eArr) {
        C1322480kWE<E> c1322480kWE = new C1322480kWE<>(eArr.length);
        Collections.addAll(c1322480kWE, eArr);
        return c1322480kWE;
    }

    public C1322480kWE(List<E> list) {
        super(list);
    }
}
