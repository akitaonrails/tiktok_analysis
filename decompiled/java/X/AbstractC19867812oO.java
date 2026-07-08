package X;

import X.AbstractC19872012p4;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.12oO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19867812oO<K, V> extends AbstractMap<K, V> {
    public transient C19867512oL LL;
    public transient C19868012oQ LLILLJJLI;

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        C19867512oL c19867512oL = this.LL;
        if (c19867512oL != null) {
            return c19867512oL;
        }
        C19867512oL c19867512oL2 = new C19867512oL((AbstractC19872012p4.c) this);
        this.LL = c19867512oL2;
        return c19867512oL2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        C19868012oQ c19868012oQ = this.LLILLJJLI;
        if (c19868012oQ != null) {
            return c19868012oQ;
        }
        AbstractCollection<V> abstractCollection = new AbstractCollection<V>(this) { // from class: X.12oQ
            public final Map<K, V> LL;

            @Override // java.util.AbstractCollection, java.util.Collection
            public final void clear() {
                this.LL.clear();
            }

            @Override // java.util.AbstractCollection, java.util.Collection
            public final boolean isEmpty() {
                return this.LL.isEmpty();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
            public final Iterator<V> iterator() {
                return new C19873912pN(this.LL.entrySet().iterator());
            }

            @Override // java.util.AbstractCollection, java.util.Collection
            public final int size() {
                return this.LL.size();
            }

            {
                this.getClass();
                this.LL = this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection
            public final boolean contains(Object obj) {
                return this.LL.containsValue(obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection
            public final boolean remove(Object obj) {
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException e) {
                    TryCatchGuardChecker.doCheck(e);
                    for (Map.Entry<K, V> entry : this.LL.entrySet()) {
                        if (C19837412jU.LIZ(obj, entry.getValue())) {
                            this.LL.remove(entry.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            }

            @Override // java.util.AbstractCollection, java.util.Collection
            public final boolean removeAll(Collection<?> collection) {
                collection.getClass();
                try {
                    return super.removeAll(collection);
                } catch (UnsupportedOperationException e) {
                    TryCatchGuardChecker.doCheck(e);
                    HashSet hashSet = new HashSet();
                    for (Map.Entry<K, V> entry : this.LL.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return this.LL.keySet().removeAll(hashSet);
                }
            }

            @Override // java.util.AbstractCollection, java.util.Collection
            public final boolean retainAll(Collection<?> collection) {
                collection.getClass();
                try {
                    return super.retainAll(collection);
                } catch (UnsupportedOperationException e) {
                    TryCatchGuardChecker.doCheck(e);
                    HashSet hashSet = new HashSet();
                    for (Map.Entry<K, V> entry : this.LL.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return this.LL.keySet().retainAll(hashSet);
                }
            }
        };
        this.LLILLJJLI = abstractCollection;
        return abstractCollection;
    }
}
