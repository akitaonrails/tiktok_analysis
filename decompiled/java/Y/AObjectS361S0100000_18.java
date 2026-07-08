package Y;

import X.C05P0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public class AObjectS361S0100000_18 implements Function1 {
    public final int $t;
    public Object l0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public AObjectS361S0100000_18(C05P0 c05p0, int i) {
        this.$t = i;
        this.l0 = c05p0;
    }

    public static final Object invoke$0(AObjectS361S0100000_18 aObjectS361S0100000_18, Object obj) {
        ((C05P0) aObjectS361S0100000_18.l0).setValue(Boolean.valueOf(((Boolean) obj).booleanValue()));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS361S0100000_18 aObjectS361S0100000_18, Object obj) {
        ((C05P0) aObjectS361S0100000_18.l0).setValue(Float.valueOf(((Float) obj).floatValue()));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AObjectS361S0100000_18 aObjectS361S0100000_18, Object obj) {
        ((C05P0) aObjectS361S0100000_18.l0).setValue(Boolean.valueOf(((Boolean) obj).booleanValue()));
        return Unit.LIZ;
    }
}
