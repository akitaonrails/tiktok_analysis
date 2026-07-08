package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.0taZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1671130taZ extends C09AY implements InterfaceC1631630sYr<InterfaceC1691190u6v, Integer, InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ C13EY<Integer, C1690050u55> LL;
    public final /* synthetic */ InterfaceC1685420txc<Integer, C1690050u55, Boolean, InterfaceC1680500tpg, Integer, Unit> LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ AbstractC1690640u62 LLILZ;
    public final /* synthetic */ C05P1<Boolean> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1671130taZ(C13EY c13ey, C19719212De c19719212De, boolean z, AbstractC1690640u62 abstractC1690640u62, C05P1 c05p1) {
        super(4);
        this.LL = c13ey;
        this.LLILLJJLI = c19719212De;
        this.LLILLL = z;
        this.LLILZ = abstractC1690640u62;
        this.LLILZIL = c05p1;
    }

    @Override // X.InterfaceC1631630sYr
    public final Unit invoke(InterfaceC1691190u6v interfaceC1691190u6v, Integer num, InterfaceC1680500tpg interfaceC1680500tpg, Integer num2) {
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        C13EY<Integer, C1690050u55> c13ey = this.LL;
        Integer numValueOf = Integer.valueOf(iIntValue);
        C1690050u55 c1690050u55 = c13ey.get(numValueOf);
        boolean zLIZIZ = false;
        if (c1690050u55 == null) {
            c1690050u55 = new C1690050u55(0, 0);
            c13ey.put(numValueOf, c1690050u55);
        }
        InterfaceC1685420txc<Integer, C1690050u55, Boolean, InterfaceC1680500tpg, Integer, Unit> interfaceC1685420txc = this.LLILLJJLI;
        Integer numValueOf2 = Integer.valueOf(iIntValue);
        if (this.LLILLL) {
            zLIZIZ = this.LLILZ.LIZIZ();
        } else if (this.LLILZ.LIZIZ() || !this.LLILZIL.getValue().booleanValue()) {
            zLIZIZ = true;
        }
        interfaceC1685420txc.invoke(numValueOf2, c1690050u55, Boolean.valueOf(zLIZIZ), interfaceC1680500tpg, Integer.valueOf(((iIntValue2 >> 3) & 14) | 3072));
        return Unit.LIZ;
    }
}
