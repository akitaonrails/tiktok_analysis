package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0tXA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1669020tXA extends C09AY implements Function1<InterfaceC1669010tX9, Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ float LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1669020tXA(float f, long j, long j2, boolean z) {
        super(1);
        this.LL = j;
        this.LLILLJJLI = z;
        this.LLILLL = j2;
        this.LLILZ = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC1669010tX9 interfaceC1669010tX9) {
        InterfaceC1669010tX9 interfaceC1669010tX92 = interfaceC1669010tX9;
        long jLIZIZ = interfaceC1669010tX92.LIZIZ();
        C1695950uEb c1695950uEbLIZ = C1669140tXM.LIZ(Math.min(Float.intBitsToFloat((int) (jLIZIZ >> 32)) / 2.0f, Float.intBitsToFloat((int) (jLIZIZ & 4294967295L)) / 2.0f), Math.min(Float.intBitsToFloat((int) (interfaceC1669010tX92.LIZIZ() >> 32)), Float.intBitsToFloat((int) (interfaceC1669010tX92.LIZIZ() & 4294967295L))) * 0.14285715f, jLIZIZ);
        if (C1685910tyP.LJFF(this.LL) > 0.0f) {
            C1675860tiC.LJIIIIZZ(interfaceC1669010tX92, c1695950uEbLIZ, this.LL, 0.0f, C1695700uEC.LIZ, 52);
        }
        interfaceC1669010tX92.LLIIJLIL();
        if (this.LLILLJJLI) {
            C1675860tiC.LJIIIIZZ(interfaceC1669010tX92, c1695950uEbLIZ, this.LLILLL, 0.0f, new C1695210uDP(interfaceC1669010tX92.LJJJJLL(this.LLILZ), 0.0f, 0, 0, null, 30), 52);
        }
        return Unit.LIZ;
    }
}
