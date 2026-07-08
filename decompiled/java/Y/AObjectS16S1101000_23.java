package Y;

import X.InterfaceC1523020pjg;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes24.dex */
public class AObjectS16S1101000_23 implements Function0 {
    public final int $t;
    public int i2;
    public Object l1;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS16S1101000_23 aObjectS16S1101000_23) {
        ((InterfaceC1523020pjg) aObjectS16S1101000_23.l1).LIZ(aObjectS16S1101000_23.i2, aObjectS16S1101000_23.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS16S1101000_23 aObjectS16S1101000_23) {
        ((InterfaceC1523020pjg) aObjectS16S1101000_23.l1).onError(aObjectS16S1101000_23.i2, aObjectS16S1101000_23.s0);
        return Unit.LIZ;
    }

    public AObjectS16S1101000_23(InterfaceC1523020pjg interfaceC1523020pjg, int i, String str, int i2) {
        this.$t = i2;
        this.l1 = interfaceC1523020pjg;
        this.i2 = i;
        this.s0 = str;
    }
}
