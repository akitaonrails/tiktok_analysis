package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.051r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12865051r {
    public static final JSONObject LIZ(String str) {
        if (str != null && (!a0.LJJJIL(str))) {
            return new JSONObject(str);
        }
        return new JSONObject();
    }

    public static final void LIZIZ(JSONObject jSONObject, String str, Object obj) {
        Object c098200Yq;
        try {
            c098200Yq = jSONObject.putOpt(str, obj);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C1AF0.LJ(thM5exceptionOrNullimpl);
        }
    }
}
