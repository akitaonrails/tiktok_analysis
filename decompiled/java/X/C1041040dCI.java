package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0dCI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1041040dCI extends C09AY implements Function1<C1023640ckE, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1041040dCI(boolean z, boolean z2, int i) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = z2;
        this.LLILLL = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1023640ckE c1023640ckE) {
        C1023640ckE c1023640ckE2 = c1023640ckE;
        C1043500dGG.LIZ.getClass();
        c1023640ckE2.withParam(C1043500dGG.LLJJJJJIL, Integer.valueOf(this.LL ? 1 : 0));
        c1023640ckE2.withParam(C1043500dGG.LLJLLIL, Integer.valueOf(this.LLILLJJLI ? 1 : 0));
        c1023640ckE2.withParam(C1043500dGG.LLJLLL, Integer.valueOf(this.LLILLL));
        return Unit.LIZ;
    }
}
