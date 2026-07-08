package X;

import com.bytedance.android.livesdk.model.message.FanTicketRoomNoticeContent;
import com.bytedance.android.livesdk.model.message.LinkMicFanTicketMethod;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: renamed from: X.0abw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C941620abw extends AbstractC941590abt implements OnIMMessageListener {
    @Override // X.AbstractC941590abt
    public final String LIZ() {
        return "IMDataSource";
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final String messageListenerBizTag() {
        return "fan-ticket-component-im-data-source";
    }

    @Override // X.AbstractC941590abt
    public final void onDestroy() {
        IMessageManager iMessageManager;
        DataChannel dataChannel = this.LL;
        if (dataChannel == null || (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) == null) {
            return;
        }
        iMessageManager.removeMessageListener((OnIMMessageListener) this);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final IMListenerType messageListenerType() {
        return IMListenerType.SYNC;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        boolean zLIZJ;
        int i;
        if (iMessage instanceof LinkMicFanTicketMethod) {
            LinkMicFanTicketMethod linkMicFanTicketMethod = (LinkMicFanTicketMethod) iMessage;
            FanTicketRoomNoticeContent fanTicketRoomNoticeContent = linkMicFanTicketMethod.fanTicketRoomNotice;
            if (fanTicketRoomNoticeContent != null && this.LLILLJJLI.LJFF != (i = fanTicketRoomNoticeContent.scoreType)) {
                zLIZJ = C320901Mh.LIZJ();
                this.LLILLJJLI.LJFF = i;
            } else {
                zLIZJ = false;
            }
            LIZJ(linkMicFanTicketMethod.fanTicketRoomNotice, true, zLIZJ, "IMDataSource");
        }
    }

    public C941620abw(DataChannel dataChannel, C941630abx c941630abx, C941790acD c941790acD, AwS559S0100000_15 awS559S0100000_15) {
        IMessageManager iMessageManager;
        super(dataChannel, c941630abx, c941790acD, awS559S0100000_15);
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) != null) {
            iMessageManager.addStickyMessageListener(C001A.LINK_MIC_FAN_TICKET_METHOD.getIntType(), (OnIMMessageListener) this);
        }
    }
}
