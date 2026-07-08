package X;

import android.content.Context;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.push.frontier.FrontierPushAdapter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Vpj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C809810Vpj implements InterfaceC810750VrF {
    public static volatile C809810Vpj LJFF;
    public final AtomicReference<InterfaceC809850Vpn> LIZ = new AtomicReference<>();
    public final Context LIZIZ;
    public int LIZJ;
    public String LIZLLL;
    public boolean LJ;

    @Override // X.InterfaceC810750VrF
    public final void onReceiveConnectEvent(C821280WJq c821280WJq, JSONObject jSONObject) {
    }

    public C809810Vpj(Context context) {
        this.LIZIZ = context;
        new AtomicBoolean(false);
        this.LJ = false;
        this.LIZLLL = "";
    }

    public static C809810Vpj LIZIZ(Context context) {
        if (LJFF == null) {
            synchronized (C809810Vpj.class) {
                try {
                    if (LJFF == null) {
                        LJFF = new C809810Vpj(context);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJFF;
    }

    @Override // X.InterfaceC810750VrF
    public final void LIZ(WsChannelMsg wsChannelMsg) {
        if (wsChannelMsg != null && this.LJ) {
            if ((this.LIZJ == 1 || wsChannelMsg.channelId == 10006) && 1777 == wsChannelMsg.service && 1777 == wsChannelMsg.method) {
                try {
                    String str = new String(wsChannelMsg.LIZ());
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("received message:");
                    sbLIZ.append(str);
                    C2188811AlT.LIZIZ(sbLIZ);
                    ((C808680Vnu) C809030VoT.LJIILJJIL()).LJ(FrontierPushAdapter.getFrontierPush(), str, null);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }
    }
}
