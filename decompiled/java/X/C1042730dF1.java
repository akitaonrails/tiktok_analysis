package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0dF1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1042730dF1 extends C09AY implements Function1<C1023640ckE, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ InterfaceC1041500dD2 LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ double LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1042730dF1(String str, InterfaceC1041500dD2 interfaceC1041500dD2, String str2, int i, int i2, double d) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = interfaceC1041500dD2;
        this.LLILLL = str2;
        this.LLILZ = i;
        this.LLILZIL = i2;
        this.LLILZLL = d;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1023640ckE c1023640ckE) {
        String lpRefer;
        InterfaceC1041500dD2 interfaceC1041500dD2;
        C1023640ckE c1023640ckE2 = c1023640ckE;
        C1042690dEx.LIZ.getClass();
        C1002190cBd c1002190cBd = C1042690dEx.LIZJ;
        String loadUrl = this.LL;
        String realCreativeIdStr = null;
        if (loadUrl == null && (((interfaceC1041500dD2 = this.LLILLJJLI) == null || (loadUrl = interfaceC1041500dD2.getLoadUrl()) == null) && (loadUrl = this.LLILLL) == null)) {
            loadUrl = "";
        }
        c1023640ckE2.withParam(c1002190cBd, loadUrl);
        C1002190cBd c1002190cBd2 = C1042690dEx.LJJJJLL;
        InterfaceC1041500dD2 interfaceC1041500dD22 = this.LLILLJJLI;
        if (interfaceC1041500dD22 != null) {
            lpRefer = interfaceC1041500dD22.getLpRefer();
        } else {
            lpRefer = null;
        }
        c1023640ckE2.withParam(c1002190cBd2, lpRefer);
        C1002190cBd c1002190cBd3 = C1042690dEx.LJJJLL;
        InterfaceC1041500dD2 interfaceC1041500dD23 = this.LLILLJJLI;
        if (interfaceC1041500dD23 != null) {
            realCreativeIdStr = interfaceC1041500dD23.getRealCreativeIdStr();
        }
        c1023640ckE2.withParam(c1002190cBd3, realCreativeIdStr);
        c1023640ckE2.withParam(C1042690dEx.LJJ, Integer.valueOf(this.LLILZ));
        c1023640ckE2.withParam(C1042690dEx.LJJI, Integer.valueOf(this.LLILZIL));
        c1023640ckE2.withParam(C1042690dEx.LJJIII, Double.valueOf(this.LLILZLL));
        return Unit.LIZ;
    }
}
