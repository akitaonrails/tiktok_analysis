package X;

/* JADX INFO: renamed from: X.135F, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public class C135F<K, V> extends C135E<K, V> {
    public final K LL;
    public final int LLILLJJLI;
    public final InterfaceC199564136k<K, V> LLILLL;
    public volatile C135A<K, V> LLILZ = ConcurrentMapC199594137o.LLJJJJJIL;

    @Override // X.C135E, X.InterfaceC199564136k
    public final C135A<K, V> LIZJ() {
        return this.LLILZ;
    }

    @Override // X.C135E, X.InterfaceC199564136k
    public final int getHash() {
        return this.LLILLJJLI;
    }

    @Override // X.C135E, X.InterfaceC199564136k
    public final K getKey() {
        return this.LL;
    }

    @Override // X.C135E, X.InterfaceC199564136k
    public final InterfaceC199564136k<K, V> getNext() {
        return this.LLILLL;
    }

    @Override // X.C135E, X.InterfaceC199564136k
    public final void LJIILL(C135A<K, V> c135a) {
        this.LLILZ = c135a;
    }

    public C135F(K k, int i, InterfaceC199564136k<K, V> interfaceC199564136k) {
        this.LL = k;
        this.LLILLJJLI = i;
        this.LLILLL = interfaceC199564136k;
    }
}
