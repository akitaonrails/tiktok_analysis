package X;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.00nB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC183500nB implements Runnable {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ long LLILZLL;

    public RunnableC183500nB(String str, String str2, String str3, boolean z, long j, long j2) {
        this.LL = z;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = j;
        this.LLILZLL = j2;
    }

    public final void LIZ() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        boolean z = this.LL;
        String str = this.LLILLJJLI;
        String str2 = this.LLILLL;
        String str3 = this.LLILZ;
        jSONObject.put("enabled", z);
        jSONObject.put("cache_type", str);
        jSONObject.put("result", str2);
        if (str3 != null) {
            jSONObject.put("reason", str3);
        }
        JSONObject jSONObject2 = new JSONObject();
        long j = this.LLILZIL;
        long j2 = this.LLILZLL;
        jSONObject2.put("wait_cost", j);
        jSONObject2.put("persist_cost", j2);
        C185100nR.LIZIZ(C185100nR.LIZ, "cache_persist_status", jSONObject, jSONObject2, 8);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("SdkMonitorWrapper@f316.reportCachePersistStatus$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SdkMonitorWrapper@f316.reportCachePersistStatus$1");
    }
}
