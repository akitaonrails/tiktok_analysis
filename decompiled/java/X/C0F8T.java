package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0F8T, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F8T extends AbstractC572830MdN<JSONArray> {
    public final /* synthetic */ JSONArray LLILLJJLI;
    public final /* synthetic */ JSONObject LLILLL;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC572830MdN
    public final JSONArray LIZ(String str) {
        JSONArray jSONArray;
        try {
            JSONArray jSONArray2 = JSONObjectProtectorUtils.getJSONArray(this.LLILLL, str);
            C189200o6.m2constructorimpl(jSONArray2);
            jSONArray = jSONArray2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            jSONArray = c098200Yq;
        }
        JSONArray jSONArray3 = this.LLILLJJLI;
        if (C189200o6.m7isFailureimpl(jSONArray)) {
            return jSONArray3;
        }
        return jSONArray;
    }

    public C0F8T(JSONArray jSONArray, JSONObject jSONObject) {
        this.LLILLJJLI = jSONArray;
        this.LLILLL = jSONObject;
    }

    @Override // X.AbstractC572830MdN
    public final void LIZIZ(Object obj, String str) throws JSONException {
        if (obj == null) {
            this.LLILLL.remove(str);
        } else {
            this.LLILLL.put(str, obj);
        }
    }
}
