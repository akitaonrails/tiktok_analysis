package X;

import com.bytedance.common.wschannel.MainProcessMsg;
import com.bytedance.common.wschannel.model.ServiceConnectEvent;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0WJr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C821290WJr implements InterfaceC821190WJh {
    @Override // X.InterfaceC821190WJh
    public final void onSendResult(String str, boolean z) {
    }

    @Override // X.InterfaceC821190WJh
    public final void onReceive(WsChannelMsg wsChannelMsg) {
        InterfaceC810750VrF interfaceC810750VrF;
        C821300WJs c821300WJsLIZIZ = C821310WJt.LIZIZ(wsChannelMsg.channelId);
        if (c821300WJsLIZIZ != null && (interfaceC810750VrF = c821300WJsLIZIZ.LIZIZ) != null && !wsChannelMsg.isAckMsg) {
            interfaceC810750VrF.LIZ(wsChannelMsg);
        }
    }

    @Override // X.InterfaceC821190WJh
    public final void onReceiveServiceEvent(ServiceConnectEvent serviceConnectEvent) {
        C821300WJs c821300WJsLIZIZ = C821310WJt.LIZIZ(serviceConnectEvent.mChannelId);
        if (c821300WJsLIZIZ != null) {
            c821300WJsLIZIZ.LJII.put(Integer.valueOf(serviceConnectEvent.mServiceId), Boolean.valueOf(serviceConnectEvent.mConnected));
        }
    }

    public static final void LIZ(WsChannelMsg wsChannelMsg, boolean z) {
        InterfaceC821350WJx interfaceC821350WJx;
        if (C821310WJt.LIZIZ(wsChannelMsg.channelId) != null && (wsChannelMsg instanceof MainProcessMsg) && (interfaceC821350WJx = ((MainProcessMsg) wsChannelMsg).mListener) != null) {
            interfaceC821350WJx.LIZ();
        }
    }

    @Override // X.InterfaceC821190WJh
    public final void onReceiveConnectEvent(C821280WJq c821280WJq, JSONObject jSONObject) {
        C821300WJs c821300WJsLIZIZ = C821310WJt.LIZIZ(c821280WJq.LIZLLL);
        if (c821300WJsLIZIZ != null) {
            InterfaceC810750VrF interfaceC810750VrF = c821300WJsLIZIZ.LIZIZ;
            if (interfaceC810750VrF != null) {
                interfaceC810750VrF.onReceiveConnectEvent(c821280WJq, jSONObject);
            }
            if (c821280WJq.LIZIZ == C0XE1.CONNECT_CLOSED && c821300WJsLIZIZ.LJI.get()) {
                int i = c821300WJsLIZIZ.LIZ.LIZ;
                ((ConcurrentHashMap) C821310WJt.LIZIZ).remove(Integer.valueOf(i));
            }
        }
    }

    @Override // X.InterfaceC821190WJh
    public final void syncState(int i, C0XE1 c0xe1, boolean z) {
        C821300WJs c821300WJsLIZIZ = C821310WJt.LIZIZ(i);
        if (c821300WJsLIZIZ != null) {
            c821300WJsLIZIZ.LJFF = c0xe1;
        }
    }
}
