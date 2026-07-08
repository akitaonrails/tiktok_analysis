package X;

import java.util.AbstractList;
import java.util.List;

/* JADX INFO: renamed from: X.13DZ, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public abstract class C13DZ<E> extends AbstractList<E> implements List<E>, InterfaceC1687470u0v {
    @Override // java.util.AbstractList, java.util.List
    public abstract void add(int i, E e);

    public abstract int getSize();

    public abstract E removeAt(int i);

    @Override // java.util.AbstractList, java.util.List
    public abstract E set(int i, E e);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ E remove(int i) {
        return removeAt(i);
    }
}
