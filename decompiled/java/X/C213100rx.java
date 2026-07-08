package X;

import com.bytedance.android.livesdk.model.message.FanTicketRoomNoticeContent;
import com.bytedance.android.livesdk.model.message.LinkMicFanTicketMethod;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import webcast.data.multi_guest_play.GuestShowdownContent;
import webcast.im.GuestShowdownMessage;

/* JADX INFO: renamed from: X.00rx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C213100rx {
    public final DataChannel LIZ;
    public final InterfaceC213200ry LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public final C213000rw LJ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.00rw, com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener] */
    public C213100rx(DataChannel dataChannel, InterfaceC213200ry interfaceC213200ry) {
        IMessageManager iMessageManager;
        this.LIZ = dataChannel;
        this.LIZIZ = interfaceC213200ry;
        ?? r2 = new OnIMMessageListener() { // from class: X.00rw
            @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
            public final String messageListenerBizTag() {
                return "guest-showdown-message-channel";
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
            public final IMListenerType messageListenerType() {
                return IMListenerType.SYNC;
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
            public final void onMessage(IMessage iMessage) {
                if (iMessage == null) {
                    return;
                }
                long j = 0;
                if (iMessage instanceof GuestShowdownMessage) {
                    C213100rx c213100rx = this.LL;
                    GuestShowdownMessage guestShowdownMessage = (GuestShowdownMessage) iMessage;
                    c213100rx.getClass();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("handleGuestShowdownMessageIM messageId=");
                    sbLIZ.append(guestShowdownMessage.getMessageId());
                    sbLIZ.append(" messageType=");
                    sbLIZ.append(guestShowdownMessage.messageType);
                    C20441214yg.LJIIIZ("GuestShowdownMessageChannel", C2188811AlT.LIZIZ(sbLIZ));
                    GuestShowdownContent guestShowdownContent = guestShowdownMessage.playContent;
                    if (guestShowdownContent != null) {
                        j = guestShowdownContent.version;
                    }
                    if (c213100rx.LIZJ > j) {
                        return;
                    }
                    switch (guestShowdownMessage.messageType) {
                        case 0:
                            C20441214yg.LJ("GuestShowdownMessageChannel", "error msg type: 0");
                            break;
                        case 1:
                            c213100rx.LIZIZ.LJ(guestShowdownContent);
                            break;
                        case 2:
                            c213100rx.LIZIZ.LJI(guestShowdownContent);
                            break;
                        case 3:
                            c213100rx.LIZIZ.LIZIZ(guestShowdownMessage.toCalculatingReason, guestShowdownContent);
                            break;
                        case 4:
                            c213100rx.LIZIZ.LIZJ(guestShowdownContent);
                            break;
                        case 5:
                            c213100rx.LIZIZ.LIZ(guestShowdownContent);
                            break;
                        case 6:
                            c213100rx.LIZIZ.LJFF(guestShowdownContent);
                            break;
                        case 7:
                            c213100rx.LIZIZ.LJII(guestShowdownContent, guestShowdownMessage.playClosedReason, guestShowdownMessage.guestShowdownConfigChange);
                            break;
                    }
                    c213100rx.LIZJ = j;
                    return;
                }
                if (!(iMessage instanceof LinkMicFanTicketMethod)) {
                    return;
                }
                C213100rx c213100rx2 = this.LL;
                c213100rx2.getClass();
                FanTicketRoomNoticeContent fanTicketRoomNoticeContent = ((LinkMicFanTicketMethod) iMessage).fanTicketRoomNotice;
                if (fanTicketRoomNoticeContent == null || fanTicketRoomNoticeContent.playScene != 12) {
                    return;
                }
                long j2 = fanTicketRoomNoticeContent.version;
                if (c213100rx2.LIZLLL > j2) {
                    return;
                }
                if (fanTicketRoomNoticeContent != null) {
                    c213100rx2.LIZIZ.LIZLLL(fanTicketRoomNoticeContent);
                }
                c213100rx2.LIZLLL = j2;
            }
        };
        this.LJ = r2;
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) != 0) {
            iMessageManager.addMessageListener(C001A.GUEST_SHOWDOWN_MESSAGE.getIntType(), (OnIMMessageListener) r2);
            if (!C01ZE.LIZ()) {
                iMessageManager.addStickyMessageListener(C001A.LINK_MIC_FAN_TICKET_METHOD.getIntType(), (OnIMMessageListener) r2);
            }
        }
    }
}
