package X;

import Y.AcS187S0300000_15;
import Y.AcS496S0100000_15;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.competition.service.ILiveCompetitionExternalService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS224S0300000_15;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0aU3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C936730aU3 extends AbstractC936750aU5 {
    public static final /* synthetic */ int LIZJ = 0;
    public final C914370Ztz LIZIZ;

    public static int LIZIZ() {
        ILiveCompetitionExternalService iLiveCompetitionExternalService = (ILiveCompetitionExternalService) C1161920gLG.LIZJ(ILiveCompetitionExternalService.class);
        if (C915980Zwa.LIZLLL().UN0() && !C948770anT.LIZLLL()) {
            return 2131851840;
        }
        if (iLiveCompetitionExternalService.kg2() && (iLiveCompetitionExternalService.IJ2() == EnumC964170bCJ.MATCH_START || iLiveCompetitionExternalService.IJ2() == EnumC964170bCJ.SETTLE_START)) {
            return 2131851546;
        }
        if (C970370bMJ.LJ()) {
            return 2131853305;
        }
        if (C970370bMJ.LJIIIIZZ() && (C970370bMJ.LIZJ() == 40 || C970370bMJ.LIZJ() == 2)) {
            return 2131853276;
        }
        return !C915980Zwa.LJFF().co0() ? 2131841177 : 2131853305;
    }

    @Override // X.InterfaceC943940afg
    public final void show() {
        if (C955010axX.LJIIJJI) {
            C013C c013c = new C013C();
            C013C c013c2 = new C013C();
            C1397580mTM c1397580mTM = new C1397580mTM(this.LIZIZ.LIZ);
            c1397580mTM.LJFF(2131841178);
            c1397580mTM.LIZ(LIZIZ());
            C985403tE.LIZ(c1397580mTM, new AwS224S0300000_15(c013c2, this, c013c, 61));
            c1397580mTM.LJII = false;
            C914370Ztz c914370Ztz = this.LIZIZ;
            if (c914370Ztz.LIZIZ == 2 && c914370Ztz.LIZJ != 2) {
                c013c2.element = true;
                C20744116Fj c20744116Fj = (C20744116Fj) C786410Ut5.Td(C786410Ut5.ne(c914370Ztz.LIZ), R.layout.g4f, null, false);
                C786410Ut5.z7(c20744116Fj, new C986950bn3(c013c, 10));
                c013c.element = c20744116Fj.isChecked();
                C384000F3u.LIZ(c1397580mTM, c20744116Fj);
            }
            C955400ayA.LIZ.LJZL(c013c2.element);
            this.LIZ = new C1397510mTF(c1397580mTM).LJ();
            return;
        }
        C013C c013c3 = new C013C();
        C013C c013c4 = new C013C();
        C755620TkW c755620TkW = new C755620TkW();
        c755620TkW.LIZ = C497740JfY.LJIJI(2131841175);
        c755620TkW.LIZJ = new AcS187S0300000_15(this, c013c4, c013c3, 14);
        C0TZ2 c0tz2 = new C0TZ2(c755620TkW);
        C755630TkX c755630TkX = new C755630TkX();
        c755630TkX.LIZ = C497740JfY.LJIJI(2131841176);
        c755630TkX.LIZJ = new AcS496S0100000_15(c013c4, 76);
        C0TZ3 c0tz3 = new C0TZ3(c755630TkX);
        C494720Jag c494720Jag = new C494720Jag();
        c494720Jag.LIZ(c0tz2);
        c494720Jag.LIZ(c0tz3);
        C494730Jah c494730Jah = new C494730Jah(c494720Jag);
        C782110Um9 c782110Um9 = new C782110Um9(this.LIZIZ.LIZ);
        c782110Um9.LJIIZILJ(2131841178);
        c782110Um9.LJII(LIZIZ());
        c782110Um9.LIZJ(c494730Jah);
        c782110Um9.LJIILLIIL = false;
        C914370Ztz c914370Ztz2 = this.LIZIZ;
        if (c914370Ztz2.LIZIZ == 2 && c914370Ztz2.LIZJ != 2) {
            c013c4.element = true;
            c782110Um9.LJIJJ = new C936740aU4(new AwS584S0100000_5(c013c3, 1215));
        }
        C955400ayA.LIZ.LJZL(c013c4.element);
        LiveDialog liveDialogLIZ = c782110Um9.LIZ();
        this.LIZ = liveDialogLIZ;
        C786410Ut5.B4(liveDialogLIZ);
    }

    public C936730aU3(C914370Ztz c914370Ztz) {
        this.LIZIZ = c914370Ztz;
    }
}
