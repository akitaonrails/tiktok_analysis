package X;

import Y.ARunnableS120S0100000_20;
import android.os.Handler;
import com.ss.ttlivestreamer.core.utils.SafeHandlerThread;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0j8S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1269300j8S implements InterfaceC1272840jEA {
    public static final /* synthetic */ int LLILZ = 0;
    public InterfaceC1266880j4Y LL;
    public SafeHandlerThread LLILLJJLI;
    public Handler LLILLL;

    @Override // X.InterfaceC1272840jEA
    public final void onRelease() {
        this.LL = null;
        SafeHandlerThread safeHandlerThread = this.LLILLJJLI;
        Handler handler = this.LLILLL;
        if (handler != null) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS120S0100000_20(safeHandlerThread, 295));
        }
        this.LLILLL = null;
        this.LLILLJJLI = null;
    }

    public final void LIZIZ(JSONObject jSONObject) {
        InterfaceC1266880j4Y interfaceC1266880j4Y = this.LL;
        if (interfaceC1266880j4Y != null) {
            interfaceC1266880j4Y.LIZ(jSONObject);
        }
    }

    public C1269300j8S(InterfaceC1266880j4Y interfaceC1266880j4Y, C1271010jBD c1271010jBD) {
        Handler handler;
        this.LL = interfaceC1266880j4Y;
        SafeHandlerThread safeHandlerThreadLIZIZ = C1273730jFb.LIZIZ(19, "LiveCoreLogUploadThread");
        this.LLILLJJLI = safeHandlerThreadLIZIZ;
        safeHandlerThreadLIZIZ.start();
        SafeHandlerThread safeHandlerThread = this.LLILLJJLI;
        if (safeHandlerThread != null) {
            handler = safeHandlerThread.getHandler();
        } else {
            handler = null;
        }
        this.LLILLL = handler;
    }

    public final void LIZ(String str, String str2, String str3, String str4) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event_key", str);
        jSONObject.put("api", str2);
        jSONObject.put("value", str3);
        jSONObject.put("message", str4);
        InterfaceC1266880j4Y interfaceC1266880j4Y = this.LL;
        if (interfaceC1266880j4Y != null) {
            interfaceC1266880j4Y.LIZ(jSONObject);
        }
    }
}
