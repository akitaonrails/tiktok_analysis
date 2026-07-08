package X;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: X.13Bw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19970613Bw<K, V> extends AbstractC19969413Bk<Map.Entry<? extends K, ? extends V>> implements InterfaceC1664410tPj<Map.Entry<? extends K, ? extends V>> {
    public final C13C5<K, V> LLILLJJLI;

    @Override // X.AbstractC2253808sK
    public final int LIZJ() {
        return this.LLILLJJLI.LJ();
    }

    @Override // X.AbstractC19969413Bk, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        final C13CU<K, V> c13cu = this.LLILLJJLI.LLILLJJLI;
        return new AbstractC19977513En<K, V, Map.Entry<? extends K, ? extends V>>(c13cu) { // from class: X.13Er
            {
                AbstractC19977713Ep[] abstractC19977713EpArr = new AbstractC19977713Ep[8];
                int i = 0;
                do {
                    abstractC19977713EpArr[i] = new AbstractC19977713Ep<K, V, Map.Entry<? extends K, ? extends V>>() { // from class: X.13Es
                        @Override // java.util.Iterator
                        public final Object next() {
                            int i2 = this.LLILLL + 2;
                            this.LLILLL = i2;
                            Object[] objArr = this.LL;
                            return new C11U4(objArr[i2 - 2], objArr[i2 - 1]);
                        }
                    };
                    i++;
                } while (i < 8);
            }
        };
    }

    public C19970613Bw(C13C5<K, V> c13c5) {
        this.LLILLJJLI = c13c5;
    }

    @Override // X.AbstractC2253808sK, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return C219800t2.LIZ(this.LLILLJJLI, (Map.Entry) obj);
    }
}
