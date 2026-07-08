package X;

import java.util.AbstractSet;
import java.util.Set;

/* JADX INFO: renamed from: X.13CT, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public abstract class C13CT<E> extends AbstractSet<E> implements Set<E>, InterfaceC835440Wpy {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean add(E e);

    public abstract int getSize();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return getSize();
    }
}
