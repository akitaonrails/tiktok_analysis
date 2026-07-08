package X;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.135B, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public class C135B<K, V> extends WeakReference<K> implements InterfaceC199564136k<K, V> {
    public final int LL;
    public final InterfaceC199564136k<K, V> LLILLJJLI;
    public volatile C135A<K, V> LLILLL;

    @Override // X.InterfaceC199564136k
    public InterfaceC199564136k<K, V> LJFF() {
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC199564136k
    public InterfaceC199564136k<K, V> LJI() {
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC199564136k
    public long LJII() {
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC199564136k
    public InterfaceC199564136k<K, V> LJIIJ() {
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC199564136k
    public InterfaceC199564136k<K, V> LJIIL() {
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC199564136k
    public long LJIILJJIL() {
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC199564136k
    public final K getKey() {
        return get();
    }

    @Override // X.InterfaceC199564136k
    public final C135A<K, V> LIZJ() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC199564136k
    public final int getHash() {
        return this.LL;
    }

    @Override // X.InterfaceC199564136k
    public final InterfaceC199564136k<K, V> getNext() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC199564136k
    public void LJIIIZ(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC199564136k
    public void LJIIJJI(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC199564136k
    public final void LJIILL(C135A<K, V> c135a) {
        this.LLILLL = c135a;
    }

    @Override // X.InterfaceC199564136k
    public void LJIILLIIL(InterfaceC199564136k<K, V> interfaceC199564136k) {
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC199564136k
    public void LJIIZILJ(InterfaceC199564136k<K, V> interfaceC199564136k) {
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC199564136k
    public void LJIJ(InterfaceC199564136k<K, V> interfaceC199564136k) {
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC199564136k
    public void LJIJI(InterfaceC199564136k<K, V> interfaceC199564136k) {
        throw new UnsupportedOperationException();
    }

    public C135B(int i, InterfaceC199564136k interfaceC199564136k, Object obj, ReferenceQueue referenceQueue) {
        super(obj, referenceQueue);
        this.LLILLL = ConcurrentMapC199594137o.LLJJJJJIL;
        this.LL = i;
        this.LLILLJJLI = interfaceC199564136k;
    }
}
