package Y;

import X.C1623606Xi;
import X.C727230Sfp;
import X.InterfaceC1487280oo2;
import X.InterfaceC2217241BqE;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public class AkS474S0100000_11 implements InterfaceC1487280oo2 {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            case 2:
                return apply$2(this, obj);
            case 3:
                return apply$3(this, obj);
            case 4:
                return apply$4(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AkS474S0100000_11(Object obj, Function1<? super T, ? extends V> function1) {
        this.$t = function1;
        this.l0 = obj;
    }

    public static final Object apply$0(AkS474S0100000_11 akS474S0100000_11, Object obj) {
        return C727230Sfp.LIZ((C727230Sfp) obj, (InterfaceC2217241BqE[]) akS474S0100000_11.l0);
    }

    public static final Object apply$1(AkS474S0100000_11 akS474S0100000_11, Object obj) {
        return new C1623606Xi(((Function1) akS474S0100000_11.l0).invoke(obj));
    }

    public static final Object apply$2(AkS474S0100000_11 akS474S0100000_11, Object obj) {
        return C727230Sfp.LIZ((C727230Sfp) obj, (InterfaceC2217241BqE[]) akS474S0100000_11.l0);
    }

    public static final Object apply$3(AkS474S0100000_11 akS474S0100000_11, Object obj) {
        return C727230Sfp.LIZ((C727230Sfp) obj, (InterfaceC2217241BqE[]) akS474S0100000_11.l0);
    }

    public static final Object apply$4(AkS474S0100000_11 akS474S0100000_11, Object obj) {
        return C727230Sfp.LIZ((C727230Sfp) obj, (InterfaceC2217241BqE[]) akS474S0100000_11.l0);
    }
}
