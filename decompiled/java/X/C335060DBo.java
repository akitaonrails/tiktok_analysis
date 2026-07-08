package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0DBo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C335060DBo extends C09AY implements Function1<C1023640ckE, Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C335060DBo(long j, int i, int i2) {
        super(1);
        this.LL = j;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1023640ckE c1023640ckE) {
        C1023640ckE c1023640ckE2 = c1023640ckE;
        C335440DDa.LIZ.getClass();
        c1023640ckE2.withParam(C335440DDa.LJIIIIZZ, Long.valueOf(this.LL));
        c1023640ckE2.withParam(C335440DDa.LJFF, Long.valueOf(this.LLILLJJLI));
        c1023640ckE2.withParam(C335440DDa.LIZLLL, Integer.valueOf(this.LLILLL));
        return Unit.LIZ;
    }
}
