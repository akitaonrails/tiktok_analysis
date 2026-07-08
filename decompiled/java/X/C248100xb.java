package X;

import com.bytedance.android.livesdk.dataChannel.MemberMessageChannel;
import com.bytedance.android.livesdk.model.message.MemberMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.BaseMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;

/* JADX INFO: renamed from: X.00xb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C248100xb implements OnMessageListener {
    public final Room LL;
    public DataChannel LLILLJJLI;

    public C248100xb(Room room) {
        this.LL = room;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        DataChannel dataChannel;
        if (iMessage != 0) {
            if ((iMessage instanceof MemberMessage) && ((BaseMessage) iMessage).isCurrentRoom(this.LL.getId()) && (dataChannel = this.LLILLJJLI) != null) {
                dataChannel.zW(MemberMessageChannel.class, iMessage);
                return;
            }
            return;
        }
        try {
            "Required value was null.".toString();
            throw new IllegalStateException("Required value was null.");
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
