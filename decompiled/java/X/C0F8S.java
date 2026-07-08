package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0F8S, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F8S extends AbstractC572830MdN<Integer> {
    public final /* synthetic */ Integer LLILLJJLI;
    public final /* synthetic */ JSONObject LLILLL;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC572830MdN
    public final Integer LIZ(String str) {
        Integer num;
        try {
            Integer numValueOf = Integer.valueOf(JSONObjectProtectorUtils.getInt(this.LLILLL, str));
            C189200o6.m2constructorimpl(numValueOf);
            num = numValueOf;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            num = c098200Yq;
        }
        Integer num2 = this.LLILLJJLI;
        if (C189200o6.m7isFailureimpl(num)) {
            return num2;
        }
        return num;
    }

    public C0F8S(JSONObject jSONObject, Integer num) {
        this.LLILLJJLI = num;
        this.LLILLL = jSONObject;
    }

    @Override // X.AbstractC572830MdN
    public final void LIZIZ(Object obj, String str) throws JSONException {
        Integer num = (Integer) obj;
        if (num == null) {
            this.LLILLL.remove(str);
        } else {
            this.LLILLL.put(str, num.intValue());
        }
    }
}
