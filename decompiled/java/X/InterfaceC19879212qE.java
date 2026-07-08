package X;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: renamed from: X.12qE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public interface InterfaceC19879212qE<E> extends Collection<E> {
    int add(E e, int i);

    boolean contains(Object obj);

    @Override // java.util.Collection
    boolean containsAll(Collection<?> collection);

    int count(Object obj);

    Set<E> elementSet();

    Set<InterfaceC19878012q2<E>> entrySet();

    int remove(Object obj, int i);

    boolean remove(Object obj);

    int setCount(E e, int i);

    boolean setCount(E e, int i, int i2);

    int size();
}
