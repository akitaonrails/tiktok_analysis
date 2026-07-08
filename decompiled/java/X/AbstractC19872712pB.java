package X;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.12pB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19872712pB<K, V> extends AbstractC19872412p8<K, V> implements Serializable {
    public static final long serialVersionUID = 0;
    public final transient AbstractC19870912ot<K, ? extends AbstractC19875812pg<V>> LLILZLL;
    public final transient int LLIZ;

    @Override // X.InterfaceC19873212pG
    public abstract AbstractC19875812pg<V> get(K k);

    public abstract AbstractC19872712pB<V, K> inverse();

    public static <K, V> C19873412pI<K, V> builder() {
        return new C19873412pI<>();
    }

    @Override // X.AbstractC19872612pA
    public final Map<K, Collection<V>> LIZ() {
        throw new AssertionError("should never be called");
    }

    @Override // X.AbstractC19872612pA
    public final Collection LIZIZ() {
        return new AbstractC19875812pg<Map.Entry<K, V>>(this) { // from class: X.12om
            public static final long serialVersionUID = 0;
            public final AbstractC19872712pB<K, V> LLILLJJLI;

            @Override // X.AbstractC19875812pg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final AbstractC19853312m3<Map.Entry<K, V>> iterator() {
                AbstractC19872712pB<K, V> abstractC19872712pB = this.LLILLJJLI;
                abstractC19872712pB.getClass();
                return new C19868612oW(abstractC19872712pB);
            }

            @Override // java.util.AbstractCollection, java.util.Collection
            public final int size() {
                return this.LLILLJJLI.size();
            }

            @Override // X.AbstractC19875812pg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final /* bridge */ /* synthetic */ Iterator iterator() {
                return iterator();
            }

            {
                this.LLILLJJLI = this;
            }

            @Override // X.AbstractC19875812pg, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(Object obj) {
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    return this.LLILLJJLI.containsEntry(entry.getKey(), entry.getValue());
                }
                return false;
            }
        };
    }

    @Override // X.AbstractC19872612pA
    public final Set<K> LIZJ() {
        throw new AssertionError("unreachable");
    }

    @Override // X.AbstractC19872612pA
    public final InterfaceC19879212qE LIZLLL() {
        return new AbstractC19878112q3<K>() { // from class: X.12pE
            @Override // X.AbstractC19875812pg
            public final boolean LJIIIZ() {
                return true;
            }

            @Override // X.AbstractC19878112q3, X.InterfaceC19879212qE
            public final AbstractC19875112pZ<K> elementSet() {
                return this.LLILZ.keySet();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, X.InterfaceC19879212qE
            public final int size() {
                return this.LLILZ.size();
            }

            @Override // X.AbstractC19878112q3, X.AbstractC19875812pg
            public Object writeReplace() {
                final AbstractC19872712pB abstractC19872712pB = this.LLILZ;
                return new Serializable(abstractC19872712pB) { // from class: X.12pR
                    public final AbstractC19872712pB<?, ?> LL;

                    public Object readResolve() {
                        return this.LL.keys();
                    }

                    {
                        this.LL = abstractC19872712pB;
                    }
                };
            }

            @Override // X.AbstractC19878112q3, X.InterfaceC19879212qE
            public final /* bridge */ /* synthetic */ Set elementSet() {
                return elementSet();
            }

            @Override // X.AbstractC19878112q3
            public final InterfaceC19878012q2<K> LJIIJJI(int i) {
                Map.Entry entry = (Map.Entry) this.LLILZ.LLILZLL.entrySet().asList().get(i);
                return new C19874812pW(((Collection) entry.getValue()).size(), entry.getKey());
            }

            @Override // X.AbstractC19878112q3, X.AbstractC19875812pg, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(Object obj) {
                return this.LLILZ.containsKey(obj);
            }

            @Override // X.AbstractC19878112q3, X.InterfaceC19879212qE
            public final int count(Object obj) {
                Collection collection = (Collection) this.LLILZ.LLILZLL.get(obj);
                if (collection == null) {
                    return 0;
                }
                return collection.size();
            }
        };
    }

    @Override // X.AbstractC19872612pA
    public final Collection LJ() {
        return new AbstractC19875812pg<V>(this) { // from class: X.12ol
            public static final long serialVersionUID = 0;
            public final transient AbstractC19872712pB<K, V> LLILLJJLI;

            @Override // X.AbstractC19875812pg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final AbstractC19853312m3<V> iterator() {
                AbstractC19872712pB<K, V> abstractC19872712pB = this.LLILLJJLI;
                abstractC19872712pB.getClass();
                return new C19868712oX(abstractC19872712pB);
            }

            @Override // java.util.AbstractCollection, java.util.Collection
            public final int size() {
                return this.LLILLJJLI.size();
            }

            @Override // X.AbstractC19875812pg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final /* bridge */ /* synthetic */ Iterator iterator() {
                return iterator();
            }

            {
                this.LLILLJJLI = this;
            }

            @Override // X.AbstractC19875812pg, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(Object obj) {
                return this.LLILLJJLI.containsValue(obj);
            }

            @Override // X.AbstractC19875812pg
            public final int LIZJ(int i, Object[] objArr) {
                AbstractC19853312m3<? extends AbstractC19875812pg<V>> it2 = this.LLILLJJLI.LLILZLL.values().iterator();
                while (it2.hasNext()) {
                    i = it2.next().LIZJ(i, objArr);
                }
                return i;
            }
        };
    }

    @Override // X.AbstractC19872612pA
    public final Iterator LJFF() {
        return new C19868612oW(this);
    }

    @Override // X.AbstractC19872612pA
    public final Iterator LJI() {
        return new C19868712oX(this);
    }

    @Override // X.InterfaceC19873212pG
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // X.AbstractC19872612pA, X.InterfaceC19873212pG
    public AbstractC19875112pZ<K> keySet() {
        return this.LLILZLL.keySet();
    }

    public static <K, V> AbstractC19872712pB<K, V> of() {
        return C19872812pC.of();
    }

    @Override // X.AbstractC19872612pA, X.InterfaceC19873212pG
    public AbstractC19875812pg<Map.Entry<K, V>> entries() {
        return (AbstractC19875812pg) super.entries();
    }

    @Override // X.AbstractC19872612pA
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // X.AbstractC19872612pA, X.InterfaceC19873212pG
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // X.AbstractC19872612pA
    public AbstractC19878112q3<K> keys() {
        return (AbstractC19878112q3) super.keys();
    }

    @Override // X.AbstractC19872612pA
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // X.AbstractC19872612pA
    public AbstractC19875812pg<V> values() {
        return (AbstractC19875812pg) super.values();
    }

    @Override // X.InterfaceC19873212pG
    public int size() {
        return this.LLIZ;
    }

    @Override // X.AbstractC19872612pA, X.InterfaceC19873212pG
    public AbstractC19870912ot<K, Collection<V>> asMap() {
        return this.LLILZLL;
    }

    public static <K, V> AbstractC19872712pB<K, V> copyOf(InterfaceC19873212pG<? extends K, ? extends V> interfaceC19873212pG) {
        if (interfaceC19873212pG instanceof AbstractC19872712pB) {
            AbstractC19872712pB<K, V> abstractC19872712pB = (AbstractC19872712pB) interfaceC19873212pG;
            if (!abstractC19872712pB.LLILZLL.LJ()) {
                return abstractC19872712pB;
            }
        }
        return C19872812pC.copyOf((InterfaceC19873212pG) interfaceC19873212pG);
    }

    @Override // X.InterfaceC19873212pG
    public boolean containsKey(Object obj) {
        return this.LLILZLL.containsKey(obj);
    }

    @Override // X.AbstractC19872612pA
    public boolean containsValue(Object obj) {
        if (obj != null && super.containsValue(obj)) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC19872612pA
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // X.AbstractC19872612pA
    public final boolean putAll(InterfaceC19873212pG<? extends K, ? extends V> interfaceC19873212pG) {
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC19873212pG
    public AbstractC19875812pg<V> removeAll(Object obj) {
        throw new UnsupportedOperationException();
    }

    public static <K, V> AbstractC19872712pB<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return C19872812pC.copyOf((Iterable) iterable);
    }

    public AbstractC19872712pB(AbstractC19870912ot<K, ? extends AbstractC19875812pg<V>> abstractC19870912ot, int i) {
        this.LLILZLL = abstractC19870912ot;
        this.LLIZ = i;
    }

    public static <K, V> AbstractC19872712pB<K, V> of(K k, V v) {
        return C19872812pC.of((Object) k, (Object) v);
    }

    @Override // X.AbstractC19872612pA, X.InterfaceC19873212pG
    public /* bridge */ /* synthetic */ boolean containsEntry(Object obj, Object obj2) {
        return super.containsEntry(obj, obj2);
    }

    @Override // X.AbstractC19872612pA, X.InterfaceC19873212pG
    public final boolean put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // X.AbstractC19872612pA
    public final boolean putAll(K k, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override // X.AbstractC19872612pA, X.InterfaceC19873212pG
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // X.AbstractC19872612pA
    public AbstractC19875812pg<V> replaceValues(K k, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    public static <K, V> AbstractC19872712pB<K, V> of(K k, V v, K k2, V v2) {
        return C19872812pC.of((Object) k, (Object) v, (Object) k2, (Object) v2);
    }

    public static <K, V> AbstractC19872712pB<K, V> of(K k, V v, K k2, V v2, K k3, V v3) {
        return C19872812pC.of((Object) k, (Object) v, (Object) k2, (Object) v2, (Object) k3, (Object) v3);
    }

    public static <K, V> AbstractC19872712pB<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        return C19872812pC.of((Object) k, (Object) v, (Object) k2, (Object) v2, (Object) k3, (Object) v3, (Object) k4, (Object) v4);
    }

    public static <K, V> AbstractC19872712pB<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        return C19872812pC.of((Object) k, (Object) v, (Object) k2, (Object) v2, (Object) k3, (Object) v3, (Object) k4, (Object) v4, (Object) k5, (Object) v5);
    }
}
