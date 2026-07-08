package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0dPf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1049330dPf extends C09AY implements Function1<C1023640ckE, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1049330dPf(boolean z, boolean z2) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = z2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1023640ckE c1023640ckE) {
        C1023640ckE c1023640ckE2 = c1023640ckE;
        C1049350dPh.LIZ.getClass();
        c1023640ckE2.withParam(C1049350dPh.LIZJ, Integer.valueOf(this.LL ? 1 : 0));
        c1023640ckE2.withParam(C1049350dPh.LIZIZ, Integer.valueOf(this.LLILLJJLI ? 1 : 0));
        return Unit.LIZ;
    }
}
