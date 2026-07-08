package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchCoreScenariosMetricsSetting;
import com.bytedance.android.livesdk.model.message.LinkMicBattleArmiesMessage;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0bTH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C974690bTH implements OnMessageListener, InterfaceC20483715Df {
    public final DataChannel LL;
    public final Room LLILLJJLI;
    public InterfaceC952160asw LLILLL;
    public LinkMicBattleArmiesMessage LLILZ;
    public volatile LinkMicBattleArmiesMessage LLILZIL;
    public C974790bTR LLILZLL;

    public final void LIZIZ() {
        LinkMicBattleArmiesMessage linkMicBattleArmiesMessage = this.LLILZIL;
        if (linkMicBattleArmiesMessage == null || Intrinsics.LJFF(linkMicBattleArmiesMessage, this.LLILZ)) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dispatch armies message, ");
        sbLIZ.append(this.LLILLL);
        C20441214yg.LIZIZ("MatchMessageManager", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC952160asw interfaceC952160asw = this.LLILLL;
        if (interfaceC952160asw != null) {
            interfaceC952160asw.LIZ(linkMicBattleArmiesMessage);
        }
    }

    @Override // X.InterfaceC20483715Df
    public final void dx() {
        Long lValueOf;
        C20441214yg.LJ("MatchMessageManager", "downgrade changed");
        if (C915980Zwa.LJFF().Nt() && C20483515Dd.LIZ.LJ()) {
            C20441214yg.LJ("MatchMessageManager", "reStart Armies looper");
            InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
            if (interfaceC973730bRjYf2 == null || (lValueOf = Long.valueOf(interfaceC973730bRjYf2.LJJIJIL())) == null) {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
            LIZLLL(lValueOf.longValue());
        }
    }

    public C974690bTH(DataChannel dataChannel) {
        Room room;
        this.LL = dataChannel;
        if (dataChannel != null) {
            room = (Room) dataChannel.gg0(RoomChannel.class);
        } else {
            room = null;
        }
        this.LLILLJJLI = room;
    }

    public final void LIZJ(DataChannel dataChannel) {
        IMessageManager iMessageManager;
        if (!Intrinsics.LJFF(this.LL, dataChannel)) {
            C20441214yg.LJ("MatchMessageManager", " onCreate -> data channel error");
        }
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) != null) {
            iMessageManager.addMessageListener(C001A.LINK_MIC_BATTLE.getIntType(), this);
            iMessageManager.addMessageListener(C001A.LINK_MIC_BATTLE_ARMIES.getIntType(), this);
            iMessageManager.addMessageListener(C001A.LINK_MIC_BATTLE_PUNISH_FINISH.getIntType(), this);
            iMessageManager.addMessageListener(C001A.BATTLE_GAMEPLAY_MESSAGE.getIntType(), this);
            iMessageManager.addMessageListener(C001A.COMPETITION_CONTRIBUTOR_MESSAGE.getIntType(), this);
            iMessageManager.addMessageListener(C001A.BATTLE_A_I_COMMENTARY_MESSAGE.getIntType(), this);
        }
        C20483515Dd.LIZ(this);
    }

    public final void LIZLLL(long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("will start Armies looper, second = ");
        sbLIZ.append(j);
        C20441214yg.LIZIZ("MatchMessageManager", C2188811AlT.LIZIZ(sbLIZ));
        if (C20483515Dd.LIZ.LJ()) {
            if (this.LLILZLL == null) {
                this.LLILZLL = new C974790bTR();
            }
            this.LLILZIL = null;
            C974790bTR c974790bTR = this.LLILZLL;
            if (c974790bTR != null) {
                InterfaceC1699740uKi interfaceC1699740uKi = new InterfaceC1699740uKi() { // from class: X.0bTL
                    @Override // X.InterfaceC1699740uKi
                    public final void LIZLLL() {
                        this.LIZ.LIZIZ();
                    }

                    @Override // X.InterfaceC1699740uKi
                    public final void LJJI(long j2) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("onTick, second = ");
                        sbLIZ2.append(j2);
                        C20441214yg.LJIIIZ("MatchMessageManager", C2188811AlT.LIZIZ(sbLIZ2));
                        this.LIZ.LIZIZ();
                    }
                };
                c974790bTR.LIZ.LIZ();
                C1699720uKg c1699720uKg = c974790bTR.LIZ;
                c1699720uKg.LIZ = interfaceC1699740uKi;
                c1699720uKg.LIZIZ(j, C20483515Dd.LIZ.LIZ());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:78:0x012a  */
    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMessage(com.ss.ugc.live.sdk.message.data.IMessage r12) {
        /*
            Method dump skipped, instruction units count: 750
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C974690bTH.onMessage(com.ss.ugc.live.sdk.message.data.IMessage):void");
    }

    public final void LIZ(LinkMicBattleArmiesMessage linkMicBattleArmiesMessage, boolean z) {
        int i;
        String str;
        long j;
        int i2;
        Long lValueOf;
        int i3;
        String str2;
        long j2;
        int i4;
        if (z) {
            C974540bT2 c974540bT2 = C974540bT2.LIZ;
            long currentUserId = UserService.getInstance().user().getCurrentUserId();
            if (currentUserId == linkMicBattleArmiesMessage.fromUserId) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
                if (interfaceC973730bRjYf2 != null) {
                    lValueOf = Long.valueOf(interfaceC973730bRjYf2.LJJJJJL());
                } else {
                    lValueOf = null;
                }
                sbLIZ.append(lValueOf);
                sbLIZ.append(',');
                sbLIZ.append(currentUserId);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                if (linkMicBattleArmiesMessage.giftId != 0) {
                    ((ArrayList) C974540bT2.LJJIIJ).add(linkMicBattleArmiesMessage.logId);
                } else {
                    ((ArrayList) C974540bT2.LJJIIJ).add(strLIZIZ);
                }
                if (LiveMatchCoreScenariosMetricsSetting.INSTANCE.enableScoreTrack()) {
                    if (linkMicBattleArmiesMessage.giftId != 0) {
                        str2 = linkMicBattleArmiesMessage.logId;
                    } else {
                        str2 = strLIZIZ;
                    }
                    long jLIZJ = C963140bAe.LIZJ();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    long j3 = C946230ajN.LJIIIIZZ;
                    CommonMessageData commonMessageData = linkMicBattleArmiesMessage.baseMessage;
                    if (commonMessageData != null) {
                        j2 = commonMessageData.createTime;
                    } else {
                        j2 = 0;
                    }
                    List<C974600bT8> list = (List) ((LinkedHashMap) C974540bT2.LJJIII).get(str2);
                    if (list != null) {
                        for (C974600bT8 c974600bT8 : list) {
                            if (c974600bT8.LJ == 0) {
                                c974600bT8.LJ = jLIZJ;
                                c974600bT8.LJIIIZ = jElapsedRealtime;
                                c974600bT8.LJIILIIL = j3;
                            }
                            if (c974600bT8.LJFF == 0 && j2 != 0) {
                                c974600bT8.LJFF = j2;
                            }
                        }
                    }
                    JSONObject jSONObject = new JSONObject();
                    JSONObject jSONObject2 = new JSONObject();
                    if (linkMicBattleArmiesMessage.giftId != 0) {
                        i4 = 1;
                    } else {
                        i4 = 2;
                    }
                    C0K04.LIZLLL(i4, "source", jSONObject);
                    C0K04.LJ("battle_id", linkMicBattleArmiesMessage.battleId, jSONObject2);
                    C0K04.LJ("user_id", currentUserId, jSONObject2);
                    C0K04.LJFF("distinct_key", strLIZIZ, jSONObject2);
                    C0K04.LJFF("log_id", linkMicBattleArmiesMessage.logId, jSONObject2);
                    C0K04.LIZLLL(linkMicBattleArmiesMessage.triggerReason, "trigger_reason", jSONObject2);
                    C970340bMG.LJIIJ("audience", jSONObject, jSONObject2);
                    C970340bMG.LJIIJJI(EnumC970360bMI.SENDER, "battle_score_update_msg_receive_self", jSONObject, jSONObject2, new JSONObject());
                } else {
                    JSONObject jSONObject3 = new JSONObject();
                    C0K04.LJ("battle_id", linkMicBattleArmiesMessage.battleId, jSONObject3);
                    C0K04.LJ("user_id", currentUserId, jSONObject3);
                    C0K04.LJFF("distinct_key", strLIZIZ, jSONObject3);
                    if (linkMicBattleArmiesMessage.giftId != 0) {
                        i3 = 1;
                    } else {
                        i3 = 2;
                    }
                    C0K04.LIZLLL(i3, "source", jSONObject3);
                    C0K04.LJFF("log_id", linkMicBattleArmiesMessage.logId, jSONObject3);
                    C0K04.LIZLLL(linkMicBattleArmiesMessage.triggerReason, "trigger_reason", jSONObject3);
                    C974540bT2.LLIIZ(c974540bT2, "battle_score_update_msg_receive_self", jSONObject3, jSONObject3, null, false, C915980Zwa.LJFF().xB0(), 24);
                }
            }
        } else {
            C974480bSw c974480bSw = C974480bSw.LIZ;
            long currentUserId2 = UserService.getInstance().user().getCurrentUserId();
            if (currentUserId2 == linkMicBattleArmiesMessage.fromUserId) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(C973890bRz.LIZ.LJLIIIL());
                sbLIZ2.append(',');
                sbLIZ2.append(currentUserId2);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                if (linkMicBattleArmiesMessage.giftId != 0) {
                    ((ArrayList) C974480bSw.LIZJ).add(linkMicBattleArmiesMessage.logId);
                } else {
                    ((ArrayList) C974480bSw.LIZJ).add(strLIZIZ2);
                }
                if (LiveMatchCoreScenariosMetricsSetting.INSTANCE.enableScoreTrack()) {
                    if (linkMicBattleArmiesMessage.giftId != 0) {
                        str = linkMicBattleArmiesMessage.logId;
                    } else {
                        str = strLIZIZ2;
                    }
                    long jLIZJ2 = C963140bAe.LIZJ();
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    long j4 = C946230ajN.LJIIIIZZ;
                    CommonMessageData commonMessageData2 = linkMicBattleArmiesMessage.baseMessage;
                    if (commonMessageData2 != null) {
                        j = commonMessageData2.createTime;
                    } else {
                        j = 0;
                    }
                    List<C974600bT8> list2 = (List) ((LinkedHashMap) C974540bT2.LJJIII).get(str);
                    if (list2 != null) {
                        for (C974600bT8 c974600bT82 : list2) {
                            if (c974600bT82.LJ == 0) {
                                c974600bT82.LJ = jLIZJ2;
                                c974600bT82.LJIIIZ = jElapsedRealtime2;
                                c974600bT82.LJIILIIL = j4;
                            }
                            if (c974600bT82.LJFF == 0 && j != 0) {
                                c974600bT82.LJFF = j;
                            }
                        }
                    }
                    JSONObject jSONObject4 = new JSONObject();
                    JSONObject jSONObject5 = new JSONObject();
                    if (linkMicBattleArmiesMessage.giftId != 0) {
                        i2 = 1;
                    } else {
                        i2 = 2;
                    }
                    C0K04.LIZLLL(i2, "source", jSONObject4);
                    C0K04.LJ("battle_id", linkMicBattleArmiesMessage.battleId, jSONObject5);
                    C0K04.LJ("user_id", currentUserId2, jSONObject5);
                    C0K04.LJFF("distinct_key", strLIZIZ2, jSONObject5);
                    C0K04.LJFF("log_id", linkMicBattleArmiesMessage.logId, jSONObject5);
                    C0K04.LIZLLL(linkMicBattleArmiesMessage.triggerReason, "trigger_reason", jSONObject5);
                    C970340bMG.LJIIJ("audience", jSONObject4, jSONObject5);
                    C970340bMG.LJIIJJI(EnumC970360bMI.SENDER, "battle_score_update_msg_receive_self", jSONObject4, jSONObject5, new JSONObject());
                } else {
                    JSONObject jSONObject6 = new JSONObject();
                    C0K04.LJ("battle_id", linkMicBattleArmiesMessage.battleId, jSONObject6);
                    C0K04.LJ("user_id", currentUserId2, jSONObject6);
                    C0K04.LJFF("distinct_key", strLIZIZ2, jSONObject6);
                    if (linkMicBattleArmiesMessage.giftId != 0) {
                        i = 1;
                    } else {
                        i = 2;
                    }
                    C0K04.LIZLLL(i, "source", jSONObject6);
                    C0K04.LJFF("log_id", linkMicBattleArmiesMessage.logId, jSONObject6);
                    C0K04.LIZLLL(linkMicBattleArmiesMessage.triggerReason, "trigger_reason", jSONObject6);
                    c974480bSw.LJJIIJZLJL("battle_score_update_msg_receive_self", jSONObject6, jSONObject6, new JSONObject());
                }
            }
        }
        InterfaceC952160asw interfaceC952160asw = this.LLILLL;
        if (interfaceC952160asw != null) {
            interfaceC952160asw.LIZ(linkMicBattleArmiesMessage);
        }
        this.LLILZ = linkMicBattleArmiesMessage;
    }
}
