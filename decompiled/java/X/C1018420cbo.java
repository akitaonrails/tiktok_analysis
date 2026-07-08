package X;

import java.util.Arrays;
import kotlin.jvm.internal.AFwS252S0000000_16;

/* JADX INFO: renamed from: X.0cbo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1018420cbo extends AbstractC1023470cjx {
    public final C1023630ckD<?>[] LIZ;
    public final C1023960ckk LIZIZ;
    public final C1023960ckk LIZJ;
    public final C1023960ckk LIZLLL;
    public final C1023960ckk LJ;
    public final C1023960ckk LJFF;
    public final C1023960ckk LJI;

    @Override // X.AbstractC1023380cjo, X.C1023640ckE
    public final C1023630ckD<?>[] getInternalLogics() {
        return this.LIZ;
    }

    public C1018420cbo(Object... objArr) {
        super(Arrays.copyOf(objArr, objArr.length));
        C1018450cbr.LIZ.getClass();
        C1002190cBd c1002190cBd = C1018450cbr.LIZLLL;
        C1002190cBd c1002190cBd2 = C1018450cbr.LJ;
        C1002190cBd c1002190cBd3 = C1018450cbr.LJFF;
        this.LIZ = new C1023630ckD[]{new C1023630ckD<>(c1002190cBd, AFwS252S0000000_16.get$arr$(652)), new C1023630ckD<>(c1002190cBd2, AFwS252S0000000_16.get$arr$(653)), new C1023630ckD<>(c1002190cBd3, AFwS252S0000000_16.get$arr$(654))};
        C1009980cOC c1009980cOC = C1009980cOC.LIZ;
        C1002190cBd c1002190cBd4 = C1018450cbr.LIZJ;
        this.LIZIZ = C1023500ck0.LIZJ("draw_ad", "othershow_fail", "nova_like_premium_fullscreen", new InterfaceC1023650ckF[]{c1009980cOC.LJI(c1002190cBd4, c1002190cBd, c1002190cBd2, c1002190cBd3)});
        this.LIZJ = C1023500ck0.LIZJ("draw_ad", "othershow", "nova_like_afterlike_button", new InterfaceC1023650ckF[]{c1009980cOC.LJI(C1018450cbr.LIZIZ, c1002190cBd, c1002190cBd2, c1002190cBd3)});
        this.LIZLLL = C1023500ck0.LIZJ("draw_ad", "othershow_fail", "nova_like_afterlike_button", new InterfaceC1023650ckF[]{c1009980cOC.LJI(c1002190cBd4, c1002190cBd, c1002190cBd2, c1002190cBd3)});
        this.LJ = C1023500ck0.LIZJ("draw_ad", "othershow", "nova_like_standrad_sticker", new InterfaceC1023650ckF[]{c1009980cOC.LJI(c1002190cBd, c1002190cBd2, c1002190cBd3)});
        this.LJFF = C1023500ck0.LIZJ("draw_ad", "othershow_fail", "nova_like_standrad_sticker", new InterfaceC1023650ckF[]{c1009980cOC.LJI(c1002190cBd4, c1002190cBd, c1002190cBd2, c1002190cBd3)});
        this.LJI = C1023500ck0.LIZJ("draw_ad", "othershow", "nova_like_button_shake", new InterfaceC1023650ckF[]{c1009980cOC.LJI(c1002190cBd, c1002190cBd2, c1002190cBd3)});
    }
}
