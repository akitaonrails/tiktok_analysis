package X;

import android.util.LruCache;
import com.ss.android.ugc.playerkit.radar.SimRadar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oiA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1483640oiA implements InterfaceC1483720oiI {
    public final List<InterfaceC1483720oiI> LIZ = new ArrayList();
    public C1482520ogM LIZIZ;
    public InterfaceC1483670oiD LIZJ;
    public final C1483840oiU LIZLLL;
    public final C1483740oiK LJ;

    @Override // X.InterfaceC1483720oiI
    public final /* synthetic */ InterfaceC1482530ogN LIZ() {
        return null;
    }

    @Override // X.InterfaceC1483720oiI
    public final void pause() {
        Iterator it2 = ((ArrayList) this.LIZ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1483720oiI) it2.next()).pause();
        }
    }

    @Override // X.InterfaceC1483720oiI
    public final void release() {
        Iterator it2 = ((ArrayList) this.LIZ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1483720oiI) it2.next()).release();
        }
        ((ArrayList) this.LIZ).clear();
        this.LIZIZ = null;
        this.LIZJ = null;
    }

    @Override // X.InterfaceC1483720oiI
    public final void resume() {
        Iterator it2 = ((ArrayList) this.LIZ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1483720oiI) it2.next()).resume();
        }
    }

    @Override // X.InterfaceC1483720oiI
    public final void stop() {
        Iterator it2 = ((ArrayList) this.LIZ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1483720oiI) it2.next()).stop();
        }
    }

    public final void LIZIZ(AbstractC1483700oiG abstractC1483700oiG) {
        if (abstractC1483700oiG.LJIIL() && !((ArrayList) this.LIZ).contains(abstractC1483700oiG)) {
            SimRadar.keyScan("PlayerHookManager", "addStrategy", abstractC1483700oiG.getClass().getSimpleName());
            abstractC1483700oiG.LJFF(this.LIZJ);
            abstractC1483700oiG.LIZIZ(this.LIZIZ);
            C1483740oiK c1483740oiK = this.LJ;
            abstractC1483700oiG.LIZIZ = c1483740oiK;
            c1483740oiK.LIZIZ(abstractC1483700oiG);
            if (abstractC1483700oiG.LJII() != null) {
                C1483840oiU c1483840oiU = this.LIZLLL;
                InterfaceC1023870ckb interfaceC1023870ckbLJII = abstractC1483700oiG.LJII();
                if (!((ArrayList) c1483840oiU.LIZ).contains(interfaceC1023870ckbLJII)) {
                    ((ArrayList) c1483840oiU.LIZ).add(interfaceC1023870ckbLJII);
                }
            }
            ((ArrayList) this.LIZ).add(abstractC1483700oiG);
        }
    }

    @Override // X.InterfaceC1483720oiI
    public final void LIZJ(InterfaceC1483820oiS interfaceC1483820oiS) {
        Iterator it2 = ((ArrayList) this.LIZ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1483720oiI) it2.next()).LIZJ(interfaceC1483820oiS);
        }
    }

    @Override // X.InterfaceC1483720oiI
    public final void LIZLLL(InterfaceC1483820oiS interfaceC1483820oiS) {
        Iterator it2 = ((ArrayList) this.LIZ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1483720oiI) it2.next()).LIZLLL(interfaceC1483820oiS);
        }
    }

    @Override // X.InterfaceC1483720oiI
    public final void LJ(InterfaceC1479620obg interfaceC1479620obg) {
        Iterator it2 = ((ArrayList) this.LIZ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1483720oiI) it2.next()).LJ(interfaceC1479620obg);
        }
    }

    @Override // X.InterfaceC1483720oiI
    public final void LJIIJJI(InterfaceC1483820oiS interfaceC1483820oiS) {
        Iterator it2 = ((ArrayList) this.LIZ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1483720oiI) it2.next()).LJIIJJI(interfaceC1483820oiS);
        }
    }

    @Override // X.InterfaceC1483720oiI
    public final void LJJII(String str) {
        Iterator it2 = ((ArrayList) this.LIZ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1483720oiI) it2.next()).LJJII(str);
        }
    }

    @Override // X.InterfaceC1483720oiI
    public final void LJIIIIZZ(String str, List<InterfaceC1479620obg> list) {
        Iterator it2 = ((ArrayList) this.LIZ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1483720oiI) it2.next()).LJIIIIZZ(str, list);
        }
    }

    public C1483640oiA(C1478410oZj c1478410oZj, InterfaceC1483670oiD interfaceC1483670oiD, C1482520ogM c1482520ogM) {
        this.LIZIZ = c1482520ogM;
        this.LIZJ = interfaceC1483670oiD;
        C1483840oiU c1483840oiU = new C1483840oiU();
        this.LIZLLL = c1483840oiU;
        final C1483830oiT c1483830oiT = new C1483830oiT(this.LIZJ);
        this.LJ = new C1483740oiK();
        c1482520ogM.LJFF(c1483840oiU.LIZIZ);
        C1482690ogd c1482690ogd = new C1482690ogd(c1478410oZj);
        C1482990oh7 c1482990oh7 = new C1482990oh7();
        c1482690ogd.LJIJJ = c1482990oh7.LJ.LIZJ;
        LIZIZ(new C1482850ogt());
        LIZIZ(new AbstractC1483700oiG(c1483830oiT) { // from class: X.0oiH
            public final C1483830oiT LIZLLL;

            @Override // X.AbstractC1483700oiG, X.InterfaceC1483720oiI
            public final void resume() {
                InterfaceC1483780oiO interfaceC1483780oiO = this.LIZLLL.LIZIZ;
                if (interfaceC1483780oiO != null) {
                    interfaceC1483780oiO.resume();
                }
            }

            @Override // X.AbstractC1483700oiG
            public final boolean LJIIL() {
                return C582130MsN.LIZ().getConfig().isEnablePlayerImplRefactor();
            }

            @Override // X.AbstractC1483700oiG, X.InterfaceC1483720oiI
            public final void release() {
                super.release();
                C1483830oiT c1483830oiT2 = this.LIZLLL;
                C1483890oiZ c1483890oiZ = c1483830oiT2.LIZLLL;
                c1483890oiZ.LIZIZ.LJFF();
                c1483890oiZ.LIZ = null;
                c1483890oiZ.LIZJ = null;
                c1483890oiZ.LJ = null;
                c1483890oiZ.LJFF = null;
                c1483890oiZ.LIZIZ = null;
                C1483730oiJ c1483730oiJ = c1483830oiT2.LIZJ;
                c1483730oiJ.LIZ = null;
                c1483730oiJ.LIZIZ = null;
                c1483830oiT2.LIZIZ = null;
                c1483830oiT2.LIZJ = null;
                c1483830oiT2.LIZLLL = null;
            }

            {
                this.LIZLLL = c1483830oiT;
            }

            @Override // X.AbstractC1483700oiG
            public final void LIZIZ(C1482520ogM c1482520ogM2) {
                InterfaceC1483780oiO interfaceC1483780oiO = this.LIZLLL.LIZIZ;
                if (interfaceC1483780oiO != null) {
                    interfaceC1483780oiO.LIZIZ(c1482520ogM2);
                }
            }

            @Override // X.AbstractC1483700oiG, X.InterfaceC1483720oiI
            public final void LIZJ(InterfaceC1483820oiS interfaceC1483820oiS) {
                C1483830oiT c1483830oiT2 = this.LIZLLL;
                c1483830oiT2.getClass();
                if (interfaceC1483820oiS.getPlayViewContainer() != null) {
                    c1483830oiT2.LIZIZ = c1483830oiT2.LIZLLL;
                } else {
                    c1483830oiT2.LIZIZ = c1483830oiT2.LIZJ;
                }
                c1483830oiT2.LIZIZ.LIZJ(interfaceC1483820oiS);
            }

            @Override // X.AbstractC1483700oiG, X.InterfaceC1483720oiI
            public final void LIZLLL(InterfaceC1483820oiS interfaceC1483820oiS) {
                this.LIZLLL.LIZIZ.LIZLLL(interfaceC1483820oiS);
            }

            @Override // X.AbstractC1483700oiG, X.InterfaceC1483720oiI
            public final void LJ(InterfaceC1479620obg interfaceC1479620obg) {
                InterfaceC1483780oiO interfaceC1483780oiO = this.LIZLLL.LIZIZ;
                if (interfaceC1483780oiO != null) {
                    interfaceC1483780oiO.LJ(interfaceC1479620obg);
                }
            }

            @Override // X.AbstractC1483700oiG
            public final void LJFF(InterfaceC1483670oiD interfaceC1483670oiD2) {
                this.LIZJ = interfaceC1483670oiD2;
            }

            @Override // X.AbstractC1483700oiG, X.InterfaceC1483880oiY
            public final void LJI(InterfaceC1023860cka interfaceC1023860cka) {
                if (interfaceC1023860cka instanceof C1483090ohH) {
                    C1483830oiT c1483830oiT2 = this.LIZLLL;
                    C1484040oio c1484040oio = ((C1483090ohH) interfaceC1023860cka).LIZ;
                    InterfaceC1483780oiO interfaceC1483780oiO = c1483830oiT2.LIZIZ;
                    if (interfaceC1483780oiO != null) {
                        interfaceC1483780oiO.LJFF(c1484040oio);
                    }
                }
            }

            @Override // X.AbstractC1483700oiG, X.InterfaceC1483720oiI
            public final void LJIIJJI(InterfaceC1483820oiS interfaceC1483820oiS) {
                InterfaceC1483780oiO interfaceC1483780oiO = this.LIZLLL.LIZIZ;
                if (interfaceC1483780oiO != null) {
                    interfaceC1483780oiO.LJI();
                }
            }
        });
        LIZIZ(c1482690ogd);
        LIZIZ(new C1482900ogy(c1478410oZj));
        LIZIZ(new C1483300ohc());
        LIZIZ(c1482990oh7);
        final InterfaceC1483670oiD interfaceC1483670oiD2 = this.LIZJ;
        c1482520ogM.LIZ(new C0S3K(interfaceC1483670oiD2, c1483830oiT) { // from class: X.0ohe
            public final InterfaceC1483670oiD LL;
            public final C1483830oiT LLILLJJLI;
            public final LruCache<String, Boolean> LLILLL = new LruCache<>(10);
            public final boolean LLILZ = C582130MsN.LIZ().getConfig().getSimPlayerExperiment().enableSoftwareDecodeBlockIssueOpt();

            {
                this.LL = interfaceC1483670oiD2;
                this.LLILLJJLI = c1483830oiT;
            }

            @Override // X.C0S3K, X.InterfaceC1482530ogN
            public final void onPreparePlay(String str, C1480430ocz c1480430ocz) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onPreparePlay: ");
                sbLIZ.append(str);
                C2188811AlT.LIZIZ(sbLIZ);
                if (this.LLILZ) {
                    this.LLILLL.put(str, Boolean.FALSE);
                }
            }

            @Override // X.C0S3K, X.InterfaceC1482530ogN
            public final void onRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
                boolean z;
                C1483830oiT c1483830oiT2;
                InterfaceC1483780oiO interfaceC1483780oiO;
                if (this.LLILZ) {
                    this.LLILLL.put(str, Boolean.TRUE);
                }
                int iLIZLLL = this.LL.LJIIIZ().LIZLLL();
                if (iLIZLLL != 6 && iLIZLLL != 4) {
                    z = false;
                } else {
                    z = true;
                }
                C786410Ut5.j4("onRenderFirstFrame: key:%s, softwareDecode:%s, codecName:%s", new Object[]{str, Boolean.valueOf(z), Integer.valueOf(iLIZLLL)});
                if (z && (c1483830oiT2 = this.LLILLJJLI) != null && (interfaceC1483780oiO = c1483830oiT2.LIZIZ) != null) {
                    interfaceC1483780oiO.LIZ();
                }
            }

            @Override // X.C0S3K, X.InterfaceC1482530ogN
            public final void onPlayStop(String str, JSONObject jSONObject, C1480430ocz c1480430ocz) {
                C1483830oiT c1483830oiT2;
                InterfaceC1483780oiO interfaceC1483780oiO;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onPlayStop: ");
                sbLIZ.append(str);
                C2188811AlT.LIZIZ(sbLIZ);
                if (this.LLILZ) {
                    Boolean bool = this.LLILLL.get(str);
                    if ((bool == null || !bool.booleanValue()) && (c1483830oiT2 = this.LLILLJJLI) != null && (interfaceC1483780oiO = c1483830oiT2.LIZIZ) != null) {
                        interfaceC1483780oiO.LIZ();
                    }
                }
            }
        });
    }
}
