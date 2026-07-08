package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0yhP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1867570yhP extends C09AY implements Function1<C1863800ybK, Unit> {
    public final /* synthetic */ long LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1867570yhP(long j) {
        super(1);
        this.LL = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1863800ybK c1863800ybK) {
        c1863800ybK.LJIIIIZZ = Long.valueOf(this.LL);
        return Unit.LIZ;
    }
}
