package X;

import Y.ARunnableS92S0200000_23;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.video.simplayer.ISimPlayerService;
import com.ss.android.ugc.playerkit.radar.SimRadar;
import java.util.List;

/* JADX INFO: renamed from: X.0oi9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1483630oi9 extends AbstractC1483760oiM implements InterfaceC1483880oiY {
    public final InterfaceC1483670oiD LIZIZ;
    public final InterfaceC1483720oiI LIZJ;
    public InterfaceC1482530ogN LIZLLL;
    public C1482520ogM LJ;
    public final C1024680clu LJFF;
    public final C1483680oiE LJI;
    public final C1483310ohd LJII;
    public final C1483740oiK LJIIIIZZ;

    @Override // X.InterfaceC1484830ok5
    public final InterfaceC1483420oho LJIIIZ() {
        InterfaceC1483670oiD interfaceC1483670oiD = this.LIZIZ;
        return new C1481770of9(interfaceC1483670oiD != null ? interfaceC1483670oiD.LJIIIZ() : null);
    }

    @Override // X.InterfaceC1484830ok5
    public final InterfaceC1488100opM LJIILIIL() {
        return new C1483800oiQ(this.LIZIZ);
    }

    @Override // X.InterfaceC1484830ok5
    public final InterfaceC650720Pfi getLegacy() {
        InterfaceC1483670oiD interfaceC1483670oiD = this.LIZIZ;
        if (interfaceC1483670oiD != null) {
            return interfaceC1483670oiD.getLegacy();
        }
        return null;
    }

    @Override // X.InterfaceC1484830ok5
    public final InterfaceC1483850oiV getPlayState() {
        InterfaceC1483670oiD interfaceC1483670oiD = this.LIZIZ;
        return new C1484060oiq(interfaceC1483670oiD != null ? interfaceC1483670oiD.getPlayState() : null);
    }

    @Override // X.InterfaceC1484830ok5
    public final void pause() {
        InterfaceC1483670oiD interfaceC1483670oiD = this.LIZIZ;
        if (interfaceC1483670oiD != null) {
            interfaceC1483670oiD.pause();
        }
        InterfaceC1483720oiI interfaceC1483720oiI = this.LIZJ;
        if (interfaceC1483720oiI != null) {
            interfaceC1483720oiI.pause();
        }
    }

    @Override // X.InterfaceC1484830ok5
    public final void reset() {
        InterfaceC1483670oiD interfaceC1483670oiD = this.LIZIZ;
        if (interfaceC1483670oiD != null) {
            interfaceC1483670oiD.reset();
        }
    }

    @Override // X.InterfaceC1484830ok5
    public final void resume() {
        C1483680oiE c1483680oiE = this.LJI;
        if (c1483680oiE != null) {
            c1483680oiE.resume();
        }
        InterfaceC1483720oiI interfaceC1483720oiI = this.LIZJ;
        if (interfaceC1483720oiI != null) {
            interfaceC1483720oiI.resume();
        }
    }

    @Override // X.InterfaceC1484830ok5
    public final void stop() {
        InterfaceC1483670oiD interfaceC1483670oiD = this.LIZIZ;
        if (interfaceC1483670oiD != null) {
            interfaceC1483670oiD.stop();
        }
        InterfaceC1483720oiI interfaceC1483720oiI = this.LIZJ;
        if (interfaceC1483720oiI != null) {
            interfaceC1483720oiI.stop();
        }
    }

    @Override // X.AbstractC1483760oiM, X.InterfaceC1484830ok5
    public final void release() {
        super.release();
        this.LJIIIIZZ.LIZ(this);
        C1482520ogM c1482520ogM = this.LJ;
        if (c1482520ogM != null) {
            c1482520ogM.LIZLLL(this.LJII);
        }
        InterfaceC1483670oiD interfaceC1483670oiD = this.LIZIZ;
        if (interfaceC1483670oiD != null) {
            interfaceC1483670oiD.LJJIJ(null);
        }
        this.LJ = null;
        InterfaceC1483670oiD interfaceC1483670oiD2 = this.LIZIZ;
        if (interfaceC1483670oiD2 != null) {
            interfaceC1483670oiD2.release();
        }
        C1483680oiE c1483680oiE = this.LJI;
        if (c1483680oiE != null) {
            c1483680oiE.release();
        }
        InterfaceC1483720oiI interfaceC1483720oiI = this.LIZJ;
        if (interfaceC1483720oiI != null) {
            interfaceC1483720oiI.release();
        }
    }

    @Override // X.InterfaceC1484830ok5
    @InterfaceC1294060jmO
    public final InterfaceC1483670oiD LJIILL() {
        return this.LIZIZ;
    }

    public C1483630oi9(C1478410oZj c1478410oZj) {
        InterfaceC1483670oiD interfaceC1483670oiD;
        InterfaceC1483810oiR interfaceC1483810oiRLJIILIIL;
        InterfaceC1483720oiI c1483640oiA;
        InterfaceC1483810oiR interfaceC1483810oiRLJIILIIL2;
        C1024680clu c1024680clu = new C1024680clu();
        this.LJFF = c1024680clu;
        if (C582130MsN.LIZ().getConfig().getSimPlayerExperiment().isOpenPlayerReleaseOpt()) {
            this.LIZIZ = new C1483660oiC(c1478410oZj);
        } else {
            this.LIZIZ = ISimPlayerService.LIZ.get().LJIIIIZZ(new C1476570oWl(c1478410oZj.LJFF, c1478410oZj.LJ, 8));
        }
        C1482520ogM c1482520ogM = new C1482520ogM(this.LIZLLL, this.LIZIZ);
        this.LJ = c1482520ogM;
        c1482520ogM.LLJILJIL = c1024680clu;
        InterfaceC1483670oiD interfaceC1483670oiD2 = this.LIZIZ;
        if (interfaceC1483670oiD2 != null) {
            interfaceC1483670oiD2.LJJIJ(c1482520ogM);
        }
        InterfaceC1483670oiD interfaceC1483670oiD3 = this.LIZIZ;
        if (interfaceC1483670oiD3 != null) {
            interfaceC1483670oiD3.LJIL(C1475000oUE.LJIIIIZZ());
        }
        if ((C582130MsN.LIZ().getConfig().getSimPlayerConfig().perfEventEnabled() || C582130MsN.LIZ().getConfig().getSimPlayerConfig().perfEventEnabledInPlayRequest()) && (interfaceC1483670oiD = this.LIZIZ) != null && (interfaceC1483810oiRLJIILIIL = interfaceC1483670oiD.LJIILIIL()) != null) {
            interfaceC1483810oiRLJIILIIL.LIZ(new C588740N7g());
        }
        InterfaceC1483670oiD interfaceC1483670oiD4 = this.LIZIZ;
        if (interfaceC1483670oiD4 != null && (interfaceC1483810oiRLJIILIIL2 = interfaceC1483670oiD4.LJIILIIL()) != null) {
            interfaceC1483810oiRLJIILIIL2.LIZIZ(new C1481200oeE());
        }
        C1483740oiK c1483740oiK = new C1483740oiK();
        this.LJIIIIZZ = c1483740oiK;
        c1483740oiK.LIZIZ(this);
        if (C582130MsN.LIZ().getConfig().getCommonConfig().simKitStrategyEnabled()) {
            c1483640oiA = new C1483650oiB(c1478410oZj, this.LIZIZ, this.LJ, c1483740oiK);
        } else {
            c1483640oiA = new C1483640oiA(c1478410oZj, this.LIZIZ, this.LJ);
        }
        this.LIZJ = c1483640oiA;
        C1483680oiE c1483680oiE = new C1483680oiE(this.LIZIZ);
        this.LJI = c1483680oiE;
        C1483310ohd c1483310ohd = new C1483310ohd(this.LIZIZ, c1483680oiE);
        this.LJII = c1483310ohd;
        this.LJ.LIZ(c1483310ohd);
        c1483680oiE.LIZIZ(this.LJ);
    }

    @Override // X.InterfaceC1484830ok5
    public final void LIZ(boolean z) {
        InterfaceC1483670oiD interfaceC1483670oiD = this.LIZIZ;
        if (interfaceC1483670oiD != null) {
            interfaceC1483670oiD.LIZ(z);
        }
    }

    @Override // X.InterfaceC1484830ok5
    public final void LIZJ(InterfaceC1483820oiS interfaceC1483820oiS) {
        String simpleName;
        if (!C1480850odf.LIZJ.optGlobalAppAnr()) {
            Object[] objArr = new Object[2];
            FrameLayout playViewContainer = interfaceC1483820oiS.getPlayViewContainer();
            if (playViewContainer != null) {
                simpleName = playViewContainer.getClass().getSimpleName();
            } else {
                simpleName = null;
            }
            objArr[0] = simpleName;
            objArr[1] = interfaceC1483820oiS.getSurface();
            SimRadar.keyScan("PlayerImpl", "attach", objArr);
        }
        C1483680oiE c1483680oiE = this.LJI;
        if (c1483680oiE != null) {
            c1483680oiE.LIZJ(interfaceC1483820oiS);
        }
        InterfaceC1483720oiI interfaceC1483720oiI = this.LIZJ;
        if (interfaceC1483720oiI != null) {
            interfaceC1483720oiI.LIZJ(interfaceC1483820oiS);
        }
    }

    @Override // X.InterfaceC1484830ok5
    public final void LIZLLL(InterfaceC1483820oiS interfaceC1483820oiS) {
        C1483680oiE c1483680oiE = this.LJI;
        if (c1483680oiE != null) {
            c1483680oiE.LIZLLL(interfaceC1483820oiS);
        }
        InterfaceC1483720oiI interfaceC1483720oiI = this.LIZJ;
        if (interfaceC1483720oiI != null) {
            interfaceC1483720oiI.LIZLLL(interfaceC1483820oiS);
        }
    }

    @Override // X.InterfaceC1484830ok5
    public final void LJ(InterfaceC1479620obg interfaceC1479620obg) {
        interfaceC1479620obg.LJIIJ();
        SimRadar.keyScan("PlayerImpl", "play", null, interfaceC1479620obg.getKey());
        if (this.LJ != null) {
            interfaceC1479620obg.LIZLLL();
        }
        C1024680clu c1024680clu = this.LJFF;
        c1024680clu.getClass();
        c1024680clu.LIZIZ = interfaceC1479620obg.getKey();
        C1479570obb c1479570obbLIZLLL = interfaceC1479620obg.LIZLLL();
        if (c1479570obbLIZLLL != null) {
            c1479570obbLIZLLL.LJJIFFI = new ARunnableS92S0200000_23(this, interfaceC1479620obg, 114);
        }
        C1483680oiE c1483680oiE = this.LJI;
        if (c1483680oiE != null) {
            c1483680oiE.LJ(interfaceC1479620obg);
        }
    }

    @Override // X.InterfaceC1483880oiY
    public final void LJI(InterfaceC1023860cka interfaceC1023860cka) {
        C1483680oiE c1483680oiE;
        if ((interfaceC1023860cka instanceof C1483090ohH) && (c1483680oiE = this.LJI) != null) {
            c1483680oiE.LJFF(((C1483090ohH) interfaceC1023860cka).LIZ);
        }
    }

    @Override // X.InterfaceC1484830ok5
    public final void LJIIJJI(InterfaceC1483820oiS interfaceC1483820oiS) {
        C1483680oiE c1483680oiE = this.LJI;
        if (c1483680oiE != null) {
            c1483680oiE.LJIIJJI(interfaceC1483820oiS);
        }
        InterfaceC1483720oiI interfaceC1483720oiI = this.LIZJ;
        if (interfaceC1483720oiI != null) {
            interfaceC1483720oiI.LJIIJJI(interfaceC1483820oiS);
        }
    }

    @Override // X.InterfaceC1484830ok5
    public final void LJIILLIIL(InterfaceC1482530ogN interfaceC1482530ogN) {
        this.LIZLLL = interfaceC1482530ogN;
        C1482520ogM c1482520ogM = this.LJ;
        if (c1482520ogM != null) {
            c1482520ogM.LLILLJJLI = interfaceC1482530ogN;
        }
    }

    @Override // X.AbstractC1483760oiM, X.InterfaceC1484830ok5
    public final void LJIIZILJ(InterfaceC1482530ogN interfaceC1482530ogN) {
        C1482520ogM c1482520ogM = this.LJ;
        if (c1482520ogM != null) {
            c1482520ogM.LIZ(interfaceC1482530ogN);
        }
    }

    @Override // X.InterfaceC1484830ok5
    public final void LJJII(String str) {
        SimRadar.keyScan("PlayerImpl", "clearPlayList", "sceneID", str);
        InterfaceC1483720oiI interfaceC1483720oiI = this.LIZJ;
        if (interfaceC1483720oiI != null) {
            interfaceC1483720oiI.LJJII(str);
        }
    }

    @Override // X.AbstractC1483760oiM, X.InterfaceC1484830ok5
    public final void LJJIIZ(InterfaceC1482530ogN interfaceC1482530ogN) {
        C1482520ogM c1482520ogM = this.LJ;
        if (c1482520ogM != null) {
            c1482520ogM.LIZLLL(interfaceC1482530ogN);
        }
    }

    @Override // X.AbstractC1483760oiM, X.InterfaceC1484830ok5
    public final void LJJIIZI(InterfaceC1481870ofJ interfaceC1481870ofJ) {
        C1482520ogM c1482520ogM = this.LJ;
        if (c1482520ogM != null) {
            c1482520ogM.LLILZ = interfaceC1481870ofJ;
        }
    }

    @Override // X.InterfaceC1484830ok5
    public final void LJJJIL(InterfaceC1479620obg interfaceC1479620obg) {
        InterfaceC1483670oiD interfaceC1483670oiD = this.LIZIZ;
        if (interfaceC1483670oiD != null) {
            interfaceC1483670oiD.LJJJLZIJ(C1479540obY.LIZ(interfaceC1479620obg, null));
        }
    }

    @Override // X.InterfaceC1484830ok5
    public final void LJJJLIIL(InterfaceC1472880oQo interfaceC1472880oQo) {
        InterfaceC1483670oiD interfaceC1483670oiD = this.LIZIZ;
        if (interfaceC1483670oiD != null) {
            interfaceC1483670oiD.LJJZZI(interfaceC1472880oQo);
        }
    }

    @Override // X.AbstractC1483760oiM, X.InterfaceC1484830ok5
    public final void LJJLIIIJL(InterfaceC585470Mxl interfaceC585470Mxl) {
        InterfaceC1483810oiR interfaceC1483810oiRLJIILIIL;
        InterfaceC1483670oiD interfaceC1483670oiD = this.LIZIZ;
        if (interfaceC1483670oiD != null && (interfaceC1483810oiRLJIILIIL = interfaceC1483670oiD.LJIILIIL()) != null) {
            interfaceC1483810oiRLJIILIIL.LIZ(interfaceC585470Mxl);
        }
    }

    @Override // X.InterfaceC1484830ok5
    public final void seek(float f) {
        InterfaceC1483670oiD interfaceC1483670oiD = this.LIZIZ;
        if (interfaceC1483670oiD != null) {
            interfaceC1483670oiD.seek(f);
        }
    }

    @Override // X.InterfaceC1484830ok5
    public final void setLoop(boolean z) {
        InterfaceC1483670oiD interfaceC1483670oiD = this.LIZIZ;
        if (interfaceC1483670oiD != null) {
            interfaceC1483670oiD.setLoop(z);
        }
    }

    @Override // X.InterfaceC1484830ok5
    public final void setSpeed(float f) {
        InterfaceC1483670oiD interfaceC1483670oiD = this.LIZIZ;
        if (interfaceC1483670oiD != null) {
            interfaceC1483670oiD.setSpeed(f);
        }
        this.LJFF.LIZ(f);
    }

    @Override // X.InterfaceC1484830ok5
    public final void stop(String str) {
        InterfaceC1483670oiD interfaceC1483670oiD = this.LIZIZ;
        if (interfaceC1483670oiD != null) {
            interfaceC1483670oiD.stop();
        }
        InterfaceC1483720oiI interfaceC1483720oiI = this.LIZJ;
        if (interfaceC1483720oiI != null) {
            interfaceC1483720oiI.stop();
        }
        C1482520ogM c1482520ogM = this.LJ;
        if (c1482520ogM != null) {
            c1482520ogM.LLIZ = false;
            c1482520ogM.LLIZLLLIL = str;
        }
    }

    @Override // X.InterfaceC1484830ok5
    public final void LJIIIIZZ(String str, List<? extends InterfaceC1479620obg> list) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setPlayList: ");
        sbLIZ.append(list.size());
        C2188811AlT.LIZIZ(sbLIZ);
        SimRadar.keyScan("PlayerImpl", "setPlayList", "sceneID", str, "size", Integer.valueOf(list.size()));
        InterfaceC1483720oiI interfaceC1483720oiI = this.LIZJ;
        if (interfaceC1483720oiI != null) {
            interfaceC1483720oiI.LJIIIIZZ(str, list);
        }
    }
}
