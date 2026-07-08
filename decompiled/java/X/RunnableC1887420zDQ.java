package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0zDQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class RunnableC1887420zDQ implements Runnable {
    public static final RunnableC1887420zDQ LL = new RunnableC1887420zDQ();

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("LiveCenterMainView@9a36.sendJSPauseEvent$1");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("visibility", CardStruct.IStatusCode.DEFAULT);
            C389001fE.LIZ("realtime_live_center_status", jSONObject, System.currentTimeMillis(), false);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveCenterMainView@9a36.sendJSPauseEvent$1");
    }
}
