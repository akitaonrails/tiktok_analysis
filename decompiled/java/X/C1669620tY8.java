package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0tY8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1669620tY8 extends C09AY implements Function1<InterfaceC1675870tiD, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ C1691540u7U LLILZLL;
    public final /* synthetic */ long LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1669620tY8(boolean z, long j, long j2, long j3, String str, C1691540u7U c1691540u7U, long j4) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = j;
        this.LLILLL = j2;
        this.LLILZ = j3;
        this.LLILZIL = str;
        this.LLILZLL = c1691540u7U;
        this.LLIZ = j4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC1675870tiD interfaceC1675870tiD) throws Throwable {
        long j;
        InterfaceC1675870tiD interfaceC1675870tiD2 = interfaceC1675870tiD;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC1675870tiD2.LIZIZ() >> 32));
        float f = fIntBitsToFloat / 2.0f;
        float f2 = fIntBitsToFloat / 20.0f;
        if (this.LL) {
            j = 0;
            C1675860tiC.LIZLLL(interfaceC1675870tiD2, this.LLILLJJLI, f, 0L, 0.0f, C1695700uEC.LIZ, 108);
        } else {
            float f3 = f - (f2 / 2.0f);
            j = 0;
            C1675860tiC.LIZLLL(interfaceC1675870tiD2, this.LLILLL, f3, 0L, 0.0f, C1695700uEC.LIZ, 108);
            C1675860tiC.LIZLLL(interfaceC1675870tiD2, this.LLILZ, f3, 0L, 0.0f, new C1695210uDP(f2, 0.0f, 0, 0, null, 30), 108);
        }
        if (!a0.LJJJIL(this.LLILZIL)) {
            C1692150u8T c1692150u8TLIZ = C1691540u7U.LIZ(this.LLILZLL, this.LLILZIL, new C1693430uAX(this.LLIZ, C1682430tsn.LJ(14), null, null, null, j, null, 3, j, 16744444), 0, 0L, 1020);
            long j2 = c1692150u8TLIZ.LIZJ;
            float f4 = 2;
            C1683260tu8.LIZ(interfaceC1675870tiD2, c1692150u8TLIZ, 0L, (((long) Float.floatToRawIntBits((fIntBitsToFloat - ((int) (j2 >> 32))) / f4)) << 32) | (((long) Float.floatToRawIntBits((fIntBitsToFloat - ((int) (j2 & 4294967295L))) / f4)) & 4294967295L), 250);
        }
        return Unit.LIZ;
    }
}
