package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.08Fr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC2087308Fr implements Runnable {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ long LLILLJJLI;

    public RunnableC2087308Fr(boolean z, long j) {
        this.LL = z;
        this.LLILLJJLI = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("MemoryPageStayMonitor@5b8a.reportPageMemoryCost$1");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("start", this.LL);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put("cost", this.LLILLJJLI);
            C793770VBv.LJII("app_page_memory", jSONObject, jSONObject2, null);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MemoryPageStayMonitor@5b8a.reportPageMemoryCost$1");
    }
}
