package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0y5t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1844310y5t extends C09AY implements Function1<C1023640ckE, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1844310y5t(int i, long j, boolean z) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = j;
        this.LLILLL = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1023640ckE c1023640ckE) {
        long j;
        C1023640ckE c1023640ckE2 = c1023640ckE;
        C1850350yFd.LIZ.getClass();
        c1023640ckE2.withParam(C1850350yFd.LIZIZ, Long.valueOf(this.LL));
        c1023640ckE2.withParam(C1850350yFd.LIZJ, Long.valueOf(this.LLILLJJLI));
        C1002190cBd c1002190cBd = C1850350yFd.LIZLLL;
        if (this.LLILLL) {
            j = 1;
        } else {
            j = 2;
        }
        c1023640ckE2.withParam(c1002190cBd, Long.valueOf(j));
        return Unit.LIZ;
    }
}
