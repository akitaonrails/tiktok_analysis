package X;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13Cf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19971513Cf<K, V> extends AbstractC19969413Bk<Map.Entry<? extends K, ? extends V>> implements InterfaceC1664370tPf<Map.Entry<? extends K, ? extends V>> {
    public final C19971313Cd<K, V> LLILLJJLI;

    @Override // X.AbstractC2253808sK
    public final int LIZJ() {
        return this.LLILLJJLI.size();
    }

    @Override // X.AbstractC19969413Bk, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        final C19971213Cc<K, V> c19971213Cc = this.LLILLJJLI.LLILLJJLI;
        return new C13F0<K, V, Map.Entry<? extends K, ? extends V>>(c19971213Cc) { // from class: X.13F5
            {
                C13F3[] c13f3Arr = new C13F3[8];
                int i = 0;
                do {
                    c13f3Arr[i] = new C13F3<K, V, Map.Entry<? extends K, ? extends V>>() { // from class: X.13F6
                        @Override // java.util.Iterator
                        public final Object next() {
                            int i2 = this.LLILLL + 2;
                            this.LLILLL = i2;
                            Object[] objArr = this.LL;
                            return new C11U2(objArr[i2 - 2], objArr[i2 - 1]);
                        }
                    };
                    i++;
                } while (i < 8);
            }
        };
    }

    public C19971513Cf(C19971313Cd<K, V> c19971313Cd) {
        this.LLILLJJLI = c19971313Cd;
    }

    @Override // X.AbstractC2253808sK, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!(entry instanceof Map.Entry)) {
            return false;
        }
        V v = this.LLILLJJLI.get(entry.getKey());
        if (v != null) {
            return Intrinsics.LJFF(v, entry.getValue());
        }
        if (entry.getValue() != null || !this.LLILLJJLI.containsKey(entry.getKey())) {
            return false;
        }
        return true;
    }
}
