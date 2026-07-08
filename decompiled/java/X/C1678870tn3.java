package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0tn3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1678870tn3 extends C09AY implements Function1<AbstractC1683310tuD, Unit> {
    public final /* synthetic */ C115T LL;
    public final /* synthetic */ float LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ AbstractC1686530tzP LLILZLL;
    public final /* synthetic */ int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1678870tn3(C115T c115t, float f, int i, int i2, int i3, AbstractC1686530tzP abstractC1686530tzP, int i4) {
        super(1);
        this.LL = c115t;
        this.LLILLJJLI = f;
        this.LLILLL = i;
        this.LLILZ = i2;
        this.LLILZIL = i3;
        this.LLILZLL = abstractC1686530tzP;
        this.LLIZ = i4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AbstractC1683310tuD abstractC1683310tuD) {
        int i;
        AbstractC1683310tuD abstractC1683310tuD2 = abstractC1683310tuD;
        int i2 = 0;
        if (this.LL instanceof C115S) {
            i = 0;
        } else if (!C1668650tWZ.LIZJ(this.LLILLJJLI, Float.NaN)) {
            i = this.LLILLL;
        } else {
            i = (this.LLILZ - this.LLILZIL) - this.LLILZLL.LL;
        }
        if (this.LL instanceof C115S) {
            if (!C1668650tWZ.LIZJ(this.LLILLJJLI, Float.NaN)) {
                i2 = this.LLILLL;
            } else {
                i2 = (this.LLIZ - this.LLILZIL) - this.LLILZLL.LLILLJJLI;
            }
        }
        AbstractC1683310tuD.LJFF(abstractC1683310tuD2, this.LLILZLL, i, i2);
        return Unit.LIZ;
    }
}
