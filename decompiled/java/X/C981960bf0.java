package X;

import Y.AfS109S0300000_15;
import Y.AfS4S0200100_15;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.liveinteract.api.LinkCrossRoomStateChangeEvent;
import com.bytedance.android.live.liveinteract.competition.api.CompetitionApi;
import com.bytedance.android.live.liveinteract.competition.core.model.bizextra.TakeTheStageBizExtra;
import com.bytedance.android.live.liveinteract.competition.core.timer.CompetitionCountTimeEvent;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionCommon;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionSettlementStartParams;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionSwitchTurnParams;
import com.bytedance.android.live.liveinteract.competition.states.event.CompetitionStateTransitCountdownEvent;
import com.bytedance.android.live.liveinteract.multihost.biz.dialog.LinkDialog;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AFwS299S0000000_15;
import kotlin.jvm.internal.AwS52S0200100_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.AwS629S0100000_15;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0bf0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C981960bf0 extends C982020bf6 implements InterfaceC983470bhR {
    public LinkDialog LJFF;

    public final void LJJJJZ() {
        C982310bfZ.LIZ("startCountTimeOnSwitchTurn");
        C982320bfa.LIZJ("startCountTimeOnSwitchTurn");
        EnumC962960bAM enumC962960bAM = EnumC962960bAM.TAKE_THE_STAGE;
        EnumC982850bgR enumC982850bgR = EnumC982850bgR.PLAYING;
        Long l = (Long) C13LP.LJJJLZIJ(0, LJJJJJ().LJJIJIIJI.LJI);
        long jLongValue = l != null ? l.longValue() : C950220apo.LJ();
        long jLIZ = LJJJJJ().LJJIJIIJI.LIZ();
        C981540beK c981540beK = LJJJJJ().LJIIJ;
        C982320bfa.LIZ(enumC962960bAM, enumC982850bgR, jLongValue, jLIZ, c981540beK.LIZLLL - c981540beK.LIZJ, true, null, AFwS203S0000000_15.get$arr$(13));
    }

    @Override // X.AbstractC981930bex, X.InterfaceC981890bet
    public final void LIZIZ() {
        super.LIZIZ();
        LJFF();
        LJJJJJ().LJJIJIIJI.LJIILIIL = false;
        C958040b2Q.LJIIJJI("playing_state_will_leave", this.LIZLLL, LJJJJJ(), EnumC958080b2U.TAKE_STAGE_FINAL_CALL);
    }

    @Override // X.C982020bf6, X.AbstractC981930bex, X.InterfaceC981890bet
    public final void LJFF() {
        super.LJFF();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dismiss and coordinator = ");
        sbLIZ.append(this);
        C20441214yg.LIZIZ("TakeStagePlayingCoordinatorAnchor", C2188811AlT.LIZIZ(sbLIZ));
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
        dataChannel.zW(LinkCrossRoomStateChangeEvent.class, new C956380azk(8, "TakeStagePlayingCoordinatorAnchor , onForceTerminated"));
    }

    @Override // X.AbstractC981930bex, X.InterfaceC981890bet
    public final void LJJIII() {
        if (C963580bBM.LIZ()) {
            return;
        }
        LJJJJJ().LJJIJIIJI.LIZLLL = LJJJJJ().LJJIJIIJI.LJI.size();
    }

    public static List LJJJJL(AbstractC982800bgM abstractC982800bgM) {
        List<TakeTheStageBizExtra.PerformAnchor> list;
        if (abstractC982800bgM == null) {
            return C13BV.INSTANCE;
        }
        TakeTheStageBizExtra takeTheStageBizExtraLIZIZ = C982410bfj.LIZIZ(abstractC982800bgM);
        if (takeTheStageBizExtraLIZIZ != null && (list = takeTheStageBizExtraLIZIZ.LIZ) != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<TakeTheStageBizExtra.PerformAnchor> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(Long.valueOf(it2.next().userId));
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }

    @Override // X.AbstractC981930bex, X.InterfaceC981890bet
    public final void LIZ(AbstractC982800bgM abstractC982800bgM) throws JSONException {
        boolean z;
        boolean z2 = false;
        if (abstractC982800bgM instanceof C982620bg4) {
            if (abstractC982800bgM != null) {
                if (C500260Jjc.LJJJI(Boolean.valueOf(LJJJJJ().LJJIJIIJI.LJIILIIL))) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("handleSwitchTurnMessage");
                    sbLIZ.append(" , isInFinalCallFromServer = true");
                    C20441214yg.LJ("TakeStagePlayingCoordinatorAnchor", C2188811AlT.LIZIZ(sbLIZ));
                    return;
                }
                LJFF();
                C981530beJ.LIZ(abstractC982800bgM, LJJJJJ(), this.LIZIZ.getStatus(), this.LIZLLL);
                ArrayList arrayList = new ArrayList(LJJJJL(abstractC982800bgM));
                if (arrayList.size() <= 1) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("handleSwitchTurnMessage");
                    sbLIZ2.append(": performSequenceInfo.size <= 1, size=");
                    sbLIZ2.append(arrayList.size());
                    C20441214yg.LJ("TakeStagePlayingCoordinatorAnchor", C2188811AlT.LIZIZ(sbLIZ2));
                } else {
                    LJJJJJ().LJJIJIIJI.LJI(arrayList);
                }
                if (arrayList.size() < LJJJJJ().LJJIJIIJI.LIZLLL) {
                    z = true;
                } else {
                    z = false;
                }
                LJJJJJ().LJJIJIIJI.LIZLLL = arrayList.size();
                TakeTheStageBizExtra takeTheStageBizExtraLIZIZ = C982410bfj.LIZIZ(abstractC982800bgM);
                if (takeTheStageBizExtraLIZIZ != null) {
                    C973930bS3.LJII(takeTheStageBizExtraLIZIZ.switchTurnReason, false);
                }
                C958040b2Q.LJIIJ("handleSwitchTurnMessage", this.LIZLLL, LJJJJJ(), !z);
                LJJJJZ();
                return;
            }
            return;
        }
        if (!(abstractC982800bgM instanceof C982670bg9)) {
            return;
        }
        C982670bg9 c982670bg9 = (C982670bg9) abstractC982800bgM;
        if (c982670bg9.LIZJ.LIZJ == LJJJJJ().LJIIIZ) {
            z2 = true;
        }
        if (!z2) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("handleSettlementStartMessage");
            sbLIZ3.append(", checkBattleIdSame = false");
            C20441214yg.LJIIIZ("TakeStagePlayingCoordinatorAnchor", C2188811AlT.LIZIZ(sbLIZ3));
            return;
        }
        if (LJJJJJ().LJJ == c982670bg9.LIZJ.LIZJ) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("handleSettlementStartMessage");
            sbLIZ4.append(": already in final call, no repeat ");
            sbLIZ4.append(c982670bg9.LIZJ.LIZJ);
            C20441214yg.LJ("TakeStagePlayingCoordinatorAnchor", C2188811AlT.LIZIZ(sbLIZ4));
            return;
        }
        LJFF();
        if (C500260Jjc.LJJJI(Boolean.valueOf(LJJJJJ().LJJIJIIJI.LJIILIIL))) {
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("handleSettlementStartMessage");
            sbLIZ5.append(" , isInFinalCallFromServer = true");
            C20441214yg.LJ("TakeStagePlayingCoordinatorAnchor", C2188811AlT.LIZIZ(sbLIZ5));
            return;
        }
        LJJJJJ().LJJIJIIJI.LJIILIIL = true;
        C981530beJ.LIZ(c982670bg9, LJJJJJ(), this.LIZIZ.getStatus(), this.LIZLLL);
        LJJJJJ().LJJIJIIJI.LJIILIIL = true;
        C958040b2Q.LJIIJJI("settlement_start_msg", this.LIZLLL, LJJJJJ(), EnumC958080b2U.TAKE_STAGE_FINAL_CALL);
        LJJJJLL(c982670bg9.LJI.LIZIZ(), "handleSettlementStartMessage");
    }

    public C981960bf0(MatchBaseWidget matchBaseWidget, InterfaceC981940bey interfaceC981940bey) {
        super(matchBaseWidget, interfaceC981940bey);
    }

    @Override // X.AbstractC981930bex, X.InterfaceC981890bet
    public final void LJIIL(List list, List list2) throws JSONException {
        if (C500260Jjc.LJJIFFI(Boolean.valueOf(LJJJJJ().LJJIJIIJI.LJIILIIL)) && !C973560bRS.LIZIZ(list, list2)) {
            List<Long> list3 = LJJJJJ().LJJIJIIJI.LJI;
            if (list.size() >= 2 && list.size() < list3.size()) {
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(Long.valueOf(((C954460awe) it2.next()).LJ));
                }
                ArrayList arrayList2 = new ArrayList(arrayList);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onHostsListChanged");
                sbLIZ.append(" , newUidList.size=");
                sbLIZ.append(arrayList2.size());
                sbLIZ.append(", lastPerformUidListFromLocal.size=");
                sbLIZ.append(list3.size());
                sbLIZ.append(", newUidList=");
                sbLIZ.append(arrayList2);
                sbLIZ.append(", lastPerformUidListFromLocal=");
                sbLIZ.append(list3);
                C20441214yg.LJ("TakeStagePlayingCoordinatorAnchor", C2188811AlT.LIZIZ(sbLIZ));
                if (!C13LP.LJJJJ(C13LP.LJJJLZIJ(0, list3), arrayList2)) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("onHostsListChanged");
                    sbLIZ2.append(", onHostsListChanged, not newUidList.contains(lastPerformUid)");
                    C20441214yg.LIZIZ("TakeStagePlayingCoordinatorAnchor", C2188811AlT.LIZIZ(sbLIZ2));
                    ArrayList arrayList3 = new ArrayList(list3);
                    ListProtector.remove(arrayList3, 0);
                    LJJJJJ().LJJIJIIJI.LJI(arrayList3);
                    C981500beG c981500beG = LJJJJJ().LJJIJIIJI;
                    c981500beG.getClass();
                    c981500beG.LIZIZ = C158B.LIZJ();
                    C958040b2Q.LJIIJ("onHostsListChanged", this.LIZLLL, LJJJJJ(), false);
                    return;
                }
                boolean zLJ = LJJJJJ().LJJIJIIJI.LJ();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("onHostsListChanged");
                sbLIZ3.append(", onHostsListChanged, newUidList.contains(lastPerformUid). isStyleV3=");
                sbLIZ3.append(zLJ);
                C20441214yg.LIZIZ("TakeStagePlayingCoordinatorAnchor", C2188811AlT.LIZIZ(sbLIZ3));
                if (zLJ || !C963580bBM.LIZ()) {
                    return;
                }
                C958040b2Q.LJIIJ("onHostsListChanged", this.LIZLLL, LJJJJJ(), false);
            }
        }
    }

    public final void LJJJJLL(long j, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startCountDownOnFinalCall");
        sbLIZ.append(", source=");
        sbLIZ.append(str);
        sbLIZ.append(", countdownSeconds = ");
        sbLIZ.append(j);
        C20441214yg.LJIIIZ("TakeStagePlayingCoordinatorAnchor", C2188811AlT.LIZIZ(sbLIZ));
        DataChannel dataChannel = this.LIZLLL;
        if (dataChannel != null) {
            dataChannel.zW(CompetitionStateTransitCountdownEvent.class, new C983300bhA(str, j));
        }
    }

    @Override // X.InterfaceC983470bhR
    public final void LJIJI(long j, String str, Function2<? super EnumC983140bgu, ? super Long, Unit> function2) {
        long jLJ;
        List<C954460awe> listLIZIZ;
        LinkDialog linkDialog;
        long jLJ2;
        List<C954460awe> listLIZIZ2;
        EnumC982940bga enumC982940bga;
        EnumC977660bY4 enumC977660bY4;
        String str2 = str;
        if (this.LIZ == null) {
            return;
        }
        LinkDialog linkDialog2 = this.LJFF;
        FragmentManager fragmentManager = null;
        if (linkDialog2 != null && C500260Jjc.LJJJI(Boolean.valueOf(linkDialog2.isVisible()))) {
            LinkDialog linkDialog3 = this.LJFF;
            if (linkDialog3 == null || (enumC977660bY4 = linkDialog3.LLILZIL) == null) {
                enumC977660bY4 = null;
            }
            if (enumC977660bY4 == EnumC977660bY4.TAKE_THE_STAGE_PLAYING_MANAGE_ANCHOR) {
                C20441214yg.LJ("TakeStagePlayingCoordinatorAnchor", "playingManageDialog is showing, no need create again");
                return;
            } else if (linkDialog3 != null) {
                linkDialog3.dismiss();
            }
        }
        if (C500260Jjc.LJJIFFI(Boolean.valueOf(LJJJJJ().LIZIZ))) {
            boolean zLJJJI = C500260Jjc.LJJJI(Boolean.valueOf(LJJJJJ().LJJIJIIJI.LJIILIIL));
            Long l = (Long) C13LP.LJJJLZIJ(0, LJJJJJ().LJJIJIIJI.LJI);
            if (l != null) {
                jLJ2 = l.longValue();
            } else {
                jLJ2 = C950220apo.LJ();
            }
            boolean zLJ = LJJJJJ().LJJIJIIJI.LJ();
            if (zLJ) {
                listLIZIZ2 = LJJJJJ().LJJIJIIJI.LIZIZ();
            } else {
                listLIZIZ2 = C13BV.INSTANCE;
            }
            boolean z = !LJJJJJ().LJJIJIIJI.LIZJ;
            if (zLJJJI) {
                enumC982940bga = EnumC982940bga.FINAL_CALL;
            } else {
                enumC982940bga = EnumC982940bga.PLAYING;
            }
            LinkDialog linkDialogLIZIZ = C977650bY3.LIZIZ(this.LIZ, jLJ2, enumC982940bga, zLJ, listLIZIZ2, z, AFwS299S0000000_15.get$arr$(4));
            DataChannel dataChannel = this.LIZLLL;
            if (dataChannel != null) {
                fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class);
            }
            linkDialogLIZIZ.show(fragmentManager, "LinkDialog");
            this.LJFF = linkDialogLIZIZ;
            return;
        }
        boolean zLJJJI2 = C500260Jjc.LJJJI(Boolean.valueOf(LJJJJJ().LJJIJIIJI.LJIILIIL));
        Long l2 = (Long) C13LP.LJJJLZIJ(0, LJJJJJ().LJJIJIIJI.LJI);
        if (l2 != null) {
            jLJ = l2.longValue();
        } else {
            jLJ = C950220apo.LJ();
        }
        boolean zLJ2 = LJJJJJ().LJJIJIIJI.LJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isStyleV3=");
        sbLIZ.append(zLJ2);
        C20441214yg.LIZIZ("TakeStagePlayingCoordinatorAnchor", C2188811AlT.LIZIZ(sbLIZ));
        if (zLJ2) {
            listLIZIZ = LJJJJJ().LJJIJIIJI.LIZIZ();
        } else {
            listLIZIZ = C13BV.INSTANCE;
        }
        boolean z2 = !LJJJJJ().LJJIJIIJI.LIZJ;
        MatchBaseWidget matchBaseWidget = this.LIZ;
        List<Long> list = LJJJJJ().LJJIJIIJI.LJII;
        if (str2 == null) {
            str2 = "";
        }
        AwS52S0200100_15 awS52S0200100_15 = new AwS52S0200100_15(this, j, (AwS629S0100000_15) function2, 0);
        if (zLJJJI2) {
            linkDialog = new LinkDialog(matchBaseWidget);
            EnumC977660bY4 enumC977660bY42 = EnumC977660bY4.TAKE_THE_STAGE_SETTLEMENT_MANAGE_ANCHOR;
            C981180bdk c981180bdk = new C981180bdk();
            c981180bdk.LIZIZ = awS52S0200100_15;
            c981180bdk.LIZJ = str2;
            c981180bdk.LIZLLL = zLJ2;
            linkDialog.LLILZIL = enumC977660bY42;
            linkDialog.LLILZLL = c981180bdk;
        } else {
            linkDialog = new LinkDialog(matchBaseWidget);
            EnumC977660bY4 enumC977660bY43 = EnumC977660bY4.TAKE_THE_STAGE_PLAYING_MANAGE_ANCHOR;
            C979620bbE c979620bbE = new C979620bbE();
            c979620bbE.LIZIZ = awS52S0200100_15;
            c979620bbE.LIZJ = jLJ;
            c979620bbE.LIZLLL = list;
            c979620bbE.LJFF = str2;
            c979620bbE.LJI = zLJ2;
            c979620bbE.LJ = listLIZIZ;
            c979620bbE.LJII = z2;
            linkDialog.LLILZIL = enumC977660bY43;
            linkDialog.LLILZLL = c979620bbE;
        }
        DataChannel dataChannel2 = this.LIZLLL;
        if (dataChannel2 != null) {
            fragmentManager = (FragmentManager) dataChannel2.gg0(C748880TZe.class);
        }
        linkDialog.show(fragmentManager, "LinkDialog");
        this.LJFF = linkDialog;
    }

    @Override // X.C982020bf6, X.InterfaceC983130bgt
    public final void LJIJJLI(C982460bfo c982460bfo, AbstractC982800bgM abstractC982800bgM, EnumC975850bV9 enumC975850bV9) throws JSONException {
        long jLJ;
        C958040b2Q.LJIIJ("doOnStateDidEnterIfNeed", this.LIZLLL, LJJJJJ(), false);
        C982310bfZ.LIZ("startCountTimeOnStateDidEnterIfNeed");
        C982320bfa.LIZJ("startCountTimeOnStateDidEnterIfNeed");
        EnumC962960bAM enumC962960bAM = EnumC962960bAM.TAKE_THE_STAGE;
        EnumC982850bgR enumC982850bgR = EnumC982850bgR.PLAYING;
        Long l = (Long) C13LP.LJJJLZIJ(0, LJJJJJ().LJJIJIIJI.LJI);
        if (l != null) {
            jLJ = l.longValue();
        } else {
            jLJ = C950220apo.LJ();
        }
        long jLIZ = LJJJJJ().LJJIJIIJI.LIZ();
        C981540beK c981540beK = LJJJJJ().LJIIJ;
        C982320bfa.LIZ(enumC962960bAM, enumC982850bgR, jLJ, jLIZ, c981540beK.LIZLLL - c981540beK.LIZJ, true, null, AFwS203S0000000_15.get$arr$(14));
        DataChannel dataChannel = this.LIZLLL;
        if (dataChannel != null) {
            dataChannel.DQ2(CompetitionCountTimeEvent.class, this, new AwS594S0100000_15(this, 11));
        }
    }

    @Override // X.C982020bf6, X.InterfaceC983130bgt
    public final void LJJIJL(C982460bfo c982460bfo, AbstractC982800bgM abstractC982800bgM, EnumC975850bV9 enumC975850bV9) {
        ArrayList arrayList = new ArrayList(LJJJJL(abstractC982800bgM));
        if (arrayList.size() <= 1) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateDataByOnStateDidEnter");
            sbLIZ.append(": performSequenceInfo.size <= 1, size=");
            sbLIZ.append(arrayList.size());
            C20441214yg.LJ("TakeStagePlayingCoordinatorAnchor", C2188811AlT.LIZIZ(sbLIZ));
        } else {
            C981500beG c981500beG = LJJJJJ().LJJIJIIJI;
            c981500beG.LJI(arrayList);
            long jLongValue = ((Number) ListProtector.get(arrayList, 0)).longValue();
            if (jLongValue != 0) {
                C973910bS1.LJIIIIZZ.getClass();
                C973920bS2.LIZIZ = jLongValue;
            }
            LJJJJJ().LJJIIZI.getClass();
            C973920bS2 c973920bS2 = C973910bS1.LJIIIIZZ;
            List<Long> list = c981500beG.LJI;
            c973920bS2.getClass();
            C973920bS2.LIZJ = list;
            C974430bSr c974430bSr = LJJJJJ().LJJIJIIJIL;
            c974430bSr.LIZIZ = c974430bSr.LIZ.LJJIJIIJI.LJI;
        }
        if (C963580bBM.LIZ()) {
            LJJJJJ().LJJIJIIJI.LIZLLL = LJJJJJ().LJJIJIIJI.LJI.size();
            C20441214yg.LIZIZ("TakeStagePlayingCoordinatorAnchor", "updateDataByOnStateDidEnter, updateDataOnStateDidEnter, lastPerformSize = " + LJJJJJ().LJJIJIIJI.LIZLLL);
        }
    }

    @Override // X.AbstractC981930bex, X.InterfaceC981890bet
    public final void LJJIZ(int i, long j, long j2) {
        LJJJJLI(j, j2, i);
    }

    public final void LJJJJLI(long j, long j2, int i) {
        int i2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("requestSwitchTurn, nextPerformUid=");
        sbLIZ.append(j2);
        C20441214yg.LIZIZ("TakeStagePlayingCoordinatorAnchor", C2188811AlT.LIZIZ(sbLIZ));
        long channelId = C915980Zwa.LJII().getChannelId();
        C974560bT4 c974560bT4 = new C974560bT4();
        AbstractC962030b8r.LJIIJ(c974560bT4.LIZLLL, "select_uid", Long.valueOf(j2), true);
        c974560bT4.LJIJJLI("switch_turn_request");
        C974560bT4 c974560bT42 = new C974560bT4();
        if (i == 2) {
            i2 = 5;
        } else {
            i2 = 0;
        }
        C930480aJy c930480aJy = C930480aJy.LIZ;
        C480460Ism.LIZ().getClass();
        CompetitionApi competitionApi = (CompetitionApi) C480460Ism.LIZLLL(CompetitionApi.class);
        CompetitionSwitchTurnParams competitionSwitchTurnParams = new CompetitionSwitchTurnParams();
        CompetitionCommon competitionCommon = new CompetitionCommon();
        competitionCommon.type = EnumC962960bAM.TAKE_THE_STAGE.getType();
        competitionCommon.channelId = channelId;
        competitionCommon.competitionId = j;
        competitionSwitchTurnParams.bizCommon = competitionCommon;
        competitionSwitchTurnParams.nextPerformerUserId = j2;
        competitionSwitchTurnParams.switchTurnType = i;
        C11JF c11jfLIZ = ((C0J1N) competitionApi.switchTurn(competitionSwitchTurnParams).LJJLIIIJLJLI(new C1811860xFY(i2, 1000L)).LJIILIIL(new C0UO0()).LIZJ(C11RD.LJ(this.LIZ))).LIZ(new AfS4S0200100_15(j2, this, c974560bT42, 0), new AfS4S0200100_15(j2, this, c974560bT42, 1));
        C11NJ c11njLJJJJIZL = LJJJJIZL();
        c930480aJy.getClass();
        c11njLJJJJIZL.LIZ(c11jfLIZ);
    }

    @Override // X.InterfaceC983470bhR
    public final void LJJIIJ(int i, long j, Function1 function1, Function1 function12) {
        int i2;
        long channelId = C915980Zwa.LJII().getChannelId();
        new C974560bT4().LJIJJLI("final_call_request");
        C974560bT4 c974560bT4 = new C974560bT4();
        if (i == 2) {
            i2 = 5;
        } else {
            i2 = 0;
        }
        C930480aJy c930480aJy = C930480aJy.LIZ;
        C480460Ism.LIZ().getClass();
        CompetitionApi competitionApi = (CompetitionApi) C480460Ism.LIZLLL(CompetitionApi.class);
        CompetitionSettlementStartParams competitionSettlementStartParams = new CompetitionSettlementStartParams();
        CompetitionCommon competitionCommon = new CompetitionCommon();
        competitionCommon.type = EnumC962960bAM.TAKE_THE_STAGE.getType();
        competitionCommon.channelId = channelId;
        competitionCommon.competitionId = j;
        competitionSettlementStartParams.bizCommon = competitionCommon;
        competitionSettlementStartParams.settlementStartType = i;
        C11JF c11jfLIZ = ((C0J1N) competitionApi.competitionSettlementStart(competitionSettlementStartParams).LJJLIIIJLJLI(new C1811860xFY(i2, 1000L)).LJIILIIL(new C0UO0()).LIZJ(C11RD.LJ(this.LIZ))).LIZ(new AfS109S0300000_15(this, c974560bT4, function1, 2), new AfS109S0300000_15(this, c974560bT4, function12, 3));
        C11NJ c11njLJJJJIZL = LJJJJIZL();
        c930480aJy.getClass();
        c11njLJJJJIZL.LIZ(c11jfLIZ);
    }
}
