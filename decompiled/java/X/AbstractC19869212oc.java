package X;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.12oc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19869212oc<K, V> extends AbstractC19870912ot<K, V> {
    public abstract AbstractC19853312m3<Map.Entry<K, V>> LJFF();

    @Override // X.AbstractC19870912ot
    public final AbstractC19875112pZ<Map.Entry<K, V>> LIZ() {
        return new AbstractC19868912oZ<K, V>() { // from class: X.12ob
            @Override // X.AbstractC19868912oZ, X.AbstractC19875112pZ, X.AbstractC19875812pg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final AbstractC19853312m3<Map.Entry<K, V>> iterator() {
                return this.LLILLL.LJFF();
            }

            @Override // X.AbstractC19868912oZ
            public final AbstractC19869212oc LJIILIIL() {
                return this.LLILLL;
            }
        };
    }

    @Override // X.AbstractC19870912ot
    public AbstractC19875112pZ<K> LIZIZ() {
        return new AbstractC19869612og<K>(this) { // from class: X.12od
            public final AbstractC19870912ot<K, V> LLILLL;

            @Override // X.AbstractC19875812pg
            public final boolean LJIIIZ() {
                return true;
            }

            @Override // X.AbstractC19869612og, X.AbstractC19875112pZ, X.AbstractC19875812pg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final AbstractC19853312m3<K> iterator() {
                final AbstractC19853312m3<Map.Entry<K, V>> it2 = this.LLILLL.entrySet().iterator();
                return (AbstractC19853312m3<K>) new AbstractC19853312m3<Object>() { // from class: X.12m1
                    @Override // java.util.Iterator
                    public final boolean hasNext() {
                        return it2.hasNext();
                    }

                    @Override // java.util.Iterator
                    public final Object next() {
                        return ((Map.Entry) it2.next()).getKey();
                    }
                };
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final int size() {
                return this.LLILLL.size();
            }

            @Override // X.AbstractC19875112pZ, X.AbstractC19875812pg
            public Object writeReplace() {
                final AbstractC19870912ot<K, V> abstractC19870912ot = this.LLILLL;
                return new Serializable(abstractC19870912ot) { // from class: X.12oe
                    public static final long serialVersionUID = 0;
                    public final AbstractC19870912ot<K, ?> LL;

                    public Object readResolve() {
                        return this.LL.keySet();
                    }

                    {
                        this.LL = abstractC19870912ot;
                    }
                };
            }

            @Override // X.AbstractC19869612og, X.AbstractC19875112pZ, X.AbstractC19875812pg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final /* bridge */ /* synthetic */ Iterator iterator() {
                return iterator();
            }

            {
                this.LLILLL = this;
            }

            @Override // X.AbstractC19875812pg, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(Object obj) {
                return this.LLILLL.containsKey(obj);
            }

            @Override // X.AbstractC19869612og
            public final K get(int i) {
                return this.LLILLL.entrySet().asList().get(i).getKey();
            }
        };
    }

    @Override // X.AbstractC19870912ot
    public final AbstractC19875812pg<V> LIZJ() {
        return new C19870612oq(this);
    }

    @Override // X.AbstractC19870912ot, java.util.Map
    public final /* bridge */ /* synthetic */ Set entrySet() {
        return entrySet();
    }

    @Override // X.AbstractC19870912ot, java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        return keySet();
    }

    @Override // X.AbstractC19870912ot, java.util.Map
    public final /* bridge */ /* synthetic */ Collection values() {
        return values();
    }
}
