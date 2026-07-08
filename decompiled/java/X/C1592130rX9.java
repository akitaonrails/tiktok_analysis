package X;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0rX9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1592130rX9 extends C09AY implements Function2<C1592290rXP, Pair<? extends Integer, ? extends Integer>, Unit> {
    public final /* synthetic */ AbstractC1592930rYR LL;
    public final /* synthetic */ C1592170rXD LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1592130rX9(AbstractC1592930rYR abstractC1592930rYR, C1592170rXD c1592170rXD) {
        super(2);
        this.LL = abstractC1592930rYR;
        this.LLILLJJLI = c1592170rXD;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C1592290rXP c1592290rXP, Pair<? extends Integer, ? extends Integer> pair) {
        this.LL.LJJIIJ(this.LLILLJJLI.LIZJ, c1592290rXP, pair);
        return Unit.LIZ;
    }
}
