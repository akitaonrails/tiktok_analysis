package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0dBq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1040760dBq extends C09AY implements Function1<C1023640ckE, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C1040740dBo LLILLL;
    public final /* synthetic */ Boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1040760dBq(boolean z, String str, C1040740dBo c1040740dBo, Boolean bool) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = str;
        this.LLILLL = c1040740dBo;
        this.LLILZ = bool;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1023640ckE c1023640ckE) {
        C1023640ckE c1023640ckE2 = c1023640ckE;
        C1043500dGG.LIZ.getClass();
        c1023640ckE2.withParam(C1043500dGG.LJLIIIL, Integer.valueOf(this.LL ? 1 : 0));
        c1023640ckE2.withParam(C1043500dGG.LJLIIL, this.LLILLJJLI);
        c1023640ckE2.withParam(C1043500dGG.LJIILJJIL, Integer.valueOf(this.LLILLL.LLILLL));
        c1023640ckE2.withParam(C1043500dGG.LJIILLIIL, this.LLILLL.LLJI);
        c1023640ckE2.withParam(C1043500dGG.LJJJLZIJ, "iab");
        c1023640ckE2.withParam(C1043500dGG.LJJJ, Integer.valueOf(this.LLILLL.LLJJIJIL));
        c1023640ckE2.withParam(C1043500dGG.LJLLI, Integer.valueOf(this.LLILLL.LLJJIII));
        if (Intrinsics.LJFF(this.LLILZ, Boolean.TRUE)) {
            c1023640ckE2.withParam(C1043500dGG.LJLLJ, 1);
        }
        return Unit.LIZ;
    }
}
