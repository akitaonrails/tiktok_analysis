package X;

import Y.ARunnableS123S0100000_23;
import Y.ARunnableS56S0300000_23;
import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider;
import com.bytedance.common.wschannel.channel.IWsChannelClient;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0p5c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1498180p5c implements IWsChannelClient, WeakHandler.IHandler {
    public final int LL;
    public Context LLILLJJLI;
    public C1498150p5Z LLILLL;
    public boolean LLILZ;
    public final Map<String, Object> LLILZIL = new HashMap();
    public List<String> LLILZLL;
    public final C1498200p5e LLIZ;

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void onConnection(JSONObject jSONObject) {
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void onMessage(WsChannelMsg wsChannelMsg) {
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void onMessage(byte[] bArr) {
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void onServiceConnectEvent(int i, boolean z, String str) {
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final boolean privateProtocolEnabled() {
        return false;
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final boolean privateProtocolProxyEnabled() {
        return false;
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void registerService(int i) {
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final boolean sendMessage(WsChannelMsg wsChannelMsg) {
        return false;
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void unregisterService(int i) {
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void destroy() {
        C1498150p5Z c1498150p5Z = this.LLILLL;
        c1498150p5Z.LLJ.removeMessages(2);
        c1498150p5Z.LLJ.removeMessages(1);
        c1498150p5Z.LLJ.removeMessages(3);
        c1498150p5Z.LLJ.removeMessages(5);
        c1498150p5Z.LJII(new ARunnableS123S0100000_23(c1498150p5Z, 139));
        try {
            Context context = this.LLILLJJLI;
            if (context != null) {
                context.getContentResolver().unregisterContentObserver(this.LLIZ);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final boolean isConnected() {
        int i;
        C1498150p5Z c1498150p5Z = this.LLILLL;
        synchronized (c1498150p5Z) {
            i = c1498150p5Z.LLILZIL;
        }
        return i == 4;
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void stopConnection() {
        C1498150p5Z c1498150p5Z = this.LLILLL;
        c1498150p5Z.getClass();
        c1498150p5Z.LJII(new ARunnableS123S0100000_23(c1498150p5Z, 138));
    }

    public static boolean LIZ(Context context) {
        return C0WFY.LIZIZ(context).LIZ.LIZ("key_ok_impl_enable", true);
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void onAppStateChanged(int i) {
        if (!LIZ(this.LLILLJJLI)) {
            return;
        }
        C1498150p5Z c1498150p5Z = this.LLILLL;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        c1498150p5Z.LLJ.obtainMessage(5, Boolean.valueOf(z)).sendToTarget();
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void onNetworkStateChanged(int i) {
        if (!LIZ(this.LLILLJJLI)) {
            return;
        }
        this.LLILLL.LLJ.obtainMessage(3, Integer.valueOf(i)).sendToTarget();
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final boolean sendMessage(byte[] bArr) {
        if (!LIZ(this.LLILLJJLI)) {
            return false;
        }
        return this.LLILLL.LJIIIIZZ(bArr);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0p5e] */
    public C1498180p5c(final Handler handler, int i) {
        this.LL = i;
        this.LLIZ = new ContentObserver(handler) { // from class: X.0p5e
            @Override // android.database.ContentObserver
            public final void onChange(boolean z) {
                super.onChange(z);
                if (C1498180p5c.LIZ(this.LIZ.LLILLJJLI)) {
                    C1498180p5c c1498180p5c = this.LIZ;
                    c1498180p5c.openConnection(c1498180p5c.LLILZIL, c1498180p5c.LLILZLL);
                } else {
                    this.LIZ.stopConnection();
                }
            }
        };
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void onParameterChange(Map<String, Object> map, List<String> list) {
        if (map != null) {
            ((HashMap) this.LLILZIL).putAll(map);
        }
        this.LLILZLL = list;
        if (!LIZ(this.LLILLJJLI)) {
            return;
        }
        C1498150p5Z c1498150p5Z = this.LLILLL;
        c1498150p5Z.getClass();
        if (!list.isEmpty()) {
            c1498150p5Z.LJII(new ARunnableS56S0300000_23(c1498150p5Z, map, list, 18));
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void openConnection(Map<String, Object> map, List<String> list) {
        if (map != null) {
            ((HashMap) this.LLILZIL).putAll(map);
        }
        this.LLILZLL = list;
        if (!LIZ(this.LLILLJJLI)) {
            return;
        }
        C1498150p5Z c1498150p5Z = this.LLILLL;
        c1498150p5Z.getClass();
        if (!list.isEmpty()) {
            c1498150p5Z.LJII(new ARunnableS56S0300000_23(c1498150p5Z, map, list, 17));
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void init(Context context, IWsChannelClient iWsChannelClient, String str) {
        if (this.LLILZ) {
            return;
        }
        this.LLILZ = true;
        this.LLILLJJLI = C786410Ut5.N3(context);
        System.currentTimeMillis();
        try {
            Class<?> cls = Class.forName("com.bytedance.mobsec.metasec.ov.MSB");
            if (cls != null) {
                try {
                    cls.getMethod("a", Context.class, Integer.TYPE, Map.class).invoke(cls, context, 2, null);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                System.currentTimeMillis();
            }
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1498220p5g c1498220p5g = new C1498220p5g(context);
        c1498220p5g.LIZ = new C1471720oOw(context);
        AbstractC1498210p5f abstractC1498210p5f = (AbstractC1498210p5f) ((ConcurrentHashMap) C820150WFh.LJ).get(Integer.valueOf(this.LL));
        if (abstractC1498210p5f != null) {
            c1498220p5g.LIZIZ = abstractC1498210p5f;
        }
        C1498150p5Z c1498150p5Z = new C1498150p5Z(new C1498170p5b(context, c1498220p5g.LIZ, c1498220p5g.LIZIZ));
        this.LLILLL = c1498150p5Z;
        c1498150p5Z.LLJIJIL = new C0WKP(this.LLILLJJLI, c1498150p5Z, iWsChannelClient);
        try {
            context.getContentResolver().registerContentObserver(WsChannelMultiProcessSharedProvider.LIZ(context, "key_ok_impl_enable", "boolean"), true, this.LLIZ);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }
}
