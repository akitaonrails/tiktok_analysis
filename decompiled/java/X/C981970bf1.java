package X;

import Y.AfS151S0200000_15;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.competition.api.CompetitionApi;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionCommon;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionInfoParams;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchAudienceCheckBattleInfoSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamResult;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamUser;
import com.bytedance.scene.Scene;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.AFwS299S0000000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bf1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C981970bf1 extends AbstractC981980bf2<InterfaceC983780bhw> {
    public final C982460bfo LJIIIIZZ;
    public List<C982390bfh> LJIIIZ;
    public EnumC974260bSa LJIIJ;
    public boolean LJIIJJI;
    public int LJIIL;
    public C11JF LJIILIIL;

    @Override // X.AbstractC981450beB
    public final Set LJJIFFI() {
        return C093Y.LIZJ(EnumC974260bSa.SETTLE);
    }

    @Override // X.AbstractC981980bf2, X.AbstractC981450beB, X.InterfaceC976690bWV
    public final void LIZ(AbstractC982800bgM abstractC982800bgM) {
        boolean z;
        if (abstractC982800bgM instanceof C982470bfp) {
            C982470bfp c982470bfp = (C982470bfp) abstractC982800bgM;
            if (c982470bfp.LJFF == EnumC982740bgG.REMATCH) {
                z = true;
            } else {
                z = false;
            }
            C973690bRf.LIZ.LJIJI(LJJIII().LJIIIZ, this.LIZ.getRoomInfo());
            C955400ayA.LJJJJI();
            if (z) {
                C970290bMB.LIZ.getClass();
                C970290bMB.LJIJJ(1, false);
            }
            C970290bMB.LIZ.LJIJI("open_message", "start", true, z);
            C955430ayD.LJIIIIZZ("match_open_message");
            LJJJJIZL(c982470bfp);
            AbstractC981450beB.LJJJJI(this, EnumC975850bV9.OPEN_MESSAGE_IN_PUNISH, c982470bfp, null, 4);
            return;
        }
        if (abstractC982800bgM instanceof C982490bfr) {
            C982490bfr c982490bfr = (C982490bfr) abstractC982800bgM;
            if (c982490bfr.LJII == EnumC982750bgH.CUTSHORT) {
                LJJJJLI(c982490bfr);
                return;
            }
            LJJJJIZL(c982490bfr);
            LJJIII().LJJIFFI = c982490bfr.LJII.isCutshort();
            LJJJLL("finish_msg", EnumC975850bV9.RESULT_FROM_FINISH_MESSAGE, c982490bfr.LJFF, EnumC974260bSa.SETTLE);
            return;
        }
        if (abstractC982800bgM instanceof C982530bfv) {
            LJJJLZIJ((C982530bfv) abstractC982800bgM);
        } else {
            super.LIZ(abstractC982800bgM);
        }
    }

    @Override // X.AbstractC981980bf2, X.AbstractC981450beB, X.InterfaceC976690bWV
    public final void LIZJ(EnumC975850bV9 enumC975850bV9) {
        super.LIZJ(enumC975850bV9);
        if (enumC975850bV9 == EnumC975850bV9.TIME_OVER_SETTLEMENT) {
            LJJJLIIL(true);
        } else {
            C982460bfo c982460bfo = this.LJIIIIZZ;
            if (c982460bfo != null) {
                LJJJJJ(c982460bfo);
                if (c982460bfo.LJII.isEmpty()) {
                    LJJJLIIL(true);
                    C20441214yg.LIZIZ("CompetitionStateSettlementAudience", "handleInfoResult, teamScores.isEmpty, start audienceSyncInfo");
                } else {
                    LJJJLL("room_enter_battle_info", enumC975850bV9, c982460bfo.LJII, c982460bfo.LJ);
                }
            }
            AbstractC982800bgM abstractC982800bgM = this.LIZJ;
            if (abstractC982800bgM != null) {
                if (abstractC982800bgM instanceof C982490bfr) {
                    C982490bfr c982490bfr = (C982490bfr) abstractC982800bgM;
                    LJJJJIZL(c982490bfr);
                    LJJIII().LJJIFFI = c982490bfr.LJII.isCutshort();
                    LJJJLL("finish_msg", EnumC975850bV9.RESULT_FROM_FINISH_MESSAGE, c982490bfr.LJFF, EnumC974260bSa.SETTLE);
                }
                if (abstractC982800bgM instanceof C982530bfv) {
                    LJJJLZIJ((C982530bfv) abstractC982800bgM);
                }
            }
            if (enumC975850bV9 != EnumC975850bV9.SETTLE_FINISH_MESSAGE_AUDIENCE) {
                C973690bRf.LIZ.LJJI(false);
            }
        }
        InterfaceC983130bgt interfaceC983130bgt = (InterfaceC983130bgt) LJJII();
        if (interfaceC983130bgt != null) {
            interfaceC983130bgt.LJJIJL(this.LJIIIIZZ, this.LIZJ, enumC975850bV9);
        }
    }

    @Override // X.AbstractC981980bf2, X.AbstractC981450beB, X.InterfaceC976690bWV
    public final void LJI(EnumC975850bV9 enumC975850bV9) {
        super.LJI(enumC975850bV9);
        this.LJ.removeCallbacksAndMessages(null);
        C11JF c11jf = this.LJIILIIL;
        if (c11jf != null) {
            C500260Jjc.LJJLIIIJLJLI(c11jf);
        }
        this.LJIILIIL = null;
        C973760bRm.LIZLLL.LIZJ();
    }

    @Override // X.AbstractC981450beB, X.InterfaceC976690bWV
    public final void LJIIJ(C945320ahu c945320ahu) {
        super.LJIIJ(c945320ahu);
        InterfaceC983780bhw interfaceC983780bhw = (InterfaceC983780bhw) LJJII();
        if (interfaceC983780bhw != null) {
            interfaceC983780bhw.LJIILL(c945320ahu);
        }
    }

    @Override // X.AbstractC981980bf2
    public final void LJJJJZ(C983300bhA c983300bhA) {
        super.LJJJJZ(c983300bhA);
        this.LJIIJJI = true;
        C982320bfa.LIZ(LJJIII().LJIIIIZZ, EnumC982850bgR.SETTLEMENT, C950220apo.LJ(), 0L, c983300bhA.LIZIZ, false, AFwS250S0000000_15.get$arr$(186), new AwS559S0100000_15(this, 856));
    }

    public final void LJJJLIIL(boolean z) {
        Boolean boolValueOf;
        if (z) {
            this.LJIIL = LiveMatchAudienceCheckBattleInfoSetting.INSTANCE.getFinishRetryCount();
        }
        long id = 0;
        if (LJJIII().LJIIIZ <= 0) {
            return;
        }
        C11JF c11jf = this.LJIILIIL;
        if (c11jf != null) {
            boolValueOf = Boolean.valueOf(c11jf.isDisposed());
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJIFFI(boolValueOf)) {
            return;
        }
        this.LJIIL--;
        LJJIII().getClass();
        long jLIZ = C981480beE.LIZ();
        long j = LJJIII().LJIIIZ;
        C970920bNC c970920bNC = new C970920bNC();
        c970920bNC.LJIIL("audience_result", Scene.SCENE_SERVICE, true);
        c970920bNC.LJIJJLI("battle_info_request");
        C970920bNC c970920bNC2 = new C970920bNC();
        C480460Ism.LIZ().getClass();
        CompetitionApi competitionApi = (CompetitionApi) C480460Ism.LIZLLL(CompetitionApi.class);
        CompetitionInfoParams competitionInfoParams = new CompetitionInfoParams();
        CompetitionCommon competitionCommon = new CompetitionCommon();
        competitionCommon.type = LJJIII().LJIIIIZZ.getType();
        competitionCommon.channelId = jLIZ;
        competitionCommon.competitionId = j;
        competitionInfoParams.bizCommon = competitionCommon;
        Room roomInfo = this.LIZ.getRoomInfo();
        if (roomInfo != null) {
            id = roomInfo.getId();
        }
        competitionInfoParams.roomId = id;
        competitionInfoParams.needMvp = false;
        this.LJIILIIL = (C11JF) competitionApi.competitionInfo(competitionInfoParams).LJIILIIL(new C0UO0()).LJJLL(new AfS151S0200000_15(c970920bNC2, this, 47), new AfS151S0200000_15(c970920bNC2, this, 48));
    }

    public final void LJJJLZIJ(C982530bfv c982530bfv) {
        int i;
        Long lValueOf;
        User owner;
        if (c982530bfv != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            long jLongValue = LJJIII().LJIILIIL;
            if (jLongValue == 0) {
                for (BattleTeamResult battleTeamResult : linkedHashMap.values()) {
                    List<BattleTeamUser> list = battleTeamResult.teamUsers;
                    if (list != null) {
                        Iterator<BattleTeamUser> it2 = list.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                BattleTeamUser next = it2.next();
                                Long l = next.userId;
                                Room roomInfo = this.LIZ.getRoomInfo();
                                if (roomInfo != null && (owner = roomInfo.getOwner()) != null) {
                                    lValueOf = Long.valueOf(owner.getId());
                                } else {
                                    lValueOf = null;
                                }
                                if (Intrinsics.LJFF(l, lValueOf)) {
                                    if (next != null) {
                                        Long l2 = battleTeamResult.teamId;
                                        if (l2 != null) {
                                            jLongValue = l2.longValue();
                                        } else {
                                            jLongValue = 1;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            BattleTeamResult battleTeamResult2 = (BattleTeamResult) linkedHashMap.get(Long.valueOf(jLongValue));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("post MatchCutShortEvent currentResult = ");
            sbLIZ.append(battleTeamResult2);
            C20441214yg.LJIIIZ("CompetitionStateSettlementAudience", C2188811AlT.LIZIZ(sbLIZ));
            InterfaceC983130bgt interfaceC983130bgt = (InterfaceC983130bgt) LJJII();
            if (interfaceC983130bgt != null) {
                if (battleTeamResult2 != null) {
                    i = battleTeamResult2.result;
                } else {
                    i = 2;
                }
                interfaceC983130bgt.LJII(i);
            }
        }
        LJJIII().LJJIFFI = true;
        AbstractC981450beB.LJJIJLIJ(this, EnumC975850bV9.RESULT_FROM_CUT_SHORT_MESSAGE, c982530bfv, null, 4);
    }

    @Override // X.AbstractC981980bf2, X.AbstractC981450beB, X.InterfaceC976690bWV
    public final void LIZIZ(EnumC962960bAM enumC962960bAM, String str) {
        super.LIZIZ(enumC962960bAM, str);
        long j = LJJIII().LJIIIZ;
        InterfaceC983270bh7 interfaceC983270bh7 = (InterfaceC983270bh7) LJJII();
        if (interfaceC983270bh7 != null) {
            interfaceC983270bh7.LJJIIZI(j, str, AFwS299S0000000_15.get$arr$(40));
        }
    }

    public C981970bf1(InterfaceC976620bWO interfaceC976620bWO, EnumC974260bSa enumC974260bSa, AbstractC982800bgM abstractC982800bgM, C982460bfo c982460bfo) {
        super(interfaceC976620bWO, enumC974260bSa, abstractC982800bgM);
        this.LJIIIIZZ = c982460bfo;
    }

    public final void LJJJLL(String str, EnumC975850bV9 enumC975850bV9, List<C982390bfh> list, EnumC974260bSa enumC974260bSa) {
        if (!Room.isValid(this.LIZ.getRoomInfo())) {
            C20441214yg.LJIIIZ("CompetitionStateSettlementAudience", "dealResult, room is not valid, return");
            return;
        }
        if (this.LIZ.Y2().compareTo(EnumC974260bSa.PUNISH) >= 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("dealResult, isEnd=true, status = ");
            sbLIZ.append(this.LIZ.Y2());
            C20441214yg.LJIIIZ("CompetitionStateSettlementAudience", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (list.isEmpty()) {
            C20441214yg.LJIIIZ("CompetitionStateSettlementAudience", "dealResult, teamScores isEmpty ");
            return;
        }
        InterfaceC983780bhw interfaceC983780bhw = (InterfaceC983780bhw) LJJII();
        if (interfaceC983780bhw != null && interfaceC983780bhw.LJJIL() && !this.LJIIJJI) {
            this.LJIIIZ = list;
            this.LJIIJ = enumC974260bSa;
            return;
        }
        if (Intrinsics.LJFF(str, "finish_msg")) {
            enumC975850bV9 = EnumC975850bV9.RESULT_FROM_FINISH_MESSAGE;
        } else if (Intrinsics.LJFF(str, "battle_info")) {
            enumC975850bV9 = EnumC975850bV9.RESULT_FROM_BATTLE_INFO;
        }
        if (LJJIII().LJIJI == EnumC982500bfs.DRAW) {
            AbstractC981450beB.LJJIJIL(this, enumC975850bV9);
        } else if (enumC974260bSa == EnumC974260bSa.START) {
            AbstractC981450beB.LJJIJLIJ(this, enumC975850bV9, null, null, 6);
        } else {
            AbstractC981450beB.LJJJI(this, enumC975850bV9, null, 6);
        }
    }
}
