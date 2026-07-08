package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0UzG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C790240UzG implements InterfaceC792320V6g {
    public final String LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final int LJI;
    public final JSONObject LJII;

    @Override // X.InterfaceC792320V6g
    public final boolean LIZIZ() {
        return true;
    }

    @Override // X.InterfaceC792320V6g
    public final boolean LIZJ(JSONObject jSONObject) {
        return false;
    }

    @Override // X.InterfaceC792320V6g
    public final String LIZLLL() {
        return null;
    }

    @Override // X.InterfaceC792320V6g
    public final String LJ() {
        return null;
    }

    @Override // X.InterfaceC792320V6g
    public final JSONObject LIZ() {
        if (TextUtils.isEmpty(this.LIZ)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("log_type", this.LIZ);
            jSONObject.put("duration", this.LIZIZ);
            jSONObject.put("uri", UriProtector.parse(this.LIZLLL));
            long j = this.LIZJ;
            if (j > 0) {
                jSONObject.put("timestamp", j);
            }
            jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, this.LJI);
            if (!TextUtils.isEmpty(this.LJ)) {
                jSONObject.put("ip", this.LJ);
            }
            if (TextUtils.isEmpty(this.LJFF)) {
                jSONObject.put("trace_code", "");
                return jSONObject;
            }
            jSONObject.put("trace_code", this.LJFF);
            return jSONObject;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public C790240UzG(String str, long j, long j2, String str2, String str3, String str4, int i, JSONObject jSONObject) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = str4;
        this.LJI = i;
        if (jSONObject == null) {
            this.LJII = new JSONObject();
        } else {
            this.LJII = jSONObject;
        }
    }
}
