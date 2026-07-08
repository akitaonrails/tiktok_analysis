package X;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: X.12q8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19878612q8<E> extends AbstractCollection<E> implements InterfaceC19879212qE<E> {
    public transient C19880012qM LL;
    public transient C19879812qK LLILLJJLI;

    public abstract int LIZJ();

    public abstract Iterator<E> LJ();

    public abstract Iterator<InterfaceC19878012q2<E>> LJFF();

    public Set<E> elementSet() {
        C19880012qM c19880012qM = this.LL;
        if (c19880012qM != null) {
            return c19880012qM;
        }
        C19880012qM c19880012qM2 = new C19880012qM(this);
        this.LL = c19880012qM2;
        return c19880012qM2;
    }

    @Override // X.InterfaceC19879212qE
    public final Set<InterfaceC19878012q2<E>> entrySet() {
        C19879812qK c19879812qK = this.LLILLJJLI;
        if (c19879812qK != null) {
            return c19879812qK;
        }
        C19879812qK c19879812qK2 = new C19879812qK(this);
        this.LLILLJJLI = c19879812qK2;
        return c19879812qK2;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return entrySet().isEmpty();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return entrySet().toString();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(E e) {
        add(e, 1);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        collection.getClass();
        int i = 0;
        if (collection instanceof InterfaceC19879212qE) {
            InterfaceC19879212qE interfaceC19879212qE = (InterfaceC19879212qE) collection;
            if (interfaceC19879212qE instanceof AbstractC19878512q7) {
                AbstractC19878512q7 abstractC19878512q7 = (AbstractC19878512q7) interfaceC19879212qE;
                if (abstractC19878512q7.isEmpty()) {
                    return false;
                }
                if (abstractC19878512q7.LLILLL.LIZJ != 0) {
                    do {
                        C19878412q6<E> c19878412q6 = abstractC19878512q7.LLILLL;
                        C19864312np.LJFF(i, c19878412q6.LIZJ);
                        add(c19878412q6.LIZ[i], abstractC19878512q7.LLILLL.LIZIZ(i));
                        i++;
                        if (i >= abstractC19878512q7.LLILLL.LIZJ) {
                            break;
                        }
                    } while (i >= 0);
                }
            } else {
                if (interfaceC19879212qE.isEmpty()) {
                    return false;
                }
                for (InterfaceC19878012q2<E> interfaceC19878012q2 : interfaceC19879212qE.entrySet()) {
                    add(interfaceC19878012q2.getElement(), interfaceC19878012q2.getCount());
                }
            }
            return true;
        }
        if (collection.isEmpty()) {
            return false;
        }
        return C19867212oI.LIZ(this, collection.iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, X.InterfaceC19879212qE
    public boolean contains(Object obj) {
        if (count(obj) > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        return C19879112qD.LIZ(this, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, X.InterfaceC19879212qE
    public final boolean remove(Object obj) {
        if (remove(obj, 1) > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        if (collection instanceof InterfaceC19879212qE) {
            collection = ((InterfaceC19879212qE) collection).elementSet();
        }
        return elementSet().removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        collection.getClass();
        if (collection instanceof InterfaceC19879212qE) {
            collection = ((InterfaceC19879212qE) collection).elementSet();
        }
        return elementSet().retainAll(collection);
    }

    public int add(E e, int i) {
        throw new UnsupportedOperationException();
    }

    public int remove(Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    public int setCount(E e, int i) {
        C19863912nl.LIZIZ(0, "count");
        int iCount = count(e);
        int i2 = -iCount;
        if (i2 > 0) {
            add(e, i2);
        } else if (i2 < 0) {
            remove(e, -i2);
            return iCount;
        }
        return iCount;
    }

    public boolean setCount(E e, int i, int i2) {
        C19863912nl.LIZIZ(i, "oldCount");
        C19863912nl.LIZIZ(0, "newCount");
        if (count(e) != i) {
            return false;
        }
        setCount(e, 0);
        return true;
    }
}
