package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0u8p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1692370u8p extends C09AY implements Function0<C1692580u9A> {
    public final /* synthetic */ C1692300u8i LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ InterfaceC1692660u9I LLILZ;
    public final /* synthetic */ C01GW<Integer> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1692370u8p(C1692300u8i c1692300u8i, int i, int i2, C1692350u8n c1692350u8n, C01GW c01gw) {
        super(0);
        this.LL = c1692300u8i;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = c1692350u8n;
        this.LLILZIL = c01gw;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1692580u9A invoke() {
        int iLJI;
        C1692300u8i c1692300u8i = this.LL;
        int iIntValue = this.LLILZIL.getValue().intValue();
        int i = this.LLILLJJLI;
        int i2 = this.LLILLL;
        boolean zLIZ = this.LLILZ.LIZ();
        boolean z = this.LLILZ.LIZIZ() == EnumC1692390u8r.CROSSED;
        long jLJIILL = c1692300u8i.LJFF.LJIILL(i);
        C1692150u8T c1692150u8T = c1692300u8i.LJFF;
        int i3 = C1692280u8g.LIZJ;
        int iLJIIJJI = (int) (jLJIILL >> 32);
        if (c1692150u8T.LJII(iLJIIJJI) != iIntValue) {
            C1692150u8T c1692150u8T2 = c1692300u8i.LJFF;
            int i4 = c1692150u8T2.LIZIZ.LJFF;
            iLJIIJJI = iIntValue >= i4 ? c1692150u8T2.LJIIJJI(i4 - 1) : c1692150u8T2.LJIIJJI(iIntValue);
        }
        if (c1692300u8i.LJFF.LJII(C1692280u8g.LIZLLL(jLJIILL)) == iIntValue) {
            iLJI = C1692280u8g.LIZLLL(jLJIILL);
        } else {
            C1692150u8T c1692150u8T3 = c1692300u8i.LJFF;
            int i5 = c1692150u8T3.LIZIZ.LJFF;
            iLJI = iIntValue >= i5 ? c1692150u8T3.LJI(i5 - 1, false) : c1692150u8T3.LJI(iIntValue, false);
        }
        if (iLJIIJJI == i2) {
            return c1692300u8i.LIZ(iLJI);
        }
        if (iLJI == i2) {
            return c1692300u8i.LIZ(iLJIIJJI);
        }
        if (!(zLIZ ^ z) ? i >= iLJIIJJI : i > iLJI) {
            iLJIIJJI = iLJI;
        }
        return c1692300u8i.LIZ(iLJIIJJI);
    }
}
