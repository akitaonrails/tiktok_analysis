package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0c9w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C1001140c9w {
    public AwemeRawAd LIZ;
    public String LIZIZ;
    public boolean LIZJ;
    public JSONObject LIZLLL;
    public Map<String, String> LJ;

    public final JSONObject LIZ() {
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = this.LIZLLL;
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            jSONObject = jSONObject2;
            AwemeRawAd awemeRawAd = this.LIZ;
            if (awemeRawAd != null) {
                String logExtra = awemeRawAd.getLogExtra();
                if (!TextUtils.isEmpty(logExtra)) {
                    jSONObject.put("log_extra", logExtra);
                }
                jSONObject.put("is_ad_event", "1");
                C844470XAv.LIZ.getClass();
                String strC3 = C786410Ut5.c3(C844470XAv.LIZ());
                if (!C2093608Ic.LJ(strC3)) {
                    jSONObject.put("nt", strC3);
                }
            }
            if (this.LIZJ) {
                jSONObject.put("has_v3", "1");
            }
            Map<String, String> map = this.LJ;
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            }
            if (!TextUtils.isEmpty(this.LIZIZ)) {
                jSONObject.put("refer", this.LIZIZ);
                return jSONObject;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
        return jSONObject;
    }
}
