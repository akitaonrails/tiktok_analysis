package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0dVI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1052820dVI extends C09AY implements Function1<C1023640ckE, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1052820dVI(int i, String str, long j, String str2) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = j;
        this.LLILLL = i;
        this.LLILZ = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1023640ckE c1023640ckE) {
        C1023640ckE c1023640ckE2 = c1023640ckE;
        C1E1Y.LIZ.getClass();
        c1023640ckE2.withParam(C1E1Y.LJFF, "rule_match");
        c1023640ckE2.withParam(C1E1Y.LJ, this.LL);
        c1023640ckE2.withParam(C1E1Y.LIZJ, Long.valueOf(this.LLILLJJLI));
        c1023640ckE2.withParam(C1E1Y.LIZLLL, String.valueOf(this.LLILLL));
        c1023640ckE2.withParam(C1E1Y.LIZIZ, this.LLILZ);
        return Unit.LIZ;
    }
}
