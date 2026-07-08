package X;

import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.11T0, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public abstract class C11T0<K, V> implements InterfaceC19505311Sx<K, V> {
    public final C01GW LIZ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1068));

    public abstract List<V> LIZ(K k);

    public abstract List<Pair<K, List<V>>> LJ();

    public abstract void LJFF(K k, List<? extends V> list);

    @Override // X.InterfaceC19505311Sx
    public final C11K9 getAll() {
        return C11NZ.LJJJJZ(LJ());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC19505311Sx
    public final C11K9 get(Object obj) {
        return C11NZ.LJJJJZ(C1641650sp1.LIZ(LIZ(obj)));
    }

    @Override // X.InterfaceC19505311Sx
    public final void LIZJ(K k, List<? extends V> list) {
        InterfaceC19503911Sj interfaceC19503911Sj;
        Object objLIZ;
        LJFF(k, list);
        InterfaceC19505211Sw interfaceC19505211Sw = (InterfaceC19505211Sw) this.LIZ.getValue();
        if ((interfaceC19505211Sw instanceof InterfaceC19503911Sj) && (interfaceC19503911Sj = (InterfaceC19503911Sj) interfaceC19505211Sw) != null) {
            Map<InterfaceC1305030k45<?>, Map<?, InterfaceC19504011Sk<?>>> map = C1323150kXJ.LIZ;
            if (map.get(this) != null && map.get(this).get(k) != null) {
                objLIZ = map.get(this).get(k).LIZIZ(new Pair(k, list));
            } else {
                objLIZ = C1305020k44.LIZ(new Pair(k, list));
            }
            interfaceC19503911Sj.LIZJ(objLIZ);
        }
    }
}
