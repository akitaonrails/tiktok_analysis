package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0tcT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1672310tcT extends C09AY implements Function1<AbstractC1683310tuD, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ AbstractC1686530tzP LLILLJJLI;
    public final /* synthetic */ AbstractC1686530tzP LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ long LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1672310tcT(boolean z, AbstractC1686530tzP abstractC1686530tzP, AbstractC1686530tzP abstractC1686530tzP2, int i, boolean z2, long j) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = abstractC1686530tzP;
        this.LLILLL = abstractC1686530tzP2;
        this.LLILZ = i;
        this.LLILZIL = z2;
        this.LLILZLL = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AbstractC1683310tuD abstractC1683310tuD) {
        AbstractC1683310tuD abstractC1683310tuD2 = abstractC1683310tuD;
        if (this.LL) {
            AbstractC1683310tuD.LJFF(abstractC1683310tuD2, this.LLILLJJLI, 0, 0);
            AbstractC1683310tuD.LJFF(abstractC1683310tuD2, this.LLILLL, 0, this.LLILLJJLI.LLILLJJLI);
        } else {
            int i = this.LLILZ;
            AbstractC1686530tzP abstractC1686530tzP = this.LLILLJJLI;
            int i2 = (i - abstractC1686530tzP.LLILLJJLI) / 2;
            int i3 = (i - this.LLILLL.LLILLJJLI) / 2;
            AbstractC1683310tuD.LJFF(abstractC1683310tuD2, abstractC1686530tzP, 0, i2);
            if (this.LLILZIL) {
                AbstractC1683310tuD.LJFF(abstractC1683310tuD2, this.LLILLL, this.LLILLJJLI.LL, i3);
            } else {
                AbstractC1683310tuD.LJFF(abstractC1683310tuD2, this.LLILLL, C1682380tsi.LJIIIIZZ(this.LLILZLL) - this.LLILLL.LL, i3);
            }
        }
        return Unit.LIZ;
    }
}
