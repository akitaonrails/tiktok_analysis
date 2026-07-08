package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1Czz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2248771Czz extends C09AY implements Function1<C1D03, Unit> {
    public final /* synthetic */ C2248671Czp LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2248771Czz(C2248671Czp c2248671Czp) {
        super(1);
        this.LL = c2248671Czp;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1D03 c1d03) {
        C1D03 c1d032 = c1d03;
        c1d032.LIZLLL = new C2248721Czu(this.LL);
        c1d032.LJ = new C1213980hhE(this.LL);
        c1d032.LIZIZ = new C1D00(this.LL);
        return Unit.LIZ;
    }
}
