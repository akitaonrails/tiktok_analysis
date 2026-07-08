package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0dEz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1042710dEz extends C09AY implements Function1<C1023640ckE, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ double LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ int LLIZLLLIL;
    public final /* synthetic */ int LLJ;
    public final /* synthetic */ int LLJI;
    public final /* synthetic */ String LLJIJIL;
    public final /* synthetic */ String LLJILJIL;
    public final /* synthetic */ EnumC1042620dEq LLJILJILJ;
    public final /* synthetic */ int LLJILLL;
    public final /* synthetic */ C1042650dEt LLJJ;
    public final /* synthetic */ EnumC1042630dEr LLJJI;
    public final /* synthetic */ InterfaceC1041500dD2 LLJJIII;
    public final /* synthetic */ boolean LLJJIJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1042710dEz(String str, String str2, String str3, double d, int i, int i2, int i3, int i4, int i5, int i6, String str4, String str5, EnumC1042620dEq enumC1042620dEq, int i7, C1042650dEt c1042650dEt, EnumC1042630dEr enumC1042630dEr, InterfaceC1041500dD2 interfaceC1041500dD2, boolean z) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = d;
        this.LLILZIL = i;
        this.LLILZLL = i2;
        this.LLIZ = i3;
        this.LLIZLLLIL = i4;
        this.LLJ = i5;
        this.LLJI = i6;
        this.LLJIJIL = str4;
        this.LLJILJIL = str5;
        this.LLJILJILJ = enumC1042620dEq;
        this.LLJILLL = i7;
        this.LLJJ = c1042650dEt;
        this.LLJJI = enumC1042630dEr;
        this.LLJJIII = interfaceC1041500dD2;
        this.LLJJIJI = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1023640ckE c1023640ckE) {
        int state;
        C1023640ckE c1023640ckE2 = c1023640ckE;
        C1042690dEx.LIZ.getClass();
        C1002190cBd c1002190cBd = C1042690dEx.LJII;
        String str = this.LL;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        c1023640ckE2.withParam(c1002190cBd, str);
        C1002190cBd c1002190cBd2 = C1042690dEx.LIZJ;
        String str3 = this.LLILLJJLI;
        if (str3 == null) {
            str3 = "";
        }
        c1023640ckE2.withParam(c1002190cBd2, str3);
        C1002190cBd c1002190cBd3 = C1042690dEx.LJFF;
        String str4 = this.LLILLL;
        if (str4 == null) {
            str4 = "";
        }
        c1023640ckE2.withParam(c1002190cBd3, str4);
        c1023640ckE2.withParam(C1042690dEx.LJ, Double.valueOf(this.LLILZ));
        c1023640ckE2.withParam(C1042690dEx.LJJIIJ, Integer.valueOf(this.LLILZIL));
        c1023640ckE2.withParam(C1042690dEx.LJJIIJZLJL, Integer.valueOf(this.LLILZLL));
        c1023640ckE2.withParam(C1042690dEx.LJJIIZ, Integer.valueOf(this.LLIZ));
        c1023640ckE2.withParam(C1042690dEx.LJJIIZI, Integer.valueOf(this.LLIZLLLIL));
        c1023640ckE2.withParam(C1042690dEx.LJJIJ, Integer.valueOf(this.LLJ));
        c1023640ckE2.withParam(C1042690dEx.LJJIJIIJI, Integer.valueOf(this.LLJI));
        C1002190cBd c1002190cBd4 = C1042690dEx.LJIIIIZZ;
        String str5 = this.LLJIJIL;
        if (str5 == null) {
            str5 = "";
        }
        c1023640ckE2.withParam(c1002190cBd4, str5);
        C1002190cBd c1002190cBd5 = C1042690dEx.LJJJI;
        String str6 = this.LLJILJIL;
        if (str6 != null) {
            str2 = str6;
        }
        c1023640ckE2.withParam(c1002190cBd5, str2);
        c1023640ckE2.withParam(C1042690dEx.LJIIIZ, this.LLJILJILJ.getType());
        c1023640ckE2.withParam(C1042690dEx.LJI, Integer.valueOf(this.LLJILLL));
        c1023640ckE2.withParam(C1042690dEx.LJJIJIL, Integer.valueOf(this.LLJJ.LJIIJJI));
        C1002190cBd c1002190cBd6 = C1042690dEx.LJJIJL;
        EnumC1042630dEr enumC1042630dEr = this.LLJJI;
        if (enumC1042630dEr != null) {
            state = enumC1042630dEr.getState();
        } else {
            state = -1;
        }
        c1023640ckE2.withParam(c1002190cBd6, Integer.valueOf(state));
        c1023640ckE2.withParam(C1042690dEx.LJJIJLIJ, Integer.valueOf(this.LLJJ.LJIIJ));
        C1042650dEt c1042650dEt = this.LLJJ;
        InterfaceC1041500dD2 interfaceC1041500dD2 = this.LLJJIII;
        c1042650dEt.getClass();
        C1042650dEt.LJIILJJIL(c1023640ckE2, interfaceC1041500dD2);
        c1023640ckE2.withParam(C1042690dEx.LJJIL, Boolean.valueOf(this.LLJJIJI));
        return Unit.LIZ;
    }
}
