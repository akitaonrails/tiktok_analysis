package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.13FZ, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13FZ<K, V> extends AbstractC19985113Hl<K, V, Map<K, ? extends V>, LinkedHashMap<K, V>> {
    public final C19978813Fa LIZJ;

    @Override // X.AbstractC19985413Ho
    public final Object LIZ() {
        return new LinkedHashMap();
    }

    @Override // X.AbstractC19985113Hl, X.C13HG, X.InterfaceC19984413He, X.InterfaceC19984213Hc
    public final InterfaceC19983313Gt getDescriptor() {
        return this.LIZJ;
    }

    @Override // X.AbstractC19985413Ho
    public final int LIZIZ(Object obj) {
        return ((HashMap) obj).size() * 2;
    }

    @Override // X.AbstractC19985413Ho
    public final Iterator LIZJ(Object obj) {
        return ((Map) obj).entrySet().iterator();
    }

    @Override // X.AbstractC19985413Ho
    public final int LIZLLL(Object obj) {
        return ((Map) obj).size();
    }

    @Override // X.AbstractC19985413Ho
    public final Object LJI(Object obj) {
        return new LinkedHashMap((Map) null);
    }

    @Override // X.AbstractC19985413Ho
    public final Object LJII(Object obj) {
        return obj;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.13Fa] */
    public C13FZ(C13HG<K> c13hg, C13HG<V> c13hg2) {
        super(c13hg, c13hg2);
        final InterfaceC19983313Gt descriptor = c13hg.getDescriptor();
        final InterfaceC19983313Gt descriptor2 = c13hg2.getDescriptor();
        this.LIZJ = new AbstractC19978913Fb(descriptor, descriptor2) { // from class: X.13Fa
        };
    }
}
