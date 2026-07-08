package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VCF, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VCF extends C0VCW {
    public final String LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final String LJ;
    public final String LJI;
    public final int LJII;
    public final String LJFF = null;
    public final JSONObject LJIIIIZZ = null;

    public final JSONObject LIZIZ(C0VCI c0vci) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("log_type", this.LIZIZ);
            jSONObject.put("duration", this.LIZJ);
            if (!TextUtils.isEmpty(this.LJ)) {
                jSONObject.put("uri", UriProtector.parse(this.LJ));
            }
            long j = this.LIZLLL;
            if (j > 0) {
                jSONObject.put("timestamp", j);
            }
            jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, this.LJII);
            if (!TextUtils.isEmpty(this.LJFF)) {
                jSONObject.put("ip", this.LJFF);
            }
            if (!TextUtils.isEmpty(this.LJI)) {
                jSONObject.put("trace_code", this.LJI);
            } else {
                jSONObject.put("trace_code", "");
            }
            if (c0vci != null) {
                c0vci.LIZ(this.LIZIZ, jSONObject);
            }
            JSONObject jSONObject2 = this.LJIIIIZZ;
            if (jSONObject2 != null && jSONObject2.length() > 0) {
                try {
                    Iterator<String> itKeys = jSONObject2.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObject.put(next, jSONObject2.get(next));
                    }
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            if (TextUtils.equals(this.LIZIZ, "api_all")) {
                jSONObject.put("hit_rules", 1);
            }
            LIZ(jSONObject);
            return jSONObject;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        }
    }

    public C0VCF(String str, long j, long j2, String str2, String str3, int i) {
        this.LIZIZ = str;
        this.LIZJ = j;
        this.LIZLLL = j2;
        this.LJ = str2;
        this.LJI = str3;
        this.LJII = i;
    }
}
