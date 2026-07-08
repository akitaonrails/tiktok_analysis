package X;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.common.wschannel.channel.IWsChannelClient;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0WKP, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WKP {
    public final IWsChannelClient LIZ;
    public final C1498150p5Z LIZIZ;

    public C0WKP(Context context, C1498150p5Z c1498150p5Z, IWsChannelClient iWsChannelClient) {
        this.LIZIZ = c1498150p5Z;
        this.LIZ = iWsChannelClient;
    }

    public final void LIZ(String str, JSONObject jSONObject, String str2, int i) {
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("url", str, bundle);
        bundle.putInt("error_code", i);
        C786410Ut5.LJJJI("error_msg", str2, bundle);
        C786410Ut5.LJJJI("method", "onFailure", bundle);
        try {
            C809330Vox.LIZJ("WsChannelSdk_ok", bundle);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (this.LIZ != null) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("type", 0);
                jSONObject2.put("state", 2);
                jSONObject2.put("url", str);
                jSONObject2.put("channel_type", 2);
                jSONObject2.put("error", str2);
                jSONObject2.put("error_code", i);
                if (jSONObject != null) {
                    jSONObject2.put("extra_info", C786410Ut5.J3(jSONObject));
                }
                this.LIZ.onConnection(jSONObject2);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
