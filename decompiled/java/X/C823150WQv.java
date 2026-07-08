package X;

import Y.AComparatorS32S0000000_13;
import java.lang.Comparable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

/* JADX INFO: renamed from: X.0WQv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C823150WQv<E extends Comparable> {
    public final PriorityQueue<E> LIZ;
    public final int LIZIZ;

    public final List<E> LIZIZ() {
        ArrayList arrayList = new ArrayList(this.LIZ);
        Collections.sort(arrayList);
        return arrayList;
    }

    public C823150WQv(int i) {
        if (i > 0) {
            this.LIZIZ = i;
            this.LIZ = new PriorityQueue<>(i, new AComparatorS32S0000000_13(42));
            return;
        }
        throw new IllegalStateException();
    }

    public final void LIZ(E e) {
        if (this.LIZ.size() < this.LIZIZ) {
            this.LIZ.add(e);
        } else {
            if (e.compareTo(this.LIZ.peek()) <= 0) {
                return;
            }
            this.LIZ.poll();
            this.LIZ.add(e);
        }
    }
}
