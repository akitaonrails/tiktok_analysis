package X;

import com.bytedance.android.live.liveinteract.competition.core.model.bizextra.CatchBeansBizExtra;
import com.bytedance.android.live.liveinteract.competition.core.model.bizextra.TakeTheStageBizExtra;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0beJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C981530beJ {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(AbstractC982860bgS abstractC982860bgS, C981480beE c981480beE, DataChannel dataChannel) {
        boolean z = abstractC982860bgS instanceof C982460bfo;
        if (z) {
            if (C500260Jjc.LJJIJIIJIL(Boolean.valueOf(c981480beE.LIZIZ))) {
                C982460bfo c982460bfo = (C982460bfo) abstractC982860bgS;
                EnumC982500bfs enumC982500bfs = c982460bfo.LJFF;
                c981480beE.LIZJ(c982460bfo.LJ);
                c981480beE.LJIJI = enumC982500bfs;
                C981520beI c981520beI = c981480beE.LIZLLL;
                c981520beI.getClass();
                if (c982460bfo.LIZJ.LIZ.isValid()) {
                    c981520beI.LIZ.LIZLLL(c982460bfo.LIZJ.LIZ);
                }
                C981480beE c981480beE2 = c981520beI.LIZ;
                long j = c982460bfo.LIZJ.LIZJ;
                c981480beE2.getClass();
                C915980Zwa.LJI().LJIIJ().LJJJLL(j);
                c981480beE2.LJIIIZ = j;
                c981520beI.LIZ.getClass();
                C981540beK c981540beK = c982460bfo.LJIIIIZZ;
                C981540beK c981540beK2 = c981480beE.LJIIJ;
                c981540beK2.LIZIZ = c981540beK.LIZIZ;
                c981540beK2.LIZJ = c981540beK.LIZJ;
                c981540beK2.LIZLLL = c981540beK.LIZLLL;
                c981540beK2.LJFF = c981540beK.LJFF;
                c981540beK2.LJII = c981540beK.LJII;
                c981540beK2.LJIIIZ = c981540beK.LJIIIZ;
                c981480beE.LIZLLL.LIZLLL("updateDataForAudienceByInfoResult", C915980Zwa.LJII().LJJLI());
                c981480beE.LIZLLL.LJFF(c982460bfo.LJI);
                c981480beE.LIZLLL.LJ(c982460bfo.LJII);
                c981480beE.LIZLLL.LIZIZ(dataChannel);
            }
            C982460bfo c982460bfo2 = (C982460bfo) abstractC982860bgS;
            if (c982460bfo2.LJ.isFinalCall()) {
                c981480beE.LJJIJIIJI.LJIILIIL = true;
            }
            c981480beE.LJIJ = c982460bfo2.LJIIIZ;
        } else if (abstractC982860bgS instanceof C982610bg3) {
            C982610bg3 c982610bg3 = (C982610bg3) abstractC982860bgS;
            c982610bg3.getClass();
            c981480beE.getClass();
            c981480beE.LIZLLL.LJFF(c982610bg3.LJ);
        } else if (abstractC982860bgS instanceof C982590bg1) {
            c981480beE.LJIJ = ((C982590bg1) abstractC982860bgS).LJFF;
        } else if (abstractC982860bgS instanceof C982680bgA) {
            C981540beK c981540beK3 = ((C982680bgA) abstractC982860bgS).LJFF;
            C981540beK c981540beK4 = c981480beE.LJIIJ;
            c981540beK4.LJFF = c981540beK3.LJFF;
            c981540beK4.LJI = c981540beK3.LJI;
            c981540beK4.LJII = c981540beK3.LJII;
            c981480beE.LJJIJIIJI.LJIILIIL = true;
        } else if (abstractC982860bgS instanceof C982630bg5) {
            C982630bg5 c982630bg5 = (C982630bg5) abstractC982860bgS;
            C981540beK c981540beK5 = c982630bg5.LJ;
            C981540beK c981540beK6 = c981480beE.LJIIJ;
            c981540beK6.LIZJ = c981540beK5.LIZJ;
            c981540beK6.LIZLLL = c981540beK5.LIZLLL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateDataByStateFromResp TakeStageSwitchTurnResult initiateAutoFinalCall=");
            sbLIZ.append(c982630bg5.LJFF);
            C20441214yg.LIZIZ("CompetitionStateDataUpdateUtil", C2188811AlT.LIZIZ(sbLIZ));
            c981480beE.LJJIJIIJI.LIZJ = c982630bg5.LJFF;
        } else if (abstractC982860bgS instanceof C982510bft) {
            C982510bft c982510bft = (C982510bft) abstractC982860bgS;
            c981480beE.LJIJI = c982510bft.LJ;
            C981540beK c981540beK7 = c982510bft.LJII;
            c981480beE.LJIIJ.LJIIIZ = c981540beK7.LJIIIZ;
            c981480beE.LIZLLL.LJ(c982510bft.LJFF);
            c981480beE.LIZLLL.LIZIZ(dataChannel);
        } else if (abstractC982860bgS instanceof C982600bg2) {
            C982600bg2 c982600bg2 = (C982600bg2) abstractC982860bgS;
            c981480beE.LJIJI = c982600bg2.LJFF;
            c981480beE.LIZLLL.LJ(c982600bg2.LJ);
            c981480beE.LIZLLL.LIZIZ(dataChannel);
        } else if (abstractC982860bgS instanceof C982550bfx) {
            C981540beK c981540beK8 = ((C982550bfx) abstractC982860bgS).LJ;
            c981480beE.LJIIJ.LJIIIZ = c981540beK8.LJIIIZ;
        }
        TakeTheStageBizExtra takeTheStageBizExtraLIZJ = C982410bfj.LIZJ(abstractC982860bgS);
        if (takeTheStageBizExtraLIZJ != null) {
            C981500beG c981500beG = c981480beE.LJJIJIIJI;
            long j2 = takeTheStageBizExtraLIZJ.takeTheStageVersion;
            if (j2 > 0) {
                c981500beG.LJIILLIIL = j2;
            } else {
                c981500beG.getClass();
            }
            c981480beE.LJJIJIIJI.LJFF(takeTheStageBizExtraLIZJ.LIZ);
            if (z) {
                C981500beG c981500beG2 = c981480beE.LJJIJIIJI;
                Map<Long, Long> map = takeTheStageBizExtraLIZJ.defaultOrders;
                c981500beG2.getClass();
                if (!map.isEmpty()) {
                    c981500beG2.LJIIZILJ = map;
                }
            }
        }
    }

    public static void LIZ(AbstractC982800bgM abstractC982800bgM, C981480beE c981480beE, EnumC974260bSa enumC974260bSa, DataChannel dataChannel) {
        List<Long> arrayList;
        C981520beI c981520beI = c981480beE.LIZLLL;
        c981520beI.getClass();
        if (abstractC982800bgM.LIZJ.LIZ.isValid()) {
            c981520beI.LIZ.LIZLLL(abstractC982800bgM.LIZJ.LIZ);
        }
        C981480beE c981480beE2 = c981520beI.LIZ;
        long j = abstractC982800bgM.LIZJ.LIZJ;
        c981480beE2.getClass();
        C915980Zwa.LJI().LJIIJ().LJJJLL(j);
        c981480beE2.LJIIIZ = j;
        c981520beI.LIZ.getClass();
        if (abstractC982800bgM instanceof C982480bfq) {
            C982480bfq c982480bfq = (C982480bfq) abstractC982800bgM;
            c981480beE.LJIIJJI = c982480bfq.LJI;
            C981550beL c981550beL = c981480beE.LJJIJ;
            c981550beL.LIZJ = false;
            C973890bRz.LIZ.LJI = false;
            c981550beL.LIZLLL = c982480bfq.LJFF.isRematch();
            c981480beE.LJIIZILJ = c982480bfq.LJIIIIZZ;
            c981480beE.LJIJ = c982480bfq.LJIIIZ;
            c981480beE.LIZLLL.LJFF(c982480bfq.LJII);
            c981480beE.LIZLLL.LIZ();
            c981480beE.LIZLLL.LIZIZ(dataChannel);
        } else {
            if (abstractC982800bgM instanceof C982450bfn) {
                C982450bfn c982450bfn = (C982450bfn) abstractC982800bgM;
                c981480beE.LJIIJJI = c982450bfn.LJI;
                c981480beE.LJJIJ.LIZLLL = c982450bfn.LJFF.isRematch();
                C981540beK c981540beK = c982450bfn.LJIIL;
                C981540beK c981540beK2 = c981480beE.LJIIJ;
                c981540beK2.LIZIZ = c981540beK.LIZIZ;
                c981540beK2.LIZJ = c981540beK.LIZJ;
                c981540beK2.LIZLLL = c981540beK.LIZLLL;
                c981480beE.LJIIZILJ = c982450bfn.LJIIJ;
                c981480beE.LJIJ = c982450bfn.LJIILIIL;
                c981480beE.LIZLLL.LJFF(c982450bfn.LJIIIIZZ);
                c981480beE.LIZLLL.LIZ();
                c981480beE.LIZLLL.LIZIZ(dataChannel);
                c981480beE.LJJIJIIJI.LIZIZ = c981540beK.LIZJ;
            } else if (abstractC982800bgM instanceof C982470bfp) {
                if (C500260Jjc.LJJIJIIJIL(Boolean.valueOf(c981480beE.LIZIZ))) {
                    c981480beE.LIZJ(EnumC974260bSa.START);
                    c981480beE.LIZLLL.LIZLLL("updateDataForAudienceByMessage", C915980Zwa.LJII().LJJLI());
                    c981480beE.LJJIJ.LIZJ = false;
                    C973890bRz.LIZ.LJI = false;
                }
                C982470bfp c982470bfp = (C982470bfp) abstractC982800bgM;
                c981480beE.LJIIJJI = c982470bfp.LJI;
                c981480beE.LJJIJ.LIZLLL = c982470bfp.LJFF.isRematch();
                C981540beK c981540beK3 = c982470bfp.LJIIIIZZ;
                C981540beK c981540beK4 = c981480beE.LJIIJ;
                c981540beK4.LIZIZ = c981540beK3.LIZIZ;
                c981540beK4.LIZJ = c981540beK3.LIZJ;
                c981540beK4.LIZLLL = c981540beK3.LIZLLL;
                c981540beK4.LJFF = c981540beK3.LJFF;
                c981540beK4.LJ = c981540beK3.LJ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("updateDataByStateFromMsg CompetitionStartMessage playingPerformingEndTime=");
                sbLIZ.append(c981540beK3.LIZLLL);
                sbLIZ.append(" playingPlannedEndTime=");
                sbLIZ.append(c981540beK3.LJFF);
                sbLIZ.append(" playingPerformingStartTime=");
                sbLIZ.append(c981540beK3.LIZJ);
                C20441214yg.LIZIZ("CompetitionStateDataUpdateUtil", C2188811AlT.LIZIZ(sbLIZ));
                InterfaceC952130ast interfaceC952130ast = abstractC982800bgM.LIZLLL;
                if (interfaceC952130ast instanceof CatchBeansBizExtra) {
                    C981910bev c981910bev = c981480beE.LJJIJIL;
                    CatchBeansBizExtra catchBeansBizExtra = (CatchBeansBizExtra) interfaceC952130ast;
                    if (catchBeansBizExtra == null || (arrayList = catchBeansBizExtra.systemBombIntervals) == null) {
                        arrayList = new ArrayList<>();
                    }
                    c981910bev.LIZ = arrayList;
                }
                c981480beE.LJIJ = c982470bfp.LJIIIZ;
                c981480beE.LIZLLL.LJFF(c982470bfp.LJII);
                c981480beE.LIZLLL.LIZ();
                c981480beE.LIZLLL.LIZIZ(dataChannel);
                c981480beE.LJJIJIIJI.LIZIZ = c981540beK3.LIZJ;
            } else if (abstractC982800bgM instanceof C982570bfz) {
                if (enumC974260bSa == EnumC974260bSa.START || enumC974260bSa == EnumC974260bSa.SETTLE) {
                    c981480beE.LIZLLL.LJ(((C982570bfz) abstractC982800bgM).LJFF);
                    c981480beE.LIZLLL.LIZIZ(dataChannel);
                }
            } else if (abstractC982800bgM instanceof C982670bg9) {
                C981540beK c981540beK5 = ((C982670bg9) abstractC982800bgM).LJI;
                C981540beK c981540beK6 = c981480beE.LJIIJ;
                c981540beK6.LJFF = c981540beK5.LJFF;
                c981540beK6.LJI = c981540beK5.LJI;
                c981540beK6.LJII = c981540beK5.LJII;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("updateDataByStateFromMsg CompetitionSettlementStartMessage playingPlannedEndTime=");
                sbLIZ2.append(c981540beK5.LJFF);
                sbLIZ2.append(" alarmClockDuration=");
                sbLIZ2.append(c981540beK5.LJII);
                C20441214yg.LIZIZ("CompetitionStateDataUpdateUtil", C2188811AlT.LIZIZ(sbLIZ2));
            } else if (abstractC982800bgM instanceof C982490bfr) {
                C982490bfr c982490bfr = (C982490bfr) abstractC982800bgM;
                c981480beE.LJIJI = c982490bfr.LJI;
                c981480beE.LJIIJ.LJIIIZ = c982490bfr.LJIIIZ.LJIIIZ;
                c981480beE.LIZLLL.LJ(c982490bfr.LJFF);
                c981480beE.LIZLLL.LIZIZ(dataChannel);
            } else if (abstractC982800bgM instanceof C982620bg4) {
                C982620bg4 c982620bg4 = (C982620bg4) abstractC982800bgM;
                C981540beK c981540beK7 = c982620bg4.LJFF;
                C981540beK c981540beK8 = c981480beE.LJIIJ;
                c981540beK8.LIZJ = c981540beK7.LIZJ;
                c981540beK8.LIZLLL = c981540beK7.LIZLLL;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("updateDataByStateFromMsg TakeStageSwitchTurnMessage playingPerformingEndTime=");
                sbLIZ3.append(c981540beK7.LIZLLL);
                sbLIZ3.append(" playingPerformingStartTime=");
                sbLIZ3.append(c981540beK7.LIZJ);
                sbLIZ3.append(" initiateAutoFinalCall=");
                sbLIZ3.append(c982620bg4.LJI);
                C20441214yg.LIZIZ("CompetitionStateDataUpdateUtil", C2188811AlT.LIZIZ(sbLIZ3));
                C981500beG c981500beG = c981480beE.LJJIJIIJI;
                c981500beG.LIZIZ = c982620bg4.LJFF.LIZJ;
                c981500beG.LIZJ = c982620bg4.LJI;
            } else if (!(abstractC982800bgM instanceof C983020bgi) && (abstractC982800bgM instanceof C982530bfv)) {
                c981480beE.LJIIJ.LJIIIZ = ((C982530bfv) abstractC982800bgM).LJII.LJIIIZ;
            }
            if (!(abstractC982800bgM instanceof C982450bfn) && !(abstractC982800bgM instanceof C982470bfp)) {
                return;
            }
        }
        TakeTheStageBizExtra takeTheStageBizExtraLIZIZ = C982410bfj.LIZIZ(abstractC982800bgM);
        if (takeTheStageBizExtraLIZIZ != null) {
            C981500beG c981500beG2 = c981480beE.LJJIJIIJI;
            long j2 = takeTheStageBizExtraLIZIZ.takeTheStageVersion;
            if (j2 > 0) {
                c981500beG2.LJIILLIIL = j2;
            } else {
                c981500beG2.getClass();
            }
            c981480beE.LJJIJIIJI.LJFF(takeTheStageBizExtraLIZIZ.LIZ);
            c981480beE.LJJIJIIJI.LJFF = takeTheStageBizExtraLIZIZ.performanceDuration;
        }
    }
}
