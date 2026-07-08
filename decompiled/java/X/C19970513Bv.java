package X;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: X.13Bv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19970513Bv<K, V> extends AbstractC19969413Bk<Map.Entry<? extends K, ? extends V>> implements InterfaceC1664410tPj<Map.Entry<? extends K, ? extends V>> {
    public final C13C4<K, V> LLILLJJLI;

    @Override // X.AbstractC2253808sK
    public final int LIZJ() {
        return this.LLILLJJLI.LJ();
    }

    @Override // X.AbstractC19969413Bk, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new C13C9(this.LLILLJJLI);
    }

    public C19970513Bv(C13C4<K, V> c13c4) {
        this.LLILLJJLI = c13c4;
    }

    @Override // X.AbstractC2253808sK, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return C219800t2.LIZ(this.LLILLJJLI, (Map.Entry) obj);
    }
}
