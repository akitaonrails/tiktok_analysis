package X;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: X.13DB, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13DB<E> extends C13CT<E> implements Serializable {
    public static final C13DB LLILLJJLI;
    public final C13DA<E, ?> LL;

    static {
        C13DA.Companion.getClass();
        LLILLJJLI = new C13DB(C13DA.Empty);
    }

    public C13DB() {
        this(new C13DA());
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.LL.isReadOnly$kotlin_stdlib()) {
            return new C13DI(this, 1);
        }
        throw new NotSerializableException("The set cannot be serialized while it is being built.");
    }

    public final Set<E> build() {
        this.LL.build();
        return size() > 0 ? this : LLILLJJLI;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.LL.clear();
    }

    @Override // X.C13CT
    public int getSize() {
        return this.LL.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.LL.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return this.LL.keysIterator$kotlin_stdlib();
    }

    public C13DB(int i) {
        this(new C13DA(i));
    }

    @Override // X.C13CT, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e) {
        if (this.LL.addKey$kotlin_stdlib(e) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        this.LL.checkIsMutable$kotlin_stdlib();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.LL.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return this.LL.removeKey$kotlin_stdlib(obj);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        this.LL.checkIsMutable$kotlin_stdlib();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        this.LL.checkIsMutable$kotlin_stdlib();
        return super.retainAll(collection);
    }

    public C13DB(C13DA<E, ?> c13da) {
        this.LL = c13da;
    }
}
