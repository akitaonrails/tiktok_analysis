package X;

import X.InterfaceC385700FAi;
import Y.AObjectS240S0100000_5;
import Y.AObjectS302S0200000_5;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.als.h0;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0FAg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C385680FAg<T extends InterfaceC385700FAi, H extends InterfaceC385700FAi> {
    public final Map<String, h0<Boolean>> LIZ = new ConcurrentHashMap();
    public final Map<String, h0<Boolean>> LIZIZ = new ConcurrentHashMap();
    public final Map<String, h0<Pair<Boolean, Boolean>>> LIZJ = new ConcurrentHashMap();

    public final h0 LIZ(Pair pair, Pair pair2, final long j, LifecycleOwner lifecycleOwner) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((InterfaceC385700FAi) pair.getFirst()).getValue());
        sbLIZ.append("__");
        sbLIZ.append(((InterfaceC385700FAi) pair2.getFirst()).getValue());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.LIZ;
        Object h0Var = concurrentHashMap.get(strLIZIZ);
        if (h0Var == null) {
            h0 h0VarLIZLLL = ((C1453870nw9) pair.getSecond()).LIZLLL((InterfaceC385700FAi) pair.getFirst());
            h0 h0VarLIZLLL2 = ((C1453870nw9) pair2.getSecond()).LIZLLL((InterfaceC385700FAi) pair2.getFirst());
            Boolean bool = Boolean.FALSE;
            h0 h0Var2 = new h0(new Pair(bool, bool));
            C377100EqS.LIZIZ(h0VarLIZLLL, lifecycleOwner, new AObjectS302S0200000_5(h0Var2, h0VarLIZLLL2, 6));
            C377100EqS.LIZIZ(h0VarLIZLLL2, lifecycleOwner, new AObjectS302S0200000_5(h0Var2, h0VarLIZLLL, 7));
            h0Var = new h0(bool);
            C377100EqS.LIZIZ(h0Var2, lifecycleOwner, new AObjectS240S0100000_5(h0Var, 158));
            ((ConcurrentHashMap) this.LIZJ).put(strLIZIZ, h0Var2);
            concurrentHashMap.put(strLIZIZ, h0Var);
        }
        h0 h0Var3 = (h0) h0Var;
        if (j > 0) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(h0Var3.hashCode());
            sbLIZ2.append('_');
            sbLIZ2.append(j);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) this.LIZIZ;
            Object obj = concurrentHashMap2.get(strLIZIZ2);
            Object obj2 = obj;
            if (obj == null) {
                final h0 h0Var4 = new h0(Boolean.FALSE);
                C377100EqS.LIZIZ(h0Var3, lifecycleOwner, new InterfaceC1441305kZ() { // from class: X.0FAh
                    @Override // androidx.lifecycle.Observer
                    public final void onChanged(Object obj3) {
                        if (((Boolean) obj3).booleanValue()) {
                            C0CNO.LIZLLL(j, new AwS549S0100000_5(h0Var4, (h0<Boolean>) 1177));
                        }
                    }
                });
                concurrentHashMap2.put(strLIZIZ2, h0Var4);
                obj2 = h0Var4;
            }
            return (h0) obj2;
        }
        return h0Var3;
    }
}
