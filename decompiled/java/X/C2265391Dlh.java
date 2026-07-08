package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1Dlh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2265391Dlh extends C09AY implements Function1<C1023640ckE, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ C19KZ LLILZIL;
    public final /* synthetic */ long LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2265391Dlh(long j, long j2, C19KZ c19kz, String str, String str2, String str3, String str4) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = j;
        this.LLILZIL = c19kz;
        this.LLILZLL = j2;
        this.LLIZ = str4;
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
        c1023640ckE2.withParam(C2265371Dlf.LJIIJ, Long.valueOf(this.LLILZ));
        C1002190cBd c1002190cBd = C2265371Dlf.LJIIJJI;
        C19KZ c19kz = this.LLILZIL;
        if (c19kz != null) {
            trackingName = c19kz.getTrackingName();
        } else {
            trackingName = null;
        }
        c1023640ckE2.withParam(c1002190cBd, trackingName);
        c1023640ckE2.withParam(C2265371Dlf.LJIIL, Long.valueOf(this.LLILZLL));
        c1023640ckE2.withParam(C2265371Dlf.LJIILIIL, this.LLIZ);
        return Unit.LIZ;
    }
}
