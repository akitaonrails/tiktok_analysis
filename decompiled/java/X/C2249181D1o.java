package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1D1o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2249181D1o extends C09AY implements Function1<C1023640ckE, Unit> {
    public final /* synthetic */ C2176151AEr LL;
    public final /* synthetic */ float LLILLJJLI;
    public final /* synthetic */ float LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2249181D1o(C2176151AEr c2176151AEr, float f, float f2, String str) {
        super(1);
        this.LL = c2176151AEr;
        this.LLILLJJLI = f;
        this.LLILLL = f2;
        this.LLILZ = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1023640ckE c1023640ckE) {
        C1023640ckE c1023640ckE2 = c1023640ckE;
        C2249171D1n.LIZ.getClass();
        C1002190cBd c1002190cBd = C2249171D1n.LIZIZ;
        C2176151AEr c2176151AEr = this.LL;
        float f = this.LLILLJJLI;
        float f2 = this.LLILLL;
        c2176151AEr.getClass();
        c1023640ckE2.withParam(c1002190cBd, C2176151AEr.LJJIIZ(f, f2));
        c1023640ckE2.withParam(C2249171D1n.LJ, this.LLILZ);
        return Unit.LIZ;
    }
}
