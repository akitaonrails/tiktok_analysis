package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0dBt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1040790dBt extends C09AY implements Function1<C1023640ckE, Unit> {
    public final /* synthetic */ C1040740dBo LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ Integer LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1040790dBt(C1040740dBo c1040740dBo, String str, int i, Integer num) {
        super(1);
        this.LL = c1040740dBo;
        this.LLILLJJLI = str;
        this.LLILLL = i;
        this.LLILZ = num;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1023640ckE c1023640ckE) {
        C1023640ckE c1023640ckE2 = c1023640ckE;
        C1043500dGG.LIZ.getClass();
        c1023640ckE2.withParam(C1043500dGG.LJIILJJIL, Integer.valueOf(this.LL.LLILLL));
        c1023640ckE2.withParam(C1043500dGG.LJIILLIIL, this.LL.LLJI);
        c1023640ckE2.withParam(C1043500dGG.LJJII, this.LLILLJJLI);
        c1023640ckE2.withParam(C1043500dGG.LJJJ, Integer.valueOf(this.LL.LLJJIJIL));
        c1023640ckE2.withParam(C1043500dGG.LJJJLZIJ, "iab");
        c1023640ckE2.withParam(C1043500dGG.LJLJLLL, Integer.valueOf(this.LLILLL));
        c1023640ckE2.withParam(C1043500dGG.LJLL, this.LLILZ);
        return Unit.LIZ;
    }
}
