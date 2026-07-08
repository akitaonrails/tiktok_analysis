package X;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: X.12oj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19869912oj<K, V> extends AbstractC19875112pZ<Map.Entry<K, V>> {
    public final transient AbstractC19870912ot<K, V> LLILLL;
    public final transient Object[] LLILZ;
    public final transient int LLILZIL = 0;
    public final transient int LLILZLL;

    @Override // X.AbstractC19875812pg
    public final boolean LJIIIZ() {
        return true;
    }

    @Override // X.AbstractC19875112pZ
    public final AbstractC19875512pd<Map.Entry<K, V>> LJIIJJI() {
        return new AbstractC19875512pd<Map.Entry<K, V>>() { // from class: X.12ok
            @Override // X.AbstractC19875812pg
            public final boolean LJIIIZ() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return this.LLILLL.LLILZLL;
            }

            @Override // java.util.List
            public final Object get(int i) {
                C19864312np.LJFF(i, this.LLILLL.LLILZLL);
                C19869912oj c19869912oj = this.LLILLL;
                int i2 = i * 2;
                Object obj = c19869912oj.LLILZ[c19869912oj.LLILZIL + i2];
                Objects.requireNonNull(obj);
                C19869912oj c19869912oj2 = this.LLILLL;
                Object obj2 = c19869912oj2.LLILZ[i2 + (c19869912oj2.LLILZIL ^ 1)];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
        };
    }

    @Override // X.AbstractC19875112pZ, X.AbstractC19875812pg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final AbstractC19853312m3<Map.Entry<K, V>> iterator() {
        return asList().iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.LLILZLL;
    }

    @Override // X.AbstractC19875112pZ, X.AbstractC19875812pg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // X.AbstractC19875812pg, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        if (value == null || !value.equals(this.LLILLL.get(key))) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC19875812pg
    public final int LIZJ(int i, Object[] objArr) {
        return asList().LIZJ(i, objArr);
    }

    public C19869912oj(AbstractC19870912ot abstractC19870912ot, Object[] objArr, int i) {
        this.LLILLL = abstractC19870912ot;
        this.LLILZ = objArr;
        this.LLILZLL = i;
    }
}
