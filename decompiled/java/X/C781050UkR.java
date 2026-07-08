package X;

import com.bytedance.android.livesdk.dataChannel.RoomShareCountChannel;
import com.bytedance.android.livesdk.model.message.SocialMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;

/* JADX INFO: renamed from: X.0UkR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C781050UkR implements InterfaceC781220Uki, OnMessageListener {
    public DataChannel LL;
    public IMessageManager LLILLJJLI;

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        DataChannel dataChannel;
        int iIntValue;
        if (iMessage instanceof SocialMessage) {
            SocialMessage socialMessage = (SocialMessage) iMessage;
            if (socialMessage.action == 3 && (dataChannel = this.LL) != null) {
                int i = socialMessage.shareCount;
                Integer num = (Integer) dataChannel.gg0(RoomShareCountChannel.class);
                if (num != null && (iIntValue = num.intValue()) >= i) {
                    i = iIntValue;
                }
                dataChannel.zW(RoomShareCountChannel.class, Integer.valueOf(i));
            }
        }
    }

    public final void LIZ(DataChannel dataChannel, IMessageManager iMessageManager, int i) {
        int iIntValue;
        Integer numValueOf;
        Integer num = (Integer) dataChannel.gg0(RoomShareCountChannel.class);
        if (num != null && (iIntValue = num.intValue()) > 0 && (numValueOf = Integer.valueOf(iIntValue)) != null) {
            i = numValueOf.intValue();
        }
        dataChannel.zW(RoomShareCountChannel.class, Integer.valueOf(i));
        this.LL = dataChannel;
        if (iMessageManager == null) {
            return;
        }
        iMessageManager.addMessageListener(C001A.SOCIAL.getIntType(), this);
        this.LLILLJJLI = iMessageManager;
    }
}
