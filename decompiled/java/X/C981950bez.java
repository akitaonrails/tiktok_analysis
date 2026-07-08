package X;

import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.liveinteract.api.LinkCrossRoomStateChangeEvent;
import com.bytedance.android.live.liveinteract.competition.states.event.CompetitionStateTransitCountdownEvent;
import com.bytedance.android.live.liveinteract.competition.takestage.event.TakeStageSwitchTurnEvent;
import com.bytedance.android.live.liveinteract.multihost.biz.dialog.LinkDialog;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AFwS299S0000000_15;

/* JADX INFO: renamed from: X.0bez, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C981950bez extends C982020bf6 implements InterfaceC983920biA {
    public LinkDialog LJFF;

    @Override // X.C982020bf6, X.InterfaceC983130bgt
    public final void LJIJJLI(C982460bfo c982460bfo, AbstractC982800bgM abstractC982800bgM, EnumC975850bV9 enumC975850bV9) {
    }

    @Override // X.AbstractC981930bex, X.InterfaceC981890bet
    public final void LJJIII() {
    }

    @Override // X.InterfaceC983470bhR
    public final void LJJIIJ(int i, long j, Function1 function1, Function1 function12) {
    }

    @Override // X.AbstractC981930bex, X.InterfaceC981890bet
    public final void LIZIZ() {
        super.LIZIZ();
        LJFF();
        LJJJJJ().LJJIJIIJI.LJIILJJIL = false;
        LJJJJJ().LJJIJIIJI.LJIILL = false;
    }

    @Override // X.C982020bf6, X.AbstractC981930bex, X.InterfaceC981890bet
    public final void LJFF() {
        super.LJFF();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dismiss and coordinator = ");
        sbLIZ.append(this);
        C20441214yg.LIZIZ("TakeStagePlayingCoordinatorAudience", C2188811AlT.LIZIZ(sbLIZ));
        LinkDialog linkDialog = this.LJFF;
        if (linkDialog != null) {
            linkDialog.dismiss();
        }
    }

    @Override // X.AbstractC981930bex, X.InterfaceC981890bet
    public final void LJJ() {
        DataChannel dataChannel;
        if (C963580bBM.LIZ() || (dataChannel = this.LIZLLL) == null) {
            return;
        }
        dataChannel.zW(LinkCrossRoomStateChangeEvent.class, new C956380azk(8, "TakeStagePlayingCoordinatorAudience , onForceTerminated"));
    }

    @Override // X.AbstractC981930bex, X.InterfaceC981890bet
    public final void LIZ(AbstractC982800bgM abstractC982800bgM) {
        if (abstractC982800bgM instanceof C982620bg4) {
            C981530beJ.LIZ(abstractC982800bgM, LJJJJJ(), this.LIZIZ.getStatus(), this.LIZLLL);
            return;
        }
        if (!(abstractC982800bgM instanceof C982670bg9)) {
            return;
        }
        C982670bg9 c982670bg9 = (C982670bg9) abstractC982800bgM;
        C981530beJ.LIZ(c982670bg9, LJJJJJ(), this.LIZIZ.getStatus(), this.LIZLLL);
        LJJJJJ().LJJIJIIJI.LJIILIIL = true;
        new C970920bNC().LJJIFFI("settlement_start_message");
        LJJJJL(c982670bg9.LJI.LIZIZ(), "CompetitionSettlementStartMessage");
        LJFF();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:6|(1:24)(11:14|(1:16)|17|(1:19)(1:23)|20|(1:22)(1:26)|87|27|(2:29|32)|33|(2:35|(4:39|(1:41)|42|43)(1:38))(12:(1:66)(1:49)|50|(1:52)(1:65)|53|(1:55)(1:64)|56|(1:58)(1:63)|59|(2:62|60)|89|67|(2:71|(2:77|(4:82|(1:84)|85|86)(2:80|81))(2:75|76))(1:90)))|25|17|(0)(0)|20|(0)(0)|87|27|(0)|33|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0082, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0083, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
        X.C20441214yg.LJ("EnlargedInfo_getListFromGsonString", r0.getMessage());
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x014a  */
    @Override // X.InterfaceC983920biA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILL(X.C945320ahu r18) {
        /*
            Method dump skipped, instruction units count: 715
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C981950bez.LJIILL(X.0ahu):void");
    }

    public final void LJJJJLL(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startFinalCallUIForAudience");
        sbLIZ.append(", source=");
        sbLIZ.append(str);
        sbLIZ.append(",  isInFinalCallFromLocal=");
        sbLIZ.append(LJJJJJ().LJJIJIIJI.LJIILL);
        C20441214yg.LJIIIZ("TakeStagePlayingCoordinatorAudience", C2188811AlT.LIZIZ(sbLIZ));
        if (!LJJJJJ().LJJIJIIJI.LJIILL) {
            LJJJJJ().LJJIJIIJI.LJIILL = true;
            DataChannel dataChannel = this.LIZLLL;
            if (dataChannel != null) {
                dataChannel.zW(TakeStageSwitchTurnEvent.class, new C958090b2V());
            }
        }
    }

    public C981950bez(MatchBaseWidget matchBaseWidget, InterfaceC981940bey interfaceC981940bey) {
        super(matchBaseWidget, interfaceC981940bey);
    }

    @Override // X.AbstractC981930bex, X.InterfaceC981890bet
    public final void LJIIL(List list, List list2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onHostsListChanged");
        sbLIZ.append(", isInFinalCallFromServerForAudience = ");
        sbLIZ.append(LJJJJJ().LJJIJIIJI.LJIILJJIL);
        sbLIZ.append(", isInFinalCallFromLocal=");
        sbLIZ.append(LJJJJJ().LJJIJIIJI.LJIILL);
        C20441214yg.LJ("TakeStagePlayingCoordinatorAudience", C2188811AlT.LIZIZ(sbLIZ));
        if (LJJJJJ().LJJIJIIJI.LJIILJJIL && LJJJJJ().LJJIJIIJI.LJIILL) {
            LJJJJJ().LJJIJIIJI.LJII(0L);
        } else {
            LJIILL(LJJJJJ().LJIJJ);
        }
    }

    public final void LJJJJL(long j, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startCountDownOnFinalCall");
        sbLIZ.append(", source=");
        sbLIZ.append(str);
        sbLIZ.append(", countdownSeconds = ");
        sbLIZ.append(j);
        sbLIZ.append(", isInFinalCallFromServerForAudience=");
        sbLIZ.append(LJJJJJ().LJJIJIIJI.LJIILJJIL);
        C20441214yg.LJIIIZ("TakeStagePlayingCoordinatorAudience", C2188811AlT.LIZIZ(sbLIZ));
        if (LJJJJJ().LJJIJIIJI.LJIILJJIL) {
            return;
        }
        LJJJJJ().LJJIJIIJI.LJIILJJIL = true;
        C973750bRl c973750bRl = C973760bRm.LIZIZ;
        c973750bRl.LIZJ();
        c973750bRl.LIZJ();
        C973760bRm.LIZJ.LIZIZ();
        C982310bfZ.LIZ("startCountDownOnFinalCall");
        C982320bfa.LIZJ("startCountDownOnFinalCall");
        DataChannel dataChannel = this.LIZLLL;
        if (dataChannel != null) {
            dataChannel.zW(CompetitionStateTransitCountdownEvent.class, new C983300bhA(str, j));
        }
    }

    public final void LJJJJLI(long j, String str) {
        long jLJ;
        Long l;
        long jLJ2;
        if (LJJJJJ().LJJIJIIJI.LJIILJJIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("startCountTimeOnSwitchTurn");
            sbLIZ.append(", return by isInTakeStageFinalCall = true, source=");
            sbLIZ.append(str);
            sbLIZ.append(", enlargedUid=");
            sbLIZ.append(j);
            C20441214yg.LJ("TakeStagePlayingCoordinatorAudience", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("startCountTimeOnSwitchTurn");
        sbLIZ2.append(", , source=");
        sbLIZ2.append(str);
        sbLIZ2.append(", enlargedUid=");
        sbLIZ2.append(j);
        C20441214yg.LIZIZ("TakeStagePlayingCoordinatorAudience", C2188811AlT.LIZIZ(sbLIZ2));
        if (LJJJJJ().LJJIJIIJIL.LIZJ > 0) {
            if (!LJJJJJ().LJJIJIIJIL.LJFF) {
                C970920bNC c970920bNC = new C970920bNC();
                AbstractC962030b8r.LJIIJ(c970920bNC.LIZLLL, "previous_performer_uid", Long.valueOf(LJJJJJ().LJJIJIIJIL.LIZJ), true);
                AbstractC962030b8r.LJIIJ(c970920bNC.LIZLLL, "current_performer_uid", Long.valueOf(j), true);
                c970920bNC.LJIJJLI("performer_change");
            } else {
                LJJJJJ().LJJIJIIJIL.LJFF = false;
            }
        }
        LJJJJJ().LJJIJIIJIL.LIZJ = j;
        DataChannel dataChannel = this.LIZLLL;
        if (dataChannel != null) {
            LJJJJJ();
            dataChannel.zW(TakeStageSwitchTurnEvent.class, new C958090b2V(LJJJJJ().LJJIJIIJI.LJI, true));
        }
        C982310bfZ.LIZ("startCountTimeOnSwitchTurn");
        C982320bfa.LIZJ("startCountTimeOnSwitchTurn");
        if (LJJJJJ().LJJIJIIJI.LJ()) {
            EnumC962960bAM enumC962960bAM = EnumC962960bAM.TAKE_THE_STAGE;
            EnumC982850bgR enumC982850bgR = EnumC982850bgR.PLAYING;
            Long l2 = (Long) C13LP.LJJJLZIJ(0, LJJJJJ().LJJIJIIJI.LJI);
            if (l2 != null) {
                jLJ2 = l2.longValue();
            } else {
                jLJ2 = C950220apo.LJ();
            }
            long jLIZ = LJJJJJ().LJJIJIIJI.LIZ();
            C981540beK c981540beK = LJJJJJ().LJIIJ;
            C982320bfa.LIZ(enumC962960bAM, enumC982850bgR, jLJ2, jLIZ, c981540beK.LIZLLL - c981540beK.LIZJ, true, null, AFwS203S0000000_15.get$arr$(15));
        } else {
            EnumC962960bAM enumC962960bAM2 = EnumC962960bAM.TAKE_THE_STAGE;
            EnumC982850bgR enumC982850bgR2 = EnumC982850bgR.PLAYING;
            List<Long> list = LJJJJJ().LJJIJIIJI.LJI;
            if (list != null && (l = (Long) C13LP.LJJJLZIJ(0, list)) != null) {
                jLJ = l.longValue();
            } else {
                jLJ = C950220apo.LJ();
            }
            C981500beG c981500beG = LJJJJJ().LJJIJIIJI;
            long j2 = c981500beG.LJIIJJI - c981500beG.LJIIJ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("addCountUp, bizType=");
            sbLIZ3.append(enumC962960bAM2);
            sbLIZ3.append(", source=");
            sbLIZ3.append(enumC982850bgR2);
            sbLIZ3.append(", uid=");
            sbLIZ3.append(jLJ);
            sbLIZ3.append(", currentDuration=");
            sbLIZ3.append(j2);
            C20441214yg.LIZIZ("CompetitionCountUpManager", C2188811AlT.LIZIZ(sbLIZ3));
            C982310bfZ.LIZIZ.put(Long.valueOf(jLJ), new C982840bgQ(EnumC983000bgg.COUNT_UP, enumC962960bAM2, enumC982850bgR2, jLJ, TimeUnit.SECONDS, j2, Long.MAX_VALUE, true, null, null));
            C983820bi0 c983820bi0 = C983830bi1.LIZ;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("addCountUp_");
            sbLIZ4.append(enumC982850bgR2);
            c983820bi0.LIZ(C2188811AlT.LIZIZ(sbLIZ4), C982310bfZ.LIZJ);
        }
        LJFF();
    }

    @Override // X.InterfaceC983470bhR
    public final void LJIJI(long j, String str, Function2<? super EnumC983140bgu, ? super Long, Unit> function2) {
        long jLJ;
        List<C954460awe> listLIZIZ;
        EnumC982940bga enumC982940bga;
        EnumC977660bY4 enumC977660bY4;
        if (this.LIZ == null) {
            return;
        }
        LinkDialog linkDialog = this.LJFF;
        FragmentManager fragmentManager = null;
        if (linkDialog != null && C500260Jjc.LJJJI(Boolean.valueOf(linkDialog.isVisible()))) {
            LinkDialog linkDialog2 = this.LJFF;
            if (linkDialog2 == null || (enumC977660bY4 = linkDialog2.LLILZIL) == null) {
                enumC977660bY4 = null;
            }
            if (enumC977660bY4 == EnumC977660bY4.TAKE_THE_STAGE_PLAYING_MANAGE_ANCHOR) {
                C20441214yg.LJ("TakeStagePlayingCoordinatorAudience", "playingManageDialog is showing, no need create again");
                return;
            } else if (linkDialog2 != null) {
                linkDialog2.dismiss();
            }
        }
        if (C500260Jjc.LJJIFFI(Boolean.valueOf(LJJJJJ().LIZIZ))) {
            boolean zLJJJI = C500260Jjc.LJJJI(Boolean.valueOf(LJJJJJ().LJJIJIIJI.LJIILIIL));
            Long l = (Long) C13LP.LJJJLZIJ(0, LJJJJJ().LJJIJIIJI.LJI);
            if (l != null) {
                jLJ = l.longValue();
            } else {
                jLJ = C950220apo.LJ();
            }
            boolean zLJ = LJJJJJ().LJJIJIIJI.LJ();
            if (zLJ) {
                listLIZIZ = LJJJJJ().LJJIJIIJI.LIZIZ();
            } else {
                listLIZIZ = C13BV.INSTANCE;
            }
            boolean z = !LJJJJJ().LJJIJIIJI.LIZJ;
            if (zLJJJI) {
                enumC982940bga = EnumC982940bga.FINAL_CALL;
            } else {
                enumC982940bga = EnumC982940bga.PLAYING;
            }
            LinkDialog linkDialogLIZIZ = C977650bY3.LIZIZ(this.LIZ, jLJ, enumC982940bga, zLJ, listLIZIZ, z, AFwS299S0000000_15.get$arr$(6));
            DataChannel dataChannel = this.LIZLLL;
            if (dataChannel != null) {
                fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class);
            }
            linkDialogLIZIZ.show(fragmentManager, "LinkDialog");
            this.LJFF = linkDialogLIZIZ;
        }
    }

    @Override // X.C982020bf6, X.InterfaceC983130bgt
    public final void LJJIJL(C982460bfo c982460bfo, AbstractC982800bgM abstractC982800bgM, EnumC975850bV9 enumC975850bV9) {
        if (c982460bfo != null && c982460bfo.LJ == EnumC974260bSa.START_FINAL_CALL) {
            new C970920bNC().LJJIFFI("infoResp");
            LJJJJL(c982460bfo.LJIIIIZZ.LIZIZ(), "handleAudienceInfoResult");
        }
    }
}
