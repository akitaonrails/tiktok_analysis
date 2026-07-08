package X;

import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;

/* JADX INFO: renamed from: X.0Unl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C783110Unl implements OnMessageListener {
    public InterfaceC783120Unm LL;

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        InterfaceC783120Unm interfaceC783120Unm = this.LL;
        if (interfaceC783120Unm != null) {
            interfaceC783120Unm.LIZ((AbstractC1136060ffY) iMessage);
        }
    }
}
