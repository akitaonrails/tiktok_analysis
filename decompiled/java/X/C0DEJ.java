package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0DEJ, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DEJ extends C09AY implements Function1<C1023640ckE, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0DEJ(String str, String str2, long j) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1023640ckE c1023640ckE) {
        C1023640ckE c1023640ckE2 = c1023640ckE;
        C0DEL.LIZ.getClass();
        c1023640ckE2.withParam(C0DEL.LIZIZ, this.LL);
        c1023640ckE2.withParam(C0DEL.LIZJ, this.LLILLJJLI);
        c1023640ckE2.withParam(C0DEL.LIZLLL, String.valueOf(this.LLILLL));
        return Unit.LIZ;
    }
}
