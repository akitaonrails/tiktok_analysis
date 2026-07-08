package X;

import com.bytedance.android.livesdk.model.message.ControlMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0UkM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C781000UkM implements OnMessageListener {
    public InterfaceC781170Ukd LL;
    public final DataChannel LLILLJJLI;
    public IMessageManager LLILLL;

    public C781000UkM(DataChannel dataChannel) {
        this.LLILLJJLI = dataChannel;
    }

    public final void LIZ(InterfaceC781170Ukd interfaceC781170Ukd) {
        this.LL = interfaceC781170Ukd;
        IMessageManager iMessageManager = (IMessageManager) this.LLILLJJLI.gg0(C776250Uch.class);
        this.LLILLL = iMessageManager;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(C001A.CONTROL.getIntType(), this);
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        InterfaceC781170Ukd interfaceC781170Ukd = this.LL;
        if (interfaceC781170Ukd != null) {
            interfaceC781170Ukd.ON((ControlMessage) iMessage);
            return;
        }
        HashMap map = new HashMap();
        map.put("action", Integer.valueOf(((ControlMessage) iMessage).action));
        C1CC2.LJII(1, "ttlive_control_message_status", map);
    }
}
