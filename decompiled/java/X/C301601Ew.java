package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import webcast.im.TextHeaderMessage;

/* JADX INFO: renamed from: X.01Ew, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C301601Ew {
    public final DataChannel LIZ;
    public final InterfaceC301701Ex LIZIZ;
    public final C301501Ev LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.01Ev, com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener] */
    public C301601Ew(DataChannel dataChannel, InterfaceC301701Ex interfaceC301701Ex) {
        IMessageManager iMessageManager;
        this.LIZ = dataChannel;
        this.LIZIZ = interfaceC301701Ex;
        ?? r3 = new OnIMMessageListener() { // from class: X.01Ev
            @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
            public final String messageListenerBizTag() {
                return "text-header-message-channel";
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
            public final IMListenerType messageListenerType() {
                return IMListenerType.SYNC;
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
            public final void onMessage(IMessage iMessage) {
                if (iMessage != null && (iMessage instanceof TextHeaderMessage)) {
                    C301601Ew c301601Ew = this.LL;
                    TextHeaderMessage textHeaderMessage = (TextHeaderMessage) iMessage;
                    c301601Ew.getClass();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("handleTextHeaderMessageIM messageType:");
                    sbLIZ.append(textHeaderMessage.messageType);
                    C972080bP4.LIZLLL(C2188811AlT.LIZIZ(sbLIZ), "TextHeaderMessageChannel", 2);
                    int i = textHeaderMessage.messageType;
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                c301601Ew.LIZIZ.LIZIZ(textHeaderMessage.textHeaderPlayContent);
                                return;
                            }
                            return;
                        }
                        c301601Ew.LIZIZ.LIZJ(textHeaderMessage.textHeaderPlayContent);
                        return;
                    }
                    c301601Ew.LIZIZ.LIZ(textHeaderMessage.textHeaderPlayContent);
                }
            }
        };
        this.LIZJ = r3;
        C972080bP4.LIZLLL("init", "TextHeaderMessageChannel", 2);
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) != 0) {
            iMessageManager.addMessageListener(C001A.TEXT_HEADER_MESSAGE.getIntType(), (OnIMMessageListener) r3);
        }
    }
}
