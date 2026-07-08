package X;

import com.bytedance.android.livesdk.model.message.FanTicketRoomNoticeContent;
import com.bytedance.android.livesdk.model.message.LinkMicFanTicketMethod;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import webcast.data.multi_guest_play.CountdownForAllContent;
import webcast.im.CountdownForAllMessage;

/* JADX INFO: renamed from: X.00s1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C213500s1 {
    public final DataChannel LIZ;
    public final InterfaceC213600s2 LIZIZ;
    public final C213400s0 LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.00s0, com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener] */
    public C213500s1(DataChannel dataChannel, InterfaceC213600s2 interfaceC213600s2) {
        IMessageManager iMessageManager;
        this.LIZ = dataChannel;
        this.LIZIZ = interfaceC213600s2;
        ?? r2 = new OnIMMessageListener() { // from class: X.00s0
            @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
            public final String messageListenerBizTag() {
                return "count-down-for-all-message-channel";
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
            public final IMListenerType messageListenerType() {
                return IMListenerType.SYNC;
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
            public final void onMessage(IMessage iMessage) {
                CountdownForAllContent countdownForAllContent;
                if (iMessage == null) {
                    return;
                }
                if (iMessage instanceof CountdownForAllMessage) {
                    C213500s1 c213500s1 = this.LL;
                    CountdownForAllMessage countdownForAllMessage = (CountdownForAllMessage) iMessage;
                    c213500s1.getClass();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("handleCountDownForAllIM messageId=");
                    sbLIZ.append(countdownForAllMessage.getMessageId());
                    sbLIZ.append(" messageType=");
                    sbLIZ.append(countdownForAllMessage.messageType);
                    C20441214yg.LJIIIZ("CountDownForAllV2MessageChannel", C2188811AlT.LIZIZ(sbLIZ));
                    int i = countdownForAllMessage.messageType;
                    if (i != 0) {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    if (i == 4 && (countdownForAllContent = countdownForAllMessage.playContent) != null) {
                                        c213500s1.LIZIZ.LIZIZ(countdownForAllContent);
                                        return;
                                    }
                                    return;
                                }
                                CountdownForAllContent countdownForAllContent2 = countdownForAllMessage.playContent;
                                if (countdownForAllContent2 == null) {
                                    return;
                                }
                                c213500s1.LIZIZ.LJ(countdownForAllContent2);
                                return;
                            }
                            CountdownForAllContent countdownForAllContent3 = countdownForAllMessage.playContent;
                            if (countdownForAllContent3 == null) {
                                return;
                            }
                            c213500s1.LIZIZ.LIZLLL(countdownForAllMessage.playEndReason, countdownForAllContent3);
                            return;
                        }
                        CountdownForAllContent countdownForAllContent4 = countdownForAllMessage.playContent;
                        if (countdownForAllContent4 == null) {
                            return;
                        }
                        c213500s1.LIZIZ.LIZJ(countdownForAllContent4);
                        return;
                    }
                    C20441214yg.LJ("CountDownForAllV2MessageChannel", "error msg type");
                    return;
                }
                if (!(iMessage instanceof LinkMicFanTicketMethod)) {
                    return;
                }
                C213500s1 c213500s12 = this.LL;
                c213500s12.getClass();
                FanTicketRoomNoticeContent fanTicketRoomNoticeContent = ((LinkMicFanTicketMethod) iMessage).fanTicketRoomNotice;
                if (fanTicketRoomNoticeContent == null || fanTicketRoomNoticeContent.playScene != 1) {
                    return;
                }
                c213500s12.LIZIZ.LIZ(fanTicketRoomNoticeContent);
            }
        };
        this.LIZJ = r2;
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) != 0) {
            iMessageManager.addMessageListener(C001A.COUNTDOWN_FOR_ALL_MESSAGE.getIntType(), (OnIMMessageListener) r2);
            iMessageManager.addStickyMessageListener(C001A.LINK_MIC_FAN_TICKET_METHOD.getIntType(), (OnIMMessageListener) r2);
        }
    }
}
