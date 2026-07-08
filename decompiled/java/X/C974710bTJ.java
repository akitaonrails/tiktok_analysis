package X;

import Y.ARunnableS84S0200000_15;
import com.bytedance.android.live.liveinteract.competition.game.event.GameScoreUpdateChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.RtcSeiReceivedChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.message.CompetitionContributorMessage;
import com.bytedance.android.livesdk.model.message.CompetitionMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.BaseMessage;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bTJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C974710bTJ {
    public final DataChannel LIZ;
    public final Room LIZIZ;
    public InterfaceC952110asr LIZJ;
    public final C974700bTI LIZLLL;

    public final void LIZIZ() {
        IMessageManager iMessageManager;
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) != null) {
            iMessageManager.removeMessageListener(C001A.COMPETITION_MESSAGE.getIntType(), this.LIZLLL);
            iMessageManager.removeMessageListener(C001A.COMPETITION_CONTRIBUTOR_MESSAGE.getIntType(), this.LIZLLL);
            iMessageManager.removeMessageListener(C001A.LINK_MIC_BATTLE.getIntType(), this.LIZLLL);
            iMessageManager.removeMessageListener(C001A.LINK_MIC_BATTLE_ARMIES.getIntType(), this.LIZLLL);
            iMessageManager.removeMessageListener(C001A.LINK_MIC_BATTLE_PUNISH_FINISH.getIntType(), this.LIZLLL);
        }
        DataChannel dataChannel2 = this.LIZ;
        if (dataChannel2 != null) {
            dataChannel2.zQ2(this);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0bTI] */
    public C974710bTJ(DataChannel dataChannel) {
        Room room;
        this.LIZ = dataChannel;
        if (dataChannel != null) {
            room = (Room) dataChannel.gg0(RoomChannel.class);
        } else {
            room = null;
        }
        this.LIZIZ = room;
        this.LIZLLL = new OnIMMessageListener() { // from class: X.0bTI
            @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
            public final String messageListenerBizTag() {
                return "CompetitionMessageManagerImpl";
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
            public final IMListenerType messageListenerType() {
                return IMListenerType.SYNC;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
            public final void onMessage(IMessage iMessage) {
                long j;
                C974710bTJ c974710bTJ = this.LL;
                c974710bTJ.getClass();
                if (iMessage != 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onMessage, messageId = ");
                    sbLIZ.append(iMessage.getMessageId());
                    sbLIZ.append(" messageType is = ");
                    sbLIZ.append(iMessage.getIntType());
                    C20441214yg.LJIIIZ("CompetitionMessageManagerImpl", C2188811AlT.LIZIZ(sbLIZ));
                    if (iMessage instanceof BaseMessage) {
                        CommonMessageData commonMessageData = ((BaseMessage) iMessage).baseMessage;
                        long j2 = 0;
                        if (commonMessageData != null) {
                            j = commonMessageData.createTime;
                        } else {
                            j = 0;
                        }
                        Room room2 = c974710bTJ.LIZIZ;
                        if (room2 != null) {
                            j2 = room2.nowTime;
                        }
                        if (j < j2) {
                            C20441214yg.LJ("CompetitionMessageManagerImpl", "onMessage, return message is old");
                            return;
                        }
                    }
                    if (iMessage instanceof CompetitionMessage) {
                        C0UHI.LIZ(new ARunnableS84S0200000_15(c974710bTJ, C982440bfm.LJII((CompetitionMessage) iMessage), 22));
                        return;
                    }
                    if (iMessage instanceof CompetitionContributorMessage) {
                        CompetitionContributorMessage competitionContributorMessage = (CompetitionContributorMessage) iMessage;
                        C974750bTN c974750bTN = new C974750bTN();
                        c974750bTN.LJFF = competitionContributorMessage.battleType;
                        c974750bTN.LJI = competitionContributorMessage.channelId;
                        c974750bTN.LJII = competitionContributorMessage.competitionId;
                        c974750bTN.LJIIIIZZ = competitionContributorMessage.teamInfos;
                        C974760bTO c974760bTO = new C974760bTO(c974750bTN);
                        c974760bTO.LIZ(c974750bTN);
                        C0UHI.LIZ(new ARunnableS84S0200000_15(c974710bTJ, c974760bTO, 23));
                        return;
                    }
                    C20441214yg.LJ("CompetitionMessageManagerImpl", "mMessageReceiver-> receive message is not support, please ensure handle this message callback");
                }
            }
        };
    }

    public static final void LIZJ(EnumC974260bSa enumC974260bSa) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDidEnterStatus, enteredStatus=");
        sbLIZ.append(enumC974260bSa);
        C20441214yg.LIZIZ("CompetitionMessageManagerImpl", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LIZ(DataChannel dataChannel) {
        IMessageManager iMessageManager;
        if (!Intrinsics.LJFF(this.LIZ, dataChannel)) {
            C20441214yg.LJ("CompetitionMessageManagerImpl", " onCreate -> data channel error");
        }
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) != null) {
            iMessageManager.addMessageListener(C001A.COMPETITION_MESSAGE.getIntType(), (OnIMMessageListener) this.LIZLLL);
            iMessageManager.addMessageListener(C001A.COMPETITION_CONTRIBUTOR_MESSAGE.getIntType(), (OnIMMessageListener) this.LIZLLL);
        }
        DataChannel dataChannel2 = this.LIZ;
        if (dataChannel2 != null) {
            dataChannel2.CQ2(GameScoreUpdateChannel.class, this, new AwS594S0100000_15(this, 596));
        }
        DataChannel dataChannel3 = this.LIZ;
        if (dataChannel3 != null) {
            dataChannel3.CQ2(RtcSeiReceivedChannel.class, this, new AwS591S0100000_12(this, 699));
        }
    }
}
