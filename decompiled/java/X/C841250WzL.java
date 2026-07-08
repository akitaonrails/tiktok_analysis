package X;

import android.os.SystemClock;
import com.bytedance.helios.network.NetworkInvoker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.net.HttpURLConnection;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0WzL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C841250WzL {
    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZIZ(HttpURLConnection httpURLConnection, String str) {
        C0WZW c0wzw;
        InterfaceC841570Wzr interfaceC841570Wzr;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        NetworkInvoker.Companion.getClass();
        NetworkInvoker networkInvoker = NetworkInvoker.networkInvoker;
        if (!(httpURLConnection instanceof InterfaceC841570Wzr) || (interfaceC841570Wzr = (InterfaceC841570Wzr) httpURLConnection) == null || (c0wzw = interfaceC841570Wzr.getExtraInfo()) == null) {
            c0wzw = new C0WZW(str, 0);
        }
        Object obj = networkInvoker.preInvoke(400001, "java.net.HttpURLConnection", "onConnect", httpURLConnection, null, "void", c0wzw).LIZIZ;
        if (obj instanceof C840660WyO) {
            if (httpURLConnection instanceof C842170X1z) {
                C842170X1z c842170X1z = (C842170X1z) httpURLConnection;
                c842170X1z.LJII = (C840660WyO) obj;
                c842170X1z.LJIIJ += SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos;
            } else {
                if (!(httpURLConnection instanceof C0X20)) {
                    return;
                }
                C0X20 c0x20 = (C0X20) httpURLConnection;
                c0x20.LJII = (C840660WyO) obj;
                c0x20.LJIIJ += SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(HttpURLConnection httpURLConnection, byte[] bArr, C840660WyO c840660WyO, String str) {
        C0WZW c0wzw;
        InterfaceC841570Wzr interfaceC841570Wzr;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        NetworkInvoker.Companion.getClass();
        NetworkInvoker networkInvoker = NetworkInvoker.networkInvoker;
        Object[] objArr = {bArr, c840660WyO};
        if (!(httpURLConnection instanceof InterfaceC841570Wzr) || (interfaceC841570Wzr = (InterfaceC841570Wzr) httpURLConnection) == null || (c0wzw = interfaceC841570Wzr.getExtraInfo()) == null) {
            c0wzw = new C0WZW(str, 0);
        }
        networkInvoker.postInvoke(400001, "java.net.HttpURLConnection", "onConnect", httpURLConnection, objArr, null, c0wzw, true);
        C238400w2 c238400w2 = new C238400w2();
        if (httpURLConnection instanceof C842170X1z) {
            C842170X1z c842170X1z = (C842170X1z) httpURLConnection;
            long jElapsedRealtimeNanos2 = c842170X1z.LJIIJ + (SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos);
            c842170X1z.LJIIJ = jElapsedRealtimeNanos2;
            c238400w2.element = jElapsedRealtimeNanos2;
        } else if (httpURLConnection instanceof C0X20) {
            C0X20 c0x20 = (C0X20) httpURLConnection;
            long jElapsedRealtimeNanos3 = c0x20.LJIIJ + (SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos);
            c0x20.LJIIJ = jElapsedRealtimeNanos3;
            c238400w2.element = jElapsedRealtimeNanos3;
        }
        C841400Wza.LIZ(c238400w2.element / ((long) LSPassThroughRecordSizeConfig.DEFAULT), "UrlConnection_onConnect");
        networkInvoker.statisticsApiCost(400001, c238400w2.element / ((long) 1000000));
        CopyOnWriteArrayList<C0WSX> copyOnWriteArrayList = C0WSW.LIZ;
        C0WSW.LIZ("Helios:Network-Cost", new C841260WzM(c238400w2, c840660WyO), 2, null);
    }
}
