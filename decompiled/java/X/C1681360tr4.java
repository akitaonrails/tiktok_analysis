package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0tr4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1681360tr4 extends C09AY implements Function1<InterfaceC1675870tiD, Unit> {
    public final /* synthetic */ C1677480tko<Float, C1677280tkU> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1681360tr4(C1677480tko<Float, C1677280tkU> c1677480tko) {
        super(1);
        this.LL = c1677480tko;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC1675870tiD interfaceC1675870tiD) {
        InterfaceC1675870tiD interfaceC1675870tiD2 = interfaceC1675870tiD;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC1675870tiD2.LIZIZ() & 4294967295L)) / 2.0f;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        long j = C1685910tyP.LJ;
        C1675860tiC.LJIIL(interfaceC1675870tiD2, C1685910tyP.LIZJ(0.24f, j), 0L, 0L, jFloatToRawIntBits, null, 0, 246);
        C1675860tiC.LJIIL(interfaceC1675870tiD2, j, 0L, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC1675870tiD2.LIZIZ() >> 32)) * C13LZ.LIZLLL(this.LL.LIZLLL().floatValue(), 0.0f, 1.0f))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC1675870tiD2.LIZIZ() & 4294967295L)))) & 4294967295L), jFloatToRawIntBits, null, 0, 242);
        return Unit.LIZ;
    }
}
