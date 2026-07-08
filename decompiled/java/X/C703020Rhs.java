package X;

import Y.AComparatorS28S0000000_9;
import Y.AObjectS161S0000000_11;
import Y.AObjectS64S0000000_11;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Rhs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C703020Rhs {
    public final C703220RiC LIZ;
    public final C01GW LIZIZ;

    public final C702940Rhk LIZJ() {
        return new C702940Rhk(0L, C2097608Jq.LJ(), C702980Rho.LJ((C700400Rde) this.LIZIZ.getValue()), C2097608Jq.LJ());
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0RiC] */
    public C703020Rhs() {
        final Function2[] function2Arr = {new C703040Rhu(this), new C703000Rhq(this), new C702970Rhn(this), new C703010Rhr(this), new C703050Rhv(this), new C703030Rht(this)};
        this.LIZ = new Function2() { // from class: X.0RiC
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                for (Function2 function2 : function2Arr) {
                    obj = function2.invoke(obj, obj2);
                }
                return obj;
            }
        };
        this.LIZIZ = C452501pT.LIZIZ(new AObjectS64S0000000_11(5));
    }

    public static C702940Rhk LIZIZ(C702940Rhk c702940Rhk) {
        return new C702940Rhk(c702940Rhk.LIZ, LIZ(c702940Rhk.LIZIZ, new AObjectS161S0000000_11(1)), C702980Rho.LJ(c702940Rhk.LIZJ), LIZ(c702940Rhk.LIZLLL, new AObjectS161S0000000_11(0)));
    }

    public static Map LIZ(Map map, Function2 function2) {
        List<Map.Entry> listLJLLLL = C13LP.LJLLLL(new AComparatorS28S0000000_9(16), map.entrySet());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : listLJLLLL) {
            Pair pair = new Pair(entry.getKey(), function2.invoke(entry.getKey(), entry.getValue()));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }
}
