package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1Cvr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2246211Cvr extends C09AY implements Function1<C1023640ckE, Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ long LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2246211Cvr(long j, long j2) {
        super(1);
        this.LL = j;
        this.LLILLJJLI = j2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1023640ckE c1023640ckE) {
        C1023640ckE c1023640ckE2 = c1023640ckE;
        C2246231Cvt.LIZ.getClass();
        c1023640ckE2.withParam(C2246231Cvt.LIZJ, Long.valueOf(this.LL));
        c1023640ckE2.withParam(C2246231Cvt.LIZIZ, Long.valueOf(this.LLILLJJLI));
        return Unit.LIZ;
    }
}
