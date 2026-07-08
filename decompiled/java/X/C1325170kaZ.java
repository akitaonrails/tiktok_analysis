package X;

/* JADX INFO: renamed from: X.0kaZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1325170kaZ<K, V> implements InterfaceC1325150kaX<K, V> {
    public final InterfaceC1325150kaX<K, V> LL;
    public final InterfaceC1325180kaa LLILLJJLI;

    @Override // X.InterfaceC1325150kaX
    public final int LIZIZ(InterfaceC1325100kaS<K> interfaceC1325100kaS) {
        return this.LL.LIZIZ(interfaceC1325100kaS);
    }

    @Override // X.InterfaceC1325150kaX
    public final boolean LIZLLL(InterfaceC1325100kaS<K> interfaceC1325100kaS) {
        return this.LL.LIZLLL(interfaceC1325100kaS);
    }

    @Override // X.InterfaceC1325150kaX
    public final C1323050kX9<V> get(K k) {
        C1323050kX9<V> c1323050kX9 = this.LL.get(k);
        if (c1323050kX9 == null) {
            this.LLILLJJLI.LIZ();
            return c1323050kX9;
        }
        this.LLILLJJLI.LIZIZ(k);
        V v = c1323050kX9.get();
        if (v instanceof C1325120kaU) {
            ((InterfaceC1325190kab) v).hitBitmapMemoryCache();
            return c1323050kX9;
        }
        ((InterfaceC1325190kab) v).hitEncodeMemoryCache();
        return c1323050kX9;
    }

    public C1325170kaZ(InterfaceC1325150kaX<K, V> interfaceC1325150kaX, InterfaceC1325180kaa interfaceC1325180kaa) {
        this.LL = interfaceC1325150kaX;
        this.LLILLJJLI = interfaceC1325180kaa;
    }

    @Override // X.InterfaceC1325150kaX
    public final C1323050kX9 LJ(InterfaceC1324680kZm interfaceC1324680kZm, C1323050kX9 c1323050kX9) {
        this.LLILLJJLI.LIZJ();
        return this.LL.LJ(interfaceC1324680kZm, c1323050kX9);
    }
}
