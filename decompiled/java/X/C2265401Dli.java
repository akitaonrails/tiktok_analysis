package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1Dli, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2265401Dli extends C09AY implements Function1<C1023640ckE, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C19KZ LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ long LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2265401Dli(String str, String str2, String str3, C19KZ c19kz, long j, long j2) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = c19kz;
        this.LLILZIL = j;
        this.LLILZLL = j2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1023640ckE c1023640ckE) {
        String trackingName;
        C1023640ckE c1023640ckE2 = c1023640ckE;
        C2265371Dlf.LIZ.getClass();
        c1023640ckE2.withParam(C2265371Dlf.LIZIZ, this.LL);
        c1023640ckE2.withParam(C2265371Dlf.LIZJ, "ads_activity_history");
        c1023640ckE2.withParam(C2265371Dlf.LIZLLL, this.LLILLJJLI);
        c1023640ckE2.withParam(C2265371Dlf.LJ, this.LLILLL);
        C1002190cBd c1002190cBd = C2265371Dlf.LJII;
        C19KZ c19kz = this.LLILZ;
        if (c19kz != null) {
            trackingName = c19kz.getTrackingName();
        } else {
            trackingName = null;
        }
        c1023640ckE2.withParam(c1002190cBd, trackingName);
        c1023640ckE2.withParam(C2265371Dlf.LJIILJJIL, Long.valueOf(this.LLILZIL));
        c1023640ckE2.withParam(C2265371Dlf.LJIILL, Long.valueOf(this.LLILZLL));
        return Unit.LIZ;
    }
}
