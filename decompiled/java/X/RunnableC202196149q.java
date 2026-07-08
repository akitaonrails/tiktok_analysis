package X;

import android.app.Activity;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tts.oecverify.BdTuring;
import com.tts.oecverify.BdTuringCallback;
import com.tts.oecverify.BdTuringConfig;
import java.util.Map;
import kotlin.text.Charsets;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.149q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class RunnableC202196149q implements Runnable {
    public final /* synthetic */ BdTuringConfig LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Map LLILLL;
    public final /* synthetic */ JSONObject LLILZ;
    public final /* synthetic */ BdTuringCallback LLILZIL;
    public final /* synthetic */ Activity LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ int LLIZLLLIL;
    public final /* synthetic */ int LLJ;
    public final /* synthetic */ int LLJI;
    public final /* synthetic */ int LLJIJIL;

    public final void LIZ() {
        try {
            JSONObject jSONObject = new JSONObject(new String(this.LL.getHttpClient().post(this.LLILLJJLI, this.LLILLL, C786410Ut5.J3(this.LLILZ).getBytes()), Charsets.UTF_8));
            int iOptInt = jSONObject.optInt("code", -1);
            String strOptString = jSONObject.optJSONObject("data").optString("decision");
            if (iOptInt != 0) {
                this.LLILZIL.onFail(iOptInt, jSONObject);
            } else if ("PASS".equals(strOptString)) {
                this.LLILZIL.onSuccess(0, jSONObject);
            } else {
                BdTuring.getInstance().showVerifyDialog(this.LLILZLL, new C149J(strOptString), new BdTuringCallback() { // from class: X.149v
                    @Override // com.tts.oecverify.BdTuringCallback
                    public final void onFail(int i, JSONObject jSONObject2) {
                        this.LIZ.LLILZIL.onFail(i, jSONObject2);
                    }

                    @Override // com.tts.oecverify.BdTuringCallback
                    public final void onSuccess(int i, JSONObject jSONObject2) {
                        RunnableC202196149q runnableC202196149q = this.LIZ;
                        C202197149r.LIZ(runnableC202196149q.LLILLJJLI, runnableC202196149q.LLILZLL, runnableC202196149q.LLIZ, runnableC202196149q.LLIZLLLIL, runnableC202196149q.LLJ, runnableC202196149q.LLJI, runnableC202196149q.LLJIJIL, runnableC202196149q.LLILZIL);
                    }
                });
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLILZIL.onFail(3, null);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("SmsUtils@6898.sendCode$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SmsUtils@6898.sendCode$1");
    }

    public RunnableC202196149q(BdTuringConfig bdTuringConfig, String str, Map map, JSONObject jSONObject, BdTuringCallback bdTuringCallback, Activity activity, String str2, int i, int i2, int i3, int i4) {
        this.LL = bdTuringConfig;
        this.LLILLJJLI = str;
        this.LLILLL = map;
        this.LLILZ = jSONObject;
        this.LLILZIL = bdTuringCallback;
        this.LLILZLL = activity;
        this.LLIZ = str2;
        this.LLIZLLLIL = i;
        this.LLJ = i2;
        this.LLJI = i3;
        this.LLJIJIL = i4;
    }
}
