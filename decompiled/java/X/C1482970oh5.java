package X;

import Y.ARunnableS12S0310000_23;
import Y.ARunnableS4S0111000_23;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: X.0oh5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1482970oh5 extends AbstractC1482950oh3 {
    public final C1482720ogg LIZIZ;
    public int LIZJ;
    public boolean LIZLLL;
    public int LJ;
    public int LJFF;
    public final C1482760ogk LJI;
    public final C339460DSm LJII;
    public String LJIIIIZZ;

    @Override // X.AbstractC1482950oh3
    public final String LJFF() {
        return "PreRenderStrategy";
    }

    @Override // X.InterfaceC583260MuC
    public final List<String> LIZ() {
        return Arrays.asList("PlayerCallback_COMPLETE_LOADED", "PlayerCallback_FIRST_FRAME", "PlayerCallback_PROGRESS_CHANGE", "PlayerCallback_BUFFERED_TIME", "PreloaderCallback_PROGRESS", "StrategyScene_ON_PAGE_SELECTED", "StrategyScene_ON_PAGE_SCROLLED", "StrategyScene_ON_PAGE_SCROLL_STATE_CHANGE", "SimKitPlayer_ATTACH");
    }

    @Override // X.AbstractC1482950oh3
    public final boolean LIZJ() {
        this.LIZ.LIZJ.getClass();
        C1479110oar.LIZ.LIZ.getSimPlayerConfig().getPreRenderConfig().isEnabled();
        return true;
    }

    public C1482970oh5(C1483080ohG c1483080ohG) {
        C339460DSm c339460DSm = new C339460DSm();
        super(c1483080ohG);
        this.LIZJ = -1;
        this.LIZLLL = true;
        this.LJI = new C1482760ogk(C1479110oar.LIZ.LIZ.getSimPlayerConfig().getPreRenderConfig().LIZJ());
        this.LJIIIIZZ = null;
        this.LIZIZ = c1483080ohG.LIZIZ;
        this.LJII = c339460DSm;
    }

    public final void LJI(String str) {
        C1479110oar.LIZ.LIZ.getSimPlayerConfig().getPreRenderConfig().LIZ();
        LJII(3, this.LIZLLL);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC583260MuC
    public final void LIZIZ(Object obj, String str) {
        str.getClass();
        switch (str.hashCode()) {
            case -1639728062:
                if (str.equals("StrategyScene_ON_PAGE_SCROLLED")) {
                    obj.getClass();
                    if (this.LJ == 1) {
                        if (((Boolean) C1474810oTv.e4.getValue()).booleanValue()) {
                            if (this.LJFF > 0) {
                                if (this.LIZJ != 0 || this.LIZLLL) {
                                    this.LIZJ = 0;
                                    this.LIZLLL = false;
                                    C1479110oar.LIZ.LIZ.getSimPlayerConfig().getPreRenderConfig().LIZLLL();
                                    LJII(1, false);
                                }
                            } else {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("triggered by onPageScrolled. unknown direction, return. position:");
                                sbLIZ.append(0);
                                C2188811AlT.LIZIZ(sbLIZ);
                            }
                        } else {
                            C1479110oar.LIZ.LIZ.getSimPlayerConfig().getPreRenderConfig().LIZLLL();
                            if (this.LJFF > 0) {
                                if (this.LIZJ != 0 || this.LIZLLL) {
                                    this.LIZJ = 0;
                                    this.LIZLLL = false;
                                    LJII(1, false);
                                }
                            } else {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("triggered by onPageScrolled. unknown direction, return. position:");
                                sbLIZ2.append(0);
                                C2188811AlT.LIZIZ(sbLIZ2);
                            }
                        }
                    }
                }
                break;
            case -1484609126:
                if (str.equals("StrategyScene_ON_PAGE_SCROLL_STATE_CHANGE")) {
                    this.LJ = ((Integer) obj).intValue();
                }
                break;
            case -288279931:
                if (str.equals("PlayerCallback_FIRST_FRAME")) {
                    C1480420ocy c1480420ocy = (C1480420ocy) obj;
                    this.LJI.LIZ();
                    C1479110oar.LIZ.LIZ.getSimPlayerConfig().getPreRenderConfig().LJIIIIZZ();
                    if (this.LJ == 1) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("triggered by onRenderFirstFrame. dragging, return. sourceId:");
                        sbLIZ3.append(c1480420ocy.getSourceId());
                        C2188811AlT.LIZIZ(sbLIZ3);
                    } else {
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("triggered by onRenderFirstFrame. sourceId:");
                        sbLIZ4.append(c1480420ocy.getSourceId());
                        C2188811AlT.LIZIZ(sbLIZ4);
                        LJII(0, this.LIZLLL);
                    }
                }
                break;
            case -186899982:
                if (str.equals("PlayerCallback_COMPLETE_LOADED")) {
                    String str2 = (String) obj;
                    if (this.LIZIZ.LJ(str2)) {
                        LJI(str2);
                    }
                }
                break;
            case -45991247:
                if (str.equals("StrategyScene_ON_PAGE_SELECTED")) {
                    this.LJFF = ((Integer) obj).intValue();
                }
                break;
            case 338017073:
                if (str.equals("PreloaderCallback_PROGRESS")) {
                    C1482830ogr c1482830ogr = (C1482830ogr) obj;
                    if (this.LIZIZ.LJ(c1482830ogr.LIZ) && c1482830ogr.LIZIZ == c1482830ogr.LIZJ) {
                        LJI(c1482830ogr.LIZ);
                        break;
                    }
                }
                break;
            case 1242249769:
                if (str.equals("PlayerCallback_PROGRESS_CHANGE")) {
                    C1479110oar.LIZ.LIZ.getSimPlayerConfig().getPreRenderConfig().LJII();
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("triggered by onPlayProgressChange. switch not open, return. sourceId:");
                    sbLIZ5.append(((C1480280ock) obj).LIZ);
                    C2188811AlT.LIZIZ(sbLIZ5);
                }
                break;
            case 1867156740:
                if (str.equals("SimKitPlayer_ATTACH")) {
                    this.LJII.LIZ(((InterfaceC1483820oiS) obj).getPlayViewContainer());
                }
                break;
            case 2106677268:
                if (str.equals("PlayerCallback_BUFFERED_TIME")) {
                    C585640My2 c585640My2 = (C585640My2) obj;
                    String str3 = c585640My2.LIZ;
                    int i = c585640My2.LIZJ;
                    C1479100oaq c1479100oaq = C1479110oar.LIZ;
                    c1479100oaq.LIZ.getSimPlayerConfig().getPreRenderConfig().LJI();
                    c1479100oaq.LIZ.getSimPlayerConfig().getPreRenderConfig().LJFF();
                    if (i < 90) {
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        sbLIZ6.append("triggered by onBufferedPercent. percent not enough, return. sourceId:");
                        sbLIZ6.append(str3);
                        sbLIZ6.append(" percent:");
                        sbLIZ6.append(i);
                        C2188811AlT.LIZIZ(sbLIZ6);
                    } else if (this.LJ == 1) {
                        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                        sbLIZ7.append("triggered by onBufferedPercent. dragging, return. sourceId:");
                        sbLIZ7.append(str3);
                        C2188811AlT.LIZIZ(sbLIZ7);
                    } else {
                        LJII(2, this.LIZLLL);
                    }
                }
                break;
        }
    }

    public final void LJII(int i, boolean z) {
        if (C1474810oTv.LJJZ()) {
            C0C83.INS.runOnMsg(new ARunnableS4S0111000_23(this, i, z, 5));
        } else {
            LJIIIIZZ(i, z);
        }
    }

    public final void LJIIIIZZ(int i, boolean z) {
        List<InterfaceC1479620obg> listLIZJ;
        InterfaceC1479620obg interfaceC1479620obg;
        C1482720ogg c1482720ogg = this.LIZIZ;
        InterfaceC1479620obg interfaceC1479620obg2 = c1482720ogg.LIZJ;
        if (interfaceC1479620obg2 == null) {
            C786410Ut5.j4("triggerPreRender. currentPlayRequest null, return. type:%s, isBelowCurrent:%s", new Object[]{Integer.valueOf(i), Boolean.valueOf(z)});
            return;
        }
        if (z) {
            listLIZJ = c1482720ogg.LIZJ(1, 0, 1);
        } else {
            listLIZJ = c1482720ogg.LIZJ(1, 0, 2);
        }
        if (listLIZJ.size() > 0 && (interfaceC1479620obg = (InterfaceC1479620obg) ListProtector.get(listLIZJ, 0)) != null) {
            if (i == 1) {
                C1479110oar.LIZ.LIZ.getSimPlayerConfig().getPreRenderConfig().LJ();
            }
            List<InterfaceC1479740obs> listLJIIJJI = interfaceC1479620obg.LJIIJJI();
            if (listLJIIJJI != null && listLJIIJJI.size() != 0) {
                C1479540obY.LIZJ(interfaceC1479620obg, (InterfaceC1479740obs) ListProtector.get(listLJIIJJI, 0));
                C1479110oar.LIZ.LIZ.getSimPlayerConfig().getPreRenderConfig().LIZIZ();
                if (TextUtils.equals(interfaceC1479620obg.getKey(), this.LJIIIIZZ)) {
                    C786410Ut5.j4("triggerPreRender. mPreparingAid exists, return. mPreparingAid:%s, type:%s, isBelowCurrent:%s", new Object[]{this.LJIIIIZZ, Integer.valueOf(i), Boolean.valueOf(z)});
                    return;
                } else {
                    this.LJIIIIZZ = interfaceC1479620obg.getKey();
                    EnumC1483050ohD.INS.postOnMain(new ARunnableS12S0310000_23(this, i, z, interfaceC1479620obg, interfaceC1479620obg2, 2));
                    return;
                }
            }
            C786410Ut5.j4("triggerPreRender. playItems null, return. type:%s, isBelowCurrent:%s", new Object[]{Integer.valueOf(i), Boolean.valueOf(z)});
            return;
        }
        C786410Ut5.j4("triggerPreRender. preRenderTarget null, return. type:%s, isBelowCurrent:%s", new Object[]{Integer.valueOf(i), Boolean.valueOf(z)});
    }
}
