package X;

import com.bytedance.android.livesdk.model.message.FanTicketRoomNoticeContent;
import com.bytedance.android.livesdk.model.message.LinkMicFanTicketMethod;
import com.bytedance.android.livesdk.model.message.UserCountdownInfo;
import com.bytedance.android.livesdk.model.message.UserFanTicket;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import java.util.List;
import tikcast.linkmic.common.LinkerMediaChangeOperator;
import webcast.data.multi_guest_play.CountdownContent;
import webcast.im.CountdownMessage;

/* JADX INFO: renamed from: X.01Dw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC299001Dw {
    public DataChannel LIZ;
    public InterfaceC299101Dx LIZIZ;
    public final C298901Dv LIZJ;

    public final void LIZ() {
        IMessageManager iMessageManager;
        try {
            DataChannel dataChannel = this.LIZ;
            if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) != null) {
                iMessageManager.removeMessageListener((OnIMMessageListener) this.LIZJ);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJII(e);
        }
        this.LIZ = null;
        this.LIZIZ = null;
    }

    public void LIZIZ(CountdownMessage countdownMessage) {
        InterfaceC299101Dx interfaceC299101Dx;
        InterfaceC299101Dx interfaceC299101Dx2;
        CountdownContent countdownContent;
        InterfaceC299101Dx interfaceC299101Dx3;
        C1AZW c1azw = C1AZW.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleCountDownMessage messageId=");
        sbLIZ.append(countdownMessage.getMessageId());
        sbLIZ.append(" messageType=");
        sbLIZ.append(countdownMessage.messageType);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1azw.getClass();
        C1AZW.LIZ("BaseMessageChannel", strLIZIZ, null, null);
        LinkerMediaChangeOperator linkerMediaChangeOperator = countdownMessage.operatorUserInfo;
        int i = countdownMessage.messageType;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3 && (countdownContent = countdownMessage.countdownContent) != null && (interfaceC299101Dx3 = this.LIZIZ) != null) {
                        interfaceC299101Dx3.LJIIIZ(new C01E5(countdownContent, false, linkerMediaChangeOperator, 10));
                        return;
                    }
                    return;
                }
                CountdownContent countdownContent2 = countdownMessage.countdownContent;
                if (countdownContent2 == null || (interfaceC299101Dx2 = this.LIZIZ) == null) {
                    return;
                }
                interfaceC299101Dx2.LJIIJJI(new C01E5(countdownContent2, false, linkerMediaChangeOperator, 10));
                return;
            }
            CountdownContent countdownContent3 = countdownMessage.countdownContent;
            if (countdownContent3 == null || (interfaceC299101Dx = this.LIZIZ) == null) {
                return;
            }
            interfaceC299101Dx.LJIIL(new C01E5(countdownContent3, false, linkerMediaChangeOperator, 10));
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("reportErrorMessage reason=");
        sbLIZ2.append("");
        sbLIZ2.append(" message=");
        sbLIZ2.append(countdownMessage);
        C20441214yg.LJ("BaseMessageChannel", C2188811AlT.LIZIZ(sbLIZ2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.01Dv, com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener] */
    public AbstractC299001Dw(DataChannel dataChannel, InterfaceC299101Dx interfaceC299101Dx) {
        IMessageManager iMessageManager;
        this.LIZ = dataChannel;
        this.LIZIZ = interfaceC299101Dx;
        ?? r2 = new OnIMMessageListener() { // from class: X.01Dv
            @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
            public final String messageListenerBizTag() {
                return "count-down-message-channel";
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
            public final IMListenerType messageListenerType() {
                return IMListenerType.SYNC;
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
            public final void onMessage(IMessage iMessage) {
                List<UserFanTicket> list;
                String strLJIIIIZZ;
                if (iMessage == null) {
                    return;
                }
                if (iMessage instanceof CountdownMessage) {
                    this.LL.LIZIZ((CountdownMessage) iMessage);
                    return;
                }
                if (!(iMessage instanceof LinkMicFanTicketMethod)) {
                    return;
                }
                AbstractC299001Dw abstractC299001Dw = this.LL;
                abstractC299001Dw.getClass();
                FanTicketRoomNoticeContent fanTicketRoomNoticeContent = ((LinkMicFanTicketMethod) iMessage).fanTicketRoomNotice;
                if (fanTicketRoomNoticeContent == null || (list = fanTicketRoomNoticeContent.userFanTicket) == null) {
                    return;
                }
                for (UserFanTicket userFanTicket : list) {
                    UserCountdownInfo userCountdownInfo = userFanTicket.countdownInfo;
                    if (userCountdownInfo != null) {
                        InterfaceC299101Dx interfaceC299101Dx2 = abstractC299001Dw.LIZIZ;
                        if (interfaceC299101Dx2 == null || (strLJIIIIZZ = interfaceC299101Dx2.LJIIIIZZ(userFanTicket.userId, userCountdownInfo.countdownId)) == null) {
                            return;
                        }
                        C01E9 c01e9 = new C01E9(userFanTicket.userId, userCountdownInfo.countdownId, userCountdownInfo.targetScore, userCountdownInfo.score, userCountdownInfo.completionProgressPercent, strLJIIIIZZ);
                        C1AZW c1azw = C1AZW.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("handleFanTicketMessage = ");
                        sbLIZ.append(c01e9);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        c1azw.getClass();
                        C1AZW.LIZ("BaseMessageChannel", strLIZIZ, null, null);
                        InterfaceC299101Dx interfaceC299101Dx3 = abstractC299001Dw.LIZIZ;
                        if (interfaceC299101Dx3 != null) {
                            interfaceC299101Dx3.LJIIJ(c01e9);
                        }
                    }
                }
            }
        };
        this.LIZJ = r2;
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) != 0) {
            iMessageManager.addMessageListener(C001A.COUNTDOWN_MESSAGE.getIntType(), (OnIMMessageListener) r2);
            iMessageManager.addStickyMessageListener(C001A.LINK_MIC_FAN_TICKET_METHOD.getIntType(), (OnIMMessageListener) r2);
        }
    }
}
