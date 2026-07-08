package X;

import java.util.LinkedList;

/* JADX INFO: renamed from: X.13Vx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20022713Vx<E> extends LinkedList<E> {
    public final int LL = 500;

    @Override // java.util.LinkedList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque, java.util.Queue
    public final boolean add(E e) {
        super.add(e);
        while (size() > this.LL) {
            remove();
        }
        return true;
    }
}
