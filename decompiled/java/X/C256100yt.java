package X;

import com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService;
import com.bytedance.android.livesdk.model.message.PartnershipAnchorMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.00yt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C256100yt implements OnIMMessageListener {
    public final long LL;
    public WeakReference<DataChannel> LLILLJJLI;
    public IMessageManager LLILLL;

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final String messageListenerBizTag() {
        return "game_partnership_anchor_message";
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final IMListenerType messageListenerType() {
        return IMListenerType.ASYNC;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        WeakReference<DataChannel> weakReference;
        DataChannel dataChannel;
        if ((iMessage instanceof PartnershipAnchorMessage) && ((PartnershipAnchorMessage) iMessage).changeMode == 1 && (weakReference = this.LLILLJJLI) != null && (dataChannel = weakReference.get()) != null) {
            ((IGamePartnershipService) C1161920gLG.LIZJ(IGamePartnershipService.class)).kr1(this.LL, dataChannel);
        }
    }

    public C256100yt(long j, DataChannel dataChannel) {
        this.LL = j;
        this.LLILLJJLI = new WeakReference<>(dataChannel);
        IMessageManager iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class);
        this.LLILLL = iMessageManager;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(C001A.PARTNERSHIP_ANCHOR_MESSAGE.getIntType(), (OnIMMessageListener) this);
        }
    }
}
