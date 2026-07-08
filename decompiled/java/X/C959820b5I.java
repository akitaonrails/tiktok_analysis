package X;

import Y.ARunnableS84S0200000_15;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchTeamPairSetting;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.model.message.linker.random_linkmic_message.LinkerRandomMatchContent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;

/* JADX INFO: renamed from: X.0b5I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C959820b5I {
    public final DataChannel LIZ;
    public InterfaceC960060b5g LIZIZ;
    public final C959740b5A LIZJ = new OnIMMessageListener() { // from class: X.0b5A
        @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
        public final String messageListenerBizTag() {
            return "QuickCoHostMessageManager";
        }

        @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
        public final IMListenerType messageListenerType() {
            return IMListenerType.SYNC;
        }

        @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
        public final void onMessage(IMessage iMessage) {
            Long lValueOf;
            C959820b5I c959820b5I = this.LL;
            c959820b5I.getClass();
            if (iMessage != null && (iMessage instanceof LinkMessage)) {
                LinkMessage linkMessage = (LinkMessage) iMessage;
                int i = linkMessage.messageType;
                if (i != 16) {
                    if (i == 201) {
                        if (!LiveMatchTeamPairSetting.INSTANCE.isEnable()) {
                            C20441214yg.LIZIZ("QuickCoHostMessageManager", "team pair is not enabled");
                            return;
                        }
                        LinkerRandomMatchContent linkerRandomMatchContent = linkMessage.randomMatchContent;
                        if (linkerRandomMatchContent != null) {
                            lValueOf = Long.valueOf(linkerRandomMatchContent.sourceType);
                        } else {
                            lValueOf = null;
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onMessage messageId = ");
                        sbLIZ.append(linkMessage.getMessageId());
                        sbLIZ.append(", sourceType = ");
                        sbLIZ.append(lValueOf);
                        C20441214yg.LIZIZ("QuickCoHostMessageManager", C2188811AlT.LIZIZ(sbLIZ));
                        int i2 = linkMessage.messageType;
                        if (i2 != 201) {
                            if (i2 != 201) {
                                return;
                            }
                        } else {
                            LinkerRandomMatchContent linkerRandomMatchContent2 = linkMessage.randomMatchContent;
                            if (linkerRandomMatchContent2 == null || linkerRandomMatchContent2.sourceType != 57) {
                            }
                            C0UHI.LIZ(new ARunnableS84S0200000_15(c959820b5I, iMessage, 42));
                            return;
                        }
                        LinkerRandomMatchContent linkerRandomMatchContent3 = linkMessage.randomMatchContent;
                        if (linkerRandomMatchContent3 == null || linkerRandomMatchContent3.sourceType != 59) {
                            return;
                        }
                        C0UHI.LIZ(new ARunnableS84S0200000_15(c959820b5I, iMessage, 42));
                        return;
                    }
                    return;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onMessage messageId = ");
                sbLIZ2.append(linkMessage.getMessageId());
                C20441214yg.LIZIZ("QuickCoHostMessageManager", C2188811AlT.LIZIZ(sbLIZ2));
                C0UHI.LIZ(new ARunnableS84S0200000_15(c959820b5I, iMessage, 41));
            }
        }
    };

    public final void LIZ() {
        IMessageManager iMessageManager;
        DataChannel dataChannel = this.LIZ;
        if (dataChannel == null || (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) == null) {
            return;
        }
        iMessageManager.removeMessageListener(C001A.LINK_MESSAGE.getIntType(), this.LIZJ);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0b5A] */
    public C959820b5I(DataChannel dataChannel) {
        this.LIZ = dataChannel;
    }
}
