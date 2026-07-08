package X;

import com.ss.android.ugc.playerkit.radar.IRadarTransmitter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0oRF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1473150oRF implements InterfaceC1473180oRI {
    public final String LIZ;
    public final List<InterfaceC1473180oRI> LIZIZ;
    public int LIZJ;
    public String LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public final C1473190oRJ LJI;

    @Override // X.InterfaceC1473180oRI
    public final void LIZIZ() {
        this.LJ = false;
        this.LJFF = false;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enginePlay:");
        sbLIZ.append(this.LIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        Iterator<InterfaceC1473180oRI> it2 = this.LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ();
        }
    }

    @Override // X.InterfaceC1473180oRI
    public final void LIZJ() {
        this.LJ = false;
        this.LJFF = false;
        this.LIZLLL = null;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startVideo:");
        sbLIZ.append(this.LIZ);
        sbLIZ.append("----------------------------V");
        C2188811AlT.LIZIZ(sbLIZ);
        IRadarTransmitter iRadarTransmitterLJIIIZ = C1475000oUE.LJIIIZ();
        if (iRadarTransmitterLJIIIZ != null) {
            iRadarTransmitterLJIIIZ.startVideo(this.LIZ);
        }
        Iterator<InterfaceC1473180oRI> it2 = this.LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZJ();
        }
    }

    @Override // X.InterfaceC1473180oRI
    public final void LIZ() {
        Iterator<InterfaceC1473180oRI> it2 = this.LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ();
        }
    }

    @Override // X.InterfaceC1473180oRI
    public final void LJ() {
        String str = this.LIZLLL;
        if (str != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("reportPlayEnd:");
            sbLIZ.append(this.LIZ);
            sbLIZ.append(',');
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        Iterator<InterfaceC1473180oRI> it2 = this.LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LJ();
        }
    }

    @Override // X.InterfaceC1473180oRI
    public final void LJFF() {
        if (!this.LJ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("enginePause:");
            sbLIZ.append(this.LIZ);
            C2188811AlT.LIZIZ(sbLIZ);
            Iterator<InterfaceC1473180oRI> it2 = this.LIZIZ.iterator();
            while (it2.hasNext()) {
                it2.next().LJFF();
            }
        }
        this.LJ = true;
    }

    @Override // X.InterfaceC1473180oRI
    public final void LJI() {
        Iterator<InterfaceC1473180oRI> it2 = this.LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LJI();
        }
    }

    @Override // X.InterfaceC1473180oRI
    public final void LJIIIIZZ() {
        Iterator<InterfaceC1473180oRI> it2 = this.LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LJIIIIZZ();
        }
    }

    @Override // X.InterfaceC1473180oRI
    public final void LJIIJ() {
        if (!this.LJFF) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("engineStop:");
            sbLIZ.append(this.LIZ);
            C2188811AlT.LIZIZ(sbLIZ);
            Iterator<InterfaceC1473180oRI> it2 = this.LIZIZ.iterator();
            while (it2.hasNext()) {
                it2.next().LJIIJ();
            }
        }
        this.LJFF = true;
    }

    @Override // X.InterfaceC1473180oRI
    public final void Ur() {
        Iterator<InterfaceC1473180oRI> it2 = this.LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().Ur();
        }
    }

    @Override // X.InterfaceC1473180oRI
    public final void LIZLLL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("playFinish:");
        sbLIZ.append(this.LIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        Iterator<InterfaceC1473180oRI> it2 = this.LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZLLL();
        }
    }

    @Override // X.InterfaceC1473180oRI
    public final void LJII() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onRenderFirstFrame:");
        sbLIZ.append(this.LIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        Iterator<InterfaceC1473180oRI> it2 = this.LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LJII();
        }
    }

    @Override // X.InterfaceC1473180oRI
    public final void LJIIIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("engineRelease:");
        sbLIZ.append(this.LIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        Iterator<InterfaceC1473180oRI> it2 = this.LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LJIIIZ();
        }
    }

    public C1473150oRF(String str) {
        this.LIZ = str;
        ArrayList arrayList = new ArrayList();
        this.LIZIZ = arrayList;
        this.LIZJ = -1;
        this.LJI = new C1473190oRJ();
        arrayList.add(new C1473120oRC(this) { // from class: X.0oRE
            public long LJ;
            public long LJFF;
            public String LJI;

            @Override // X.C1473120oRC, X.InterfaceC1473180oRI
            public final void LIZ() {
                if (this.LJ <= 0 || !LJIILIIL()) {
                    return;
                }
                C1473120oRC.LJIIJJI("ShortPlayAnalyzer", new C1473290oRT("Short-Pause"), this.LIZJ);
            }

            @Override // X.C1473120oRC, X.InterfaceC1473180oRI
            public final void LIZLLL() {
                String str2 = this.LJI;
                if (str2 == null || LJIILIIL()) {
                    return;
                }
                LJIIL(this.LIZJ, str2);
            }

            @Override // X.C1473120oRC, X.InterfaceC1473180oRI
            public final void LJFF() {
                if (this.LJ <= 0 || !LJIILIIL()) {
                    return;
                }
                this.LJI = "Short-Pause";
            }

            @Override // X.C1473120oRC, X.InterfaceC1473180oRI
            public final void LJI() {
                if (this.LJ <= 0 || !LJIILIIL()) {
                    return;
                }
                C1473120oRC.LJIIJJI("ShortPlayAnalyzer", new C1473290oRT("Short-Stop"), this.LIZJ);
            }

            @Override // X.C1473120oRC, X.InterfaceC1473180oRI
            public final void LJIIJ() {
                if (this.LJ <= 0 || !LJIILIIL()) {
                    return;
                }
                LJIIL(this.LIZJ, "Short-Stop");
            }

            @Override // X.C1473120oRC, X.InterfaceC1473180oRI
            public final void LIZJ() {
                this.LJFF = System.currentTimeMillis();
                this.LJ = 0L;
                this.LJI = null;
            }

            @Override // X.InterfaceC1473180oRI
            public final void LJII() {
                this.LJ = System.currentTimeMillis();
            }

            public final boolean LJIILIIL() {
                return System.currentTimeMillis() - this.LJFF < this.LIZIZ;
            }

            {
                super(this);
            }
        });
        arrayList.add(new C1473170oRH(this));
        arrayList.add(new C1473120oRC(this) { // from class: X.0oRD
            public long LJ;
            public long LJFF;
            public String LJI;

            public final boolean LJIILIIL() {
                return this.LJFF > 0 && this.LJ == 0;
            }

            @Override // X.C1473120oRC, X.InterfaceC1473180oRI
            public final void LIZ() {
                if (LJIILIIL()) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.LJFF;
                    C1473290oRT c1473290oRT = new C1473290oRT("Pause-B4-Render");
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("durationFromStart:");
                    sbLIZ.append(jCurrentTimeMillis);
                    C1473120oRC.LJIIJJI("StartInterruptAnalyzer", c1473290oRT, C2188811AlT.LIZIZ(sbLIZ), this.LIZJ);
                }
            }

            @Override // X.C1473120oRC, X.InterfaceC1473180oRI
            public final void LIZJ() {
                this.LJFF = System.currentTimeMillis();
            }

            @Override // X.C1473120oRC, X.InterfaceC1473180oRI
            public final void LIZLLL() {
                if (System.currentTimeMillis() - this.LJFF > this.LIZIZ) {
                    String str2 = this.LJI;
                    if (str2 != null) {
                        LJIIL(this.LIZJ, str2);
                    }
                    if (this.LJ == 0) {
                        LJIIL(this.LIZJ, "Not-Render");
                    }
                }
                this.LJ = 0L;
                this.LJFF = 0L;
            }

            @Override // X.C1473120oRC, X.InterfaceC1473180oRI
            public final void LJFF() {
                if (LJIILIIL()) {
                    this.LJI = "Pause-B4-Render";
                }
            }

            @Override // X.C1473120oRC, X.InterfaceC1473180oRI
            public final void LJI() {
                if (LJIILIIL()) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.LJFF;
                    C1473290oRT c1473290oRT = new C1473290oRT("Stop-B4-Render");
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("durationFromStart:");
                    sbLIZ.append(jCurrentTimeMillis);
                    C1473120oRC.LJIIJJI("StartInterruptAnalyzer", c1473290oRT, C2188811AlT.LIZIZ(sbLIZ), this.LIZJ);
                }
            }

            @Override // X.InterfaceC1473180oRI
            public final void LJII() {
                this.LJ = System.currentTimeMillis();
            }

            @Override // X.C1473120oRC, X.InterfaceC1473180oRI
            public final void LJIIJ() {
                if (LJIILIIL()) {
                    LJIIL(this.LIZJ, "Stop-B4-Render");
                }
            }

            {
                super(this);
            }
        });
    }
}
