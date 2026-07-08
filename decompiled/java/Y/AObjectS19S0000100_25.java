package Y;

import X.C1675860tiC;
import X.InterfaceC1675870tiD;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes26.dex */
public class AObjectS19S0000100_25 implements Function1 {
    public final int $t;
    public long j0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public AObjectS19S0000100_25(long j, int i) {
        this.$t = i;
        this.j0 = j;
    }

    public static final Object invoke$0(AObjectS19S0000100_25 aObjectS19S0000100_25, Object obj) {
        C1675860tiC.LIZLLL((InterfaceC1675870tiD) obj, aObjectS19S0000100_25.j0, 0.0f, 0L, 0.0f, null, 126);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS19S0000100_25 aObjectS19S0000100_25, Object obj) {
        long j = aObjectS19S0000100_25.j0;
        InterfaceC1675870tiD interfaceC1675870tiD = (InterfaceC1675870tiD) obj;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC1675870tiD.LIZIZ() & 4294967295L)) / 2;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (interfaceC1675870tiD.LIZIZ() & 4294967295L)) / 4;
        C1675860tiC.LJI(interfaceC1675870tiD, j, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat))) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC1675870tiD.LIZIZ() >> 32))) << 32), fIntBitsToFloat2, 1, 480);
        return Unit.LIZ;
    }
}
