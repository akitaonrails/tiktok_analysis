package X;

import com.bytedance.android.livesdkapi.ws.LiveWsMessage;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pre, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1527960pre implements C0XEZ, InterfaceC486470J5x {
    public static final C1527960pre LL = new C1527960pre();
    public static final int LLILLJJLI;
    public static final int LLILLL;

    static {
        C1528020prk.LIZ().getClass();
        LLILLJJLI = 20347;
        C1528020prk.LIZ().getClass();
        LLILLL = 1;
    }

    @Override // X.InterfaceC486470J5x
    public final void LIZIZ(WsChannelMsg wsChannelMsg) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onReceivedWsMsg logId=");
        sbLIZ.append(wsChannelMsg.logId);
        sbLIZ.append(", method=");
        sbLIZ.append(wsChannelMsg.method);
        sbLIZ.append(", seqId=");
        sbLIZ.append(wsChannelMsg.seqId);
        C20441214yg.LJIIIZ("LiveHostWsMessageListener", C2188811AlT.LIZIZ(sbLIZ));
        C1527950prd c1527950prd = new C1527950prd(wsChannelMsg.channelId);
        c1527950prd.LIZJ = wsChannelMsg.logId;
        c1527950prd.LJ = wsChannelMsg.method;
        c1527950prd.LJIIIIZZ = wsChannelMsg.seqId;
        c1527950prd.LIZLLL = wsChannelMsg.service;
        c1527950prd.LJI = wsChannelMsg.payloadType;
        c1527950prd.LJII = wsChannelMsg.payloadEncoding;
        c1527950prd.LJFF = wsChannelMsg.LIZ();
        c1527950prd.LJIIIZ = wsChannelMsg.replayToComponentName;
        List<WsChannelMsg.MsgHeader> list = wsChannelMsg.msgHeaders;
        if (list != null) {
            for (WsChannelMsg.MsgHeader msgHeader : list) {
                ((HashMap) c1527950prd.LIZIZ).put(msgHeader.key, msgHeader.value);
            }
        }
        C1519770peR c1519770peRLIZ = C1519770peR.LIZ();
        LiveWsMessage liveWsMessageLIZ = c1527950prd.LIZ();
        for (InterfaceC1528010prj interfaceC1528010prj : c1519770peRLIZ.LIZ) {
            if (interfaceC1528010prj != null) {
                interfaceC1528010prj.LIZ(liveWsMessageLIZ);
            }
        }
    }

    @Override // X.C0XEZ
    public final void LIZ(C821280WJq c821280WJq, JSONObject jSONObject) {
        int i;
        EnumC1527990prh enumC1527990prh = EnumC1527990prh.CONNECTION_UNKNOWN;
        C0XE1 c0xe1 = c821280WJq.LIZIZ;
        if (c0xe1 != null && (i = C845270XDx.LIZ[c0xe1.ordinal()]) != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            enumC1527990prh = EnumC1527990prh.CONNECTED;
                        }
                    } else {
                        enumC1527990prh = EnumC1527990prh.CONNECT_CLOSED;
                    }
                } else {
                    enumC1527990prh = EnumC1527990prh.CONNECT_FAILED;
                }
            } else {
                enumC1527990prh = EnumC1527990prh.CONNECTING;
            }
        }
        Iterator<InterfaceC1528010prj> it2 = C1519770peR.LIZ().LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ(enumC1527990prh, jSONObject);
        }
    }
}
