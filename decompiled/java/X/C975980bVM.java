package X;

import Y.ARunnableS115S0100000_15;
import Y.AfS184S0100000_15;
import android.os.Looper;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.match.business.event.BattleTimeLeftChannel;
import com.bytedance.android.livesdk.comp.api.linkcore.model.AbnormalDisconnectReason;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveInteractBattleDurationSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveTimeIncrementForBattleSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchCountDownOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchStopCountDownOptSetting;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamResult;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import tikcast.linkmic.common.LayoutData;
import tikcast.linkmic.common.SpotInfo;

/* JADX INFO: renamed from: X.0bVM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C975980bVM extends C975970bVL {
    public final BattleInfoResponse LJIILL;
    public final BPEAHandler LJIILLIIL;
    public C11JF LJIIZILJ;
    public C1699720uKg LJIJ;
    public final ARunnableS115S0100000_15 LJIJI;

    public final void LJJJJZ() {
        C11JF c11jf;
        C20441214yg.LJ("MultiMatchStateBattling", "cancelCountdown: ");
        C1699720uKg c1699720uKg = this.LJIJ;
        if (c1699720uKg != null) {
            c1699720uKg.LIZ();
        }
        C11JF c11jf2 = this.LJIIZILJ;
        if (!C500260Jjc.LJJIJIIJIL(c11jf2 != null ? Boolean.valueOf(c11jf2.isDisposed()) : null) || (c11jf = this.LJIIZILJ) == null) {
            return;
        }
        c11jf.dispose();
    }

    public final void LJJJLIIL() {
        String strLJJLIIIJ;
        InterfaceC980390bcT.Ka.LJFF(Long.valueOf(C915980Zwa.LJII().getChannelId()));
        C975960bVK c975960bVK = this.LJII;
        List<Long> list = c975960bVK != null ? c975960bVK.LJIIJJI : null;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("save last selected member ---");
        sbLIZ.append(list != null ? C13LP.LJJLIIIJ(list, ",", null, null, 0, null, null, 62) : null);
        C20441214yg.LJ("MultiMatchStateBattling", C2188811AlT.LIZIZ(sbLIZ));
        C20337914i1<String> c20337914i1 = InterfaceC980390bcT.Ja;
        if (list == null || (strLJJLIIIJ = C13LP.LJJLIIIJ(list, ",", null, null, 0, null, null, 62)) == null) {
            strLJJLIIIJ = "";
        }
        c20337914i1.LJFF(strLJJLIIIJ);
    }

    @Override // X.C976040bVS, X.InterfaceC975690bUt
    public final void j3() {
        InterfaceC976360bVy interfaceC976360bVy = (InterfaceC976360bVy) LJIILJJIL();
        if (interfaceC976360bVy != null) {
            interfaceC976360bVy.LJIIL();
        }
    }

    @Override // X.C975970bVL, X.C975800bV4, X.InterfaceC975690bUt
    public final void LIZ(AbstractC1136060ffY abstractC1136060ffY) {
        C975960bVK c975960bVKM3;
        C975990bVN c975990bVN;
        List<SpotInfo> arrayList;
        Long lValueOf;
        Integer numValueOf;
        Boolean bool;
        Boolean boolValueOf;
        EnumC973680bRe enumC973680bRe;
        Room roomInfo;
        User owner;
        C098J<Long, Boolean> c098j;
        super.LIZ(abstractC1136060ffY);
        if (abstractC1136060ffY instanceof LinkMicBattleMessage) {
            LinkMicBattleMessage linkMicBattleMessage = (LinkMicBattleMessage) abstractC1136060ffY;
            int i = linkMicBattleMessage.action;
            if (i != 4) {
                if (i != 5) {
                    if (i == 6 && C976040bVS.LJIIJ(this, linkMicBattleMessage.battleId)) {
                        if (C915980Zwa.LJFF().xd2() == linkMicBattleMessage.battleId) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("CutShortMessage: Already have settlement result , no repeat ");
                            sbLIZ.append(linkMicBattleMessage.battleId);
                            C20441214yg.LJ("MultiMatchStateBattling", C2188811AlT.LIZIZ(sbLIZ));
                            return;
                        }
                        C915980Zwa.LJFF().V22(linkMicBattleMessage.battleId);
                        C974540bT2 c974540bT2 = C974540bT2.LIZ;
                        JSONObject jSONObject = new JSONObject();
                        C974540bT2.LJIJ(linkMicBattleMessage, jSONObject);
                        C0K04.LJ("battle_id", linkMicBattleMessage.battleId, jSONObject);
                        C974540bT2.LJIJJLI(jSONObject, false);
                        c974540bT2.LLIIIJ("cut_short_message", jSONObject, new JSONObject(), new JSONObject(), true, C915980Zwa.LJFF().xB0());
                        C975960bVK c975960bVK = this.LJII;
                        if (c975960bVK != null) {
                            c975960bVK.LJIJJLI = true;
                            c975960bVK.LJJIJIIJI = linkMicBattleMessage.battleCombos;
                        }
                        Map mapLIZ = C125500dp.LIZ(linkMicBattleMessage);
                        C975960bVK c975960bVK2 = this.LJII;
                        if (c975960bVK2 != null) {
                            lValueOf = Long.valueOf(c975960bVK2.LJJJJJ());
                        } else {
                            lValueOf = null;
                        }
                        BattleTeamResult battleTeamResult = (BattleTeamResult) ((LinkedHashMap) mapLIZ).get(lValueOf);
                        if (battleTeamResult != null) {
                            numValueOf = Integer.valueOf(battleTeamResult.result);
                        } else {
                            numValueOf = null;
                        }
                        LJJJJI(numValueOf);
                        C975960bVK c975960bVK3 = this.LJII;
                        if (c975960bVK3 != null && (c098j = c975960bVK3.LJJIZ) != null) {
                            bool = c098j.get(Long.valueOf(linkMicBattleMessage.battleId));
                        } else {
                            bool = null;
                        }
                        if (C500260Jjc.LJJIJIIJIL(bool)) {
                            JSONObject jSONObject2 = new JSONObject();
                            C917350Zyn c917350Zyn = EnumC919170a1j.Companion;
                            EnumC919170a1j enumC919170a1jXB0 = C915980Zwa.LJFF().xB0();
                            c917350Zyn.getClass();
                            C0K04.LJFF("match_type", C917350Zyn.LIZJ(enumC919170a1jXB0), jSONObject2);
                            C0K04.LJFF("finish_reason", "cut_short_message", jSONObject2);
                            C0K04.LIZLLL(1, "is_normal_finish", jSONObject2);
                            C974540bT2.LLIIIILZ(c974540bT2, "battle_finished_timing", jSONObject2, 12);
                        } else {
                            C975960bVK c975960bVK4 = this.LJII;
                            if (c975960bVK4 != null) {
                                boolValueOf = Boolean.valueOf(c975960bVK4.LJJJ);
                            } else {
                                boolValueOf = null;
                            }
                            if (C176600m4.LIZIZ(boolValueOf)) {
                                c974540bT2.LLI(101, 0L, 0L);
                            }
                        }
                        Boolean boolValueOf2 = Boolean.valueOf(C976040bVS.LJIIZILJ(-1L));
                        InterfaceC975520bUc interfaceC975520bUc = this.LIZIZ;
                        if (interfaceC975520bUc != null && (roomInfo = interfaceC975520bUc.getRoomInfo()) != null && (owner = roomInfo.getOwner()) != null && linkMicBattleMessage.actionByUserId == owner.getId()) {
                            enumC973680bRe = EnumC973680bRe.POSITIVE_OVER;
                        } else {
                            enumC973680bRe = EnumC973680bRe.NEGATIVE_OVER;
                        }
                        LJJJ(boolValueOf2, enumC973680bRe);
                        LJIJ(EnumC964170bCJ.SETTLE_START, EnumC975850bV9.SETTLE_CUT_SHORT_MESSAGE_ANCHOR, linkMicBattleMessage, null);
                        return;
                    }
                    return;
                }
                if (!C976040bVS.LJIIJ(this, linkMicBattleMessage.battleId)) {
                    return;
                }
                if (C915980Zwa.LJFF().xd2() == linkMicBattleMessage.battleId) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("FinishMessage: Already have settlement result , no repeat ");
                    sbLIZ2.append(linkMicBattleMessage.battleId);
                    C20441214yg.LJ("MultiMatchStateBattling", C2188811AlT.LIZIZ(sbLIZ2));
                    return;
                }
                C915980Zwa.LJFF().V22(linkMicBattleMessage.battleId);
                C975960bVK c975960bVK5 = this.LJII;
                if (c975960bVK5 != null) {
                    c975960bVK5.LJIJJLI = false;
                    c975960bVK5.LJJIJIIJI = linkMicBattleMessage.battleCombos;
                }
                Map mapLJJIJIIJIL = C975970bVL.LJJIJIIJIL(linkMicBattleMessage);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("handleFinishMessage, ");
                sbLIZ3.append(linkMicBattleMessage);
                C20441214yg.LIZIZ("MultiMatchStateBattling", C2188811AlT.LIZIZ(sbLIZ3));
                List list = linkMicBattleMessage.teamArmies;
                if (list == null) {
                    list = C13BV.INSTANCE;
                }
                C976060bVU.LIZIZ(this, list, mapLJJIJIIJIL, 0L, 0L, false, 28);
                LJIJJLI(linkMicBattleMessage.enigmaBattleSetting);
                C974540bT2.LIZ.LJJJLZIJ(linkMicBattleMessage);
                LJIJ(EnumC964170bCJ.SETTLE_START, EnumC975850bV9.SETTLE_FINISH_MESSAGE_ANCHOR, linkMicBattleMessage, null);
                return;
            }
            C976040bVS.LJJ(linkMicBattleMessage.leagueInfoMap, linkMicBattleMessage.leagueScoreInfoMap);
            LJIJJLI(linkMicBattleMessage.enigmaBattleSetting);
            LJIJI(linkMicBattleMessage.anchorMatchSettings);
            InterfaceC975520bUc interfaceC975520bUc2 = this.LIZIZ;
            if (interfaceC975520bUc2 == null || (c975960bVKM3 = interfaceC975520bUc2.m3()) == null || (c975990bVN = c975960bVKM3.LJJJLZIJ) == null) {
                return;
            }
            c975990bVN.LIZ.LJJIJIIJI = linkMicBattleMessage.battleCombos;
            c975990bVN.LIZ.LJJJJZ = linkMicBattleMessage.battleFeatureFlags;
            LayoutData layoutData = linkMicBattleMessage.crossRoomLayout;
            if (layoutData == null || (arrayList = layoutData.spotList) == null) {
                arrayList = new ArrayList<>();
            }
            c975990bVN.LIZ(arrayList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:234:0x04d5  */
    @Override // X.InterfaceC975690bUt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(X.EnumC975850bV9 r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C975980bVM.LIZJ(X.0bV9):void");
    }

    @Override // X.C975970bVL, X.InterfaceC975690bUt
    public final void LJI(EnumC975850bV9 enumC975850bV9) {
        DataChannel dataChannel;
        this.LJIILLIIL.removeCallbacks(this.LJIJI);
        LJJJJZ();
        InterfaceC975520bUc interfaceC975520bUc = this.LIZIZ;
        if (interfaceC975520bUc != null && (dataChannel = interfaceC975520bUc.getDataChannel()) != null) {
            dataChannel.zQ2(this);
        }
        InterfaceC976360bVy interfaceC976360bVy = (InterfaceC976360bVy) LJIILJJIL();
        if (interfaceC976360bVy != null) {
            interfaceC976360bVy.LJFF();
        }
    }

    @Override // X.C976040bVS, X.InterfaceC975690bUt
    public final void LJII(long j) {
        LJJJJZ();
        if (j != 201) {
            C975800bV4.LJJIFFI();
        }
    }

    @Override // X.C975970bVL, X.C976040bVS, X.InterfaceC975690bUt
    public final void LJFF(long j, String str) {
        Long lValueOf;
        C975990bVN c975990bVN;
        List<C954460awe> list;
        super.LJFF(j, str);
        if (LiveMatchStopCountDownOptSetting.INSTANCE.isEnable()) {
            return;
        }
        C975960bVK c975960bVK = this.LJII;
        long j2 = 0;
        if (c975960bVK != null && (list = c975960bVK.LJJJLL) != null) {
            for (C954460awe c954460awe : list) {
                if (Intrinsics.LJFF(c954460awe.LJIIJJI, str)) {
                    j2 = c954460awe.LJ;
                }
            }
        }
        C975960bVK c975960bVK2 = this.LJII;
        EnumC919170a1j enumC919170a1jLJIIIZ = null;
        if (c975960bVK2 != null && (c975990bVN = c975960bVK2.LJJJLZIJ) != null) {
            lValueOf = Long.valueOf(c975990bVN.LIZLLL(Long.valueOf(j2)));
        } else {
            lValueOf = null;
        }
        boolean zLJJJI = LJJJI(lValueOf);
        InterfaceC975520bUc interfaceC975520bUc = this.LIZIZ;
        if (interfaceC975520bUc != null) {
            enumC919170a1jLJIIIZ = interfaceC975520bUc.LJIIIZ();
        }
        if (C915980Zwa.LJII().LLILZLL(true).size() < C975970bVL.LJJJJL() || ((C176600m4.LIZIZ(Boolean.valueOf(zLJJJI)) && (enumC919170a1jLJIIIZ == EnumC919170a1j.MATCH_TYPE_2V2 || enumC919170a1jLJIIIZ == EnumC919170a1j.MATCH_TYPE_1VN)) || enumC919170a1jLJIIIZ == EnumC919170a1j.MATCH_TYPE_1V1)) {
            LJJJJZ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJZI(com.bytedance.android.livesdk.model.message.LinkMicBattleMessage r19, X.EnumC975850bV9 r20) throws java.lang.Throwable {
        /*
            r18 = this;
            java.lang.String r2 = "MultiMatchStateBattling"
            java.lang.String r0 = "updateMatchSei()，handleMatchStartMessage()"
            X.C20441214yg.LIZIZ(r2, r0)
            r11 = r18
            long r4 = r11.LJJIJLIJ()
            X.0bT2 r3 = X.C974540bT2.LIZ
            r8 = r19
            long r0 = r8.actionByUserId
            java.lang.Long r6 = java.lang.Long.valueOf(r0)
            int r7 = r20.ordinal()
            r9 = 0
            r10 = 0
            r3.LJJJJLI(r4, r6, r7, r8, r9, r10)
            r3.LLIFFJFJJ()
            java.lang.String r0 = "match_prepare"
            X.C978500bZQ.LIZIZ(r0)
            r3 = 0
            r11.LJIIIZ = r9
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "updateMatchSei()，handleMatchStartMessage, teamUsers="
            r1.append(r0)
            java.util.List<com.bytedance.android.livesdk.model.message.TeamUsersInfo> r0 = r8.teamUsers
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C20441214yg.LIZIZ(r2, r0)
            java.util.List<com.bytedance.android.livesdk.model.message.TeamUsersInfo> r2 = r8.teamUsers
            long r0 = r8.battleId
            r11.LJJJLZIJ(r0, r2)
            r14 = 0
            r12 = r4
            r16 = r14
            r11.LJJJLL(r12, r14, r16)
            com.bytedance.android.live_settings.SettingsManager r1 = com.bytedance.android.live_settings.SettingsManager.INSTANCE
            java.lang.String r0 = "live_match_start_tracking_match_type_fix_enable"
            r9 = 1
            boolean r0 = r1.getBooleanValue(r0, r9)
            if (r0 == 0) goto L9d
            com.bytedance.android.live.liveinteract.match.service.ILiveMatchService r0 = X.C915980Zwa.LJFF()
            X.0a1j r1 = r0.xB0()
            X.0a1j r0 = X.EnumC919170a1j.UNKNOWN
            if (r1 != r0) goto L90
            com.bytedance.android.livesdk.model.message.battle.BattleSetting r0 = r8.battleSetting
            int r1 = r0.battleType
        L6a:
            X.0a1j r0 = X.EnumC919170a1j.MATCH_TYPE_1V1
            int r0 = r0.getType()
            if (r1 == r0) goto La4
        L72:
            long r5 = r8.actionByUserId
            java.util.List<com.bytedance.android.livesdk.model.message.TeamUsersInfo> r7 = r8.teamUsers
            java.util.Map<java.lang.Long, com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeInfo> r8 = r8.leagueInfoMap
            X.0bRc r4 = X.C973660bRc.LIZ
            r4.LJJLJ(r5, r7, r8, r9)
            X.C970370bMJ.LJII()
            X.0bUc r0 = r11.LIZIZ
            if (r0 == 0) goto L8c
            boolean r0 = r0.d3()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
        L8c:
            X.C176600m4.LIZIZ(r3)
            return
        L90:
            com.bytedance.android.live.liveinteract.match.service.ILiveMatchService r0 = X.C915980Zwa.LJFF()
            X.0a1j r0 = r0.xB0()
            int r1 = r0.getType()
            goto L6a
        L9d:
            boolean r0 = X.C970370bMJ.LJIIJ()
            if (r0 != 0) goto La4
            goto L72
        La4:
            r9 = 0
            goto L72
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C975980bVM.LJJJJZI(com.bytedance.android.livesdk.model.message.LinkMicBattleMessage, X.0bV9):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0287  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJLZIJ(long r24, java.util.List r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 878
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C975980bVM.LJJJLZIJ(long, java.util.List):void");
    }

    @Override // X.C975970bVL, X.C976040bVS, X.InterfaceC975690bUt
    public final void LJIIIIZZ(int i, int i2, AbnormalDisconnectReason abnormalDisconnectReason) {
        if (C915980Zwa.LJII().LLILZLL(true).size() < C975970bVL.LJJJJL()) {
            LJJJJZ();
        }
        super.LJIIIIZZ(i, i2, abnormalDisconnectReason);
    }

    public final void LJJJLL(long j, long j2, long j3) {
        DataChannel dataChannel;
        DataChannel dataChannel2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BattleCountDown, timeSecond = ");
        sbLIZ.append(j);
        sbLIZ.append(" and extraTime = ");
        sbLIZ.append(j2);
        C20441214yg.LJIIIZ("MultiMatchStateBattling", C2188811AlT.LIZIZ(sbLIZ));
        final long j4 = j3 + j2;
        long j5 = j + j4;
        if (j5 <= 0) {
            return;
        }
        C975960bVK c975960bVK = this.LJII;
        if (c975960bVK != null) {
            c975960bVK.LJJIIJZLJL = j5;
        }
        final C974800bTS c974800bTS = new C974800bTS(j5, j4);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("BattleCountDown, realTimeSecond = ");
        sbLIZ2.append(j5);
        sbLIZ2.append(" addExtraTime = ");
        sbLIZ2.append(j2);
        sbLIZ2.append(" totalExtraTime = ");
        sbLIZ2.append(j4);
        sbLIZ2.append(" lastExtra = ");
        sbLIZ2.append(j3);
        sbLIZ2.append(" lastLeftTime = ");
        sbLIZ2.append(j);
        C20441214yg.LIZIZ("MultiMatchStateBattling", C2188811AlT.LIZIZ(sbLIZ2));
        if (LiveInteractBattleDurationSetting.INSTANCE.getValue() == j && j2 == 0) {
            InterfaceC975520bUc interfaceC975520bUc = this.LIZIZ;
            if (interfaceC975520bUc != null && (dataChannel2 = interfaceC975520bUc.getDataChannel()) != null) {
                dataChannel2.zW(BattleTimeLeftChannel.class, new C974800bTS(j - 1, 0L));
            }
        } else {
            InterfaceC975520bUc interfaceC975520bUc2 = this.LIZIZ;
            if (interfaceC975520bUc2 != null && (dataChannel = interfaceC975520bUc2.getDataChannel()) != null) {
                dataChannel.zW(BattleTimeLeftChannel.class, c974800bTS);
            }
        }
        if (this.LJIJ == null) {
            this.LJIJ = new C1699720uKg();
        } else {
            LJJJJZ();
        }
        C1699720uKg c1699720uKg = this.LJIJ;
        if (c1699720uKg != null) {
            c1699720uKg.LIZ = new InterfaceC1699740uKi() { // from class: X.0bVu
                @Override // X.InterfaceC1699740uKi
                public final void LIZLLL() {
                    DataChannel dataChannel3;
                    C20441214yg.LJIIIZ("MultiMatchStateBattling", "MatchCountDown, finish");
                    InterfaceC975520bUc interfaceC975520bUc3 = this.LIZ.LIZIZ;
                    if (interfaceC975520bUc3 != null && (dataChannel3 = interfaceC975520bUc3.getDataChannel()) != null) {
                        dataChannel3.zW(BattleTimeLeftChannel.class, new C974800bTS(0L, j4));
                    }
                    long value = LiveTimeIncrementForBattleSetting.INSTANCE.getValue();
                    C975980bVM c975980bVM = this.LIZ;
                    C11O8 c11o8LJJJLZIJ = C11NZ.LJLJJLL(value, TimeUnit.SECONDS).LJJJLZIJ(C1701940uOG.LIZIZ());
                    C975980bVM c975980bVM2 = this.LIZ;
                    c975980bVM.LJIIZILJ = (C11JF) c11o8LJJJLZIJ.LJJLL(new AfS184S0100000_15(c975980bVM2, 149), new AfS184S0100000_15(c975980bVM2, 150));
                }

                @Override // X.InterfaceC1699740uKi
                public final void LJJI(long j6) {
                    DataChannel dataChannel3;
                    InterfaceC975520bUc interfaceC975520bUc3 = this.LIZ.LIZIZ;
                    if (interfaceC975520bUc3 != null && (dataChannel3 = interfaceC975520bUc3.getDataChannel()) != null) {
                        dataChannel3.zW(BattleTimeLeftChannel.class, C974800bTS.LIZ(c974800bTS, j6));
                    }
                }
            };
            c1699720uKg.LIZIZ(j5, LiveMatchCountDownOptSetting.INSTANCE.getRefreshIntervalMs());
        }
    }

    public C975980bVM(EnumC964170bCJ enumC964170bCJ, InterfaceC975520bUc interfaceC975520bUc, InterfaceC977310bXV interfaceC977310bXV, LinkMicBattleMessage linkMicBattleMessage, BattleInfoResponse battleInfoResponse) {
        super(enumC964170bCJ, interfaceC975520bUc, interfaceC977310bXV, linkMicBattleMessage, battleInfoResponse);
        this.LJIILL = battleInfoResponse;
        this.LJIILLIIL = new BPEAHandler(Looper.getMainLooper());
        this.LJIJI = new ARunnableS115S0100000_15(this, 155);
    }
}
