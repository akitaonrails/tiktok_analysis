package X;

import com.bytedance.android.livesdkapi.ws.LiveWsMessage;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0prg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1527980prg implements C0XEZ, InterfaceC486470J5x {
    public final C1519610peB LL;

    public C1527980prg(C1519610peB c1519610peB) {
        this.LL = c1519610peB;
    }

    @Override // X.InterfaceC486470J5x
    public final void LIZIZ(WsChannelMsg wsChannelMsg) {
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
        C1519610peB c1519610peB = this.LL;
        LiveWsMessage liveWsMessageLIZ = c1527950prd.LIZ();
        for (InterfaceC1528010prj interfaceC1528010prj : c1519610peB.LIZ) {
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
        if (c0xe1 != null && (i = C845260XDw.LIZ[c0xe1.ordinal()]) != 1) {
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
        Iterator<InterfaceC1528010prj> it2 = this.LL.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ(enumC1527990prh, jSONObject);
        }
    }
}
