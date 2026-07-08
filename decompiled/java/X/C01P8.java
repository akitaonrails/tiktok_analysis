package X;

import com.bytedance.android.livesdk.model.message.OecLiveRankMessage;
import com.bytedance.android.livesdk.model.message.RoomUserSeqMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;

/* JADX INFO: renamed from: X.01P8, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01P8 implements OnIMMessageListener {
    public final DataChannel LL;
    public final InterfaceC497601wk LLILLJJLI;
    public final C2252331DDr LLILLL;
    public final C2252331DDr LLILZ;
    public final C2252331DDr LLILZIL;
    public final C2252331DDr LLILZLL;

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final String messageListenerBizTag() {
        return "AudienceRankingMessageListener";
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final IMListenerType messageListenerType() {
        return IMListenerType.ASYNC;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        if (iMessage instanceof RoomUserSeqMessage) {
            C23250099c.LIZLLL(this.LLILLJJLI, null, null, new C01P9(this, iMessage, null), 3);
        } else {
            if (!(iMessage instanceof OecLiveRankMessage)) {
                return;
            }
            C23250099c.LIZLLL(this.LLILLJJLI, null, null, new C01PA(this, iMessage, null), 3);
        }
    }

    public C01P8(DataChannel dataChannel, InterfaceC497601wk interfaceC497601wk) {
        this.LL = dataChannel;
        this.LLILLJJLI = interfaceC497601wk;
        EnumC2252401DDy enumC2252401DDy = EnumC2252401DDy.DROP_OLDEST;
        C2252331DDr c2252331DDrLIZ = C09IR.LIZ(0, 1, enumC2252401DDy);
        this.LLILLL = c2252331DDrLIZ;
        this.LLILZ = c2252331DDrLIZ;
        C2252331DDr c2252331DDrLIZ2 = C09IR.LIZ(0, 4, enumC2252401DDy);
        this.LLILZIL = c2252331DDrLIZ2;
        this.LLILZLL = c2252331DDrLIZ2;
        IMessageManager iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class);
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(C001A.USER_SEQ.getIntType(), (OnIMMessageListener) this);
            iMessageManager.addMessageListener(C001A.OEC_LIVE_RANK_MESSAGE.getIntType(), (OnIMMessageListener) this);
        }
    }
}
