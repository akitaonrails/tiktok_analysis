package X;

import a75.c;

/* JADX INFO: renamed from: X.138p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C199621138p<K, V> extends AbstractC199629138x<K, V> {
    public final K LL;
    public final int LLILLJJLI;
    public final InterfaceC199613138h<K, V> LLILLL;
    public volatile InterfaceC199612138g<K, V> LLILZ = c.LLJJIJIL;

    @Override // X.AbstractC199629138x, X.InterfaceC199613138h
    public final InterfaceC199612138g<K, V> LIZJ() {
        return this.LLILZ;
    }

    @Override // X.AbstractC199629138x, X.InterfaceC199613138h
    public final int getHash() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC199629138x, X.InterfaceC199613138h
    public final K getKey() {
        return this.LL;
    }

    @Override // X.AbstractC199629138x, X.InterfaceC199613138h
    public final InterfaceC199613138h<K, V> getNext() {
        return this.LLILLL;
    }

    @Override // X.AbstractC199629138x, X.InterfaceC199613138h
    public final void LJIILL(InterfaceC199612138g<K, V> interfaceC199612138g) {
        this.LLILZ = interfaceC199612138g;
    }

    public C199621138p(K k, int i, InterfaceC199613138h<K, V> interfaceC199613138h) {
        this.LL = k;
        this.LLILLJJLI = i;
        this.LLILLL = interfaceC199613138h;
    }
}
