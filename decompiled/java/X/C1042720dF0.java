package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0dF0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1042720dF0 extends C09AY implements Function1<C1023640ckE, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ InterfaceC1041500dD2 LLILZ;
    public final /* synthetic */ String LLILZIL = "ttweb_prefetcher";
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ Integer LLIZ;
    public final /* synthetic */ int LLIZLLLIL;
    public final /* synthetic */ long LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1042720dF0(int i, long j, C1035880d3y c1035880d3y, Integer num, String str, String str2, String str3, String str4) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = c1035880d3y;
        this.LLILZLL = str4;
        this.LLIZ = num;
        this.LLIZLLLIL = i;
        this.LLJ = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1023640ckE c1023640ckE) {
        String realCreativeIdStr;
        int iIntValue;
        String lpRefer;
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
        C1002190cBd c1002190cBd4 = C1042690dEx.LJJJLL;
        InterfaceC1041500dD2 interfaceC1041500dD2 = this.LLILZ;
        if (interfaceC1041500dD2 == null || (realCreativeIdStr = interfaceC1041500dD2.getRealCreativeIdStr()) == null) {
            realCreativeIdStr = "";
        }
        c1023640ckE2.withParam(c1002190cBd4, realCreativeIdStr);
        C1002190cBd c1002190cBd5 = C1042690dEx.LJJJJLL;
        InterfaceC1041500dD2 interfaceC1041500dD22 = this.LLILZ;
        if (interfaceC1041500dD22 != null && (lpRefer = interfaceC1041500dD22.getLpRefer()) != null) {
            str2 = lpRefer;
        }
        c1023640ckE2.withParam(c1002190cBd5, str2);
        c1023640ckE2.withParam(C1042690dEx.LJIJ, this.LLILZIL);
        c1023640ckE2.withParam(C1042690dEx.LJIJI, this.LLILZLL);
        C1002190cBd c1002190cBd6 = C1042690dEx.LJIJJ;
        Integer num = this.LLIZ;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        c1023640ckE2.withParam(c1002190cBd6, Integer.valueOf(iIntValue));
        c1023640ckE2.withParam(C1042690dEx.LJIJJLI, Integer.valueOf(this.LLIZLLLIL));
        c1023640ckE2.withParam(C1042690dEx.LJIL, Long.valueOf(this.LLJ));
        return Unit.LIZ;
    }
}
