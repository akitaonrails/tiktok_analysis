package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0pLS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1508000pLS extends ArrayList<C1507980pLQ> {
    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(C1507980pLQ c1507980pLQ) {
        Iterator<C1507980pLQ> it2 = iterator();
        int i = 0;
        while (true) {
            if (it2.hasNext()) {
                if (it2.next().LIZ.LIZLLL > c1507980pLQ.LIZ.LIZLLL) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        long j = c1507980pLQ.LIZ.LJIILJJIL;
        if (j > 0) {
            c1507980pLQ.LJFF = j;
        } else {
            c1507980pLQ.LJFF = System.currentTimeMillis();
        }
        c1507980pLQ.LIZIZ(2, null);
        if (i >= 0) {
            add(i, c1507980pLQ);
            return true;
        }
        super.add(c1507980pLQ);
        return true;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends C1507980pLQ> collection) {
        Iterator<T> it2 = collection.iterator();
        while (it2.hasNext()) {
            add((C1507980pLQ) it2.next());
        }
        return true;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof C1507980pLQ)) {
            return false;
        }
        return contains((C1507980pLQ) obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof C1507980pLQ)) {
            return -1;
        }
        return indexOf((C1507980pLQ) obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof C1507980pLQ)) {
            return -1;
        }
        return lastIndexOf((C1507980pLQ) obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof C1507980pLQ)) {
            return false;
        }
        return remove((C1507980pLQ) obj);
    }

    public /* bridge */ C1507980pLQ removeAt(int i) {
        return remove(i);
    }

    public /* bridge */ boolean contains(C1507980pLQ c1507980pLQ) {
        return super.contains((Object) c1507980pLQ);
    }

    public /* bridge */ int indexOf(C1507980pLQ c1507980pLQ) {
        return super.indexOf((Object) c1507980pLQ);
    }

    public /* bridge */ int lastIndexOf(C1507980pLQ c1507980pLQ) {
        return super.lastIndexOf((Object) c1507980pLQ);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ C1507980pLQ remove(int i) {
        return removeAt(i);
    }

    public /* bridge */ boolean remove(C1507980pLQ c1507980pLQ) {
        return super.remove((Object) c1507980pLQ);
    }
}
