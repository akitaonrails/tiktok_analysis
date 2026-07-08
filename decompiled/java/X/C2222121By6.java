package X;

import com.ss.ugc.live.sdk.message.interfaces.ILogger;
import com.ss.ugc.live.sdk.message.interfaces.IMonitor;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1By6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2222121By6 implements ILogger, IMonitor {
    public final ILogger LIZ;
    public final IMonitor LIZIZ;
    public final double LIZJ;
    public C2222081By2 LIZLLL;

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMonitor
    public final InterfaceC2222261ByK capacityTracker() {
        return this.LIZIZ.capacityTracker();
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.ILogger
    public final void log(String str, String str2) {
        this.LIZ.log(str, str2);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMonitor
    public final void monitor(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        this.LIZIZ.monitor(str, jSONObject, jSONObject2, jSONObject3);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMonitor
    public final void monitorLatency(String str, long j, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        this.LIZIZ.monitorLatency(str, j, jSONObject, jSONObject2, jSONObject3);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMonitor
    public final void monitorStatus(String str, int i, JSONObject jSONObject) {
        this.LIZIZ.monitorStatus(str, i, jSONObject);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.ILogger
    public final boolean supportDebugInfo() {
        return this.LIZ.supportDebugInfo();
    }

    public /* synthetic */ C2222121By6(ILogger iLogger, IMonitor iMonitor) {
        this(iLogger, iMonitor, 1.0d);
    }

    public C2222121By6(ILogger iLogger, IMonitor iMonitor, double d) {
        this.LIZ = iLogger;
        this.LIZIZ = iMonitor;
        this.LIZJ = d;
    }
}
