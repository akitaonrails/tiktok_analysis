package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0dCy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1041460dCy extends C09AY implements Function1<C1023640ckE, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ C1035880d3y LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1041460dCy(String str, String str2, String str3, boolean z, int i, int i2, C1035880d3y c1035880d3y) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = z;
        this.LLILZIL = i;
        this.LLILZLL = i2;
        this.LLIZ = c1035880d3y;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1023640ckE c1023640ckE) {
        int pageSource;
        C1023640ckE c1023640ckE2 = c1023640ckE;
        C1041480dD0.LIZ.getClass();
        c1023640ckE2.withParam(C1041480dD0.LJIIJ, this.LL);
        c1023640ckE2.withParam(C1041480dD0.LJIILJJIL, this.LLILLJJLI);
        c1023640ckE2.withParam(C1041480dD0.LJIL, this.LLILLL);
        C1002190cBd c1002190cBd = C1041480dD0.LJIIJJI;
        long j = 0;
        if (this.LLILZ) {
            j = 1;
        }
        c1023640ckE2.withParam(c1002190cBd, Long.valueOf(j));
        c1023640ckE2.withParam(C1041480dD0.LJIJJ, Long.valueOf(this.LLILZIL));
        c1023640ckE2.withParam(C1041480dD0.LJIIIIZZ, Long.valueOf(this.LLILZLL));
        c1023640ckE2.withParam(C1041480dD0.LJIJJLI, this.LLILLL);
        c1023640ckE2.withParam(C1041480dD0.LJJ, 1L);
        c1023640ckE2.withParam(C1041480dD0.LJIIIZ, "iab");
        c1023640ckE2.withParam(C1041480dD0.LJJII, "h5");
        C1002190cBd c1002190cBd2 = C1041480dD0.LJIIL;
        C1035880d3y c1035880d3y = this.LLIZ;
        if (c1035880d3y != null) {
            pageSource = c1035880d3y.getPageSource();
        } else {
            pageSource = 1;
        }
        c1023640ckE2.withParam(c1002190cBd2, Long.valueOf(pageSource));
        c1023640ckE2.withParam(C1041480dD0.LJIILL, 0L);
        c1023640ckE2.withParam(C1041480dD0.LJJIII, -1L);
        c1023640ckE2.withParam(C1041480dD0.LJFF, 0L);
        return Unit.LIZ;
    }
}
