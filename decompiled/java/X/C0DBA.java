package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0DBA, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DBA extends C09AY implements Function1<C1023640ckE, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0DBA(String str, String str2, boolean z) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1023640ckE c1023640ckE) {
        long j;
        C1023640ckE c1023640ckE2 = c1023640ckE;
        C2264951Dkz.LIZ.getClass();
        c1023640ckE2.withParam(C2264951Dkz.LJIL, 1);
        c1023640ckE2.withParam(C2264951Dkz.LJIJ, this.LL);
        c1023640ckE2.withParam(C2264951Dkz.LJIJJ, this.LLILLJJLI);
        C1002190cBd c1002190cBd = C2264951Dkz.LJIJJLI;
        if (this.LLILLL) {
            j = 1;
        } else {
            j = 0;
        }
        c1023640ckE2.withParam(c1002190cBd, Long.valueOf(j));
        return Unit.LIZ;
    }
}
