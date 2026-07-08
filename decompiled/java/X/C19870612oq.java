package X;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: X.12oq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19870612oq<K, V> extends AbstractC19875812pg<V> {
    public final AbstractC19870912ot<K, V> LLILLJJLI;

    @Override // X.AbstractC19875812pg
    public final AbstractC19875512pd<V> asList() {
        final AbstractC19875512pd<Map.Entry<K, V>> abstractC19875512pdAsList = this.LLILLJJLI.entrySet().asList();
        return new AbstractC19875512pd<V>() { // from class: X.12or
            @Override // X.AbstractC19875812pg
            public final boolean LJIIIZ() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return abstractC19875512pdAsList.size();
            }

            @Override // java.util.List
            public final V get(int i) {
                return (V) ((Map.Entry) abstractC19875512pdAsList.get(i)).getValue();
            }
        };
    }

    @Override // X.AbstractC19875812pg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final AbstractC19853312m3<V> iterator() {
        return new C19870512op(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.LLILLJJLI.size();
    }

    @Override // X.AbstractC19875812pg
    public Object writeReplace() {
        final AbstractC19870912ot<K, V> abstractC19870912ot = this.LLILLJJLI;
        return new Serializable(abstractC19870912ot) { // from class: X.12os
            public static final long serialVersionUID = 0;
            public final AbstractC19870912ot<?, V> LL;

            public Object readResolve() {
                return this.LL.values();
            }

            {
                this.LL = abstractC19870912ot;
            }
        };
    }

    @Override // X.AbstractC19875812pg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C19870512op(this);
    }

    public C19870612oq(AbstractC19870912ot<K, V> abstractC19870912ot) {
        this.LLILLJJLI = abstractC19870912ot;
    }

    @Override // X.AbstractC19875812pg, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        C19870512op c19870512op = new C19870512op(this);
        while (c19870512op.hasNext()) {
            if (obj.equals(c19870512op.next())) {
                return true;
            }
        }
        return false;
    }
}
