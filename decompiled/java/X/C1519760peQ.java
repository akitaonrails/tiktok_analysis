package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: X.0peQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1519760peQ<E> implements Iterable<E> {
    public final WeakHashMap<E, Object> LL = new WeakHashMap<>();
    public final Object LLILLJJLI = new Object();

    public final boolean isEmpty() {
        return this.LL.isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator<E> iterator() {
        ArrayList arrayList = new ArrayList(this.LL.size());
        for (E e : this.LL.keySet()) {
            if (e != null) {
                arrayList.add(e);
            }
        }
        return arrayList.iterator();
    }

    public final void LIZJ(E e) {
        if (e == null) {
            this.LL.size();
        } else {
            this.LL.put(e, this.LLILLJJLI);
        }
    }

    public final void LJ(E e) {
        if (e == null) {
            this.LL.size();
        } else {
            this.LL.remove(e);
        }
    }

    public final boolean contains(E e) {
        return this.LL.containsKey(e);
    }
}
