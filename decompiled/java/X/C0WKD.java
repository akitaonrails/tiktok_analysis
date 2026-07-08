package X;

import android.content.Context;
import android.os.Handler;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.wschannel.channel.IWsChannelClient;
import com.bytedance.common.wschannel.model.ServiceConnectEvent;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0WKD, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WKD implements IWsChannelClient {
    public final int LL;
    public final Handler LLILLJJLI;
    public List<String> LLILLL;
    public IWsChannelClient LLILZ;
    public final C0WKE LLILZIL;

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void destroy() {
        synchronized (this) {
            try {
                IWsChannelClient iWsChannelClient = this.LLILZ;
                if (iWsChannelClient != null) {
                    iWsChannelClient.destroy();
                    if (!(this.LLILZ instanceof C1498180p5c)) {
                        JSONObject jSONObject = new JSONObject();
                        List<String> list = this.LLILLL;
                        String str = (list == null || list.size() < 1) ? "" : this.LLILLL.get(0);
                        try {
                            jSONObject.put("type", 0);
                            jSONObject.put("state", 3);
                            jSONObject.put("url", str);
                            jSONObject.put("channel_type", 1);
                            C0WKE c0wke = this.LLILZIL;
                            if (c0wke != null) {
                                c0wke.LIZIZ(this, this.LL, jSONObject);
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.ClassNotFoundException {
        /*
            r2 = this;
            com.bytedance.common.wschannel.channel.IWsChannelClient r0 = r2.LLILZ
            if (r0 != 0) goto L45
            java.lang.String r1 = ""
            boolean r0 = X.C2093608Ic.LJ(r1)
            if (r0 != 0) goto L17
            java.lang.Class r0 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto L39
            goto L17
        L13:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L17:
            java.lang.String r0 = "org.chromium.wschannel.MySelfChannelImpl"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L20
            if (r0 != 0) goto L39
            goto L24
        L20:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L24:
            java.lang.String r0 = "com.b.c.ws.MySelfChannelImpl"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L31
            goto L39
        L2d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L31:
            java.lang.ClassNotFoundException r1 = new java.lang.ClassNotFoundException
            java.lang.String r0 = "plugin class not found"
            r1.<init>(r0)
            throw r1
        L39:
            java.lang.Object r1 = r0.newInstance()
            boolean r0 = r1 instanceof com.bytedance.common.wschannel.channel.IWsChannelClient
            if (r0 == 0) goto L45
            com.bytedance.common.wschannel.channel.IWsChannelClient r1 = (com.bytedance.common.wschannel.channel.IWsChannelClient) r1
            r2.LLILZ = r1
        L45:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0WKD.LIZ():void");
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final boolean isConnected() {
        IWsChannelClient iWsChannelClient = this.LLILZ;
        if (iWsChannelClient != null) {
            return iWsChannelClient.isConnected();
        }
        return false;
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final boolean privateProtocolEnabled() {
        IWsChannelClient iWsChannelClient = this.LLILZ;
        if (iWsChannelClient != null) {
            return iWsChannelClient.privateProtocolEnabled();
        }
        return false;
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final boolean privateProtocolProxyEnabled() {
        IWsChannelClient iWsChannelClient = this.LLILZ;
        if (iWsChannelClient != null) {
            return iWsChannelClient.privateProtocolProxyEnabled();
        }
        return false;
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void stopConnection() {
        IWsChannelClient iWsChannelClient = this.LLILZ;
        if (iWsChannelClient != null) {
            iWsChannelClient.stopConnection();
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void onAppStateChanged(int i) {
        IWsChannelClient iWsChannelClient = this.LLILZ;
        if (iWsChannelClient != null) {
            iWsChannelClient.onAppStateChanged(i);
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void onConnection(JSONObject jSONObject) {
        synchronized (this) {
            try {
                C0WKE c0wke = this.LLILZIL;
                if (c0wke != null) {
                    c0wke.LIZIZ(this, this.LL, jSONObject);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void onMessage(WsChannelMsg wsChannelMsg) {
        C0WKE c0wke = this.LLILZIL;
        if (c0wke != null) {
            c0wke.LJI(this.LL, wsChannelMsg);
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void onNetworkStateChanged(int i) {
        IWsChannelClient iWsChannelClient = this.LLILZ;
        if (iWsChannelClient != null) {
            iWsChannelClient.onNetworkStateChanged(i);
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void registerService(int i) {
        IWsChannelClient iWsChannelClient = this.LLILZ;
        if (iWsChannelClient != null) {
            iWsChannelClient.registerService(i);
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final boolean sendMessage(WsChannelMsg wsChannelMsg) {
        IWsChannelClient iWsChannelClient = this.LLILZ;
        if (iWsChannelClient != null) {
            return iWsChannelClient.sendMessage(wsChannelMsg);
        }
        return false;
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void unregisterService(int i) {
        IWsChannelClient iWsChannelClient = this.LLILZ;
        if (iWsChannelClient != null) {
            iWsChannelClient.unregisterService(i);
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void onMessage(byte[] bArr) {
        C0WKE c0wke = this.LLILZIL;
        if (c0wke != null) {
            c0wke.LJFF(this.LL, bArr);
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final boolean sendMessage(byte[] bArr) {
        IWsChannelClient iWsChannelClient = this.LLILZ;
        if (iWsChannelClient != null) {
            return iWsChannelClient.sendMessage(bArr);
        }
        return false;
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void onParameterChange(Map<String, Object> map, List<String> list) {
        IWsChannelClient iWsChannelClient = this.LLILZ;
        if (iWsChannelClient != null) {
            iWsChannelClient.onParameterChange(map, list);
        }
        this.LLILLL = list;
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void openConnection(Map<String, Object> map, List<String> list) {
        IWsChannelClient iWsChannelClient = this.LLILZ;
        if (iWsChannelClient != null) {
            iWsChannelClient.openConnection(map, list);
        }
        this.LLILLL = list;
    }

    public C0WKD(int i, C0WKE c0wke, WeakHandler weakHandler) {
        this.LL = i;
        this.LLILZIL = c0wke;
        this.LLILLJJLI = weakHandler;
        try {
            LIZ();
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (this.LLILZ == null) {
            this.LLILZ = new C1498180p5c(weakHandler, i);
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void init(Context context, IWsChannelClient iWsChannelClient, String str) {
        IWsChannelClient iWsChannelClient2 = this.LLILZ;
        if (iWsChannelClient2 != null) {
            try {
                iWsChannelClient2.init(context, iWsChannelClient, str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (!(this.LLILZ instanceof C1498180p5c)) {
                    C1498180p5c c1498180p5c = new C1498180p5c(this.LLILLJJLI, this.LL);
                    this.LLILZ = c1498180p5c;
                    c1498180p5c.init(context, iWsChannelClient, str);
                    return;
                }
                throw th;
            }
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void onServiceConnectEvent(int i, boolean z, String str) {
        C0WKE c0wke = this.LLILZIL;
        if (c0wke != null) {
            c0wke.LIZLLL(new ServiceConnectEvent(this.LL, i, str, z));
        }
    }
}
