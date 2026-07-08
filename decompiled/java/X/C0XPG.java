package X;

import com.ss.android.ugc.aweme.performanceopt.api.ITrafficMonitorApi;
import com.ss.android.ugc.aweme.traffic.TrafficMonitorService;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XPG, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XPG implements ITrafficMonitorApi {
    public static final C0XPG LIZIZ = new C0XPG();
    public final /* synthetic */ ITrafficMonitorApi LIZ = TrafficMonitorService.LIZJ();

    @Override // com.ss.android.ugc.aweme.performanceopt.api.ITrafficMonitorApi
    public final void LIZ(long j, String str) {
        this.LIZ.LIZ(j, str);
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.ITrafficMonitorApi
    public final void LIZIZ(String str, JSONObject jSONObject) {
        this.LIZ.LIZIZ(str, jSONObject);
    }
}
