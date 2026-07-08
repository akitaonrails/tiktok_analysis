package X;

import android.text.TextUtils;
import android.util.SparseIntArray;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ttvideoengine.TTVideoEngine;
import fyo.e;
import java.lang.ref.WeakReference;
import java.util.Map;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0oRW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1473320oRW extends C1469760oLm {
    public final C1473330oRX LLILLL;
    public InterfaceC1469410oLD LLILZ;

    @Override // X.C1469760oLm, X.InterfaceC1472290oPr
    public final void LJIIJJI() {
        C1473330oRX c1473330oRX = this.LLILLL;
        c1473330oRX.LJJIIZI = true;
        c1473330oRX.LJJIJ = true;
    }

    @Override // X.C1469760oLm, X.InterfaceC1472290oPr
    public final void LJIIL() {
        this.LLILLL.LJJIJ = false;
    }

    @Override // X.C1469760oLm, X.InterfaceC1472290oPr
    public final void LJJI() {
        C1472150oPd player = this.LLILLJJLI.getPlayer();
        if (player == null) {
            return;
        }
        SparseIntArray sparseIntArrayLJIIIZ = this.LLILLJJLI.LJIIIZ();
        player.LIZJ(118, sparseIntArrayLJIIIZ.get(3, LSPassThroughRecordSizeConfig.DEFAULT));
        player.LIZJ(202, sparseIntArrayLJIIIZ.get(4, 5000));
        player.LIZJ(11, 0);
        player.LIZJ(551, sparseIntArrayLJIIIZ.get(57));
        final C1480980ods c1480980odsUe = this.LLILLJJLI.ue();
        if (((Boolean) C1474810oTv.LLLLILI.getValue()).booleanValue()) {
            player.LLJJJJJIL(new InterfaceC1469360oL8() { // from class: X.0oLB
                public boolean LL;
                public boolean LLILLJJLI;
                public boolean LLILLL;

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LIZIZ(TTVideoEngine tTVideoEngine) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LIZJ(TTVideoEngine tTVideoEngine, int i) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJFF(int i, EnumC2281151EQn enumC2281151EQn) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJI(e eVar) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJIIIIZZ(TTVideoEngine tTVideoEngine) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJIIJJI(TTVideoEngine tTVideoEngine, int i, int i2) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJIIL(TTVideoEngine tTVideoEngine, int i) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJIILIIL(TTVideoEngine tTVideoEngine) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJIILL(TTVideoEngine tTVideoEngine) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJIJI(TTVideoEngine tTVideoEngine, int i) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJIJJLI(int i) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJIL(TTVideoEngine tTVideoEngine, int i) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJJII(int i, int i2) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJJIIJ(int i, int i2) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJJIJ(Map map) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJJJJJ(TTVideoEngine tTVideoEngine, int i) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJJJJJL(TTVideoEngine tTVideoEngine, int i, long j, long j2, Map map) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJJJJLL(TTVideoEngine tTVideoEngine) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJJJLZIJ(TTVideoEngine tTVideoEngine, int i, C1467860oIi c1467860oIi) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJJL(e eVar, String str) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJJLIIIIJ(int i) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJJLIIIJJIZ(TTVideoEngine tTVideoEngine) {
                }

                @Override // X.InterfaceC1469360oL8
                public final void LJ(TTVideoEngine tTVideoEngine) {
                    this.LL = true;
                }

                @Override // X.InterfaceC1469360oL8
                public final void LJIIIZ(TTVideoEngine tTVideoEngine) {
                    this.LL = false;
                    this.LLILLL = false;
                    this.LLILLJJLI = false;
                }

                @Override // X.InterfaceC1469360oL8
                public final void LJIJJ(int i) {
                    if (!this.LL) {
                        return;
                    }
                    C1473320oRW c1473320oRW = this.LLILZIL;
                    InterfaceC1469410oLD interfaceC1469410oLD = c1473320oRW.LLILZ;
                    if (interfaceC1469410oLD != null && i == 1) {
                        if (this.LLILLJJLI) {
                            ((C1479660obk) interfaceC1469410oLD).LIZ();
                            this.LLILLJJLI = false;
                            return;
                        }
                        return;
                    }
                    if (!c1480980odsUe.LJIILJJIL || i != 0 || !this.LLILLL) {
                        return;
                    }
                    c1473320oRW.LLILLJJLI.LJJIJL().onBuffering(false);
                    this.LLILLL = false;
                }

                @Override // X.InterfaceC1469360oL8
                public final void LJIJ(TTVideoEngine tTVideoEngine, int i) {
                    if (C1481110oe5.LIZ) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onLoadStateChanged() called with: engine = [");
                        sbLIZ.append(tTVideoEngine);
                        sbLIZ.append("], loadState = [");
                        sbLIZ.append(i);
                        sbLIZ.append(e3.f);
                        C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ));
                    }
                    if (this.LL && !c1480980odsUe.LJIILJJIL) {
                        if (i == 2) {
                            this.LLILZIL.LLILLJJLI.LJJIJL().onBuffering(true);
                            this.LLILLL = true;
                        } else {
                            if (i != 1 || !this.LLILLL) {
                                return;
                            }
                            this.LLILZIL.LLILLJJLI.LJJIJL().onBuffering(false);
                            this.LLILLL = false;
                        }
                    }
                }

                @Override // X.InterfaceC1469360oL8
                public final void LJJJLIIL(int i, int i2, int i3) {
                    if (!this.LL) {
                        return;
                    }
                    C1473320oRW c1473320oRW = this.LLILZIL;
                    InterfaceC1469410oLD interfaceC1469410oLD = c1473320oRW.LLILZ;
                    if (interfaceC1469410oLD != null && i == 1) {
                        this.LLILLJJLI = true;
                        ((C1479660obk) interfaceC1469410oLD).LIZIZ();
                    } else {
                        if (!c1480980odsUe.LJIILJJIL || i != 0) {
                            return;
                        }
                        this.LLILLL = true;
                        c1473320oRW.LLILLJJLI.LJJIJL().onBuffering(true);
                    }
                }
            });
        } else {
            player.LLJJJJJIL(new InterfaceC1469360oL8() { // from class: X.0oLC
                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LIZIZ(TTVideoEngine tTVideoEngine) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LIZJ(TTVideoEngine tTVideoEngine, int i) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJ(TTVideoEngine tTVideoEngine) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJFF(int i, EnumC2281151EQn enumC2281151EQn) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJI(e eVar) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJIIIIZZ(TTVideoEngine tTVideoEngine) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJIIIZ(TTVideoEngine tTVideoEngine) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJIIJJI(TTVideoEngine tTVideoEngine, int i, int i2) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJIIL(TTVideoEngine tTVideoEngine, int i) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJIILIIL(TTVideoEngine tTVideoEngine) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJIILL(TTVideoEngine tTVideoEngine) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJIJI(TTVideoEngine tTVideoEngine, int i) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJIJJ(int i) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJIJJLI(int i) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJIL(TTVideoEngine tTVideoEngine, int i) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJJII(int i, int i2) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJJIIJ(int i, int i2) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJJIJ(Map map) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJJJJJ(TTVideoEngine tTVideoEngine, int i) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJJJJJL(TTVideoEngine tTVideoEngine, int i, long j, long j2, Map map) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJJJJLL(TTVideoEngine tTVideoEngine) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJJJLIIL(int i, int i2, int i3) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJJJLZIJ(TTVideoEngine tTVideoEngine, int i, C1467860oIi c1467860oIi) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJJL(e eVar, String str) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJJLIIIIJ(int i) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJJLIIIJJIZ(TTVideoEngine tTVideoEngine) {
                }

                @Override // X.InterfaceC1469360oL8
                public final void LJIJ(TTVideoEngine tTVideoEngine, int i) {
                    if (C1481110oe5.LIZ) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onLoadStateChanged() called with: engine = [");
                        sbLIZ.append(tTVideoEngine);
                        sbLIZ.append("], loadState = [");
                        sbLIZ.append(i);
                        sbLIZ.append(e3.f);
                        C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ));
                    }
                    C1480980ods c1480980ods = c1480980odsUe;
                    if (c1480980ods != null && !c1480980ods.LJIILJJIL) {
                        if (i == 2) {
                            this.LLILLJJLI.LLILLJJLI.LJJIJL().onBuffering(true);
                        } else {
                            if (i != 1) {
                                return;
                            }
                            this.LLILLJJLI.LLILLJJLI.LJJIJL().onBuffering(false);
                        }
                    }
                }
            });
            player.LLJILJILJ(new C1469370oL9(this, c1480980odsUe));
        }
    }

    public C1473320oRW(InterfaceC1471960oPK interfaceC1471960oPK) {
        super(interfaceC1471960oPK);
        this.LLILLL = new C1473330oRX();
    }

    @Override // X.C1469760oLm, X.InterfaceC1472290oPr
    public final void LJJIIJZLJL(Map<String, Object> map) {
        C1480980ods c1480980odsUe;
        boolean zBooleanValue;
        int iIntValue;
        boolean z;
        C1472990oQz c1472990oQz;
        C1472150oPd player = this.LLILLJJLI.getPlayer();
        if (player != null && (c1480980odsUe = this.LLILLJJLI.ue()) != null) {
            if (map.get("is_cache") != null) {
                zBooleanValue = ((Boolean) map.get("is_cache")).booleanValue();
            } else {
                zBooleanValue = false;
            }
            if (map.get("bitrate") != null) {
                ((Integer) map.get("bitrate")).intValue();
            }
            if (map.get("duration") != null) {
                iIntValue = ((Integer) map.get("duration")).intValue();
            } else {
                iIntValue = 0;
            }
            Object obj = map.get("header_dashinfo");
            if ((obj instanceof C1472990oQz) && (c1472990oQz = (C1472990oQz) obj) != null && (c1472990oQz.LIZIZ != null || !TextUtils.isEmpty(c1472990oQz.LJ))) {
                z = c1472990oQz.LJIILJJIL;
            } else {
                z = false;
            }
            if (!c1480980odsUe.LJJJJJ && !c1480980odsUe.LJJJJJL) {
                player.LIZ.L0 = null;
                return;
            }
            this.LLILLL.LIZIZ();
            C1473340oRY c1473340oRY = c1480980odsUe.LJJJJIZL;
            if (c1473340oRY != null) {
                C1473330oRX c1473330oRX = this.LLILLL;
                if (c1473340oRY.LJIIL == 1) {
                    c1473330oRX.LJIILJJIL = 1;
                } else {
                    c1473330oRX.LJIILJJIL = 0;
                }
                if (c1473340oRY.LJFF && iIntValue > 60000) {
                    c1473330oRX.LJFF = c1473340oRY.LJIIJ;
                    c1473330oRX.LJI = c1473340oRY.LJIIJJI;
                    c1473330oRX.LJ = c1473340oRY.LJIIIZ;
                    c1473330oRX.LIZJ = c1473340oRY.LJII;
                    c1473330oRX.LIZLLL = c1473340oRY.LJIIIIZZ;
                    c1473330oRX.LIZIZ = c1473340oRY.LJI;
                } else {
                    c1473330oRX.LJFF = c1473340oRY.LIZLLL;
                    c1473330oRX.LJI = c1473340oRY.LJ;
                    c1473330oRX.LJ = c1473340oRY.LIZJ;
                    c1473330oRX.LIZJ = c1473340oRY.LIZ;
                    c1473330oRX.LIZLLL = c1473340oRY.LIZIZ;
                }
                c1473330oRX.LJII = c1473340oRY.LJIILIIL;
                c1473330oRX.LJJIIJ = c1473340oRY.LJIILL;
                c1473330oRX.LJIJJ = c1473340oRY.LJIILJJIL;
            }
            if (zBooleanValue) {
                this.LLILLL.LJIIJ = true;
            }
            C1473330oRX c1473330oRX2 = this.LLILLL;
            c1473330oRX2.LJJIIJZLJL = iIntValue;
            c1473330oRX2.LJJIIZ = new WeakReference<>(this.LLILLJJLI);
            if (c1480980odsUe.LJJJJJL && iIntValue <= c1480980odsUe.LJJJJLI && !z) {
                C1473330oRX c1473330oRX3 = this.LLILLL;
                c1473330oRX3.LJIILL = true;
                c1473330oRX3.LJIILLIIL = c1480980odsUe.LJJJJL;
            }
            C1473330oRX c1473330oRX4 = this.LLILLL;
            c1473330oRX4.LJIIZILJ = c1480980odsUe.LJJIZ;
            c1473330oRX4.LJIJ = c1480980odsUe.LJJJI;
            c1473330oRX4.LJIJI = c1480980odsUe.LJJJ;
            player.LIZ.L0 = c1473330oRX4;
        }
    }

    @Override // X.C1469760oLm, X.InterfaceC1472290oPr
    public final void LJJIL(boolean z) {
        this.LLILLL.LIZIZ();
    }
}
