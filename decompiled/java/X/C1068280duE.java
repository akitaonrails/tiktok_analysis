package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0duE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1068280duE extends C09AY implements Function1<C1023640ckE, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1068280duE(int i, long j, int i2, long j2) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = j;
        this.LLILLL = i2;
        this.LLILZ = j2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1023640ckE c1023640ckE) {
        C1023640ckE c1023640ckE2 = c1023640ckE;
        C1068220du8.LIZ.getClass();
        c1023640ckE2.withParam(C1068220du8.LJIJI, Integer.valueOf(this.LL));
        c1023640ckE2.withParam(C1068220du8.LJIJJ, Long.valueOf(this.LLILLJJLI));
        c1023640ckE2.withParam(C1068220du8.LJIJJLI, Integer.valueOf(this.LLILLL));
        c1023640ckE2.withParam(C1068220du8.LJIL, Long.valueOf(this.LLILZ));
        return Unit.LIZ;
    }
}
