package X;

import Y.ARunnableS113S0100000_13;
import Y.ARunnableS82S0200000_13;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.app.IWsApp;
import com.bytedance.common.wschannel.channel.IWsChannelClient;
import com.bytedance.common.wschannel.client.WsClientService;
import com.bytedance.common.wschannel.model.NewMsgTimeHolder;
import com.bytedance.common.wschannel.model.ServiceConnectEvent;
import com.bytedance.common.wschannel.model.SocketState;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.common.wschannel.server.WsChannelService;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0WK6, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WK6 implements C0WKE {
    public static final AtomicBoolean LJIIIZ = new AtomicBoolean(true);
    public final Context LIZ;
    public final C0WK9 LIZIZ;
    public final C0WKI LIZJ;
    public C0WKC LJ;
    public Future<?> LJIIIIZZ;
    public final BlockingQueue<C0WK8> LJFF = new LinkedBlockingQueue();
    public final ExecutorService LJI = C786410Ut5.h4();
    public ARunnableS113S0100000_13 LJII = new ARunnableS113S0100000_13(this, 60);
    public final boolean LIZLLL = true;

    @Override // X.C0WKE
    public final void LIZ() {
        this.LIZJ.LIZ.LIZ();
    }

    @Override // X.C0WKE
    public final void LJ() {
        try {
            Intent intent = new Intent();
            intent.setAction("com.bytedance.article.wschannel.syncconnectstate");
            intent.setComponent(new ComponentName(this.LIZ, (Class<?>) WsClientService.class));
            intent.putParcelableArrayListExtra("connection", new ArrayList<>(((ConcurrentHashMap) this.LIZIZ.LIZJ).values()));
            LJIIJ(intent);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LJIIIZ() {
        if (this.LJII == null) {
            this.LJII = new ARunnableS113S0100000_13(this, 60);
        }
        try {
            this.LJIIIIZZ = this.LJI.submit(this.LJII);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // X.C0WKE
    public final void LIZJ(SocketState socketState) {
        ((ConcurrentHashMap) this.LIZIZ.LIZJ).put(Integer.valueOf(socketState.channelId), socketState);
        try {
            Intent intent = new Intent();
            intent.setAction("com.bytedance.article.wschannel.receive.connection");
            intent.setComponent(new ComponentName(this.LIZ, (Class<?>) WsClientService.class));
            intent.putExtra("connection", socketState);
            LJIIJ(intent);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // X.C0WKE
    public final void LIZLLL(ServiceConnectEvent serviceConnectEvent) {
        try {
            Intent intent = new Intent();
            intent.setAction("com.bytedance.article.wschannel.receive.service");
            intent.setComponent(new ComponentName(this.LIZ, (Class<?>) WsClientService.class));
            intent.putExtra("service", serviceConnectEvent);
            LJIIJ(intent);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LJIIIIZZ(C0WK8 c0wk8) {
        boolean z;
        long jElapsedRealtimeNanos;
        WsChannelMsg wsChannelMsgLIZ;
        if (c0wk8 == null) {
            return;
        }
        if (c0wk8.LIZIZ == null && c0wk8.LIZLLL == null) {
            return;
        }
        if (c0wk8.LIZLLL != null) {
            z = true;
        } else {
            z = false;
        }
        try {
            long jElapsedRealtimeNanos2 = 0;
            if (this.LIZLLL) {
                jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            } else {
                jElapsedRealtimeNanos = 0;
            }
            if (!z) {
                byte[] bArr = c0wk8.LIZIZ;
                Logger.debug();
                wsChannelMsgLIZ = C1498300p5o.LIZ(bArr);
            } else {
                wsChannelMsgLIZ = c0wk8.LIZLLL;
            }
            if (this.LIZLLL) {
                jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos();
            }
            if (wsChannelMsgLIZ != WsChannelMsg.EMPTY) {
                int i = C821340WJw.LIZ;
                wsChannelMsgLIZ.newMsgTimeHolder = new NewMsgTimeHolder(c0wk8.LIZJ, jElapsedRealtimeNanos, jElapsedRealtimeNanos2);
                wsChannelMsgLIZ.channelId = c0wk8.LIZ;
                wsChannelMsgLIZ.replayToComponentName = new ComponentName(this.LIZ, (Class<?>) WsChannelService.class);
                Logger.debug();
                Map<Integer, IWsApp> map = this.LIZIZ.LIZ;
                if (map != null && ((ConcurrentHashMap) map).size() > 0) {
                    Iterator it2 = ((ConcurrentHashMap) this.LIZIZ.LIZ).entrySet().iterator();
                    while (it2.hasNext()) {
                        IWsApp iWsApp = (IWsApp) ((Map.Entry) it2.next()).getValue();
                        if (iWsApp != null && iWsApp.getChannelId() == wsChannelMsgLIZ.channelId) {
                            try {
                                Intent intent = new Intent();
                                intent.setAction("com.bytedance.article.wschannel.receive.payload");
                                intent.setComponent(new ComponentName(this.LIZ, (Class<?>) WsClientService.class));
                                intent.putExtra("payload", wsChannelMsgLIZ);
                                LJIIJ(intent);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                            }
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    public final void LJIIJ(Intent intent) {
        C0WKI c0wki = this.LIZJ;
        c0wki.getClass();
        boolean zLJI = MethodIDManager.LJI(137893);
        c0wki.LIZ.LIZIZ(intent);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public C0WK6(Context context, C0WK9 c0wk9) {
        this.LIZ = context;
        this.LIZIZ = c0wk9;
        this.LIZJ = new C0WKI(context, WsClientService.class);
        LJIIIZ();
    }

    @Override // X.C0WKE
    public final void LJFF(int i, byte[] bArr) {
        long jElapsedRealtimeNanos;
        if (bArr == null) {
            return;
        }
        try {
            if (this.LIZLLL) {
                jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            } else {
                jElapsedRealtimeNanos = 0;
            }
            ((LinkedBlockingQueue) this.LJFF).offer(new C0WK8(i, bArr, jElapsedRealtimeNanos));
            LJIIIZ.getAndSet(true);
            LJIIIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // X.C0WKE
    public final void LJI(int i, WsChannelMsg wsChannelMsg) {
        long jElapsedRealtimeNanos;
        if (wsChannelMsg == null) {
            return;
        }
        try {
            if (this.LIZLLL) {
                jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            } else {
                jElapsedRealtimeNanos = 0;
            }
            ((LinkedBlockingQueue) this.LJFF).offer(new C0WK8(i, wsChannelMsg, jElapsedRealtimeNanos));
            LJIIIZ.getAndSet(true);
            LJIIIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // X.C0WKE
    public final void LJII(WsChannelMsg wsChannelMsg, boolean z) {
        ComponentName componentName = wsChannelMsg.replayToComponentName;
        if (componentName != null) {
            try {
                byte[] bArrLIZ = wsChannelMsg.LIZ();
                if (bArrLIZ == null) {
                    bArrLIZ = new byte[1];
                }
                Intent intent = new Intent();
                intent.setAction("com.bytedance.article.wschannel.send.payload");
                intent.setComponent(componentName);
                intent.putExtra("send_result", z);
                intent.putExtra("payload_md5", C08HM.LIZLLL(bArrLIZ));
                Logger.debug();
                C786410Ut5.s3(this.LIZ, intent);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
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
        Logger.debug();
    }
}
