package X;

import Y.AObjectS401S0100000_27;

/* JADX INFO: renamed from: X.0yDM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1848940yDM extends AbstractC1304120k2c {
    public final C1524970pmp LIZ;
    public final C054G LIZIZ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ));
    public final String LIZJ = EnumC2221141BwW.USER.getDir() + "/storage/storage.json";
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AObjectS401S0100000_27(this, 1));
    public InterfaceC1848950yDN LJ;

    @Override // X.InterfaceC1304080k2Y
    public final void onExit() {
        InterfaceC1848950yDN interfaceC1848950yDN = this.LJ;
        if (interfaceC1848950yDN != null) {
            interfaceC1848950yDN.exit();
        }
    }

    @Override // X.AbstractC1304120k2c, X.InterfaceC1304080k2Y
    public final void onPause() {
        InterfaceC1848950yDN interfaceC1848950yDN = this.LJ;
        if (interfaceC1848950yDN != null) {
            interfaceC1848950yDN.pause();
        }
    }

    @Override // X.InterfaceC1304080k2Y
    public final void onStart() {
        if (this.LJ == null) {
            this.LJ = this.LIZ.LIZ.LJIIIIZZ.kevaStorageSwitch ? new InterfaceC1848950yDN() { // from class: X.0yDf
                public C1849210yDn LIZ;
                public final C1849390yE5 LIZIZ;

                @Override // X.InterfaceC1848950yDN
                public final void exit() {
                    C099F c099fLIZIZ;
                    C1849210yDn c1849210yDn = this.LIZ;
                    if (c1849210yDn != null) {
                        c099fLIZIZ = C090F.LIZIZ();
                        C23250099c.LIZLLL(c1849210yDn.LIZ, null, null, new C454201pk(c099fLIZIZ, null), 3);
                    } else {
                        c099fLIZIZ = null;
                    }
                    C1848940yDM c1848940yDM = this.LIZJ;
                    C23250099c.LIZLLL(c1848940yDM.LIZIZ, null, null, new C455401pw(c099fLIZIZ, c1848940yDM, null), 3);
                }

                @Override // X.InterfaceC1848950yDN
                public final void pause() {
                    C1849210yDn c1849210yDn = this.LIZ;
                    if (c1849210yDn != null) {
                        C23250099c.LIZLLL(c1849210yDn.LIZ, null, null, new C454201pk(C090F.LIZIZ(), null), 3);
                    }
                }

                @Override // X.InterfaceC1848950yDN
                public final void start() {
                    C1849040yDW c1849040yDW = (C1849040yDW) this.LIZJ.LIZLLL.getValue();
                    boolean z = this.LIZJ.LIZ.LIZ.LJIIIIZZ.storageMigrationV2;
                    c1849040yDW.getClass();
                    if (z) {
                        c1849040yDW.LJII("keva", "fs_to_keva", new C1849110yDd(c1849040yDW), new C1849120yDe(c1849040yDW), new C488801vK(c1849040yDW));
                    }
                    C1848940yDM c1848940yDM = this.LIZJ;
                    C1849210yDn c1849210yDn = new C1849210yDn(c1848940yDM.LIZIZ, c1848940yDM.LIZ.LIZ);
                    this.LIZ = c1849210yDn;
                    C1849390yE5 c1849390yE5 = this.LIZIZ;
                    C21346018gE c21346018gE = this.LIZJ.LIZ.LIZJ;
                    c1849390yE5.LIZIZ = new C1849360yE2(c1849210yDn, c21346018gE);
                    C23250099c.LIZLLL(c1849390yE5.LIZ, null, null, new C455301pv(c1849390yE5, null), 3);
                    C1849370yE3.LIZ(c21346018gE, new C1849380yE4(c1849390yE5, new C1849170yDj(c1849390yE5), new C1849190yDl(c1849390yE5), new C1849150yDh(c1849390yE5), new C1849140yDg(c1849390yE5), new C1849250yDr(c1849390yE5), new C1849160yDi(c1849390yE5), new C1849260yDs(c1849390yE5), new C1849290yDv(c1849390yE5), new C1849270yDt(c1849390yE5), new C1849280yDu(c1849390yE5)));
                }

                {
                    this.LIZIZ = new C1849390yE5(this.LIZJ.LIZIZ);
                }
            } : new InterfaceC1848950yDN() { // from class: X.0yDH
                public C1848740yD2 LIZ;
                public final C1848770yD5 LIZIZ = new C1848770yD5();

                @Override // X.InterfaceC1848950yDN
                public final void exit() {
                    C1848740yD2 c1848740yD2 = this.LIZ;
                    if (c1848740yD2 != null) {
                        synchronized (c1848740yD2) {
                            AnonymousClass0956 anonymousClass0956 = c1848740yD2.LJFF;
                            if (anonymousClass0956 != null) {
                                anonymousClass0956.LIZIZ(null);
                            }
                            c1848740yD2.LIZ();
                            c1848740yD2.LIZLLL();
                        }
                    }
                    C2296808zG.LIZJ(this.LIZJ.LIZIZ, null);
                }

                @Override // X.InterfaceC1848950yDN
                public final void pause() {
                    C1848740yD2 c1848740yD2 = this.LIZ;
                    if (c1848740yD2 != null) {
                        synchronized (c1848740yD2) {
                            AnonymousClass0956 anonymousClass0956 = c1848740yD2.LJFF;
                            if (anonymousClass0956 != null) {
                                anonymousClass0956.LIZIZ(null);
                            }
                            c1848740yD2.LIZ();
                            c1848740yD2.LIZLLL();
                        }
                    }
                }

                @Override // X.InterfaceC1848950yDN
                public final void start() {
                    C1849040yDW c1849040yDW = (C1849040yDW) this.LIZJ.LIZLLL.getValue();
                    boolean z = this.LIZJ.LIZ.LIZ.LJIIIIZZ.storageMigrationV2;
                    c1849040yDW.getClass();
                    if (z) {
                        c1849040yDW.LJII("legacy_fs", "keva_to_fs", new C1849090yDb(c1849040yDW), new C1849100yDc(c1849040yDW), new C1848980yDQ(c1849040yDW));
                    }
                    C1848940yDM c1848940yDM = this.LIZJ;
                    C1524970pmp c1524970pmp = c1848940yDM.LIZ;
                    C1848740yD2 c1848740yD2 = new C1848740yD2(c1524970pmp.LIZIZ, c1848940yDM.LIZIZ, c1524970pmp.LIZ);
                    this.LIZ = c1848740yD2;
                    C1848770yD5 c1848770yD5 = this.LIZIZ;
                    C21346018gE c21346018gE = this.LIZJ.LIZ.LIZJ;
                    c1848770yD5.LIZ = new C1848840yDC(c1848740yD2, c21346018gE);
                    C1849370yE3.LIZ(c21346018gE, new C1849380yE4(c1848770yD5, new C1848870yDF(c1848770yD5), new C1848880yDG(c1848770yD5), new C1848900yDI(c1848770yD5), new C1848910yDJ(c1848770yD5), new C1848820yDA(c1848770yD5), new C1848830yDB(c1848770yD5), new C1848850yDD(c1848770yD5), new C1848920yDK(c1848770yD5), new C1848860yDE(c1848770yD5), new C1848930yDL(c1848770yD5)));
                }
            };
        }
        this.LJ.start();
    }

    public C1848940yDM(C1524970pmp c1524970pmp) {
        this.LIZ = c1524970pmp;
    }
}
