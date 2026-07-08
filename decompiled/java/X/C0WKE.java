package X;

import com.bytedance.common.wschannel.channel.IWsChannelClient;
import com.bytedance.common.wschannel.model.ServiceConnectEvent;
import com.bytedance.common.wschannel.model.SocketState;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0WKE, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public interface C0WKE {
    void LIZ();

    void LIZIZ(IWsChannelClient iWsChannelClient, int i, JSONObject jSONObject);

    void LIZJ(SocketState socketState);

    void LIZLLL(ServiceConnectEvent serviceConnectEvent);

    void LJ();

    void LJFF(int i, byte[] bArr);

    void LJI(int i, WsChannelMsg wsChannelMsg);

    void LJII(WsChannelMsg wsChannelMsg, boolean z);
}
