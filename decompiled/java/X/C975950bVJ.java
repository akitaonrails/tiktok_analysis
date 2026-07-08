package X;

import com.bytedance.android.live.liveinteract.match.business.event.BattlePunishFinishedMsgEvent;
import com.bytedance.android.livesdk.comp.api.linkcore.model.AbnormalDisconnectReason;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchVictoryLapFunnyEffectApplySetting;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattlePunishFinishMessage;
import com.bytedance.android.livesdk.model.message.TeamUsersInfo;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import com.bytedance.android.livesdkapi.depend.model.live.match.MatchPunishEffectInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0bVJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C975950bVJ extends C975970bVL {
    public C1699720uKg LJIILL;

    public final void LJJJJZ() {
        C975960bVK c975960bVKM3;
        MatchPunishEffectInfo.EffectStruct effectStruct;
        C975960bVK c975960bVKM32;
        C20441214yg.LIZIZ("MultiMatchStatePunishing", "removeCachedFunnyEffect triggered");
        InterfaceC975520bUc interfaceC975520bUc = this.LIZIZ;
        if (interfaceC975520bUc == null || (c975960bVKM3 = interfaceC975520bUc.m3()) == null || (effectStruct = c975960bVKM3.LJJZ) == null) {
            return;
        }
        C978440bZK.LJIIJ(String.valueOf(effectStruct.effectResourceId), LiveMatchVictoryLapFunnyEffectApplySetting.INSTANCE.getValue());
        InterfaceC975520bUc interfaceC975520bUc2 = this.LIZIZ;
        if (interfaceC975520bUc2 == null || (c975960bVKM32 = interfaceC975520bUc2.m3()) == null) {
            return;
        }
        c975960bVKM32.LJJZ = null;
    }

    @Override // X.C975970bVL, X.C975800bV4, X.InterfaceC975690bUt
    public final void LIZ(AbstractC1136060ffY abstractC1136060ffY) {
        Boolean boolValueOf;
        DataChannel dataChannel;
        boolean z;
        Boolean boolValueOf2;
        Integer numValueOf;
        List<? extends TeamUsersInfo> list;
        Room roomInfo;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onreceive message ");
        sbLIZ.append(abstractC1136060ffY);
        C20441214yg.LJ("MultiMatchStatePunishing", C2188811AlT.LIZIZ(sbLIZ));
        super.LIZ(abstractC1136060ffY);
        boolean z2 = false;
        Integer numValueOf2 = null;
        if (abstractC1136060ffY instanceof LinkMicBattleMessage) {
            LinkMicBattleMessage linkMicBattleMessage = (LinkMicBattleMessage) abstractC1136060ffY;
            if (linkMicBattleMessage.action == 4) {
                InterfaceC975520bUc interfaceC975520bUc = this.LIZIZ;
                if (interfaceC975520bUc != null) {
                    boolValueOf2 = Boolean.valueOf(interfaceC975520bUc.isAnchor());
                } else {
                    boolValueOf2 = null;
                }
                if (!C176600m4.LIZIZ(boolValueOf2)) {
                    BattleSetting battleSetting = linkMicBattleMessage.battleSetting;
                    if (battleSetting != null) {
                        numValueOf = Integer.valueOf(battleSetting.inviteType);
                    } else {
                        numValueOf = null;
                    }
                    boolean zLIZ = C959180b4G.LIZ(numValueOf);
                    C973660bRc c973660bRc = C973660bRc.LIZ;
                    boolean zLJII = C970370bMJ.LJII();
                    C975960bVK c975960bVK = this.LJII;
                    if (c975960bVK != null) {
                        list = c975960bVK.LJJIJ;
                    } else {
                        list = null;
                    }
                    InterfaceC975520bUc interfaceC975520bUc2 = this.LIZIZ;
                    if (interfaceC975520bUc2 != null) {
                        roomInfo = interfaceC975520bUc2.getRoomInfo();
                    } else {
                        roomInfo = null;
                    }
                    c973660bRc.LJJJJZ(zLJII, list, null, roomInfo, "punish_open_message");
                    C955400ayA.LJJJJIZL();
                    if (zLIZ) {
                        C970290bMB.LIZ.getClass();
                        C970290bMB.LJIJJ(1, false);
                        C974540bT2 c974540bT2 = C974540bT2.LIZ;
                        C974540bT2.LLIIII("normal", C970370bMJ.LJII());
                    }
                    C970290bMB c970290bMB = C970290bMB.LIZ;
                    C970290bMB.LIZ.LJIJI("open_message", "start", C970370bMJ.LJII(), zLIZ);
                    C955430ayD.LJIIIIZZ("match_open_message");
                    C975960bVK c975960bVK2 = this.LJII;
                    if (c975960bVK2 != null) {
                        c975960bVK2.LJJJI = C915980Zwa.LJFF().xB0();
                    }
                    LJJJJLI(linkMicBattleMessage);
                    LJIJ(EnumC964170bCJ.MATCH_START, EnumC975850bV9.OPEN_MESSAGE_IN_PUNISH, linkMicBattleMessage, null);
                }
            }
        }
        if (abstractC1136060ffY instanceof LinkMicBattlePunishFinishMessage) {
            LinkMicBattlePunishFinishMessage linkMicBattlePunishFinishMessage = (LinkMicBattlePunishFinishMessage) abstractC1136060ffY;
            if (C976040bVS.LJIIJ(this, linkMicBattlePunishFinishMessage.battleId)) {
                C1699720uKg c1699720uKg = this.LJIILL;
                if (c1699720uKg != null) {
                    c1699720uKg.LIZ();
                }
                C20441214yg.LJ("MultiMatchStatePunishing", "cancel countdown2222222");
                InterfaceC975520bUc interfaceC975520bUc3 = this.LIZIZ;
                if (interfaceC975520bUc3 != null) {
                    boolValueOf = Boolean.valueOf(interfaceC975520bUc3.isAnchor());
                } else {
                    boolValueOf = null;
                }
                if (C176600m4.LIZIZ(boolValueOf)) {
                    C974540bT2 c974540bT22 = C974540bT2.LIZ;
                    JSONObject jSONObject = new JSONObject();
                    C974540bT2.LJIJI(linkMicBattlePunishFinishMessage, jSONObject);
                    C0K04.LJ("client_and_server_diff_time", C963140bAe.LIZLLL, jSONObject);
                    C974540bT2.LJIJJLI(jSONObject, false);
                    c974540bT22.LLIIIJ("punish_finish_message", jSONObject, new JSONObject(), new JSONObject(), true, C915980Zwa.LJFF().xB0());
                    C975960bVK c975960bVK3 = this.LJII;
                    if (c975960bVK3 != null) {
                        if (linkMicBattlePunishFinishMessage.reason == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        c975960bVK3.LJIL = z;
                    }
                    InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
                    if (interfaceC500940JkiUser != null && linkMicBattlePunishFinishMessage.opUid == interfaceC500940JkiUser.getCurrentUserId()) {
                        z2 = true;
                    }
                    LJJIJ("punish_finish_msg", z2);
                    InterfaceC975520bUc interfaceC975520bUc4 = this.LIZIZ;
                    if (interfaceC975520bUc4 != null && (dataChannel = interfaceC975520bUc4.getDataChannel()) != null) {
                        dataChannel.FQ2(BattlePunishFinishedMsgEvent.class);
                        return;
                    }
                    return;
                }
                C974540bT2 c974540bT23 = C974540bT2.LIZ;
                JSONObject jSONObject2 = new JSONObject();
                C974540bT2.LJIJI(linkMicBattlePunishFinishMessage, jSONObject2);
                C0K04.LJ("client_and_server_diff_time", C963140bAe.LIZLLL, jSONObject2);
                C974540bT2.LJIJJLI(jSONObject2, false);
                BattleSetting battleSetting2 = linkMicBattlePunishFinishMessage.battleSettings;
                if (battleSetting2 != null) {
                    numValueOf2 = Integer.valueOf(battleSetting2.battleType);
                }
                C974540bT2.LLIIZ(c974540bT23, "punish_finish_message", jSONObject2, null, null, false, C918130a03.LIZ(numValueOf2), 28);
                C975960bVK c975960bVK4 = this.LJII;
                if (c975960bVK4 != null) {
                    if (linkMicBattlePunishFinishMessage.reason == 1) {
                        z2 = true;
                    }
                    c975960bVK4.LJIL = z2;
                }
                LJJIJIIJI(EnumC975850bV9.MATCH_END_FINISH_SOURCE_PUNISH_FINISH_MESSAGE);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x019a  */
    @Override // X.InterfaceC975690bUt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(X.EnumC975850bV9 r28) {
        /*
            Method dump skipped, instruction units count: 1120
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C975950bVJ.LIZJ(X.0bV9):void");
    }

    @Override // X.C975970bVL, X.InterfaceC975690bUt
    public final void LJI(EnumC975850bV9 enumC975850bV9) {
        InterfaceC976360bVy interfaceC976360bVy;
        super.LJI(enumC975850bV9);
        C20441214yg.LJ("MultiMatchStatePunishing", "cancel countdown3333334");
        C1699720uKg c1699720uKg = this.LJIILL;
        if (c1699720uKg != null) {
            c1699720uKg.LIZ();
        }
        if (enumC975850bV9 != EnumC975850bV9.PUNISH_REMATCH_RESTART && (interfaceC976360bVy = (InterfaceC976360bVy) LJIILJJIL()) != null) {
            interfaceC976360bVy.LJIIL();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    @Override // X.C976040bVS, X.InterfaceC975690bUt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(long r12) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C975950bVJ.LJII(long):void");
    }

    @Override // X.C975800bV4, X.InterfaceC975690bUt
    public final void b3(Function0<Unit> function0) {
        super.b3(function0);
        C975970bVL.LJJIZ(this, null, function0, "external", 1);
    }

    @Override // X.C975970bVL, X.C976040bVS, X.InterfaceC975690bUt
    public final void LJFF(long j, String str) {
        Boolean boolValueOf;
        List<? extends TeamUsersInfo> list;
        EnumC973680bRe enumC973680bRe;
        super.LJFF(j, str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Punish status , onUserLeft, leaveReason = ");
        sbLIZ.append(j);
        sbLIZ.append(" ,linkId = ");
        sbLIZ.append(str);
        C20441214yg.LJ("MultiMatchStatePunishing", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC975520bUc interfaceC975520bUc = this.LIZIZ;
        Boolean boolValueOf2 = null;
        if (interfaceC975520bUc != null) {
            boolValueOf = Boolean.valueOf(interfaceC975520bUc.isAnchor());
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJIJIIJIL(boolValueOf) && C915980Zwa.LJII().LLILZLL(true).size() < C975970bVL.LJJJJL()) {
            C1699720uKg c1699720uKg = this.LJIILL;
            if (c1699720uKg != null) {
                c1699720uKg.LIZ();
            }
            C20441214yg.LJ("MultiMatchStatePunishing", "cancel countdown55555555");
            this.LJIILL = null;
            C973660bRc c973660bRc = C973660bRc.LIZ;
            C975960bVK c975960bVK = this.LJII;
            if (c975960bVK != null) {
                list = c975960bVK.LJJIJ;
            } else {
                list = null;
            }
            boolean zLJII = C970370bMJ.LJII();
            C975960bVK c975960bVK2 = this.LJII;
            if (c975960bVK2 != null) {
                boolValueOf2 = Boolean.valueOf(c975960bVK2.LJI);
            }
            if (C176600m4.LIZIZ(boolValueOf2)) {
                enumC973680bRe = EnumC973680bRe.POSITIVE_OVER;
            } else {
                enumC973680bRe = EnumC973680bRe.NEGATIVE_OVER;
            }
            c973660bRc.LJJLIIJ(list, zLJII, enumC973680bRe);
        }
    }

    @Override // X.C975970bVL, X.C976040bVS, X.InterfaceC975690bUt
    public final void LJIIIIZZ(int i, int i2, AbnormalDisconnectReason abnormalDisconnectReason) {
        List<? extends TeamUsersInfo> list;
        EnumC973680bRe enumC973680bRe;
        super.LJIIIIZZ(i, i2, abnormalDisconnectReason);
        if (C915980Zwa.LJII().LLILZLL(true).size() < C975970bVL.LJJJJL()) {
            C1699720uKg c1699720uKg = this.LJIILL;
            if (c1699720uKg != null) {
                c1699720uKg.LIZ();
            }
            C20441214yg.LJ("MultiMatchStatePunishing", "cancel countdown45555555");
            Boolean boolValueOf = null;
            this.LJIILL = null;
            C973660bRc c973660bRc = C973660bRc.LIZ;
            C975960bVK c975960bVK = this.LJII;
            if (c975960bVK != null) {
                list = c975960bVK.LJJIJ;
            } else {
                list = null;
            }
            boolean zLJII = C970370bMJ.LJII();
            C975960bVK c975960bVK2 = this.LJII;
            if (c975960bVK2 != null) {
                boolValueOf = Boolean.valueOf(c975960bVK2.LJI);
            }
            if (C176600m4.LIZIZ(boolValueOf)) {
                enumC973680bRe = EnumC973680bRe.POSITIVE_OVER;
            } else {
                enumC973680bRe = EnumC973680bRe.NEGATIVE_OVER;
            }
            c973660bRc.LJJLIIJ(list, zLJII, enumC973680bRe);
        }
        LJJJJZ();
    }

    public C975950bVJ(EnumC964170bCJ enumC964170bCJ, InterfaceC975520bUc interfaceC975520bUc, InterfaceC977310bXV interfaceC977310bXV, LinkMicBattleMessage linkMicBattleMessage, BattleInfoResponse battleInfoResponse) {
        super(enumC964170bCJ, interfaceC975520bUc, interfaceC977310bXV, linkMicBattleMessage, battleInfoResponse);
    }
}
