package Y;

import X.C817403Hg;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes9.dex */
public class AObjectS20S0100001_8 implements Function0 {
    public final int $t;
    public float f1;
    public Object l0;

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

    public static final Object invoke$0(AObjectS20S0100001_8 aObjectS20S0100001_8) {
        ((C817403Hg) aObjectS20S0100001_8.l0).element += aObjectS20S0100001_8.f1;
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS20S0100001_8 aObjectS20S0100001_8) {
        ((C817403Hg) aObjectS20S0100001_8.l0).element += aObjectS20S0100001_8.f1;
        return Unit.LIZ;
    }

    public AObjectS20S0100001_8(float f, C817403Hg c817403Hg, int i) {
        this.$t = i;
        this.l0 = c817403Hg;
        this.f1 = f;
    }
}
