package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1E0q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2274421E0q extends C09AY implements Function1<C1023640ckE, Unit> {
    public final /* synthetic */ C1043630dGT LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ C1043600dGQ LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2274421E0q(C1043630dGT c1043630dGT, String str, String str2, String str3, String str4, C1043600dGQ c1043600dGQ) {
        super(1);
        this.LL = c1043630dGT;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
        this.LLILZLL = c1043600dGQ;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1023640ckE c1023640ckE) {
        C1023640ckE c1023640ckE2 = c1023640ckE;
        C2274391E0n.LIZ.getClass();
        c1023640ckE2.withParam(C2274391E0n.LJI, this.LL.LIZ);
        c1023640ckE2.withParam(C2274391E0n.LJ, this.LL.LIZ);
        c1023640ckE2.withParam(C2274391E0n.LJFF, this.LL.LIZIZ);
        c1023640ckE2.withParam(C2274391E0n.LIZLLL, this.LL.LIZLLL);
        c1023640ckE2.withParam(C2274391E0n.LJIILJJIL, this.LLILLJJLI);
        c1023640ckE2.withParam(C2274391E0n.LJIIL, this.LLILLL);
        c1023640ckE2.withParam(C2274391E0n.LJIILIIL, this.LLILZ);
        c1023640ckE2.withParam(C2274391E0n.LIZIZ, this.LLILZIL);
        C1002190cBd c1002190cBd = C2274391E0n.LJII;
        C1043600dGQ c1043600dGQ = this.LLILZLL;
        c1023640ckE2.withParam(c1002190cBd, Long.valueOf(c1043600dGQ.LJI - c1043600dGQ.LJFF));
        C1002190cBd c1002190cBd2 = C2274391E0n.LIZJ;
        C1043600dGQ c1043600dGQ2 = this.LLILZLL;
        c1023640ckE2.withParam(c1002190cBd2, Long.valueOf(c1043600dGQ2.LJI - c1043600dGQ2.LIZJ));
        return Unit.LIZ;
    }
}
