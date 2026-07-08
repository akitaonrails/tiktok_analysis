package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0cu8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1029780cu8 extends C09AY implements Function1<C1023640ckE, Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1029780cu8(int i, String str, long j, int i2, String str2, String str3) {
        super(1);
        this.LL = j;
        this.LLILLJJLI = i;
        this.LLILLL = str;
        this.LLILZ = i2;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1023640ckE c1023640ckE) {
        C1023640ckE c1023640ckE2 = c1023640ckE;
        C1043500dGG.LIZ.getClass();
        c1023640ckE2.withParam(C1043500dGG.LJIIZILJ, Long.valueOf(this.LL));
        c1023640ckE2.withParam(C1043500dGG.LJJLIIIJJIZ, Integer.valueOf(this.LLILLJJLI));
        c1023640ckE2.withParam(C1043500dGG.LJIILLIIL, this.LLILLL);
        c1023640ckE2.withParam(C1043500dGG.LJJIJIIJI, Integer.valueOf(this.LLILZ));
        c1023640ckE2.withParam(C1043500dGG.LJJIJ, this.LLILZIL);
        c1023640ckE2.withParam(C1043500dGG.LIZIZ, this.LLILZLL);
        return Unit.LIZ;
    }
}
