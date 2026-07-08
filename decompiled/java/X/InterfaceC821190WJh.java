package X;

import com.bytedance.common.wschannel.model.ServiceConnectEvent;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0WJh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public interface InterfaceC821190WJh {
    void onReceive(WsChannelMsg wsChannelMsg);

    void onReceiveConnectEvent(C821280WJq c821280WJq, JSONObject jSONObject);

    void onReceiveServiceEvent(ServiceConnectEvent serviceConnectEvent);

    void onSendResult(String str, boolean z);

    void syncState(int i, C0XE1 c0xe1, boolean z);
}
