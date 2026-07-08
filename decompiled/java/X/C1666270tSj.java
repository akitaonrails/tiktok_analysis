package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0tSj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1666270tSj extends C09AY implements Function1<InterfaceC1675870tiD, Unit> {
    public final /* synthetic */ EnumC1308705Af LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ AbstractC1668700tWe LLILLL;
    public final /* synthetic */ AbstractC1668700tWe LLILZ;
    public final /* synthetic */ C05P1<C1668650tWZ> LLILZIL;
    public final /* synthetic */ C05P1<C1668650tWZ> LLILZLL;
    public final /* synthetic */ C05P1<Float> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1666270tSj(EnumC1308705Af enumC1308705Af, long j, AbstractC1668700tWe abstractC1668700tWe, AbstractC1668700tWe abstractC1668700tWe2, C05P1<C1668650tWZ> c05p1, C05P1<C1668650tWZ> c05p12, C05P1<Float> c05p13) {
        super(1);
        this.LL = enumC1308705Af;
        this.LLILLJJLI = j;
        this.LLILLL = abstractC1668700tWe;
        this.LLILZ = abstractC1668700tWe2;
        this.LLILZIL = c05p1;
        this.LLILZLL = c05p12;
        this.LLIZ = c05p13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC1675870tiD interfaceC1675870tiD) {
        AbstractC1695860uES c1695210uDP;
        InterfaceC1675870tiD interfaceC1675870tiD2 = interfaceC1675870tiD;
        float f = 2;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC1675870tiD2.LIZIZ() >> 32)) / f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC1675870tiD2.LIZIZ() & 4294967295L)) / f)) & 4294967295L);
        float fLJJJJLL = interfaceC1675870tiD2.LJJJJLL(this.LLILZIL.getValue().LL);
        EnumC1308705Af enumC1308705Af = this.LL;
        EnumC1308705Af enumC1308705Af2 = EnumC1308705Af.RECORDING;
        if (enumC1308705Af == enumC1308705Af2) {
            c1695210uDP = C1695700uEC.LIZ;
        } else {
            c1695210uDP = new C1695210uDP(interfaceC1675870tiD2.LJJJJLL(C1665860tS4.LIZJ.LIZJ), 0.0f, 0, 0, null, 30);
        }
        C1675860tiC.LIZLLL(interfaceC1675870tiD2, this.LLILLJJLI, fLJJJJLL, jFloatToRawIntBits, 0.0f, c1695210uDP, 104);
        C1675860tiC.LIZJ(interfaceC1675870tiD2, this.LLILLL, interfaceC1675870tiD2.LJJJJLL(this.LLILZLL.getValue().LL), jFloatToRawIntBits, 0.0f, C1695700uEC.LIZ, 104);
        if (this.LL == enumC1308705Af2) {
            float f2 = 6;
            float fLJJJJLL2 = interfaceC1675870tiD2.LJJJJLL(this.LLILZIL.getValue().LL - (f2 / f));
            float fFloatValue = 360 * this.LLIZ.getValue().floatValue();
            C1695210uDP c1695210uDP2 = new C1695210uDP(interfaceC1675870tiD2.LJJJJLL(f2), 0.0f, 1, 0, null, 26);
            float f3 = f * fLJJJJLL2;
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f3)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) - fLJJJJLL2;
            long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) - fLJJJJLL2)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
            AbstractC1668700tWe abstractC1668700tWe = this.LLILZ;
            InterfaceC1675870tiD.LLILL.getClass();
            interfaceC1675870tiD2.LJJLIIIJLLLLLLLZ(abstractC1668700tWe, fFloatValue, jFloatToRawIntBits3, jFloatToRawIntBits2, 1.0f, c1695210uDP2, null, C1668240tVu.LIZIZ);
        }
        return Unit.LIZ;
    }
}
