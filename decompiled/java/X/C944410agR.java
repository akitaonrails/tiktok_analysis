package X;

import com.bytedance.android.livesdk.model.message.CohostSettingsUpdateMessage;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import java.util.Map;

/* JADX INFO: renamed from: X.0agR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C944410agR {
    public IMessageManager LIZ;
    public final C944370agN LIZIZ = new OnIMMessageListener() { // from class: X.0agN
        @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
        public final String messageListenerBizTag() {
            return "co-host-settings-update-listener";
        }

        @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
        public final IMListenerType messageListenerType() {
            return IMListenerType.SYNC;
        }

        @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
        public final void onMessage(IMessage iMessage) {
            Map<Long, Boolean> map;
            if ((iMessage instanceof CohostSettingsUpdateMessage) && (map = ((CohostSettingsUpdateMessage) iMessage).anchorSettings) != null) {
                this.LL.getClass();
                Map<Long, Boolean> mapLLJL = C915980Zwa.LJI().LIZJ().LLJL();
                mapLLJL.clear();
                mapLLJL.putAll(map);
            }
        }
    };
}
