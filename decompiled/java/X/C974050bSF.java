package X;

import android.os.SystemClock;
import com.bytedance.android.live.liveinteract.multimatch.widget.MultiMatchAnchorWidget;
import kotlin.jvm.internal.AwS249S0000000_15;
import kotlin.jvm.internal.AwS52S0200100_15;

/* JADX INFO: renamed from: X.0bSF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C974050bSF {
    public final /* synthetic */ MultiMatchAnchorWidget LIZ;

    public C974050bSF(MultiMatchAnchorWidget multiMatchAnchorWidget) {
        this.LIZ = multiMatchAnchorWidget;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0bSB] */
    public final void LIZ(EnumC962960bAM enumC962960bAM, String str) {
        final MultiMatchAnchorWidget multiMatchAnchorWidget = this.LIZ;
        C974090bSJ c974090bSJ = new C974090bSJ(new InterfaceC974170bSR() { // from class: X.0bSB
            @Override // X.InterfaceC974170bSR
            public final void LIZIZ(C974100bSK c974100bSK) {
            }

            @Override // X.InterfaceC974170bSR
            public final void LIZ(C974140bSO c974140bSO) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("LauncherDispatchCallback, result.resultType=");
                sbLIZ.append(c974140bSO.LIZIZ);
                C20441214yg.LIZIZ("MultiMatchWidget", C2188811AlT.LIZIZ(sbLIZ));
                switch (C917420Zyu.LIZ[c974140bSO.LIZIZ.ordinal()]) {
                    case 1:
                        multiMatchAnchorWidget.M1(EnumC974070bSH.MATCH_CREATE_SOURCE_MODE_SELECT, EnumC919170a1j.MATCH_TYPE_1V1, false);
                        C975500bUa c975500bUa = multiMatchAnchorWidget.LLJI;
                        if ((c975500bUa instanceof C975500bUa) && c975500bUa != null) {
                            c975500bUa.LJJ(c974140bSO.LIZJ);
                        }
                        String strLJJIJIIJI = C915980Zwa.LJI().LJIIJ().LJJIJIIJI();
                        C975500bUa c975500bUa2 = multiMatchAnchorWidget.LLJI;
                        if (c975500bUa2 != null) {
                            c975500bUa2.LJIJI(strLJJIJIIJI);
                        }
                        break;
                    case 2:
                        String strLJJIJIIJI2 = C915980Zwa.LJI().LJIIJ().LJJIJIIJI();
                        multiMatchAnchorWidget.M1(EnumC974070bSH.MATCH_CREATE_SOURCE_MODE_SELECT, EnumC919170a1j.MATCH_TYPE_2V2, false);
                        C975500bUa c975500bUa3 = multiMatchAnchorWidget.LLJI;
                        if ((c975500bUa3 instanceof C975500bUa) && c975500bUa3 != null) {
                            c975500bUa3.LJJ(c974140bSO.LIZJ);
                        }
                        C975500bUa c975500bUa4 = multiMatchAnchorWidget.LLJI;
                        if (c975500bUa4 != null) {
                            c975500bUa4.LJIJI(strLJJIJIIJI2);
                        }
                        break;
                    case 3:
                    case 4:
                        multiMatchAnchorWidget.M1(EnumC974070bSH.MATCH_CREATE_SOURCE_MODE_SELECT, c974140bSO.LIZIZ, false);
                        C975500bUa c975500bUa5 = multiMatchAnchorWidget.LLJI;
                        if ((c975500bUa5 instanceof C975500bUa) && c975500bUa5 != null) {
                            c975500bUa5.LJJ(c974140bSO.LIZJ);
                        }
                        String strLJJIJIIJI3 = C915980Zwa.LJI().LJIIJ().LJJIJIIJI();
                        C975500bUa c975500bUa6 = multiMatchAnchorWidget.LLJI;
                        if (c975500bUa6 != null) {
                            c975500bUa6.LJIJI(strLJJIJIIJI3);
                        }
                        break;
                    case 5:
                    case 6:
                        multiMatchAnchorWidget.J1(false);
                        C976020bVQ c976020bVQ = multiMatchAnchorWidget.LLJIJIL;
                        if ((c976020bVQ instanceof C976020bVQ) && c976020bVQ != null) {
                            c976020bVQ.LJIILLIIL(c974140bSO.LIZJ);
                        }
                        String strLJJIJIIJI4 = C915980Zwa.LJI().LJIIJ().LJJIJIIJI();
                        C976020bVQ c976020bVQ2 = multiMatchAnchorWidget.LLJIJIL;
                        if (c976020bVQ2 != null) {
                            C962950bAL c962950bAL = EnumC962960bAM.Companion;
                            EnumC919170a1j enumC919170a1j = c974140bSO.LIZIZ;
                            c962950bAL.getClass();
                            c976020bVQ2.LIZLLL(strLJJIJIIJI4, C962950bAL.LJ(enumC919170a1j));
                        }
                        break;
                    default:
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("LauncherDispatchCallback, error, result.resultType=");
                        sbLIZ2.append(c974140bSO.LIZIZ);
                        C20441214yg.LJ("MultiMatchWidget", C2188811AlT.LIZIZ(sbLIZ2));
                        break;
                }
            }
        }, multiMatchAnchorWidget, str, enumC962960bAM);
        C974990bTl c974990bTl = multiMatchAnchorWidget.LLJJI;
        c974990bTl.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showChooseModePanelDirectly");
        sbLIZ.append(", source = ");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("CompetitionAnchorLauncher", C2188811AlT.LIZIZ(sbLIZ));
        Long l = C973890bRz.LJIILJJIL;
        if (l != null) {
            C973890bRz.LIZ.LJIIL = l.longValue();
            C973890bRz.LJIILJJIL = null;
        }
        c974990bTl.LJIIJ(multiMatchAnchorWidget, new AwS52S0200100_15(c974990bTl, c974090bSJ, SystemClock.uptimeMillis(), 1), new AwS249S0000000_15(1));
    }
}
