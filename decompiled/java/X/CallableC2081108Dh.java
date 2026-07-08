package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08Dh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class CallableC2081108Dh implements Callable {
    public final /* synthetic */ int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ Exception LLILLL;

    public /* synthetic */ CallableC2081108Dh(int i, boolean z, Exception exc) {
        this.LL = i;
        this.LLILLJJLI = z;
        this.LLILLL = exc;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String strLIZIZ;
        int i = this.LL;
        boolean z = this.LLILLJJLI;
        Exception exc = this.LLILLL;
        C1C7U.LIZ("AwemeEmptyMonitorUtils@abd8.monitorFailed$1L");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("pageType", i);
            jSONObject.put("loadMore", z);
            jSONObject.put("errorMsg", exc instanceof C0XIR ? ((C0XIR) exc).getResponse() : exc.toString());
            jSONObject2.put("success", 0);
            jSONObject2.put("errorResponse", jSONObject);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C794240VDq.LIZJ("aweme_favorite_list_data_log", jSONObject2);
        StringBuilder sb = new StringBuilder("response:fail:");
        if (i == 0) {
            strLIZIZ = "aweme/v1/aweme/post";
        } else if (i == 1) {
            strLIZIZ = "aweme/v1/aweme/favorite";
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("urlTagByType/");
            sbLIZ.append(i);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        sb.append(strLIZIZ);
        String string = sb.toString();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJ(Boolean.valueOf(z), "loadMore");
        c2344009Gk.LJIIIIZZ("errorMsg", exc instanceof C0XIR ? ((C0XIR) exc).getResponse() : exc.toString());
        C2344809Gs.LIZLLL(4, string, c2344009Gk.LIZ.toString());
        C1C7U.LIZIZ("AwemeEmptyMonitorUtils@abd8.monitorFailed$1L");
        return null;
    }
}
