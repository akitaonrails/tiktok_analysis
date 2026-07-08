package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0F8R, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F8R extends AbstractC572830MdN<Boolean> {
    public final /* synthetic */ Boolean LLILLJJLI;
    public final /* synthetic */ JSONObject LLILLL;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC572830MdN
    public final Boolean LIZ(String str) {
        Boolean bool;
        try {
            Boolean boolValueOf = Boolean.valueOf(JSONObjectProtectorUtils.getBoolean(this.LLILLL, str));
            C189200o6.m2constructorimpl(boolValueOf);
            bool = boolValueOf;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            bool = c098200Yq;
        }
        Boolean bool2 = this.LLILLJJLI;
        if (C189200o6.m7isFailureimpl(bool)) {
            return bool2;
        }
        return bool;
    }

    public C0F8R(Boolean bool, JSONObject jSONObject) {
        this.LLILLJJLI = bool;
        this.LLILLL = jSONObject;
    }

    @Override // X.AbstractC572830MdN
    public final void LIZIZ(Object obj, String str) throws JSONException {
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            this.LLILLL.remove(str);
        } else {
            this.LLILLL.put(str, bool.booleanValue());
        }
    }
}
