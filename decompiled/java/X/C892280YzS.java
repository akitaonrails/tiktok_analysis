package X;

import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.saas.host.api.websocket.IMWebSocketBridgeApi;
import kotlin.jvm.internal.AwS558S0100000_14;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0YzS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C892280YzS implements C0XEZ {
    public static final /* synthetic */ int LLILZLL = 0;
    public final SessionInfo LL;
    public final InterfaceC892300YzU LLILLJJLI;
    public final InterfaceC881630YiH LLILLL;
    public final IMWebSocketBridgeApi LLILZ;
    public final C2171608f4 LLILZIL;

    @Override // X.C0XEZ
    public final void LIZ(C821280WJq c821280WJq, JSONObject jSONObject) {
        IMWebSocketBridgeApi iMWebSocketBridgeApi = this.LLILZ;
        if (iMWebSocketBridgeApi != null && iMWebSocketBridgeApi.isConnected()) {
            C2171608f4 c2171608f4 = this.LLILZIL;
            AnonymousClass0956 anonymousClass0956 = c2171608f4.LIZJ;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            c2171608f4.LIZJ = null;
            return;
        }
        this.LLILZIL.LIZ();
    }

    public C892280YzS(SessionInfo sessionInfo, InterfaceC892300YzU interfaceC892300YzU, InterfaceC881630YiH interfaceC881630YiH) {
        this.LL = sessionInfo;
        this.LLILLJJLI = interfaceC892300YzU;
        this.LLILLL = interfaceC881630YiH;
        IMWebSocketBridgeApi.LIZ.getClass();
        IMWebSocketBridgeApi iMWebSocketBridgeApiLIZ = C892310YzV.LIZ();
        this.LLILZ = iMWebSocketBridgeApiLIZ;
        C2171608f4 c2171608f4 = new C2171608f4(new AwS558S0100000_14(this, 623));
        this.LLILZIL = c2171608f4;
        if (interfaceC892300YzU.LIZ()) {
            interfaceC881630YiH.fetch(sessionInfo.getConversationId(), null, true);
        }
        if (iMWebSocketBridgeApiLIZ != null) {
            iMWebSocketBridgeApiLIZ.LIZLLL(this);
            if (!iMWebSocketBridgeApiLIZ.isConnected()) {
                c2171608f4.LIZ();
            }
        }
    }
}
