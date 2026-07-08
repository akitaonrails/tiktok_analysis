package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1DyH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2273191DyH extends C09AY implements Function1<C1023640ckE, Unit> {
    public final /* synthetic */ C1040740dBo LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2273191DyH(C1040740dBo c1040740dBo, int i, long j) {
        super(1);
        this.LL = c1040740dBo;
        this.LLILLJJLI = i;
        this.LLILLL = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1023640ckE c1023640ckE) {
        C1023640ckE c1023640ckE2 = c1023640ckE;
        C2273171DyF.LIZ.getClass();
        c1023640ckE2.withParam(C2273171DyF.LJIILL, Long.valueOf(this.LL.LLILLL));
        c1023640ckE2.withParam(C2273171DyF.LJJIIJZLJL, this.LL.LLJI);
        c1023640ckE2.withParam(C2273171DyF.LJIIIIZZ, this.LL.LLJI);
        c1023640ckE2.withParam(C2273171DyF.LJIJ, Long.valueOf(this.LLILLJJLI));
        c1023640ckE2.withParam(C2273171DyF.LJFF, Long.valueOf(this.LLILLL));
        c1023640ckE2.withParam(C2273171DyF.LJI, Long.valueOf(this.LL.LLJJIJIL));
        c1023640ckE2.withParam(C2273171DyF.LJII, "iab");
        c1023640ckE2.withParam(C2273171DyF.LJJIJIL, "h5");
        return Unit.LIZ;
    }
}
