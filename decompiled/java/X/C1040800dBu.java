package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0dBu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1040800dBu extends C09AY implements Function1<C1023640ckE, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ Long LLILLL;
    public final /* synthetic */ Integer LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1040800dBu(boolean z, boolean z2, String str, Integer num, Long l) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = z2;
        this.LLILLL = l;
        this.LLILZ = num;
        this.LLILZIL = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1023640ckE c1023640ckE) {
        C1023640ckE c1023640ckE2 = c1023640ckE;
        C1043500dGG.LIZ.getClass();
        c1023640ckE2.withParam(C1043500dGG.LLJJJJJIL, Integer.valueOf(this.LL ? 1 : 0));
        c1023640ckE2.withParam(C1043500dGG.LLJLIL, Integer.valueOf(this.LLILLJJLI ? 1 : 0));
        c1023640ckE2.withParam(C1043500dGG.LLJLILLLLZIIL, this.LLILLL);
        c1023640ckE2.withParam(C1043500dGG.LLJJLIIIJLLLLLLLZ, this.LLILZ);
        c1023640ckE2.withParam(C1043500dGG.LLJL, this.LLILZIL);
        return Unit.LIZ;
    }
}
