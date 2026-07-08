package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0du6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1068200du6 extends C09AY implements Function1<C1023640ckE, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ Integer LLILZ;
    public final /* synthetic */ Integer LLILZIL;
    public final /* synthetic */ Integer LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1068200du6(Integer num, Integer num2, Integer num3, String str, String str2, boolean z, boolean z2) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = str;
        this.LLILLL = z2;
        this.LLILZ = num;
        this.LLILZIL = num2;
        this.LLILZLL = num3;
        this.LLIZ = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1023640ckE c1023640ckE) {
        int i;
        C1023640ckE c1023640ckE2 = c1023640ckE;
        C1068220du8.LIZ.getClass();
        C1002190cBd c1002190cBd = C1068220du8.LJIIL;
        if (this.LL) {
            i = 1;
        } else {
            i = 2;
        }
        c1023640ckE2.withParam(c1002190cBd, Integer.valueOf(i));
        c1023640ckE2.withParam(C1068220du8.LJ, this.LLILLJJLI);
        c1023640ckE2.withParam(C1068220du8.LJIILIIL, Integer.valueOf(this.LLILLL ? 1 : 0));
        c1023640ckE2.withParam(C1068220du8.LJII, String.valueOf(this.LLILZ));
        C1068610dul.LIZ.getClass();
        c1023640ckE2.withParam(C1068610dul.LJIILJJIL, String.valueOf(this.LLILZIL));
        c1023640ckE2.withParam(C1068610dul.LJIILL, this.LLILZLL);
        c1023640ckE2.withParam(C1068610dul.LJIILLIIL, this.LLIZ);
        return Unit.LIZ;
    }
}
