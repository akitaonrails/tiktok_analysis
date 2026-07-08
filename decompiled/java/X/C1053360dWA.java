package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.0dWA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1053360dWA extends C1023500ck0 {
    public static final C1023960ckk LIZ;
    public static final C1023960ckk LIZIZ;

    static {
        C1053360dWA c1053360dWA = new C1053360dWA();
        C1053400dWE.LIZ.getClass();
        C1002190cBd c1002190cBd = C1053400dWE.LIZJ;
        C1002190cBd c1002190cBd2 = C1053400dWE.LIZIZ;
        LIZ = C1023500ck0.LIZJ("history_ad", "history_url_click", "ad_history", new InterfaceC1023650ckF[]{c1053360dWA.LJI(c1002190cBd, c1002190cBd2, C1053400dWE.LIZLLL)});
        LIZIZ = C1023500ck0.LIZJ("history_ad", "backup_url_show", "ad_history", new InterfaceC1023650ckF[]{c1053360dWA.LJI(c1002190cBd2, c1002190cBd, C1053400dWE.LJ)});
    }

    @Override // X.C1023500ck0
    public final InterfaceC1023650ckF<?, ?>[] LJII(InterfaceC1023650ckF<?, ?>... interfaceC1023650ckFArr) {
        C323580CmK c323580CmK = new C323580CmK(2);
        Arrays.copyOf(interfaceC1023650ckFArr, interfaceC1023650ckFArr.length);
        c323580CmK.LIZIZ(new InterfaceC1023650ckF[0]);
        C1053400dWE.LIZ.getClass();
        c323580CmK.LIZ(C1053400dWE.LIZIZ);
        return (InterfaceC1023650ckF[]) c323580CmK.LIZLLL(new InterfaceC1023650ckF[c323580CmK.LIZJ()]);
    }
}
