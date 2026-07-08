package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0dBJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1040430dBJ extends C09AY implements Function1<C1023640ckE, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1040430dBJ(int i, String str, long j) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = str;
        this.LLILLL = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1023640ckE c1023640ckE) {
        C1023640ckE c1023640ckE2 = c1023640ckE;
        C1040440dBK.LIZ.getClass();
        c1023640ckE2.withParam(C1040440dBK.LIZIZ, "AI_AUTOFILL");
        c1023640ckE2.withParam(C1040440dBK.LIZJ, 0L);
        c1023640ckE2.withParam(C1040440dBK.LIZLLL, String.valueOf(this.LL));
        c1023640ckE2.withParam(C1040440dBK.LJ, this.LLILLJJLI);
        c1023640ckE2.withParam(C1040440dBK.LJFF, C1040110dAn.LLILZIL.LIZJ(this.LLILLL));
        return Unit.LIZ;
    }
}
