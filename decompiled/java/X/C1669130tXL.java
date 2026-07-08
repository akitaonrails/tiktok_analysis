package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0tXL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1669130tXL extends C09AY implements Function1<InterfaceC1675870tiD, Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ EnumC587240N1m LLILLJJLI;
    public final /* synthetic */ float LLILLL;
    public final /* synthetic */ float LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1669130tXL(long j, EnumC587240N1m enumC587240N1m, float f, float f2) {
        super(1);
        this.LL = j;
        this.LLILLJJLI = enumC587240N1m;
        this.LLILLL = f;
        this.LLILZ = f2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC1675870tiD interfaceC1675870tiD) {
        InterfaceC1675870tiD interfaceC1675870tiD2 = interfaceC1675870tiD;
        C1695950uEb c1695950uEbLIZ = C1695940uEa.LIZ();
        EnumC587240N1m enumC587240N1m = this.LLILLJJLI;
        float f = this.LLILLL;
        float f2 = this.LLILZ;
        int i = C587250N1n.LIZ[enumC587240N1m.ordinal()];
        if (i != 1) {
            if (i == 2) {
                c1695950uEbLIZ.LIZJ(0.0f, 0.0f);
                c1695950uEbLIZ.LJIIL(f, 0.0f);
                c1695950uEbLIZ.LJIIL(f / 2, f2);
                c1695950uEbLIZ.close();
            } else {
                throw new C1954807lC();
            }
        } else {
            float f3 = f / 2;
            c1695950uEbLIZ.LIZJ(f3, f2);
            c1695950uEbLIZ.LJIIL(0.0f, f2);
            c1695950uEbLIZ.LJIIL(f3, 0.0f);
            c1695950uEbLIZ.close();
        }
        C1675860tiC.LJIIIIZZ(interfaceC1675870tiD2, c1695950uEbLIZ, this.LL, 0.0f, C1695700uEC.LIZ, 52);
        return Unit.LIZ;
    }
}
