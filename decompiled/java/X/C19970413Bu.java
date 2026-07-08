package X;

import java.util.Iterator;

/* JADX INFO: renamed from: X.13Bu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19970413Bu<K, V> extends AbstractC19969413Bk<K> implements InterfaceC1664410tPj<K> {
    public final C13C4<K, V> LLILLJJLI;

    @Override // X.AbstractC2253808sK
    public final int LIZJ() {
        return this.LLILLJJLI.LJ();
    }

    @Override // X.AbstractC19969413Bk, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<K> iterator() {
        return new C13CB(this.LLILLJJLI);
    }

    public C19970413Bu(C13C4<K, V> c13c4) {
        this.LLILLJJLI = c13c4;
    }

    @Override // X.AbstractC2253808sK, java.util.Collection
    public final boolean contains(Object obj) {
        return this.LLILLJJLI.containsKey(obj);
    }
}
