package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0dCG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1041020dCG extends C09AY implements Function1<C1023640ckE, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ Integer LLILLJJLI;
    public final /* synthetic */ Integer LLILLL;
    public final /* synthetic */ Integer LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1041020dCG(boolean z, Integer num, Integer num2, Integer num3, String str) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = num;
        this.LLILLL = num2;
        this.LLILZ = num3;
        this.LLILZIL = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1023640ckE c1023640ckE) {
        C1023640ckE c1023640ckE2 = c1023640ckE;
        C1043500dGG.LIZ.getClass();
        c1023640ckE2.withParam(C1043500dGG.LLJJJJJIL, Integer.valueOf(this.LL ? 1 : 0));
        c1023640ckE2.withParam(C1043500dGG.LLJJJJLIIL, this.LLILLJJLI);
        c1023640ckE2.withParam(C1043500dGG.LLJJL, this.LLILLL);
        c1023640ckE2.withParam(C1043500dGG.LLJJLIIIJLLLLLLLZ, this.LLILZ);
        c1023640ckE2.withParam(C1043500dGG.LLJL, this.LLILZIL);
        return Unit.LIZ;
    }
}
