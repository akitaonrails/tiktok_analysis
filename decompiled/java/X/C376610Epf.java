package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS214S0300000_5;
import kotlin.jvm.internal.AwS249S0300000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.AwS5S0410000_5;

/* JADX INFO: renamed from: X.0Epf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C376610Epf {
    public final C1DRG LIZ;
    public final C372480Ej0 LIZIZ;
    public final C376460EpQ LIZJ;
    public final C372540Ej6 LIZLLL;
    public final C380170EvP LJ;
    public final C376430EpN LJFF;
    public final C0E93 LJI;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public final C01GW LJII = C452501pT.LIZIZ(new AwS549S0100000_5(this, 889));
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 890));
    public final C01GW LJIIJJI = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(268));

    public final InterfaceC376450EpP LIZJ() {
        return (InterfaceC376450EpP) this.LIZ.LJIIL(null, InterfaceC376450EpP.class);
    }

    public final VideoPublishEditModel LIZLLL() {
        C0EHJ c0ehj;
        C0EHI value = ((C0EY2) this.LJII.getValue()).zu2().getValue();
        if (value == null || (c0ehj = value.LIZ) == null) {
            return null;
        }
        return c0ehj.LIZ;
    }

    public final void LIZIZ(Function0<Unit> function0) {
        C0EZ1 c0ez1WM2;
        C0EZ2 c0ez2Og1;
        InterfaceC1461350o8D interfaceC1461350o8D = (InterfaceC1461350o8D) this.LIZ.LJIIL(null, InterfaceC1461350o8D.class);
        if (interfaceC1461350o8D != null && (c0ez1WM2 = interfaceC1461350o8D.WM2()) != null && (c0ez2Og1 = c0ez1WM2.Og1()) != null) {
            c0ez2Og1.pZ0(this.LIZIZ, (InterfaceC364330EQd) this.LIZ.LJIIL(null, C0EHC.class), LIZLLL(), function0);
        } else {
            function0.invoke();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0201  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ(kotlin.jvm.functions.Function0<kotlin.Unit> r22, kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.Boolean, kotlin.Unit> r23) {
        /*
            Method dump skipped, instruction units count: 789
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C376610Epf.LIZ(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2):boolean");
    }

    public final void LJFF(Function0 function0, Function2 function2) {
        InterfaceC376450EpP interfaceC376450EpPLIZJ;
        VideoPublishEditModel videoPublishEditModelLIZLLL = LIZLLL();
        if (videoPublishEditModelLIZLLL != null && ((C357610E0h.LIZIZ(videoPublishEditModelLIZLLL) || C379370Eu7.LIZIZ(videoPublishEditModelLIZLLL) || C357620E0i.LIZ()) && (interfaceC376450EpPLIZJ = LIZJ()) != null)) {
            interfaceC376450EpPLIZJ.yC1(false);
        }
        InterfaceC376450EpP interfaceC376450EpPLIZJ2 = LIZJ();
        if (interfaceC376450EpPLIZJ2 != null && interfaceC376450EpPLIZJ2.bZ()) {
            this.LIZJ.LIZIZ(function0, function2, true, true, true, false);
            return;
        }
        C363500EMy c363500EMy = C363500EMy.LIZ;
        VideoPublishEditModel videoPublishEditModelLIZLLL2 = LIZLLL();
        c363500EMy.getClass();
        if (C363500EMy.LJIIJ(videoPublishEditModelLIZLLL2)) {
            C0E12 c0e12 = C363750ENx.LIZ;
            if (c0e12.LIZ("has_show_template_draft_dialog", false)) {
                this.LIZJ.LIZIZ(function0, function2, true, true, true, false);
                return;
            }
            c0e12.LIZIZ("has_show_template_draft_dialog", true);
            C380170EvP c380170EvP = this.LJ;
            AwS249S0300000_5 awS249S0300000_5 = new AwS249S0300000_5(this, (C376610Epf) function0, (Function0<Unit>) function2, (Function2<? super Boolean, ? super Boolean, Unit>) 11);
            c380170EvP.getClass();
            C1397580mTM c1397580mTM = new C1397580mTM(c380170EvP.LIZ.requireSceneContext());
            c1397580mTM.LIZ(2131829628);
            C985403tE.LIZ(c1397580mTM, new AwS584S0100000_5(awS249S0300000_5, 939));
            new C1397510mTF(c1397580mTM).LIZLLL();
            return;
        }
        if (!u4.LJJIL(LIZLLL()) && !C1416310mxZ.LJJJJIZL(LIZLLL()) && !C1416310mxZ.LJJ(LIZLLL())) {
            this.LIZJ.LIZIZ(function0, function2, false, false, true, false);
        } else {
            this.LIZJ.LIZIZ(function0, function2, true, true, true, false);
        }
    }

    public final void LJ(Function2<? super Boolean, ? super Boolean, Unit> function2, C0E48 c0e48, C0ELJ c0elj) {
        InterfaceC376450EpP interfaceC376450EpP;
        C372540Ej6 c372540Ej6 = this.LIZLLL;
        C376540EpY c376540EpY = new C376540EpY(this.LIZJ);
        c372540Ej6.LIZLLL.invoke();
        VideoPublishEditModel videoPublishEditModelLIZIZ = c372540Ej6.LIZIZ();
        if (videoPublishEditModelLIZIZ != null) {
            C361680EFy.LJJJLIIL(videoPublishEditModelLIZIZ, "click_edit_cancel", c0elj.isFromText(), C350870DpF.LJI(c0e48), false, Boolean.valueOf(c0e48.Bo().LIZ()), false);
            if ((C357610E0h.LIZIZ(videoPublishEditModelLIZIZ) || C379370Eu7.LIZIZ(c372540Ej6.LIZIZ()) || C357620E0i.LIZ()) && (interfaceC376450EpP = (InterfaceC376450EpP) c372540Ej6.LIZ.LJIIL(null, InterfaceC376450EpP.class)) != null) {
                interfaceC376450EpP.yC1(true);
            }
        }
        if (c0e48.LLLLLLIL() != null) {
            ((C0E5S) c372540Ej6.LJI.getValue()).w6(null, false, false);
        }
        VideoPublishEditModel videoPublishEditModelLIZIZ2 = c372540Ej6.LIZIZ();
        C363500EMy.LIZ.getClass();
        if ((C363500EMy.LJIIJ(videoPublishEditModelLIZIZ2) || ((Boolean) c376540EpY.invoke()).booleanValue() || C1416310mxZ.LJJJJIZL(videoPublishEditModelLIZIZ2)) && videoPublishEditModelLIZIZ2 != null && videoPublishEditModelLIZIZ2.creativeModel.draftInfoModel.isDraft && !videoPublishEditModelLIZIZ2.isFromCrash()) {
            InterfaceC1453420nvQ interfaceC1453420nvQ = (InterfaceC1453420nvQ) c372540Ej6.LIZ.LJIIL(null, InterfaceC1453420nvQ.class);
            if (interfaceC1453420nvQ != null) {
                interfaceC1453420nvQ.dC1();
            }
        } else {
            c372540Ej6.LIZ(function2, true);
        }
        if (C363500EMy.LJIIJ(videoPublishEditModelLIZIZ2) && videoPublishEditModelLIZIZ2 != null) {
            C361680EFy.LJJIIZI(videoPublishEditModelLIZIZ2, C350870DpF.LJI(c0e48), videoPublishEditModelLIZIZ2.getVideoLength(), true);
        }
    }

    public final void LJI(VideoPublishEditModel videoPublishEditModel, boolean z, Function2 function2, Function0 function0) {
        int i;
        if (!C1428470nHB.LJJJJIZL(videoPublishEditModel) && !C377240Eqg.LIZIZ(videoPublishEditModel)) {
            i = 2131846553;
        } else {
            i = 2131825353;
        }
        C380170EvP c380170EvP = this.LJ;
        AwS214S0300000_5 awS214S0300000_5 = new AwS214S0300000_5(this, (C376610Epf) function2, (Function2<? super Boolean, ? super Boolean, Unit>) videoPublishEditModel, (VideoPublishEditModel) 27);
        AwS5S0410000_5 awS5S0410000_5 = new AwS5S0410000_5(videoPublishEditModel, (VideoPublishEditModel) this, (C376610Epf) function2, (Function2<? super Boolean, ? super Boolean, Unit>) z, (boolean) function0, (Function0<Unit>) 2);
        AwS584S0100000_5 awS584S0100000_5 = new AwS584S0100000_5(videoPublishEditModel, 754);
        c380170EvP.getClass();
        C380170EvP.LIZ(c380170EvP, new C380160EvO[]{new C380160EvO(1, 2131846554, R.raw.icon_trash_bin, new AwS584S0100000_5(awS214S0300000_5, 936)), new C380160EvO(0, i, R.raw.icon_draft, new AwS584S0100000_5(awS5S0410000_5, 937))}, awS584S0100000_5);
    }

    public C376610Epf(C1DRG c1drg, C372480Ej0 c372480Ej0, C376460EpQ c376460EpQ, C372540Ej6 c372540Ej6, C380170EvP c380170EvP, C376430EpN c376430EpN, C0E93 c0e93) {
        this.LIZ = c1drg;
        this.LIZIZ = c372480Ej0;
        this.LIZJ = c376460EpQ;
        this.LIZLLL = c372540Ej6;
        this.LJ = c380170EvP;
        this.LJFF = c376430EpN;
        this.LJI = c0e93;
    }
}
