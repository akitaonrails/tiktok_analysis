package X;

import a75.c;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.138f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C199611138f<K, V> extends WeakReference<K> implements InterfaceC199613138h<K, V> {
    public final int LL;
    public final InterfaceC199613138h<K, V> LLILLJJLI;
    public volatile InterfaceC199612138g<K, V> LLILLL;

    @Override // X.InterfaceC199613138h
    public InterfaceC199613138h<K, V> LJFF() {
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC199613138h
    public InterfaceC199613138h<K, V> LJI() {
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC199613138h
    public long LJII() {
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC199613138h
    public InterfaceC199613138h<K, V> LJIIJ() {
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC199613138h
    public InterfaceC199613138h<K, V> LJIIL() {
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC199613138h
    public long LJIILJJIL() {
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC199613138h
    public final K getKey() {
        return get();
    }

    @Override // X.InterfaceC199613138h
    public final InterfaceC199612138g<K, V> LIZJ() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC199613138h
    public final int getHash() {
        return this.LL;
    }

    @Override // X.InterfaceC199613138h
    public final InterfaceC199613138h<K, V> getNext() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC199613138h
    public void LJIIIZ(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC199613138h
    public void LJIIJJI(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC199613138h
    public final void LJIILL(InterfaceC199612138g<K, V> interfaceC199612138g) {
        this.LLILLL = interfaceC199612138g;
    }

    @Override // X.InterfaceC199613138h
    public void LJIILLIIL(InterfaceC199613138h<K, V> interfaceC199613138h) {
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC199613138h
    public void LJIIZILJ(InterfaceC199613138h<K, V> interfaceC199613138h) {
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC199613138h
    public void LJIJ(InterfaceC199613138h<K, V> interfaceC199613138h) {
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC199613138h
    public void LJIJI(InterfaceC199613138h<K, V> interfaceC199613138h) {
        throw new UnsupportedOperationException();
    }

    public C199611138f(int i, InterfaceC199613138h interfaceC199613138h, Object obj, ReferenceQueue referenceQueue) {
        super(obj, referenceQueue);
        this.LLILLL = c.LLJJIJIL;
        this.LL = i;
        this.LLILLJJLI = interfaceC199613138h;
    }
}
