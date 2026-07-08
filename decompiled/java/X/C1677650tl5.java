package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0tl5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1677650tl5 extends C09AY implements Function1<AbstractC1683310tuD, Unit> {
    public final /* synthetic */ C1677630tl3 LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ InterfaceC1689940u4u LLILZIL;
    public final /* synthetic */ AbstractC1686530tzP LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1677650tl5(C1677630tl3 c1677630tl3, long j, int i, int i2, InterfaceC1689940u4u interfaceC1689940u4u, AbstractC1686530tzP abstractC1686530tzP) {
        super(1);
        this.LL = c1677630tl3;
        this.LLILLJJLI = j;
        this.LLILLL = i;
        this.LLILZ = i2;
        this.LLILZIL = interfaceC1689940u4u;
        this.LLILZLL = abstractC1686530tzP;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AbstractC1683310tuD abstractC1683310tuD) {
        AbstractC1683310tuD.LJ(abstractC1683310tuD, this.LLILZLL, this.LL.LLJJI.LIZ(this.LLILLJJLI, (((long) this.LLILLL) << 32) | (((long) this.LLILZ) & 4294967295L), this.LLILZIL.getLayoutDirection()));
        return Unit.LIZ;
    }
}
