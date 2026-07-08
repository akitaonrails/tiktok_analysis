package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.00kS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC166600kS implements Runnable {
    public final /* synthetic */ String LL;
    public final /* synthetic */ JSONObject LLILLJJLI;

    public RunnableC166600kS(String str, JSONObject jSONObject) {
        this.LL = str;
        this.LLILLJJLI = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("FeedModifyMob@46ac.asyncReportEvent$1");
        try {
            C20684815ws.LJIJ(this.LL, this.LLILLJJLI);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FeedModifyMob@46ac.asyncReportEvent$1");
    }
}
