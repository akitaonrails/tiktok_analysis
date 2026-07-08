package X;

import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.11T1, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public abstract class C11T1<K, V> implements InterfaceC19505411Sy<K, V> {
    public final C01GW LIZ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1067));

    public abstract V LIZ(K k);

    public abstract List<Pair<K, V>> LJ();

    public abstract void LJFF(K k, V v);

    @Override // X.InterfaceC19505411Sy
    public final C11K9 getAll() {
        return C11NZ.LJJJJZ(LJ());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC19505411Sy
    public final C11K9 get(Object obj) {
        return C11NZ.LJJJJZ(C1641650sp1.LIZ(LIZ(obj)));
    }

    @Override // X.InterfaceC19505411Sy
    public final void put(K k, V v) {
        InterfaceC19503911Sj interfaceC19503911Sj;
        InterfaceC19504011Sk<?> interfaceC19504011SkLIZ;
        LJFF(k, v);
        InterfaceC19505211Sw interfaceC19505211SwLIZ = C11T2.LIZ(this);
        if ((interfaceC19505211SwLIZ instanceof InterfaceC19503911Sj) && (interfaceC19503911Sj = (InterfaceC19503911Sj) interfaceC19505211SwLIZ) != null) {
            Map<InterfaceC1305030k45<?>, Map<?, InterfaceC19504011Sk<?>>> map = C1323150kXJ.LIZ;
            if (map.get(this) != null && map.get(this).get(k) != null) {
                interfaceC19504011SkLIZ = map.get(this).get(k);
            } else {
                interfaceC19504011SkLIZ = C1305020k44.LIZ(new Pair(k, v));
            }
            interfaceC19503911Sj.LIZJ(interfaceC19504011SkLIZ);
        }
    }
}
