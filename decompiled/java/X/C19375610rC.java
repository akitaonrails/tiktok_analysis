package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.10rC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19375610rC implements Cloneable {
    public C19375910rF LL;
    public C19375910rF LLILLJJLI;
    public C19375910rF LLILLL;
    public C19375910rF LLILZ;

    /* JADX INFO: renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public final C19375610rC clone() {
        C19375610rC c19375610rC = (C19375610rC) super.clone();
        c19375610rC.LL = this.LL.clone();
        c19375610rC.LLILLJJLI = this.LLILLJJLI.clone();
        c19375610rC.LLILLL = this.LLILLL.clone();
        c19375610rC.LLILZ = this.LLILZ.clone();
        return c19375610rC;
    }

    public static C19375910rF LIZIZ(String str, JSONObject jSONObject) {
        C19375910rF c19375910rF = new C19375910rF();
        try {
            if (jSONObject.has(str)) {
                JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, str);
                if (jSONObject2.has("short") && jSONObject2.has("long")) {
                    JSONObjectProtectorUtils.getString(jSONObject2, "short");
                    JSONObjectProtectorUtils.getString(jSONObject2, "long");
                    return c19375910rF;
                }
                if (jSONObject2.has("short")) {
                    JSONObjectProtectorUtils.getString(jSONObject2, "short");
                    JSONObjectProtectorUtils.getString(jSONObject2, "short");
                    return c19375910rF;
                }
                if (jSONObject2.has("long")) {
                    JSONObjectProtectorUtils.getString(jSONObject2, "long");
                    JSONObjectProtectorUtils.getString(jSONObject2, "long");
                    return c19375910rF;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return c19375910rF;
    }
}
