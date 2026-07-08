package X;

import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.AwS595S0100000_16;

/* JADX INFO: renamed from: X.0dZL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1055330dZL extends AbstractC1023470cjx {
    public final Aweme LIZ;
    public final C1023630ckD<?>[] LIZIZ;
    public int LIZJ;
    public long LIZLLL;
    public long LJ;
    public int LJFF;
    public long LJI;
    public int LJII;
    public boolean LJIIIIZZ;
    public AnoleComponentModel LJIIIZ;
    public final C1023960ckk LJIIJ;
    public final C1023960ckk LJIIJJI;
    public final C1023960ckk LJIIL;
    public final C1023960ckk LJIILIIL;
    public final C1023960ckk LJIILJJIL;
    public final C1023960ckk LJIILL;
    public final C1023960ckk LJIILLIIL;
    public final C1023960ckk LJIIZILJ;

    public final void LJJIIZ() {
        int i = this.LIZJ;
        if (i == 2) {
            logAd(this.LJIILJJIL, new AwS595S0100000_16(this, 25));
        } else if (i == 3) {
            logAd(this.LJIILL, new AwS595S0100000_16(this, 26));
        }
    }

    @Override // X.AbstractC1023380cjo, X.C1023640ckE
    public final C1023630ckD<?>[] getInternalLogics() {
        return this.LIZIZ;
    }

    public C1055330dZL(Aweme aweme) {
        String str;
        super(aweme);
        this.LIZ = aweme;
        this.LIZIZ = new C1023630ckD[0];
        if (C1017180cZo.LJIILJJIL(aweme.getAwemeRawAd())) {
            str = "draw_ad";
        } else {
            str = "playable_ad";
        }
        this.LIZJ = 1;
        this.LJ = -1L;
        this.LJI = -1L;
        C1055310dZJ c1055310dZJ = C1055310dZJ.LIZ;
        C1055320dZK.LIZ.getClass();
        this.LJIIJ = C1023500ck0.LIZJ(str, "playable_stay_duration", "playable_ad", new InterfaceC1023650ckF[]{c1055310dZJ.LJI(C1055320dZK.LIZIZ, C1055320dZK.LIZLLL)});
        this.LJIIJJI = C1023500ck0.LIZJ(str, "remove_loading_page", "playable_ad", new InterfaceC1023650ckF[]{c1055310dZJ.LJI(C1055320dZK.LJ, C1055320dZK.LIZJ)});
        c1055310dZJ.getClass();
        this.LJIIL = C1023500ck0.LIZJ(str, "viewable_true", "playable_ad", new InterfaceC1023650ckF[0]);
        c1055310dZJ.getClass();
        this.LJIILIIL = C1023500ck0.LIZJ(str, "viewable_false", "playable_ad", new InterfaceC1023650ckF[0]);
        C1002190cBd c1002190cBd = C1055320dZK.LJIIJ;
        C1002190cBd c1002190cBd2 = C1055320dZK.LJIIIZ;
        this.LJIILJJIL = C1023500ck0.LIZJ(str, "othershow", "playable_ad", new InterfaceC1023650ckF[]{c1055310dZJ.LJI(c1002190cBd, c1002190cBd2)});
        this.LJIILL = C1023500ck0.LIZJ(str, "othershow_fail", "playable_ad", new InterfaceC1023650ckF[]{c1055310dZJ.LJI(C1055320dZK.LJFF, C1055320dZK.LJI, c1002190cBd, c1002190cBd2)});
        this.LJIILLIIL = C1023500ck0.LIZJ(str, "playable_infeed_user_click", "playable_ad", new InterfaceC1023650ckF[]{c1055310dZJ.LJI(C1055320dZK.LJII)});
        this.LJIIZILJ = C1023500ck0.LIZJ("draw_ad", "leave_after_play", "playable_ad", new InterfaceC1023650ckF[]{c1055310dZJ.LJI(C1055320dZK.LJIIIIZZ)});
    }
}
