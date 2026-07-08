package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import ge.i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.128y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C197082128y extends i<InterfaceC391330FVz, C197004125y, C389230FNx, C197081128x> implements InterfaceC391330FVz, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public final C1DRG LLJILJILJ;
    public final C19A3 LLJILLL;
    public final C01GW LLJJ;
    public final InterfaceC1731706qJ LLJJI;
    public final Function0<C197081128x> LLJJIII;
    public final C01GW LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C197082128y.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    private final InterfaceC1446740nke JY0() {
        return (InterfaceC1446740nke) this.LLJJ.getValue();
    }

    private final InterfaceC362610EJn K4() {
        return (InterfaceC362610EJn) this.LLJJIJI.getValue();
    }

    public final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLJJI.getValue(this, LLJJIJIIJIL[0]);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C389230FNx> o2() {
        return new AwS573S0100000_29(this, 625);
    }

    private final InterfaceC524950KiL H4() {
        InterfaceC524950KiL interfaceC524950KiL = (InterfaceC524950KiL) getDiContainer().LJIIL(null, InterfaceC524950KiL.class);
        return interfaceC524950KiL == null ? C0MWZ.LIZ(this.LLJILLL) : interfaceC524950KiL;
    }

    public final void F4() {
        super.hide();
        InterfaceC1446740nke interfaceC1446740nkeJY0 = JY0();
        if (interfaceC1446740nkeJY0 != null) {
            C1456140nzo.LIZIZ(interfaceC1446740nkeJY0, true, false, false, false, 12);
        }
        InterfaceC524950KiL interfaceC524950KiLH4 = H4();
        if (interfaceC524950KiLH4 != null) {
            interfaceC524950KiLH4.b8(K4());
        }
    }

    @Override // ge.i
    public int H3() {
        if (C301660Bs4.LIZ()) {
            return 0;
        }
        return R.anim.hx;
    }

    @Override // ge.i, X.InterfaceC1455500nym
    public void hide() {
        if (C301660Bs4.LIZ()) {
            c3(AFwS273S0000000_29.get$arr$(208));
            return;
        }
        super.hide();
        InterfaceC1446740nke interfaceC1446740nkeJY0 = JY0();
        if (interfaceC1446740nkeJY0 != null) {
            C1456140nzo.LIZIZ(interfaceC1446740nkeJY0, true, false, false, false, 12);
        }
        InterfaceC524950KiL interfaceC524950KiLH4 = H4();
        if (interfaceC524950KiLH4 != null) {
            interfaceC524950KiLH4.b8(K4());
        }
    }

    @Override // ge.i
    public int v3() {
        if (C301660Bs4.LIZ()) {
            return 0;
        }
        return R.anim.hy;
    }

    public final void exit() {
        hide();
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILJILJ;
    }

    public final C19A3 getParentScene() {
        return this.LLJILLL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C197081128x> w2() {
        return this.LLJJIII;
    }

    @Override // X.InterfaceC391330FVz
    public void GZ0(EnumC366550EYr enumC366550EYr) {
        super.show();
        i3(new AwS608S0100000_29(enumC366550EYr, 358));
        InterfaceC1446740nke interfaceC1446740nkeJY0 = JY0();
        if (interfaceC1446740nkeJY0 != null) {
            C1456140nzo.LIZIZ(interfaceC1446740nkeJY0, false, false, false, false, 12);
        }
        InterfaceC524950KiL interfaceC524950KiLH4 = H4();
        if (interfaceC524950KiLH4 != null) {
            interfaceC524950KiLH4.kF(K4());
        }
    }

    public C197082128y(C1DRG c1drg, C19A3 c19a3) {
        super(c19a3);
        this.LLJILJILJ = c1drg;
        this.LLJILLL = c19a3;
        this.LLJJ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 608));
        this.LLJJI = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLJJIII = new AwS573S0100000_29(this, 627);
        this.LLJJIJI = C452501pT.LIZIZ(new AwS573S0100000_29(this, 626));
    }
}
