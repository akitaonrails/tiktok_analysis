package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1D07, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1D07 extends C09AY implements Function1<C1D03, Unit> {
    public final /* synthetic */ C2248671Czp LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1D07(C2248671Czp c2248671Czp) {
        super(1);
        this.LL = c2248671Czp;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1D03 c1d03) {
        C1D03 c1d032 = c1d03;
        c1d032.LIZLLL = new C1D06(this.LL);
        c1d032.LIZIZ = new C1213940hhA(this.LL);
        return Unit.LIZ;
    }
}
