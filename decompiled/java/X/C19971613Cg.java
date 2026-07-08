package X;

import java.util.Iterator;

/* JADX INFO: renamed from: X.13Cg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19971613Cg<K, V> extends AbstractC19969413Bk<K> implements InterfaceC1664370tPf<K> {
    public final C19971313Cd<K, V> LLILLJJLI;

    @Override // X.AbstractC2253808sK
    public final int LIZJ() {
        return this.LLILLJJLI.size();
    }

    @Override // X.AbstractC19969413Bk, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<K> iterator() {
        final C19971213Cc<K, V> c19971213Cc = this.LLILLJJLI.LLILLJJLI;
        return new C13F0<K, V, K>(c19971213Cc) { // from class: X.13F7
            {
                C13F3[] c13f3Arr = new C13F3[8];
                int i = 0;
                do {
                    c13f3Arr[i] = new C13FB();
                    i++;
                } while (i < 8);
            }
        };
    }

    public C19971613Cg(C19971313Cd<K, V> c19971313Cd) {
        this.LLILLJJLI = c19971313Cd;
    }

    @Override // X.AbstractC2253808sK, java.util.Collection
    public final boolean contains(Object obj) {
        return this.LLILLJJLI.containsKey(obj);
    }
}
