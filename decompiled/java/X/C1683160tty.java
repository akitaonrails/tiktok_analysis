package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0tty, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1683160tty extends C09AY implements Function1<AbstractC1683310tuD, Unit> {
    public final /* synthetic */ AbstractC1686530tzP LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ AbstractC1686530tzP LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1683160tty(AbstractC1686530tzP abstractC1686530tzP, int i, int i2, AbstractC1686530tzP abstractC1686530tzP2, int i3, int i4) {
        super(1);
        this.LL = abstractC1686530tzP;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = abstractC1686530tzP2;
        this.LLILZIL = i3;
        this.LLILZLL = i4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AbstractC1683310tuD abstractC1683310tuD) {
        AbstractC1683310tuD abstractC1683310tuD2 = abstractC1683310tuD;
        abstractC1683310tuD2.LIZLLL(this.LL, this.LLILLJJLI, this.LLILLL, 0.0f);
        abstractC1683310tuD2.LIZLLL(this.LLILZ, this.LLILZIL, this.LLILZLL, 0.0f);
        return Unit.LIZ;
    }
}
