package X;

import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: X.11Tn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19506911Tn<E> {
    public final int LIZ;
    public final LinkedList<E> LIZIZ;

    public final void LIZ(E e) {
        if (this.LIZIZ.contains(e)) {
            this.LIZIZ.remove(e);
        }
        if (this.LIZIZ.size() >= this.LIZ) {
            this.LIZIZ.poll();
        }
        this.LIZIZ.offer(e);
    }

    public C19506911Tn(List<? extends E> list, int i) {
        this.LIZ = i;
        LinkedList<E> linkedList = new LinkedList<>();
        this.LIZIZ = linkedList;
        linkedList.addAll(list.size() > i ? list.subList(list.size() - i, list.size() - 1) : list);
    }
}
