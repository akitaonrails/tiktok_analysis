package X;

import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.android.livesdkapi.message.ProtoMessageFetchResult;
import com.bytedance.android.livesdkapi.ws.LiveWsMessage;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0IoD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C477630IoD implements InterfaceC1528010prj {
    public static volatile boolean LIZIZ;
    public static final C477630IoD LIZ = new C477630IoD();
    public static final LinkedHashMap<String, InterfaceC477620IoC> LIZJ = new LinkedHashMap<>();

    public final synchronized void LIZJ() {
        if (LIZIZ) {
            return;
        }
        ((IHostNetwork) C1161920gLG.LIZJ(IHostNetwork.class)).registerHostWS(-10000, -10000, this);
        LIZIZ = true;
        C20441214yg.LIZIZ("legolas_im", "HangoutOutRoomWsDispatcher registerHostWS success");
    }

    public final synchronized void LJ() {
        if (LIZIZ) {
            if (!LIZJ.isEmpty()) {
                return;
            }
            ((IHostNetwork) C1161920gLG.LIZJ(IHostNetwork.class)).unRegisterHostWS(-10000, -10000, this);
            LIZIZ = false;
            C20441214yg.LIZIZ("legolas_im", "HangoutOutRoomWsDispatcher unRegisterHostWS because idle");
        }
    }

    @Override // X.InterfaceC1528010prj
    public final void LIZ(LiveWsMessage liveWsMessage) {
        Map mapLJIIZILJ;
        Object c098200Yq;
        ProtoMessageFetchResult protoMessageFetchResult;
        List<ProtoMessageFetchResult.BaseProtoMessage> list;
        byte[] bArr;
        if (liveWsMessage.service == 134217784 && liveWsMessage.method == 1) {
            synchronized (this) {
                try {
                    mapLJIIZILJ = C2097608Jq.LJIIZILJ(LIZJ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (mapLJIIZILJ.isEmpty()) {
                return;
            }
            try {
                C1515210pX5.LIZLLL().getClass();
                C0IMD c0imdLJI = C1515210pX5.LJI(ProtoMessageFetchResult.class);
                C1516680pZS c1516680pZS = new C1516680pZS();
                c1516680pZS.LJIIL(new C1506330pIl(liveWsMessage.LIZ()));
                c098200Yq = null;
                if (c0imdLJI != null && (protoMessageFetchResult = (ProtoMessageFetchResult) c0imdLJI.LIZJ(c1516680pZS)) != null && (list = protoMessageFetchResult.messages) != null) {
                    for (ProtoMessageFetchResult.BaseProtoMessage baseProtoMessage : list) {
                        InterfaceC477620IoC interfaceC477620IoC = (InterfaceC477620IoC) mapLJIIZILJ.get(baseProtoMessage.method);
                        if (interfaceC477620IoC != null && (bArr = baseProtoMessage.payload) != null) {
                            interfaceC477620IoC.LIZ(bArr);
                        }
                    }
                    c098200Yq = Unit.LIZ;
                }
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C20441214yg.LJFF("legolas_im", "HangoutOutRoomWsDispatcher onReceiveMsg error:", thM5exceptionOrNullimpl);
            }
        }
    }

    public final synchronized void LIZLLL(InterfaceC477620IoC interfaceC477620IoC) {
        LIZJ.put(interfaceC477620IoC.getMethod(), interfaceC477620IoC);
        LIZJ();
    }

    @Override // X.InterfaceC1528010prj
    public final void LIZIZ(EnumC1527990prh enumC1527990prh, JSONObject jSONObject) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HangoutOutRoomWsDispatcher LiveWsConnectState=");
        sbLIZ.append(enumC1527990prh);
        sbLIZ.append(" connectJson=");
        sbLIZ.append(jSONObject);
        C20441214yg.LIZIZ("legolas_im", C2188811AlT.LIZIZ(sbLIZ));
    }
}
