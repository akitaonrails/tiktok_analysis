package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0dVH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1052810dVH extends C09AY implements Function1<C1023640ckE, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1052810dVH(long j, String str, String str2, String str3, String str4) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = j;
        this.LLILZIL = str4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1023640ckE c1023640ckE) {
        C1023640ckE c1023640ckE2 = c1023640ckE;
        C1E1Y.LIZ.getClass();
        c1023640ckE2.withParam(C1E1Y.LJFF, "fetch_rule");
        c1023640ckE2.withParam(C1E1Y.LJ, this.LL);
        c1023640ckE2.withParam(C1E1Y.LIZLLL, this.LLILLJJLI);
        c1023640ckE2.withParam(C1E1Y.LIZIZ, this.LLILLL);
        c1023640ckE2.withParam(C1E1Y.LIZJ, Long.valueOf(this.LLILZ));
        c1023640ckE2.withParam(C1E1Y.LJJIJL, this.LLILZIL);
        return Unit.LIZ;
    }
}
