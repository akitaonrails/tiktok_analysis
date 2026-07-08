package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import defpackage.Config;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: X.12oJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19867312oJ<E> extends AbstractCollection<E> {
    public final Collection<E> LL;
    public final InterfaceC1394580mOW<? super E> LLILLJJLI;

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        Collection<E> collection = this.LL;
        InterfaceC1394580mOW<? super E> interfaceC1394580mOW = this.LLILLJJLI;
        if (!(collection instanceof RandomAccess) || !(collection instanceof List)) {
            Iterator<E> it2 = collection.iterator();
            interfaceC1394580mOW.getClass();
            while (it2.hasNext()) {
                if (interfaceC1394580mOW.apply(it2.next())) {
                    it2.remove();
                }
            }
            return;
        }
        List list = (List) collection;
        interfaceC1394580mOW.getClass();
        int i = 0;
        int i2 = 0;
        while (i < list.size()) {
            Config config = (Object) ListProtector.get(list, i);
            if (!interfaceC1394580mOW.apply(config)) {
                if (i > i2) {
                    try {
                        ListProtector.set(list, i2, config);
                    } catch (IllegalArgumentException e) {
                        TryCatchGuardChecker.doCheck(e);
                        C1394610mOZ.LIZ(list, interfaceC1394580mOW, i2, i);
                        return;
                    } catch (UnsupportedOperationException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        C1394610mOZ.LIZ(list, interfaceC1394580mOW, i2, i);
                        return;
                    }
                }
                i2++;
            }
            i++;
        }
        list.subList(i2, list.size()).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        Collection<E> collection = this.LL;
        InterfaceC1394580mOW<? super E> interfaceC1394580mOW = this.LLILLJJLI;
        Iterator<E> it2 = collection.iterator();
        C19864312np.LJI(interfaceC1394580mOW, "predicate");
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                i = -1;
                break;
            }
            if (interfaceC1394580mOW.apply(it2.next())) {
                break;
            }
            i++;
        }
        return true ^ (i != -1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        Iterator<E> it2 = this.LL.iterator();
        InterfaceC1394580mOW<? super E> interfaceC1394580mOW = this.LLILLJJLI;
        it2.getClass();
        interfaceC1394580mOW.getClass();
        return new C19853012m0(it2, interfaceC1394580mOW);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        Iterator<E> it2 = this.LL.iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (this.LLILLJJLI.apply(it2.next())) {
                i++;
            }
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        Iterator<E> it2 = iterator();
        ArrayList arrayList = new ArrayList();
        C19867212oI.LIZ(arrayList, it2);
        return arrayList.toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(E e) {
        C19864312np.LJ(this.LLILLJJLI.apply(e));
        return this.LL.add(e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        Iterator<? extends E> it2 = collection.iterator();
        while (it2.hasNext()) {
            C19864312np.LJ(this.LLILLJJLI.apply(it2.next()));
        }
        return this.LL.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        Collection<E> collection = this.LL;
        collection.getClass();
        try {
            if (collection.contains(obj)) {
                return this.LLILLJJLI.apply(obj);
            }
        } catch (ClassCastException | NullPointerException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        Iterator<?> it2 = collection.iterator();
        while (it2.hasNext()) {
            if (!contains(it2.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        if (contains(obj) && this.LL.remove(obj)) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        Iterator<E> it2 = this.LL.iterator();
        boolean z = false;
        while (it2.hasNext()) {
            E next = it2.next();
            if (this.LLILLJJLI.apply(next) && collection.contains(next)) {
                it2.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        Iterator<E> it2 = this.LL.iterator();
        boolean z = false;
        while (it2.hasNext()) {
            E next = it2.next();
            if (this.LLILLJJLI.apply(next) && !collection.contains(next)) {
                it2.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        Iterator<E> it2 = iterator();
        ArrayList arrayList = new ArrayList();
        C19867212oI.LIZ(arrayList, it2);
        return (T[]) arrayList.toArray(tArr);
    }

    public C19867312oJ(Collection<E> collection, InterfaceC1394580mOW<? super E> interfaceC1394580mOW) {
        this.LL = collection;
        this.LLILLJJLI = interfaceC1394580mOW;
    }
}
