package X;

import com.bytedance.android.livesdk.model.message.FanTicketRoomNoticeContent;
import com.bytedance.android.livesdk.model.message.LinkMicFanTicketMethod;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import webcast.im.MultiGuestTopGuestMessage;

/* JADX INFO: renamed from: X.01ZP, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01ZP {
    public final DataChannel LIZ;
    public final C01ZQ LIZIZ;
    public final C01ZK LIZJ = new OnIMMessageListener() { // from class: X.01ZK
        @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
        public final String messageListenerBizTag() {
            return "top_guest_game_play_message_channel";
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
            if (iMessage instanceof LinkMicFanTicketMethod) {
                C01ZP c01zp = this.LL;
                c01zp.getClass();
                FanTicketRoomNoticeContent fanTicketRoomNoticeContent = ((LinkMicFanTicketMethod) iMessage).fanTicketRoomNotice;
                if (fanTicketRoomNoticeContent != null) {
                    c01zp.LIZIZ.LIZ(fanTicketRoomNoticeContent);
                    return;
                }
                return;
            }
            if (!(iMessage instanceof MultiGuestTopGuestMessage)) {
                return;
            }
            C01ZP c01zp2 = this.LL;
            MultiGuestTopGuestMessage multiGuestTopGuestMessage = (MultiGuestTopGuestMessage) iMessage;
            c01zp2.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("receive top guest im, message type: ");
            sbLIZ.append(multiGuestTopGuestMessage.messageType);
            C20441214yg.LJIIIZ("TopGuestGamePlayMessageChannel", C2188811AlT.LIZIZ(sbLIZ));
            int i = multiGuestTopGuestMessage.messageType;
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                c01zp2.LIZIZ.LIZIZ(multiGuestTopGuestMessage);
                return;
            }
            c01zp2.LIZIZ.LIZJ(multiGuestTopGuestMessage);
        }
    };

    /* JADX WARN: Type inference failed for: r0v0, types: [X.01ZK] */
    public C01ZP(DataChannel dataChannel, C01ZQ c01zq) {
        this.LIZ = dataChannel;
        this.LIZIZ = c01zq;
    }
}
