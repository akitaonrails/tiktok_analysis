package X;

import com.bytedance.android.livesdk.model.message.MGQuickCallAutoApproveMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;

/* JADX INFO: renamed from: X.0aLn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C931610aLn {
    public final DataChannel LIZ;
    public final InterfaceC931620aLo LIZIZ;
    public final C931600aLm LIZJ = new OnIMMessageListener() { // from class: X.0aLm
        @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
        public final String messageListenerBizTag() {
            return "quick-connect-message-channel";
        }

        @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
        public final IMListenerType messageListenerType() {
            return IMListenerType.SYNC;
        }

        @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
        public final void onMessage(IMessage iMessage) {
            if (iMessage != null && (iMessage instanceof MGQuickCallAutoApproveMessage)) {
                C931610aLn c931610aLn = this.LL;
                MGQuickCallAutoApproveMessage mGQuickCallAutoApproveMessage = (MGQuickCallAutoApproveMessage) iMessage;
                c931610aLn.getClass();
                if (mGQuickCallAutoApproveMessage.quickCallAutoApprove == 0) {
                    C20441214yg.LIZIZ("QuickConnectMessageChannel", "handleQuickCallAutoApproveMessage, QUICK_CALL_AUTO_APPROVE_END");
                    c931610aLn.LIZIZ.Xr1(Long.valueOf(mGQuickCallAutoApproveMessage.quickCallAutoApproveStartMs), "time_out");
                }
            }
        }
    };

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0aLm] */
    public C931610aLn(DataChannel dataChannel, InterfaceC931620aLo interfaceC931620aLo) {
        this.LIZ = dataChannel;
        this.LIZIZ = interfaceC931620aLo;
    }
}
