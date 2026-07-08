package X;

import com.bytedance.android.livesdkapi.host.IHostPerformanceMonitor;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0gO7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1163690gO7 implements InterfaceC1292250jjT {
    public static final C1163690gO7 LIZ = new C1163690gO7();

    @Override // X.InterfaceC1292250jjT
    public final String name() {
        return "appInfo";
    }

    @Override // X.InterfaceC1292250jjT
    public final JSONObject LIZ() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        IHostPerformanceMonitor iHostPerformanceMonitor = (IHostPerformanceMonitor) C1161920gLG.LIZJ(IHostPerformanceMonitor.class);
        jSONObject.put("appversion", iHostPerformanceMonitor.getAppVersion());
        jSONObject.put("appchannel", iHostPerformanceMonitor.OL0());
        return jSONObject;
    }
}
