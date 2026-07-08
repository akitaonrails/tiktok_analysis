package X;

import java.util.Comparator;

/* JADX INFO: renamed from: X.0Y7X, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public class C0Y7X implements Comparator<C869590Y9l> {
    @Override // java.util.Comparator
    public final int compare(C869590Y9l c869590Y9l, C869590Y9l c869590Y9l2) {
        C869590Y9l c869590Y9l3 = c869590Y9l;
        C869590Y9l c869590Y9l4 = c869590Y9l2;
        if (c869590Y9l3.getOrderIndex() < c869590Y9l4.getOrderIndex()) {
            return -1;
        }
        if (c869590Y9l3.getOrderIndex() == c869590Y9l4.getOrderIndex()) {
            return 0;
        }
        return 1;
    }
}
