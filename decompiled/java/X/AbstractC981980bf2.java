package X;

import X.InterfaceC983130bgt;
import Y.ARunnableS84S0200000_15;
import android.os.Looper;
import com.bytedance.android.live.liveinteract.competition.states.event.CompetitionStateTransitCountdownEvent;
import com.bytedance.android.livesdk.comp.api.linkcore.model.AbnormalDisconnectReason;
import com.bytedance.android.livesdk.livesetting.linkmic.match.CompetitionIgnoreOtherUsersDisconnectSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMockRematchRecommendBattle;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.CohostContentGuideInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.MatchPunishExtraInfo;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS11S0300100_15;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.AwS55S0310000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bf2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractC981980bf2<COORDINATOR extends InterfaceC983130bgt> extends AbstractC981450beB<COORDINATOR> {
    public final BPEAHandler LJ;
    public boolean LJFF;
    public boolean LJI;
    public final ARunnableS84S0200000_15 LJII;

    public static void LJJJJZI(AbstractC981980bf2 abstractC981980bf2) {
        long j = abstractC981980bf2.LJJIII().LJIIIZ;
        InterfaceC983130bgt interfaceC983130bgt = (InterfaceC983130bgt) abstractC981980bf2.LJJII();
        if (interfaceC983130bgt != null) {
            interfaceC983130bgt.LJIJ(j, new AwS381S0200000_15(abstractC981980bf2, (AbstractC981980bf2<InterfaceC983130bgt>) null, (Function0<Unit>) 98), new AwS594S0100000_15(abstractC981980bf2, (AbstractC981980bf2<InterfaceC983130bgt>) 771));
        }
    }

    @Override // X.AbstractC981450beB, X.InterfaceC976690bWV
    public void LIZ(AbstractC982800bgM abstractC982800bgM) {
        boolean z;
        EnumC973680bRe enumC973680bRe;
        if (abstractC982800bgM instanceof C982570bfz) {
            if (LJJIII().LJIIIZ != 0 && !AbstractC981450beB.LJJIIJZLJL(this, abstractC982800bgM.LIZJ.LIZJ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("handleScoreChangeMessage");
                sbLIZ.append(", checkBattleIdSame = false");
                C20441214yg.LJ("CompetitionStatePlayingBase", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            C20441214yg.LIZIZ("CompetitionStatePlayingBase", "handleScoreChangeMessage");
            EnumC974260bSa enumC974260bSa = this.LIZIZ;
            if (enumC974260bSa != EnumC974260bSa.START && enumC974260bSa != EnumC974260bSa.SETTLE) {
                return;
            }
            LJJJJIZL(abstractC982800bgM);
            return;
        }
        boolean z2 = true;
        if (abstractC982800bgM instanceof C982490bfr) {
            C982490bfr c982490bfr = (C982490bfr) abstractC982800bgM;
            int i = C982810bgN.LIZ[c982490bfr.LJII.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    LJJJJLL(c982490bfr);
                    return;
                } else {
                    LJJJJLL(c982490bfr);
                    return;
                }
            }
            LJJJJLI(c982490bfr);
            return;
        }
        if (abstractC982800bgM instanceof C982530bfv) {
            C982530bfv c982530bfv = (C982530bfv) abstractC982800bgM;
            if (!AbstractC981450beB.LJJIIJZLJL(this, c982530bfv.LIZJ.LIZJ)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("handleFinishMessage");
                sbLIZ2.append(", checkBattleIdSame = false");
                C20441214yg.LJ("CompetitionStatePlayingBase", C2188811AlT.LIZIZ(sbLIZ2));
                return;
            }
            C20441214yg.LIZIZ("CompetitionStatePlayingBase", "handleFinishMessage");
            if (c982530bfv.LJFF == EnumC982750bgH.CUTSHORT) {
                z = true;
            } else {
                z = false;
            }
            if (C176600m4.LIZIZ(Boolean.valueOf(this.LIZ.isAnchor()))) {
                LJJIII().getClass();
                LJJIII().LJJI = z;
                Room roomInfo = this.LIZ.getRoomInfo();
                if (roomInfo == null || c982530bfv.LJI != roomInfo.getOwnerUserId()) {
                    z2 = false;
                }
                C981550beL c981550beL = LJJIII().LJJIJ;
                if (z2) {
                    enumC973680bRe = EnumC973680bRe.POSITIVE_OVER;
                } else {
                    enumC973680bRe = EnumC973680bRe.NEGATIVE_OVER;
                }
                c981550beL.LJIIIZ = enumC973680bRe;
                AbstractC981450beB.LJJIJL(this, "punish_finish_msg", c982530bfv, z2, 4);
                return;
            }
            LJJIII().getClass();
            AbstractC981450beB.LJJIJLIJ(this, EnumC975850bV9.MATCH_END_FINISH_SOURCE_PUNISH_FINISH_MESSAGE, c982530bfv, null, 4);
            return;
        }
        super.LIZ(abstractC982800bgM);
    }

    @Override // X.AbstractC981450beB, X.InterfaceC976690bWV
    public void LIZJ(EnumC975850bV9 enumC975850bV9) {
        DataChannel dataChannel = this.LIZ.getDataChannel();
        if (dataChannel != null) {
            dataChannel.CQ2(CompetitionStateTransitCountdownEvent.class, this, new AwS594S0100000_15(this, (AbstractC981980bf2<InterfaceC983130bgt>) 772));
        }
        super.LIZJ(enumC975850bV9);
        if (this.LIZIZ == EnumC974260bSa.START) {
            this.LJFF = false;
            this.LJI = false;
        }
    }

    @Override // X.AbstractC981450beB, X.InterfaceC976690bWV
    public void LJI(EnumC975850bV9 enumC975850bV9) {
        super.LJI(enumC975850bV9);
        COORDINATOR coordinatorLJJII = LJJII();
        if (coordinatorLJJII != null) {
            coordinatorLJJII.LJFF();
        }
        this.LJ.removeCallbacks(this.LJII);
        DataChannel dataChannel = this.LIZ.getDataChannel();
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
    }

    public final void LJJJJL(AwS55S0310000_15 awS55S0310000_15) {
        long currentUserId;
        LJJIII().LJJIII = awS55S0310000_15;
        if (this.LIZ.getBizType() == EnumC962960bAM.CATCH_BEANS) {
            C20441214yg.LIZIZ("CompetitionStatePlayingBase", "endCurrentGameMode, calling quit for take the stage");
            InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
            if (interfaceC500940JkiUser != null) {
                currentUserId = interfaceC500940JkiUser.getCurrentUserId();
            } else {
                currentUserId = 0;
            }
            LJJJJJL(this, 212, currentUserId, 1L);
            return;
        }
        if (this.LIZ.getBizType() != EnumC962960bAM.TAKE_THE_STAGE) {
            return;
        }
        C20441214yg.LIZIZ("CompetitionStatePlayingBase", "endCurrentGameMode, calling leave for catch beans");
        LJJJJZI(this);
    }

    public final void LJJJJLI(C982490bfr c982490bfr) {
        if (!AbstractC981450beB.LJJIIJZLJL(this, c982490bfr.LIZJ.LIZJ)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("handleCutShortMessage");
            sbLIZ.append(", checkBattleIdSame = false");
            C20441214yg.LJIIIZ("CompetitionStatePlayingBase", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (LJJIII().LJJ == c982490bfr.LIZJ.LIZJ) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("handleCutShortMessage");
            sbLIZ2.append(": Already have settlement result , no repeat ");
            sbLIZ2.append(c982490bfr.LIZJ.LIZJ);
            C20441214yg.LJ("CompetitionStatePlayingBase", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        LJJIII().LJJ = c982490bfr.LIZJ.LIZJ;
        LJJIII().LJJIFFI = true;
        LJJIII().LJJI = true;
        LJJJJIZL(c982490bfr);
        EnumC982500bfs enumC982500bfs = c982490bfr.LJI;
        COORDINATOR coordinatorLJJII = LJJII();
        if (coordinatorLJJII != null) {
            coordinatorLJJII.LJII(enumC982500bfs.getType());
        }
        LJJIIJ(c982490bfr.LJIIIIZZ, true, c982490bfr.LJFF);
    }

    public final void LJJJJLL(C982490bfr c982490bfr) {
        CohostContentGuideInfo cohostContentGuideInfo;
        int value = LiveMockRematchRecommendBattle.INSTANCE.getValue();
        if (value != 0) {
            cohostContentGuideInfo = new CohostContentGuideInfo();
            cohostContentGuideInfo.recommendedBattleType = value;
        } else {
            MatchPunishExtraInfo matchPunishExtraInfo = c982490bfr.LJIIJ;
            if (matchPunishExtraInfo != null) {
                cohostContentGuideInfo = matchPunishExtraInfo.cohostContentGuideInfo;
            } else {
                cohostContentGuideInfo = null;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleCoHostGuideInfo, guideInfo = ");
        sbLIZ.append(cohostContentGuideInfo);
        C20441214yg.LIZIZ("CompetitionStatePlayingBase", C2188811AlT.LIZIZ(sbLIZ));
        LJJIII().LJJII = cohostContentGuideInfo;
        if (!AbstractC981450beB.LJJIIJZLJL(this, c982490bfr.LIZJ.LIZJ)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("handleSettlementEndMessage");
            sbLIZ2.append(", checkBattleIdSame = false");
            C20441214yg.LJIIIZ("CompetitionStatePlayingBase", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        if (LJJIII().LJJ == c982490bfr.LIZJ.LIZJ) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("handleSettlementEndMessage");
            sbLIZ3.append(": already have settlement result , no repeat ");
            sbLIZ3.append(c982490bfr.LIZJ.LIZJ);
            C20441214yg.LJ("CompetitionStatePlayingBase", C2188811AlT.LIZIZ(sbLIZ3));
            return;
        }
        LJJIII().LJJ = c982490bfr.LIZJ.LIZJ;
        LJJIII().LJJIFFI = false;
        LJJJJIZL(c982490bfr);
        LJJIIJ(c982490bfr.LJIIIIZZ, false, c982490bfr.LJFF);
    }

    public void LJJJJZ(C983300bhA c983300bhA) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onStateTransitCountdownStart, data=");
        sbLIZ.append(c983300bhA);
        C20441214yg.LIZIZ("CompetitionStatePlayingBase", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.AbstractC981450beB, X.InterfaceC976690bWV
    public void LIZIZ(EnumC962960bAM enumC962960bAM, String str) {
        super.LIZIZ(enumC962960bAM, str);
        C500260Jjc.LJJIJIIJIL(Boolean.valueOf(this.LIZ.isAnchor()));
    }

    @Override // X.AbstractC981450beB, X.InterfaceC976690bWV
    public void LJFF(long j, String str) {
        super.LJFF(j, str);
        List<C954460awe> list = LJJIII().LJI;
        long j2 = 0;
        if (list != null) {
            for (C954460awe c954460awe : list) {
                if (Intrinsics.LJFF(c954460awe.LJIIJJI, str)) {
                    j2 = c954460awe.LJ;
                }
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onUserLeft, leaveReason = ");
        sbLIZ.append(j);
        sbLIZ.append(" ,linkMicId = ");
        sbLIZ.append(str);
        sbLIZ.append(", leftUid = ");
        sbLIZ.append(j2);
        C20441214yg.LIZIZ("CompetitionStatePlayingBase", C2188811AlT.LIZIZ(sbLIZ));
        LJJJJJL(this, 212, j2, j);
        COORDINATOR coordinatorLJJII = LJJII();
        if (coordinatorLJJII != null) {
            coordinatorLJJII.LJFF();
        }
        C786410Ut5.LJLIIL(1000L, this.LJ, this.LJII);
    }

    @Override // X.AbstractC981450beB, X.InterfaceC976690bWV
    public final void LJIILIIL(EnumC962960bAM enumC962960bAM, int i) {
        super.LJIILIIL(enumC962960bAM, i);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onClickGuide, noticeType = ");
        sbLIZ.append(i);
        C20441214yg.LIZIZ("CompetitionStatePlayingBase", C2188811AlT.LIZIZ(sbLIZ));
        if (i != 7 && (i == 6 || C915980Zwa.LIZ().kg2())) {
            C766270U4b.LIZLLL(2131853314);
        } else {
            C766270U4b.LIZLLL(2131851643);
        }
    }

    public AbstractC981980bf2(InterfaceC976620bWO interfaceC976620bWO, EnumC974260bSa enumC974260bSa, AbstractC982800bgM abstractC982800bgM) {
        super(interfaceC976620bWO, enumC974260bSa, abstractC982800bgM);
        this.LJ = new BPEAHandler(Looper.getMainLooper());
        this.LJII = new ARunnableS84S0200000_15(interfaceC976620bWO, this, 39);
    }

    @Override // X.AbstractC981450beB, X.InterfaceC976690bWV
    public void LJIIIIZZ(int i, int i2, AbnormalDisconnectReason abnormalDisconnectReason) {
        long currentUserId;
        COORDINATOR coordinatorLJJII;
        super.LJIIIIZZ(i, i2, abnormalDisconnectReason);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLinkMicFinish, finishReason = ");
        sbLIZ.append(i);
        sbLIZ.append(" ,detailCode = ");
        sbLIZ.append(i2);
        sbLIZ.append(" , abnorReason = ");
        sbLIZ.append(abnormalDisconnectReason);
        sbLIZ.append(" , disconnectId = ");
        sbLIZ.append(C915980Zwa.LJI().LIZ().LJJJ());
        C20441214yg.LIZIZ("CompetitionStatePlayingBase", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        if (interfaceC500940JkiUser != null) {
            currentUserId = interfaceC500940JkiUser.getCurrentUserId();
        } else {
            currentUserId = 0;
        }
        if (C915980Zwa.LJII().LLILZLL(true).size() < 2 && (coordinatorLJJII = LJJII()) != null) {
            coordinatorLJJII.LJFF();
        }
        if (!CompetitionIgnoreOtherUsersDisconnectSettings.INSTANCE.isEnabled()) {
            LJJJJJL(this, 103, currentUserId, i);
        } else {
            if (C915980Zwa.LJI().LIZ().LJJJ() == 0) {
                return;
            }
            LJJJJJL(this, 103, currentUserId, i);
        }
    }

    public static void LJJJJJL(AbstractC981980bf2 abstractC981980bf2, int i, long j, long j2) {
        int i2;
        AFwS203S0000000_15 aFwS203S0000000_15 = AFwS203S0000000_15.get$arr$(299);
        abstractC981980bf2.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("doOnHostLeft, leaveSource = ");
        sbLIZ.append(i);
        sbLIZ.append(", leftAnchorId = ");
        sbLIZ.append(j);
        sbLIZ.append(", leaveOfFinishReason =");
        sbLIZ.append(j2);
        sbLIZ.append("leftAnchorId == ");
        sbLIZ.append(j);
        sbLIZ.append(", currentRoomUserId = ");
        sbLIZ.append(C950220apo.LJ());
        sbLIZ.append(" , multiCoHostService.getCoHostLinkedUserList().size = ");
        sbLIZ.append(C915980Zwa.LJII().LLILZLL(true).size());
        C20441214yg.LIZIZ("CompetitionStatePlayingBase", C2188811AlT.LIZIZ(sbLIZ));
        EnumC974260bSa enumC974260bSaY2 = abstractC981980bf2.LIZ.Y2();
        int i3 = C982810bgN.LIZIZ[enumC974260bSaY2.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                i2 = 0;
            } else {
                i2 = 2;
            }
        } else {
            i2 = 1;
        }
        C974540bT2 c974540bT2 = C974540bT2.LIZ;
        String strLJJIJIIJIL = C974540bT2.LJJIJIIJIL(i, j2);
        if (C915980Zwa.LJII().LLILZLL(true).size() < 2 || j == C950220apo.LJ()) {
            InterfaceC983130bgt interfaceC983130bgt = (InterfaceC983130bgt) abstractC981980bf2.LJJII();
            long j3 = abstractC981980bf2.LJJIII().LJIIIZ;
            abstractC981980bf2.LJJIII().getClass();
            long jLIZ = C981480beE.LIZ();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("requestLeaveLinkMicApi");
            sbLIZ2.append(", coordinator is ");
            sbLIZ2.append(interfaceC983130bgt);
            C20441214yg.LIZIZ("CompetitionStatePlayingBase", C2188811AlT.LIZIZ(sbLIZ2));
            if (enumC974260bSaY2 == EnumC974260bSa.START || enumC974260bSaY2 == EnumC974260bSa.SETTLE) {
                abstractC981980bf2.LJJIII().LJJI = true;
            }
            if (interfaceC983130bgt != null) {
                interfaceC983130bgt.LJJJI(j3, jLIZ, j, strLJJIJIIJIL, new AwS11S0300100_15(abstractC981980bf2, enumC974260bSaY2, i2, j, j2, aFwS203S0000000_15, 0), new AwS594S0100000_15(abstractC981980bf2, (AbstractC981980bf2<InterfaceC983130bgt>) 928));
            }
        }
    }
}
