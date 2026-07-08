package X;

import Y.ARunnableS82S0200000_13;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.wschannel.app.IWsApp;
import com.bytedance.common.wschannel.channel.IWsChannelClient;
import com.bytedance.common.wschannel.model.SocketState;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.common.wschannel.server.WsChannelService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: X.0WKC, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WKC implements WeakHandler.IHandler, C0WK3 {
    public final WeakHandler LL;
    public final Context LLILLJJLI;
    public final C0WKF LLILZ;
    public final C0WKE LLILZIL;
    public final C0WK9 LLILZLL;
    public final C0WKG LLIZLLLIL;
    public final Object LLILLL = new Object();
    public final AtomicLong LLIZ = new AtomicLong(0);
    public boolean LLJ = false;

    public static final void LIZLLL(String str) {
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("param_name", str, bundle);
        try {
            C809330Vox.LIZJ("wschannel_param_null", bundle);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static WsChannelMsg LJI(WsChannelMsg wsChannelMsg) {
        InterfaceC2110008Ok interfaceC2110008Ok = C0WFY.LIZJ;
        if (interfaceC2110008Ok == null) {
            return wsChannelMsg;
        }
        try {
            for (Map.Entry entry : ((HashMap) interfaceC2110008Ok.LIZIZ(wsChannelMsg.LIZIZ())).entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                WsChannelMsg.MsgHeader msgHeader = new WsChannelMsg.MsgHeader();
                msgHeader.key = str;
                msgHeader.value = str2;
                wsChannelMsg.msgHeaders.add(msgHeader);
            }
            return wsChannelMsg;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return wsChannelMsg;
        }
    }

    public final void LIZ(IWsApp iWsApp) {
        int channelId;
        Logger.debug();
        if (iWsApp == null) {
            channelId = Integer.MIN_VALUE;
        } else {
            channelId = iWsApp.getChannelId();
        }
        if (this.LLIZLLLIL.isEnable()) {
            try {
                IWsChannelClient iWsChannelClient = (IWsChannelClient) ((ConcurrentHashMap) this.LLILZLL.LIZIZ).get(Integer.valueOf(iWsApp.getChannelId()));
                synchronized (WsChannelService.class) {
                    try {
                        IWsApp iWsApp2 = (IWsApp) ((ConcurrentHashMap) this.LLILZLL.LIZ).get(Integer.valueOf(channelId));
                        if (iWsChannelClient == null || (iWsApp.equals(iWsApp2) && iWsChannelClient.isConnected())) {
                            return;
                        }
                        ((ConcurrentHashMap) this.LLILZLL.LIZ).put(Integer.valueOf(channelId), iWsApp);
                        this.LLILZ.LIZ(this.LLILZLL.LIZ);
                        iWsChannelClient.onParameterChange(LIZJ(iWsApp), iWsApp.ZL());
                    } finally {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            } catch (Throwable th) {
            }
        }
    }

    public final void LIZIZ(IWsApp iWsApp) {
        int channelId;
        boolean z;
        boolean z2;
        if (iWsApp == null) {
            channelId = Integer.MIN_VALUE;
        } else {
            channelId = iWsApp.getChannelId();
        }
        if (!this.LLIZLLLIL.isEnable()) {
            return;
        }
        synchronized (WsChannelService.class) {
            try {
                IWsApp iWsApp2 = (IWsApp) ((ConcurrentHashMap) this.LLILZLL.LIZ).get(Integer.valueOf(channelId));
                IWsChannelClient iWsChannelClient = (IWsChannelClient) ((ConcurrentHashMap) this.LLILZLL.LIZIZ).get(Integer.valueOf(channelId));
                z = false;
                z2 = true;
                if (iWsApp2 != null) {
                    if (iWsApp.equals(iWsApp2)) {
                        if (iWsChannelClient != null) {
                            z2 = false;
                        }
                    }
                } else {
                    ((ConcurrentHashMap) this.LLILZLL.LIZ).put(Integer.valueOf(channelId), iWsApp);
                    this.LLILZ.LIZ(this.LLILZLL.LIZ);
                }
                z2 = false;
                z = true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (z) {
            LJIIIIZZ(iWsApp);
        } else {
            if (!z2) {
                return;
            }
            LIZ(iWsApp);
        }
    }

    public final Map<String, Object> LIZJ(IWsApp iWsApp) {
        String str;
        HashMap map = new HashMap();
        map.put("app_key", iWsApp.getAppKey());
        map.put("fpid", Integer.valueOf(iWsApp.pf()));
        map.put("sdk_version", 2);
        map.put("platform", 0);
        map.put("app_version", Integer.valueOf(iWsApp.getAppVersion()));
        map.put("aid", Integer.valueOf(iWsApp.getAppId()));
        map.put("device_id", iWsApp.getDeviceId());
        map.put("iid", iWsApp.getInstallId());
        map.put("custom_headers", iWsApp.getHeaders());
        String extra = iWsApp.getExtra();
        if (extra == null) {
            LIZLLL("extra");
            extra = "";
        }
        if (C0WFY.LIZIZ(this.LLILLJJLI).LIZ.LIZ("enableAppStateChangeReport", false)) {
            String[] strArrSplit = extra.split("&");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("is_background=");
            if (this.LLJ) {
                str = CardStruct.IStatusCode.DEFAULT;
            } else {
                str = "1";
            }
            sbLIZ.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (strArrSplit.length > 0 && !TextUtils.isEmpty(strArrSplit[0])) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(extra);
                sbLIZ2.append("&");
                sbLIZ2.append(strLIZIZ);
                extra = C2188811AlT.LIZIZ(sbLIZ2);
            } else {
                extra = strLIZIZ;
            }
        }
        map.put("extra", extra);
        if (iWsApp.getDeviceId() == null) {
            LIZLLL("device_id");
        }
        if (iWsApp.getInstallId() == null) {
            LIZLLL("install_id");
        }
        if (C2093608Ic.LJ(iWsApp.getAppKey())) {
            LIZLLL("app_key");
        }
        map.put("private_protocol_enable", Boolean.valueOf(iWsApp.lq()));
        if (iWsApp.TJ() != null) {
            map.put("service_id_list", iWsApp.TJ());
        }
        if (!TextUtils.isEmpty(iWsApp.sK())) {
            map.put("private_protocol_url", iWsApp.sK());
        }
        map.put("transport_mode", Integer.valueOf(iWsApp.uM()));
        map.put("disable_fallback_websocket", Boolean.valueOf(iWsApp.oh()));
        return map;
    }

    public final void LJ(boolean z) {
        if (z) {
            LJII(this.LLILZ.LIZIZ());
            return;
        }
        try {
            synchronized (this.LLILLL) {
                try {
                    Iterator it2 = ((ConcurrentHashMap) this.LLILZLL.LIZIZ).entrySet().iterator();
                    while (it2.hasNext()) {
                        IWsChannelClient iWsChannelClient = (IWsChannelClient) ((Map.Entry) it2.next()).getValue();
                        if (iWsChannelClient != null) {
                            iWsChannelClient.destroy();
                        }
                    }
                    ((ConcurrentHashMap) this.LLILZLL.LIZIZ).clear();
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            ((ConcurrentHashMap) this.LLILZLL.LIZ).clear();
        } catch (Throwable th) {
        }
    }

    public final void LJFF(IWsChannelClient iWsChannelClient) {
        String str;
        if (iWsChannelClient == null) {
            return;
        }
        C0WKM c0wkm = new C0WKM(Integer.MAX_VALUE);
        c0wkm.LJ = 4;
        c0wkm.LIZLLL = 9000;
        c0wkm.LIZJ = 1008601L;
        c0wkm.LJFF = new byte[0];
        c0wkm.LJII = "pb";
        c0wkm.LJI = "pb";
        if (this.LLJ) {
            str = CardStruct.IStatusCode.DEFAULT;
        } else {
            str = "1";
        }
        c0wkm.LIZ("IsBackground", str);
        WsChannelMsg wsChannelMsgLIZIZ = c0wkm.LIZIZ();
        if (iWsChannelClient.privateProtocolEnabled()) {
            iWsChannelClient.sendMessage(wsChannelMsgLIZIZ);
        } else {
            iWsChannelClient.sendMessage(C1498300p5o.LIZIZ(wsChannelMsgLIZIZ));
        }
    }

    public final void LJII(Map<Integer, IWsApp> map) {
        C0WFY c0wfyLIZIZ;
        Context context = this.LLILLJJLI;
        if ((context == null || (c0wfyLIZIZ = C0WFY.LIZIZ(context)) == null || !c0wfyLIZIZ.LIZ.LIZ("key_enable_offline_detect", false) || C806890Vl1.LIZJ(this.LLILLJJLI)) && this.LLIZLLLIL.isEnable() && map != null) {
            for (IWsApp iWsApp : map.values()) {
                if (iWsApp != null) {
                    LIZIZ(iWsApp);
                }
            }
        }
    }

    public final void LJIIIIZZ(IWsApp iWsApp) {
        IWsChannelClient c0wkd;
        Logger.debug();
        synchronized (this.LLILLL) {
            try {
                c0wkd = (IWsChannelClient) ((ConcurrentHashMap) this.LLILZLL.LIZIZ).get(Integer.valueOf(iWsApp.getChannelId()));
                if (c0wkd == null) {
                    c0wkd = new C0WKD(iWsApp.getChannelId(), this.LLILZIL, this.LL);
                    c0wkd.init(this.LLILLJJLI, c0wkd, iWsApp.sK());
                    ((ConcurrentHashMap) this.LLILZLL.LIZIZ).put(Integer.valueOf(iWsApp.getChannelId()), c0wkd);
                }
            } finally {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        if (c0wkd.isConnected()) {
            SocketState socketState = (SocketState) ((ConcurrentHashMap) this.LLILZLL.LIZJ).get(Integer.valueOf(iWsApp.getChannelId()));
            if (socketState != null) {
                try {
                    this.LLILZIL.LIZJ(socketState);
                    return;
                } catch (Throwable th) {
                    return;
                }
            }
            return;
        }
        try {
            Logger.debug();
            c0wkd.openConnection(LIZJ(iWsApp), iWsApp.ZL());
        } catch (Throwable th2) {
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        this.LL.post(new ARunnableS82S0200000_13(this, Message.obtain(message), 105));
    }

    public C0WKC(Context context, Looper looper, C0WKF c0wkf, C0WK9 c0wk9, C0WKE c0wke, C0WKG c0wkg) {
        this.LLILLJJLI = C786410Ut5.N3(context);
        WeakHandler weakHandler = new WeakHandler(looper, this);
        this.LL = weakHandler;
        this.LLILZ = c0wkf;
        this.LLILZLL = c0wk9;
        this.LLILZIL = c0wke;
        this.LLIZLLLIL = c0wkg;
        c0wkg.LIZIZ(this);
        weakHandler.post(new ARunnableS82S0200000_13(this, c0wkg, 104));
    }
}
