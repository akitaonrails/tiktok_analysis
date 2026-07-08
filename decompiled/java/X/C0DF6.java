package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0DF6, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DF6 {
    public final Context LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final Map<String, Object> LJFF;
    public final InterfaceC1034470d1h LJI;
    public final C1035880d3y LJII;

    public C0DF6() {
        throw null;
    }

    public final String toString() throws JSONException {
        Object c098200Yq;
        try {
            c098200Yq = new JSONObject(this.LJFF);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            c098200Yq = this.LJFF.toString();
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("jsonrpc", this.LIZJ);
        jSONObject.put("method", this.LIZLLL);
        jSONObject.put(FollowStatusChangeMethod.PARAM_UID, this.LJ);
        jSONObject.put("params", c098200Yq);
        return C786410Ut5.J3(jSONObject);
    }

    public C0DF6(Context context, String str, String str2, String str3, String str4, Map map, InterfaceC1034470d1h interfaceC1034470d1h, C1035880d3y c1035880d3y) {
        this.LIZ = context;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = map;
        this.LJI = interfaceC1034470d1h;
        this.LJII = c1035880d3y;
    }
}
