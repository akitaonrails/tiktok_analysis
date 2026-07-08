package X;

import Y.AObserverS233S0100000_31;
import com.bytedance.android.livesdk.model.message.PreviewGameMomentMessage;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;

/* JADX INFO: renamed from: X.152b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C204547152b {
    public final InterfaceC204546152a LIZ;
    public final C152Z LIZIZ = new OnIMMessageListener() { // from class: X.152Z
        @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
        public final String messageListenerBizTag() {
            return "PreviewGameMomentModel";
        }

        @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
        public final IMListenerType messageListenerType() {
            return IMListenerType.SYNC;
        }

        @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
        public final void onMessage(IMessage iMessage) {
            if (!(iMessage instanceof PreviewGameMomentMessage)) {
                return;
            }
            this.LL.LIZ.LIZJ((PreviewGameMomentMessage) iMessage);
        }
    };
    public final AObserverS233S0100000_31 LIZJ = new AObserverS233S0100000_31(this, 2);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.152Z] */
    public C204547152b(InterfaceC204546152a interfaceC204546152a) {
        this.LIZ = interfaceC204546152a;
    }
}
