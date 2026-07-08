package X;

import java.util.Iterator;

/* JADX INFO: renamed from: X.13Bx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19970713Bx<K, V> extends AbstractC19969413Bk<K> implements InterfaceC1664410tPj<K> {
    public final C13C5<K, V> LLILLJJLI;

    @Override // X.AbstractC2253808sK
    public final int LIZJ() {
        return this.LLILLJJLI.LJ();
    }

    @Override // X.AbstractC19969413Bk, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<K> iterator() {
        final C13CU<K, V> c13cu = this.LLILLJJLI.LLILLJJLI;
        return new AbstractC19977513En<K, V, K>(c13cu) { // from class: X.13Et
            {
                AbstractC19977713Ep[] abstractC19977713EpArr = new AbstractC19977713Ep[8];
                int i = 0;
                do {
                    abstractC19977713EpArr[i] = new C19978513Ex();
                    i++;
                } while (i < 8);
            }
        };
    }

    public C19970713Bx(C13C5<K, V> c13c5) {
        this.LLILLJJLI = c13c5;
    }

    @Override // X.AbstractC2253808sK, java.util.Collection
    public final boolean contains(Object obj) {
        return this.LLILLJJLI.containsKey(obj);
    }
}
