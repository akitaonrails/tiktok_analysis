package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0DCH, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DCH extends C09AY implements Function1<C1023640ckE, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0DCH(String str, int i) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1023640ckE c1023640ckE) {
        C1023640ckE c1023640ckE2 = c1023640ckE;
        C0DCJ.LIZ.getClass();
        c1023640ckE2.withParam(C0DCJ.LIZIZ, this.LL);
        c1023640ckE2.withParam(C0DCJ.LIZJ, String.valueOf(this.LLILLJJLI));
        return Unit.LIZ;
    }
}
