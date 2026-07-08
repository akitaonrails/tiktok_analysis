package Y;

import X.C13LP;
import X.C19719612Di;
import X.C700400Rde;
import X.C702980Rho;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public class AObjectS311S0200000_11 implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS311S0200000_11 aObjectS311S0200000_11, Object obj) {
        ((Function1) aObjectS311S0200000_11.l0).invoke(((Function1) aObjectS311S0200000_11.l1).invoke(obj));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS311S0200000_11 aObjectS311S0200000_11, Object obj) {
        C700400Rde c700400Rde = (C700400Rde) aObjectS311S0200000_11.l0;
        LinkedHashMap linkedHashMap = (LinkedHashMap) aObjectS311S0200000_11.l1;
        C700400Rde c700400Rde2 = (C700400Rde) obj;
        linkedHashMap.put(c700400Rde2.LIZ, c700400Rde.LIZ);
        c700400Rde2.LIZIZ(new AObjectS311S0200000_11(c700400Rde2, linkedHashMap, 1));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AObjectS311S0200000_11 aObjectS311S0200000_11, Object obj) {
        C702980Rho.LIZLLL((C700400Rde) obj, (C700400Rde) aObjectS311S0200000_11.l0, (LinkedHashMap) aObjectS311S0200000_11.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AObjectS311S0200000_11 aObjectS311S0200000_11, Object obj) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) aObjectS311S0200000_11.l0;
        LinkedHashMap linkedHashMap = (LinkedHashMap) aObjectS311S0200000_11.l1;
        C700400Rde c700400Rde = (C700400Rde) obj;
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(c700400Rde.LIZ);
        c700400Rde.LIZIZ(new AObjectS311S0200000_11(linkedHashSet2, linkedHashMap, 3));
        Set setLLIIJI = C13LP.LLIIJI(linkedHashSet2);
        linkedHashMap.put(c700400Rde.LIZ, setLLIIJI);
        C19719612Di.LJJI(setLLIIJI, linkedHashSet);
        return Unit.LIZ;
    }

    public AObjectS311S0200000_11(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
