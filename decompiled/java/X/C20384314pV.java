package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import kotlin.jvm.internal.AwS432S0200000_31;

/* JADX INFO: renamed from: X.14pV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20384314pV {
    public final DataChannel LIZ;
    public final InterfaceC20389414qK LIZIZ;
    public final C20384414pW LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.14pW, com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener] */
    public C20384314pV(DataChannel dataChannel, InterfaceC20389414qK interfaceC20389414qK) {
        IMessageManager iMessageManager;
        this.LIZ = dataChannel;
        this.LIZIZ = interfaceC20389414qK;
        ?? r2 = new OnIMMessageListener() { // from class: X.14pW
            @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
            public final String messageListenerBizTag() {
                return "playbook-message-channel";
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
            public final IMListenerType messageListenerType() {
                return IMListenerType.SYNC;
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
            public final void onMessage(IMessage iMessage) {
                C403501hZ.LIZ(new AwS432S0200000_31(iMessage, this.LL, 106));
            }
        };
        this.LIZJ = r2;
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) != 0) {
            iMessageManager.addMessageListener(C001A.PLAYBOOK_MESSAGE.getIntType(), (OnIMMessageListener) r2);
        }
    }
}
