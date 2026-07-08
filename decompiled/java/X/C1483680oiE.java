package X;

import com.ss.android.ugc.aweme.player.sdk.api.OnPreRenderListener;
import com.ss.android.ugc.playerkit.radar.SimRadar;

/* JADX INFO: renamed from: X.0oiE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1483680oiE implements InterfaceC1483770oiN {
    public InterfaceC1483770oiN LIZ;
    public final C1483280oha LIZIZ;
    public final C1483900oia LIZJ;

    @Override // X.InterfaceC1483770oiN
    public final void LIZ() {
        InterfaceC1483770oiN interfaceC1483770oiN = this.LIZ;
        if (interfaceC1483770oiN != null) {
            interfaceC1483770oiN.LIZ();
        }
    }

    @Override // X.InterfaceC1483770oiN
    public final void release() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("release:");
        sbLIZ.append(this.LIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LIZJ.release();
    }

    @Override // X.InterfaceC1483770oiN
    public final void resume() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("resume:");
        sbLIZ.append(this.LIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC1483770oiN interfaceC1483770oiN = this.LIZ;
        if (interfaceC1483770oiN != null) {
            interfaceC1483770oiN.resume();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0oha] */
    public C1483680oiE(final InterfaceC1483670oiD interfaceC1483670oiD) {
        C1483900oia c1483900oia = new C1483900oia(interfaceC1483670oiD);
        this.LIZJ = c1483900oia;
        this.LIZIZ = new InterfaceC1483770oiN(interfaceC1483670oiD) { // from class: X.0oha
            public final InterfaceC1483670oiD LIZ;
            public InterfaceC1483820oiS LIZIZ;
            public OnPreRenderListener LIZJ;

            @Override // X.InterfaceC1483770oiN
            public final void LIZ() {
            }

            @Override // X.InterfaceC1483770oiN
            public final void LJIIJJI(InterfaceC1483820oiS interfaceC1483820oiS) {
            }

            @Override // X.InterfaceC1483770oiN
            public final void release() {
            }

            @Override // X.InterfaceC1483770oiN
            public final void resume() {
                this.LIZ.resume();
            }

            {
                this.LIZ = interfaceC1483670oiD;
            }

            @Override // X.InterfaceC1483770oiN
            public final void LIZIZ(C1482520ogM c1482520ogM) {
                this.LIZJ = c1482520ogM;
            }

            @Override // X.InterfaceC1483770oiN
            public final void LIZJ(InterfaceC1483820oiS interfaceC1483820oiS) {
                this.LIZIZ = interfaceC1483820oiS;
            }

            @Override // X.InterfaceC1483770oiN
            public final void LIZLLL(InterfaceC1483820oiS interfaceC1483820oiS) {
                SimRadar.keyScan("SurfaceBinder", "changePlayerHost", interfaceC1483820oiS);
                InterfaceC1483820oiS interfaceC1483820oiS2 = this.LIZIZ;
                if (interfaceC1483820oiS2 != null) {
                    this.LIZ.LJIJJLI(interfaceC1483820oiS2.getSurface(), true);
                }
            }

            @Override // X.InterfaceC1483770oiN
            public final void LJ(InterfaceC1479620obg interfaceC1479620obg) {
                InterfaceC1483820oiS interfaceC1483820oiS = this.LIZIZ;
                if (interfaceC1483820oiS != null) {
                    this.LIZ.setSurface(interfaceC1483820oiS.getSurface());
                    if (this.LIZIZ.getSurface() == null) {
                        SimRadar.errorScan("SurfaceBinder", "play", new C1473290oRT("SurfaceBinder is null."), new Object[0]);
                        C1472910oQr c1472910oQrAnalyzer = SimRadar.analyzer();
                        interfaceC1479620obg.getKey();
                        c1472910oQrAnalyzer.getClass();
                        C1472910oQr.LIZIZ("SF-SurfaceBinderNull");
                    } else {
                        interfaceC1479620obg.LJIIJ();
                        SimRadar.keyScan("SurfaceBinder", "play", null);
                    }
                } else {
                    SimRadar.errorScan("SurfaceBinder", "play", new C1473290oRT("PlayerHost is null."), new Object[0]);
                    C1472910oQr c1472910oQrAnalyzer2 = SimRadar.analyzer();
                    interfaceC1479620obg.getKey();
                    c1472910oQrAnalyzer2.getClass();
                    C1472910oQr.LIZIZ("SF-PlayHostNull");
                }
                if (this.LIZJ != null && interfaceC1479620obg.LIZLLL() != null && interfaceC1479620obg.LIZLLL().LIZ == null) {
                    interfaceC1479620obg.LIZLLL().LIZ = this.LIZJ;
                }
                this.LIZ.LJJJJJL(C1479540obY.LIZ(interfaceC1479620obg, null));
            }

            @Override // X.InterfaceC1483770oiN
            public final void LJFF(C1484040oio c1484040oio) {
                SimRadar.errorScan("SurfaceBinder", "preRender", new C1473290oRT("Empty method!!!"), new Object[0]);
                SimRadar.analyzer().getClass();
                C1472910oQr.LIZIZ("SF-PreRenderEmpty");
            }
        };
        this.LIZ = c1483900oia;
    }

    @Override // X.InterfaceC1483770oiN
    public final void LIZIZ(C1482520ogM c1482520ogM) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setOnPlayListener:");
        sbLIZ.append(this.LIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC1483770oiN interfaceC1483770oiN = this.LIZ;
        if (interfaceC1483770oiN != null) {
            interfaceC1483770oiN.LIZIZ(c1482520ogM);
        }
    }

    @Override // X.InterfaceC1483770oiN
    public final void LIZJ(InterfaceC1483820oiS interfaceC1483820oiS) {
        if (interfaceC1483820oiS.getPlayViewContainer() != null) {
            this.LIZ = this.LIZJ;
        } else {
            this.LIZ = this.LIZIZ;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("attach:");
        sbLIZ.append(this.LIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LIZ.LIZJ(interfaceC1483820oiS);
    }

    @Override // X.InterfaceC1483770oiN
    public final void LIZLLL(InterfaceC1483820oiS interfaceC1483820oiS) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("changePlayerHost:");
        sbLIZ.append(this.LIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LIZ.LIZLLL(interfaceC1483820oiS);
    }

    @Override // X.InterfaceC1483770oiN
    public final void LJ(InterfaceC1479620obg interfaceC1479620obg) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("play:");
        sbLIZ.append(this.LIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC1483770oiN interfaceC1483770oiN = this.LIZ;
        if (interfaceC1483770oiN != null) {
            interfaceC1483770oiN.LJ(interfaceC1479620obg);
        }
    }

    @Override // X.InterfaceC1483770oiN
    public final void LJFF(C1484040oio c1484040oio) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("preRender:");
        sbLIZ.append(this.LIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC1483770oiN interfaceC1483770oiN = this.LIZ;
        if (interfaceC1483770oiN != null) {
            interfaceC1483770oiN.LJFF(c1484040oio);
        }
    }

    @Override // X.InterfaceC1483770oiN
    public final void LJIIJJI(InterfaceC1483820oiS interfaceC1483820oiS) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("detach:");
        sbLIZ.append(this.LIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC1483770oiN interfaceC1483770oiN = this.LIZ;
        if (interfaceC1483770oiN != null) {
            interfaceC1483770oiN.LJIIJJI(interfaceC1483820oiS);
        }
    }
}
