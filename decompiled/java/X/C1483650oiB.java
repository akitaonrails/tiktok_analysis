package X;

import com.ss.android.ugc.playerkit.radar.SimRadar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/* JADX INFO: renamed from: X.0oiB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1483650oiB implements InterfaceC1483720oiI, InterfaceC1023870ckb {
    public List<InterfaceC1483720oiI> LIZ = new ArrayList();
    public List<InterfaceC1023870ckb> LIZIZ = new ArrayList();
    public C1482520ogM LIZJ;
    public InterfaceC1483670oiD LIZLLL;
    public C1482720ogg LJ;
    public InterfaceC1483860oiW LJFF;

    @Override // X.InterfaceC1483720oiI
    public final /* synthetic */ InterfaceC1482530ogN LIZ() {
        return null;
    }

    @Override // X.InterfaceC1483720oiI
    public final void pause() {
        List<InterfaceC1483720oiI> list = this.LIZ;
        if (list == null) {
            return;
        }
        Iterator<InterfaceC1483720oiI> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().pause();
        }
    }

    @Override // X.InterfaceC1483720oiI
    public final void release() {
        C1482520ogM c1482520ogM;
        List<InterfaceC1483720oiI> list = this.LIZ;
        if (list == null) {
            return;
        }
        for (InterfaceC1483720oiI interfaceC1483720oiI : list) {
            interfaceC1483720oiI.release();
            if (interfaceC1483720oiI.LIZ() != null && (c1482520ogM = this.LIZJ) != null) {
                c1482520ogM.LIZLLL(interfaceC1483720oiI.LIZ());
            }
        }
        this.LIZ.clear();
        this.LIZIZ.clear();
        this.LIZIZ = null;
        this.LIZ = null;
        this.LIZJ = null;
        this.LIZLLL = null;
        this.LJ = null;
        this.LJFF = null;
    }

    @Override // X.InterfaceC1483720oiI
    public final void resume() {
        List<InterfaceC1483720oiI> list = this.LIZ;
        if (list == null) {
            return;
        }
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1483720oiI) it2.next()).resume();
        }
    }

    @Override // X.InterfaceC1483720oiI
    public final void stop() {
        List<InterfaceC1483720oiI> list = this.LIZ;
        if (list == null) {
            return;
        }
        Iterator<InterfaceC1483720oiI> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().stop();
        }
    }

    public final void LIZIZ(AbstractC1483700oiG abstractC1483700oiG) {
        C1482520ogM c1482520ogM;
        if (abstractC1483700oiG.LJIIL() && !((ArrayList) this.LIZ).contains(abstractC1483700oiG)) {
            SimRadar.keyScan("StrategyManager", "registerStrategy", abstractC1483700oiG.getClass().getSimpleName());
            abstractC1483700oiG.LJFF(this.LIZLLL);
            abstractC1483700oiG.LIZIZ(this.LIZJ);
            if (abstractC1483700oiG.LIZ() != null && (c1482520ogM = this.LIZJ) != null) {
                c1482520ogM.LIZ(abstractC1483700oiG.LIZ());
            }
            InterfaceC1483860oiW interfaceC1483860oiW = this.LJFF;
            abstractC1483700oiG.LIZIZ = interfaceC1483860oiW;
            interfaceC1483860oiW.LIZIZ(abstractC1483700oiG);
            abstractC1483700oiG.LIZ = this.LJ;
            if (abstractC1483700oiG.LJIIIZ() != null && !((ArrayList) this.LIZIZ).contains(abstractC1483700oiG.LJIIIZ())) {
                ((ArrayList) this.LIZIZ).add(abstractC1483700oiG.LJIIIZ());
            }
            ((ArrayList) this.LIZ).add(abstractC1483700oiG);
        }
    }

    @Override // X.InterfaceC1483720oiI
    public final void LIZJ(InterfaceC1483820oiS interfaceC1483820oiS) {
        List<InterfaceC1483720oiI> list = this.LIZ;
        if (list == null) {
            return;
        }
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1483720oiI) it2.next()).LIZJ(interfaceC1483820oiS);
        }
    }

    @Override // X.InterfaceC1483720oiI
    public final void LIZLLL(InterfaceC1483820oiS interfaceC1483820oiS) {
        List<InterfaceC1483720oiI> list = this.LIZ;
        if (list == null) {
            return;
        }
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1483720oiI) it2.next()).LIZLLL(interfaceC1483820oiS);
        }
    }

    @Override // X.InterfaceC1483720oiI
    public final void LJ(InterfaceC1479620obg interfaceC1479620obg) {
        C1482720ogg c1482720ogg = this.LJ;
        if (c1482720ogg != null) {
            c1482720ogg.LJIIIIZZ(interfaceC1479620obg);
        }
        List<InterfaceC1483720oiI> list = this.LIZ;
        if (list == null) {
            return;
        }
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1483720oiI) it2.next()).LJ(interfaceC1479620obg);
        }
    }

    @Override // X.InterfaceC1483720oiI
    public final void LJIIJJI(InterfaceC1483820oiS interfaceC1483820oiS) {
        List<InterfaceC1483720oiI> list = this.LIZ;
        if (list == null) {
            return;
        }
        Iterator<InterfaceC1483720oiI> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().LJIIJJI(interfaceC1483820oiS);
        }
    }

    @Override // X.InterfaceC1483720oiI
    public final void LJJII(String str) {
        C1482720ogg c1482720ogg = this.LJ;
        if (c1482720ogg != null) {
            c1482720ogg.LIZ.remove(str);
        }
        List<InterfaceC1483720oiI> list = this.LIZ;
        if (list == null) {
            return;
        }
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1483720oiI) it2.next()).LJJII(str);
        }
    }

    @Override // X.InterfaceC1483720oiI
    public final void LJIIIIZZ(String str, List<InterfaceC1479620obg> list) {
        C1482720ogg c1482720ogg = this.LJ;
        if (c1482720ogg != null) {
            c1482720ogg.LJIIIZ(str, list);
        }
        List<InterfaceC1483720oiI> list2 = this.LIZ;
        if (list2 == null) {
            return;
        }
        Iterator it2 = ((ArrayList) list2).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1483720oiI) it2.next()).LJIIIIZZ(str, list);
        }
    }

    public C1483650oiB(C1478410oZj c1478410oZj, InterfaceC1483670oiD interfaceC1483670oiD, C1482520ogM c1482520ogM, C1483740oiK c1483740oiK) {
        new Stack();
        this.LIZJ = c1482520ogM;
        this.LIZLLL = interfaceC1483670oiD;
        this.LJFF = c1483740oiK;
        this.LJ = new C1482720ogg();
        this.LIZJ.LJFF(new C1482540ogO());
        LIZIZ(new C1482850ogt());
        LIZIZ(new C1482680ogc(c1478410oZj));
        LIZIZ(new C1482900ogy(c1478410oZj));
        LIZIZ(new C1483300ohc());
        LIZIZ(new C1483000oh8());
    }
}
