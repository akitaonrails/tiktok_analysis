package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0DC3, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DC3 extends C09AY implements Function1<C1023640ckE, Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0DC3(long j, int i) {
        super(1);
        this.LL = j;
        this.LLILLJJLI = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1023640ckE c1023640ckE) {
        C1023640ckE c1023640ckE2 = c1023640ckE;
        C335440DDa.LIZ.getClass();
        c1023640ckE2.withParam(C335440DDa.LJIILIIL, 1);
        c1023640ckE2.withParam(C335440DDa.LJIIIIZZ, Long.valueOf(this.LL));
        c1023640ckE2.withParam(C335440DDa.LJFF, Long.valueOf(EnumC335450DDb.ONE_STEP_CHECKOUT.getValue()));
        c1023640ckE2.withParam(C335440DDa.LIZLLL, Integer.valueOf(this.LLILLJJLI));
        return Unit.LIZ;
    }
}
