package X;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: X.12vM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19911012vM extends AbstractSet {
    public final /* synthetic */ C19910112vD LL;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.LL.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        final C19910112vD c19910112vD = this.LL;
        return new Iterator(c19910112vD) { // from class: X.12vL
            public int LL;
            public boolean LLILLJJLI;
            public Iterator LLILLL;
            public final /* synthetic */ C19910112vD LLILZ;

            @Override // java.util.Iterator
            public final /* bridge */ /* synthetic */ Object next() {
                this.LLILLJJLI = true;
                int i = this.LL + 1;
                this.LL = i;
                C19910112vD c19910112vD2 = this.LLILZ;
                return i < c19910112vD2.LLILLJJLI ? c19910112vD2.LL[i] : LIZ().next();
            }

            public final Iterator LIZ() {
                if (this.LLILLL == null) {
                    this.LLILLL = this.LLILZ.LLILLL.entrySet().iterator();
                }
                return this.LLILLL;
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                int i = this.LL + 1;
                C19910112vD c19910112vD2 = this.LLILZ;
                if (i >= c19910112vD2.LLILLJJLI) {
                    return !c19910112vD2.LLILLL.isEmpty() && LIZ().hasNext();
                }
                return true;
            }

            @Override // java.util.Iterator
            public final void remove() {
                if (!this.LLILLJJLI) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.LLILLJJLI = false;
                C19910112vD c19910112vD2 = this.LLILZ;
                c19910112vD2.LJII();
                int i = this.LL;
                if (i >= c19910112vD2.LLILLJJLI) {
                    LIZ().remove();
                } else {
                    this.LL = i - 1;
                    c19910112vD2.LJFF(i);
                }
            }

            {
                Objects.requireNonNull(c19910112vD);
                this.LLILZ = c19910112vD;
                this.LL = -1;
            }
        };
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.LL.size();
    }

    public /* synthetic */ C19911012vM(C19910112vD c19910112vD) {
        Objects.requireNonNull(c19910112vD);
        this.LL = c19910112vD;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            this.LL.LIZJ((Comparable) entry.getKey(), entry.getValue());
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.LL.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 == value) {
            return true;
        }
        if (obj2 != null && obj2.equals(value)) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            this.LL.remove(entry.getKey());
            return true;
        }
        return false;
    }
}
