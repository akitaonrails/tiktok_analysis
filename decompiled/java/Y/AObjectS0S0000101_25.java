package Y;

import X.C1675860tiC;
import X.InterfaceC1669010tX9;
import X.InterfaceC1675870tiD;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes26.dex */
public class AObjectS0S0000101_25 implements Function1 {
    public final int $t;
    public float f1;
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

    public static final Object invoke$0(AObjectS0S0000101_25 aObjectS0S0000101_25, Object obj) {
        long j = aObjectS0S0000101_25.j0;
        float f = aObjectS0S0000101_25.f1;
        InterfaceC1669010tX9 interfaceC1669010tX9 = (InterfaceC1669010tX9) obj;
        interfaceC1669010tX9.LLIIJLIL();
        float fLJJJJLL = interfaceC1669010tX9.LJJJJLL(f);
        C1675860tiC.LJIIL(interfaceC1669010tX9, j, 0L, 0L, (((long) Float.floatToRawIntBits(fLJJJJLL)) << 32) | (((long) Float.floatToRawIntBits(fLJJJJLL)) & 4294967295L), null, 7, 118);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS0S0000101_25 aObjectS0S0000101_25, Object obj) {
        InterfaceC1675870tiD interfaceC1675870tiD = (InterfaceC1675870tiD) obj;
        C1675860tiC.LIZLLL(interfaceC1675870tiD, aObjectS0S0000101_25.j0, aObjectS0S0000101_25.f1, interfaceC1675870tiD.LJIJI(), 0.0f, null, 120);
        return Unit.LIZ;
    }

    public AObjectS0S0000101_25(long j, float f, int i) {
        this.$t = i;
        this.j0 = j;
        this.f1 = f;
    }
}
