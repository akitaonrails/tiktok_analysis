package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1Dlj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2265411Dlj extends C09AY implements Function1<C1023640ckE, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C19KZ LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2265411Dlj(String str, String str2, String str3, C19KZ c19kz, String str4, String str5) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = c19kz;
        this.LLILZIL = str4;
        this.LLILZLL = str5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1023640ckE c1023640ckE) {
        C1023640ckE c1023640ckE2 = c1023640ckE;
        C2265371Dlf.LIZ.getClass();
        c1023640ckE2.withParam(C2265371Dlf.LIZIZ, this.LL);
        c1023640ckE2.withParam(C2265371Dlf.LIZJ, "ads_activity_history");
        c1023640ckE2.withParam(C2265371Dlf.LIZLLL, this.LLILLJJLI);
        c1023640ckE2.withParam(C2265371Dlf.LJ, this.LLILLL);
        c1023640ckE2.withParam(C2265371Dlf.LJFF, this.LLILZ.getTrackingName());
        c1023640ckE2.withParam(C2265371Dlf.LJI, this.LLILZIL);
        c1023640ckE2.withParam(C2265371Dlf.LJIILLIIL, this.LLILZLL);
        return Unit.LIZ;
    }
}
