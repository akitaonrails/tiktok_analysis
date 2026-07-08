package X;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0oiZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1483890oiZ implements InterfaceC1483780oiO {
    public InterfaceC1483670oiD LIZ;
    public C1483920oic LIZJ;
    public InterfaceC1483990oij LIZLLL;
    public C1482520ogM LJFF;
    public C1482590ogT LIZIZ = new C1482590ogT();
    public C339460DSm LJ = new C339460DSm();
    public String LJI = null;

    @Override // X.InterfaceC1483780oiO
    public final void LJI() {
    }

    @Override // X.InterfaceC1483780oiO
    public final void LIZ() {
        InterfaceC1483990oij interfaceC1483990oij = this.LIZLLL;
        if (interfaceC1483990oij != null) {
            interfaceC1483990oij.LJIJ();
        }
    }

    @Override // X.InterfaceC1483780oiO
    public final void resume() {
        C1483920oic c1483920oic = this.LIZJ;
        if (c1483920oic != null) {
            c1483920oic.LIZJ();
        } else {
            this.LIZ.resume();
        }
    }

    public C1483890oiZ(InterfaceC1483670oiD interfaceC1483670oiD) {
        this.LIZJ = null;
        this.LIZ = interfaceC1483670oiD;
        this.LIZJ = new C1483920oic(interfaceC1483670oiD);
    }

    @Override // X.InterfaceC1483780oiO
    public final void LIZIZ(C1482520ogM c1482520ogM) {
        this.LJFF = c1482520ogM;
    }

    @Override // X.InterfaceC1483780oiO
    public final void LIZJ(InterfaceC1483820oiS interfaceC1483820oiS) {
        this.LJ.LIZ(interfaceC1483820oiS.getPlayViewContainer());
        this.LIZLLL = LJII(interfaceC1483820oiS);
    }

    @Override // X.InterfaceC1483780oiO
    public final void LIZLLL(InterfaceC1483820oiS interfaceC1483820oiS) {
        InterfaceC1483990oij interfaceC1483990oijLJII = LJII(interfaceC1483820oiS);
        this.LIZLLL = interfaceC1483990oijLJII;
        new RunnableC1483950oif(this.LIZ, interfaceC1483990oijLJII).run();
    }

    @Override // X.InterfaceC1483780oiO
    public final void LJ(InterfaceC1479620obg interfaceC1479620obg) {
        this.LIZJ.LIZ(interfaceC1479620obg, this.LIZLLL);
        C786410Ut5.j4("play when videoView attached. aid:%s", new Object[]{interfaceC1479620obg.getKey()});
    }

    @Override // X.InterfaceC1483780oiO
    public final void LJFF(C1484040oio c1484040oio) {
        InterfaceC1483990oij interfaceC1483990oijLIZLLL;
        InterfaceC1479620obg interfaceC1479620obg = c1484040oio.LIZ;
        boolean z = c1484040oio.LIZIZ;
        int i = c1484040oio.LIZJ;
        FrameLayout frameLayoutLIZIZ = this.LJ.LIZIZ(z);
        if (frameLayoutLIZIZ == null) {
            C786410Ut5.j4("preRender nearbyContainer null, return. aid:%s, type:%s, isBelowCurrent:%s", new Object[]{interfaceC1479620obg.getKey(), Integer.valueOf(i), Boolean.valueOf(z)});
            return;
        }
        if (TextUtils.equals(interfaceC1479620obg.getKey(), this.LJI)) {
            C786410Ut5.j4("triggerPreRender. mPreparingAid exists, return. mPreparingAid:%s, type:%s, isBelowCurrent:%s", new Object[]{this.LJI, Integer.valueOf(i), Boolean.valueOf(z)});
            return;
        }
        this.LJI = interfaceC1479620obg.getKey();
        View viewFindViewWithTag = frameLayoutLIZIZ.findViewWithTag("VIDEO_VIEW_TAG");
        if (viewFindViewWithTag == null) {
            C786410Ut5.j4("do preRender when videoView null. aid:%s, type:%s, isBelowCurrent:%s", new Object[]{interfaceC1479620obg.getKey(), Integer.valueOf(i), Boolean.valueOf(z)});
            interfaceC1483990oijLIZLLL = this.LIZIZ.LIZ(frameLayoutLIZIZ);
            interfaceC1483990oijLIZLLL.LJIJJ(frameLayoutLIZIZ);
        } else {
            C786410Ut5.j4("do preRender when videoView attached. aid:%s, type:%s, isBelowCurrent:%s", new Object[]{interfaceC1479620obg.getKey(), Integer.valueOf(i), Boolean.valueOf(z)});
            interfaceC1483990oijLIZLLL = this.LIZIZ.LIZLLL(viewFindViewWithTag);
            if (interfaceC1483990oijLIZLLL == null) {
                C786410Ut5.j4("preRender surfaceHolder null, return. aid:%s, type:%s, isBelowCurrent:%s", new Object[]{interfaceC1479620obg.getKey(), Integer.valueOf(i), Boolean.valueOf(z)});
                return;
            }
        }
        EnumC1481210oeF.INS.recordPreRenderAction(this.LJI, i);
        C786410Ut5.j4("really do preRender. aid:%s, type:%s, isBelowCurrent:%s", new Object[]{interfaceC1479620obg.getKey(), Integer.valueOf(i), Boolean.valueOf(z)});
        if (interfaceC1479620obg.LIZLLL() != null) {
            interfaceC1479620obg.LIZLLL().LIZ = this.LJFF;
        }
        new C1483970oih(this.LIZ, interfaceC1483990oijLIZLLL, interfaceC1479620obg).run();
    }

    public final InterfaceC1483990oij LJII(InterfaceC1483820oiS interfaceC1483820oiS) {
        FrameLayout playViewContainer = interfaceC1483820oiS.getPlayViewContainer();
        View viewFindViewWithTag = playViewContainer.findViewWithTag("VIDEO_VIEW_TAG");
        Boolean boolValueOf = Boolean.valueOf(interfaceC1483820oiS.bn());
        interfaceC1483820oiS.hj();
        if (viewFindViewWithTag == null) {
            InterfaceC1483990oij interfaceC1483990oijLIZIZ = this.LIZIZ.LIZIZ(playViewContainer, boolValueOf, false);
            if (interfaceC1483820oiS.getCustomSurfaceLifecycleListener() != null) {
                interfaceC1483990oijLIZIZ.LJIIJJI(interfaceC1483820oiS.getCustomSurfaceLifecycleListener());
            }
            interfaceC1483990oijLIZIZ.LJIJJ(playViewContainer);
            C786410Ut5.j4("attach when videoView null. container:%s", new Object[]{playViewContainer});
            return interfaceC1483990oijLIZIZ;
        }
        return this.LIZIZ.LIZLLL(viewFindViewWithTag);
    }
}
