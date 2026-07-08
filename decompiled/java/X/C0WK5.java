package X;

import Y.ARunnableS82S0200000_13;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.app.IWsApp;
import com.bytedance.common.wschannel.channel.IWsChannelClient;
import com.bytedance.common.wschannel.model.NewMsgTimeHolder;
import com.bytedance.common.wschannel.model.ServiceConnectEvent;
import com.bytedance.common.wschannel.model.SocketState;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.common.wschannel.server.WsChannelService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0WK5, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WK5 implements C0WKE {
    public final Context LIZ;
    public final C0WK9 LIZIZ;
    public final C821290WJr LIZJ;
    public final C821220WJk LIZLLL;
    public C0WKC LJ;
    public final AtomicInteger LJFF;

    @Override // X.C0WKE
    public final void LIZ() {
    }

    @Override // X.C0WKE
    public final void LJ() {
        Intent intent = new Intent();
        intent.setAction("com.bytedance.article.wschannel.syncconnectstate");
        intent.putParcelableArrayListExtra("connection", new ArrayList<>(((ConcurrentHashMap) this.LIZIZ.LIZJ).values()));
        this.LIZLLL.LIZ(intent, null);
    }

    @Override // X.C0WKE
    public final void LIZJ(SocketState socketState) {
        ((ConcurrentHashMap) this.LIZIZ.LIZJ).put(Integer.valueOf(socketState.channelId), socketState);
        try {
            Intent intent = new Intent();
            intent.setAction("com.bytedance.article.wschannel.receive.connection");
            intent.putExtra("connection", socketState);
            this.LIZLLL.LIZ(intent, null);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // X.C0WKE
    public final void LIZLLL(ServiceConnectEvent serviceConnectEvent) {
        try {
            Intent intent = new Intent();
            intent.setAction("com.bytedance.article.wschannel.receive.service");
            intent.putExtra("service", serviceConnectEvent);
            this.LIZLLL.LIZ(intent, null);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LJIIIIZZ(C0WK8 c0wk8) {
        boolean z;
        byte[] bArr = c0wk8.LIZIZ;
        if (bArr == null && c0wk8.LIZLLL == null) {
            return;
        }
        WsChannelMsg wsChannelMsgLIZ = c0wk8.LIZLLL;
        if (wsChannelMsgLIZ != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            try {
                Logger.debug();
                wsChannelMsgLIZ = C1498300p5o.LIZ(bArr);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return;
            }
        }
        if (wsChannelMsgLIZ != WsChannelMsg.EMPTY) {
            int i = C821340WJw.LIZ;
            wsChannelMsgLIZ.newMsgTimeHolder = new NewMsgTimeHolder(c0wk8.LIZJ, 0L, 0L);
            wsChannelMsgLIZ.channelId = c0wk8.LIZ;
            wsChannelMsgLIZ.replayToComponentName = new ComponentName(this.LIZ, (Class<?>) WsChannelService.class);
            Logger.debug();
            Map<Integer, IWsApp> map = this.LIZIZ.LIZ;
            if (map != null && ((ConcurrentHashMap) map).size() > 0) {
                Iterator it2 = ((ConcurrentHashMap) this.LIZIZ.LIZ).entrySet().iterator();
                while (it2.hasNext()) {
                    IWsApp iWsApp = (IWsApp) ((Map.Entry) it2.next()).getValue();
                    if (iWsApp != null && iWsApp.getChannelId() == wsChannelMsgLIZ.channelId) {
                        Intent intent = new Intent();
                        intent.setAction("com.bytedance.article.wschannel.receive.payload");
                        intent.putExtra("payload", wsChannelMsgLIZ);
                        if (Logger.debug()) {
                            intent.putExtra("msg_count", this.LJFF.addAndGet(1));
                        }
                        this.LIZLLL.LIZ(intent, null);
                    }
                }
            }
        }
    }

    public C0WK5(Context context, C0WK9 c0wk9) {
        C821290WJr c821290WJr = new C821290WJr();
        this.LIZJ = c821290WJr;
        this.LIZLLL = new C821220WJk(c821290WJr);
        this.LJFF = new AtomicInteger(0);
        this.LIZ = context;
        this.LIZIZ = c0wk9;
    }

    @Override // X.C0WKE
    public final void LJFF(int i, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        LJIIIIZZ(new C0WK8(i, bArr, 0L));
    }

    @Override // X.C0WKE
    public final void LJI(int i, WsChannelMsg wsChannelMsg) {
        if (wsChannelMsg == null) {
            return;
        }
        LJIIIIZZ(new C0WK8(i, wsChannelMsg, 0L));
    }

    @Override // X.C0WKE
    public final void LJII(WsChannelMsg wsChannelMsg, boolean z) {
        C821290WJr.LIZ(wsChannelMsg, z);
    }

    @Override // X.C0WKE
    public final void LIZIZ(IWsChannelClient iWsChannelClient, int i, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("channel_id", i);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZJ(SocketState.LIZ(jSONObject));
        if (C0WFY.LIZIZ(this.LIZ).LIZ.LIZ("enableAppStateChangeReport", false)) {
            C0WKC c0wkc = this.LJ;
            c0wkc.getClass();
            if (iWsChannelClient.isConnected()) {
                c0wkc.LL.post(new ARunnableS82S0200000_13(c0wkc, iWsChannelClient, 106));
            }
        }
    }
}
