package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0duD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1068270duD extends C09AY implements Function1<C1023640ckE, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ boolean LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1068270duD(String str, long j, boolean z, String str2, int i, boolean z2) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = z;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = j;
        this.LLILZLL = z2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1023640ckE c1023640ckE) {
        C1023640ckE c1023640ckE2 = c1023640ckE;
        C1068220du8.LIZ.getClass();
        c1023640ckE2.withParam(C1068220du8.LJIILJJIL, Integer.valueOf(this.LL));
        c1023640ckE2.withParam(C1068220du8.LJIILL, Integer.valueOf(this.LLILLJJLI ? 1 : 0));
        if (!this.LLILLJJLI) {
            c1023640ckE2.withParam(C1068220du8.LJIIJ, this.LLILLL);
        }
        c1023640ckE2.withParam(C1068220du8.LIZLLL, this.LLILZ);
        c1023640ckE2.withParam(C1068220du8.LJIILLIIL, Long.valueOf(System.currentTimeMillis() - this.LLILZIL));
        c1023640ckE2.withParam(C1068220du8.LJJ, Integer.valueOf(this.LLILZLL ? 1 : 0));
        return Unit.LIZ;
    }
}
