package Y;

import X.C05P1;
import X.InterfaceC1364105Vn;
import X.InterfaceC346701Wf;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public class AgS83S0110000_2 implements InterfaceC346701Wf {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // X.InterfaceC346701Wf
    public final Object emit(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        switch (this.$t) {
            case 0:
                return emit$0(this, obj, interfaceC1364105Vn);
            case 1:
                return emit$1(this, obj, interfaceC1364105Vn);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AgS83S0110000_2(Object obj, C05P1<? extends Function2<? super int[], ? super Boolean, Unit>> c05p1, boolean z) {
        this.$t = z ? 1 : 0;
        this.l0 = obj;
        this.z1 = c05p1;
    }

    public static final Object emit$0(AgS83S0110000_2 agS83S0110000_2, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        ((Function2) agS83S0110000_2.l0).invoke(((Pair) obj).getFirst(), Boolean.valueOf(agS83S0110000_2.z1));
        return Unit.LIZ;
    }

    public static final Object emit$1(AgS83S0110000_2 agS83S0110000_2, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        ((Function2) ((C05P1) agS83S0110000_2.l0).getValue()).invoke(obj, Boolean.valueOf(agS83S0110000_2.z1));
        return Unit.LIZ;
    }
}
